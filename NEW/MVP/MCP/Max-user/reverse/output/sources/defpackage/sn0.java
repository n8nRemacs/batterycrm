package defpackage;

import java.lang.ref.WeakReference;
import one.me.sdk.arch.Widget;
import one.me.sdk.arch.internal.BinderNotFoundValueException;

/* loaded from: classes2.dex */
public final class sn0 implements bbd, k18 {
    public final rn0 X;
    public final em6 a;
    public final sm6 b;
    public final em6 c;
    public Object d;
    public WeakReference o;

    public sn0(Widget widget, em6 em6Var, sm6 sm6Var, em6 em6Var2) {
        this.a = em6Var;
        this.b = sm6Var;
        this.c = em6Var2;
        this.X = new rn0(this, widget);
    }

    @Override // defpackage.bbd
    public final Object D(Object obj, yy7 yy7Var) {
        return getValue();
    }

    @Override // defpackage.k18
    public final boolean e() {
        return this.d != null;
    }

    @Override // defpackage.k18
    public final Object getValue() {
        Object obj = this.d;
        if (obj == null) {
            WeakReference weakReference = this.o;
            obj = weakReference != null ? weakReference.get() : null;
        }
        if (obj != null && ((Boolean) this.c.invoke(obj)).booleanValue()) {
            return obj;
        }
        try {
            Object objInvoke = this.a.invoke(obj);
            this.d = objInvoke;
            rn0 rn0Var = this.X;
            rn0Var.a = false;
            sm6 sm6Var = this.b;
            if (sm6Var != null) {
                sm6Var.invoke(objInvoke, rn0Var);
            }
            return objInvoke;
        } catch (BinderNotFoundValueException e) {
            throw e;
        } catch (Throwable th) {
            throw new BinderNotFoundValueException(1, th);
        }
    }

    public /* synthetic */ sn0(Widget widget, em6 em6Var, h2i h2iVar, int i) {
        this(widget, em6Var, (i & 4) != 0 ? null : h2iVar, new n8(17));
    }
}
