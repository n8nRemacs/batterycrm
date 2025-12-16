package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class iwd extends q44 implements z26 {
    public final int X;
    public x74 Y;
    public Continuation Z;
    public final z26 d;
    public final x74 o;

    public iwd(z26 z26Var, x74 x74Var) {
        super(bd5.a, yk3.c);
        this.d = z26Var;
        this.o = x74Var;
        this.X = ((Number) x74Var.fold(0, new hwd(0))).intValue();
    }

    @Override // defpackage.z26
    public final Object a(Object obj, Continuation continuation) {
        try {
            Object objP = p(continuation, obj);
            return objP == g84.a ? objP : qqg.a;
        } catch (Throwable th) {
            this.Y = new w25(continuation.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.ij0, defpackage.h84
    public final h84 getCallerFrame() {
        Continuation continuation = this.Z;
        if (continuation instanceof h84) {
            return (h84) continuation;
        }
        return null;
    }

    @Override // defpackage.q44, kotlin.coroutines.Continuation
    public final x74 getContext() {
        x74 x74Var = this.Y;
        return x74Var == null ? bd5.a : x74Var;
    }

    @Override // defpackage.ij0, defpackage.h84
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Throwable thA = kpd.a(obj);
        if (thA != null) {
            this.Y = new w25(getContext(), thA);
        }
        Continuation continuation = this.Z;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return g84.a;
    }

    public final Object p(Continuation continuation, Object obj) {
        x74 context = continuation.getContext();
        eoi.d(context);
        x74 x74Var = this.Y;
        if (x74Var != context) {
            if (x74Var instanceof w25) {
                throw new IllegalStateException(wmf.d("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((w25) x74Var).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new qk(17, this))).intValue() != this.X) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.o + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.Y = context;
        }
        this.Z = continuation;
        Object objInvoke = kwd.a.invoke(this.d, obj, this);
        if (!fni.a(objInvoke, g84.a)) {
            this.Z = null;
        }
        return objInvoke;
    }
}
