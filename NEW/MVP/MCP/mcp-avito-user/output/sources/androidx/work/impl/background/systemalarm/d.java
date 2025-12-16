package androidx.work.impl.background.systemalarm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f55618c;

    public /* synthetic */ d(e eVar, int i12) {
        this.f55617b = i12;
        this.f55618c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f55617b) {
            case 0:
                e.b(this.f55618c);
                break;
            default:
                e.c(this.f55618c);
                break;
        }
    }
}
