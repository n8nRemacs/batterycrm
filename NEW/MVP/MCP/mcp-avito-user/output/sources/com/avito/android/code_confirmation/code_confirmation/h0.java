package com.avito.android.code_confirmation.code_confirmation;

import java.util.Timer;
import java.util.concurrent.Future;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import qW.C47352a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class h0 implements l41.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f119552b;

    public /* synthetic */ h0(Object obj, int i12) {
        this.f119551a = i12;
        this.f119552b = obj;
    }

    @Override // l41.f
    public final void cancel() {
        switch (this.f119551a) {
            case 0:
                j0 j0Var = (j0) this.f119552b;
                j0Var.f119561b.unregisterReceiver(j0Var);
                break;
            case 1:
                ((V0) ((N0) this.f119552b)).c(null);
                break;
            case 2:
                C47352a c47352a = ((com.avito.android.location.find.g) this.f119552b).f181752a;
                if (c47352a.f429295i) {
                    c47352a.f429290d.removeUpdates(c47352a);
                    c47352a.f429295i = false;
                    Timer timer = c47352a.f429292f;
                    if (timer != null) {
                        timer.cancel();
                        c47352a.f429292f = null;
                        break;
                    }
                }
                break;
            default:
                ((Future) this.f119552b).cancel(true);
                break;
        }
    }
}
