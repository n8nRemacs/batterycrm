package defpackage;

import android.graphics.Point;
import android.view.View;
import android.widget.TextView;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes.dex */
public final class jf1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Widget c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jf1(View view, Widget widget, Object obj, int i) {
        this.a = i;
        this.b = view;
        this.c = widget;
        this.d = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ncg ncgVar;
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                TextView textView = (TextView) this.b;
                textView.setText(CallLinkInfoScreen.y0((CallLinkInfoScreen) this.c, ((cf1) this.d).d.getText().b(textView.getContext()), textView, textView.getRootView().getWidth()));
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                int[] iArr = new int[2];
                View tooltipAnchor = ((s0a) this.b).getTooltipAnchor();
                tooltipAnchor.getLocationOnScreen(iArr);
                PinBarsWidget pinBarsWidget = (PinBarsWidget) this.c;
                Point point = new Point(u45.q(18, vw4.d().getDisplayMetrics().density, (f6j.b(pinBarsWidget.getContext()) - iArr[0]) - (tooltipAnchor.getWidth() / 2)), tooltipAnchor.getHeight() + iArr[1]);
                ncg ncgVar2 = pinBarsWidget.a;
                if (ncgVar2 != null && ncgVar2.isShowing() && (ncgVar = pinBarsWidget.a) != null) {
                    ncgVar.dismiss();
                }
                ncg ncgVar3 = new ncg(pinBarsWidget.getContext(), tooltipAnchor, new iv8(26, pinBarsWidget), (g31) null, 1, 3, 8);
                ncgVar3.c((n5g) this.d);
                ncgVar3.d(point, 8388661, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                ncgVar3.setOnDismissListener(new fg9(1, pinBarsWidget));
                pinBarsWidget.a = ncgVar3;
                break;
        }
    }
}
