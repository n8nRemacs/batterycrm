package F21;

import Y61.k;
import com.yandex.div.json.expressions.e;
import com.yandex.div2.AbstractC38330g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DivVisitor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LF21/a;", "T", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a<T> {
    public abstract T a(@k AbstractC38330g abstractC38330g, @k e eVar);

    public T b(@k AbstractC38330g.c cVar, @k e eVar) {
        return a(cVar, eVar);
    }

    public T c(@k AbstractC38330g.d dVar, @k e eVar) {
        return a(dVar, eVar);
    }

    public T d(@k AbstractC38330g.e eVar, @k e eVar2) {
        return a(eVar, eVar2);
    }

    public T e(@k AbstractC38330g.f fVar, @k e eVar) {
        return a(fVar, eVar);
    }

    public T f(@k AbstractC38330g.C10942g c10942g, @k e eVar) {
        return a(c10942g, eVar);
    }

    public T g(@k AbstractC38330g.h hVar, @k e eVar) {
        return a(hVar, eVar);
    }

    public T h(@k AbstractC38330g.k kVar, @k e eVar) {
        return a(kVar, eVar);
    }

    public T i(@k AbstractC38330g.m mVar, @k e eVar) {
        return a(mVar, eVar);
    }

    public T j(@k AbstractC38330g.o oVar, @k e eVar) {
        return a(oVar, eVar);
    }

    public T k(@k AbstractC38330g.p pVar, @k e eVar) {
        return a(pVar, eVar);
    }

    public T l(@k AbstractC38330g.q qVar, @k e eVar) {
        return a(qVar, eVar);
    }

    public final T m(@k AbstractC38330g abstractC38330g, @k e eVar) {
        if (abstractC38330g instanceof AbstractC38330g.q) {
            return l((AbstractC38330g.q) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.h) {
            return g((AbstractC38330g.h) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.f) {
            return e((AbstractC38330g.f) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.m) {
            return i((AbstractC38330g.m) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.c) {
            return b((AbstractC38330g.c) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.C10942g) {
            return f((AbstractC38330g.C10942g) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.e) {
            return d((AbstractC38330g.e) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.k) {
            return h((AbstractC38330g.k) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.p) {
            return k((AbstractC38330g.p) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.o) {
            return j((AbstractC38330g.o) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.d) {
            return c((AbstractC38330g.d) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.i) {
            return a((AbstractC38330g.i) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.n) {
            return a((AbstractC38330g.n) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.j) {
            return a((AbstractC38330g.j) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.l) {
            return a((AbstractC38330g.l) abstractC38330g, eVar);
        }
        if (abstractC38330g instanceof AbstractC38330g.r) {
            return a((AbstractC38330g.r) abstractC38330g, eVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
