package one.me.notifications.settings.screens.other;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.aw0;
import defpackage.cm6;
import defpackage.co2;
import defpackage.eo7;
import defpackage.g56;
import defpackage.gw0;
import defpackage.ho7;
import defpackage.iv8;
import defpackage.k18;
import defpackage.koe;
import defpackage.kti;
import defpackage.l38;
import defpackage.m;
import defpackage.ooa;
import defpackage.rjb;
import defpackage.sn0;
import defpackage.tjb;
import defpackage.toc;
import defpackage.tqi;
import defpackage.vid;
import defpackage.vw4;
import defpackage.yfb;
import defpackage.yy7;
import defpackage.z7b;
import defpackage.zfb;
import kotlin.Metadata;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/notifications/settings/screens/other/OtherNotificationsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "notifications-settings_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class OtherNotificationsSettingsScreen extends Widget {
    public static final /* synthetic */ yy7[] X = {new toc(OtherNotificationsSettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), ho7.d(vid.a, OtherNotificationsSettingsScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public final eo7 a;
    public final k18 b;
    public final koe c;
    public final sn0 d;
    public final sn0 o;

    /* JADX WARN: Multi-variable type inference failed */
    public OtherNotificationsSettingsScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = eo7.f;
        this.b = createViewModelLazy(tjb.class, new iv8(19, new zfb(6)));
        this.c = new koe(new co2(8, this), ooa.a.getExecutors().a());
        final int i = 0;
        this.d = binding(new cm6(this) { // from class: qjb
            public final /* synthetic */ OtherNotificationsSettingsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                OtherNotificationsSettingsScreen otherNotificationsSettingsScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = OtherNotificationsSettingsScreen.X;
                        yfb yfbVar = new yfb(otherNotificationsSettingsScreen.getContext(), 6);
                        yfbVar.setId(z7b.x);
                        yfbVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTitle(b8b.t);
                        yfbVar.setLeftActions(new gfb(new dga(19)));
                        return yfbVar;
                    default:
                        yy7[] yy7VarArr2 = OtherNotificationsSettingsScreen.X;
                        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(otherNotificationsSettingsScreen.getContext(), null, 6);
                        endlessRecyclerView2.setId(z7b.v);
                        endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        endlessRecyclerView2.getContext();
                        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                        endlessRecyclerView2.setOverScrollMode(2);
                        endlessRecyclerView2.setAdapter(otherNotificationsSettingsScreen.c);
                        endlessRecyclerView2.j(new d9e(a93.s0.y(endlessRecyclerView2), new iqa(6), null, null, 28));
                        endlessRecyclerView2.j(new m01(3));
                        return endlessRecyclerView2;
                }
            }
        });
        final int i2 = 1;
        this.o = binding(new cm6(this) { // from class: qjb
            public final /* synthetic */ OtherNotificationsSettingsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                OtherNotificationsSettingsScreen otherNotificationsSettingsScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = OtherNotificationsSettingsScreen.X;
                        yfb yfbVar = new yfb(otherNotificationsSettingsScreen.getContext(), 6);
                        yfbVar.setId(z7b.x);
                        yfbVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTitle(b8b.t);
                        yfbVar.setLeftActions(new gfb(new dga(19)));
                        return yfbVar;
                    default:
                        yy7[] yy7VarArr2 = OtherNotificationsSettingsScreen.X;
                        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(otherNotificationsSettingsScreen.getContext(), null, 6);
                        endlessRecyclerView2.setId(z7b.v);
                        endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        endlessRecyclerView2.getContext();
                        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                        endlessRecyclerView2.setOverScrollMode(2);
                        endlessRecyclerView2.setAdapter(otherNotificationsSettingsScreen.c);
                        endlessRecyclerView2.j(new d9e(a93.s0.y(endlessRecyclerView2), new iqa(6), null, null, 28));
                        endlessRecyclerView2.j(new m01(3));
                        return endlessRecyclerView2;
                }
            }
        });
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(z7b.t);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        float f = 12;
        linearLayout.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(f * vw4.d().getDisplayMetrics().density), 0);
        yy7[] yy7VarArr = X;
        yy7 yy7Var = yy7VarArr[0];
        linearLayout.addView((yfb) this.d.getValue());
        yy7 yy7Var2 = yy7VarArr[1];
        linearLayout.addView((EndlessRecyclerView2) this.o.getValue());
        tqi.c(new m(3, null, 11), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        gw0.w(new g56(aw0.a(((tjb) this.b.getValue()).X, getViewLifecycleOwner().p(), l38.d), new rjb(null, this), 1), getViewLifecycleScope());
    }
}
