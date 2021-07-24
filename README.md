# CheckTheLottoNumber

# H03 -  로또 번호 당첨 확인하기
사용자에게 1부터 45사이의 임의의 숫자를 6개 입력받은 후에, 프로그램에서 만든 임의의 로또 번호와 대 조하여 몇 개의 숫자가 일치하는 지 출력하라. 단, 사용자가 입력한 6개의 번호 중에 중복되는 번호가 없도 록 입력받아야 하며, 프로그램에서 만든 임의의 로또 번호에서도 중복되는 번호가 없도록 해야 한다.

변수는 다음과 같이 사용하라.

int lotto_com[] = new int[6]; // 컴퓨터가 만들어 낸 로또 번호 리스트

int lotto_user[] = new int[6]; // 사용자가 입력한 로또 번호 리스트

int i; // 반복문을 위한 변수

int count; // 현재 만들어지고 있는 로또 번호의 순서(0, 1, 2, 3, 4, 5)

int match_count; // 일치하는 로또 번호의 갯수 (0~6)

실행 예시
```
Enter your 1th lotto number > 10
Enter your 2th lotto number > 10
Invalid input!
Enter your 2th lotto number > 22
Enter your 3th lotto number > 35
Enter your 4th lotto number > 77
Invalid input!
Enter your 4th lotto number > 41
Enter your 5th lotto number > 28
Enter your 6th lotto number > 0
Invalid input!
Enter your 6th lotto number > 6
Lotto numbers of this week are 5 45 28 15 24 40 
There are 1 matching lotto numbers
```