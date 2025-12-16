package one.me.sdk.contextmenu.popup;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a93;
import defpackage.az1;
import defpackage.bbd;
import defpackage.bud;
import defpackage.c54;
import defpackage.dy;
import defpackage.e44;
import defpackage.eo7;
import defpackage.eud;
import defpackage.ho7;
import defpackage.hs;
import defpackage.hy4;
import defpackage.kti;
import defpackage.l44;
import defpackage.nzc;
import defpackage.q9;
import defpackage.t27;
import defpackage.tk4;
import defpackage.toc;
import defpackage.v1a;
import defpackage.v6c;
import defpackage.vid;
import defpackage.vw4;
import defpackage.xs0;
import defpackage.yeb;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.z34;
import defpackage.z8a;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/sdk/contextmenu/popup/ContextMenuPopupWindow;", "Lone/me/sdk/arch/Widget;", "Lz34;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "h08", "context-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ContextMenuPopupWindow extends Widget implements z34 {
    public static final /* synthetic */ yy7[] u0 = {new toc(ContextMenuPopupWindow.class, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), ho7.d(vid.a, ContextMenuPopupWindow.class, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), new toc(ContextMenuPopupWindow.class, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), new toc(ContextMenuPopupWindow.class, "anchorViewId", "getAnchorViewId()I", 0), new toc(ContextMenuPopupWindow.class, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), new toc(ContextMenuPopupWindow.class, "parentViewId", "getParentViewId()Ljava/lang/Integer;", 0), new z8a(ContextMenuPopupWindow.class, "isCallbackSent", "isCallbackSent()Z"), new toc(ContextMenuPopupWindow.class, "cardView", "getCardView()Landroid/view/View;", 0), new toc(ContextMenuPopupWindow.class, "useDarkTheme", "getUseDarkTheme()Z", 0), new toc(ContextMenuPopupWindow.class, "applyDefaultSpaces", "getApplyDefaultSpaces()Z", 0)};
    public static final int v0 = nzc.context_menu_card_id;
    public final hs X;
    public final hs Y;
    public final bbd Z;
    public final hs a;
    public final hs b;
    public final hs c;
    public final hs d;
    public final hs o;
    public final hs s0;
    public final hs t0;

    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuPopupWindow() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final yeb y0(ContextMenuPopupWindow contextMenuPopupWindow) {
        v1a v1aVar = a93.s0;
        boolean zZ0 = contextMenuPopupWindow.z0();
        Context context = contextMenuPopupWindow.getContext();
        return zZ0 ? v1aVar.z(context).c : v1aVar.x(context).k();
    }

    @Override // defpackage.z34
    public final void dismiss() {
        getRouter().B(this);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final eo7 getB() {
        eo7 eo7Var = eo7.e;
        return eo7.f;
    }

    @Override // defpackage.c54
    public final boolean handleBack() {
        dismiss();
        return true;
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        xs0 xs0Var = new xs0(this, new e44(1, this));
        if (getRouter() != null) {
            getRouter().a(xs0Var);
        } else {
            addLifecycleListener(new q9(this, 3, xs0Var));
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new l44(this, layoutInflater, layoutInflater.getContext());
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        View view2;
        super.onViewCreated(view);
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
        yy7[] yy7VarArr = u0;
        yy7 yy7Var = yy7VarArr[3];
        int iIntValue = ((Number) this.d.a(this)).intValue();
        if (iIntValue != -1) {
            yy7 yy7Var2 = yy7VarArr[4];
            dy dyVar = new dy((Class) this.o.a(this), iIntValue);
            dyVar.o(this);
            t27 t27Var = new t27(dyVar);
            yy7 yy7Var3 = yy7VarArr[1];
            Rect rect = (Rect) this.b.a(this);
            yy7 yy7Var4 = yy7VarArr[2];
            Float f = (Float) this.c.a(this);
            yy7 yy7Var5 = yy7VarArr[5];
            t27Var.a(view, rect, f, (Integer) this.X.a(this));
            view2 = view;
            ((ArrayList) dyVar.X).add(new hy4(new Rect(), (View) this.Z.D(this, yy7VarArr[7]), view2, new Rect(), iD, iD2));
        } else {
            view2 = view;
        }
        float f2 = getArgs().getFloat("x", -1.0f);
        float f3 = getArgs().getFloat("y", -1.0f);
        View viewFindViewById = view2.findViewById(v0);
        yy7 yy7Var6 = yy7VarArr[9];
        boolean zBooleanValue = ((Boolean) this.t0.a(this)).booleanValue();
        if (f2 <= 0.0f || f3 <= 0.0f) {
            return;
        }
        viewFindViewById.addOnLayoutChangeListener(new v6c(viewFindViewById, f2, f3, zBooleanValue));
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
        if (ytdVarE0 == null) {
            return;
        }
        bud budVar = new bud(this, null, null, null, false, -1);
        az1.u(false, budVar, true, "BottomSheetWidget");
        ytdVarE0.H(budVar);
    }

    public final boolean z0() {
        yy7 yy7Var = u0[8];
        return ((Boolean) this.s0.a(this)).booleanValue();
    }

    public ContextMenuPopupWindow(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new hs(Bundle.class, null, ApiProtocol.PARAM_PAYLOAD);
        this.b = new hs(Rect.class, "highlight_padding");
        this.c = new hs(Float.class, "highlight_radius");
        this.d = new hs(Integer.class, -1, "anchor_id");
        this.o = new hs(Class.class, "anchor_class");
        this.X = new hs(Integer.class, "parent_id");
        Boolean bool = Boolean.FALSE;
        this.Y = new hs(Boolean.class, bool, "callback_sent");
        this.Z = viewBinding(v0);
        this.s0 = new hs(Boolean.class, bool, "dark_theme");
        this.t0 = new hs(Boolean.class, bool, "default_spaces");
    }

    public /* synthetic */ ContextMenuPopupWindow(Bundle bundle, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : bundle);
    }
}
