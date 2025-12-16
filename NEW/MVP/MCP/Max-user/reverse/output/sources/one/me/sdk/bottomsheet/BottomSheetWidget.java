package one.me.sdk.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.c54;
import defpackage.eud;
import defpackage.hs;
import defpackage.kti;
import defpackage.o54;
import defpackage.r35;
import defpackage.tk4;
import defpackage.u45;
import defpackage.vid;
import defpackage.vw4;
import defpackage.ws0;
import defpackage.xs0;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.z8a;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BottomSheetWidget extends BaseBottomSheetWidget {
    public static final /* synthetic */ yy7[] B0;
    public final o54 A0;
    public final boolean w0;
    public r35 x0;
    public View y0;
    public final hs z0;

    static {
        z8a z8aVar = new z8a(BottomSheetWidget.class, "wasKeyboardOpened", "getWasKeyboardOpened()Z");
        vid.a.getClass();
        B0 = new yy7[]{z8aVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetWidget() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void K0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        float f = 12;
        frameLayout.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(10 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(15 * vw4.d().getDisplayMetrics().density));
        frameLayout.addView(L0(layoutInflater, frameLayout), new ViewGroup.LayoutParams(-1, -2));
        if (G0()) {
            r35 r35Var = new r35(frameLayout.getContext());
            r35Var.setTranslationY(u45.c(6, vw4.d().getDisplayMetrics().density, -r7));
            this.x0 = r35Var;
            frameLayout.addView(r35Var);
        }
    }

    public abstract View L0(LayoutInflater layoutInflater, FrameLayout frameLayout);

    /* renamed from: M0, reason: from getter */
    public boolean getH0() {
        return this.w0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N0(Widget widget) {
        c54 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarG0 = eudVar != null ? ((RootController) eudVar).G0() : null;
        if (ytdVarG0 == null) {
            return;
        }
        ytdVarG0.a(new xs0(ytdVarG0, this));
    }

    @Override // defpackage.c54
    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        getRouter().a(this.A0);
    }

    @Override // defpackage.c54
    public final void onContextUnavailable() {
        super.onContextUnavailable();
        getRouter().L(this.A0);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public void onDestroyView(View view) {
        this.x0 = null;
        super.onDestroyView(view);
    }

    public BottomSheetWidget(Bundle bundle) {
        super(bundle);
        this.w0 = true;
        this.z0 = new hs(Boolean.class, Boolean.FALSE, "was_keyboard_opened");
        this.A0 = new o54(getInstanceId(), new ws0(this, 0), new ws0(this, 1));
    }

    public /* synthetic */ BottomSheetWidget(Bundle bundle, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : bundle);
    }
}
