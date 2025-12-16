package Sy;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Sy.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class RunnableC15269a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f15206c;

    public /* synthetic */ RunnableC15269a(b bVar, int i12) {
        this.f15205b = i12;
        this.f15206c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f15206c;
        switch (this.f15205b) {
            case 0:
                b.m(bVar);
                break;
            default:
                int i12 = b.f15207p;
                bVar.performHapticFeedback(0);
                break;
        }
    }
}
