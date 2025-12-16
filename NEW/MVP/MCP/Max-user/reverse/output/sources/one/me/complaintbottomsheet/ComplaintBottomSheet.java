package one.me.complaintbottomsheet;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.aw0;
import defpackage.bwf;
import defpackage.d53;
import defpackage.f3b;
import defpackage.fu2;
import defpackage.g56;
import defpackage.gk3;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.k18;
import defpackage.l38;
import defpackage.l48;
import defpackage.qq3;
import defpackage.tj3;
import defpackage.tk4;
import defpackage.tl2;
import defpackage.toc;
import defpackage.uj3;
import defpackage.vid;
import defpackage.vj3;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0010\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/complaintbottomsheet/ComplaintBottomSheet;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "parentId", "", "ids", "(Ljava/lang/Long;[J)V", "complaint-bottomsheet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ComplaintBottomSheet extends Widget implements qq3 {
    public static final /* synthetic */ yy7[] X = {new toc(ComplaintBottomSheet.class, "ids", "getIds()[J", 0), ho7.d(vid.a, ComplaintBottomSheet.class, "parentId", "getParentId()Ljava/lang/Long;", 0)};
    public final hs a;
    public final hs b;
    public final k18 c;
    public final bwf d;
    public final bwf o;

    /* JADX WARN: Multi-variable type inference failed */
    public ComplaintBottomSheet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == f3b.a) {
            return;
        }
        ((gk3) this.c.getValue()).v(i);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ActionBar.LayoutParams(-1, -1));
        frameLayout.setAlpha(0.0f);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        k18 k18Var = this.c;
        d53 d53Var = new d53(((gk3) k18Var.getValue()).x0, 12);
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(d53Var, l48VarP, l38Var), new uj3(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((gk3) k18Var.getValue()).z0, getViewLifecycleOwner().p(), l38Var), new vj3(null, this), 1), getViewLifecycleScope());
    }

    public /* synthetic */ ComplaintBottomSheet(Bundle bundle, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : bundle);
    }

    public ComplaintBottomSheet(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new hs(long[].class, "ids");
        this.b = new hs(Long.class, "parent_id");
        this.c = createViewModelLazy(gk3.class, new tl2(29, new tj3(this, 0)));
        this.d = new bwf(new fu2(17));
        this.o = new bwf(new tj3(this, 1));
    }

    public ComplaintBottomSheet(Long l, long[] jArr) {
        this(gwi.b(new imb("parent_id", l), new imb("ids", jArr)));
    }
}
