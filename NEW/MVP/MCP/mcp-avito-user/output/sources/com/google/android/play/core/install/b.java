package com.google.android.play.core.install;

import JY0.c;
import JY0.d;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class b extends InstallState {

    /* renamed from: a, reason: collision with root package name */
    public final int f358563a;

    /* renamed from: b, reason: collision with root package name */
    public final long f358564b;

    /* renamed from: c, reason: collision with root package name */
    public final long f358565c;

    /* renamed from: d, reason: collision with root package name */
    public final int f358566d;

    /* renamed from: e, reason: collision with root package name */
    public final String f358567e;

    public b(int i12, int i13, long j12, long j13, String str) {
        this.f358563a = i12;
        this.f358564b = j12;
        this.f358565c = j13;
        this.f358566d = i13;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f358567e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long a() {
        return this.f358564b;
    }

    @Override // com.google.android.play.core.install.InstallState
    @c
    public final int b() {
        return this.f358566d;
    }

    @Override // com.google.android.play.core.install.InstallState
    @d
    public final int c() {
        return this.f358563a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String d() {
        return this.f358567e;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long e() {
        return this.f358565c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.f358563a == installState.c() && this.f358564b == installState.a() && this.f358565c == installState.e() && this.f358566d == installState.b() && this.f358567e.equals(installState.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i12 = this.f358563a ^ 1000003;
        long j12 = this.f358564b;
        long j13 = this.f358565c;
        return (((((((i12 * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003) ^ this.f358566d) * 1000003) ^ this.f358567e.hashCode();
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f358563a + ", bytesDownloaded=" + this.f358564b + ", totalBytesToDownload=" + this.f358565c + ", installErrorCode=" + this.f358566d + ", packageName=" + this.f358567e + "}";
    }
}
