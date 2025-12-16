package defpackage;

import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bc5 extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ int Z;
    public Bitmap o;
    public final /* synthetic */ cc5 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc5(int i, cc5 cc5Var, Continuation continuation) {
        super(2, continuation);
        this.Z = i;
        this.s0 = cc5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bc5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bc5 bc5Var = new bc5(this.Z, this.s0, continuation);
        bc5Var.Y = obj;
        return bc5Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        Bitmap bitmap;
        lg8 lg8Var = lg8.d;
        g84 g84Var = g84.a;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.Y;
            String name = f84Var.getClass().getName();
            int i2 = this.Z;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ho7.f(i2, "start extracting sprite by index: "), null);
            }
            Bitmap bitmapA = gaj.a(this.s0.b, this.Z);
            cc5 cc5Var = this.s0;
            Bitmap[] bitmapArr = cc5Var.a.a;
            int i3 = this.Z;
            bitmapArr[i3] = bitmapA;
            jve jveVar = cc5Var.d;
            Integer num = new Integer(i3);
            this.Y = f84Var;
            this.o = bitmapA;
            this.X = 1;
            if (jveVar.a(num, this) == g84Var) {
                return g84Var;
            }
            bitmap = bitmapA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap = this.o;
            f84Var = (f84) this.Y;
            g8j.b(obj);
        }
        String name2 = f84Var.getClass().getName();
        int i4 = this.Z;
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, name2, "finish extracting sprite by index: " + i4 + " , sprite exist: " + (bitmap != null), null);
        }
        return qqg.a;
    }
}
