package com.avito.android.publish.details.adapter.historical_suggest.new_suggest;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HistoricalSuggestsNewItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/adapter/historical_suggest/new_suggest/k;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class k implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f233278b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AddressParameter.Value f233279c;

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f233278b, kVar.f233278b) && L.f(this.f233279c, kVar.f233279c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322716b() {
        return getF233278b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF233278b() {
        return this.f233278b;
    }

    public final int hashCode() {
        int iHashCode = this.f233278b.hashCode() * 31;
        AddressParameter.Value value = this.f233279c;
        return iHashCode + (value == null ? 0 : value.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "HistoricalSuggestsNewItem(stringId=" + this.f233278b + ", selectedAddress=" + this.f233279c + ')';
    }

    public k(@l AddressParameter.Value value, @Y61.k String str) {
        this.f233278b = str;
        this.f233279c = value;
    }

    public /* synthetic */ k(String str, AddressParameter.Value value, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? null : value, (i12 & 1) != 0 ? "historicalSuggestsNew" : str);
    }
}
