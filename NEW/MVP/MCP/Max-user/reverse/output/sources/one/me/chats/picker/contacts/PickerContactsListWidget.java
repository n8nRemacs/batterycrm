package one.me.chats.picker.contacts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.aw0;
import defpackage.b14;
import defpackage.b1e;
import defpackage.cxb;
import defpackage.dxb;
import defpackage.e03;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.iv8;
import defpackage.ji0;
import defpackage.jxb;
import defpackage.k18;
import defpackage.l38;
import defpackage.mvd;
import defpackage.nyb;
import defpackage.ocg;
import defpackage.okf;
import defpackage.oyb;
import defpackage.pyb;
import defpackage.q67;
import defpackage.qsb;
import defpackage.r5j;
import defpackage.rb;
import defpackage.ryb;
import defpackage.s2i;
import defpackage.s3;
import defpackage.sn0;
import defpackage.syb;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.vid;
import defpackage.wrb;
import defpackage.wyb;
import defpackage.x0h;
import defpackage.y9b;
import defpackage.yg2;
import defpackage.ym3;
import defpackage.yvi;
import defpackage.yy7;
import defpackage.yyb;
import defpackage.z41;
import defpackage.zfb;
import defpackage.zh0;
import defpackage.zm3;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/chats/picker/contacts/PickerContactsListWidget;", "Lone/me/sdk/arch/Widget;", "Lcxb;", "", "Lb14;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "Lyg2;", "filter", "(Ljava/lang/String;Lyg2;Ltk4;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class PickerContactsListWidget extends Widget implements cxb, b14 {
    public static final /* synthetic */ yy7[] y0 = {new toc(PickerContactsListWidget.class, "itemsFilter", "getItemsFilter()Lone/me/chats/list/loader/ChatFilterEnum;", 0), ho7.d(vid.a, PickerContactsListWidget.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final dxb X;
    public final dxb Y;
    public final ji0 Z;
    public final hs a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final ExecutorService o;
    public final zm3 s0;
    public final sn0 t0;
    public final sn0 u0;
    public ocg v0;
    public q67 w0;
    public okf x0;

    public PickerContactsListWidget(String str, yg2 yg2Var, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str)), new imb("picker.filter", yg2Var)));
    }

    @Override // defpackage.b14
    public final void A(int i) {
        x();
    }

    public final RecyclerView A0() {
        yy7 yy7Var = y0[1];
        return (RecyclerView) this.u0.getValue();
    }

    @Override // defpackage.cxb
    public final void d0(yyb yybVar, boolean z) {
        jxb jxbVarZ0 = z0();
        yy7 yy7Var = y0[0];
        jxbVarZ0.t(yybVar, z, (yg2) this.a.a(this), true);
    }

    @Override // defpackage.c54
    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        gw0.w(new g56(z0().t0, new x0h(2, (wyb) this.c.getValue(), wyb.class, "onSearch", "onSearch(Ljava/lang/String;)V", 4, 1), 1), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(A0());
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ocg ocgVar = this.v0;
        if (ocgVar != null) {
            ocgVar.b(A0());
        }
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        super.onDestroyView(view);
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            qsb qsbVar = (qsb) this.d.getValue();
            s2i s2iVar = new s2i(this, 1);
            String[] strArr2 = qsb.e;
            int i2 = mvd.a1;
            int i3 = mvd.b1;
            wrb wrbVar = new wrb(y9b.e);
            qsbVar.getClass();
            qsb.r(s2iVar, strArr, iArr, strArr2, i2, i3, wrbVar);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(((wyb) this.c.getValue()).o, getViewLifecycleOwner().p(), l38.d), new pyb(null, this, view), 1), getViewLifecycleScope());
        gw0.w(new g56(z0().Y, new ryb(this, null), 1), getViewLifecycleScope());
        gw0.w(new g56(z0().t0, new syb(this, null), 1), getViewLifecycleScope());
    }

    @Override // defpackage.b14
    public final void x() {
        ((qsb) this.d.getValue()).j(new s2i(this, 1), qsb.e, 156);
    }

    public final void y0(RecyclerView recyclerView) {
        r5j r5jVar = new r5j(24, new nyb(this, 0));
        okf okfVar = new okf(recyclerView, this.s0, r5jVar);
        this.x0 = okfVar;
        recyclerView.j(okfVar);
        q67 q67Var = new q67(r5jVar);
        this.w0 = q67Var;
        recyclerView.j(q67Var);
        tqi.c(new rb(okfVar, null, 2), recyclerView);
    }

    public final jxb z0() {
        return (jxb) this.b.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public PickerContactsListWidget(Bundle bundle) {
        int i = 0;
        int i2 = 2;
        Object[] objArr = 0;
        super(bundle, i, i2, null);
        this.a = new hs(yg2.class, "picker.filter");
        Object objA = yvi.a(bundle, Widget.ARG_SCOPE_ID, b1e.class);
        if (objA != null) {
            this.b = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA)).a, jxb.class, null);
            int i3 = 23;
            k18 k18VarCreateViewModelLazy = createViewModelLazy(wyb.class, new iv8(i3, new oyb(this, i)));
            this.c = k18VarCreateViewModelLazy;
            k18 k18VarCreateViewModelLazy2 = createViewModelLazy(zh0.class, new iv8(24, new zfb(15)));
            e03 e03Var = e03.a;
            this.d = e03Var.getAccessor().d(10);
            ExecutorService executorServiceA = e03Var.a().a();
            this.o = executorServiceA;
            dxb dxbVar = new dxb(this, executorServiceA, 48);
            this.X = dxbVar;
            this.Y = new dxb(this, executorServiceA, 48);
            ji0 ji0Var = new ji0(this, executorServiceA);
            this.Z = ji0Var;
            this.s0 = new zm3(new ym3(false, 1), ji0Var, dxbVar);
            this.t0 = binding(new oyb(this, 1));
            this.u0 = binding(new oyb(this, i2));
            gw0.w(new z41(((wyb) k18VarCreateViewModelLazy.getValue()).c, ((zh0) k18VarCreateViewModelLazy2.getValue()).Z, new s3(this, objArr == true ? 1 : 0, i3), 3), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException(ho7.i("No value passed for key arg_key_scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
    }

    public /* synthetic */ PickerContactsListWidget(String str, yg2 yg2Var, int i, tk4 tk4Var) {
        this(str, (i & 2) != 0 ? yg2.a : yg2Var, null);
    }
}
