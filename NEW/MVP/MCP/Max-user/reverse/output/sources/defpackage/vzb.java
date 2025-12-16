package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vzb extends dtf implements um6 {
    public /* synthetic */ n8b X;
    public /* synthetic */ yeb Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vzb(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        n8b n8bVar = (n8b) obj;
        yeb yebVar = (yeb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                vzb vzbVar = new vzb(3, continuation, 0);
                vzbVar.X = n8bVar;
                vzbVar.Y = yebVar;
                qqg qqgVar = qqg.a;
                vzbVar.n(qqgVar);
                return qqgVar;
            default:
                vzb vzbVar2 = new vzb(3, continuation, 1);
                vzbVar2.X = n8bVar;
                vzbVar2.Y = yebVar;
                qqg qqgVar2 = qqg.a;
                vzbVar2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                n8b n8bVar = this.X;
                yeb yebVar = this.Y;
                ColorDrawable colorDrawable = new ColorDrawable(yebVar.b().n);
                int i = yebVar.c().a.a.e;
                n8bVar.setBackground(new RippleDrawable(ColorStateList.valueOf(i), colorDrawable, new ColorDrawable(-65536)));
                break;
            default:
                g8j.b(obj);
                n8b n8bVar2 = this.X;
                int i2 = this.Y.c().a.a.e;
                n8bVar2.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), null, new ColorDrawable(-65536)));
                break;
        }
        return qqg.a;
    }
}
