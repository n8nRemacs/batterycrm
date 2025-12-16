package com.google.android.exoplayer2;

/* compiled from: RendererConfiguration.java */
/* loaded from: classes6.dex */
public final class j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f345444b = new j0(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f345445a;

    public j0(boolean z12) {
        this.f345445a = z12;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && j0.class == obj.getClass() && this.f345445a == ((j0) obj).f345445a;
    }

    public final int hashCode() {
        return !this.f345445a ? 1 : 0;
    }
}
