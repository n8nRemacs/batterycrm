package com.avito.android.bxcontent;

import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BxContentCombinationState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/l;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C29099l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.mvi.entity.l f111141a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.map.mvi.entity.a f111142b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AbstractC40048c f111143c;

    public C29099l(@Y61.k com.avito.android.bxcontent.mvi.entity.l lVar, @Y61.l com.avito.android.map.mvi.entity.a aVar, @Y61.l AbstractC40048c abstractC40048c) {
        this.f111141a = lVar;
        this.f111142b = aVar;
        this.f111143c = abstractC40048c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29099l)) {
            return false;
        }
        C29099l c29099l = (C29099l) obj;
        return kotlin.jvm.internal.L.f(this.f111141a, c29099l.f111141a) && kotlin.jvm.internal.L.f(this.f111142b, c29099l.f111142b) && kotlin.jvm.internal.L.f(this.f111143c, c29099l.f111143c);
    }

    public final int hashCode() {
        int iHashCode = this.f111141a.hashCode() * 31;
        com.avito.android.map.mvi.entity.a aVar = this.f111142b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        AbstractC40048c abstractC40048c = this.f111143c;
        return iHashCode2 + (abstractC40048c != null ? abstractC40048c.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "BxContentCombinationState(bxContentState=" + this.f111141a + ", mapState=" + this.f111142b + ", beduinState=" + this.f111143c + ')';
    }

    public /* synthetic */ C29099l(com.avito.android.bxcontent.mvi.entity.l lVar, com.avito.android.map.mvi.entity.a aVar, AbstractC40048c abstractC40048c, int i12, C42822w c42822w) {
        this(lVar, (i12 & 2) != 0 ? null : aVar, (i12 & 4) != 0 ? null : abstractC40048c);
    }
}
