package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;

/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: classes10.dex */
final class b extends BackendResponse {

    /* renamed from: a, reason: collision with root package name */
    public final BackendResponse.Status f343094a;

    /* renamed from: b, reason: collision with root package name */
    public final long f343095b;

    public b(BackendResponse.Status status, long j12) {
        this.f343094a = status;
        this.f343095b = j12;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final long b() {
        return this.f343095b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final BackendResponse.Status c() {
        return this.f343094a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.f343094a.equals(backendResponse.c()) && this.f343095b == backendResponse.b();
    }

    public final int hashCode() {
        int iHashCode = (this.f343094a.hashCode() ^ 1000003) * 1000003;
        long j12 = this.f343095b;
        return iHashCode ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(this.f343094a);
        sb2.append(", nextRequestWaitMillis=");
        return AK.c.j(this.f343095b, "}", sb2);
    }
}
