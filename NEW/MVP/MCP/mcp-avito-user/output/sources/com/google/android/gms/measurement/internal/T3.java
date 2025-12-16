package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class T3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f354915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f354916c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f354917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354918e;

    public T3(C36967s3 c36967s3, AtomicReference atomicReference, String str, String str2) {
        this.f354915b = atomicReference;
        this.f354916c = str;
        this.f354917d = str2;
        this.f354918e = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f354918e.f355183a.n().A(this.f354915b, this.f354916c, this.f354917d);
    }
}
