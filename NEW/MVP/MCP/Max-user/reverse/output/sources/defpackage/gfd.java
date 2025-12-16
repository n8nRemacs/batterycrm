package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class gfd extends dtf implements um6 {
    public /* synthetic */ FrameLayout X;
    public final /* synthetic */ RecordControlsWidget Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gfd(RecordControlsWidget recordControlsWidget, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Y = recordControlsWidget;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FrameLayout frameLayout = (FrameLayout) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                gfd gfdVar = new gfd(this.Y, continuation, 0);
                gfdVar.X = frameLayout;
                qqg qqgVar = qqg.a;
                gfdVar.n(qqgVar);
                return qqgVar;
            default:
                gfd gfdVar2 = new gfd(this.Y, continuation, 1);
                gfdVar2.X = frameLayout;
                qqg qqgVar2 = qqg.a;
                gfdVar2.n(qqgVar2);
                return qqgVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        RecordControlsWidget recordControlsWidget = this.Y;
        switch (i) {
            case 0:
                g8j.b(obj);
                FrameLayout frameLayout = this.X;
                yy7[] yy7VarArr = RecordControlsWidget.g1;
                ((GradientDrawable) recordControlsWidget.J0.getValue()).setColor(a93.s0.y(frameLayout).e().c);
                break;
            default:
                g8j.b(obj);
                FrameLayout frameLayout2 = this.X;
                yy7[] yy7VarArr2 = RecordControlsWidget.g1;
                ((GradientDrawable) recordControlsWidget.I0.getValue()).setColor(v4j.c(a93.s0.y(frameLayout2).e().c, 0.2f));
                break;
        }
        return qqgVar;
    }
}
