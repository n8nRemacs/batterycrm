package com.avito.beduin.v2.interaction.navigation.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BackInteraction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/a;", "LdU0/b;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.interaction.navigation.flow.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C36326a implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final u f337513a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.a<dU0.f> f337514b;

    /* JADX WARN: Multi-variable type inference failed */
    public C36326a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36326a)) {
            return false;
        }
        C36326a c36326a = (C36326a) obj;
        return L.f(this.f337513a, c36326a.f337513a) && L.f(this.f337514b, c36326a.f337514b);
    }

    public final int hashCode() {
        u uVar = this.f337513a;
        int iHashCode = (uVar == null ? 0 : uVar.hashCode()) * 31;
        Y41.a<dU0.f> aVar = this.f337514b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackInteraction(toScreen=");
        sb2.append(this.f337513a);
        sb2.append(", onEmptyBackStack=");
        return androidx.appcompat.app.r.v(sb2, this.f337514b, ')');
    }

    public C36326a(@Y61.l u uVar, @Y61.l Y41.a<dU0.f> aVar) {
        this.f337513a = uVar;
        this.f337514b = aVar;
    }

    public /* synthetic */ C36326a(u uVar, Y41.a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : uVar, (i12 & 2) != 0 ? null : aVar);
    }
}
