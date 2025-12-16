package com.avito.beduin.v2.repository.screen_lifecycle;

import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: ConfigChange.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/repository/screen_lifecycle/b;", "", "screen-lifecycle_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Lifecycle.Event f338300a;

    public b(@Y61.k Lifecycle.Event event) {
        this.f338300a = event;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f338300a == ((b) obj).f338300a;
    }

    public final int hashCode() {
        return this.f338300a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "ConfigChange(startedFrom=" + this.f338300a + ')';
    }
}
