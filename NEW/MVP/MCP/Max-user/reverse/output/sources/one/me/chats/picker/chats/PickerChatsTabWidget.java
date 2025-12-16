package one.me.chats.picker.chats;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.b1e;
import defpackage.big;
import defpackage.bud;
import defpackage.cj0;
import defpackage.cm6;
import defpackage.dga;
import defpackage.em6;
import defpackage.eo7;
import defpackage.fyb;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hs;
import defpackage.hxb;
import defpackage.hyb;
import defpackage.i1b;
import defpackage.i40;
import defpackage.imb;
import defpackage.iv8;
import defpackage.jxb;
import defpackage.jyb;
import defpackage.k18;
import defpackage.kt3;
import defpackage.neb;
import defpackage.od6;
import defpackage.phd;
import defpackage.qc6;
import defpackage.sn0;
import defpackage.sp5;
import defpackage.tk4;
import defpackage.toc;
import defpackage.u45;
import defpackage.ue3;
import defpackage.v72;
import defpackage.vid;
import defpackage.w73;
import defpackage.xnb;
import defpackage.xu9;
import defpackage.yg2;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.zfb;
import kotlin.Metadata;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B=\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/chats/picker/chats/PickerChatsTabWidget;", "Lone/me/sdk/arch/Widget;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "", "isInMultiSelect", "Lkotlin/Function1;", "Lqqg;", "onMultiSelectToggled", "Lyg2;", "filter", "(Ljava/lang/String;ZLem6;Lyg2;Ltk4;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class PickerChatsTabWidget extends Widget {
    public static final /* synthetic */ yy7[] x0 = {new toc(PickerChatsTabWidget.class, "sharedScopeId", "getSharedScopeId-IluPPks()Ljava/lang/String;", 0), u45.h(vid.a, PickerChatsTabWidget.class, "isInMultiSelect", "isInMultiSelect()Z"), new toc(PickerChatsTabWidget.class, "itemsFilter", "getItemsFilter()Lone/me/chats/list/loader/ChatFilterEnum;", 0), new toc(PickerChatsTabWidget.class, "foldersTabs", "getFoldersTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), new toc(PickerChatsTabWidget.class, "foldersViewPager", "getFoldersViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public final sn0 X;
    public final sn0 Y;
    public final k18 Z;
    public final hs a;
    public final hs b;
    public final hs c;
    public final eo7 d;
    public final em6 o;
    public i40 s0;
    public final od6 t0;
    public final int u0;
    public final qc6 v0;
    public final big w0;

    public PickerChatsTabWidget(String str, boolean z, em6 em6Var, yg2 yg2Var, tk4 tk4Var) {
        this(gwi.b(new imb("scope.id", new b1e(str)), new imb("is_in_multiselect", Boolean.valueOf(z)), new imb("picker.filter", yg2Var)));
        this.o = em6Var;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, k18] */
    public final void A0(boolean z) {
        bud budVar;
        yy7 yy7Var = x0[1];
        this.b.b(this, Boolean.valueOf(z));
        phd adapter = z0().getAdapter();
        if (adapter != null) {
            int iJ = adapter.j();
            for (int i = 0; i < iJ; i++) {
                ytd ytdVar = (ytd) this.v0.Y.get(i);
                Object obj = (ytdVar == null || (budVar = (bud) ue3.I(ytdVar.e())) == null) ? null : budVar.a;
                PickerChatsListWidget pickerChatsListWidget = obj instanceof PickerChatsListWidget ? (PickerChatsListWidget) obj : null;
                if (pickerChatsListWidget != null) {
                    ?? r2 = pickerChatsListWidget.z0;
                    hs hsVar = pickerChatsListWidget.o;
                    yy7[] yy7VarArr = PickerChatsListWidget.A0;
                    yy7 yy7Var2 = yy7VarArr[2];
                    hsVar.b(pickerChatsListWidget, Boolean.valueOf(z));
                    yy7 yy7Var3 = yy7VarArr[2];
                    if (((Boolean) hsVar.a(pickerChatsListWidget)).booleanValue()) {
                        pickerChatsListWidget.C0().j((w73) r2.getValue());
                    } else {
                        pickerChatsListWidget.C0().p0((w73) r2.getValue());
                    }
                }
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getD() {
        return this.d;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        neb nebVarY0 = y0();
        kt3 kt3Var = new kt3(0, -2);
        kt3Var.i = 0;
        kt3Var.e = 0;
        kt3Var.h = 0;
        constraintLayout.addView(nebVarY0, kt3Var);
        ViewPager2 viewPager2Z0 = z0();
        kt3 kt3Var2 = new kt3(0, 0);
        kt3Var2.j = i1b.e;
        kt3Var2.l = 0;
        kt3Var2.e = 0;
        kt3Var2.h = 0;
        constraintLayout.addView(viewPager2Z0, kt3Var2);
        return constraintLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        i40 i40Var = this.s0;
        if (i40Var != null) {
            i40Var.c();
        }
        this.s0 = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ViewPager2 viewPager2Z0 = z0();
        qc6 qc6Var = this.v0;
        viewPager2Z0.setAdapter(qc6Var);
        z0().setOffscreenPageLimit(this.u0);
        i40 i40VarA = this.t0.a(y0(), z0(), new dga(22), new cj0(27));
        i40VarA.a();
        this.s0 = i40VarA;
        View childAt = z0().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        if (qc6Var.y0.size() > 0) {
            z0().e(0, false);
            z0().measure(View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
        }
        gw0.w(new g56(gw0.m(new xnb(((jxb) this.Z.getValue()).t0, 3)), new jyb(this, null), 1), getViewLifecycleScope());
    }

    public final neb y0() {
        yy7 yy7Var = x0[3];
        return (neb) this.X.getValue();
    }

    public final ViewPager2 z0() {
        yy7 yy7Var = x0[4];
        return (ViewPager2) this.Y.getValue();
    }

    public PickerChatsTabWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        hs hsVar = new hs(b1e.class, "scope.id");
        this.a = hsVar;
        this.b = new hs(Boolean.class, Boolean.TRUE, "is_in_multiselect");
        this.c = new hs(yg2.class, "picker.filter");
        this.d = eo7.e;
        final int i = 0;
        this.X = binding(new cm6(this) { // from class: gyb
            public final /* synthetic */ PickerChatsTabWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                PickerChatsTabWidget pickerChatsTabWidget = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = PickerChatsTabWidget.x0;
                        neb nebVar = new neb(pickerChatsTabWidget.getContext(), 0);
                        nebVar.setId(i1b.e);
                        nebVar.setTabMode(0);
                        return nebVar;
                    default:
                        yy7[] yy7VarArr2 = PickerChatsTabWidget.x0;
                        ViewPager2 viewPager2 = new ViewPager2(pickerChatsTabWidget.getContext());
                        viewPager2.setId(i1b.d);
                        lqi.b(viewPager2);
                        return viewPager2;
                }
            }
        });
        final int i2 = 1;
        this.Y = binding(new cm6(this) { // from class: gyb
            public final /* synthetic */ PickerChatsTabWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                PickerChatsTabWidget pickerChatsTabWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = PickerChatsTabWidget.x0;
                        neb nebVar = new neb(pickerChatsTabWidget.getContext(), 0);
                        nebVar.setId(i1b.e);
                        nebVar.setTabMode(0);
                        return nebVar;
                    default:
                        yy7[] yy7VarArr2 = PickerChatsTabWidget.x0;
                        ViewPager2 viewPager2 = new ViewPager2(pickerChatsTabWidget.getContext());
                        viewPager2.setId(i1b.d);
                        lqi.b(viewPager2);
                        return viewPager2;
                }
            }
        });
        yy7 yy7Var = x0[0];
        this.Z = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, jxb.class, null);
        k18 k18VarCreateViewModelLazy = createViewModelLazy(fyb.class, new iv8(22, new zfb(14)));
        this.t0 = new od6(6, null);
        this.u0 = 3;
        b bVar = new b();
        bVar.setMaxRecycledViews(hxb.a, 30);
        this.v0 = new qc6(this, bVar, new xu9(13, this));
        big bigVar = new big();
        bigVar.R(new v72());
        bigVar.R(new sp5());
        bigVar.U(0);
        bigVar.I(150L);
        this.w0 = bigVar;
        gw0.w(new g56(((fyb) k18VarCreateViewModelLazy.getValue()).b, new hyb(this, null), 1), getLifecycleScope());
    }

    public /* synthetic */ PickerChatsTabWidget(String str, boolean z, em6 em6Var, yg2 yg2Var, int i, tk4 tk4Var) {
        this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : em6Var, (i & 8) != 0 ? yg2.a : yg2Var, null);
    }
}
