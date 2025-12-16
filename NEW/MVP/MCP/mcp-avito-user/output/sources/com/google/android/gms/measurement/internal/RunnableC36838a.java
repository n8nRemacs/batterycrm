package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36838a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f355014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f355015c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C37005y f355016d;

    public RunnableC36838a(C37005y c37005y, String str, long j12) {
        this.f355014b = str;
        this.f355015c = j12;
        this.f355016d = c37005y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C37005y.l(this.f355016d, this.f355014b, this.f355015c);
    }
}
