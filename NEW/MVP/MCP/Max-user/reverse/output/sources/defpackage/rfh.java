package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rfh extends dpd implements sm6 {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ View o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfh(View view, Continuation continuation) {
        super(2, continuation);
        this.o = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rfh) l((fee) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rfh rfhVar = new rfh(this.o, continuation);
        rfhVar.d = obj;
        return rfhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object obj2;
        int i = this.c;
        View view = this.o;
        Object obj3 = g84.a;
        if (i == 0) {
            g8j.b(obj);
            fee feeVar = (fee) this.d;
            this.d = feeVar;
            this.c = 1;
            feeVar.b(view, this);
            return obj3;
        }
        Object obj4 = qqg.a;
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj4;
        }
        fee feeVar2 = (fee) this.d;
        g8j.b(obj);
        if (view instanceof ViewGroup) {
            this.d = null;
            this.c = 2;
            feeVar2.getClass();
            mhg mhgVar = new mhg(new f2(9, (ViewGroup) view));
            if (mhgVar.hasNext()) {
                feeVar2.c = mhgVar;
                feeVar2.a = 2;
                feeVar2.d = this;
                obj2 = obj3;
            } else {
                obj2 = obj4;
            }
            if (obj2 != obj3) {
                obj2 = obj4;
            }
            if (obj2 == obj3) {
                return obj3;
            }
        }
        return obj4;
    }
}
