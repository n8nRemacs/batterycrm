package bolts;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* compiled from: Task.java */
/* loaded from: classes10.dex */
final class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f57474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Callable f57475c;

    public r(y yVar, Callable callable) {
        this.f57474b = yVar;
        this.f57475c = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f57474b;
        try {
            yVar.c(this.f57475c.call());
        } catch (CancellationException unused) {
            yVar.a();
        } catch (Exception e12) {
            yVar.b(e12);
        }
    }
}
