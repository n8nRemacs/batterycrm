package com.avito.android.advert.item.gig.similar_shifts;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.lib.design.chips.e;
import com.avito.conveyor_item.a;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsSimilarShiftsItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/gig/similar_shifts/AdvertDetailsSimilarShiftsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "SimilarShiftDaysContent", "SimilarShiftTimeContent", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsSimilarShiftsItem implements BlockItem {

    @k
    public static final Parcelable.Creator<AdvertDetailsSimilarShiftsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f75763b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75764c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<SimilarShiftDaysContent> f75765d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f75766e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final SimilarShiftTimeContent f75767f;

    /* compiled from: AdvertDetailsSimilarShiftsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/gig/similar_shifts/AdvertDetailsSimilarShiftsItem$SimilarShiftTimeContent;", "Landroid/os/Parcelable;", "Lcom/avito/android/lib/design/chips/h;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class SimilarShiftTimeContent implements Parcelable, com.avito.android.lib.design.chips.h {

        @k
        public static final Parcelable.Creator<SimilarShiftTimeContent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f75773b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f75774c;

        /* renamed from: d, reason: collision with root package name */
        public final long f75775d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f75776e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f75777f;

        /* renamed from: g, reason: collision with root package name */
        public final int f75778g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final String f75779h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final String f75780i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final String f75781j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f75782k;

        /* compiled from: AdvertDetailsSimilarShiftsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SimilarShiftTimeContent> {
            @Override // android.os.Parcelable.Creator
            public final SimilarShiftTimeContent createFromParcel(Parcel parcel) {
                return new SimilarShiftTimeContent(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SimilarShiftTimeContent[] newArray(int i12) {
                return new SimilarShiftTimeContent[i12];
            }
        }

        public SimilarShiftTimeContent(@k String str, @k String str2, long j12, boolean z12, @k String str3, int i12, @k String str4, @k String str5, @k String str6, boolean z13) {
            this.f75773b = str;
            this.f75774c = str2;
            this.f75775d = j12;
            this.f75776e = z12;
            this.f75777f = str3;
            this.f75778g = i12;
            this.f75779h = str4;
            this.f75780i = str5;
            this.f75781j = str6;
            this.f75782k = z13;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@k Object obj) {
            return (obj instanceof SimilarShiftTimeContent) && L.f(((SimilarShiftTimeContent) obj).f75773b, this.f75773b);
        }

        @Override // com.avito.android.lib.design.chips.h
        @k
        /* renamed from: W */
        public final CharSequence getF199741b() {
            return this.f75774c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e e2() {
            if (this.f75782k) {
                return new e.c(R.drawable.ic_green_lightning);
            }
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SimilarShiftTimeContent)) {
                return false;
            }
            SimilarShiftTimeContent similarShiftTimeContent = (SimilarShiftTimeContent) obj;
            return L.f(this.f75773b, similarShiftTimeContent.f75773b) && L.f(this.f75774c, similarShiftTimeContent.f75774c) && this.f75775d == similarShiftTimeContent.f75775d && this.f75776e == similarShiftTimeContent.f75776e && L.f(this.f75777f, similarShiftTimeContent.f75777f) && this.f75778g == similarShiftTimeContent.f75778g && L.f(this.f75779h, similarShiftTimeContent.f75779h) && L.f(this.f75780i, similarShiftTimeContent.f75780i) && L.f(this.f75781j, similarShiftTimeContent.f75781j) && this.f75782k == similarShiftTimeContent.f75782k;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF293858c() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f75782k) + H.d(H.d(H.d(r.e(this.f75778g, H.d(r.i(r.g(H.d(this.f75773b.hashCode() * 31, 31, this.f75774c), 31, this.f75775d), 31, this.f75776e), 31, this.f75777f), 31), 31, this.f75779h), 31, this.f75780i), 31, this.f75781j);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF281693d() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SimilarShiftTimeContent(id=");
            sb2.append(this.f75773b);
            sb2.append(", text=");
            sb2.append(this.f75774c);
            sb2.append(", startTime=");
            sb2.append(this.f75775d);
            sb2.append(", isSelected=");
            sb2.append(this.f75776e);
            sb2.append(", price=");
            sb2.append(this.f75777f);
            sb2.append(", duration=");
            sb2.append(this.f75778g);
            sb2.append(", pricePerHour=");
            sb2.append(this.f75779h);
            sb2.append(", mainButtonTitle=");
            sb2.append(this.f75780i);
            sb2.append(", mainButtonDeeplink=");
            sb2.append(this.f75781j);
            sb2.append(", isHotShift=");
            return r.x(sb2, this.f75782k, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f75773b);
            parcel.writeString(this.f75774c);
            parcel.writeLong(this.f75775d);
            parcel.writeInt(this.f75776e ? 1 : 0);
            parcel.writeString(this.f75777f);
            parcel.writeInt(this.f75778g);
            parcel.writeString(this.f75779h);
            parcel.writeString(this.f75780i);
            parcel.writeString(this.f75781j);
            parcel.writeInt(this.f75782k ? 1 : 0);
        }
    }

    /* compiled from: AdvertDetailsSimilarShiftsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsSimilarShiftsItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSimilarShiftsItem createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            String string = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(SimilarShiftDaysContent.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AdvertDetailsSimilarShiftsItem(i12, string, parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSimilarShiftsItem[] newArray(int i12) {
            return new AdvertDetailsSimilarShiftsItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertDetailsSimilarShiftsItem(int i12, @k String str, @k String str2, @k List list) {
        SimilarShiftTimeContent similarShiftTimeContent;
        Object next;
        List<SimilarShiftTimeContent> list2;
        this.f75763b = i12;
        this.f75764c = str;
        this.f75765d = list;
        this.f75766e = str2;
        Iterator it = list.iterator();
        while (true) {
            similarShiftTimeContent = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(this.f75766e, ((SimilarShiftDaysContent) next).f75768b)) {
                    break;
                }
            }
        }
        SimilarShiftDaysContent similarShiftDaysContent = (SimilarShiftDaysContent) next;
        if (similarShiftDaysContent != null && (list2 = similarShiftDaysContent.f75770d) != null) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((SimilarShiftTimeContent) next2).f75776e) {
                    similarShiftTimeContent = next2;
                    break;
                }
            }
            similarShiftTimeContent = similarShiftTimeContent;
        }
        this.f75767f = similarShiftTimeContent;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsSimilarShiftsItem(i12, this.f75764c, this.f75766e, this.f75765d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsSimilarShiftsItem)) {
            return false;
        }
        AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItem = (AdvertDetailsSimilarShiftsItem) obj;
        return this.f75763b == advertDetailsSimilarShiftsItem.f75763b && L.f(this.f75764c, advertDetailsSimilarShiftsItem.f75764c) && L.f(this.f75765d, advertDetailsSimilarShiftsItem.f75765d) && L.f(this.f75766e, advertDetailsSimilarShiftsItem.f75766e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF282036b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84111f() {
        return this.f75763b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281526b() {
        return this.f75764c;
    }

    public final int hashCode() {
        return this.f75766e.hashCode() + H.e(H.d(Integer.hashCode(this.f75763b) * 31, 31, this.f75764c), 31, this.f75765d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsSimilarShiftsItem(spanCount=");
        sb2.append(this.f75763b);
        sb2.append(", stringId=");
        sb2.append(this.f75764c);
        sb2.append(", data=");
        sb2.append(this.f75765d);
        sb2.append(", selectedDayId=");
        return C22026a.c(sb2, this.f75766e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f75763b);
        parcel.writeString(this.f75764c);
        Iterator itJ = C0.j(this.f75765d, parcel);
        while (itJ.hasNext()) {
            ((SimilarShiftDaysContent) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f75766e);
    }

    /* compiled from: AdvertDetailsSimilarShiftsItem.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/gig/similar_shifts/AdvertDetailsSimilarShiftsItem$SimilarShiftDaysContent;", "Landroid/os/Parcelable;", "Lcom/avito/android/lib/design/chips/h;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class SimilarShiftDaysContent implements Parcelable, com.avito.android.lib.design.chips.h {

        @k
        public static final Parcelable.Creator<SimilarShiftDaysContent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f75768b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f75769c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<SimilarShiftTimeContent> f75770d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f75771e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f75772f;

        /* compiled from: AdvertDetailsSimilarShiftsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SimilarShiftDaysContent> {
            @Override // android.os.Parcelable.Creator
            public final SimilarShiftDaysContent createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(SimilarShiftTimeContent.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new SimilarShiftDaysContent(string, string2, arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SimilarShiftDaysContent[] newArray(int i12) {
                return new SimilarShiftDaysContent[i12];
            }
        }

        public SimilarShiftDaysContent(@k String str, @k String str2, @k List<SimilarShiftTimeContent> list, boolean z12) {
            this.f75768b = str;
            this.f75769c = str2;
            this.f75770d = list;
            this.f75771e = z12;
            List<SimilarShiftTimeContent> list2 = list;
            boolean z13 = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((SimilarShiftTimeContent) it.next()).f75782k) {
                        z13 = true;
                        break;
                    }
                }
            }
            this.f75772f = z13;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@k Object obj) {
            return (obj instanceof SimilarShiftDaysContent) && L.f(((SimilarShiftDaysContent) obj).f75768b, this.f75768b);
        }

        @Override // com.avito.android.lib.design.chips.h
        @k
        /* renamed from: W */
        public final CharSequence getF199741b() {
            return this.f75769c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e e2() {
            if (this.f75772f) {
                return new e.c(R.drawable.ic_green_lightning);
            }
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SimilarShiftDaysContent)) {
                return false;
            }
            SimilarShiftDaysContent similarShiftDaysContent = (SimilarShiftDaysContent) obj;
            return L.f(this.f75768b, similarShiftDaysContent.f75768b) && L.f(this.f75769c, similarShiftDaysContent.f75769c) && L.f(this.f75770d, similarShiftDaysContent.f75770d) && this.f75771e == similarShiftDaysContent.f75771e;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF293858c() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f75771e) + H.e(H.d(this.f75768b.hashCode() * 31, 31, this.f75769c), 31, this.f75770d);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF281693d() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SimilarShiftDaysContent(id=");
            sb2.append(this.f75768b);
            sb2.append(", text=");
            sb2.append(this.f75769c);
            sb2.append(", timeContent=");
            sb2.append(this.f75770d);
            sb2.append(", shouldScrollToChip=");
            return r.x(sb2, this.f75771e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f75768b);
            parcel.writeString(this.f75769c);
            Iterator itJ = C0.j(this.f75770d, parcel);
            while (itJ.hasNext()) {
                ((SimilarShiftTimeContent) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeInt(this.f75771e ? 1 : 0);
        }

        public /* synthetic */ SimilarShiftDaysContent(String str, String str2, List list, boolean z12, int i12, C42822w c42822w) {
            this(str, str2, list, (i12 & 8) != 0 ? false : z12);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsSimilarShiftsItem(int i12, String str, List list, String str2, int i13, C42822w c42822w) {
        if ((i13 & 2) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            str = "ITEM_GIG_SIMILAR_SHIFTS";
        }
        this(i12, str, str2, list);
    }
}
