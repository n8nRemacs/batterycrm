package defpackage;

import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zrb extends dtf implements um6 {
    public /* synthetic */ AppCompatImageView X;
    public /* synthetic */ yeb Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zrb(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
        yeb yebVar = (yeb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                zrb zrbVar = new zrb(3, continuation, 0);
                zrbVar.X = appCompatImageView;
                zrbVar.Y = yebVar;
                qqg qqgVar = qqg.a;
                zrbVar.n(qqgVar);
                return qqgVar;
            default:
                zrb zrbVar2 = new zrb(3, continuation, 1);
                zrbVar2.X = appCompatImageView;
                zrbVar2.Y = yebVar;
                qqg qqgVar2 = qqg.a;
                zrbVar2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                this.X.setColorFilter(this.Y.b().a.n);
                break;
            default:
                g8j.b(obj);
                this.X.setImageTintList(ColorStateList.valueOf(this.Y.getIcon().j));
                break;
        }
        return qqg.a;
    }
}
