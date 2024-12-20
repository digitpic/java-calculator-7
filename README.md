# java-calculator-precourse
# ➕ 문자열 덧셈 계산기

## 🎯 기능 요구 사항
- 입력한 문자열에서 숫자를 추출해 값을 더하는 계산기를 구현한다.
    - 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우, 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.
        - 각 숫자의 합을 반환한다.
        - 쉼표를 구분자로 지정한다.
        - 콜론을 구분자로 지정한다.
    - 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 "//" 와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
        - 예시: //;\n1;2;3 라면 1+2+3=6 이 반환되어야 한다.
    - 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException 을 발생시킨 후 프로그램을 종료시킨다.

## 🎯 구현 기능 목록
- [x] "덧셈할 문자열을 입력해 주세요." 라는 문자열을 출력하는 기능
- [x] 사용자로부터 문자열을 입력받는 기능
    - `Console.readLine()` 을 사용한다.
- 구분자를 기준으로 숫자를 파싱하는 기능
    - [x] 쉼표를 구분자로 하는 기능
    - [x] 콜론을 구분자로 하는 기능
    - [x] 커스텀 구분자로 각 숫자를 파싱하는 기능
- [x] 모든 숫자의 합을 구하는 기능
- [x] ("결과 : " + sum) 형태로 숫자의 합을 출력하는 기능
- [x] 예외 발생 시 IllegalArgumentException 발생 후 프로그램 종료 시키는 기능
    - [x] 문자열 맨 앞, 맨 뒤에 공백을 포함 하여 입력한 경우
    - [x] 정수가 입력 되지 않은 경우
        - [x] 양수가 입력 되지 않은 경우
