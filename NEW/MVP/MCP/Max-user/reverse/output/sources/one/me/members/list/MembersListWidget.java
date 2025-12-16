package one.me.members.list;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.aw0;
import defpackage.b0i;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.br2;
import defpackage.c7j;
import defpackage.ce9;
import defpackage.de9;
import defpackage.eo7;
import defpackage.fb6;
import defpackage.fe9;
import defpackage.g44;
import defpackage.g56;
import defpackage.gd9;
import defpackage.ge9;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hc9;
import defpackage.hd9;
import defpackage.he9;
import defpackage.ho7;
import defpackage.hs;
import defpackage.ie9;
import defpackage.imb;
import defpackage.iv8;
import defpackage.k18;
import defpackage.l38;
import defpackage.l48;
import defpackage.ld9;
import defpackage.le9;
import defpackage.ma1;
import defpackage.md9;
import defpackage.os0;
import defpackage.qt7;
import defpackage.t9f;
import defpackage.td9;
import defpackage.tk4;
import defpackage.toc;
import defpackage.u45;
import defpackage.vid;
import defpackage.w73;
import defpackage.x7j;
import defpackage.xfh;
import defpackage.y83;
import defpackage.yh4;
import defpackage.ym3;
import defpackage.yvi;
import defpackage.yy7;
import defpackage.z6b;
import defpackage.z71;
import defpackage.z8a;
import defpackage.zm3;
import defpackage.zr0;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lone/me/members/list/MembersListWidget;", "Lone/me/sdk/arch/Widget;", "Lgd9;", "Lhc9;", "Lg44;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "Lhd9;", "(Ljava/lang/String;Lhd9;Ltk4;)V", "members-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MembersListWidget extends Widget implements gd9, hc9, g44 {
    public static final /* synthetic */ yy7[] C0 = {new toc(MembersListWidget.class, "membersListArgs", "getMembersListArgs()Lone/me/members/list/MembersListArgs;", 0), u45.h(vid.a, MembersListWidget.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new z8a(MembersListWidget.class, "selectedMemberIdForAction", "getSelectedMemberIdForAction()Ljava/lang/Long;"), new toc(MembersListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public w73 A0;
    public yh4 B0;
    public final k18 X;
    public final hs Y;
    public final eo7 Z;
    public final hs a;
    public final long b;
    public final br2 c;
    public final Integer d;
    public final t9f o;
    public final fb6 s0;
    public final b0i t0;
    public final b0i u0;
    public final z71 v0;
    public final z71 w0;
    public final k18 x0;
    public final zm3 y0;
    public final bbd z0;

    public MembersListWidget(String str, hd9 hd9Var, tk4 tk4Var) {
        this(gwi.b(new imb("arg_scope_id", new b1e(str)), new imb("memberslist:args", hd9Var)));
    }

    public final td9 A0() {
        return (td9) this.X.getValue();
    }

    public final ce9 B0() {
        return (ce9) this.x0.getValue();
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        yy7[] yy7VarArr = C0;
        yy7 yy7Var = yy7VarArr[2];
        hs hsVar = this.Y;
        Long l = (Long) hsVar.a(this);
        if (l != null) {
            xfh.r(A0().o, new md9(i, l.longValue()));
        }
        yy7 yy7Var2 = yy7VarArr[2];
        hsVar.b(this, null);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.Z;
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        ((le9) B0().Z.getValue()).f();
        gw0.w(new g56(A0().Z, new he9(2, null), 1), getViewLifecycleScope());
        gw0.w(new g56(A0().X, new ie9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(A0().t0, new zr0(2, B0(), ce9.class, "searchMembers", "searchMembers(Ljava/lang/String;)V", 4, 23), 1), getViewLifecycleScope());
        y83 y83Var = B0().x0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(y83Var, l48VarP, l38Var), new fe9(null, this, view), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(A0().Z, getViewLifecycleOwner().p(), l38Var), new ge9(null, this), 1), getViewLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(getContext(), null, 6);
        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setId(z6b.c);
        endlessRecyclerView2.setItemAnimator(null);
        zm3 zm3Var = this.y0;
        endlessRecyclerView2.setAdapter(zm3Var);
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        endlessRecyclerView2.setClipToPadding(false);
        x7j.c(endlessRecyclerView2);
        endlessRecyclerView2.setPager(new ma1(this, 5));
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2.setThreshold(10);
        endlessRecyclerView2.setDelegate(new os0(this.v0));
        if (zm3Var.j() > 0) {
            endlessRecyclerView2.measure(View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2.getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
        }
        return endlessRecyclerView2;
    }

    @Override // defpackage.g44
    public final void onDismiss() {
        yy7[] yy7VarArr = C0;
        yy7 yy7Var = yy7VarArr[2];
        this.Y.b(this, null);
        qt7 qt7Var = (qt7) this.o.D(this, yy7VarArr[1]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
    }

    public final hd9 y0() {
        yy7 yy7Var = C0[0];
        return (hd9) this.a.a(this);
    }

    public final EndlessRecyclerView2 z0() {
        return (EndlessRecyclerView2) this.z0.D(this, C0[3]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MembersListWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        int i = 2;
        this.a = new hs(hd9.class, "memberslist:args");
        this.b = y0().a;
        this.c = y0().b;
        this.d = y0().d;
        this.o = c7j.c();
        Object objA = yvi.a(bundle, "arg_scope_id", b1e.class);
        if (objA != null) {
            this.X = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA)).a, td9.class, null);
            this.Y = new hs(Long.class, null, "selected_member_id_for_action");
            this.Z = eo7.e;
            ld9 ld9Var = ld9.a;
            fb6 fb6Var = new fb6(this, ld9Var.a(), 4);
            this.s0 = fb6Var;
            int i2 = 7;
            b0i b0iVar = new b0i(this, ld9Var.a(), i2);
            this.t0 = b0iVar;
            b0i b0iVar2 = new b0i(this, ld9Var.a(), i2);
            this.u0 = b0iVar2;
            z71 z71Var = new z71(ld9Var.a(), 6);
            this.v0 = z71Var;
            z71 z71Var2 = new z71(ld9Var.a(), i);
            this.w0 = z71Var2;
            this.x0 = createViewModelLazy(ce9.class, new iv8(9, new de9(this, 1)));
            this.y0 = new zm3(new ym3(false, 1), b0iVar, fb6Var, b0iVar2, z71Var, z71Var2);
            this.z0 = viewBinding(z6b.c);
            return;
        }
        throw new IllegalArgumentException(ho7.i("No value passed for key arg_scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
    }
}
