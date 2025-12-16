package com.avito.android.publish.items.promo_block;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoBlockRedesignedItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/promo_block/PromoBlockRedesignedItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PromoBlockRedesignedItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<PromoBlockRedesignedItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f237061b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f237062c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f237063d;

    /* renamed from: e, reason: collision with root package name */
    public final int f237064e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f237065f;

    /* compiled from: PromoBlockRedesignedItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoBlockRedesignedItem> {
        @Override // android.os.Parcelable.Creator
        public final PromoBlockRedesignedItem createFromParcel(Parcel parcel) {
            return new PromoBlockRedesignedItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PromoBlockRedesignedItem[] newArray(int i12) {
            return new PromoBlockRedesignedItem[i12];
        }
    }

    public PromoBlockRedesignedItem(@k String str, @l String str2, @l String str3, @InterfaceC42150f int i12, boolean z12) {
        this.f237061b = str;
        this.f237062c = str2;
        this.f237063d = str3;
        this.f237064e = i12;
        this.f237065f = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoBlockRedesignedItem)) {
            return false;
        }
        PromoBlockRedesignedItem promoBlockRedesignedItem = (PromoBlockRedesignedItem) obj;
        return L.f(this.f237061b, promoBlockRedesignedItem.f237061b) && L.f(this.f237062c, promoBlockRedesignedItem.f237062c) && L.f(this.f237063d, promoBlockRedesignedItem.f237063d) && this.f237064e == promoBlockRedesignedItem.f237064e && this.f237065f == promoBlockRedesignedItem.f237065f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207600b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229886b() {
        return this.f237061b;
    }

    public final int hashCode() {
        int iHashCode = this.f237061b.hashCode() * 31;
        String str = this.f237062c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f237063d;
        return Boolean.hashCode(this.f237065f) + r.e(this.f237064e, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoBlockRedesignedItem(stringId=");
        sb2.append(this.f237061b);
        sb2.append(", title=");
        sb2.append(this.f237062c);
        sb2.append(", body=");
        sb2.append(this.f237063d);
        sb2.append(", styleAttr=");
        sb2.append(this.f237064e);
        sb2.append(", hasBottomMargin=");
        return r.x(sb2, this.f237065f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f237061b);
        parcel.writeString(this.f237062c);
        parcel.writeString(this.f237063d);
        parcel.writeInt(this.f237064e);
        parcel.writeInt(this.f237065f ? 1 : 0);
    }

    public /* synthetic */ PromoBlockRedesignedItem(String str, String str2, String str3, int i12, boolean z12, int i13, C42822w c42822w) {
        this(str, str2, str3, i12, (i13 & 16) != 0 ? false : z12);
    }
}
