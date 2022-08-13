public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = String.valueOf(true);

        Post.birthday = new FormDate();
        post.birthday.day = String.valueOf(13);
        post.birthday.month = String.valueOf(6);
        post.birthday.year = String.valueOf(1999);

    }

}