package one.me.profile.screens.members;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a9h;
import defpackage.api;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bcb;
import defpackage.br2;
import defpackage.bud;
import defpackage.c83;
import defpackage.cbb;
import defpackage.ci5;
import defpackage.cm6;
import defpackage.d92;
import defpackage.eo7;
import defpackage.f82;
import defpackage.fni;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hc2;
import defpackage.hd5;
import defpackage.hd9;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.ipi;
import defpackage.jl1;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.l38;
import defpackage.l48;
import defpackage.l8j;
import defpackage.lfb;
import defpackage.n5g;
import defpackage.pjc;
import defpackage.q;
import defpackage.qq3;
import defpackage.td9;
import defpackage.tfb;
import defpackage.toc;
import defpackage.v8b;
import defpackage.vid;
import defpackage.x8b;
import defpackage.xb2;
import defpackage.xfh;
import defpackage.yb2;
import defpackage.yfb;
import defpackage.ys;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.zr0;
import java.util.List;
import kotlin.Metadata;
import one.me.members.list.MembersListWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/profile/screens/members/ChatAdminsScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Lcbb;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatAdminsScreen extends Widget implements qq3, cbb {
    public static final /* synthetic */ yy7[] u0 = {new toc(ChatAdminsScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, ChatAdminsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(ChatAdminsScreen.class, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    public final k18 X;
    public final Object Y;
    public final bbd Z;
    public final ka5 a;
    public final eo7 b;
    public final hs c;
    public final String d;
    public final k18 o;
    public bcb s0;
    public final bbd t0;

    public ChatAdminsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new ka5(new jl1(28), (cm6) null, 6);
        this.b = eo7.f;
        this.c = new hs(Long.class, "id");
        this.d = a9h.d(z0(), "profile:chatMembersList:{", "}");
        this.o = createViewModelLazy(hc2.class, new q(27, new xb2(this, 0)));
        this.X = createViewModelLazy(td9.class, new q(28, new xb2(this, 1)));
        this.Y = ipi.b(3, new jl1(29));
        this.Z = viewBinding(v8b.K0);
        ci5 ci5Var = A0().o;
        l48 l48VarP = this.lifecycleOwner.p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(ci5Var, l48VarP, l38Var), new yb2(this, null), 1), getLifecycleScope());
        gw0.w(new g56(aw0.a(y0().u0, this.lifecycleOwner.p(), l38Var), new zr0(2, this, ChatAdminsScreen.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 7), 1), getLifecycleScope());
        this.t0 = childSlotRouter(v8b.B0);
    }

    public final td9 A0() {
        return (td9) this.X.getValue();
    }

    @Override // defpackage.cbb
    public final void J(CharSequence charSequence) {
        A0().x(String.valueOf(charSequence));
    }

    @Override // defpackage.cbb
    public final void a0() {
        A0().x(null);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        long[] longArray;
        if (i == v8b.C0) {
            List listC = (bundle == null || (longArray = bundle.getLongArray("profile:adminslist:ids_to_delete")) == null) ? null : ys.C(longArray);
            if (listC == null) {
                listC = hd5.a;
            }
            A0().v(listC);
            hc2 hc2VarY0 = y0();
            hc2VarY0.t0.addAll(listC);
            xfh.r(hc2VarY0.u0, new pjc(new n5g(x8b.f2)));
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
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
        A0().x(null);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        yfb yfbVar = new yfb(linearLayout.getContext(), 6);
        yfbVar.setId(v8b.K0);
        yfbVar.setTitle(x8b.u2);
        yfbVar.setLeftActions(new gfb(new d92(1, this)));
        yfbVar.setRightActions(new lfb(null, new tfb(this), null));
        linearLayout.addView(yfbVar);
        f82 f82Var = new f82(linearLayout.getContext());
        f82Var.setId(v8b.B0);
        f82Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(f82Var);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        api.e((yfb) this.Z.D(this, u0[1]));
        bcb bcbVar = this.s0;
        if (bcbVar != null) {
            bcbVar.a();
        }
        this.s0 = null;
        y0().u();
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        c83 c83Var = (c83) this.t0.D(this, u0[2]);
        ytd ytdVar = c83Var.a;
        if (fni.a(c83Var.b(), "admins_list_widget")) {
            return;
        }
        ytdVar.R(false);
        bud budVarA = l8j.a(new MembersListWidget(this.d, new hd9(z0(), br2.ADMIN, 12), null), null, null);
        budVarA.d("admins_list_widget");
        ytdVar.S(budVarA);
    }

    public final hc2 y0() {
        return (hc2) this.o.getValue();
    }

    public final long z0() {
        yy7 yy7Var = u0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public ChatAdminsScreen(long j) {
        this(gwi.b(new imb("id", Long.valueOf(j))));
    }
}
