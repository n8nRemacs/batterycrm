package one.me.android.join;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.aw0;
import defpackage.dpg;
import defpackage.em6;
import defpackage.f8j;
import defpackage.fr7;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.iv7;
import defpackage.iza;
import defpackage.j48;
import defpackage.jva;
import defpackage.jza;
import defpackage.k18;
import defpackage.kg6;
import defpackage.kti;
import defpackage.l38;
import defpackage.mvd;
import defpackage.r35;
import defpackage.t75;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u2d;
import defpackage.u45;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wu7;
import defpackage.x9;
import defpackage.xu7;
import defpackage.ye6;
import defpackage.yo3;
import defpackage.yy7;
import defpackage.z44;
import defpackage.z7;
import kotlin.Metadata;
import one.me.android.deeplink.LinkInterceptorActivity;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/android/join/JoinChatWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "link", "title", "", "isChannel", "(JLjava/lang/String;Ljava/lang/String;Z)V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JoinChatWidget extends BaseBottomSheetWidget {
    public static final /* synthetic */ yy7[] B0 = {new toc(JoinChatWidget.class, "id", "getId()J", 0), ho7.d(vid.a, JoinChatWidget.class, "link", "getLink()Ljava/lang/String;", 0), new toc(JoinChatWidget.class, "title", "getTitle()Ljava/lang/String;", 0), new toc(JoinChatWidget.class, "isChannel", "isChannel()Z", 0)};
    public static final String C0 = "join:id";
    public static final String D0 = "join:link";
    public static final String E0 = "join:title";
    public static final String F0 = "join:channel";
    public final boolean A0;
    public final hs w0;
    public final hs x0;
    public final hs y0;
    public final k18 z0;

    public JoinChatWidget(Bundle bundle) {
        super(bundle);
        this.w0 = new hs(String.class, D0);
        this.x0 = new hs(String.class, null, E0);
        this.y0 = new hs(Boolean.class, F0);
        k18 k18VarCreateViewModelLazy = createViewModelLazy(iv7.class, new yo3(22, new fr7(2, this)));
        this.z0 = k18VarCreateViewModelLazy;
        this.A0 = true;
        gw0.w(new g56(aw0.a(((iv7) k18VarCreateViewModelLazy.getValue()).o, this.lifecycleOwner.p(), l38.d), new xu7(this, null), 1), getLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void F0() {
        super.F0();
        Activity activityD = getRouter().d();
        LinkInterceptorActivity linkInterceptorActivity = activityD instanceof LinkInterceptorActivity ? (LinkInterceptorActivity) activityD : null;
        if (linkInterceptorActivity != null) {
            linkInterceptorActivity.finish();
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void K0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        String string;
        float f = 12;
        frameLayout.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(10 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(8 * vw4.d().getDisplayMetrics().density));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f2 = 16;
        textView.setPaddingRelative(textView.getPaddingStart(), kti.d(f2 * vw4.d().getDisplayMetrics().density), textView.getPaddingEnd(), kti.d(vw4.d().getDisplayMetrics().density * f2));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        yy7[] yy7VarArr = B0;
        int i = 3;
        yy7 yy7Var = yy7VarArr[3];
        hs hsVar = this.y0;
        boolean zBooleanValue = ((Boolean) hsVar.a(this)).booleanValue();
        hs hsVar2 = this.x0;
        if (zBooleanValue) {
            Context context = textView.getContext();
            int i2 = u2d.join_chat_title_channel;
            yy7 yy7Var2 = yy7VarArr[2];
            string = context.getString(i2, (String) hsVar2.a(this));
        } else {
            Context context2 = textView.getContext();
            int i3 = u2d.join_chat_title_chat;
            yy7 yy7Var3 = yy7VarArr[2];
            string = context2.getString(i3, (String) hsVar2.a(this));
        }
        textView.setText(string);
        dpg.c.b(textView, t75.b);
        tqi.c(new x9(i, null, 17), textView);
        linearLayout.addView(textView);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        jza jzaVar = jza.c;
        oneMeButton.setSize(jzaVar);
        iza izaVar = iza.d;
        oneMeButton.setMode(izaVar);
        gza gzaVar = gza.c;
        oneMeButton.setAppearance(gzaVar);
        yy7 yy7Var4 = yy7VarArr[3];
        oneMeButton.setText(z7.e(getContext(), ((Boolean) hsVar.a(this)).booleanValue() ? u2d.join_chat_confirm_channel_button : u2d.join_chat_confirm_chat_button));
        f8j.d(oneMeButton, 300L, new kg6(oneMeButton, 6, this));
        linearLayout.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton2.setSize(jzaVar);
        oneMeButton2.setMode(izaVar);
        oneMeButton2.setAppearance(gzaVar);
        oneMeButton2.setText(mvd.p);
        f8j.d(oneMeButton2, 300L, new ye6(10, this));
        linearLayout.addView(oneMeButton2);
        frameLayout.addView(linearLayout, -1, -2);
        View r35Var = new r35(frameLayout.getContext());
        r35Var.setTranslationY(u45.c(6, vw4.d().getDisplayMetrics().density, -r12));
        frameLayout.addView(r35Var);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, one.me.sdk.arch.Widget
    /* renamed from: isDialog, reason: from getter */
    public final boolean getE0() {
        return this.A0;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        jva onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            j48 viewLifecycleOwner = getViewLifecycleOwner();
            z44 z44Var = new z44(true, (em6) new wu7(0, this));
            if (viewLifecycleOwner != null) {
                onBackPressedDispatcher.a(viewLifecycleOwner, z44Var);
            } else {
                onBackPressedDispatcher.b(z44Var);
            }
        }
        getRouter().J();
    }

    public JoinChatWidget(long j, String str, String str2, boolean z) {
        this(gwi.b(new imb(C0, Long.valueOf(j)), new imb(D0, str), new imb(E0, str2), new imb(F0, Boolean.valueOf(z))));
    }
}
