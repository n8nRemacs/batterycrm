package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C36616a;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.u0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36672u0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36674v0 f349226b;

    public RunnableC36672u0(C36674v0 c36674v0) {
        this.f349226b = c36674v0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36616a.f fVar = this.f349226b.f349229a.f349233b;
        fVar.disconnect(fVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
