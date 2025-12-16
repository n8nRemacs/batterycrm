package com.avito.android.hotel_booking.enter_data.konveyor.input;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EnterDataInputItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/konveyor/input/c;", "Lcom/avito/conveyor_item/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f163507b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f163508c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f163509d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f163510e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f163511f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final j f163512g;

    public c(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k j jVar) {
        this.f163507b = str;
        this.f163508c = str2;
        this.f163509d = str3;
        this.f163510e = str4;
        this.f163511f = str5;
        this.f163512g = jVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f163507b, cVar.f163507b) && L.f(this.f163508c, cVar.f163508c) && L.f(this.f163509d, cVar.f163509d) && L.f(this.f163510e, cVar.f163510e) && L.f(this.f163511f, cVar.f163511f) && L.f(this.f163512g, cVar.f163512g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF139156b() {
        return getF162559g().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF162559g() {
        return this.f163507b;
    }

    public final int hashCode() {
        int iHashCode = this.f163507b.hashCode() * 31;
        String str = this.f163508c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f163509d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f163510e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f163511f;
        return this.f163512g.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "EnterDataInputItem(stringId=" + this.f163507b + ", inputId=" + this.f163508c + ", groupId=" + this.f163509d + ", text=" + this.f163510e + ", hint=" + this.f163511f + ", state=" + this.f163512g + ')';
    }
}
