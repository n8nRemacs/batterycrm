package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.internal.C36729v;
import java.io.Closeable;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class O implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f362329b;

    public /* synthetic */ O(q qVar, N n12) {
        this.f362329b = qVar;
        C36729v.m(((Thread) qVar.f362385d.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        q qVar = this.f362329b;
        qVar.f362385d.set(null);
        qVar.b();
    }
}
