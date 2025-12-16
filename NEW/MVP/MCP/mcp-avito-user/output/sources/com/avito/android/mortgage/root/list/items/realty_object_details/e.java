package com.avito.android.mortgage.root.list.items.realty_object_details;

import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RealtyObjectDetailsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/realty_object_details/e;", "La10/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e implements InterfaceC19665b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f202775b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final b f202776c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f202777d;

    public e(@Y61.k String str, @Y61.k b bVar, @Y61.k a aVar) {
        this.f202775b = str;
        this.f202776c = bVar;
        this.f202777d = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f202775b, eVar.f202775b) && L.f(this.f202776c, eVar.f202776c) && L.f(this.f202777d, eVar.f202777d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183509b() {
        return this.f202775b;
    }

    public final int hashCode() {
        return this.f202777d.hashCode() + ((this.f202776c.hashCode() + (this.f202775b.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "RealtyObjectDetailsItem(stringId=" + this.f202775b + ", isAvitoItemBlock=" + this.f202776c + ", detailsBlock=" + this.f202777d + ')';
    }
}
