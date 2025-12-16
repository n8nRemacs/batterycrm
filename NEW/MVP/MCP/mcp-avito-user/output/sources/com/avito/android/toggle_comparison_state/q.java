package com.avito.android.toggle_comparison_state;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/toggle_comparison_state/q;", "", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f301631a;

    public q(@Y61.k String str) {
        this.f301631a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && L.f(this.f301631a, ((q) obj).f301631a);
    }

    public final int hashCode() {
        return this.f301631a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("ItemShort(id="), this.f301631a, ')');
    }
}
