package com.avito.android.advert.item.spare_parts.data;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsV3Dto.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/data/SparePartsGroup;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SparePartsGroup implements Parcelable {

    @k
    public static final Parcelable.Creator<SparePartsGroup> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalImage f80443b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f80444c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f80445d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f80446e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f80447f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<SparePartsGroup> f80448g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final List<SparePartsSpecification> f80449h;

    /* compiled from: SparePartsV3Dto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SparePartsGroup> {
        @Override // android.os.Parcelable.Creator
        public final SparePartsGroup createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(SparePartsGroup.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(SparePartsGroup.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(SparePartsSpecification.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new SparePartsGroup(universalImage, string, string2, string3, z12, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final SparePartsGroup[] newArray(int i12) {
            return new SparePartsGroup[i12];
        }
    }

    public SparePartsGroup(@l UniversalImage universalImage, @k String str, @k String str2, @l String str3, boolean z12, @l List<SparePartsGroup> list, @l List<SparePartsSpecification> list2) {
        this.f80443b = universalImage;
        this.f80444c = str;
        this.f80445d = str2;
        this.f80446e = str3;
        this.f80447f = z12;
        this.f80448g = list;
        this.f80449h = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SparePartsGroup)) {
            return false;
        }
        SparePartsGroup sparePartsGroup = (SparePartsGroup) obj;
        return L.f(this.f80443b, sparePartsGroup.f80443b) && L.f(this.f80444c, sparePartsGroup.f80444c) && L.f(this.f80445d, sparePartsGroup.f80445d) && L.f(this.f80446e, sparePartsGroup.f80446e) && this.f80447f == sparePartsGroup.f80447f && L.f(this.f80448g, sparePartsGroup.f80448g) && L.f(this.f80449h, sparePartsGroup.f80449h);
    }

    public final int hashCode() {
        UniversalImage universalImage = this.f80443b;
        int iD2 = H.d(H.d((universalImage == null ? 0 : universalImage.hashCode()) * 31, 31, this.f80444c), 31, this.f80445d);
        String str = this.f80446e;
        int i12 = r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f80447f);
        List<SparePartsGroup> list = this.f80448g;
        int iHashCode = (i12 + (list == null ? 0 : list.hashCode())) * 31;
        List<SparePartsSpecification> list2 = this.f80449h;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SparePartsGroup(image=");
        sb2.append(this.f80443b);
        sb2.append(", groupTitle=");
        sb2.append(this.f80444c);
        sb2.append(", text=");
        sb2.append(this.f80445d);
        sb2.append(", buttonText=");
        sb2.append(this.f80446e);
        sb2.append(", isButtonDisabled=");
        sb2.append(this.f80447f);
        sb2.append(", groups=");
        sb2.append(this.f80448g);
        sb2.append(", specifications=");
        return H.p(sb2, this.f80449h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f80443b, i12);
        parcel.writeString(this.f80444c);
        parcel.writeString(this.f80445d);
        parcel.writeString(this.f80446e);
        parcel.writeInt(this.f80447f ? 1 : 0);
        List<SparePartsGroup> list = this.f80448g;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((SparePartsGroup) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<SparePartsSpecification> list2 = this.f80449h;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((SparePartsSpecification) itA2.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ SparePartsGroup(UniversalImage universalImage, String str, String str2, String str3, boolean z12, List list, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : universalImage, str, (i12 & 4) != 0 ? "" : str2, (i12 & 8) != 0 ? null : str3, z12, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? null : list2);
    }
}
