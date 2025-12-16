package one.me.devmenu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.az1;
import defpackage.bbd;
import defpackage.bud;
import defpackage.c54;
import defpackage.cpi;
import defpackage.dj3;
import defpackage.ed8;
import defpackage.efe;
import defpackage.eud;
import defpackage.f5e;
import defpackage.fbb;
import defpackage.g56;
import defpackage.gw0;
import defpackage.hd5;
import defpackage.imb;
import defpackage.iv4;
import defpackage.joe;
import defpackage.koe;
import defpackage.kti;
import defpackage.myc;
import defpackage.myg;
import defpackage.pfe;
import defpackage.pg1;
import defpackage.qk;
import defpackage.s65;
import defpackage.s7c;
import defpackage.su4;
import defpackage.tcf;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ucf;
import defpackage.ue3;
import defpackage.v9j;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wu4;
import defpackage.y65;
import defpackage.y83;
import defpackage.yg4;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.z71;
import defpackage.zs0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.devmenu.utils.LongValueBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.sections.SectionRecyclerWidget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/devmenu/DevMenuFeatureTogglesPageScreen;", "Lone/me/sdk/sections/SectionRecyclerWidget;", "Ljoe;", "Lmyg;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class DevMenuFeatureTogglesPageScreen extends SectionRecyclerWidget implements joe, myg {
    public static final /* synthetic */ yy7[] t0;
    public final z71 X;
    public final List Y;
    public final tcf Z;
    public final bbd d = viewBinding(myc.oneme_devmenu_screen_toggles_search_view);
    public final koe o;
    public List s0;

    static {
        toc tocVar = new toc(DevMenuFeatureTogglesPageScreen.class, "searchView", "getSearchView()Lone/me/sdk/uikit/common/search/OneMeSearchView;", 0);
        vid.a.getClass();
        t0 = new yy7[]{tocVar};
    }

    public DevMenuFeatureTogglesPageScreen() {
        ForkJoinPool forkJoinPoolCommonPool = ForkJoinPool.commonPool();
        this.o = new koe(this, forkJoinPoolCommonPool);
        this.X = new z71(forkJoinPoolCommonPool, 5);
        this.Y = su4.a.getAccessor().a(2);
        this.Z = ucf.a("");
        this.s0 = hd5.a;
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* renamed from: A0, reason: from getter */
    public final koe getO() {
        return this.o;
    }

    @Override // defpackage.myg
    public final void G(long j, String str) {
        Object next;
        List<iv4> list = this.Y;
        if (list == null || !list.isEmpty()) {
            for (iv4 iv4Var : list) {
                Iterator it = ((Iterable) iv4Var.b().getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((yg4) next).a == j) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                yg4 yg4Var = (yg4) next;
                if (yg4Var != null) {
                    iv4Var.c(yg4Var, str);
                    return;
                }
            }
        }
    }

    @Override // defpackage.joe
    public final void e0(long j, boolean z) {
        Object next;
        List<iv4> list = this.Y;
        if (list == null || !list.isEmpty()) {
            for (iv4 iv4Var : list) {
                Iterator it = ((Iterable) iv4Var.b().getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((yg4) next).a == j) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                yg4 yg4Var = (yg4) next;
                if (yg4Var != null) {
                    iv4Var.d(yg4Var);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.joe
    public final void h(long j) {
        Object next;
        List<iv4> list = this.Y;
        if (list == null || !list.isEmpty()) {
            for (iv4 iv4Var : list) {
                Iterator it = ((Iterable) iv4Var.b().getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((yg4) next).a == j) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                yg4 yg4Var = (yg4) next;
                if (yg4Var != null) {
                    if (!(iv4Var instanceof pfe)) {
                        iv4Var.d(yg4Var);
                        return;
                    }
                    yy7[] yy7VarArr = BottomSheetWidget.B0;
                    pfe pfeVar = (pfe) iv4Var;
                    LongValueBottomSheet longValueBottomSheet = new LongValueBottomSheet(((f5e) pfeVar.e.getValue()).k(pfeVar.a, pfeVar.b), yg4Var.a, pfeVar.c);
                    longValueBottomSheet.setTargetController(this);
                    c54 parentController = this;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                    ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                    longValueBottomSheet.N0(this);
                    if (ytdVarE0 != null) {
                        bud budVar = new bud(longValueBottomSheet, null, null, null, false, -1);
                        az1.u(false, budVar, true, "BottomSheetWidget");
                        ytdVarE0.H(budVar);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        fbb fbbVar = new fbb(layoutInflater.getContext());
        fbbVar.setId(myc.oneme_devmenu_screen_toggles_search_view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, kti.d(0 * vw4.d().getDisplayMetrics().density), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(8 * vw4.d().getDisplayMetrics().density));
        fbbVar.setLayoutParams(layoutParams);
        fbbVar.setExpandable(true);
        fbbVar.setCollapsible(false);
        fbbVar.c(false);
        fbbVar.setShouldShowSearchIcon(false);
        fbbVar.setSearchHint("Поиск");
        fbbVar.setListener(new s7c(this, fbbVar));
        linearLayout.addView(fbbVar);
        linearLayout.addView(B0(16));
        tqi.c(new pg1(3, null, 1), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        cpi.c((fbb) this.d.D(this, t0[0]));
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.Y) {
            iv4 iv4Var = (iv4) obj;
            if ((iv4Var instanceof ed8) || (iv4Var instanceof efe) || (iv4Var instanceof pfe)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.s0 = ue3.X(arrayList2, new dj3(4, new qk(9, this)));
                int i = s65.d;
                gw0.w(new g56(new y83(zs0.g(this.Z, v9j.h(100, y65.MILLISECONDS)), 4, this), new wu4(this, null), 1), getViewLifecycleScope());
                return;
            } else {
                iv4 iv4Var2 = (iv4) it.next();
                yg4 yg4Var = (yg4) ue3.I((List) iv4Var2.b().getValue());
                imb imbVar = yg4Var != null ? new imb(yg4Var, iv4Var2) : null;
                if (imbVar != null) {
                    arrayList2.add(imbVar);
                }
            }
        }
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* renamed from: y0, reason: from getter */
    public final z71 getX() {
        return this.X;
    }
}
