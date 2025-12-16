package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class C5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f354548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f354549c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f354550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D5 f354551e;

    public C5(D5 d52, String str, String str2, Bundle bundle) {
        this.f354548b = str;
        this.f354549c = str2;
        this.f354550d = bundle;
        this.f354551e = d52;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        D5 d52 = this.f354551e;
        N5 n5P = d52.f354559a.P();
        C36997w5 c36997w5 = d52.f354559a;
        ((com.google.android.gms.common.util.k) c36997w5.zzb()).getClass();
        zzbe zzbeVarS = n5P.s(this.f354549c, this.f354550d, "auto", System.currentTimeMillis(), false);
        C36729v.j(zzbeVarS);
        c36997w5.l(zzbeVarS, this.f354548b);
    }
}
