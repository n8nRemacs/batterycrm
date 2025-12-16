package com.avito.android.publish.slots.item_info.item;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.car_info_short.CarImage;
import com.avito.android.remote.model.category_parameters.slot.item_info.Confetti;
import com.avito.android.remote.model.category_parameters.slot.item_info.ImagePosition;
import com.avito.android.remote.model.category_parameters.slot.item_info.ItemInfoField;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemInfoItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/item_info/item/d;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f244374b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f244375c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final CarImage f244376d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<ItemInfoField> f244377e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f244378f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Confetti f244379g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f244380h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f244381i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f244382j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f244383k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ImagePosition f244384l;

    public d(@Y61.k String str, @Y61.l String str2, @Y61.l CarImage carImage, @Y61.l List<ItemInfoField> list, @Y61.l Integer num, @Y61.l Confetti confetti, boolean z12, @Y61.k String str3, boolean z13, @Y61.l String str4, @Y61.k ImagePosition imagePosition) {
        this.f244374b = str;
        this.f244375c = str2;
        this.f244376d = carImage;
        this.f244377e = list;
        this.f244378f = num;
        this.f244379g = confetti;
        this.f244380h = z12;
        this.f244381i = str3;
        this.f244382j = z13;
        this.f244383k = str4;
        this.f244384l = imagePosition;
    }

    public static d a(d dVar, boolean z12) {
        String str = dVar.f244374b;
        String str2 = dVar.f244375c;
        CarImage carImage = dVar.f244376d;
        List<ItemInfoField> list = dVar.f244377e;
        Integer num = dVar.f244378f;
        Confetti confetti = dVar.f244379g;
        String str3 = dVar.f244381i;
        boolean z13 = dVar.f244382j;
        String str4 = dVar.f244383k;
        ImagePosition imagePosition = dVar.f244384l;
        dVar.getClass();
        return new d(str, str2, carImage, list, num, confetti, z12, str3, z13, str4, imagePosition);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f244374b, dVar.f244374b) && L.f(this.f244375c, dVar.f244375c) && L.f(this.f244376d, dVar.f244376d) && L.f(this.f244377e, dVar.f244377e) && L.f(this.f244378f, dVar.f244378f) && L.f(this.f244379g, dVar.f244379g) && this.f244380h == dVar.f244380h && L.f(this.f244381i, dVar.f244381i) && this.f244382j == dVar.f244382j && L.f(this.f244383k, dVar.f244383k) && this.f244384l == dVar.f244384l;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return getF216014d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF216014d() {
        return this.f244374b;
    }

    public final int hashCode() {
        int iHashCode = this.f244374b.hashCode() * 31;
        String str = this.f244375c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CarImage carImage = this.f244376d;
        int iHashCode3 = (iHashCode2 + (carImage == null ? 0 : carImage.hashCode())) * 31;
        List<ItemInfoField> list = this.f244377e;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f244378f;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Confetti confetti = this.f244379g;
        int i12 = androidx.appcompat.app.r.i(H.d(androidx.appcompat.app.r.i((iHashCode5 + (confetti == null ? 0 : confetti.hashCode())) * 31, 31, this.f244380h), 31, this.f244381i), 31, this.f244382j);
        String str2 = this.f244383k;
        return this.f244384l.hashCode() + ((i12 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ItemInfoItem(stringId=" + this.f244374b + ", title=" + this.f244375c + ", image=" + this.f244376d + ", fields=" + this.f244377e + ", visibleFieldsCount=" + this.f244378f + ", confetti=" + this.f244379g + ", isExpanded=" + this.f244380h + ", publishSessionId=" + this.f244381i + ", isPlayAnimationOnClick=" + this.f244382j + ", description=" + this.f244383k + ", imagePosition=" + this.f244384l + ')';
    }
}
