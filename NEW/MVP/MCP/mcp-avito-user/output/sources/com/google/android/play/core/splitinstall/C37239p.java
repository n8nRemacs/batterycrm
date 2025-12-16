package com.google.android.play.core.splitinstall;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37239p implements com.google.android.play.core.splitinstall.internal.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.core.splitinstall.internal.b0 f358829a;

    public C37239p(com.google.android.play.core.splitinstall.internal.b0 b0Var) {
        this.f358829a = b0Var;
    }

    @Override // com.google.android.play.core.splitinstall.internal.b0
    public final Object zza() {
        a0 a0Var = (a0) this.f358829a.zza();
        if (a0Var != null) {
            return a0Var;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
