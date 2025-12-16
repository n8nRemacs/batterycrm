package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class e2f implements m3f {
    public static wk3 f(RuntimeException runtimeException) {
        return new wk3(4, new kn6(runtimeException));
    }

    public static wk3 g(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new wk3(6, obj);
    }

    public final Object e() {
        rq0 rq0Var = new rq0(1);
        k(rq0Var);
        return rq0Var.d();
    }

    public final m2f h(tm6 tm6Var) {
        Objects.requireNonNull(tm6Var, "mapper is null");
        return new m2f(this, tm6Var, 1);
    }

    public final u2f i(j0e j0eVar) {
        Objects.requireNonNull(j0eVar, "scheduler is null");
        return new u2f(this, j0eVar, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m76 j(b1g b1gVar) {
        return new m76(new g76(this instanceof nn6 ? ((nn6) this).d() : new r66(4, this), b1gVar, 1));
    }

    public final void k(v2f v2fVar) {
        Objects.requireNonNull(v2fVar, "observer is null");
        try {
            l(v2fVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            raj.c(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void l(v2f v2fVar);

    public final u2f m(j0e j0eVar) {
        Objects.requireNonNull(j0eVar, "scheduler is null");
        return new u2f(this, j0eVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vqa n() {
        return this instanceof on6 ? ((on6) this).b() : new vk3(8, this);
    }
}
