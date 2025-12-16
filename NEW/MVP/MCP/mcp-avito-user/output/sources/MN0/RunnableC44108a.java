package mn0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: mn0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC44108a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f414725b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C44109b f414726c;

    public /* synthetic */ RunnableC44108a(C44109b c44109b, int i12) {
        this.f414725b = i12;
        this.f414726c = c44109b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C44109b c44109b = this.f414726c;
        switch (this.f414725b) {
            case 0:
                int i12 = C44109b.f414727v;
                c44109b.performHapticFeedback(0);
                break;
            default:
                C44109b.b(c44109b);
                break;
        }
    }
}
