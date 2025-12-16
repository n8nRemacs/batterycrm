package com.google.android.play.core.splitinstall;

import java.io.File;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37236m implements com.google.android.play.core.splitinstall.internal.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.core.splitinstall.internal.b0 f358824a;

    public C37236m(com.google.android.play.core.splitinstall.internal.b0 b0Var) {
        this.f358824a = b0Var;
    }

    @Override // com.google.android.play.core.splitinstall.internal.b0
    @j.P
    public final /* bridge */ /* synthetic */ Object zza() {
        File file = (File) this.f358824a.zza();
        if (file == null) {
            return null;
        }
        return com.google.android.play.core.splitinstall.testing.d.a(file);
    }
}
