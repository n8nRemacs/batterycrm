package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class A0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f354506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f354507c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C37005y f354508d;

    public A0(C37005y c37005y, String str, long j12) {
        this.f354506b = str;
        this.f354507c = j12;
        this.f354508d = c37005y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C37005y.p(this.f354508d, this.f354506b, this.f354507c);
    }
}
