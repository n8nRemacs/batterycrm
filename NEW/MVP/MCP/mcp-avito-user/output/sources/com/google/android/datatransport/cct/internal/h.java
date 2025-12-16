package com.google.android.datatransport.cct.internal;

/* compiled from: AutoValue_LogResponse.java */
/* loaded from: classes10.dex */
final class h extends m {

    /* renamed from: a, reason: collision with root package name */
    public final long f343046a;

    public h(long j12) {
        this.f343046a = j12;
    }

    @Override // com.google.android.datatransport.cct.internal.m
    public final long b() {
        return this.f343046a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof m) && this.f343046a == ((m) obj).b();
    }

    public final int hashCode() {
        long j12 = this.f343046a;
        return ((int) ((j12 >>> 32) ^ j12)) ^ 1000003;
    }

    public final String toString() {
        return AK.c.j(this.f343046a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
