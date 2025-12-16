package com.google.android.play.core.splitinstall.internal;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class m0 extends n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f358787a;

    /* renamed from: b, reason: collision with root package name */
    public final long f358788b;

    public m0(int i12, long j12) {
        this.f358787a = i12;
        this.f358788b = j12;
    }

    @Override // com.google.android.play.core.splitinstall.internal.n0
    public final int a() {
        return this.f358787a;
    }

    @Override // com.google.android.play.core.splitinstall.internal.n0
    public final long b() {
        return this.f358788b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            if (this.f358787a == n0Var.a() && this.f358788b == n0Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i12 = (this.f358787a ^ 1000003) * 1000003;
        long j12 = this.f358788b;
        return i12 ^ ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f358787a);
        sb2.append(", eventTimestamp=");
        return AK.c.j(this.f358788b, "}", sb2);
    }
}
