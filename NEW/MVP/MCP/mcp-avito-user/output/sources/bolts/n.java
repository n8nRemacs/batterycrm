package bolts;

import java.util.concurrent.CancellationException;

/* compiled from: Task.java */
/* loaded from: classes10.dex */
final class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f57470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f57471c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f57472d;

    /* compiled from: Task.java */
    public class a implements h<Object, Void> {
        public a() {
        }

        @Override // bolts.h
        public final Void a(x<Object> xVar) {
            n nVar = n.this;
            boolean zG2 = xVar.g();
            y yVar = nVar.f57470b;
            if (zG2) {
                yVar.a();
                return null;
            }
            if (xVar.h()) {
                yVar.b(xVar.e());
                return null;
            }
            yVar.c(xVar.f());
            return null;
        }
    }

    public n(y yVar, h hVar, x xVar) {
        this.f57470b = yVar;
        this.f57471c = hVar;
        this.f57472d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f57470b;
        try {
            x<Object> xVarA = ((l) this.f57471c).a(this.f57472d);
            if (xVarA == null) {
                yVar.c(null);
            } else {
                xVarA.b(new a());
            }
        } catch (CancellationException unused) {
            yVar.a();
        } catch (Exception e12) {
            yVar.b(e12);
        }
    }
}
