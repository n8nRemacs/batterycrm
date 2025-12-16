package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rd0 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vd0 Y;
    public final /* synthetic */ Uri Z;
    public int o;
    public final /* synthetic */ String s0;
    public final /* synthetic */ k t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd0(vd0 vd0Var, Uri uri, String str, k kVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vd0Var;
        this.Z = uri;
        this.s0 = str;
        this.t0 = kVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rd0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rd0 rd0Var = new rd0(this.Y, this.Z, this.s0, this.t0, continuation);
        rd0Var.X = obj;
        return rd0Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        Rect rect;
        g84 g84Var = g84.a;
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                vd0 vd0Var = this.Y;
                Uri uri = this.Z;
                String str = this.s0;
                k kVar = this.t0;
                this.o = 1;
                obj = vd0.t(vd0Var, uri, str, kVar, this);
                if (obj == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
            ipdVar = (Rect) obj;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        vd0 vd0Var2 = this.Y;
        if (!(ipdVar instanceof ipd) && (rect = (Rect) ipdVar) != null) {
            long j = vd0Var2.o;
            if (Float.intBitsToFloat((int) (vd0Var2.o >> 32)) != -1.0f && Float.intBitsToFloat((int) (vd0Var2.o & 4294967295L)) != -1.0f) {
                xfh.r(vd0Var2.d, new gd0(rect, j, vd0Var2.s0));
            }
        }
        vd0 vd0Var3 = this.Y;
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            yy7[] yy7VarArr = vd0.v0;
            wqi.p(vd0.class.getName(), "Error occurred during applying image transformation", thA);
            xfh.r(vd0Var3.d, fd0.b);
        }
        return qqg.a;
    }
}
