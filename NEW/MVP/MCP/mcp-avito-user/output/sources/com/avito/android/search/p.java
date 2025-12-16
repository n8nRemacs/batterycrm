package com.avito.android.search;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/p;", "", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f263833a;

    public p(@Y61.l String str) {
        this.f263833a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && L.f(this.f263833a, ((p) obj).f263833a);
    }

    public final int hashCode() {
        String str = this.f263833a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("SuggestionsRemoteParams(xSgt="), this.f263833a, ')');
    }
}
