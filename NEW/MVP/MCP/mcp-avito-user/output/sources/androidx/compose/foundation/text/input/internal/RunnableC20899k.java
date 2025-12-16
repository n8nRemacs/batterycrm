package androidx.compose.foundation.text.input.internal;

import java.util.function.IntConsumer;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.compose.foundation.text.input.internal.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC20899k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f31128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31129d;

    public /* synthetic */ RunnableC20899k(IntConsumer intConsumer, int i12, int i13) {
        this.f31127b = i13;
        this.f31128c = intConsumer;
        this.f31129d = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i12 = this.f31129d;
        IntConsumer intConsumer = this.f31128c;
        switch (this.f31127b) {
            case 0:
                C20901l c20901l = C20901l.f31164a;
                intConsumer.accept(i12);
                break;
            default:
                C20903m c20903m = C20903m.f31169a;
                intConsumer.accept(i12);
                break;
        }
    }
}
