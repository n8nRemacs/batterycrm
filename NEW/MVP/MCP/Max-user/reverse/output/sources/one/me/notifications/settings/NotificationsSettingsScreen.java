package one.me.notifications.settings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.aw0;
import defpackage.b14;
import defpackage.cm6;
import defpackage.cpa;
import defpackage.em1;
import defpackage.eo7;
import defpackage.g56;
import defpackage.gw0;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.iv8;
import defpackage.ji0;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.l38;
import defpackage.l48;
import defpackage.m;
import defpackage.mc5;
import defpackage.noa;
import defpackage.ooa;
import defpackage.qoa;
import defpackage.qrb;
import defpackage.sn0;
import defpackage.soa;
import defpackage.toa;
import defpackage.toc;
import defpackage.tqi;
import defpackage.uoa;
import defpackage.vid;
import defpackage.voa;
import defpackage.xfh;
import defpackage.yfb;
import defpackage.yq9;
import defpackage.yy7;
import defpackage.z41;
import defpackage.z7b;
import defpackage.zh0;
import kotlin.Metadata;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/notifications/settings/NotificationsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lb14;", "Lqrb;", "<init>", "()V", "notifications-settings_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class NotificationsSettingsScreen extends Widget implements b14, qrb {
    public static final /* synthetic */ yy7[] u0 = {new toc(NotificationsSettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), ho7.d(vid.a, NotificationsSettingsScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new toc(NotificationsSettingsScreen.class, "resetDefaultsButton", "getResetDefaultsButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final k18 X;
    public final ji0 Y;
    public final sn0 Z;
    public final ka5 a;
    public final eo7 b;
    public final k18 c;
    public final k18 d;
    public final noa o;
    public final sn0 s0;
    public final sn0 t0;

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationsSettingsScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new ka5(new yq9(7), (cm6) null, 6);
        this.b = eo7.f;
        this.c = createViewModelLazy(cpa.class, new iv8(17, new yq9(8)));
        ooa ooaVar = ooa.a;
        this.d = ooaVar.getAccessor().d(10);
        this.o = new noa(new mc5(24, this), ooaVar.getExecutors().a());
        this.X = createViewModelLazy(zh0.class, new iv8(18, new yq9(9)));
        this.Y = new ji0(this, ooaVar.getExecutors().a());
        final int i = 0;
        this.Z = binding(new cm6(this) { // from class: roa
            public final /* synthetic */ NotificationsSettingsScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                int i3 = 3;
                NotificationsSettingsScreen notificationsSettingsScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = NotificationsSettingsScreen.u0;
                        yfb yfbVar = new yfb(notificationsSettingsScreen.getContext(), 6);
                        yfbVar.setId(z7b.B);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTitle(((Boolean) notificationsSettingsScreen.y0().A0.getValue()).booleanValue() ? b8b.a : b8b.x);
                        yfbVar.setLeftActions(new gfb(new dga(3)));
                        return yfbVar;
                    case 1:
                        yy7[] yy7VarArr2 = NotificationsSettingsScreen.u0;
                        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(notificationsSettingsScreen.getContext(), null, 6);
                        endlessRecyclerView2.setId(z7b.y);
                        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        endlessRecyclerView2.getContext();
                        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                        endlessRecyclerView2.setAdapter(new zm3(notificationsSettingsScreen.Y, notificationsSettingsScreen.o));
                        endlessRecyclerView2.setOverScrollMode(2);
                        endlessRecyclerView2.j(new d9e(a93.s0.y(endlessRecyclerView2), new z9a(endlessRecyclerView2, i3, notificationsSettingsScreen), null, null, 28));
                        endlessRecyclerView2.j(new fna());
                        return endlessRecyclerView2;
                    default:
                        yy7[] yy7VarArr3 = NotificationsSettingsScreen.u0;
                        OneMeButton oneMeButton = new OneMeButton(notificationsSettingsScreen.getContext(), null);
                        oneMeButton.setId(z7b.z);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        float f = 12;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
                        layoutParams.setMarginEnd(kti.d(f * vw4.d().getDisplayMetrics().density));
                        oneMeButton.setLayoutParams(layoutParams);
                        oneMeButton.setAppearance(gza.b);
                        oneMeButton.setSize(jza.b);
                        oneMeButton.setMode(iza.c);
                        oneMeButton.setText(((Boolean) notificationsSettingsScreen.y0().A0.getValue()).booleanValue() ? b8b.v : b8b.u);
                        f8j.d(oneMeButton, 300L, new ye6(21, notificationsSettingsScreen));
                        return oneMeButton;
                }
            }
        });
        final int i2 = 1;
        this.s0 = binding(new cm6(this) { // from class: roa
            public final /* synthetic */ NotificationsSettingsScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                int i3 = 3;
                NotificationsSettingsScreen notificationsSettingsScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = NotificationsSettingsScreen.u0;
                        yfb yfbVar = new yfb(notificationsSettingsScreen.getContext(), 6);
                        yfbVar.setId(z7b.B);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTitle(((Boolean) notificationsSettingsScreen.y0().A0.getValue()).booleanValue() ? b8b.a : b8b.x);
                        yfbVar.setLeftActions(new gfb(new dga(3)));
                        return yfbVar;
                    case 1:
                        yy7[] yy7VarArr2 = NotificationsSettingsScreen.u0;
                        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(notificationsSettingsScreen.getContext(), null, 6);
                        endlessRecyclerView2.setId(z7b.y);
                        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        endlessRecyclerView2.getContext();
                        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                        endlessRecyclerView2.setAdapter(new zm3(notificationsSettingsScreen.Y, notificationsSettingsScreen.o));
                        endlessRecyclerView2.setOverScrollMode(2);
                        endlessRecyclerView2.j(new d9e(a93.s0.y(endlessRecyclerView2), new z9a(endlessRecyclerView2, i3, notificationsSettingsScreen), null, null, 28));
                        endlessRecyclerView2.j(new fna());
                        return endlessRecyclerView2;
                    default:
                        yy7[] yy7VarArr3 = NotificationsSettingsScreen.u0;
                        OneMeButton oneMeButton = new OneMeButton(notificationsSettingsScreen.getContext(), null);
                        oneMeButton.setId(z7b.z);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        float f = 12;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
                        layoutParams.setMarginEnd(kti.d(f * vw4.d().getDisplayMetrics().density));
                        oneMeButton.setLayoutParams(layoutParams);
                        oneMeButton.setAppearance(gza.b);
                        oneMeButton.setSize(jza.b);
                        oneMeButton.setMode(iza.c);
                        oneMeButton.setText(((Boolean) notificationsSettingsScreen.y0().A0.getValue()).booleanValue() ? b8b.v : b8b.u);
                        f8j.d(oneMeButton, 300L, new ye6(21, notificationsSettingsScreen));
                        return oneMeButton;
                }
            }
        });
        final int i3 = 2;
        this.t0 = binding(new cm6(this) { // from class: roa
            public final /* synthetic */ NotificationsSettingsScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i3;
                int i32 = 3;
                NotificationsSettingsScreen notificationsSettingsScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = NotificationsSettingsScreen.u0;
                        yfb yfbVar = new yfb(notificationsSettingsScreen.getContext(), 6);
                        yfbVar.setId(z7b.B);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTitle(((Boolean) notificationsSettingsScreen.y0().A0.getValue()).booleanValue() ? b8b.a : b8b.x);
                        yfbVar.setLeftActions(new gfb(new dga(3)));
                        return yfbVar;
                    case 1:
                        yy7[] yy7VarArr2 = NotificationsSettingsScreen.u0;
                        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(notificationsSettingsScreen.getContext(), null, 6);
                        endlessRecyclerView2.setId(z7b.y);
                        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        endlessRecyclerView2.getContext();
                        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                        endlessRecyclerView2.setAdapter(new zm3(notificationsSettingsScreen.Y, notificationsSettingsScreen.o));
                        endlessRecyclerView2.setOverScrollMode(2);
                        endlessRecyclerView2.j(new d9e(a93.s0.y(endlessRecyclerView2), new z9a(endlessRecyclerView2, i32, notificationsSettingsScreen), null, null, 28));
                        endlessRecyclerView2.j(new fna());
                        return endlessRecyclerView2;
                    default:
                        yy7[] yy7VarArr3 = NotificationsSettingsScreen.u0;
                        OneMeButton oneMeButton = new OneMeButton(notificationsSettingsScreen.getContext(), null);
                        oneMeButton.setId(z7b.z);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        float f = 12;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
                        layoutParams.setMarginEnd(kti.d(f * vw4.d().getDisplayMetrics().density));
                        oneMeButton.setLayoutParams(layoutParams);
                        oneMeButton.setAppearance(gza.b);
                        oneMeButton.setSize(jza.b);
                        oneMeButton.setMode(iza.c);
                        oneMeButton.setText(((Boolean) notificationsSettingsScreen.y0().A0.getValue()).booleanValue() ? b8b.v : b8b.u);
                        f8j.d(oneMeButton, 300L, new ye6(21, notificationsSettingsScreen));
                        return oneMeButton;
                }
            }
        });
    }

    @Override // defpackage.b14
    public final void A(int i) {
        if (i != 5) {
            return;
        }
        xfh.r(y0().z0, qoa.b);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.a;
    }

    @Override // defpackage.qrb
    public final void i0(boolean z) {
        if (z) {
            return;
        }
        y0().t0.m(null, Boolean.TRUE);
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        cpa cpaVarY0 = y0();
        cpaVarY0.w0.m(null, Boolean.valueOf(cpaVarY0.b.b()));
        cpa cpaVarY02 = y0();
        cpaVarY02.x0.m(null, cpaVarY02.t().j());
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(z7b.p);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        yy7[] yy7VarArr = u0;
        yy7 yy7Var = yy7VarArr[0];
        linearLayout.addView((yfb) this.Z.getValue());
        yy7 yy7Var2 = yy7VarArr[1];
        linearLayout.addView((EndlessRecyclerView2) this.s0.getValue());
        yy7 yy7Var3 = yy7VarArr[2];
        linearLayout.addView((OneMeButton) this.t0.getValue());
        tqi.c(new m(3, null, 10), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 177) {
            y0().t0.m(null, Boolean.valueOf(iArr[0] != 0));
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        hbd hbdVar = y0().v0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new soa(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new z41(((zh0) this.X.getValue()).Z, y0().u0, new em1(3, null, 4), 3), getViewLifecycleOwner().p(), l38Var), new toa(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().s0, getViewLifecycleOwner().p(), l38Var), new uoa(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().z0, getViewLifecycleOwner().p(), l38Var), new voa(null, this), 1), getViewLifecycleScope());
    }

    public final cpa y0() {
        return (cpa) this.c.getValue();
    }
}
