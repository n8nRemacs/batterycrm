package one.me.chats.forward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a2b;
import defpackage.avd;
import defpackage.aw0;
import defpackage.az1;
import defpackage.bbd;
import defpackage.bud;
import defpackage.c54;
import defpackage.cg6;
import defpackage.cm6;
import defpackage.d53;
import defpackage.eg6;
import defpackage.eo7;
import defpackage.eud;
import defpackage.f1b;
import defpackage.f82;
import defpackage.fde;
import defpackage.fg6;
import defpackage.g31;
import defpackage.g44;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h31;
import defpackage.hbd;
import defpackage.hrb;
import defpackage.hs;
import defpackage.i1b;
import defpackage.ig6;
import defpackage.ik9;
import defpackage.imb;
import defpackage.in9;
import defpackage.jg6;
import defpackage.jve;
import defpackage.jzb;
import defpackage.k18;
import defpackage.k1b;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.ld0;
import defpackage.lfb;
import defpackage.lg6;
import defpackage.lyb;
import defpackage.m6;
import defpackage.mcf;
import defpackage.mg6;
import defpackage.ms0;
import defpackage.muc;
import defpackage.n5g;
import defpackage.ncg;
import defpackage.ng6;
import defpackage.nq5;
import defpackage.og6;
import defpackage.oq3;
import defpackage.pf6;
import defpackage.q9;
import defpackage.qfb;
import defpackage.qn2;
import defpackage.qq3;
import defpackage.r5j;
import defpackage.rd5;
import defpackage.rfb;
import defpackage.rg6;
import defpackage.s09;
import defpackage.sg6;
import defpackage.sn0;
import defpackage.t09;
import defpackage.tfb;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u45;
import defpackage.ug6;
import defpackage.v38;
import defpackage.ve3;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wf6;
import defpackage.xs0;
import defpackage.xz7;
import defpackage.y09;
import defpackage.y83;
import defpackage.yfb;
import defpackage.yg2;
import defpackage.yg6;
import defpackage.yo3;
import defpackage.ys;
import defpackage.ytd;
import defpackage.yud;
import defpackage.yy7;
import defpackage.z8a;
import defpackage.zfi;
import defpackage.zud;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB1\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/chats/forward/ForwardPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lcg6;", "Lqq3;", "Lg44;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messagesIds", "", "attachId", "", "isForwardAttach", "showExternalSharing", "([JLjava/lang/Long;ZZ)V", "forward-message_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ForwardPickerScreen extends AbstractPickerScreen<cg6> implements qq3, g44 {
    public static final /* synthetic */ yy7[] I0 = {new z8a(ForwardPickerScreen.class, "messagesIds", "getMessagesIds()[J"), u45.h(vid.a, ForwardPickerScreen.class, "attachId", "getAttachId()J"), new z8a(ForwardPickerScreen.class, "isForwardAttach", "isForwardAttach()Z"), new toc(ForwardPickerScreen.class, "showExternalSharing", "getShowExternalSharing()Z", 0), new z8a(ForwardPickerScreen.class, "isInMultiSelect", "isInMultiSelect()Z"), new toc(ForwardPickerScreen.class, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), new toc(ForwardPickerScreen.class, "quoteView", "getQuoteView()Lone/me/sdk/uikit/common/chat/QuoteView;", 0)};
    public static final eo7 J0 = new eo7(4, new ms0(4, 3, false), 5);
    public final sn0 A0;
    public final bbd B0;
    public final k18 C0;
    public f82 D0;
    public ytd E0;
    public final og6 F0;
    public y09 G0;
    public ncg H0;
    public final ka5 t0;
    public final eo7 u0;
    public final fde v0;
    public final hs w0;
    public final hs x0;
    public cm6 y0;
    public final AutoTransition z0;

    public ForwardPickerScreen(long[] jArr, Long l, boolean z, boolean z2) {
        this(gwi.b(new imb("messages_to_forward", jArr), new imb("attach_to_forward", l), new imb("is_forward_attach", Boolean.valueOf(z)), new imb("show_external_sharing", Boolean.valueOf(z2))));
    }

    public static final void K0(ForwardPickerScreen forwardPickerScreen, View view, n5g n5gVar, boolean z) {
        float f = 6;
        Point point = new Point(kti.d(vw4.d().getDisplayMetrics().density * f), u45.q(f, vw4.d().getDisplayMetrics().density, forwardPickerScreen.requireView().getBottom() - forwardPickerScreen.M0().getTop()));
        ncg ncgVar = forwardPickerScreen.H0;
        if (ncgVar != null) {
            ncgVar.dismiss();
        }
        ncg ncgVar2 = new ncg(forwardPickerScreen.getContext(), view, new jg6(forwardPickerScreen, 1), (g31) null, 0, 1, 56);
        ncgVar2.c(n5gVar);
        ncgVar2.d(point, 8388691, z ? 2500L : 800L);
        ncgVar2.setOnDismissListener(new h31(2, forwardPickerScreen));
        forwardPickerScreen.H0 = ncgVar2;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget A0(String str) {
        return new PickerChatsTabWidget(str, O0(), new ig6(this, 0), yg2.b, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final yfb B0(Context context) {
        yfb yfbVar = new yfb(context, 6);
        yfbVar.setId(f1b.d);
        yfbVar.setTransitionName(context.getString(k1b.q));
        yfbVar.setTitle(k1b.h0);
        float f = 4;
        yfbVar.setActionsHorizontalPadding(new imb(Integer.valueOf(kti.d(vw4.d().getDisplayMetrics().density * f)), Integer.valueOf(kti.d(f * vw4.d().getDisplayMetrics().density))));
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new ig6(this, 1)));
        yfbVar.setRightActions(new lfb(new tfb(new mg6(this, 0)), new rfb(yud.v0, new ig6(this, 2)), null));
        return yfbVar;
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        jve jveVar = ((cg6) I0().c).p;
        if (i == f1b.f) {
            jveVar.h(new fg6());
        } else if (i == f1b.e) {
            jveVar.h(eg6.a);
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final jzb C0() {
        Long lValueOf = getArgs().getLong("attach_to_forward") == 0 ? null : Long.valueOf(getArgs().getLong("attach_to_forward"));
        long[] longArray = getArgs().getLongArray("messages_to_forward");
        Set setE = longArray != null ? ys.E(longArray) : null;
        if (setE == null) {
            setE = rd5.a;
        }
        pf6 pf6Var = pf6.a;
        return new cg6(setE, (yg6) pf6Var.getAccessor().c(574), this.v0, lValueOf, N0(), (Context) pf6Var.getAccessor().c(12), pf6Var.getAccessor().d(8), pf6Var.getAccessor().d(459), pf6Var.getAccessor().d(577), pf6Var.getAccessor().d(578), pf6Var.getAccessor().d(454), pf6Var.getAccessor().d(46));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final a2b D0() {
        return null;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final mcf E0() {
        return null;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Set J0(Bundle bundle) {
        return rd5.a;
    }

    public final ik9 L0() {
        yy7 yy7Var = I0[5];
        return (ik9) this.A0.getValue();
    }

    public final muc M0() {
        return (muc) this.B0.D(this, I0[6]);
    }

    public final boolean N0() {
        yy7 yy7Var = I0[2];
        return ((Boolean) this.w0.a(this)).booleanValue();
    }

    public final boolean O0() {
        yy7 yy7Var = I0[4];
        return ((Boolean) this.x0.a(this)).booleanValue();
    }

    public final void P0(boolean z) {
        yy7 yy7Var = I0[4];
        this.x0.b(this, Boolean.valueOf(z));
        Widget widgetG0 = G0();
        PickerChatsTabWidget pickerChatsTabWidget = widgetG0 instanceof PickerChatsTabWidget ? (PickerChatsTabWidget) widgetG0 : null;
        if (pickerChatsTabWidget != null) {
            pickerChatsTabWidget.A0(z);
        }
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == zud.t0) {
            wf6.c.p0().d();
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.u0;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c54
    public final boolean handleBack() {
        ytd ytdVar = this.E0;
        if (ytdVar != null && ytdVar.n()) {
            ((cg6) I0().c).r.E(1);
            return true;
        }
        if (((Collection) I0().Y.a.getValue()).isEmpty()) {
            return super.handleBack();
        }
        yy7[] yy7VarArr = BottomSheetWidget.B0;
        oq3 oq3VarE = az1.e(avd.q0, null, null, 6);
        oq3VarE.b(zud.t0, new n5g(avd.p0));
        oq3VarE.c(zud.s0, new n5g(avd.o0));
        ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
        confirmationBottomSheetE.setTargetController(this);
        c54 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        confirmationBottomSheetE.N0(this);
        if (ytdVarE0 != null) {
            bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
            az1.u(false, budVar, true, "BottomSheetWidget");
            ytdVarE0.H(budVar);
        }
        return true;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.D0 = null;
        this.E0 = null;
        y09 y09Var = this.G0;
        if (y09Var != null) {
            y09Var.a();
        }
        this.G0 = null;
        ncg ncgVar = this.H0;
        if (ncgVar != null) {
            ncgVar.dismiss();
        }
        this.H0 = null;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view;
        zfi.b(F0(), J0, null);
        f82 f82Var = new f82(viewGroup.getContext());
        f82Var.setId(f1b.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        f82Var.setLayoutParams(layoutParams);
        int i = xz7.a;
        f82Var.setTranslationY(xz7.a(f82Var.getContext()));
        zfi.b(f82Var, new eo7(0, new ms0(5, 1, false), 7), null);
        this.D0 = f82Var;
        this.E0 = getChildRouter(f82Var);
        viewGroup.addView(f82Var);
        gw0.w(new g56(I0().Y, new ug6(this, view, null), 1), getViewLifecycleScope());
        y83 y83Var = new y83(((cg6) I0().c).t, 9, this);
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(y83Var, l48VarP, l38Var), new rg6(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((cg6) I0().c).q, getViewLifecycleOwner().p(), l38Var), new sg6(null, this), 1), getViewLifecycleScope());
        ViewGroup viewGroupF0 = F0();
        ytd ytdVar = this.E0;
        f82 f82Var2 = this.D0;
        if (ytdVar == null || f82Var2 == null) {
            return;
        }
        jg6 jg6Var = new jg6(this, 2);
        boolean z = ((hrb) pf6.a.getAccessor().c(78)).b && Build.VERSION.SDK_INT >= 30;
        v38 viewLifecycleScope = getViewLifecycleScope();
        in9 in9Var = (in9) ((hbd) ((cg6) I0().c).r.b).a.getValue();
        this.G0 = new y09(ytdVar, f82Var2, viewGroupF0, jg6Var, z, viewLifecycleScope, (in9Var != null ? in9Var.a : 0) == 2, new qn2(this, 19, viewGroupF0));
        new s09((t09) this.C0.getValue(), L0()).a(getViewLifecycleScope());
        gw0.w(new g56(new d53((hbd) ((cg6) I0().c).r.b, 12), new ng6(this, viewGroupF0, null), 1), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable y0() {
        muc mucVar = new muc(getContext());
        mucVar.setId(f1b.c);
        tqi.c(new ld0(3, (Continuation) null, 16), mucVar);
        mucVar.setLayoutParams(new LinearLayout.LayoutParams(-1, kti.d(52 * vw4.d().getDisplayMetrics().density)));
        gw0.w(new g56(((cg6) I0().c).n, new lg6(mucVar, this, null), 1), getViewLifecycleScope());
        return ve3.j(mucVar, L0());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final lyb z0() {
        return new r5j(10, pf6.a.getAccessor().d(109));
    }

    public ForwardPickerScreen(Bundle bundle) {
        super(bundle);
        this.t0 = new ka5(new nq5(11), (cm6) null, 6);
        this.u0 = eo7.e;
        pf6 pf6Var = pf6.a;
        this.v0 = new fde(pf6Var.getAccessor().d(8), pf6Var.getAccessor().d(109), 4);
        Boolean bool = Boolean.FALSE;
        this.w0 = new hs(Boolean.class, bool, "is_forward_attach");
        this.x0 = new hs(Boolean.class, bool, "is_in_multiselect");
        this.y0 = new nq5(12);
        AutoTransition autoTransition = new AutoTransition();
        int i = f1b.c;
        autoTransition.addTarget(i);
        autoTransition.addTarget(i1b.c0);
        autoTransition.addTarget(f1b.a);
        autoTransition.setOrdering(0);
        autoTransition.setDuration(100L);
        autoTransition.addListener((Transition.TransitionListener) new m6(1, this));
        this.z0 = autoTransition;
        this.A0 = binding(new jg6(this, 3));
        this.B0 = viewBinding(i);
        this.C0 = createViewModelLazy(t09.class, new yo3(16, new nq5(13)));
        this.F0 = new og6(this, 0);
        pf6Var.getAccessor().d(47);
        xs0 xs0Var = new xs0(this, new jg6(this, 4));
        if (getRouter() != null) {
            getRouter().a(xs0Var);
        } else {
            addLifecycleListener(new q9(this, 6, xs0Var));
        }
    }

    public /* synthetic */ ForwardPickerScreen(long[] jArr, Long l, boolean z, boolean z2, int i, tk4 tk4Var) {
        this(jArr, (i & 2) != 0 ? null : l, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
