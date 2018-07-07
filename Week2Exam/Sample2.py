def bfs(graph, start):
    visited, queue = set(), [start]
    while queue:
        vertex = queue.pop(0)
        if vertex not in visited:
            visited.add(vertex)
            queue.extend(graph[vertex] - visited)
    return visited
graph = {'0': set(['1']),
         '1': set(['0', '2', '4']),
         '2': set(['1','3','4']),
         '3': set(['2']),
         '4': set(['1','2']),
         '5': set(['0'])}
con = len(graph)
print con==len(bfs(graph, '0'))