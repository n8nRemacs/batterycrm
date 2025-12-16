package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Path;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class rfd extends dtf implements sm6 {
    public final /* synthetic */ rkh X;
    public final /* synthetic */ RecordControlsWidget Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfd(Continuation continuation, rkh rkhVar, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.X = rkhVar;
        this.Y = recordControlsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rfd rfdVar = (rfd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rfdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rfd rfdVar = new rfd(continuation, this.X, this.Y);
        rfdVar.o = obj;
        return rfdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        q60 q60Var = (q60) this.o;
        boolean z = q60Var instanceof p60;
        rkh rkhVar = this.X;
        if (z) {
            y60 waveView = rkhVar.getWaveView();
            ArrayList arrayList = ((p60) q60Var).a;
            yy7[] yy7VarArr = RecordControlsWidget.g1;
            long jLongValue = ((Number) this.Y.S0().y0.a.getValue()).longValue();
            waveView.s0 = arrayList;
            waveView.C0 = jLongValue;
            waveView.o = 0L;
            waveView.t0 = false;
            waveView.v0.setColor(v4j.c(a93.s0.y(waveView).getIcon().k, 0.5f));
            ValueAnimator valueAnimator = waveView.A0;
            valueAnimator.cancel();
            Path path = waveView.z0;
            if (!path.isEmpty()) {
                path.reset();
            }
            waveView.a();
            valueAnimator.start();
        } else if (q60Var instanceof o60) {
            rkhVar.getWaveView().setPauseRecordingData(((o60) q60Var).a);
        } else {
            if (q60Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            y60 waveView2 = rkhVar.getWaveView();
            waveView2.z0.reset();
            waveView2.u0 = false;
            waveView2.C0 = 0L;
            waveView2.o = 0L;
            waveView2.invalidate();
        }
        return qqg.a;
    }
}
