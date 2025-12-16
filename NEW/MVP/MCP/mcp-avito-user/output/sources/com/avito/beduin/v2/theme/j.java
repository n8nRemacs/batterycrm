package com.avito.beduin.v2.theme;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Optional.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/theme/j;", "T", "Lcom/avito/beduin/v2/theme/f;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class j<T> implements f<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f338362a;

    public j(T t12) {
        this.f338362a = t12;
    }

    @Override // com.avito.beduin.v2.theme.f
    public final T a() {
        return this.f338362a;
    }

    @Override // com.avito.beduin.v2.theme.f
    public final T c(@Y61.k Y41.a<? extends T> aVar) {
        return this.f338362a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && L.f(this.f338362a, ((j) obj).f338362a);
    }

    @Override // com.avito.beduin.v2.theme.f
    public final T get() {
        return this.f338362a;
    }

    public final int hashCode() {
        T t12 = this.f338362a;
        if (t12 == null) {
            return 0;
        }
        return t12.hashCode();
    }

    @Override // com.avito.beduin.v2.theme.f
    public final boolean isEmpty() {
        return false;
    }

    @Y61.k
    public final String toString() {
        return H.n(new StringBuilder("OptionalValue(value="), this.f338362a, ')');
    }

    @Override // com.avito.beduin.v2.theme.f
    @Y61.k
    public final f<T> b(@Y61.k f<T> fVar) {
        return this;
    }
}
