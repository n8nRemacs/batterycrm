package com.avito.android.reputation.ui.items.reputation_header;

import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReputationHeaderState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_header/i;", "", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f254887a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final r f254888b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final r f254889c;

    public i(int i12, @Y61.l r rVar, @Y61.l r rVar2) {
        this.f254887a = i12;
        this.f254888b = rVar;
        this.f254889c = rVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f254887a == iVar.f254887a && L.f(this.f254888b, iVar.f254888b) && L.f(this.f254889c, iVar.f254889c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f254887a) * 31;
        r rVar = this.f254888b;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        r rVar2 = this.f254889c;
        return iHashCode2 + (rVar2 != null ? rVar2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ReputationHeaderState(circleRadius=" + this.f254887a + ", leftColor=" + this.f254888b + ", rightColor=" + this.f254889c + ')';
    }
}
