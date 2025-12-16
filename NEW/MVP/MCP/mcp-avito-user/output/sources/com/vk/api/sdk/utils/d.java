package com.vk.api.sdk.utils;

import android.graphics.Point;
import androidx.compose.foundation.H;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: DefaultUserAgent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/api/sdk/utils/d;", "Lcom/vk/api/sdk/utils/k;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class d implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f366710a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f366711b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Point f366712c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f366713d = C42727D.c(new c(this));

    public d(@Y61.k String str, @Y61.k String str2, @Y61.k Point point) {
        this.f366710a = str;
        this.f366711b = str2;
        this.f366712c = point;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        dVar.getClass();
        return this.f366710a.equals(dVar.f366710a) && this.f366711b.equals(dVar.f366711b) && this.f366712c.equals(dVar.f366712c);
    }

    public final int hashCode() {
        return this.f366712c.hashCode() + H.d(H.d(-61246432, 31, this.f366710a), 31, this.f366711b);
    }

    @Y61.k
    public final String toString() {
        return "DefaultUserAgent(prefix=VKAndroidSDK, appVersion=" + this.f366710a + ", appBuild=" + this.f366711b + ", displaySize=" + this.f366712c + ')';
    }
}
