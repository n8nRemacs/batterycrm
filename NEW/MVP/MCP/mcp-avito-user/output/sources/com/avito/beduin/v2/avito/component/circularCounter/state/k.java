package com.avito.beduin.v2.avito.component.circularCounter.state;

import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.component.InterfaceC36248h;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Content.kt */
@InterfaceC36248h
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/circularCounter/state/k;", "Lcom/avito/beduin/v2/avito/component/circularCounter/state/g;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class k implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f334108a;

    public k(@Y61.k String str) {
        this.f334108a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && L.f(this.f334108a, ((k) obj).f334108a);
    }

    public final int hashCode() {
        return this.f334108a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("Text(value="), this.f334108a, ')');
    }
}
