package one.me.calls.ui.bottomsheet.more;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a93;
import defpackage.ao6;
import defpackage.aw0;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.g31;
import defpackage.g56;
import defpackage.gm1;
import defpackage.gn1;
import defpackage.gu5;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hd5;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.in1;
import defpackage.ipi;
import defpackage.j0b;
import defpackage.k18;
import defpackage.kg1;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.lg1;
import defpackage.m01;
import defpackage.m3;
import defpackage.md1;
import defpackage.mg1;
import defpackage.n01;
import defpackage.ng1;
import defpackage.nmb;
import defpackage.o98;
import defpackage.og1;
import defpackage.pb3;
import defpackage.pe8;
import defpackage.pg1;
import defpackage.q;
import defpackage.r41;
import defpackage.rt5;
import defpackage.tg1;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u74;
import defpackage.v11;
import defpackage.vc1;
import defpackage.ve3;
import defpackage.vfh;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wo1;
import defpackage.x3;
import defpackage.yeb;
import defpackage.yy7;
import defpackage.z01;
import defpackage.zfd;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import ru.ok.android.externcalls.sdk.Conversation;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/more/CallMoreBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "Llg1;", "type", "(Ljava/lang/String;Llg1;Ltk4;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallMoreBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ yy7[] C0 = {new toc(CallMoreBottomSheet.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), ho7.d(vid.a, CallMoreBottomSheet.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final Object A0;
    public final kg1 B0;
    public final k18 w0;
    public final k18 x0;
    public final bbd y0;
    public final Object z0;

    public CallMoreBottomSheet(String str, lg1 lg1Var, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str)), new imb("open_type", lg1Var.name())));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final yeb C0() {
        return a93.s0.z(getContext()).c;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void K0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View frameLayout2 = new FrameLayout(linearLayout.getContext());
        frameLayout2.setId(j0b.r0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(kti.d(36 * vw4.d().getDisplayMetrics().density), kti.d(5 * vw4.d().getDisplayMetrics().density));
        layoutParams2.gravity = 49;
        float f = 12;
        layoutParams2.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams2.bottomMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
        frameLayout2.setLayoutParams(layoutParams2);
        frameLayout2.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 40.0f));
        frameLayout2.setBackgroundColor(a93.s0.B(frameLayout2).c.getIcon().h);
        linearLayout.addView(frameLayout2);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(j0b.p0);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.B0);
        recyclerView.setItemAnimator(null);
        recyclerView.j(new m01(0));
        linearLayout.addView(recyclerView);
        tqi.c(new pg1(3, null, 0), linearLayout);
        frameLayout.addView(linearLayout);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onDestroyView(View view) {
        ((RecyclerView) this.y0.D(this, C0[1])).setAdapter(null);
        ((r41) this.A0.getValue()).a.b();
        ((zfd) this.z0.getValue()).a.clear();
        super.onDestroyView(view);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, x26] */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        List listA;
        Conversation conversationA;
        k18 k18Var = this.x0;
        tg1 tg1Var = (tg1) k18Var.getValue();
        wo1 wo1Var = tg1Var.c;
        k18 k18Var2 = tg1Var.Y;
        vc1 vc1Var = (vc1) wo1Var.A0.a.getValue();
        int iOrdinal = tg1Var.b.ordinal();
        if (iOrdinal == 0) {
            listA = hd5.a;
        } else if (iOrdinal == 1) {
            boolean z = vc1Var.g;
            in1 in1Var = vc1Var.i;
            if (z) {
                n01 n01Var = nmb.a;
                gn1 gn1Var = vc1Var.j;
                boolean zIsMeCreatorOrAdmin = (!((gu5) ((rt5) tg1Var.X.getValue())).t() || (conversationA = ((v11) ((z01) tg1Var.o.getValue())).d().a()) == null) ? false : conversationA.isMeCreatorOrAdmin();
                boolean zBooleanValue = ((Boolean) wo1Var.z0.getValue()).booleanValue();
                boolean z2 = vc1Var.l;
                vfh vfhVar = (vfh) wo1Var.M0.a.getValue();
                boolean zBooleanValue2 = ((Boolean) wo1Var.y0.getValue()).booleanValue();
                boolean zM = ((pe8) ((pb3) k18Var2.getValue())).M();
                o98 o98VarD = ve3.d();
                boolean z3 = !z2 || in1Var.a();
                vfh vfhVar2 = vfh.c;
                if (vfhVar == vfhVar2 && z3) {
                    o98VarD.add(nmb.n);
                } else if (vfhVar == vfhVar2) {
                    o98VarD.add(nmb.m);
                } else {
                    vfh vfhVar3 = vfh.a;
                    if (vfhVar == vfhVar3 && z3) {
                        o98VarD.add(nmb.l);
                    } else if (vfhVar == vfhVar3) {
                        o98VarD.add(nmb.k);
                    }
                }
                if (zBooleanValue2) {
                    o98VarD.add(nmb.q);
                }
                nmb.a(o98VarD, in1Var);
                if (zBooleanValue) {
                    o98VarD.addAll(nmb.b(gn1Var));
                }
                if (zIsMeCreatorOrAdmin) {
                    o98VarD.add(nmb.p);
                }
                if (zM) {
                    o98VarD.add(nmb.o);
                }
                listA = ve3.a(o98VarD);
            } else {
                n01 n01Var2 = nmb.a;
                boolean zBooleanValue3 = ((Boolean) ((md1) wo1Var.c.m).s0.a.getValue()).booleanValue();
                boolean zM2 = ((pe8) ((pb3) k18Var2.getValue())).M();
                o98 o98VarD2 = ve3.d();
                if (zBooleanValue3) {
                    o98VarD2.add(nmb.c);
                }
                nmb.a(o98VarD2, in1Var);
                o98VarD2.add(nmb.b);
                o98VarD2.add(nmb.a);
                if (zM2) {
                    o98VarD2.add(nmb.o);
                }
                listA = ve3.a(o98VarD2);
            }
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            n01 n01Var3 = nmb.a;
            listA = nmb.b(vc1Var.j);
        }
        this.B0.E(listA);
        x3 x3Var = ((tg1) k18Var.getValue()).u0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(x3Var, l48VarP, l38Var), new mg1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((tg1) k18Var.getValue()).c.N0, getViewLifecycleOwner().p(), l38Var), new ng1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((tg1) k18Var.getValue()).v0, getViewLifecycleOwner().p(), l38Var), new og1(null, this), 1), getViewLifecycleScope());
    }

    public CallMoreBottomSheet(Bundle bundle) {
        super(bundle);
        hs hsVar = new hs(b1e.class, new b1e("default"), Widget.ARG_SCOPE_ID);
        yy7 yy7Var = C0[0];
        this.w0 = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, wo1.class, null);
        this.x0 = createViewModelLazy(tg1.class, new q(18, new m3(bundle, this, 16)));
        this.y0 = viewBinding(j0b.p0);
        k18 k18VarB = ipi.b(3, new g31(16));
        this.z0 = k18VarB;
        k18 k18VarB2 = ipi.b(3, new g31(17));
        this.A0 = k18VarB2;
        this.B0 = new kg1(new ao6(6, this), (zfd) k18VarB.getValue(), (r41) k18VarB2.getValue(), gm1.a.b().a());
    }
}
