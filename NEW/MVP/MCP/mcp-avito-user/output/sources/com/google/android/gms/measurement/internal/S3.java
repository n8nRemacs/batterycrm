package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class S3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f354900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f354901c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f354902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f354903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354904f;

    public S3(C36967s3 c36967s3, AtomicReference atomicReference, String str, String str2, boolean z12) {
        this.f354900b = atomicReference;
        this.f354901c = str;
        this.f354902d = str2;
        this.f354903e = z12;
        this.f354904f = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f354904f.f355183a.n().B(this.f354900b, this.f354901c, this.f354902d, this.f354903e);
    }
}
