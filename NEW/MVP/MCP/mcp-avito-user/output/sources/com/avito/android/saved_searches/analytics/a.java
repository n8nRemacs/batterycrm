package com.avito.android.saved_searches.analytics;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchEntryPointsVisibilityTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/analytics/a;", "", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f258254a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SavedSearchFromPageType f258255b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SavedSearchEntryPointType f258256c;

    public a(@l String str, @k SavedSearchFromPageType savedSearchFromPageType, @k SavedSearchEntryPointType savedSearchEntryPointType) {
        this.f258254a = str;
        this.f258255b = savedSearchFromPageType;
        this.f258256c = savedSearchEntryPointType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f258254a, aVar.f258254a) && this.f258255b == aVar.f258255b && this.f258256c == aVar.f258256c;
    }

    public final int hashCode() {
        String str = this.f258254a;
        return this.f258256c.hashCode() + ((this.f258255b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "Data(cid=" + this.f258254a + ", fromPage=" + this.f258255b + ", entryPoint=" + this.f258256c + ')';
    }
}
