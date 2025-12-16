package one.me.calls.ui.ui.call.panels;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a41;
import defpackage.a71;
import defpackage.ao6;
import defpackage.aw0;
import defpackage.b1e;
import defpackage.b41;
import defpackage.bbd;
import defpackage.c7j;
import defpackage.e51;
import defpackage.eyc;
import defpackage.g44;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hs;
import defpackage.i6;
import defpackage.imb;
import defpackage.k18;
import defpackage.k31;
import defpackage.l38;
import defpackage.l48;
import defpackage.ln;
import defpackage.ms8;
import defpackage.q;
import defpackage.qsb;
import defpackage.t9f;
import defpackage.tk4;
import defpackage.toc;
import defpackage.u45;
import defpackage.vid;
import defpackage.w31;
import defpackage.wo1;
import defpackage.x26;
import defpackage.y31;
import defpackage.yy7;
import defpackage.z31;
import defpackage.z34;
import defpackage.zo1;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallBottomPanelWidget;", "Lone/me/sdk/arch/Widget;", "Lg44;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "(Ljava/lang/String;Ltk4;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class CallBottomPanelWidget extends Widget implements g44 {
    public static final /* synthetic */ yy7[] Z = {new toc(CallBottomPanelWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), u45.h(vid.a, CallBottomPanelWidget.class, "audioLevelJob", "getAudioLevelJob()Lkotlinx/coroutines/Job;"), new toc(CallBottomPanelWidget.class, "callBottomPanel", "getCallBottomPanel()Lone/me/calls/ui/view/controls/CallBottomControlViewNew;", 0)};
    public z34 X;
    public final bbd Y;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final t9f o;

    public CallBottomPanelWidget(String str, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str))));
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        Object next;
        CallsAudioDeviceInfo callsAudioDeviceInfoB;
        w31 w31VarZ0 = z0();
        Iterator it = w31VarZ0.u().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((a71) next).getId() == i) {
                    break;
                }
            }
        }
        a71 a71Var = (a71) next;
        if (a71Var == null || (callsAudioDeviceInfoB = a71Var.b()) == null) {
            return;
        }
        w31VarZ0.v().l(callsAudioDeviceInfoB);
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        x26 x26Var = z0().Z;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(x26Var, l48VarP, l38Var), new y31(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(z0().s0, getViewLifecycleOwner().p(), l38Var), new z31(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(z0().w0, getViewLifecycleOwner().p(), l38Var), new a41(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(z0().t0, getViewLifecycleOwner().p(), l38Var), new b41(null, this), 1), getViewLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k31 k31Var = new k31(getContext());
        k31Var.setId(eyc.call_bottom_control);
        k31Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return k31Var;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.o.O(this, Z[1], null);
        z34 z34Var = this.X;
        if (z34Var != null) {
            z34Var.dismiss();
        }
        this.X = null;
    }

    @Override // defpackage.g44
    public final void onDismiss() {
        this.X = null;
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        k18 k18Var = this.a;
        boolean z = false;
        boolean z2 = i == 159 && ((qsb) k18Var.getValue()).c(qsb.m);
        if (i == 160 && ((qsb) k18Var.getValue()).c(qsb.h)) {
            z = true;
        }
        ms8 ms8Var = ms8.b;
        if (z2) {
            z0().x(ms8Var);
        } else if (z) {
            z0().w(ms8Var);
        }
        if (z2 || z) {
            zo1 zo1Var = (zo1) this.b.getValue();
            ln lnVarRequireActivity = requireActivity();
            zo1Var.getClass();
            zo1.d(lnVarRequireActivity);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        y0().setClickListener(new ao6(5, this));
    }

    public final k31 y0() {
        return (k31) this.Y.D(this, Z[2]);
    }

    public final w31 z0() {
        return (w31) this.d.getValue();
    }

    public CallBottomPanelWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        hs hsVar = new hs(b1e.class, new b1e("default"), Widget.ARG_SCOPE_ID);
        e51 e51Var = e51.a;
        this.a = e51Var.getAccessor().d(10);
        this.b = e51Var.getAccessor().d(26);
        yy7 yy7Var = Z[0];
        this.c = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, wo1.class, null);
        this.d = createViewModelLazy(w31.class, new q(9, new i6(19, this)));
        this.o = c7j.c();
        this.Y = viewBinding(eyc.call_bottom_control);
    }
}
