package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ztc extends dtf implements sm6 {
    public final /* synthetic */ buc X;
    public final /* synthetic */ byte[] Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztc(buc bucVar, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.X = bucVar;
        this.Y = bArr;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ztc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ztc(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objI;
        int i = this.o;
        buc bucVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            enb enbVar = bucVar.b;
            this.o = 1;
            enbVar.getClass();
            objI = svi.i(bia.a.plus((z74) enbVar.c), new txd(enbVar, this.Y, null), this);
            g84 g84Var = g84.a;
            if (objI == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            objI = obj;
        }
        Uri uri = (Uri) objI;
        qqg qqgVar = qqg.a;
        if (uri == null) {
            return qqgVar;
        }
        pd8 pd8Var = new pd8(1, uri.hashCode(), uri.toString(), uri.toString(), 0, 0L, "image/jpeg", 0L, null);
        xfh.r(bucVar.w0, new otc(pd8Var, bucVar.d.f.r(pd8Var)));
        bucVar.t0.m(null, jtc.a);
        return qqgVar;
    }
}
