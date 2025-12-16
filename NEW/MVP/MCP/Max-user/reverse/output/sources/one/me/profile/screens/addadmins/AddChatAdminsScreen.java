package one.me.profile.screens.addadmins;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.a9h;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bcb;
import defpackage.cbb;
import defpackage.cm6;
import defpackage.cpi;
import defpackage.eo7;
import defpackage.g56;
import defpackage.gn;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h9;
import defpackage.hfb;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i6;
import defpackage.i9;
import defpackage.imb;
import defpackage.j9;
import defpackage.k;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.l;
import defpackage.l38;
import defpackage.lfb;
import defpackage.lqi;
import defpackage.neb;
import defpackage.q;
import defpackage.td9;
import defpackage.tfb;
import defpackage.toc;
import defpackage.v8b;
import defpackage.vid;
import defpackage.vw4;
import defpackage.x8b;
import defpackage.yfb;
import defpackage.yy7;
import java.util.Collections;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/profile/screens/addadmins/AddChatAdminsScreen;", "Lone/me/sdk/arch/Widget;", "Lcbb;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class AddChatAdminsScreen extends Widget implements cbb {
    public static final /* synthetic */ yy7[] t0 = {new toc(AddChatAdminsScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, AddChatAdminsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(AddChatAdminsScreen.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public final bbd X;
    public final bbd Y;
    public final h9 Z;
    public final ka5 a;
    public final eo7 b;
    public final hs c;
    public final String d;
    public final k18 o;
    public bcb s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddChatAdminsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        int i = 2;
        this.a = new ka5(new l(1), (cm6) null, 6);
        this.b = eo7.f;
        this.c = new hs(Long.class, "profile:add_admins:chat_id");
        String strD = a9h.d(y0(), "profile:add_admins:{", "}");
        this.d = strD;
        this.o = createViewModelLazy(td9.class, new q(i, new i6(i, this)));
        this.X = viewBinding(v8b.e);
        this.Y = viewBinding(v8b.f);
        int i2 = x8b.a;
        this.Z = new h9(y0(), strD, Collections.singletonList(new i9()), this);
    }

    @Override // defpackage.cbb
    public final void J(CharSequence charSequence) {
        ((td9) this.o.getValue()).x(String.valueOf(charSequence));
    }

    @Override // defpackage.cbb
    public final void a0() {
        ((td9) this.o.getValue()).x(null);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getX() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getB() {
        return this.d;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.a;
    }

    @Override // defpackage.cbb
    public final void o() {
        ((td9) this.o.getValue()).x(null);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        yfb yfbVar = new yfb(linearLayout.getContext(), 6);
        yfbVar.setId(v8b.e);
        yfbVar.setTitle(x8b.V);
        yfbVar.setLeftActions(new hfb(new k(2, this)));
        yfbVar.setRightActions(new lfb(null, new tfb(this), null));
        linearLayout.addView(yfbVar);
        neb nebVar = new neb(linearLayout.getContext(), 0);
        nebVar.setId(v8b.d);
        nebVar.setLayoutParams(new gn());
        nebVar.setTabMode(1);
        nebVar.setElevation(vw4.d().getDisplayMetrics().density * 10.0f);
        nebVar.setVisibility(8);
        linearLayout.addView(nebVar);
        ViewPager2 viewPager2 = new ViewPager2(linearLayout.getContext());
        viewPager2.setId(v8b.f);
        viewPager2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        lqi.b(viewPager2);
        linearLayout.addView(viewPager2);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        cpi.c(z0());
        if (!requireActivity().isChangingConfigurations()) {
            ((ViewPager2) this.Y.D(this, t0[2])).setAdapter(null);
        }
        this.s0 = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ViewPager2 viewPager2 = (ViewPager2) this.Y.D(this, t0[2]);
        viewPager2.setAdapter(this.Z);
        viewPager2.setOffscreenPageLimit(1);
        gw0.w(new g56(aw0.a(((td9) this.o.getValue()).o, getViewLifecycleOwner().p(), l38.d), new j9(null, this), 1), getViewLifecycleScope());
    }

    public final long y0() {
        yy7 yy7Var = t0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final yfb z0() {
        return (yfb) this.X.D(this, t0[1]);
    }

    public AddChatAdminsScreen(long j) {
        this(gwi.b(new imb("profile:add_admins:chat_id", Long.valueOf(j))));
    }
}
