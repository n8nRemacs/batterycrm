package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class Y3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f354994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354995c;

    public Y3(C36967s3 c36967s3, Boolean bool) {
        this.f354994b = bool;
        this.f354995c = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f354995c.A(this.f354994b, true);
    }
}
