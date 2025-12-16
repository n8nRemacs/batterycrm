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
import defpackage.cm6;
import defpackage.eo7;
import defpackage.f82;
import defpackage.fni;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hd5;
import defpackage.hd9;
import defpackage.ho7;
import defpackage.hr2;
import defpackage.hs;
import defpackage.imb;
import defpackage.ir2;
import defpackage.jr2;
import defpackage.jva;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kr2;
import defpackage.l38;
import defpackage.l48;
import defpackage.l8j;
import defpackage.lr2;
import defpackage.qq3;
import defpackage.td9;
import defpackage.tl2;
import defpackage.toc;
import defpackage.v8b;
import defpackage.vid;
import defpackage.vr2;
import defpackage.x26;
import defpackage.yfb;
import defpackage.ys;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.z44;
import defpackage.zb2;
import defpackage.zr0;
import java.util.List;
import kotlin.Metadata;
import one.me.members.list.MembersListWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/members/ChatMembersScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Lcbb;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "Lbr2;", "chatMemberType", "(JLbr2;)V", "profile_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatMembersScreen extends Widget implements qq3, cbb {
    public static final /* synthetic */ yy7[] t0 = {new toc(ChatMembersScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, ChatMembersScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(ChatMembersScreen.class, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    public final k18 X;
    public final bbd Y;
    public final bbd Z;
    public final ka5 a;
    public final eo7 b;
    public final hs c;
    public final String d;
    public final k18 o;
    public bcb s0;

    public ChatMembersScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new ka5(new zb2(21), (cm6) null, 6);
        this.b = eo7.f;
        this.c = new hs(Long.class, "profile:memberslist:id");
        this.d = a9h.d(y0(), "profile:chatMembersList:{", "}");
        this.o = createViewModelLazy(vr2.class, new tl2(6, new hr2(this, 0)));
        this.X = createViewModelLazy(td9.class, new tl2(7, new hr2(this, 1)));
        this.Y = viewBinding(v8b.J0);
        x26 x26Var = z0().x0;
        l48 l48VarP = this.lifecycleOwner.p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(x26Var, l48VarP, l38Var), new jr2(null, this), 1), getLifecycleScope());
        gw0.w(new g56(aw0.a(A0().o, this.lifecycleOwner.p(), l38Var), new kr2(null, this), 1), getLifecycleScope());
        gw0.w(new g56(aw0.a(z0().w0, this.lifecycleOwner.p(), l38Var), new zr0(2, this, ChatMembersScreen.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 9), 1), getLifecycleScope());
        this.Z = childSlotRouter(v8b.A0);
    }

    public final td9 A0() {
        return (td9) this.X.getValue();
    }

    public final yfb B0() {
        return (yfb) this.Y.D(this, t0[1]);
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
        long[] longArray2;
        int i2 = v8b.F0;
        List list = hd5.a;
        List listC = null;
        if (i == i2 || i == v8b.E0) {
            if (bundle != null && (longArray = bundle.getLongArray("profile:memberslist:ids_to_delete")) != null) {
                listC = ys.C(longArray);
            }
            if (listC != null) {
                list = listC;
            }
            A0().t();
            A0().v(list);
            z0().x(list, false);
            return;
        }
        if (i == v8b.H0) {
            if (bundle != null && (longArray2 = bundle.getLongArray("profile:memberslist:ids_to_delete")) != null) {
                listC = ys.C(longArray2);
            }
            if (listC != null) {
                list = listC;
            }
            A0().t();
            A0().v(list);
            z0().x(list, true);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getO() {
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
        yfbVar.setId(v8b.J0);
        yfbVar.setLeftActions(new gfb(new ir2(this, 0)));
        linearLayout.addView(yfbVar);
        f82 f82Var = new f82(linearLayout.getContext());
        f82Var.setId(v8b.A0);
        f82Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(f82Var);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        api.e(B0());
        A0().t();
        bcb bcbVar = this.s0;
        if (bcbVar != null) {
            bcbVar.a();
        }
        this.s0 = null;
        z0().z();
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        jva jvaVarH = getRouter().h();
        if (jvaVarH != null) {
            jvaVarH.a(getViewLifecycleOwner(), new z44(this, 5));
        }
        c83 c83Var = (c83) this.Z.D(this, t0[2]);
        ytd ytdVar = c83Var.a;
        if (!fni.a(c83Var.b(), "members_list_widget")) {
            ytdVar.R(false);
            long jY0 = y0();
            String string = getArgs().getString("profile:memberslist:type");
            if (string == null) {
                string = "";
            }
            bud budVarA = l8j.a(new MembersListWidget(this.d, new hd9(jY0, br2.valueOf(string), 12), null), null, null);
            budVarA.d("members_list_widget");
            ytdVar.S(budVarA);
        }
        gw0.w(new g56(aw0.a(A0().Z, getViewLifecycleOwner().p(), l38.d), new lr2(null, this), 1), getViewLifecycleScope());
    }

    public final long y0() {
        yy7 yy7Var = t0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final vr2 z0() {
        return (vr2) this.o.getValue();
    }

    public ChatMembersScreen(long j, br2 br2Var) {
        this(gwi.b(new imb("profile:memberslist:id", Long.valueOf(j)), new imb("profile:memberslist:type", br2Var.a)));
    }
}
