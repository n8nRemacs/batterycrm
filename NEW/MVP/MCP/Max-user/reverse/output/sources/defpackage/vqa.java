package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class vqa implements lta {
    public static vk3 e(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new vk3(4, new kn6(th));
    }

    public static vk3 i(Iterable iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return new vk3(6, iterable);
    }

    public static psa j(long j, long j2, TimeUnit timeUnit, j0e j0eVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(j0eVar, "scheduler is null");
        return new psa(Math.max(0L, j), Math.max(0L, j2), timeUnit, j0eVar);
    }

    public static qsa k(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new qsa(obj);
    }

    public static tta r(long j, TimeUnit timeUnit, j0e j0eVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(j0eVar, "scheduler is null");
        return new tta(Math.max(j, 0L), timeUnit, j0eVar);
    }

    @Override // defpackage.lta
    public final void a(vta vtaVar) {
        Objects.requireNonNull(vtaVar, "observer is null");
        try {
            o(vtaVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            raj.c(th);
            t8j.a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vqa d(tm6 tm6Var) {
        ifi.c(2, "bufferSize");
        if (!(this instanceof oyd)) {
            return new gra(this, tm6Var, 2, 1, 0);
        }
        Object obj = ((oyd) this).get();
        return obj == null ? yra.a : new vr8(obj, tm6Var, 2);
    }

    public final yqa g(m7c m7cVar) {
        Objects.requireNonNull(m7cVar, "predicate is null");
        return new yqa(this, m7cVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vqa h(tm6 tm6Var, int i) {
        int i2 = i66.a;
        ifi.c(i, "maxConcurrency");
        ifi.c(i2, "bufferSize");
        if (!(this instanceof oyd)) {
            return new gra(this, tm6Var, i, i2, 1);
        }
        Object obj = ((oyd) this).get();
        return obj == null ? yra.a : new vr8(obj, tm6Var, 2);
    }

    public final ssa l(j0e j0eVar) {
        int i = i66.a;
        Objects.requireNonNull(j0eVar, "scheduler is null");
        ifi.c(i, "bufferSize");
        return new ssa(this, j0eVar, i);
    }

    public final ota m(long j, m7c m7cVar) {
        if (j >= 0) {
            return new ota(this, j, m7cVar);
        }
        throw new IllegalArgumentException(vb9.e(j, "times >= 0 required but it was "));
    }

    public final v08 n(gu3 gu3Var) {
        v08 v08Var = new v08(gu3Var, pdf.f, pdf.d);
        a(v08Var);
        return v08Var;
    }

    public abstract void o(vta vtaVar);

    public final lra p(j0e j0eVar) {
        Objects.requireNonNull(j0eVar, "scheduler is null");
        return new lra(this, j0eVar);
    }

    public final mta q(long j) {
        if (j >= 0) {
            return new mta(this, j);
        }
        throw new IllegalArgumentException(vb9.e(j, "count >= 0 required but it was "));
    }

    public final zqa s() {
        ifi.c(16, "capacityHint");
        return new zqa(this);
    }
}
