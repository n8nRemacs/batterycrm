package one.me.calls.share;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.aw0;
import defpackage.bwf;
import defpackage.cpi;
import defpackage.dq1;
import defpackage.eo7;
import defpackage.f1e;
import defpackage.fde;
import defpackage.fq1;
import defpackage.g0b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gk1;
import defpackage.gq1;
import defpackage.gw0;
import defpackage.h0b;
import defpackage.hbd;
import defpackage.hq1;
import defpackage.imb;
import defpackage.jc3;
import defpackage.jfb;
import defpackage.jzb;
import defpackage.k;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.ld0;
import defpackage.lp1;
import defpackage.lyb;
import defpackage.mcf;
import defpackage.ms0;
import defpackage.mvd;
import defpackage.n5g;
import defpackage.o91;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.r5j;
import defpackage.rd5;
import defpackage.tcf;
import defpackage.tha;
import defpackage.tqi;
import defpackage.ucf;
import defpackage.vw4;
import defpackage.yfb;
import defpackage.yg2;
import defpackage.ys;
import defpackage.zfi;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/calls/share/CallSharePickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Ldq1;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "calls-share_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class CallSharePickerScreen extends AbstractPickerScreen<dq1> implements qq3 {
    public static final eo7 y0 = new eo7(4, new ms0(4, 3, false), 5);
    public final ka5 t0;
    public final eo7 u0;
    public final tcf v0;
    public final fde w0;
    public ConfirmationBottomSheet x0;

    public CallSharePickerScreen(Bundle bundle) {
        super(bundle);
        this.t0 = new ka5(f1e.CALL_ADD_PARTICIPANTS);
        this.u0 = eo7.e;
        this.v0 = ucf.a(new n5g(h0b.d));
        lp1 lp1Var = lp1.a;
        this.w0 = new fde(lp1Var.getAccessor().d(8), lp1Var.getAccessor().d(109), 4);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget A0(String str) {
        return new PickerChatsTabWidget(str, false, null, yg2.b, 6, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final yfb B0(Context context) {
        String string = getArgs().getString("calls_share_title", null);
        if (string == null) {
            string = context.getString(mvd.S1);
        }
        yfb yfbVar = new yfb(context, 6);
        yfbVar.setId(g0b.g);
        yfbVar.setFocusable(true);
        yfbVar.setFocusableInTouchMode(true);
        yfbVar.setTitle(string);
        float f = 4;
        yfbVar.setActionsHorizontalPadding(new imb(Integer.valueOf(kti.d(vw4.d().getDisplayMetrics().density * f)), Integer.valueOf(kti.d(f * vw4.d().getDisplayMetrics().density))));
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new k(25, this)));
        yfbVar.setRightActions(jfb.a);
        return yfbVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final jzb C0() {
        lp1 lp1Var = lp1.a;
        bwf bwfVarD = lp1Var.getAccessor().d(8);
        bwf bwfVarD2 = lp1Var.getAccessor().d(15);
        lp1Var.getAccessor().getClass();
        return new dq1(new tha(15), this.w0, bwfVarD, bwfVarD2, lp1Var.getAccessor().d(361));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final mcf E0() {
        return this.v0;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Set J0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set setE = longArray != null ? ys.E(longArray) : null;
        return setE == null ? rd5.a : setE;
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == g0b.b) {
            ((dq1) I0().c).f();
        } else if (i == g0b.a) {
            ((dq1) I0().c).h.h(jc3.b);
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

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ConfirmationBottomSheet confirmationBottomSheet = this.x0;
        if (confirmationBottomSheet != null) {
            confirmationBottomSheet.E0(false);
        }
        cpi.c(view);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        H0().requestFocus();
        zfi.b(F0(), y0, null);
        gw0.w(new g56(aw0.a(((dq1) I0().c).i, getViewLifecycleOwner().p(), l38.d), new hq1(null, this), 1), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable y0() {
        gk1 gk1Var = new gk1(getContext());
        gk1Var.setId(g0b.f);
        tqi.c(new ld0(3, (Continuation) null, 4), gk1Var);
        gk1Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        gk1Var.setMinHeight(kti.d(62 * vw4.d().getDisplayMetrics().density));
        gk1Var.setOnConfirmClickListener$calls_share_release(new o91(0, I0().c, dq1.class, "onShareConfirmed", "onShareConfirmed$calls_share_release()V", 0, 7));
        hbd hbdVar = I0().Y;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new fq1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((dq1) I0().c).g, getViewLifecycleOwner().p(), l38Var), new gq1(null, gk1Var), 1), getViewLifecycleScope());
        return Collections.singletonList(gk1Var);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final lyb z0() {
        return new r5j(10, lp1.a.getAccessor().d(109));
    }
}
