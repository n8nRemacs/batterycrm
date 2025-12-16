package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ega extends dtf implements sm6 {
    public final /* synthetic */ uxa X;
    public final /* synthetic */ Drawable Y;
    public final /* synthetic */ em6 Z;
    public /* synthetic */ Object o;
    public final /* synthetic */ em6 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ega(uxa uxaVar, Drawable drawable, em6 em6Var, em6 em6Var2, Continuation continuation) {
        super(2, continuation);
        this.X = uxaVar;
        this.Y = drawable;
        this.Z = em6Var;
        this.s0 = em6Var2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ega egaVar = (ega) l((ybe) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        egaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ega egaVar = new ega(this.X, this.Y, this.Z, this.s0, continuation);
        egaVar.o = obj;
        return egaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ybe ybeVar = (ybe) this.o;
        xbe xbeVar = ybeVar.a;
        i2c i2cVar = ybeVar.b;
        uxa uxaVar = this.X;
        if (xbeVar != null) {
            uxaVar.setAvatarUrl(xbeVar.a());
        } else {
            uxaVar.setCloseBadgeVisibility(false);
            if (fni.a(i2cVar, f2c.a)) {
                uxaVar.setAvatarUrl(null);
                uxa.o(uxaVar, this.Y, this.Z, this.s0, 6);
            } else if (i2cVar instanceof e2c) {
                e2c e2cVar = (e2c) i2cVar;
                uxa.n(uxaVar, null, new Long(e2cVar.b), e2cVar.a);
            } else if (i2cVar instanceof h2c) {
                uxaVar.setAvatarUrl(((h2c) i2cVar).a);
            } else {
                if (!(i2cVar instanceof g2c)) {
                    throw new NoWhenBranchMatchedException();
                }
                uxaVar.setAvatarUrl(((g2c) i2cVar).a);
            }
        }
        return qqg.a;
    }
}
