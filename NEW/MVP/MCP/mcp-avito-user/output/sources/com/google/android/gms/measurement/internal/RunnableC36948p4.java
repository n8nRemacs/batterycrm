package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.p4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36948p4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36941o4 f355308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36941o4 f355309c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f355310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f355311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C36934n4 f355312f;

    public RunnableC36948p4(C36934n4 c36934n4, C36941o4 c36941o4, C36941o4 c36941o42, long j12, boolean z12) {
        this.f355308b = c36941o4;
        this.f355309c = c36941o42;
        this.f355310d = j12;
        this.f355311e = z12;
        this.f355312f = c36934n4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f355312f.s(this.f355308b, this.f355309c, this.f355310d, this.f355311e, null);
    }
}
