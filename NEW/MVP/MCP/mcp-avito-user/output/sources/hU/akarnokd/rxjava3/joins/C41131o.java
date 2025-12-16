package hu.akarnokd.rxjava3.joins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: JoinPatterns.java */
/* renamed from: hu.akarnokd.rxjava3.joins.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41131o extends io.reactivex.rxjava3.core.z<Object> {

    /* compiled from: JoinPatterns.java */
    /* renamed from: hu.akarnokd.rxjava3.joins.o$b */
    public class b implements l41.g<AbstractC41117a> {
        @Override // l41.g
        public final void accept(AbstractC41117a abstractC41117a) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super Object> g12) {
        HashMap map = new HashMap();
        new ArrayList();
        new io.reactivex.rxjava3.observers.l(new a(g12, map)).b(io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b));
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.core.z.M(th2).c(g12);
        }
    }

    /* compiled from: JoinPatterns.java */
    /* renamed from: hu.akarnokd.rxjava3.joins.o$a */
    public class a implements io.reactivex.rxjava3.core.G<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.reactivex.rxjava3.core.G f397878b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ HashMap f397879c;

        public a(io.reactivex.rxjava3.core.G g12, HashMap map) {
            this.f397878b = g12;
            this.f397879c = map;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f397878b.e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            Iterator it = this.f397879c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC41130n) it.next()).dispose();
            }
            this.f397878b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            this.f397878b.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        }
    }
}
