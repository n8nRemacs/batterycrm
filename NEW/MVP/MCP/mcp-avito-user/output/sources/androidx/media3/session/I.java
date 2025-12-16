package androidx.media3.session;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class I implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L f52069c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ J f52070d;

    public /* synthetic */ I(L l12, J j12, int i12) {
        this.f52068b = i12;
        this.f52069c = l12;
        this.f52070d = j12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T extends androidx.media3.session.J, androidx.media3.session.J, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r02 = this.f52070d;
        L l12 = this.f52069c;
        switch (this.f52068b) {
            case 0:
                l12.f52120j = r02;
                if (l12.f52121k) {
                    l12.n(r02);
                }
                l12.N(new I(l12, r02, 1), new K(l12, 0));
                break;
            default:
                int i12 = L.f52118l;
                if (l12.isCancelled()) {
                    r02.release();
                    break;
                }
                break;
        }
    }
}
