package j$.util.concurrent;

/* loaded from: classes2.dex */
public interface Flow$Subscriber<T> {
    void onComplete();

    void onError(Throwable th2);

    void onNext(T t12);

    void onSubscribe(Flow$Subscription flow$Subscription);
}
