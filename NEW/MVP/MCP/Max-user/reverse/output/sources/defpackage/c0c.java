package defpackage;

import android.graphics.Point;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes2.dex */
public final class c0c extends dtf implements sm6 {
    public final /* synthetic */ PinBarsWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0c(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.X = pinBarsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        c0c c0cVar = (c0c) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        c0cVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        c0c c0cVar = new c0c(continuation, this.X);
        c0cVar.o = obj;
        return c0cVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ncg ncgVar;
        g8j.b(obj);
        h40 h40Var = (h40) this.o;
        boolean zA = fni.a(h40Var, f40.a);
        PinBarsWidget pinBarsWidget = this.X;
        if (zA) {
            int i = PinBarsWidget.u0;
            ncg ncgVar2 = pinBarsWidget.a;
            if (ncgVar2 != null) {
                ncgVar2.dismiss();
            }
            pinBarsWidget.a = null;
        } else {
            if (!(h40Var instanceof g40)) {
                throw new NoWhenBranchMatchedException();
            }
            n5g n5gVar = ((g40) h40Var).a;
            s0a s0aVar = pinBarsWidget.o;
            if (s0aVar != null) {
                int i2 = 1;
                if (!s0aVar.isLaidOut() || s0aVar.isLayoutRequested()) {
                    s0aVar.addOnLayoutChangeListener(new jf1(s0aVar, pinBarsWidget, n5gVar, i2));
                } else {
                    int[] iArr = new int[2];
                    View tooltipAnchor = s0aVar.getTooltipAnchor();
                    tooltipAnchor.getLocationOnScreen(iArr);
                    Point point = new Point(u45.q(18, vw4.d().getDisplayMetrics().density, (f6j.b(pinBarsWidget.getContext()) - iArr[0]) - (tooltipAnchor.getWidth() / 2)), tooltipAnchor.getHeight() + iArr[1]);
                    ncg ncgVar3 = pinBarsWidget.a;
                    if (ncgVar3 != null && ncgVar3.isShowing() && (ncgVar = pinBarsWidget.a) != null) {
                        ncgVar.dismiss();
                    }
                    ncg ncgVar4 = new ncg(pinBarsWidget.getContext(), tooltipAnchor, new iv8(26, pinBarsWidget), (g31) null, 1, 3, 8);
                    ncgVar4.c(n5gVar);
                    ncgVar4.d(point, 8388661, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                    ncgVar4.setOnDismissListener(new fg9(1, pinBarsWidget));
                    pinBarsWidget.a = ncgVar4;
                }
            }
        }
        return qqg.a;
    }
}
