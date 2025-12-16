package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.section.SectionTypeElement;
import com.avito.android.remote.model.section.SectionViewType;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComplementarySections.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0010¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/ComplementarySections;", "Landroid/os/Parcelable;", "", "redesignItemCount", "Lcom/avito/android/remote/model/section/SectionViewType;", "shopSimilarRedesign", "", "Lcom/avito/android/remote/model/section/SectionTypeElement;", "sections", "<init>", "(Ljava/lang/Integer;Lcom/avito/android/remote/model/section/SectionViewType;Ljava/util/List;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/avito/android/remote/model/section/SectionViewType;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/Integer;Lcom/avito/android/remote/model/section/SectionViewType;Ljava/util/List;)Lcom/avito/android/remote/model/ComplementarySections;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getRedesignItemCount", "Lcom/avito/android/remote/model/section/SectionViewType;", "getShopSimilarRedesign", "Ljava/util/List;", "getSections", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ComplementarySections implements Parcelable {

    @k
    public static final Parcelable.Creator<ComplementarySections> CREATOR = new Creator();

    @c("redesignItemCount")
    @l
    private final Integer redesignItemCount;

    @c("sections")
    @l
    private final List<SectionTypeElement> sections;

    @c("shopSimilarRedesign")
    @l
    private final SectionViewType shopSimilarRedesign;

    /* compiled from: ComplementarySections.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ComplementarySections> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComplementarySections createFromParcel(@k Parcel parcel) {
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            SectionViewType sectionViewTypeValueOf = parcel.readInt() == 0 ? null : SectionViewType.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(ComplementarySections.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new ComplementarySections(numValueOf, sectionViewTypeValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComplementarySections[] newArray(int i12) {
            return new ComplementarySections[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComplementarySections(@l Integer num, @l SectionViewType sectionViewType, @l List<? extends SectionTypeElement> list) {
        this.redesignItemCount = num;
        this.shopSimilarRedesign = sectionViewType;
        this.sections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComplementarySections copy$default(ComplementarySections complementarySections, Integer num, SectionViewType sectionViewType, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = complementarySections.redesignItemCount;
        }
        if ((i12 & 2) != 0) {
            sectionViewType = complementarySections.shopSimilarRedesign;
        }
        if ((i12 & 4) != 0) {
            list = complementarySections.sections;
        }
        return complementarySections.copy(num, sectionViewType, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getRedesignItemCount() {
        return this.redesignItemCount;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final SectionViewType getShopSimilarRedesign() {
        return this.shopSimilarRedesign;
    }

    @l
    public final List<SectionTypeElement> component3() {
        return this.sections;
    }

    @k
    public final ComplementarySections copy(@l Integer redesignItemCount, @l SectionViewType shopSimilarRedesign, @l List<? extends SectionTypeElement> sections) {
        return new ComplementarySections(redesignItemCount, shopSimilarRedesign, sections);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComplementarySections)) {
            return false;
        }
        ComplementarySections complementarySections = (ComplementarySections) other;
        return L.f(this.redesignItemCount, complementarySections.redesignItemCount) && this.shopSimilarRedesign == complementarySections.shopSimilarRedesign && L.f(this.sections, complementarySections.sections);
    }

    @l
    public final Integer getRedesignItemCount() {
        return this.redesignItemCount;
    }

    @l
    public final List<SectionTypeElement> getSections() {
        return this.sections;
    }

    @l
    public final SectionViewType getShopSimilarRedesign() {
        return this.shopSimilarRedesign;
    }

    public int hashCode() {
        Integer num = this.redesignItemCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        SectionViewType sectionViewType = this.shopSimilarRedesign;
        int iHashCode2 = (iHashCode + (sectionViewType == null ? 0 : sectionViewType.hashCode())) * 31;
        List<SectionTypeElement> list = this.sections;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ComplementarySections(redesignItemCount=");
        sb2.append(this.redesignItemCount);
        sb2.append(", shopSimilarRedesign=");
        sb2.append(this.shopSimilarRedesign);
        sb2.append(", sections=");
        return H.p(sb2, this.sections, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.redesignItemCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        SectionViewType sectionViewType = this.shopSimilarRedesign;
        if (sectionViewType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sectionViewType.name());
        }
        List<SectionTypeElement> list = this.sections;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }

    public /* synthetic */ ComplementarySections(Integer num, SectionViewType sectionViewType, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : sectionViewType, list);
    }
}
