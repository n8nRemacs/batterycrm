package one.me.notifications.settings.screens.chat;

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
import defpackage.ht2;
import defpackage.it2;
import defpackage.k18;
import defpackage.koe;
import defpackage.kti;
import defpackage.l38;
import defpackage.m;
import defpackage.ooa;
import defpackage.sn0;
import defpackage.tl2;
import defpackage.toc;
import defpackage.tqi;
import defpackage.vid;
import defpackage.vw4;
import defpackage.yfb;
import defpackage.yy7;
import defpackage.z7b;
import defpackage.zb2;
import kotlin.Metadata;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/notifications/settings/screens/chat/ChatNotificationsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "notifications-settings_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatNotificationsSettingsScreen extends Widget {
    public static final /* synthetic */ yy7[] X = {new toc(ChatNotificationsSettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), ho7.d(vid.a, ChatNotificationsSettingsScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public final eo7 a;
    public final k18 b;
    public final koe c;
    public final sn0 d;
    public final sn0 o;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatNotificationsSettingsScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = eo7.f;
        this.b = createViewModelLazy(it2.class, new tl2(8, new zb2(23)));
        this.c = new koe(new co2(1, this), ooa.a.getExecutors().a());
        final int i = 0;
        this.d = binding(new cm6(this) { // from class: ft2
            public final /* synthetic */ ChatNotificationsSettingsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                ChatNotificationsSettingsScreen chatNotificationsSettingsScreen = this.b;
                int i3 = 6;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = ChatNotificationsSettingsScreen.X;
                        yfb yfbVar = new yfb(chatNotificationsSettingsScreen.getContext(), 6);
                        yfbVar.setId(z7b.e);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTitle(b8b.e);
                        yfbVar.setLeftActions(new gfb(new gf1(21)));
                        return yfbVar;
                    default:
                        yy7[] yy7VarArr2 = ChatNotificationsSettingsScreen.X;
                        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(chatNotificationsSettingsScreen.getContext(), null, 6);
                        endlessRecyclerView2.setId(z7b.c);
                        endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        endlessRecyclerView2.getContext();
                        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                        endlessRecyclerView2.setOverScrollMode(2);
                        koe koeVar = chatNotificationsSettingsScreen.c;
                        endlessRecyclerView2.setAdapter(koeVar);
                        endlessRecyclerView2.j(new d9e(a93.s0.y(endlessRecyclerView2), new i62(9, chatNotificationsSettingsScreen), null, null, 28));
                        endlessRecyclerView2.j(new m01(2));
                        okf okfVar = new okf(endlessRecyclerView2, koeVar, new x6i(8, new ia(chatNotificationsSettingsScreen, i3, endlessRecyclerView2)));
                        endlessRecyclerView2.j(okfVar);
                        tqi.c(new gt2(okfVar, null, 0), endlessRecyclerView2);
                        return endlessRecyclerView2;
                }
            }
        });
        final int i2 = 1;
        this.o = binding(new cm6(this) { // from class: ft2
            public final /* synthetic */ ChatNotificationsSettingsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                ChatNotificationsSettingsScreen chatNotificationsSettingsScreen = this.b;
                int i3 = 6;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = ChatNotificationsSettingsScreen.X;
                        yfb yfbVar = new yfb(chatNotificationsSettingsScreen.getContext(), 6);
                        yfbVar.setId(z7b.e);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTitle(b8b.e);
                        yfbVar.setLeftActions(new gfb(new gf1(21)));
                        return yfbVar;
                    default:
                        yy7[] yy7VarArr2 = ChatNotificationsSettingsScreen.X;
                        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(chatNotificationsSettingsScreen.getContext(), null, 6);
                        endlessRecyclerView2.setId(z7b.c);
                        endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        endlessRecyclerView2.getContext();
                        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                        endlessRecyclerView2.setOverScrollMode(2);
                        koe koeVar = chatNotificationsSettingsScreen.c;
                        endlessRecyclerView2.setAdapter(koeVar);
                        endlessRecyclerView2.j(new d9e(a93.s0.y(endlessRecyclerView2), new i62(9, chatNotificationsSettingsScreen), null, null, 28));
                        endlessRecyclerView2.j(new m01(2));
                        okf okfVar = new okf(endlessRecyclerView2, koeVar, new x6i(8, new ia(chatNotificationsSettingsScreen, i3, endlessRecyclerView2)));
                        endlessRecyclerView2.j(okfVar);
                        tqi.c(new gt2(okfVar, null, 0), endlessRecyclerView2);
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
        linearLayout.setId(z7b.b);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        float f = 12;
        linearLayout.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(f * vw4.d().getDisplayMetrics().density), 0);
        yy7[] yy7VarArr = X;
        yy7 yy7Var = yy7VarArr[0];
        linearLayout.addView((yfb) this.d.getValue());
        yy7 yy7Var2 = yy7VarArr[1];
        linearLayout.addView((EndlessRecyclerView2) this.o.getValue());
        tqi.c(new m(3, null, 3), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        gw0.w(new g56(aw0.a(((it2) this.b.getValue()).o, getViewLifecycleOwner().p(), l38.d), new ht2(null, this), 1), getViewLifecycleScope());
    }
}
