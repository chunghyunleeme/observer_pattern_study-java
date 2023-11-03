public class TopicSubscriber implements Observer{
    private String name;
    private Subject topic;

    public TopicSubscriber(String name) {
        this.name = name;
    }
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        System.out.println(name + ":: got message >> " + msg);
    }

    @Override
    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
