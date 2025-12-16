package one.me.sharedata;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a93;
import defpackage.aw0;
import defpackage.az1;
import defpackage.bbd;
import defpackage.bcb;
import defpackage.bud;
import defpackage.bue;
import defpackage.c54;
import defpackage.cue;
import defpackage.d53;
import defpackage.due;
import defpackage.eo7;
import defpackage.eud;
import defpackage.eue;
import defpackage.f82;
import defpackage.f8j;
import defpackage.fde;
import defpackage.g44;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gza;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.hrb;
import defpackage.hue;
import defpackage.i1b;
import defpackage.i5i;
import defpackage.ik9;
import defpackage.in9;
import defpackage.iue;
import defpackage.iza;
import defpackage.jve;
import defpackage.jza;
import defpackage.k18;
import defpackage.k1b;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kti;
import defpackage.l38;
import defpackage.l3b;
import defpackage.lfb;
import defpackage.lyb;
import defpackage.mcf;
import defpackage.ms0;
import defpackage.mte;
import defpackage.muc;
import defpackage.n5g;
import defpackage.nte;
import defpackage.og6;
import defpackage.oq3;
import defpackage.pcc;
import defpackage.q9;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.r5j;
import defpackage.rd5;
import defpackage.rfb;
import defpackage.s09;
import defpackage.sn0;
import defpackage.t09;
import defpackage.tcf;
import defpackage.te8;
import defpackage.toc;
import defpackage.tte;
import defpackage.ucf;
import defpackage.ute;
import defpackage.v38;
import defpackage.vdc;
import defpackage.ve3;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wbb;
import defpackage.xbb;
import defpackage.xs0;
import defpackage.xte;
import defpackage.xz7;
import defpackage.y09;
import defpackage.y67;
import defpackage.yfb;
import defpackage.yg2;
import defpackage.ys;
import defpackage.ytd;
import defpackage.yte;
import defpackage.yud;
import defpackage.yy7;
import defpackage.zfi;
import java.util.Set;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lone/me/sharedata/ShareDataPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Ltte;", "Lqq3;", "Lg44;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "share-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ShareDataPickerScreen extends AbstractPickerScreen<tte> implements qq3, g44 {
    public static final /* synthetic */ yy7[] I0 = {new toc(ShareDataPickerScreen.class, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), ho7.d(vid.a, ShareDataPickerScreen.class, "bottomButton", "getBottomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(ShareDataPickerScreen.class, "quoteView", "getQuoteView()Lone/me/sdk/uikit/common/chat/QuoteView;", 0)};
    public static final eo7 J0 = new eo7(4, new ms0(4, 3, false), 5);
    public final bbd A0;
    public final k18 B0;
    public f82 C0;
    public ytd D0;
    public final og6 E0;
    public y09 F0;
    public boolean G0;
    public bcb H0;
    public final eo7 t0;
    public final tcf u0;
    public final boolean v0;
    public final fde w0;
    public final AutoTransition x0;
    public final sn0 y0;
    public final bbd z0;

    public ShareDataPickerScreen(Bundle bundle) {
        super(bundle);
        this.t0 = eo7.e;
        this.u0 = ucf.a(new n5g(xbb.f));
        this.v0 = bundle.getBoolean("oneme:share:is:internal:url:sharing");
        mte mteVar = mte.a;
        this.w0 = new fde(mteVar.getAccessor().d(8), mteVar.getAccessor().d(109), J0(bundle));
        AutoTransition autoTransition = new AutoTransition();
        int i = wbb.f;
        autoTransition.addTarget(i);
        autoTransition.addTarget(i1b.c0);
        autoTransition.addTarget(wbb.d);
        autoTransition.setOrdering(0);
        autoTransition.setDuration(100L);
        this.x0 = autoTransition;
        this.y0 = binding(new cue(this, 1));
        this.z0 = viewBinding(wbb.a);
        this.A0 = viewBinding(i);
        this.B0 = createViewModelLazy(t09.class, new vdc(21, new nte(2)));
        this.E0 = new og6(this, 2);
        this.G0 = !J0(bundle).isEmpty();
        xs0 xs0Var = new xs0(this, new cue(this, 2));
        if (getRouter() != null) {
            getRouter().a(xs0Var);
        } else {
            addLifecycleListener(new q9(this, 14, xs0Var));
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget A0(String str) {
        return new PickerChatsTabWidget(str, this.G0, new bue(this, 0), yg2.b, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final yfb B0(Context context) {
        String string = getArgs().getString("oneme:share:title", null);
        if (string == null) {
            string = context.getString(xbb.i);
        }
        yfb yfbVar = new yfb(context, 6);
        yfbVar.setId(wbb.g);
        yfbVar.setTransitionName(context.getString(k1b.q));
        yfbVar.setTitle(string);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new bue(this, 2)));
        yfbVar.setRightActions(new lfb(null, new rfb(yud.v0, new bue(this, 1)), null));
        return yfbVar;
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        jve jveVar = ((tte) I0().c).k;
        if (i == wbb.i) {
            jveVar.h(yte.a);
        } else if (i == wbb.h) {
            jveVar.h(xte.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019f  */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // one.me.chats.picker.AbstractPickerScreen
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jzb C0() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sharedata.ShareDataPickerScreen.C0():jzb");
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final mcf E0() {
        return this.u0;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Set J0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set setE = longArray != null ? ys.E(longArray) : null;
        return setE == null ? rd5.a : setE;
    }

    public final ik9 K0() {
        yy7 yy7Var = I0[0];
        return (ik9) this.y0.getValue();
    }

    public final void L0(boolean z) {
        if (z == this.G0) {
            return;
        }
        this.G0 = z;
        Widget widgetG0 = G0();
        PickerChatsTabWidget pickerChatsTabWidget = widgetG0 instanceof PickerChatsTabWidget ? (PickerChatsTabWidget) widgetG0 : null;
        if (pickerChatsTabWidget != null) {
            pickerChatsTabWidget.A0(z);
        }
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        tte tteVar = (tte) I0().c;
        tteVar.getClass();
        if (i == wbb.c) {
            tteVar.k.h(ute.a);
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.t0;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return new ka5(new nte(3), new y67(getArgs().getString("ref"), 2), 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c54
    public final boolean handleBack() {
        ytd ytdVar = this.D0;
        if (ytdVar != null && ytdVar.n()) {
            ((tte) I0().c).m.E(1);
            return true;
        }
        if (!getArgs().getBoolean("oneme:share:confirm", false)) {
            return super.handleBack();
        }
        yy7[] yy7VarArr = BottomSheetWidget.B0;
        oq3 oq3VarE = az1.e(xbb.d, null, null, 4);
        oq3VarE.b(wbb.c, new n5g(xbb.c));
        oq3VarE.d(wbb.b, new n5g(xbb.b));
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
        this.C0 = null;
        this.D0 = null;
        y09 y09Var = this.F0;
        if (y09Var != null) {
            y09Var.a();
        }
        this.F0 = null;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view;
        zfi.b(F0(), J0, null);
        f82 f82Var = new f82(viewGroup.getContext());
        f82Var.setId(wbb.e);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        f82Var.setLayoutParams(layoutParams);
        int i = xz7.a;
        f82Var.setTranslationY(xz7.a(f82Var.getContext()));
        zfi.b(f82Var, new eo7(0, new ms0(5, 1, false), 7), null);
        this.C0 = f82Var;
        this.D0 = getChildRouter(f82Var);
        viewGroup.addView(f82Var);
        gw0.w(new g56(I0().Y, new iue(this, view, null), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((tte) I0().c).l, getViewLifecycleOwner().p(), l38.d), new hue(null, this), 1), getViewLifecycleScope());
        ViewGroup viewGroupF0 = F0();
        ytd ytdVar = this.D0;
        f82 f82Var2 = this.C0;
        if (ytdVar == null || f82Var2 == null) {
            return;
        }
        cue cueVar = new cue(this, 3);
        boolean z = ((hrb) mte.a.getAccessor().c(78)).b && Build.VERSION.SDK_INT >= 30;
        v38 viewLifecycleScope = getViewLifecycleScope();
        in9 in9Var = (in9) ((hbd) ((tte) I0().c).m.b).a.getValue();
        this.F0 = new y09(ytdVar, f82Var2, viewGroupF0, cueVar, z, viewLifecycleScope, (in9Var != null ? in9Var.a : 0) == 2, new l3b(this, 29, viewGroupF0));
        new s09((t09) this.B0.getValue(), K0()).a(getViewLifecycleScope());
        gw0.w(new g56(new d53((hbd) ((tte) I0().c).m.b, 12), new eue(this, viewGroupF0, null), 1), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable y0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setId(wbb.a);
        oneMeButton.setMode(iza.d);
        oneMeButton.setSize(jza.c);
        oneMeButton.setAppearance(gza.a);
        oneMeButton.setText(xbb.a);
        f8j.d(oneMeButton, 300L, new pcc(11, this));
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        muc mucVar = new muc(getContext());
        mucVar.setId(wbb.f);
        mucVar.setBackgroundColor(a93.s0.y(mucVar).a().k().a.d);
        mucVar.setLayoutParams(new LinearLayout.LayoutParams(-1, kti.d(52 * vw4.d().getDisplayMetrics().density)));
        gw0.w(new g56(((tte) I0().c).j, new due(mucVar, this, null), 1), getViewLifecycleScope());
        return ve3.j(oneMeButton, mucVar, K0());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final lyb z0() {
        mte mteVar = mte.a;
        r5j r5jVar = new r5j(10, mteVar.getAccessor().d(109));
        fde fdeVar = this.w0;
        return new te8(fdeVar, r5jVar, new i5i(mteVar.getAccessor().d(556), fdeVar, false));
    }
}
