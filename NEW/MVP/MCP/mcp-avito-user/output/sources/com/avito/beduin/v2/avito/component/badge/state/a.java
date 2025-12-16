package com.avito.beduin.v2.avito.component.badge.state;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoBadgeState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/badge/state/a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f333792a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.r f333793b;

    public a(float f12, @Y61.k com.avito.beduin.v2.theme.r rVar) {
        this.f333792a = f12;
        this.f333793b = rVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f333792a, aVar.f333792a) == 0 && L.f(this.f333793b, aVar.f333793b);
    }

    public final int hashCode() {
        return this.f333793b.hashCode() + (Float.hashCode(this.f333792a) * 31);
    }

    @Y61.k
    public final String toString() {
        return "AvitoBadgeBorderState(thickness=" + this.f333792a + ", color=" + this.f333793b + ')';
    }
}
