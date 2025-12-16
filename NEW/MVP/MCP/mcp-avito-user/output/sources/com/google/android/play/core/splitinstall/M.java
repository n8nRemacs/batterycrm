package com.google.android.play.core.splitinstall;

import android.content.Context;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class M implements com.google.android.play.core.splitinstall.internal.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C37235l f358689a;

    public M(C37235l c37235l) {
        this.f358689a = c37235l;
    }

    @Override // com.google.android.play.core.splitinstall.internal.b0
    public final Object zza() {
        Context context = this.f358689a.f358819a.f358814a;
        return new L(context, context.getPackageName());
    }
}
