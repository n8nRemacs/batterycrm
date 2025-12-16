package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class Z2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbe f355006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f355007c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M2 f355008d;

    public Z2(M2 m22, zzbe zzbeVar, String str) {
        this.f355006b = zzbeVar;
        this.f355007c = str;
        this.f355008d = m22;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        M2 m22 = this.f355008d;
        m22.f354801a.Q();
        m22.f354801a.l(this.f355006b, this.f355007c);
    }
}
