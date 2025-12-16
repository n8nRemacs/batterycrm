package one.me.keyboardmedia.emoji;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b0i;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.e91;
import defpackage.fb5;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h62;
import defpackage.ho7;
import defpackage.i77;
import defpackage.imb;
import defpackage.jx0;
import defpackage.k18;
import defpackage.kti;
import defpackage.mz7;
import defpackage.nz7;
import defpackage.oz7;
import defpackage.pz7;
import defpackage.qz7;
import defpackage.t09;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.uc5;
import defpackage.vid;
import defpackage.vw4;
import defpackage.w5b;
import defpackage.wu7;
import defpackage.x6i;
import defpackage.y03;
import defpackage.yo3;
import defpackage.yvi;
import defpackage.yy7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/keyboardmedia/emoji/KeyboardEmojiWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "(Ljava/lang/String;Ltk4;)V", "keyboard-media_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeyboardEmojiWidget extends Widget {
    public static final /* synthetic */ yy7[] Z = {new toc(KeyboardEmojiWidget.class, "contentRecyclerView", "getContentRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), ho7.d(vid.a, KeyboardEmojiWidget.class, "tabsRecyclerView", "getTabsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final y03 X;
    public final h62 Y;
    public final k18 a;
    public final k18 b;
    public final bbd c;
    public final bbd d;
    public final b0i o;

    public KeyboardEmojiWidget(String str, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str))));
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(w5b.b);
        int iD = kti.d(44 * vw4.d().getDisplayMetrics().density);
        Continuation continuation = null;
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), null);
        recyclerView.setId(w5b.d);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, iD));
        int iD2 = kti.d(4 * vw4.d().getDisplayMetrics().density);
        int iD3 = kti.d(8 * vw4.d().getDisplayMetrics().density);
        recyclerView.setPadding(iD3, iD2, iD3, iD2);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        int i = 3;
        tqi.c(new pz7(i, continuation, 0), recyclerView);
        frameLayout.addView(recyclerView);
        RecyclerView recyclerView2 = new RecyclerView(frameLayout.getContext(), null);
        recyclerView2.setId(w5b.c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = iD;
        recyclerView2.setLayoutParams(layoutParams);
        tqi.c(new pz7(i, continuation, 1), recyclerView2);
        recyclerView2.setClipToPadding(false);
        recyclerView2.setClipChildren(false);
        recyclerView2.setItemAnimator(null);
        int iD4 = kti.d(12 * vw4.d().getDisplayMetrics().density);
        recyclerView2.setPadding(iD4, recyclerView2.getPaddingTop(), iD4, kti.d(48 * vw4.d().getDisplayMetrics().density));
        frameLayout.addView(recyclerView2);
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        y0().setAdapter(null);
        y0().s0(this.Y);
        z0().setAdapter(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        z0().setAdapter(this.X);
        z0().j(new e91(kti.d(2 * vw4.d().getDisplayMetrics().density), 3));
        RecyclerView recyclerViewY0 = y0();
        int iD = kti.d(32 * vw4.d().getDisplayMetrics().density);
        int iD2 = kti.d(12 * vw4.d().getDisplayMetrics().density);
        int iD3 = kti.d(11 * vw4.d().getDisplayMetrics().density);
        int i = (recyclerViewY0.getContext().getResources().getDisplayMetrics().widthPixels - (iD2 * 2)) / (iD + iD3);
        if (i < 1) {
            i = 1;
        }
        oz7 oz7Var = new oz7(this, recyclerViewY0);
        recyclerViewY0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i);
        gridLayoutManager.K = oz7Var;
        recyclerViewY0.setLayoutManager(gridLayoutManager);
        recyclerViewY0.m(this.Y);
        recyclerViewY0.j(new fb5(i, iD3, 0));
        recyclerViewY0.setAdapter(this.o);
        gw0.w(new g56(((uc5) this.a.getValue()).Y, new qz7(this, null), 1), getViewLifecycleScope());
    }

    public final RecyclerView y0() {
        return (RecyclerView) this.c.D(this, Z[0]);
    }

    public final RecyclerView z0() {
        return (RecyclerView) this.d.D(this, Z[1]);
    }

    public KeyboardEmojiWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        k18 k18VarCreateViewModelLazy = createViewModelLazy(uc5.class, new yo3(23, new i77(26)));
        this.a = k18VarCreateViewModelLazy;
        Object objA = yvi.a(bundle, Widget.ARG_SCOPE_ID, b1e.class);
        if (objA != null) {
            this.b = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA)).a, t09.class, null);
            this.c = viewBinding(w5b.c);
            this.d = viewBinding(w5b.d);
            mz7 mz7Var = mz7.a;
            b0i b0iVar = new b0i(((g4b) mz7Var.getAccessor().c(56)).a(), new x6i(20, this), 4);
            this.o = b0iVar;
            this.X = new y03(((g4b) mz7Var.getAccessor().c(56)).a(), new wu7(1, this));
            this.Y = new h62(b0iVar, new jx0(1, (uc5) k18VarCreateViewModelLazy.getValue(), uc5.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/sdk/lists/adapter/ListItem;)V", 0, 23));
            gw0.w(new g56(((uc5) k18VarCreateViewModelLazy.getValue()).t0, new nz7(this, null), 1), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException(ho7.i("No value passed for key arg_key_scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
    }
}
