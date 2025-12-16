package one.me.devmenu.tools.server;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a93;
import defpackage.bbd;
import defpackage.dpg;
import defpackage.efd;
import defpackage.f8j;
import defpackage.gza;
import defpackage.ho7;
import defpackage.iza;
import defpackage.jza;
import defpackage.k18;
import defpackage.kt3;
import defpackage.kti;
import defpackage.myc;
import defpackage.p3;
import defpackage.pb3;
import defpackage.pe8;
import defpackage.t75;
import defpackage.toc;
import defpackage.u6c;
import defpackage.vdc;
import defpackage.veb;
import defpackage.vid;
import defpackage.vw4;
import defpackage.w3b;
import defpackage.w9b;
import defpackage.wfe;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/devmenu/tools/server/ServerPortBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ServerPortBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] F0 = {new toc(ServerPortBottomSheet.class, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), ho7.d(vid.a, ServerPortBottomSheet.class, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final k18 C0;
    public final bbd D0;
    public final bbd E0;

    public ServerPortBottomSheet() {
        super(null, 1, null);
        this.C0 = createViewModelLazy(u6c.class, new vdc(13, new efd(13)));
        this.D0 = viewBinding(myc.server_port_input);
        this.E0 = viewBinding(myc.server_port_custom_btn);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Порт сервера");
        dpg.c.b(textView, t75.b);
        textView.setTextColor(a93.s0.y(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        float f2 = 16;
        layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        veb vebVar = new veb(linearLayout.getContext());
        vebVar.setId(myc.server_port_input);
        String strJ = ((pe8) ((pb3) ((u6c) this.C0.getValue()).b.getValue())).J();
        if (strJ == null) {
            strJ = "";
        }
        vebVar.setText(strJ);
        vebVar.setLayoutParams(new kt3(-1, -2));
        vebVar.setBackgroundColorAttr(Integer.valueOf(w9b.M));
        vebVar.setHint("Введите кастомный порт");
        vebVar.setInputType(2);
        p3 p3Var = new p3(9, this);
        w3b w3bVar = vebVar.a;
        w3bVar.addTextChangedListener(p3Var);
        w3bVar.addTextChangedListener(p3Var);
        linearLayout.addView(vebVar);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(myc.server_port_custom_btn);
        kt3 kt3Var = new kt3(-1, -2);
        ((ViewGroup.MarginLayoutParams) kt3Var).topMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(kt3Var);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setText("Установить");
        f8j.d(oneMeButton, 300L, new wfe(this, 0, oneMeButton));
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }
}
