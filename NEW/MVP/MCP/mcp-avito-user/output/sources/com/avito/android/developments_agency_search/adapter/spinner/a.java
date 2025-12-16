package com.avito.android.developments_agency_search.adapter.spinner;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SpinnerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/spinner/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f136320b;

    public a(@k String str) {
        this.f136320b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f136320b, ((a) obj).f136320b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return getF131428d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF131428d() {
        return this.f136320b;
    }

    public final int hashCode() {
        return this.f136320b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("SpinnerItem(stringId="), this.f136320b, ')');
    }
}
