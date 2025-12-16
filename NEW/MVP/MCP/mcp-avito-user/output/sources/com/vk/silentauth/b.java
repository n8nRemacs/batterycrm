package com.vk.silentauth;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SilentAuthInfoWithProviderWeight.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/silentauth/b;", "", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SilentAuthInfo f367211a;

    /* renamed from: b, reason: collision with root package name */
    public final int f367212b;

    public b(@k SilentAuthInfo silentAuthInfo, int i12) {
        this.f367211a = silentAuthInfo;
        this.f367212b = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f367211a, bVar.f367211a) && this.f367212b == bVar.f367212b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f367212b) + (this.f367211a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "SilentAuthInfoWithProviderWeight(info=" + this.f367211a + ", providerWeight=" + this.f367212b + ")";
    }
}
