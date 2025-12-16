package one.me.messages.list.ui.contextmenu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a93;
import defpackage.af9;
import defpackage.aw0;
import defpackage.az1;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.bud;
import defpackage.c54;
import defpackage.cm6;
import defpackage.dy;
import defpackage.eo7;
import defpackage.eud;
import defpackage.f1e;
import defpackage.f8j;
import defpackage.f9d;
import defpackage.fni;
import defpackage.g44;
import defpackage.g4b;
import defpackage.g56;
import defpackage.g6j;
import defpackage.gbd;
import defpackage.gf9;
import defpackage.gq9;
import defpackage.gw0;
import defpackage.hbd;
import defpackage.hd5;
import defpackage.hf9;
import defpackage.hfb;
import defpackage.ho7;
import defpackage.hr9;
import defpackage.hs;
import defpackage.i6c;
import defpackage.ia;
import defpackage.ipi;
import defpackage.iv6;
import defpackage.iv8;
import defpackage.j7b;
import defpackage.ji9;
import defpackage.jx0;
import defpackage.k18;
import defpackage.ki9;
import defpackage.kti;
import defpackage.l38;
import defpackage.l3e;
import defpackage.l48;
import defpackage.l7b;
import defpackage.ls0;
import defpackage.m9d;
import defpackage.mgb;
import defpackage.mi9;
import defpackage.ms0;
import defpackage.ni9;
import defpackage.o6c;
import defpackage.o98;
import defpackage.okf;
import defpackage.p07;
import defpackage.pad;
import defpackage.pb6;
import defpackage.q2b;
import defpackage.q9;
import defpackage.qfb;
import defpackage.r8j;
import defpackage.rb;
import defpackage.rh7;
import defpackage.s3;
import defpackage.svi;
import defpackage.t27;
import defpackage.th7;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u45;
import defpackage.u9b;
import defpackage.uh7;
import defpackage.uog;
import defpackage.v9;
import defpackage.vad;
import defpackage.vc9;
import defpackage.vhb;
import defpackage.vid;
import defpackage.vu9;
import defpackage.vw4;
import defpackage.w9d;
import defpackage.x8d;
import defpackage.x9d;
import defpackage.xl9;
import defpackage.xs0;
import defpackage.yad;
import defpackage.ye6;
import defpackage.yfb;
import defpackage.yn6;
import defpackage.ytd;
import defpackage.yvi;
import defpackage.yy7;
import defpackage.z34;
import defpackage.z8a;
import defpackage.zfi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/messages/list/ui/contextmenu/MessageContextMenuBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lz34;", "Lw9d;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "message-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MessageContextMenuBottomSheet extends BottomSheetWidget implements z34, w9d {
    public static final /* synthetic */ yy7[] d1 = {new toc(MessageContextMenuBottomSheet.class, "anchorViewId", "getAnchorViewId()Ljava/lang/Integer;", 0), ho7.d(vid.a, MessageContextMenuBottomSheet.class, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), new toc(MessageContextMenuBottomSheet.class, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), new toc(MessageContextMenuBottomSheet.class, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), new toc(MessageContextMenuBottomSheet.class, "parentId", "getParentId()Ljava/lang/Integer;", 0), new toc(MessageContextMenuBottomSheet.class, "showReactionsSelector", "getShowReactionsSelector()Z", 0), new toc(MessageContextMenuBottomSheet.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), new toc(MessageContextMenuBottomSheet.class, "messageId", "getMessageId()J", 0), new toc(MessageContextMenuBottomSheet.class, "messageServerId", "getMessageServerId()J", 0), new z8a(MessageContextMenuBottomSheet.class, "isCallbackSent", "isCallbackSent()Z"), new toc(MessageContextMenuBottomSheet.class, "contentContainer", "getContentContainer()Landroid/view/ViewGroup;", 0)};
    public final eo7 C0;
    public final eo7 D0;
    public final eo7 E0;
    public final hs F0;
    public final hs G0;
    public final hs H0;
    public final hs I0;
    public final hs J0;
    public final hs K0;
    public final hs L0;
    public final hs M0;
    public final hs N0;
    public final hs O0;
    public final ColorDrawable P0;
    public final bbd Q0;
    public ViewGroup R0;
    public RecyclerView S0;
    public x9d T0;
    public final k18 U0;
    public final k18 V0;
    public final k18 W0;
    public final Object X0;
    public final r8j Y0;
    public cm6 Z0;
    public final pb6 a1;
    public final ls0 b1;
    public final int c1;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageContextMenuBottomSheet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* renamed from: A0, reason: from getter */
    public final eo7 getE0() {
        return this.E0;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void H0() {
        ((vu9) this.V0.getValue()).N1.set(0L);
        cm6 cm6Var = this.Z0;
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayoutD;
        if (R0()) {
            ?? frameLayout2 = new FrameLayout(getContext());
            yfb yfbVar = new yfb(frameLayout2.getContext(), 6);
            yfbVar.setId(u9b.c);
            yfbVar.setForm(qfb.a);
            yfbVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            yfbVar.setAlpha(0.0f);
            yfbVar.setTitle(l7b.L);
            yfbVar.setLeftActions(new hfb(new ji9(this, 0)));
            zfi.b(yfbVar, this.C0, null);
            frameLayout2.addView(yfbVar);
            RecyclerView recyclerView = new RecyclerView(layoutInflater.getContext(), null);
            recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            recyclerView.setClipToPadding(false);
            pb6 pb6Var = this.a1;
            recyclerView.setAdapter(pb6Var);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setItemAnimator(null);
            int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
            recyclerView.setPadding(iD, recyclerView.getPaddingTop(), iD, recyclerView.getPaddingBottom());
            okf okfVar = new okf(recyclerView, pb6Var, new iv6(29, new ia(this, 22, recyclerView)));
            recyclerView.j(okfVar);
            recyclerView.j(new vc9(0, a93.s0.y(recyclerView)));
            zfi.b(recyclerView, this.D0, null);
            tqi.c(new rb(okfVar, null, 1), recyclerView);
            frameLayout2.addView(recyclerView);
            this.S0 = recyclerView;
            linearLayoutD = frameLayout2;
        } else {
            Context context = layoutInflater.getContext();
            Bundle bundle = getArgs().getBundle("actions");
            List listB = bundle != null ? g6j.b(bundle) : null;
            if (listB == null) {
                listB = hd5.a;
            }
            ji9 ji9Var = new ji9(this, 1);
            this.Y0.getClass();
            linearLayoutD = r8j.d(context, listB, ji9Var);
        }
        this.R0 = linearLayoutD;
        return linearLayoutD;
    }

    @Override // defpackage.w9d
    public final void M() {
        i6c callback;
        x9d x9dVar = this.T0;
        if (x9dVar == null) {
            return;
        }
        RecyclerView recyclerView = x9dVar.d;
        vad vadVarT = ((yad) this.U0.getValue()).t();
        MessageModel messageModelQ0 = Q0();
        int iC = 0;
        o98 o98VarX = vadVarT.x(messageModelQ0 != null ? messageModelQ0.D0 : null, false);
        int measuredHeight = requireView().getMeasuredHeight();
        o6c o6cVar = this.b;
        if (o6cVar != null && (callback = o6cVar.getCallback()) != null) {
            iC = callback.c();
        }
        x9dVar.a(o98VarX, Integer.valueOf((measuredHeight - iC) - this.c1));
        uog.i(recyclerView, p07.KEYBOARD_TAP);
        mgb.a(recyclerView, new yn6(recyclerView, 19, this));
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    /* renamed from: M0 */
    public final boolean getH0() {
        return false;
    }

    public final void O0(int i) {
        yy7[] yy7VarArr = d1;
        yy7 yy7Var = yy7VarArr[9];
        hs hsVar = this.O0;
        if (!((Boolean) hsVar.a(this)).booleanValue()) {
            yy7 yy7Var2 = yy7VarArr[9];
            hsVar.b(this, Boolean.TRUE);
            Object targetController = getTargetController();
            g44 g44Var = targetController instanceof g44 ? (g44) targetController : null;
            if (g44Var != null) {
                g44Var.C(i, null);
            }
        }
        E0(true);
    }

    public final ViewGroup P0() {
        return (ViewGroup) this.Q0.D(this, d1[10]);
    }

    public final MessageModel Q0() {
        hr9 hr9Var = (hr9) ((vu9) this.V0.getValue()).D1.a.getValue();
        yy7 yy7Var = d1[7];
        return hr9Var.e(((Number) this.M0.a(this)).longValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final boolean R0() {
        return ((Boolean) this.X0.getValue()).booleanValue();
    }

    public final hf9 S0() {
        return (hf9) this.W0.getValue();
    }

    @Override // defpackage.w9d
    public final void Z(m9d m9dVar) {
        uh7 uh7VarA;
        xl9 xl9Var;
        f9d f9dVar;
        MessageModel messageModelQ0 = Q0();
        x8d x8dVar = null;
        ((yad) this.U0.getValue()).t().z(new pad(m9dVar.b, messageModelQ0 != null ? messageModelQ0.a : 0L, messageModelQ0 != null ? messageModelQ0.b : 0L, messageModelQ0 != null ? messageModelQ0.D0 : null));
        E0(true);
        if (messageModelQ0 != null && (xl9Var = messageModelQ0.D0) != null && (f9dVar = xl9Var.c) != null) {
            x8dVar = f9dVar.b;
        }
        if (fni.a(x8dVar, m9dVar.b) || (uh7VarA = gq9.a.a()) == null) {
            return;
        }
        uh7VarA.f(Collections.singleton(new th7(rh7.o, 1)), f1e.CHAT);
    }

    @Override // defpackage.z34
    public final void dismiss() {
        E0(true);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        xs0 xs0Var = new xs0(this, new ki9(this, 0));
        if (getRouter() != null) {
            getRouter().a(xs0Var);
        } else {
            addLifecycleListener(new q9(this, 8, xs0Var));
        }
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onDestroyView(View view) {
        this.S0 = null;
        this.R0 = null;
        this.T0 = null;
        this.Z0 = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        yy7[] yy7VarArr = d1;
        yy7 yy7Var = yy7VarArr[0];
        Integer num = (Integer) this.F0.a(this);
        if (num != null) {
            int iIntValue = num.intValue();
            yy7 yy7Var2 = yy7VarArr[1];
            Class cls = (Class) this.G0.a(this);
            if (cls == null) {
                return;
            }
            dy dyVar = new dy(cls, iIntValue);
            this.Z0 = dyVar.o(this);
            ((ArrayList) dyVar.X).add(new l3e(new vhb(dyVar, B0()), new Rect(), new Rect(), new Rect(), kti.d(12 * vw4.d().getDisplayMetrics().density)));
            dy dyVar2 = new dy(cls, iIntValue);
            dyVar2.o(this);
            t27 t27Var = new t27(dyVar2);
            yy7 yy7Var3 = yy7VarArr[2];
            Rect rect = (Rect) this.H0.a(this);
            yy7 yy7Var4 = yy7VarArr[3];
            Float f = (Float) this.I0.a(this);
            yy7 yy7Var5 = yy7VarArr[4];
            t27Var.a(view, rect, f, (Integer) this.J0.a(this));
            if (R0()) {
                hf9 hf9VarS0 = S0();
                k18 k18Var = this.U0;
                hf9VarS0.B0.O(hf9VarS0, hf9.K0[0], svi.e(hf9VarS0.a, ((q2b) hf9VarS0.Y).a(), null, new af9(hf9VarS0, ((yad) k18Var.getValue()).t().y0, null), 2));
                hf9 hf9VarS02 = S0();
                gw0.w(new g56(new gbd(hf9VarS02.A0.d), new gf9(hf9VarS02, ((yad) k18Var.getValue()).t().y0, null), 1), hf9VarS02.a);
                hbd hbdVar = S0().G0;
                l48 l48VarP = getViewLifecycleOwner().p();
                l38 l38Var = l38.d;
                gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new mi9(null, this), 1), getViewLifecycleScope());
                gw0.w(new g56(aw0.a(S0().H0, getViewLifecycleOwner().p(), l38Var), new ni9(null, this), 1), getViewLifecycleScope());
            }
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

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final FrameLayout y0(LayoutInflater layoutInflater, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(u9b.b);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setClipToPadding(false);
        f8j.d(frameLayout, 300L, new ye6(17, this));
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(j7b.I);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f = 10;
        layoutParams.bottomMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        frameLayout2.setLayoutParams(layoutParams);
        vad vadVarT = ((yad) this.U0.getValue()).t();
        MessageModel messageModelQ0 = Q0();
        Continuation continuation = null;
        o98 o98VarX = vadVarT.x(messageModelQ0 != null ? messageModelQ0.D0 : null, true);
        yy7 yy7Var = d1[5];
        if (((Boolean) this.K0.a(this)).booleanValue() && !o98VarX.isEmpty()) {
            x9d x9dVar = new x9d(frameLayout2.getContext(), ((g4b) gq9.a.getAccessor().c(56)).a());
            x9dVar.a(o98VarX, null);
            x9dVar.b = this;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            float f2 = 6;
            layoutParams2.leftMargin = kti.d(vw4.d().getDisplayMetrics().density * f2);
            layoutParams2.rightMargin = kti.d(f2 * vw4.d().getDisplayMetrics().density);
            MessageModel messageModelQ02 = Q0();
            layoutParams2.gravity = (messageModelQ02 == null || !messageModelQ02.F0) ? 21 : 19;
            frameLayout2.addView(x9dVar.d, layoutParams2);
            frameLayout2.setVisibility(0);
            this.T0 = x9dVar;
        }
        frameLayout.addView(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(frameLayout.getContext());
        frameLayout3.setId(j7b.E);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.topMargin = this.c1;
        frameLayout3.setLayoutParams(layoutParams3);
        frameLayout3.setClipToPadding(false);
        frameLayout3.setOutlineProvider(this.b1);
        K0(frameLayout3, layoutInflater, bundle);
        if (R0()) {
            frameLayout3.setPadding(0, kti.d(f * vw4.d().getDisplayMetrics().density), 0, 0);
        } else {
            zfi.b(frameLayout3, this.D0, null);
        }
        tqi.c(new s3(this, continuation, 18), frameLayout3);
        frameLayout.addView(frameLayout3);
        return frameLayout;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final i6c z0() {
        return new v9(this, 3);
    }

    public /* synthetic */ MessageContextMenuBottomSheet(Bundle bundle, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : bundle);
    }

    public MessageContextMenuBottomSheet(Bundle bundle) {
        super(bundle);
        this.C0 = new eo7(4, null, 13);
        this.D0 = new eo7(0, new ms0(3, 3, false), 7);
        this.E0 = eo7.e;
        this.F0 = new hs(Integer.class, "anchor_id");
        this.G0 = new hs(Class.class, "anchor_class");
        this.H0 = new hs(Rect.class, "highlight_padding");
        this.I0 = new hs(Float.class, "highlight_radius");
        this.J0 = new hs(Integer.class, "parent_id");
        Boolean bool = Boolean.FALSE;
        hs hsVar = new hs(Boolean.class, bool, "show_reactions_selector");
        this.K0 = hsVar;
        this.L0 = new hs(Long.class, 0L, "chat_id");
        this.M0 = new hs(Long.class, 0L, "message_id");
        this.N0 = new hs(Long.class, 0L, "message_server_id");
        this.O0 = new hs(Boolean.class, bool, "callback_sent");
        this.P0 = new ColorDrawable();
        this.Q0 = viewBinding(j7b.E);
        b1e b1eVar = (b1e) ((Parcelable) yvi.a(getArgs(), Widget.ARG_SCOPE_ID, b1e.class));
        String str = b1eVar != null ? b1eVar.a : null;
        this.U0 = m39getSharedViewModelcp94BC8(str == null ? getB() : str, yad.class, null);
        b1e b1eVar2 = (b1e) ((Parcelable) yvi.a(getArgs(), Widget.ARG_SCOPE_ID, b1e.class));
        String str2 = b1eVar2 != null ? b1eVar2.a : null;
        this.V0 = m39getSharedViewModelcp94BC8(str2 == null ? getB() : str2, vu9.class, null);
        this.W0 = createViewModelLazy(hf9.class, new iv8(10, new ki9(this, 1)));
        this.X0 = ipi.b(3, new ki9(this, 2));
        r8j r8jVar = new r8j(16);
        this.Y0 = r8jVar;
        this.a1 = new pb6(((g4b) gq9.a.getAccessor().c(56)).a(), r8jVar, new jx0(1, S0(), hf9.class, "onMemberClicked", "onMemberClicked$message_list_release(J)V", 0, 28), new ji9(this, 2));
        this.b1 = new ls0(1, vw4.d().getDisplayMetrics().density * 20.0f);
        yy7 yy7Var = d1[5];
        this.c1 = ((Boolean) hsVar.a(this)).booleanValue() ? u45.c(10, vw4.d().getDisplayMetrics().density, u45.c(32, vw4.d().getDisplayMetrics().density, kti.d(12 * vw4.d().getDisplayMetrics().density) * 2)) : 0;
        J0(false);
    }
}
