package ru.ok.tamtam.messages.scheduled;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.a0e;
import defpackage.b0e;
import defpackage.bc2;
import defpackage.bgh;
import defpackage.bzf;
import defpackage.cj6;
import defpackage.cm6;
import defpackage.czf;
import defpackage.d53;
import defpackage.d6;
import defpackage.d83;
import defpackage.efd;
import defpackage.epi;
import defpackage.f8j;
import defpackage.g56;
import defpackage.gg4;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.ho7;
import defpackage.imb;
import defpackage.ipi;
import defpackage.iqb;
import defpackage.iu3;
import defpackage.j48;
import defpackage.jkc;
import defpackage.k18;
import defpackage.m2;
import defpackage.m36;
import defpackage.nhd;
import defpackage.o1d;
import defpackage.pi6;
import defpackage.q1g;
import defpackage.r5d;
import defpackage.ti6;
import defpackage.un5;
import defpackage.uzd;
import defpackage.vid;
import defpackage.vzd;
import defpackage.wzd;
import defpackage.xu9;
import defpackage.xzd;
import defpackage.yy7;
import defpackage.yzd;
import defpackage.ze8;
import defpackage.zzd;
import java.io.Serializable;
import kotlin.Metadata;
import ru.ok.TamBottomSheetDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lru/ok/tamtam/messages/scheduled/ScheduledSendPickerDialogFragment;", "Lru/ok/TamBottomSheetDialogFragment;", "<init>", "()V", "wzd", "uzd", "vzd", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScheduledSendPickerDialogFragment extends TamBottomSheetDialogFragment {
    public final Object A1;
    public final Object B1;
    public final Object C1;
    public final bgh D1;
    public final Object E1;

    public ScheduledSendPickerDialogFragment() {
        super(o1d.scheduled_send_picker_fragment);
        final int i = 0;
        this.A1 = ipi.b(2, new cm6(this) { // from class: pzd
            public final /* synthetic */ ScheduledSendPickerDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Bundle bundleJ0 = this.b.j0();
                        Serializable serializable = bundleJ0.getSerializable("ScheduledSendPickerViewModel:delayed_attrs");
                        ss4 ss4Var = serializable instanceof ss4 ? (ss4) serializable : null;
                        return Boolean.valueOf(ss4Var != null ? ss4Var.b : bundleJ0.getBoolean("ScheduledSendPickerDialogFragment:send_with_notification"));
                    case 1:
                        return this.b.j0().getString("ScheduledSendPickerDialogFragment:who", null);
                    default:
                        return this.b.j0().getParcelable("ScheduledSendPickerDialogFragment:arg_input");
                }
            }
        });
        final int i2 = 1;
        this.B1 = ipi.b(2, new cm6(this) { // from class: pzd
            public final /* synthetic */ ScheduledSendPickerDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        Bundle bundleJ0 = this.b.j0();
                        Serializable serializable = bundleJ0.getSerializable("ScheduledSendPickerViewModel:delayed_attrs");
                        ss4 ss4Var = serializable instanceof ss4 ? (ss4) serializable : null;
                        return Boolean.valueOf(ss4Var != null ? ss4Var.b : bundleJ0.getBoolean("ScheduledSendPickerDialogFragment:send_with_notification"));
                    case 1:
                        return this.b.j0().getString("ScheduledSendPickerDialogFragment:who", null);
                    default:
                        return this.b.j0().getParcelable("ScheduledSendPickerDialogFragment:arg_input");
                }
            }
        });
        final int i3 = 2;
        this.C1 = ipi.b(2, new cm6(this) { // from class: pzd
            public final /* synthetic */ ScheduledSendPickerDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        Bundle bundleJ0 = this.b.j0();
                        Serializable serializable = bundleJ0.getSerializable("ScheduledSendPickerViewModel:delayed_attrs");
                        ss4 ss4Var = serializable instanceof ss4 ? (ss4) serializable : null;
                        return Boolean.valueOf(ss4Var != null ? ss4Var.b : bundleJ0.getBoolean("ScheduledSendPickerDialogFragment:send_with_notification"));
                    case 1:
                        return this.b.j0().getString("ScheduledSendPickerDialogFragment:who", null);
                    default:
                        return this.b.j0().getParcelable("ScheduledSendPickerDialogFragment:arg_input");
                }
            }
        });
        k18 k18VarB = ipi.b(3, new m2(9, new m2(8, this)));
        this.D1 = new bgh(vid.a(ScheduledSendPickerViewModel.class), new b0e(0, k18VarB), new un5(this, 2, k18VarB), new b0e(1, k18VarB));
        this.E1 = ipi.b(2, new efd(this));
    }

    public static final void C0(String str, ti6 ti6Var, d6 d6Var, iu3 iu3Var) {
        iqb iqbVar = new iqb(24, iu3Var);
        String strI = ho7.i("ScheduledSendPickerDialogFragment:", str, ":result");
        pi6 pi6Var = (pi6) ti6Var.m.remove(strI);
        if (pi6Var != null) {
            pi6Var.a.f(pi6Var.c);
        }
        if (c.K(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key " + strI);
        }
        ti6Var.c0(strI, d6Var, new xu9(29, iqbVar));
    }

    public static final void D0(String str, ti6 ti6Var) {
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = new ScheduledSendPickerDialogFragment();
        scheduledSendPickerDialogFragment.n0(gwi.b(new imb("ScheduledSendPickerDialogFragment:who", str), new imb("ScheduledSendPickerDialogFragment:send_with_notification", Boolean.TRUE), new imb("ScheduledSendPickerDialogFragment:arg_input", null), new imb("ScheduledSendPickerViewModel:delayed_attrs", null)));
        scheduledSendPickerDialogFragment.x0(ti6Var, "ScheduledSendPickerDialogFragment");
    }

    public final ScheduledSendPickerViewModel A0() {
        return (ScheduledSendPickerViewModel) this.D1.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void B0(uzd uzdVar) {
        ?? r0 = this.B1;
        x().b0(ho7.i("ScheduledSendPickerDialogFragment:", (String) r0.getValue(), ":result"), gwi.b(new imb(ho7.i("ScheduledSendPickerDialogFragment:", (String) r0.getValue(), ":result"), uzdVar)));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void M(Bundle bundle) {
        super.M(bundle);
        epi.d(i0());
    }

    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object, k18] */
    @Override // androidx.fragment.app.a
    public final void e0(View view, Bundle bundle) {
        wzd wzdVarZ0 = z0();
        j48 j48VarC = C();
        wzdVarZ0.a = view;
        cj6 cj6Var = (cj6) j48VarC;
        cj6Var.b();
        cj6Var.o.a(new nhd(3, wzdVarZ0));
        gw0.w(new g56(gw0.k(new d53(new m36(new bzf(2, null), q1g.d0), 12), 100L), new czf(this, null), 1), ze8.c(this));
        gw0.w(new g56(new d53(A0().d, 12), new xzd(this, null), 1), ze8.c(this));
        gw0.w(new g56(A0().l, new yzd(view, this, null), 1), ze8.c(this));
        gw0.w(new g56(new bc2(new d53(A0().n, 12), 8), new zzd(this, null), 1), ze8.c(this));
        z0().b().setListener$scheduled_send_picker_dialog_release(A0());
        final int i = 0;
        f8j.d(z0().c(), 300L, new View.OnClickListener(this) { // from class: rzd
            public final /* synthetic */ ScheduledSendPickerDialogFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                switch (i) {
                    case 0:
                        ScheduledSendPickerViewModel scheduledSendPickerViewModelA0 = this.b.A0();
                        scheduledSendPickerViewModelA0.getClass();
                        wqi.c("ScheduledSendPickerViewModel", "onSendClick", new Object[0]);
                        if (scheduledSendPickerViewModelA0.h()) {
                            scheduledSendPickerViewModelA0.m.m(null, new zca());
                            break;
                        }
                        break;
                    default:
                        wqi.c("ScheduledSendPickerDialogFragment", "handle nav click", new Object[0]);
                        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.b;
                        scheduledSendPickerDialogFragment.B0(new szd((Parcelable) scheduledSendPickerDialogFragment.C1.getValue()));
                        scheduledSendPickerDialogFragment.s0();
                        break;
                }
            }
        });
        wzd wzdVarZ02 = z0();
        jkc jkcVar = wzdVarZ02.c;
        yy7[] yy7VarArr = wzd.s0;
        MaterialToolbar materialToolbar = (MaterialToolbar) jkcVar.D(wzdVarZ02, yy7VarArr[0]);
        materialToolbar.setBackground(null);
        final int i2 = 1;
        materialToolbar.setNavigationOnClickListener(new gg4(300L, new View.OnClickListener(this) { // from class: rzd
            public final /* synthetic */ ScheduledSendPickerDialogFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                switch (i2) {
                    case 0:
                        ScheduledSendPickerViewModel scheduledSendPickerViewModelA0 = this.b.A0();
                        scheduledSendPickerViewModelA0.getClass();
                        wqi.c("ScheduledSendPickerViewModel", "onSendClick", new Object[0]);
                        if (scheduledSendPickerViewModelA0.h()) {
                            scheduledSendPickerViewModelA0.m.m(null, new zca());
                            break;
                        }
                        break;
                    default:
                        wqi.c("ScheduledSendPickerDialogFragment", "handle nav click", new Object[0]);
                        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.b;
                        scheduledSendPickerDialogFragment.B0(new szd((Parcelable) scheduledSendPickerDialogFragment.C1.getValue()));
                        scheduledSendPickerDialogFragment.s0();
                        break;
                }
            }
        }));
        wzd wzdVarZ03 = z0();
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) wzdVarZ03.X.D(wzdVarZ03, yy7VarArr[3]);
        appCompatCheckBox.setVisibility(((Boolean) this.A1.getValue()).booleanValue() ? 0 : 8);
        appCompatCheckBox.setOnCheckedChangeListener(new d83(1, this));
        gw0.w(new g56(new d53(A0().f, 12), new a0e(this, null), 1), ze8.c(this));
    }

    @Override // defpackage.u1g
    public final void k(q1g q1gVar) {
        z0().k(q1gVar);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog v0() throws Resources.NotFoundException {
        vzd vzdVar = new vzd(k0(), r5d.UiUtils_LightBottomSheetDialog);
        vzdVar.t0 = true;
        vzdVar.g().K(3);
        vzdVar.g().I(true);
        vzdVar.g().J = true;
        BottomSheetBehavior bottomSheetBehaviorG = vzdVar.g();
        bottomSheetBehaviorG.K = false;
        bottomSheetBehaviorG.H(true);
        vzdVar.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: qzd
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k18] */
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.a;
                scheduledSendPickerDialogFragment.B0(new szd((Parcelable) scheduledSendPickerDialogFragment.C1.getValue()));
                return false;
            }
        });
        return vzdVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final wzd z0() {
        return (wzd) this.E1.getValue();
    }
}
