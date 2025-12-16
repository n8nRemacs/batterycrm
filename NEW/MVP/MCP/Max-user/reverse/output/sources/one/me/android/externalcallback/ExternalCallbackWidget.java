package one.me.android.externalcallback;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.avd;
import defpackage.aw0;
import defpackage.b6g;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.imb;
import defpackage.ipi;
import defpackage.k18;
import defpackage.kti;
import defpackage.l38;
import defpackage.lzf;
import defpackage.oj7;
import defpackage.po5;
import defpackage.ps3;
import defpackage.q2b;
import defpackage.qo5;
import defpackage.ro5;
import defpackage.s3;
import defpackage.svi;
import defpackage.tqi;
import defpackage.vw4;
import defpackage.x9f;
import defpackage.yo3;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/android/externalcallback/ExternalCallbackWidget;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "uriAsParam", "(Ljava/lang/String;)V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ExternalCallbackWidget extends BottomSheetWidget {
    public static final /* synthetic */ int F0 = 0;
    public final k18 C0;
    public final Object D0;
    public final boolean E0;

    public ExternalCallbackWidget(Bundle bundle) {
        super(bundle);
        this.C0 = createViewModelLazy(qo5.class, new yo3(10, new ps3(28)));
        this.D0 = ipi.b(3, new ps3(29));
        this.E0 = true;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        float f = 70;
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), kti.d(vw4.d().getDisplayMetrics().density * f), frameLayout2.getPaddingRight(), kti.d(f * vw4.d().getDisplayMetrics().density));
        TextView textView = new TextView(frameLayout2.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        textView.setGravity(17);
        oj7 oj7Var = (oj7) this.D0.getValue();
        ArrayList arrayList = b6g.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, oj7Var, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(kti.d(12 * vw4.d().getDisplayMetrics().density));
        textView.setText(avd.A0);
        tqi.c(new s3(this, null, 12), textView);
        frameLayout2.addView(textView);
        return frameLayout2;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, one.me.sdk.arch.Widget
    /* renamed from: isDialog, reason: from getter */
    public final boolean getIsDialog() {
        return this.E0;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        qo5 qo5Var = (qo5) this.C0.getValue();
        String string = getArgs().getString("external_callback_param_arg");
        if (string == null) {
            string = "";
        }
        x9f x9fVar = qo5Var.X;
        if (x9fVar == null || !x9fVar.isActive()) {
            qo5Var.X = svi.e(qo5Var.a, ((q2b) ((lzf) qo5Var.c.getValue())).b(), null, new po5(qo5Var, string, null), 2);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        gw0.w(new g56(aw0.a(((qo5) this.C0.getValue()).o, getViewLifecycleOwner().p(), l38.d), new ro5(null, this), 1), getViewLifecycleScope());
    }

    public ExternalCallbackWidget(String str) {
        this(gwi.b(new imb("external_callback_param_arg", str)));
    }
}
