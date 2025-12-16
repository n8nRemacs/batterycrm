package one.me.chats.picker.members;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.aw0;
import defpackage.azb;
import defpackage.b1e;
import defpackage.bzb;
import defpackage.cxb;
import defpackage.czb;
import defpackage.dxb;
import defpackage.dzb;
import defpackage.e03;
import defpackage.ezb;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.hd5;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.iqb;
import defpackage.iv8;
import defpackage.izb;
import defpackage.jxb;
import defpackage.k18;
import defpackage.l38;
import defpackage.ocg;
import defpackage.okf;
import defpackage.pb2;
import defpackage.q67;
import defpackage.r5j;
import defpackage.rb;
import defpackage.s5i;
import defpackage.sn0;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.uxb;
import defpackage.vid;
import defpackage.w63;
import defpackage.yg2;
import defpackage.yve;
import defpackage.yvi;
import defpackage.yy7;
import defpackage.yyb;
import defpackage.zyb;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"Lone/me/chats/picker/members/PickerMembersListWidget;", "Lone/me/sdk/arch/Widget;", "Lcxb;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "", ApiProtocol.PARAM_CHAT_ID, "", "decorsEnabled", "Lyg2;", "chatFilter", "isChat", "(Ljava/lang/String;JZLyg2;ZLtk4;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class PickerMembersListWidget extends Widget implements cxb {
    public static final /* synthetic */ yy7[] y0 = {new toc(PickerMembersListWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, PickerMembersListWidget.class, "decorsEnabled", "getDecorsEnabled()Z", 0), new toc(PickerMembersListWidget.class, "itemsFilter", "getItemsFilter()Lone/me/chats/list/loader/ChatFilterEnum;", 0), new toc(PickerMembersListWidget.class, "isChat", "isChat()Z", 0), new toc(PickerMembersListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public final k18 X;
    public final ExecutorService Y;
    public final dxb Z;
    public final hs a;
    public final hs b;
    public final hs c;
    public final hs d;
    public final k18 o;
    public final dxb s0;
    public final sn0 t0;
    public final sn0 u0;
    public ocg v0;
    public q67 w0;
    public okf x0;

    public PickerMembersListWidget(String str, long j, boolean z, yg2 yg2Var, boolean z2, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str)), new imb("chat_id", Long.valueOf(j)), new imb("decors_enabled", Boolean.valueOf(z)), new imb("picker.filter", yg2Var), new imb("picker.is_chat", Boolean.valueOf(z2))));
    }

    public final jxb A0() {
        return (jxb) this.o.getValue();
    }

    public final EndlessRecyclerView2 B0() {
        yy7 yy7Var = y0[4];
        return (EndlessRecyclerView2) this.u0.getValue();
    }

    @Override // defpackage.cxb
    public final void d0(yyb yybVar, boolean z) {
        jxb jxbVarA0 = A0();
        yy7[] yy7VarArr = y0;
        yy7 yy7Var = yy7VarArr[2];
        yg2 yg2Var = (yg2) this.c.a(this);
        yy7 yy7Var2 = yy7VarArr[3];
        jxbVarA0.t(yybVar, z, yg2Var, ((Boolean) this.d.a(this)).booleanValue());
    }

    @Override // defpackage.c54
    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        gw0.w(new g56(A0().t0, new bzb(2, (izb) this.X.getValue(), izb.class, "onSearch", "onSearch(Ljava/lang/String;)V", 4, 0), 1), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(B0());
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ocg ocgVar = this.v0;
        if (ocgVar != null) {
            ocgVar.b(B0());
        }
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(((izb) this.X.getValue()).X, getViewLifecycleOwner().p(), l38.d), new czb(null, this, view), 1), getViewLifecycleScope());
        gw0.w(new g56(A0().Y, new dzb(this, null), 1), getViewLifecycleScope());
        gw0.w(new g56(A0().t0, new ezb(this, null), 1), getViewLifecycleScope());
    }

    public final void y0(EndlessRecyclerView2 endlessRecyclerView2) {
        r5j r5jVar = new r5j(24, new iqb(5, this));
        okf okfVar = new okf(endlessRecyclerView2, this.Z, r5jVar);
        this.x0 = okfVar;
        endlessRecyclerView2.j(okfVar);
        q67 q67Var = new q67(r5jVar);
        this.w0 = q67Var;
        endlessRecyclerView2.j(q67Var);
        tqi.c(new rb(okfVar, null, 3), endlessRecyclerView2);
    }

    public final boolean z0() {
        yy7 yy7Var = y0[1];
        return ((Boolean) this.b.a(this)).booleanValue();
    }

    public PickerMembersListWidget(Bundle bundle) {
        hbd hbdVarC;
        pb2 pb2Var;
        super(bundle, 0, 2, null);
        this.a = new hs(Long.class, 0L, "chat_id");
        this.b = new hs(Boolean.class, Boolean.TRUE, "decors_enabled");
        this.c = new hs(yg2.class, "picker.filter");
        this.d = new hs(Boolean.class, "picker.is_chat");
        Object objA = yvi.a(bundle, Widget.ARG_SCOPE_ID, b1e.class);
        if (objA != null) {
            this.o = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA)).a, jxb.class, null);
            k18 k18VarCreateViewModelLazy = createViewModelLazy(izb.class, new iv8(25, new zyb(this, 0)));
            this.X = k18VarCreateViewModelLazy;
            ExecutorService executorServiceA = e03.a.a().a();
            this.Y = executorServiceA;
            this.Z = new dxb(this, executorServiceA, 0);
            this.s0 = new dxb(this, executorServiceA, 0);
            this.t0 = binding(new zyb(this, 1));
            this.u0 = binding(new zyb(this, 2));
            izb izbVar = (izb) k18VarCreateViewModelLazy.getValue();
            s5i s5iVar = izbVar.c;
            long j = izbVar.b;
            if (j > 0 && (pb2Var = (pb2) ((w63) izbVar.o.getValue()).j(j).a.getValue()) != null && (!pb2Var.l().isEmpty())) {
                hbdVarC = gw0.C(new uxb((hbd) s5iVar.k, izbVar, 2), izbVar.a, yve.a, hd5.a);
            } else {
                hbdVarC = (hbd) s5iVar.k;
            }
            gw0.w(new g56(hbdVarC, new azb(this, null), 1), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException(ho7.i("No value passed for key arg_key_scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
    }

    public /* synthetic */ PickerMembersListWidget(String str, long j, boolean z, yg2 yg2Var, boolean z2, int i, tk4 tk4Var) {
        this(str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? true : z, (i & 8) != 0 ? yg2.a : yg2Var, (i & 16) != 0 ? true : z2, null);
    }
}
