package com.avito.beduin.v2.theme;

import com.avito.beduin.v2.theme.m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Value.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/theme/B;", "Lcom/avito/beduin/v2/theme/m;", "T", "Lcom/avito/beduin/v2/theme/l;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class B<T extends m> implements l<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final T f338348a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f338349b;

    public B(@Y61.k T t12) {
        this.f338348a = t12;
        this.f338349b = t12.getF335453b();
    }

    @Override // com.avito.beduin.v2.theme.l
    @Y61.k
    public final T a() {
        return this.f338348a;
    }

    @Override // com.avito.beduin.v2.theme.l
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF338349b() {
        return this.f338349b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && L.f(this.f338348a, ((B) obj).f338348a);
    }

    public final int hashCode() {
        return this.f338348a.hashCode();
    }

    @Override // com.avito.beduin.v2.theme.l
    public final boolean isEmpty() {
        return false;
    }

    @Y61.k
    public final String toString() {
        return "Value(value=" + this.f338348a + ')';
    }
}
