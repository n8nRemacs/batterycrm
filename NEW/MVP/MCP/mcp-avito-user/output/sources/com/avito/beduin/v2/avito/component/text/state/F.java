package com.avito.beduin.v2.avito.component.text.state;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoWebViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/text/state/F;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f335324a;

    public F(@Y61.k String str) {
        this.f335324a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F) && L.f(this.f335324a, ((F) obj).f335324a);
    }

    public final int hashCode() {
        return this.f335324a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("LoadingPlaceholder(title="), this.f335324a, ')');
    }
}
