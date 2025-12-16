package one.me.devmenu.utils;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a93;
import defpackage.az1;
import defpackage.bbd;
import defpackage.dpg;
import defpackage.f8j;
import defpackage.gza;
import defpackage.ho7;
import defpackage.hs;
import defpackage.iza;
import defpackage.jza;
import defpackage.kti;
import defpackage.kvf;
import defpackage.oyc;
import defpackage.p3;
import defpackage.q9;
import defpackage.t75;
import defpackage.toc;
import defpackage.v1a;
import defpackage.veb;
import defpackage.vid;
import defpackage.vw4;
import defpackage.w3b;
import defpackage.w9b;
import defpackage.wfe;
import defpackage.xs0;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lone/me/devmenu/utils/ValueBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "myg", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public class ValueBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] H0 = {new toc(ValueBottomSheet.class, "buttonId", "getButtonId()J", 0), ho7.d(vid.a, ValueBottomSheet.class, "descriptions", "getDescriptions()[Ljava/lang/String;", 0), new toc(ValueBottomSheet.class, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new toc(ValueBottomSheet.class, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final String C0;
    public final hs D0;
    public final hs E0;
    public final bbd F0;
    public final bbd G0;

    public ValueBottomSheet(Bundle bundle) {
        super(bundle);
        this.C0 = "";
        this.D0 = new hs(Long.class, "arg:button_id");
        this.E0 = new hs(String[].class, "arg:descriptions");
        this.F0 = viewBinding(oyc.long_bottom_sheet_input);
        this.G0 = viewBinding(oyc.long_bottom_sheet_button);
        xs0 xs0Var = new xs0(this, new kvf(13, this));
        if (getRouter() != null) {
            getRouter().a(xs0Var);
        } else {
            addLifecycleListener(new q9(this, 16, xs0Var));
        }
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Значение рубильника");
        dpg.c.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.y(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        float f2 = 16;
        layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        veb vebVar = new veb(linearLayout.getContext());
        vebVar.setId(oyc.long_bottom_sheet_input);
        vebVar.setText(getC0());
        vebVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        vebVar.setBackgroundColorAttr(Integer.valueOf(w9b.M));
        vebVar.setHint("Введите кастомное значение");
        if (P0()) {
            vebVar.setInputType(2);
        }
        p3 p3Var = new p3(10, this);
        w3b w3bVar = vebVar.a;
        w3bVar.addTextChangedListener(p3Var);
        w3bVar.addTextChangedListener(p3Var);
        linearLayout.addView(vebVar);
        yy7 yy7Var = H0[1];
        for (String str : (String[]) this.E0.a(this)) {
            TextView textView2 = new TextView(linearLayout.getContext());
            textView2.setText(str);
            textView2.setTextColor(az1.f(dpg.i, textView2, v1aVar, textView2).e);
            textView2.setGravity(8388611);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            float f3 = 8;
            layoutParams2.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f3 * vw4.d().getDisplayMetrics().density));
            textView2.setLayoutParams(layoutParams2);
            linearLayout.addView(textView2);
        }
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(oyc.long_bottom_sheet_button);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams3);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setText("Установить");
        f8j.d(oneMeButton, 300L, new wfe(this, 20, oneMeButton));
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }

    /* renamed from: O0, reason: from getter */
    public String getC0() {
        return this.C0;
    }

    public boolean P0() {
        return false;
    }
}
