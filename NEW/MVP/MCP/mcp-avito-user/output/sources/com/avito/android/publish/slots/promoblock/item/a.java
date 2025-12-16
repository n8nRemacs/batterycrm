package com.avito.android.publish.slots.promoblock.item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.promoblock.PromoblockSlotItemMargins;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoblockSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/promoblock/item/a;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f244717b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f244718c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f244719d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f244720e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f244721f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final PromoblockSlotItemMargins f244722g;

    public a(@k String str, @l String str2, @l String str3, @InterfaceC42150f @l Integer num, @l String str4, @l PromoblockSlotItemMargins promoblockSlotItemMargins) {
        this.f244717b = str;
        this.f244718c = str2;
        this.f244719d = str3;
        this.f244720e = num;
        this.f244721f = str4;
        this.f244722g = promoblockSlotItemMargins;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f244717b, aVar.f244717b) && L.f(this.f244718c, aVar.f244718c) && L.f(this.f244719d, aVar.f244719d) && L.f(this.f244720e, aVar.f244720e) && L.f(this.f244721f, aVar.f244721f) && L.f(this.f244722g, aVar.f244722g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222258b() {
        return getF244490b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF244490b() {
        return this.f244717b;
    }

    public final int hashCode() {
        int iHashCode = this.f244717b.hashCode() * 31;
        String str = this.f244718c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f244719d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f244720e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f244721f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PromoblockSlotItemMargins promoblockSlotItemMargins = this.f244722g;
        return iHashCode5 + (promoblockSlotItemMargins != null ? promoblockSlotItemMargins.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "PromoblockSlotItem(stringId=" + this.f244717b + ", title=" + this.f244718c + ", text=" + this.f244719d + ", style=" + this.f244720e + ", type=" + this.f244721f + ", margins=" + this.f244722g + ')';
    }
}
