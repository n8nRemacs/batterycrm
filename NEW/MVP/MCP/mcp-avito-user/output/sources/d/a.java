package D;

import androidx.concurrent.futures.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements b.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f2822c;

    public /* synthetic */ a(e eVar, int i12) {
        this.f2821b = i12;
        this.f2822c = eVar;
    }

    @Override // androidx.concurrent.futures.b.c
    public final Object d(final b.a aVar) {
        switch (this.f2821b) {
            case 0:
                final e eVar = this.f2822c;
                eVar.getClass();
                final int i12 = 0;
                eVar.f2833d.execute(new Runnable() { // from class: D.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                eVar.b(aVar);
                                break;
                            default:
                                eVar.b(aVar);
                                break;
                        }
                    }
                });
                return "addCaptureRequestOptions";
            default:
                final e eVar2 = this.f2822c;
                eVar2.getClass();
                final int i13 = 1;
                eVar2.f2833d.execute(new Runnable() { // from class: D.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                eVar2.b(aVar);
                                break;
                            default:
                                eVar2.b(aVar);
                                break;
                        }
                    }
                });
                return "clearCaptureRequestOptions";
        }
    }
}
