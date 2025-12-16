package com.avito.android.mortgage.person_form.list.items.suggestion_banner.payloads;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.suggestion_banner.SuggestionBannerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestBannerPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/suggestion_banner/payloads/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SuggestionBannerItem f200811a;

    public a(@k SuggestionBannerItem suggestionBannerItem) {
        this.f200811a = suggestionBannerItem;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f200811a, ((a) obj).f200811a);
    }

    public final int hashCode() {
        return this.f200811a.hashCode();
    }

    @k
    public final String toString() {
        return "SuggestBannerPayload(item=" + this.f200811a + ')';
    }
}
