package com.avito.android.analytics.event;

import kotlin.Metadata;

/* compiled from: SavedSearchesCounter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/x0;", "", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.event.x0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C28449x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f90147a;

    public C28449x0(int i12) {
        this.f90147a = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28449x0) && this.f90147a == ((C28449x0) obj).f90147a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90147a);
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("SavedSearchesCounter(unreadCount="), this.f90147a, ')');
    }
}
