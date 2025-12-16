package com.avito.android.select.sectioned_multiselect.tab;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TabListPayloadCreator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/tab/a;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f266704a;

    public a(@Y61.k List<com.avito.android.select.sectioned_multiselect.Items.section_item.a> list) {
        this.f266704a = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f266704a, ((a) obj).f266704a);
    }

    public final int hashCode() {
        return this.f266704a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.n(new StringBuilder("SectionListItemPayload(changedItems="), this.f266704a, ')');
    }
}
