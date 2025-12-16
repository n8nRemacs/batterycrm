package com.avito.android.bxcontent;

import kotlin.AbstractC40048c;
import kotlin.Metadata;

/* compiled from: BxContentCombinationState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/q;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C29244q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.mvi.entity.q f112815a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.map.mvi.entity.b f112816b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AbstractC40048c f112817c;

    public C29244q(@Y61.k com.avito.android.bxcontent.mvi.entity.q qVar, @Y61.l com.avito.android.map.mvi.entity.b bVar, @Y61.l AbstractC40048c abstractC40048c) {
        this.f112815a = qVar;
        this.f112816b = bVar;
        this.f112817c = abstractC40048c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29244q)) {
            return false;
        }
        C29244q c29244q = (C29244q) obj;
        return kotlin.jvm.internal.L.f(this.f112815a, c29244q.f112815a) && kotlin.jvm.internal.L.f(this.f112816b, c29244q.f112816b) && kotlin.jvm.internal.L.f(this.f112817c, c29244q.f112817c);
    }

    public final int hashCode() {
        int iHashCode = this.f112815a.hashCode() * 31;
        com.avito.android.map.mvi.entity.b bVar = this.f112816b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        AbstractC40048c abstractC40048c = this.f112817c;
        return iHashCode2 + (abstractC40048c != null ? abstractC40048c.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "BxContentCombinationViewState(bxContentViewState=" + this.f112815a + ", mapViewState=" + this.f112816b + ", beduinState=" + this.f112817c + ')';
    }
}
