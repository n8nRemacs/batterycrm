package one.me.calls.ui.ui.waitingroom.event;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.work.WorkRequest;
import defpackage.a93;
import defpackage.aw0;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.cu1;
import defpackage.dqi;
import defpackage.e64;
import defpackage.eu1;
import defpackage.fu1;
import defpackage.g56;
import defpackage.gu1;
import defpackage.gvf;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h79;
import defpackage.hk1;
import defpackage.ho7;
import defpackage.i00;
import defpackage.imb;
import defpackage.ipi;
import defpackage.j0b;
import defpackage.jl1;
import defpackage.k18;
import defpackage.l38;
import defpackage.mfh;
import defpackage.mgb;
import defpackage.o3;
import defpackage.o98;
import defpackage.q;
import defpackage.qe;
import defpackage.rha;
import defpackage.tk4;
import defpackage.toc;
import defpackage.ve3;
import defpackage.vid;
import defpackage.vw4;
import defpackage.x54;
import defpackage.y54;
import defpackage.yy7;
import defpackage.z54;
import defpackage.z5a;
import java.util.List;
import kotlin.Metadata;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/ui/waitingroom/event/CallWaitingRoomEventsWidget;", "Lone/me/sdk/arch/Widget;", "Lz54;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "(Ljava/lang/String;Ltk4;)V", "i00", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallWaitingRoomEventsWidget extends Widget implements z54 {
    public static final /* synthetic */ yy7[] u0 = {new toc(CallWaitingRoomEventsWidget.class, "contactCellView", "getContactCellView()Lone/me/sdk/uikit/common/cellitem/OneMeCellSimpleView;", 0), ho7.d(vid.a, CallWaitingRoomEventsWidget.class, "multiContactCellView", "getMultiContactCellView()Lone/me/calls/ui/view/event/MultiContactCellView;", 0), new toc(CallWaitingRoomEventsWidget.class, "eventContainerView", "getEventContainerView()Landroid/widget/FrameLayout;", 0)};
    public final Object X;
    public i00 Y;
    public final bbd Z;
    public e64 a;
    public final k18 b;
    public ObjectAnimator c;
    public final Handler d;
    public final o3 o;
    public final bbd s0;
    public final bbd t0;

    public CallWaitingRoomEventsWidget(String str, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str))));
    }

    public static void B0(CallWaitingRoomEventsWidget callWaitingRoomEventsWidget) {
        callWaitingRoomEventsWidget.A0(((cu1) ((eu1) callWaitingRoomEventsWidget.b.getValue()).d.a.getValue()).a());
    }

    public final void A0(long j) {
        getRouter().B(this);
        i00 i00Var = this.Y;
        if (i00Var != null) {
            CallScreen callScreen = (CallScreen) i00Var.b;
            CallWaitingRoomEventsWidget callWaitingRoomEventsWidget = (CallWaitingRoomEventsWidget) i00Var.c;
            rha rhaVar = CallScreen.N0;
            callScreen.H0().c.h(j);
            callScreen.F0().a.remove(callWaitingRoomEventsWidget);
            callScreen.E0().a();
        }
        this.Y = null;
    }

    public final void C0() {
        float f;
        ObjectAnimator objectAnimatorOfFloat = this.c;
        if (objectAnimatorOfFloat == null) {
            View view = getView();
            Object parent = view != null ? view.getParent() : null;
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                e64 e64Var = this.a;
                if (e64Var != null) {
                    y54 y54Var = e64Var.j;
                    f = y54Var.c ? 0 : -(y54Var.b() + y54Var.b);
                } else {
                    f = 0.0f;
                }
                view2.setTranslationY(f);
                float f2 = vw4.d().getDisplayMetrics().density * 4.0f;
                float f3 = -f2;
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f, f3, f2, f3, f2, f3, f2, 0.0f);
                objectAnimatorOfFloat.setStartDelay(WorkRequest.MIN_BACKOFF_MILLIS);
                objectAnimatorOfFloat.setRepeatMode(1);
                objectAnimatorOfFloat.setDuration(500L);
                objectAnimatorOfFloat.addListener(new qe(3, this));
                this.c = objectAnimatorOfFloat;
            } else {
                objectAnimatorOfFloat = null;
            }
        }
        if (objectAnimatorOfFloat != null) {
            if (objectAnimatorOfFloat.isPaused()) {
                objectAnimatorOfFloat.resume();
            } else {
                if (objectAnimatorOfFloat.isRunning() || objectAnimatorOfFloat.isStarted()) {
                    return;
                }
                this.d.post(this.o);
            }
        }
    }

    @Override // defpackage.z54
    public final List I(x54 x54Var, x54 x54Var2) {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
        o98 o98VarD = ve3.d();
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            o98VarD.add(dqi.o(view2, (Math.abs(x54Var.d) - x54Var.f) * x54Var.c));
        }
        return ve3.a(o98VarD);
    }

    @Override // defpackage.z54
    public final void P() {
        C0();
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        C0();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        gvf gvfVar = new gvf(layoutInflater.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        gvfVar.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(gvfVar.getContext());
        frameLayout.setId(j0b.V1);
        mfh.j(frameLayout, vw4.d().getDisplayMetrics().density * 40.0f);
        frameLayout.setBackgroundColor(a93.s0.B(frameLayout).c.b().h);
        gvfVar.setClipToPadding(false);
        gvfVar.setClipChildren(false);
        gvfVar.setClipToOutline(false);
        gvfVar.addView(frameLayout);
        gvfVar.setCallback(new h79(this, 8, frameLayout));
        mgb.a(gvfVar, new fu1(gvfVar, gvfVar, 0));
        return gvfVar;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.c = null;
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        super.onDetach(view);
        this.d.removeCallbacks(this.o);
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(((eu1) this.b.getValue()).d, getViewLifecycleOwner().p(), l38.d), new gu1(null, this), 1), getViewLifecycleScope());
    }

    public final FrameLayout y0() {
        return (FrameLayout) this.t0.D(this, u0[2]);
    }

    public final z5a z0() {
        return (z5a) this.s0.D(this, u0[1]);
    }

    public CallWaitingRoomEventsWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.b = createViewModelLazy(eu1.class, new q(24, new jl1(15)));
        this.d = new Handler(Looper.getMainLooper());
        this.o = new o3(27, this);
        this.X = ipi.b(3, new hk1(4, this));
        this.Z = viewBinding(j0b.c2);
        this.s0 = viewBinding(j0b.W1);
        this.t0 = viewBinding(j0b.V1);
    }
}
