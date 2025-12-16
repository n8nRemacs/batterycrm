package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class K3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f354758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f354759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f354760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f354761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354762f;

    public K3(C36967s3 c36967s3, String str, String str2, Object obj, long j12) {
        this.f354758b = str;
        this.f354759c = str2;
        this.f354760d = obj;
        this.f354761e = j12;
        this.f354762f = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f354760d;
        this.f354762f.o(this.f354761e, obj, this.f354758b, this.f354759c);
    }
}
