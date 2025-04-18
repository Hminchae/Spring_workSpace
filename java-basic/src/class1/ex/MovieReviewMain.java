package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview moviereview1 = new MovieReview();
        moviereview1.title = "승부";
        moviereview1.review = "존잼이었다";

        MovieReview moviereview2 = new MovieReview();
        moviereview2.title = "검은수녀들";
        moviereview2.review = "개노잼이었다.";

        MovieReview[] movieReviews = new MovieReview[]{moviereview1, moviereview2};

        // 영화 리뷰 정보 출력
        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println(movieReviews[i].title + "라는 영화에는" + movieReviews[i].review + "라는 리뷰가 있었다.");
        }

        for (MovieReview m : movieReviews) {
            System.out.println(m.title + "라는 영화에는" + m.review + "라는 리뷰가 있었다.");
        }
    }
}


