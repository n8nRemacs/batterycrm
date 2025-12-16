package one.me.sdk.contextmenu.bottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.az1;
import defpackage.bud;
import defpackage.c54;
import defpackage.d92;
import defpackage.dpg;
import defpackage.dy;
import defpackage.e44;
import defpackage.eud;
import defpackage.g6j;
import defpackage.hd5;
import defpackage.ho7;
import defpackage.hs;
import defpackage.kti;
import defpackage.q9;
import defpackage.r8j;
import defpackage.s5g;
import defpackage.t27;
import defpackage.t75;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.vid;
import defpackage.vw4;
import defpackage.x9;
import defpackage.xs0;
import defpackage.ytd;
import defpackage.yvi;
import defpackage.yy7;
import defpackage.z34;
import defpackage.z8a;
import java.util.List;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/sdk/contextmenu/bottomsheet/ContextMenuBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lz34;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "f44", "context-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ContextMenuBottomSheet extends BottomSheetWidget implements z34 {
    public static final /* synthetic */ yy7[] K0 = {new toc(ContextMenuBottomSheet.class, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), ho7.d(vid.a, ContextMenuBottomSheet.class, "anchorViewId", "getAnchorViewId()Ljava/lang/Integer;", 0), new toc(ContextMenuBottomSheet.class, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), new toc(ContextMenuBottomSheet.class, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), new toc(ContextMenuBottomSheet.class, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), new toc(ContextMenuBottomSheet.class, "parentId", "getParentId()Ljava/lang/Integer;", 0), new z8a(ContextMenuBottomSheet.class, "isCallbackSent", "isCallbackSent()Z")};
    public final hs C0;
    public final hs D0;
    public final hs E0;
    public final hs F0;
    public final hs G0;
    public final hs H0;
    public final hs I0;
    public final r8j J0;

    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuBottomSheet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        s5g s5gVar = (s5g) ((Parcelable) yvi.a(getArgs(), "header", s5g.class));
        CharSequence charSequenceB = s5gVar != null ? s5gVar.b(linearLayout.getContext()) : null;
        if (charSequenceB != null) {
            TextView textView = new TextView(linearLayout.getContext());
            dpg.d.b(textView, t75.b);
            textView.setText(charSequenceB);
            textView.setGravity(17);
            float f = 32;
            textView.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), textView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), textView.getPaddingBottom());
            tqi.c(new x9(3, null, 11), textView);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            float f2 = 16;
            layoutParams.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f2);
            layoutParams.bottomMargin = kti.d(f2 * vw4.d().getDisplayMetrics().density);
            linearLayout.addView(textView, layoutParams);
        }
        Context context = layoutInflater.getContext();
        Bundle bundle = getArgs().getBundle("actions");
        List listB = bundle != null ? g6j.b(bundle) : null;
        if (listB == null) {
            listB = hd5.a;
        }
        d92 d92Var = new d92(14, this);
        this.J0.getClass();
        linearLayout.addView(r8j.d(context, listB, d92Var));
        return linearLayout;
    }

    @Override // defpackage.z34
    public final void dismiss() {
        E0(true);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        xs0 xs0Var = new xs0(this, new e44(0, this));
        if (getRouter() != null) {
            getRouter().a(xs0Var);
        } else {
            addLifecycleListener(new q9(this, 2, xs0Var));
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        yy7[] yy7VarArr = K0;
        yy7 yy7Var = yy7VarArr[1];
        Integer num = (Integer) this.D0.a(this);
        if (num != null) {
            int iIntValue = num.intValue();
            yy7 yy7Var2 = yy7VarArr[2];
            Class cls = (Class) this.E0.a(this);
            if (cls == null) {
                return;
            }
            dy dyVar = new dy(cls, iIntValue);
            dyVar.o(this);
            t27 t27Var = new t27(dyVar);
            yy7 yy7Var3 = yy7VarArr[3];
            Rect rect = (Rect) this.F0.a(this);
            yy7 yy7Var4 = yy7VarArr[4];
            Float f = (Float) this.G0.a(this);
            yy7 yy7Var5 = yy7VarArr[5];
            t27Var.a(view, rect, f, (Integer) this.H0.a(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z34
    public final void u(Widget widget) {
        setTargetController(widget);
        c54 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        N0(widget);
        if (ytdVarE0 != null) {
            bud budVar = new bud(this, null, null, null, false, -1);
            az1.u(false, budVar, true, "BottomSheetWidget");
            ytdVarE0.H(budVar);
        }
    }

    public ContextMenuBottomSheet(Bundle bundle) {
        super(bundle);
        this.C0 = new hs(Bundle.class, null, ApiProtocol.PARAM_PAYLOAD);
        this.D0 = new hs(Integer.class, "anchor_id");
        this.E0 = new hs(Class.class, "anchor_class");
        this.F0 = new hs(Rect.class, "highlight_padding");
        this.G0 = new hs(Float.class, "highlight_radius");
        this.H0 = new hs(Integer.class, "parent_id");
        this.I0 = new hs(Boolean.class, Boolean.FALSE, "callback_sent");
        this.J0 = new r8j(16);
        boolean z = false;
        if (bundle != null) {
            BaseBottomSheetWidget.s0.getClass();
            z = bundle.getBoolean(BaseBottomSheetWidget.u0, false);
        }
        J0(z);
    }

    public /* synthetic */ ContextMenuBottomSheet(Bundle bundle, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : bundle);
    }
}
