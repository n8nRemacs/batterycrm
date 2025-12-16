package n41;

/* compiled from: CancellableQueueFuseable.java */
/* renamed from: n41.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44185b<T> extends AbstractC44184a<T> {

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f414901b;

    @Override // n41.AbstractC44184a, org.reactivestreams.e
    public final void cancel() {
        this.f414901b = true;
    }

    @Override // n41.AbstractC44184a, io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f414901b = true;
    }

    @Override // n41.AbstractC44184a, io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return this.f414901b;
    }
}
