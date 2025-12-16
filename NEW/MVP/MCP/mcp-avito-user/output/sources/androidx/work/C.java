package androidx.work;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class C implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f55359c;

    public /* synthetic */ C(AtomicBoolean atomicBoolean, int i12) {
        this.f55358b = i12;
        this.f55359c = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f55358b) {
            case 0:
                this.f55359c.set(true);
                break;
            default:
                this.f55359c.set(true);
                break;
        }
    }
}
