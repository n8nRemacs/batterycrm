package one.me.profile.screens.changeowner;

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
import defpackage.br2;
import defpackage.bud;
import defpackage.c83;
import defpackage.cbb;
import defpackage.ci5;
import defpackage.cm6;
import defpackage.d92;
import defpackage.e92;
import defpackage.eo7;
import defpackage.f82;
import defpackage.f92;
import defpackage.fni;
import defpackage.g56;
import defpackage.g92;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h92;
import defpackage.hd9;
import defpackage.hk1;
import defpackage.ho7;
import defpackage.hs;
import defpackage.hwa;
import defpackage.imb;
import defpackage.j92;
import defpackage.jl1;
import defpackage.k18;
import defpackage.k1e;
import defpackage.k92;
import defpackage.ka5;
import defpackage.l38;
import defpackage.l48;
import defpackage.l8j;
import defpackage.lfb;
import defpackage.lzf;
import defpackage.n5g;
import defpackage.pb2;
import defpackage.pdc;
import defpackage.q;
import defpackage.q2b;
import defpackage.qq3;
import defpackage.td9;
import defpackage.tfb;
import defpackage.toc;
import defpackage.v8b;
import defpackage.vid;
import defpackage.vkc;
import defpackage.w63;
import defpackage.x8b;
import defpackage.xfh;
import defpackage.yfb;
import defpackage.ytd;
import defpackage.yud;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.members.list.MembersListWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/changeowner/ChangeOwnerScreen;", "Lone/me/sdk/arch/Widget;", "Lcbb;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "", "leaveFromChat", "(JZ)V", "profile_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChangeOwnerScreen extends Widget implements cbb, qq3 {
    public static final /* synthetic */ yy7[] t0 = {new toc(ChangeOwnerScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, ChangeOwnerScreen.class, "leaveFromChat", "getLeaveFromChat()Z", 0), new toc(ChangeOwnerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(ChangeOwnerScreen.class, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    public final k18 X;
    public final k18 Y;
    public final bbd Z;
    public final ka5 a;
    public final eo7 b;
    public final hs c;
    public final hs d;
    public final String o;
    public final bbd s0;

    public ChangeOwnerScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new ka5(new jl1(25), (cm6) null, 6);
        this.b = eo7.f;
        this.c = new hs(Long.class, "chat_id");
        this.d = new hs(Boolean.class, "leave_chat");
        this.o = a9h.d(y0(), "profile:chatMembersList:{", "}");
        this.X = createViewModelLazy(k92.class, new q(25, new hk1(7, this)));
        this.Y = createViewModelLazy(td9.class, new q(26, new jl1(26)));
        this.Z = viewBinding(v8b.s);
        this.s0 = childSlotRouter(v8b.r);
    }

    @Override // defpackage.cbb
    public final void J(CharSequence charSequence) {
        ((td9) this.Y.getValue()).x(String.valueOf(charSequence));
    }

    @Override // defpackage.cbb
    public final void a0() {
        ((td9) this.Y.getValue()).x(null);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i != v8b.p || bundle == null) {
            return;
        }
        long j = bundle.getLong("new_owner_id");
        k92 k92Var = (k92) this.X.getValue();
        boolean zZ0 = z0();
        ci5 ci5Var = k92Var.Z;
        long j2 = k92Var.b;
        pb2 pb2Var = (pb2) ((w63) k92Var.d.getValue()).j(j2).a.getValue();
        if (pb2Var != null) {
            ((hwa) k92Var.c.getValue()).e(k92Var.b, pb2Var.b.a, j);
            if (zZ0) {
                xfh.o(k92Var, ((q2b) ((lzf) k92Var.X.getValue())).b(), new j92(k92Var, null), 2);
                xfh.r(ci5Var, new h92(new n5g(x8b.g0), Integer.valueOf(yud.A)));
            } else {
                xfh.r(ci5Var, new h92(new n5g(x8b.m0), Integer.valueOf(yud.A)));
                xfh.r(k92Var.Y, new vkc(j2, pdc.b));
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getX() {
        return this.o;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.a;
    }

    @Override // defpackage.cbb
    public final void o() {
        ((td9) this.Y.getValue()).x(null);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        yfb yfbVar = new yfb(linearLayout.getContext(), 6);
        yfbVar.setId(v8b.s);
        yfbVar.setTitle(x8b.o0);
        yfbVar.setLeftActions(new gfb(new d92(0, this)));
        yfbVar.setRightActions(new lfb(null, new tfb(this), null));
        linearLayout.addView(yfbVar);
        f82 f82Var = new f82(linearLayout.getContext());
        f82Var.setId(v8b.r);
        f82Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(f82Var);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        api.e((yfb) this.Z.D(this, t0[2]));
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        c83 c83Var = (c83) this.s0.D(this, t0[3]);
        ytd ytdVar = c83Var.a;
        if (!fni.a(c83Var.b(), "change_owner_widget")) {
            ytdVar.R(false);
            bud budVarA = l8j.a(new MembersListWidget(this.o, new hd9(y0(), br2.MEMBER, 12), null), null, null);
            budVarA.d("change_owner_widget");
            ytdVar.S(budVarA);
        }
        ci5 ci5Var = ((td9) this.Y.getValue()).o;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(ci5Var, l48VarP, l38Var), new e92(null, this), 1), getViewLifecycleScope());
        k18 k18Var = this.X;
        gw0.w(new g56(aw0.a(((k92) k18Var.getValue()).Y, getViewLifecycleOwner().p(), l38Var), new f92(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((k92) k18Var.getValue()).Z, getViewLifecycleOwner().p(), l38Var), new g92(null, this), 1), getViewLifecycleScope());
    }

    public final long y0() {
        yy7 yy7Var = t0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final boolean z0() {
        yy7 yy7Var = t0[1];
        return ((Boolean) this.d.a(this)).booleanValue();
    }

    public ChangeOwnerScreen(long j, boolean z) {
        this(gwi.b(new imb("chat_id", Long.valueOf(j)), new imb("leave_chat", Boolean.valueOf(z))));
    }
}
