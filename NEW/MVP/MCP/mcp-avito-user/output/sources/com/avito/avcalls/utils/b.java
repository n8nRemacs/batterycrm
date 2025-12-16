package com.avito.avcalls.utils;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BuildInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/utils/b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f333651a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f333652b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f333653c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f333654d;

    public b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12) {
        Platform platform = Platform.f333648b;
        this.f333651a = str;
        this.f333652b = str2;
        this.f333653c = str3;
        this.f333654d = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f333651a.equals(bVar.f333651a) || !this.f333652b.equals(bVar.f333652b) || !L.f(this.f333653c, bVar.f333653c) || this.f333654d != bVar.f333654d) {
            return false;
        }
        Platform platform = Platform.f333648b;
        return true;
    }

    public final int hashCode() {
        return Platform.f333648b.hashCode() + r.i(H.d(H.d(this.f333651a.hashCode() * 31, 31, this.f333652b), 31, this.f333653c), 31, this.f333654d);
    }

    @Y61.k
    public final String toString() {
        return "BuildInfo(packageName=" + this.f333651a + ", appVersion=" + this.f333652b + ", sdkVersion=" + this.f333653c + ", isRelease=" + this.f333654d + ", platform=" + Platform.f333648b + ')';
    }
}
