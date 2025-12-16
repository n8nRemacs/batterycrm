package one.me.stickerspreview.set;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a08;
import defpackage.aif;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.bzb;
import defpackage.eo7;
import defpackage.f8j;
import defpackage.fb5;
import defpackage.fb6;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gt;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hfd;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i6c;
import defpackage.imb;
import defpackage.k18;
import defpackage.kti;
import defpackage.mgb;
import defpackage.off;
import defpackage.pdb;
import defpackage.prd;
import defpackage.qk8;
import defpackage.r35;
import defpackage.sn0;
import defpackage.tk4;
import defpackage.toc;
import defpackage.u45;
import defpackage.uff;
import defpackage.vff;
import defpackage.vgf;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wff;
import defpackage.yfb;
import defpackage.yvi;
import defpackage.yy7;
import defpackage.zn6;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.stickerspreview.StickerPreviewScreen;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/stickerspreview/set/StickerSetBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "(Ljava/lang/String;Ltk4;)V", "vff", "stickers-preview_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class StickerSetBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ yy7[] E0 = {new toc(StickerSetBottomSheet.class, "stickerId", "getStickerId()J", 0), ho7.d(vid.a, StickerSetBottomSheet.class, "headerView", "getHeaderView()Lone/me/sdk/stickers/set/StickersSetHeaderView;", 0), new toc(StickerSetBottomSheet.class, "stickerSetRecycler", "getStickerSetRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new toc(StickerSetBottomSheet.class, "loadingView", "getLoadingView()Landroid/view/View;", 0)};
    public final bbd A0;
    public final fb6 B0;
    public final int C0;
    public final sn0 D0;
    public final k18 w0;
    public final hs x0;
    public qk8 y0;
    public final bbd z0;

    public StickerSetBottomSheet(String str, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str))));
    }

    public static final int L0(StickerSetBottomSheet stickerSetBottomSheet) {
        Object parentController = stickerSetBottomSheet.getParentController();
        vff vffVar = parentController instanceof vff ? (vff) parentController : null;
        if (vffVar == null) {
            return 0;
        }
        StickerPreviewScreen stickerPreviewScreen = (StickerPreviewScreen) vffVar;
        bbd bbdVar = stickerPreviewScreen.Z;
        yy7[] yy7VarArr = StickerPreviewScreen.z0;
        return ((ViewGroup) stickerPreviewScreen.s0.D(stickerPreviewScreen, yy7VarArr[4])).getMeasuredHeight() + ((yfb) bbdVar.D(stickerPreviewScreen, yy7VarArr[3])).getBottom();
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* renamed from: A0 */
    public final eo7 getE0() {
        eo7 eo7Var = eo7.e;
        return eo7.e;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void F0() {
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void K0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        float f = 10;
        float f2 = 12;
        frameLayout.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f2 * vw4.d().getDisplayMetrics().density), 0);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        aif aifVar = new aif(linearLayout.getContext());
        aifVar.setId(pdb.j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
        float f3 = 4;
        layoutParams.bottomMargin = kti.d(vw4.d().getDisplayMetrics().density * f3);
        aifVar.setLayoutParams(layoutParams);
        f8j.d(aifVar.getHeaderButton(), 300L, new uff(this, 1));
        linearLayout.addView(aifVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(pdb.i);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int iB = gt.b(recyclerView.getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(iB));
        recyclerView.j(new fb5(iB, kti.d(f3 * vw4.d().getDisplayMetrics().density), 6));
        recyclerView.k(new a08(2, this));
        recyclerView.setAdapter(this.B0);
        mgb.a(recyclerView, new zn6(recyclerView, recyclerView, this));
        linearLayout.addView(recyclerView);
        yy7 yy7Var = E0[3];
        linearLayout.addView((View) this.D0.getValue());
        frameLayout.addView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        View r35Var = new r35(frameLayout.getContext());
        r35Var.setTranslationY(u45.c(6, vw4.d().getDisplayMetrics().density, -r10));
        frameLayout.addView(r35Var);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final boolean handleBack() {
        return false;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onAttach(View view) {
        off offVar = (off) this.w0.getValue();
        yy7 yy7Var = E0[0];
        offVar.u(Long.valueOf(((Number) this.x0.a(this)).longValue()));
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        f8j.d(view, 300L, new uff(this, 0));
        gw0.w(new g56(((off) this.w0.getValue()).A0, new bzb(2, this, StickerSetBottomSheet.class, "handleStickerSet", "handleStickerSet(Lone/me/sdk/stickers/model/StickerSetModel;)V", 4, 15), 1), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final i6c z0() {
        return new wff(this);
    }

    public StickerSetBottomSheet(Bundle bundle) {
        super(bundle);
        Object objA = yvi.a(bundle, Widget.ARG_SCOPE_ID, b1e.class);
        if (objA != null) {
            this.w0 = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA)).a, off.class, null);
            this.x0 = new hs(Long.class, 0L, "arg_key_sticker_id");
            this.z0 = viewBinding(pdb.j);
            this.A0 = viewBinding(pdb.i);
            this.B0 = new fb6(((g4b) vgf.a.getAccessor().c(56)).a(), new hfd(6, this));
            this.C0 = kti.d(183 * vw4.d().getDisplayMetrics().density);
            this.D0 = binding(new prd(24, this));
            J0(false);
            return;
        }
        throw new IllegalArgumentException(ho7.i("No value passed for key arg_key_scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
    }
}
