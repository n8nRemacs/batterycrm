package com.avito.android.advert.item.cv_phone_actualization;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCvPhoneActualizationItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/cv_phone_actualization/AdvertCvPhoneActualizationItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/android/serp/adapter/Q;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertCvPhoneActualizationItem implements BlockItem, l1, Q {

    @k
    public static final Parcelable.Creator<AdvertCvPhoneActualizationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f75033b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75034c;

    /* renamed from: d, reason: collision with root package name */
    public final int f75035d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f75036e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f75037f;

    /* renamed from: g, reason: collision with root package name */
    public final long f75038g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<AdvertCvPhoneActualizationAction> f75039h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SerpViewType f75040i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public SerpDisplayType f75041j;

    /* compiled from: AdvertCvPhoneActualizationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertCvPhoneActualizationItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertCvPhoneActualizationItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j13 = parcel.readLong();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(AdvertCvPhoneActualizationAction.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AdvertCvPhoneActualizationItem(j12, string, i12, string2, string3, j13, arrayList, SerpViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertCvPhoneActualizationItem[] newArray(int i12) {
            return new AdvertCvPhoneActualizationItem[i12];
        }
    }

    public AdvertCvPhoneActualizationItem(long j12, @k String str, int i12, @k String str2, @k String str3, long j13, @k List<AdvertCvPhoneActualizationAction> list, @k SerpViewType serpViewType, @k SerpDisplayType serpDisplayType) {
        this.f75033b = j12;
        this.f75034c = str;
        this.f75035d = i12;
        this.f75036e = str2;
        this.f75037f = str3;
        this.f75038g = j13;
        this.f75039h = list;
        this.f75040i = serpViewType;
        this.f75041j = serpDisplayType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f75041j;
        return new AdvertCvPhoneActualizationItem(this.f75033b, this.f75034c, i12, this.f75036e, this.f75037f, this.f75038g, this.f75039h, this.f75040i, serpDisplayType);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f75041j = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertCvPhoneActualizationItem)) {
            return false;
        }
        AdvertCvPhoneActualizationItem advertCvPhoneActualizationItem = (AdvertCvPhoneActualizationItem) obj;
        return this.f75033b == advertCvPhoneActualizationItem.f75033b && L.f(this.f75034c, advertCvPhoneActualizationItem.f75034c) && this.f75035d == advertCvPhoneActualizationItem.f75035d && L.f(this.f75036e, advertCvPhoneActualizationItem.f75036e) && L.f(this.f75037f, advertCvPhoneActualizationItem.f75037f) && this.f75038g == advertCvPhoneActualizationItem.f75038g && L.f(this.f75039h, advertCvPhoneActualizationItem.f75039h) && this.f75040i == advertCvPhoneActualizationItem.f75040i && this.f75041j == advertCvPhoneActualizationItem.f75041j;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75315b() {
        return this.f75033b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF231634s() {
        return this.f75035d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF231617b() {
        return this.f75034c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF231633r() {
        return this.f75040i;
    }

    public final int hashCode() {
        return this.f75041j.hashCode() + com.avito.android.actions_sheet.a.j(this.f75040i, H.e(r.g(H.d(H.d(r.e(this.f75035d, H.d(Long.hashCode(this.f75033b) * 31, 31, this.f75034c), 31), 31, this.f75036e), 31, this.f75037f), 31, this.f75038g), 31, this.f75039h), 31);
    }

    @k
    public final String toString() {
        return "AdvertCvPhoneActualizationItem(id=" + this.f75033b + ", stringId=" + this.f75034c + ", spanCount=" + this.f75035d + ", title=" + this.f75036e + ", subtitle=" + this.f75037f + ", cvId=" + this.f75038g + ", actions=" + this.f75039h + ", viewType=" + this.f75040i + ", displayType=" + this.f75041j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f75033b);
        parcel.writeString(this.f75034c);
        parcel.writeInt(this.f75035d);
        parcel.writeString(this.f75036e);
        parcel.writeString(this.f75037f);
        parcel.writeLong(this.f75038g);
        Iterator itJ = C0.j(this.f75039h, parcel);
        while (itJ.hasNext()) {
            ((AdvertCvPhoneActualizationAction) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f75040i.name());
        parcel.writeString(this.f75041j.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertCvPhoneActualizationItem(long j12, String str, int i12, String str2, String str3, long j13, List list, SerpViewType serpViewType, SerpDisplayType serpDisplayType, int i13, C42822w c42822w) {
        long j14;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j14 = 132;
        } else {
            j14 = j12;
        }
        this(j14, (i13 & 2) != 0 ? String.valueOf(j14) : str, i12, str2, str3, j13, list, (i13 & 128) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 256) != 0 ? SerpDisplayType.Grid : serpDisplayType);
    }
}
