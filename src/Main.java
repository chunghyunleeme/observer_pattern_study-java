public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic();
        Observer a = new TopicSubscriber("a");
        Observer b = new TopicSubscriber("b");
        Observer c = new TopicSubscriber("c");
        topic.register(a);
        topic.register(b);
        topic.register(c);

        topic.postMessage("메세지 발행!");
    }
}