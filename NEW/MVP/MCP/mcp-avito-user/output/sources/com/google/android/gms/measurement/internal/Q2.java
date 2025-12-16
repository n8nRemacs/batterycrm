package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class Q2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f354855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f354856c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f354857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f354858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M2 f354859f;

    public Q2(M2 m22, String str, String str2, String str3, long j12) {
        this.f354855b = str;
        this.f354856c = str2;
        this.f354857d = str3;
        this.f354858e = j12;
        this.f354859f = m22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f354856c;
        M2 m22 = this.f354859f;
        String str2 = this.f354855b;
        if (str2 == null) {
            C36997w5 c36997w5 = m22.f354801a;
            c36997w5.zzl().e();
            String str3 = c36997w5.f355436F;
            if (str3 == null || str3.equals(str)) {
                c36997w5.f355436F = str;
                c36997w5.f355435E = null;
                return;
            }
            return;
        }
        C36941o4 c36941o4 = new C36941o4(this.f354857d, str2, this.f354858e);
        C36997w5 c36997w52 = m22.f354801a;
        c36997w52.zzl().e();
        String str4 = c36997w52.f355436F;
        if (str4 != null) {
            str4.equals(str);
        }
        c36997w52.f355436F = str;
        c36997w52.f355435E = c36941o4;
    }
}
