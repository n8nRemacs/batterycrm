package one.me.profile.screens.members.compact;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a9h;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bcb;
import defpackage.br2;
import defpackage.bud;
import defpackage.c83;
import defpackage.dr2;
import defpackage.eo7;
import defpackage.er2;
import defpackage.f82;
import defpackage.fni;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hd5;
import defpackage.hd9;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.k18;
import defpackage.l38;
import defpackage.l48;
import defpackage.l8j;
import defpackage.qq3;
import defpackage.td9;
import defpackage.tl2;
import defpackage.toc;
import defpackage.v8b;
import defpackage.vid;
import defpackage.vr2;
import defpackage.x26;
import defpackage.ys;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.zr0;
import java.util.List;
import kotlin.Metadata;
import one.me.members.list.MembersListWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/profile/screens/members/compact/ChatMembersCompactWidget;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatMembersCompactWidget extends Widget implements qq3 {
    public static final /* synthetic */ yy7[] Y = {new toc(ChatMembersCompactWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, ChatMembersCompactWidget.class, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    public final bbd X;
    public final hs a;
    public final String b;
    public final k18 c;
    public bcb d;
    public final k18 o;

    public ChatMembersCompactWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new hs(Long.class, "id");
        this.b = a9h.d(y0(), "profile:compactChatMembersList:{", "}");
        this.c = createViewModelLazy(vr2.class, new tl2(3, new dr2(this, 0)));
        this.o = createViewModelLazy(td9.class, new tl2(4, new dr2(this, 1)));
        x26 x26Var = z0().x0;
        l48 l48VarP = this.lifecycleOwner.p();
        l38 l38Var = l38.d;
        gw0.w(aw0.a(x26Var, l48VarP, l38Var), getLifecycleScope());
        gw0.w(new g56(aw0.a(A0().o, this.lifecycleOwner.p(), l38Var), new er2(this, null), 1), getLifecycleScope());
        gw0.w(new g56(aw0.a(z0().w0, this.lifecycleOwner.p(), l38Var), new zr0(2, this, ChatMembersCompactWidget.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 8), 1), getLifecycleScope());
        this.X = childSlotRouter(v8b.A0);
    }

    public final td9 A0() {
        return (td9) this.o.getValue();
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        long[] longArray;
        long[] longArray2;
        int i2 = v8b.F0;
        List list = hd5.a;
        List listC = null;
        if (i == i2) {
            if (bundle != null && (longArray2 = bundle.getLongArray("profile:memberslist:ids_to_delete")) != null) {
                listC = ys.C(longArray2);
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
            if (bundle != null && (longArray = bundle.getLongArray("profile:memberslist:ids_to_delete")) != null) {
                listC = ys.C(longArray);
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
    /* renamed from: getInsetsConfig */
    public final eo7 getC() {
        eo7 eo7Var = eo7.e;
        return eo7.e;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getD() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        f82 f82Var = new f82(getContext());
        f82Var.setId(v8b.A0);
        f82Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return f82Var;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        bcb bcbVar = this.d;
        if (bcbVar != null) {
            bcbVar.a();
        }
        this.d = null;
        z0().z();
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        c83 c83Var = (c83) this.X.D(this, Y[1]);
        ytd ytdVar = c83Var.a;
        if (fni.a(c83Var.b(), "compact_members_list_widget")) {
            return;
        }
        ytdVar.R(false);
        bud budVarA = l8j.a(new MembersListWidget(this.b, new hd9(y0(), br2.MEMBER, 4), null), null, null);
        budVarA.d("compact_members_list_widget");
        ytdVar.S(budVarA);
    }

    public final long y0() {
        yy7 yy7Var = Y[0];
        return ((Number) this.a.a(this)).longValue();
    }

    public final vr2 z0() {
        return (vr2) this.c.getValue();
    }

    public ChatMembersCompactWidget(long j) {
        this(gwi.b(new imb("id", Long.valueOf(j))));
    }
}
