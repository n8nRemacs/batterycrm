package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zh3 extends dtf implements um6 {
    public /* synthetic */ v0b X;
    public /* synthetic */ yeb Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh3(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        v0b v0bVar = (v0b) obj;
        yeb yebVar = (yeb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                zh3 zh3Var = new zh3(3, continuation, 0);
                zh3Var.X = v0bVar;
                zh3Var.Y = yebVar;
                qqg qqgVar = qqg.a;
                zh3Var.n(qqgVar);
                return qqgVar;
            default:
                zh3 zh3Var2 = new zh3(3, continuation, 1);
                zh3Var2.X = v0bVar;
                zh3Var2.Y = yebVar;
                qqg qqgVar2 = qqg.a;
                zh3Var2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                v0b v0bVar = this.X;
                int i = this.Y.b().l;
                v0bVar.setBackground(new RippleDrawable(ColorStateList.valueOf(i), null, new ColorDrawable(-65536)));
                break;
            default:
                g8j.b(obj);
                v0b v0bVar2 = this.X;
                int i2 = this.Y.b().l;
                v0bVar2.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), null, new ColorDrawable(-65536)));
                break;
        }
        return qqg.a;
    }
}
