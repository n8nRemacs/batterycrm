package com.avito.avcalls.android.utils;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BuildInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/utils/b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f332426a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f332427b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f332428c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f332429d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f332430e;

    public b(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.k String str3, boolean z13) {
        Platform platform = Platform.f332423b;
        this.f332426a = str;
        this.f332427b = str2;
        this.f332428c = str3;
        this.f332429d = z12;
        this.f332430e = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f332426a.equals(bVar.f332426a) || !this.f332427b.equals(bVar.f332427b) || !L.f(this.f332428c, bVar.f332428c) || this.f332429d != bVar.f332429d || this.f332430e != bVar.f332430e) {
            return false;
        }
        Platform platform = Platform.f332423b;
        return true;
    }

    public final int hashCode() {
        return Platform.f332423b.hashCode() + r.i(r.i(H.d(H.d(this.f332426a.hashCode() * 31, 31, this.f332427b), 31, this.f332428c), 31, this.f332429d), 31, this.f332430e);
    }

    @Y61.k
    public final String toString() {
        return "BuildInfo(packageName=" + this.f332426a + ", appVersion=" + this.f332427b + ", sdkVersion=" + this.f332428c + ", isRelease=" + this.f332429d + ", isVideoSupported=" + this.f332430e + ", platform=" + Platform.f332423b + ')';
    }
}
