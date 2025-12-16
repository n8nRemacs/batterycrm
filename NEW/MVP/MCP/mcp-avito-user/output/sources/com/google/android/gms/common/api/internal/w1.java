package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public abstract class w1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f349245c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f349246d;

    /* renamed from: e, reason: collision with root package name */
    public final zau f349247e;

    /* renamed from: f, reason: collision with root package name */
    public final C36687f f349248f;

    @j.k0
    public w1(InterfaceC36656m interfaceC36656m, C36687f c36687f) {
        super(interfaceC36656m);
        this.f349246d = new AtomicReference(null);
        this.f349247e = new zau(Looper.getMainLooper());
        this.f349248f = c36687f;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d(int i12, int i13, Intent intent) {
        AtomicReference atomicReference = this.f349246d;
        t1 t1Var = (t1) atomicReference.get();
        if (i12 != 1) {
            if (i12 == 2) {
                int iC2 = this.f349248f.c(C36688g.f349288a, b());
                if (iC2 == 0) {
                    atomicReference.set(null);
                    l();
                    return;
                } else {
                    if (t1Var == null) {
                        return;
                    }
                    if (t1Var.f349215b.f348860c == 18 && iC2 == 18) {
                        return;
                    }
                }
            }
        } else if (i13 == -1) {
            atomicReference.set(null);
            l();
            return;
        } else if (i13 == 0) {
            if (t1Var != null) {
                ConnectionResult connectionResult = new ConnectionResult(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, t1Var.f349215b.toString());
                atomicReference.set(null);
                k(connectionResult, t1Var.f349214a);
                return;
            }
            return;
        }
        if (t1Var != null) {
            atomicReference.set(null);
            k(t1Var.f349215b, t1Var.f349214a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(@j.P Bundle bundle) {
        if (bundle != null) {
            this.f349246d.set(bundle.getBoolean("resolving_error", false) ? new t1(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h(Bundle bundle) {
        t1 t1Var = (t1) this.f349246d.get();
        if (t1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", t1Var.f349214a);
        ConnectionResult connectionResult = t1Var.f349215b;
        bundle.putInt("failed_status", connectionResult.f348860c);
        bundle.putParcelable("failed_resolution", connectionResult.f348861d);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void i() {
        this.f349245c = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        this.f349245c = false;
    }

    public abstract void k(ConnectionResult connectionResult, int i12);

    public abstract void l();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        AtomicReference atomicReference = this.f349246d;
        t1 t1Var = (t1) atomicReference.get();
        int i12 = t1Var == null ? -1 : t1Var.f349214a;
        atomicReference.set(null);
        k(connectionResult, i12);
    }
}
