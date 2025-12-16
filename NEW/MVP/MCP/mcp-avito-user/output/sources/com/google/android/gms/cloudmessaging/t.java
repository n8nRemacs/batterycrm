package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes6.dex */
abstract class t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f348839a;

    /* renamed from: b, reason: collision with root package name */
    public final C37028k<T> f348840b = new C37028k<>();

    /* renamed from: c, reason: collision with root package name */
    public final int f348841c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f348842d;

    public t(int i12, int i13, Bundle bundle) {
        this.f348839a = i12;
        this.f348841c = i13;
        this.f348842d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzqVar);
            new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
        }
        this.f348840b.a(zzqVar);
    }

    public final void d(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(bundle);
            new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
        }
        this.f348840b.b(bundle);
    }

    public final String toString() {
        StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(55, "Request { what=");
        sbQ.append(this.f348841c);
        sbQ.append(" id=");
        sbQ.append(this.f348839a);
        sbQ.append(" oneWay=");
        return androidx.appcompat.app.r.s("}", sbQ, b());
    }
}
