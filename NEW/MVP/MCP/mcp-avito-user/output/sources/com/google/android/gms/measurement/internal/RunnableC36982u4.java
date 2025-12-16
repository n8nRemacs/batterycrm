package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.u4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36982u4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36941o4 f355399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f355400c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36934n4 f355401d;

    public RunnableC36982u4(C36934n4 c36934n4, C36941o4 c36941o4, long j12) {
        this.f355399b = c36941o4;
        this.f355400c = j12;
        this.f355401d = c36934n4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36934n4 c36934n4 = this.f355401d;
        c36934n4.t(this.f355399b, false, this.f355400c);
        c36934n4.f355279e = null;
        c36934n4.f355183a.n().s(null);
    }
}
