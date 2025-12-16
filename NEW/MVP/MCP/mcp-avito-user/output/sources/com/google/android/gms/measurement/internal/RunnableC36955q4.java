package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.q4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36955q4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f355330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36941o4 f355331c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36941o4 f355332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f355333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C36934n4 f355334f;

    public RunnableC36955q4(C36934n4 c36934n4, Bundle bundle, C36941o4 c36941o4, C36941o4 c36941o42, long j12) {
        this.f355330b = bundle;
        this.f355331c = c36941o4;
        this.f355332d = c36941o42;
        this.f355333e = j12;
        this.f355334f = c36934n4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36934n4.r(this.f355334f, this.f355330b, this.f355331c, this.f355332d, this.f355333e);
    }
}
