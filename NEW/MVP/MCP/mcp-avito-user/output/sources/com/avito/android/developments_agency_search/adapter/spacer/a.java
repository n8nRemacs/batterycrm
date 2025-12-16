package com.avito.android.developments_agency_search.adapter.spacer;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: SpacerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/spacer/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f136312b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f136313c = UUID.randomUUID().toString();

    public a(int i12) {
        this.f136312b = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f136312b == ((a) obj).f136312b;
    }

    @Override // TV0.a
    public final long getId() {
        return getF132315b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF132315b() {
        return this.f136313c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f136312b);
    }

    @k
    public final String toString() {
        return r.t(new StringBuilder("SpacerItem(heightDp="), this.f136312b, ')');
    }
}
