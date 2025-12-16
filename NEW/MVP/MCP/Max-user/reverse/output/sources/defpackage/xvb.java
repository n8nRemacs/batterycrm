package defpackage;

import android.content.Intent;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;
import one.me.location.map.pick.PickLocationScreen;

/* loaded from: classes2.dex */
public final class xvb extends dtf implements sm6 {
    public final /* synthetic */ PickLocationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvb(Continuation continuation, PickLocationScreen pickLocationScreen) {
        super(2, continuation);
        this.X = pickLocationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xvb xvbVar = (xvb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xvbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xvb xvbVar = new xvb(continuation, this.X);
        xvbVar.o = obj;
        return xvbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objPrevious;
        CameraPosition cameraPositionD;
        PickLocationScreen pickLocationScreen = this.X;
        hs hsVar = pickLocationScreen.b;
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof tvb) {
            iw6 iw6Var = pickLocationScreen.s0;
            float f = (iw6Var == null || (cameraPositionD = iw6Var.d()) == null) ? 14.0f : cameraPositionD.b;
            tvb tvbVar = (tvb) cdaVar;
            cf8 cf8Var = new cf8(tvbVar.b, tvbVar.c);
            ArrayList arrayListE = pickLocationScreen.getRouter().e();
            ListIterator listIterator = arrayListE.listIterator(arrayListE.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (((bud) objPrevious).a instanceof dj6) {
                    break;
                }
            }
            bud budVar = (bud) objPrevious;
            Object obj2 = budVar != null ? budVar.a : null;
            dj6 dj6Var = obj2 instanceof dj6 ? (dj6) obj2 : null;
            if (dj6Var != null) {
                yy7[] yy7VarArr = PickLocationScreen.v0;
                yy7 yy7Var = yy7VarArr[1];
                if (((Number) hsVar.a(pickLocationScreen)).intValue() != 0) {
                    Intent intent = new Intent();
                    intent.putExtra("LocationMapScreen.result.locationData", cf8Var);
                    intent.putExtra("LocationMapScreen.result.zoom", f);
                    intent.putExtra("LocationMapScreen.result.livePeriod", 0L);
                    yy7 yy7Var2 = yy7VarArr[1];
                    dj6Var.X(((Number) hsVar.a(pickLocationScreen)).intValue(), -1, intent);
                    jva onBackPressedDispatcher = pickLocationScreen.getOnBackPressedDispatcher();
                    if (onBackPressedDispatcher != null) {
                        onBackPressedDispatcher.d();
                    }
                }
            }
        }
        return qqg.a;
    }
}
