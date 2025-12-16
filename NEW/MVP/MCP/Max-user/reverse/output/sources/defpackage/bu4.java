package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScopeException;

/* loaded from: classes2.dex */
public final class bu4 implements ml {
    public final /* synthetic */ int a;
    public final kob b;
    public final xl c;
    public final Object d;
    public volatile boolean e;
    public final tn5 f;
    public final Object g;
    public final Object h;

    public bu4(kob kobVar, ys4 ys4Var, vm vmVar, xtd xtdVar, List list) {
        this.a = 1;
        this.b = kobVar;
        this.f = ys4Var;
        this.g = vmVar;
        this.c = xtdVar;
        this.d = list;
        this.h = new ReentrantLock();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ml
    public final Object a(yl ylVar) throws ApiInvocationException {
        switch (this.a) {
            case 0:
                z3e z3eVarF = ((rl) this.f).f();
                String str = z3eVarF.a.c;
                try {
                    if (this.e || str == null) {
                        synchronized (this.h) {
                            if (this.e || str == null) {
                                c(z3eVarF, str);
                            }
                        }
                    }
                    return gzi.b(this.b, ylVar, ((rl) this.f).f().a, this.d);
                } catch (ApiInvocationException e) {
                    if (ylVar.getScopeAfter() != om.a || !wqi.j(e)) {
                        throw e;
                    }
                    rl rlVar = (rl) this.f;
                    z3e z3eVarF2 = rlVar.f();
                    c(z3eVarF2, z3eVarF2.a.c);
                    return gzi.b(this.b, ylVar, rlVar.f().a, this.d);
                } catch (ApiScopeException unused) {
                    rl rlVar2 = (rl) this.f;
                    z3e z3eVarF3 = rlVar2.f();
                    c(z3eVarF3, z3eVarF3.a.c);
                    return gzi.b(this.b, ylVar, rlVar2.f().a, this.d);
                }
            default:
                z3e z3eVarF4 = ((ys4) this.f).f();
                String str2 = z3eVarF4.a.c;
                try {
                    ReentrantLock reentrantLock = (ReentrantLock) this.h;
                    reentrantLock.lock();
                    try {
                        if (this.e || str2 == null) {
                            b(z3eVarF4, str2);
                        }
                        reentrantLock.unlock();
                        return gzi.b(this.b, ylVar, ((ys4) this.f).f().a, this.d);
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (ApiInvocationException e2) {
                    if (ylVar.getScopeAfter() != om.a || !wqi.j(e2)) {
                        throw e2;
                    }
                    ys4 ys4Var = (ys4) this.f;
                    z3e z3eVarF5 = ys4Var.f();
                    b(z3eVarF5, z3eVarF5.a.c);
                    return gzi.b(this.b, ylVar, ys4Var.f().a, this.d);
                } catch (ApiScopeException unused2) {
                    ys4 ys4Var2 = (ys4) this.f;
                    z3e z3eVarF6 = ys4Var2.f();
                    b(z3eVarF6, z3eVarF6.a.c);
                    return gzi.b(this.b, ylVar, ys4Var2.f().a, this.d);
                }
        }
    }

    public void b(z3e z3eVar, String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.h;
        reentrantLock.lock();
        try {
            if (fni.a(str, ((ys4) this.f).f().a.c) || this.e) {
                um umVarH = ((vm) this.g).h();
                z3e z3eVarD = z3eVar.d(Uri.parse(umVarH.b));
                ((ys4) this.f).c(z3eVarD);
                d(z3eVarD, umVarH.a);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public void c(z3e z3eVar, String str) {
        synchronized (this.h) {
            try {
                if (Objects.equals(str, ((rl) this.f).f().a.c)) {
                    String strF = ((ubg) this.g).f();
                    xl xlVar = this.c;
                    ei8 ei8Var = (ei8) gzi.b(this.b, new zl(new b80(strF, xlVar != null ? ((lv4) ((k18) ((qs3) ((xtd) xlVar).b).X).getValue()).a() : null), ei8.g), z3eVar.a, this.d);
                    ((rl) this.f).d(z3eVar.c(ei8Var.b, ei8Var.c));
                    this.e = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public void d(z3e z3eVar, String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.h;
        reentrantLock.lock();
        try {
            xl xlVar = this.c;
            ei8 ei8Var = (ei8) gzi.b(this.b, new zl(new b80(str, xlVar != null ? ((lv4) ((k18) ((qs3) ((xtd) xlVar).b).X).getValue()).a() : null), ei8.g), z3eVar.a, this.d);
            ((ys4) this.f).c(z3eVar.c(ei8Var.b, ei8Var.c));
            this.e = false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public bu4(kob kobVar, rl rlVar, ubg ubgVar, xtd xtdVar, List list) {
        this.a = 0;
        this.h = new Object();
        this.e = false;
        this.b = kobVar;
        this.f = rlVar;
        this.g = ubgVar;
        this.c = xtdVar;
        this.d = list;
    }
}
