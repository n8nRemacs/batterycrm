package com.avito.android.delivery_tarifikator.domain;

import java.util.List;
import kotlin.Metadata;

/* compiled from: TarifikatorSettingsDiffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/H;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<Ov.g> f135241a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<Ov.g> f135242b;

    public H(@Y61.k List<Ov.g> list, @Y61.k List<Ov.g> list2) {
        this.f135241a = list;
        this.f135242b = list2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h12 = (H) obj;
        return kotlin.jvm.internal.L.f(this.f135241a, h12.f135241a) && kotlin.jvm.internal.L.f(this.f135242b, h12.f135242b);
    }

    public final int hashCode() {
        return this.f135242b.hashCode() + (this.f135241a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SettingsDifferSource(originalSettings=");
        sb2.append(this.f135241a);
        sb2.append(", currentSettings=");
        return androidx.compose.foundation.H.p(sb2, this.f135242b, ')');
    }
}
