package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;

/* loaded from: classes2.dex */
public final class m39 extends dtf implements sm6 {
    public final /* synthetic */ MediaPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m39(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.X = mediaPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        m39 m39Var = (m39) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        m39Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        m39 m39Var = new m39(continuation, this.X);
        m39Var.o = obj;
        return m39Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        float fIntValue;
        MediaPickerScreen mediaPickerScreen = this.X;
        hs hsVar = mediaPickerScreen.v0;
        g8j.b(obj);
        wae waeVar = (wae) this.o;
        if (waeVar instanceof vae) {
            yy7[] yy7VarArr = MediaPickerScreen.B0;
            mediaPickerScreen.A0().setDropdownRotationProgress(0.0f);
            yy7[] yy7VarArr2 = MediaPickerScreen.B0;
            yy7 yy7Var = yy7VarArr2[5];
            hsVar.b(mediaPickerScreen, 0);
            sn0 sn0Var = mediaPickerScreen.u0;
            yy7 yy7Var2 = yy7VarArr2[4];
            ((f82) sn0Var.getValue()).setVisibility(8);
            sn0 sn0Var2 = mediaPickerScreen.y0;
            yy7 yy7Var3 = yy7VarArr2[8];
            ((View) sn0Var2.getValue()).setVisibility(8);
        } else if (waeVar instanceof tae) {
            yy7[] yy7VarArr3 = MediaPickerScreen.B0;
            yy7 yy7Var4 = yy7VarArr3[5];
            if (((Number) hsVar.a(mediaPickerScreen)).intValue() > 0) {
                float f = ((tae) waeVar).a;
                yy7 yy7Var5 = yy7VarArr3[5];
                fIntValue = f / ((Number) hsVar.a(mediaPickerScreen)).intValue();
            } else {
                fIntValue = 180.0f;
            }
            mediaPickerScreen.A0().setDropdownRotationProgress(fIntValue);
        }
        return qqg.a;
    }
}
