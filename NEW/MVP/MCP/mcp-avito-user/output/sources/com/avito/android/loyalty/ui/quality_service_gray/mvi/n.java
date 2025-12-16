package com.avito.android.loyalty.ui.quality_service_gray.mvi;

import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceGrayScreenData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/mvi/n;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f184145a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final IW.b f184146b;

    public n(@Y61.k ArrayList arrayList, @Y61.l IW.b bVar) {
        this.f184145a = arrayList;
        this.f184146b = bVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f184145a.equals(nVar.f184145a) && L.f(this.f184146b, nVar.f184146b);
    }

    public final int hashCode() {
        int iHashCode = this.f184145a.hashCode() * 31;
        IW.b bVar = this.f184146b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "QualityServiceGrayScreenData(items=" + this.f184145a + ", analyticsInfo=" + this.f184146b + ')';
    }
}
