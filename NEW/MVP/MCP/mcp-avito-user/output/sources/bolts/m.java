package bolts;

import java.util.concurrent.CancellationException;

/* compiled from: Task.java */
/* loaded from: classes10.dex */
final class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f57467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f57468c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f57469d;

    public m(y yVar, h hVar, x xVar) {
        this.f57467b = yVar;
        this.f57468c = hVar;
        this.f57469d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f57467b;
        try {
            yVar.c(this.f57468c.a(this.f57469d));
        } catch (CancellationException unused) {
            yVar.a();
        } catch (Exception e12) {
            yVar.b(e12);
        }
    }
}
