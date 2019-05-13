# Expected Behavior
`GET: /muh/2/?filter[first_name]=foo&filter[last_name]=muh`
  results in

  ```
  filter["first_name"] = foo
  filter["last_name"] = muh
  ```


`GET: /muh/2/?filter[first_name]=foo&filter[first_name]=muh`
    results in

  ```
  filter["first_name"].get(0) = foo
  filter["first_name"].get(1) = muh
  ```





