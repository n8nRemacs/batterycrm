package com.avito.android.publish.slots.sleeping_places.item;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SelectedBedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SleepingPlacesSlotItemPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/item/d;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final List<SelectedBedType> f244885a;

    public d(@Y61.l List<SelectedBedType> list) {
        this.f244885a = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f244885a, ((d) obj).f244885a);
    }

    public final int hashCode() {
        List<SelectedBedType> list = this.f244885a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.p(new StringBuilder("SleepingPlacesSlotItemPayload(selectedBedTypes="), this.f244885a, ')');
    }
}
