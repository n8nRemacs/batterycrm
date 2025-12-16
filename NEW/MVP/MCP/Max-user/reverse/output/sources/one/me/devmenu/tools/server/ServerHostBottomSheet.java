package one.me.devmenu.tools.server;

import android.annotation.SuppressLint;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a93;
import defpackage.aw0;
import defpackage.b0i;
import defpackage.bbd;
import defpackage.dpg;
import defpackage.e9b;
import defpackage.efd;
import defpackage.f8j;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gza;
import defpackage.h9b;
import defpackage.ho7;
import defpackage.iza;
import defpackage.jza;
import defpackage.k18;
import defpackage.kt3;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.m9b;
import defpackage.mfe;
import defpackage.myc;
import defpackage.nfe;
import defpackage.ofe;
import defpackage.p3;
import defpackage.pcc;
import defpackage.r77;
import defpackage.su4;
import defpackage.t75;
import defpackage.tcf;
import defpackage.toc;
import defpackage.vdc;
import defpackage.veb;
import defpackage.vid;
import defpackage.vw4;
import defpackage.w3b;
import defpackage.w9b;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/devmenu/tools/server/ServerHostBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ServerHostBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] K0 = {new toc(ServerHostBottomSheet.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), ho7.d(vid.a, ServerHostBottomSheet.class, "loaderView", "getLoaderView()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar;", 0), new toc(ServerHostBottomSheet.class, "customContainer", "getCustomContainer()Landroid/widget/LinearLayout;", 0), new toc(ServerHostBottomSheet.class, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new toc(ServerHostBottomSheet.class, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final k18 C0;
    public final AutoTransition D0;
    public final b0i E0;
    public final bbd F0;
    public final bbd G0;
    public final bbd H0;
    public final bbd I0;
    public final bbd J0;

    public ServerHostBottomSheet() {
        super(null, 1, null);
        k18 k18VarCreateViewModelLazy = createViewModelLazy(r77.class, new vdc(12, new efd(12)));
        this.C0 = k18VarCreateViewModelLazy;
        this.D0 = new AutoTransition();
        this.E0 = new b0i(new mfe((r77) k18VarCreateViewModelLazy.getValue()), ((g4b) su4.a.getAccessor().c(56)).a(), 6);
        this.F0 = viewBinding(myc.server_host_recycler);
        this.G0 = viewBinding(myc.server_host_loader);
        this.H0 = viewBinding(myc.server_host_container);
        this.I0 = viewBinding(myc.server_host_input);
        this.J0 = viewBinding(myc.server_host_custom_btn);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Адрес сервера");
        dpg.c.b(textView, t75.b);
        textView.setTextColor(a93.s0.y(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        float f2 = 16;
        layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(myc.server_host_recycler);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setAdapter(this.E0);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        linearLayout.addView(recyclerView);
        m9b m9bVar = new m9b(linearLayout.getContext());
        m9bVar.setId(myc.server_host_loader);
        linearLayout.setGravity(17);
        m9bVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        m9bVar.setAppearance(e9b.a);
        m9bVar.setSize(h9b.a);
        m9bVar.setVisibility(8);
        linearLayout.addView(m9bVar);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setId(myc.server_host_container);
        linearLayout2.setOrientation(1);
        linearLayout2.setVisibility(8);
        veb vebVar = new veb(linearLayout2.getContext());
        vebVar.setId(myc.server_host_input);
        vebVar.setLayoutParams(new kt3(-1, -2));
        vebVar.setBackgroundColorAttr(Integer.valueOf(w9b.M));
        vebVar.setHint("Введите кастомный адрес");
        p3 p3Var = new p3(8, this);
        w3b w3bVar = vebVar.a;
        w3bVar.addTextChangedListener(p3Var);
        w3bVar.addTextChangedListener(p3Var);
        linearLayout2.addView(vebVar);
        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
        oneMeButton.setId(myc.server_host_custom_btn);
        kt3 kt3Var = new kt3(-1, -2);
        ((ViewGroup.MarginLayoutParams) kt3Var).topMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(kt3Var);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setText("Установить");
        f8j.d(oneMeButton, 300L, new pcc(9, this));
        linearLayout2.addView(oneMeButton);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        k18 k18Var = this.C0;
        tcf tcfVar = ((r77) k18Var.getValue()).Y;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(tcfVar, l48VarP, l38Var), new nfe(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((r77) k18Var.getValue()).Z, getViewLifecycleOwner().p(), l38Var), new ofe(null, this, view), 1), getViewLifecycleScope());
    }
}
