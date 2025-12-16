package com.google.android.play.core.splitinstall;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37238o implements com.google.android.play.core.splitinstall.internal.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C37234k f358828a;

    public C37238o(C37234k c37234k) {
        this.f358828a = c37234k;
    }

    @Override // com.google.android.play.core.splitinstall.internal.b0
    public final Object zza() {
        l0 l0VarC = l0.c(this.f358828a.f358814a);
        if (l0VarC != null) {
            return l0VarC;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
