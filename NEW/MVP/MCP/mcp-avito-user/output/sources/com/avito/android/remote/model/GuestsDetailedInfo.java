package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalculateDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJv\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b3\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u0011R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u0010\u001a¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/GuestsDetailedInfo;", "Landroid/os/Parcelable;", "", "displayTitle", ChannelContext.Item.PLACEHOLDER, "value", "title", "", "maxGuestsCount", "minGuestsCount", "buttonTitle", "", "Lcom/avito/android/remote/model/GuestsDetailedAge;", "ages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/GuestsDetailedInfo;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDisplayTitle", "getPlaceholder", "getValue", "getTitle", "Ljava/lang/Integer;", "getMaxGuestsCount", "getMinGuestsCount", "getButtonTitle", "Ljava/util/List;", "getAges", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GuestsDetailedInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<GuestsDetailedInfo> CREATOR = new Creator();

    @c("ages")
    @l
    private final List<GuestsDetailedAge> ages;

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c("displayTitle")
    @l
    private final String displayTitle;

    @c("maxGuestsCount")
    @l
    private final Integer maxGuestsCount;

    @c("minGuestsCount")
    @l
    private final Integer minGuestsCount;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c("title")
    @l
    private final String title;

    @c("value")
    @l
    private final String value;

    /* compiled from: StrBookingCalculateDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GuestsDetailedInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GuestsDetailedInfo createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(GuestsDetailedAge.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new GuestsDetailedInfo(string, string2, string3, string4, numValueOf, numValueOf2, string5, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GuestsDetailedInfo[] newArray(int i12) {
            return new GuestsDetailedInfo[i12];
        }
    }

    public GuestsDetailedInfo(@l String str, @l String str2, @l String str3, @l String str4, @l Integer num, @l Integer num2, @l String str5, @l List<GuestsDetailedAge> list) {
        this.displayTitle = str;
        this.placeholder = str2;
        this.value = str3;
        this.title = str4;
        this.maxGuestsCount = num;
        this.minGuestsCount = num2;
        this.buttonTitle = str5;
        this.ages = list;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getMaxGuestsCount() {
        return this.maxGuestsCount;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Integer getMinGuestsCount() {
        return this.minGuestsCount;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final List<GuestsDetailedAge> component8() {
        return this.ages;
    }

    @k
    public final GuestsDetailedInfo copy(@l String displayTitle, @l String placeholder, @l String value, @l String title, @l Integer maxGuestsCount, @l Integer minGuestsCount, @l String buttonTitle, @l List<GuestsDetailedAge> ages) {
        return new GuestsDetailedInfo(displayTitle, placeholder, value, title, maxGuestsCount, minGuestsCount, buttonTitle, ages);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuestsDetailedInfo)) {
            return false;
        }
        GuestsDetailedInfo guestsDetailedInfo = (GuestsDetailedInfo) other;
        return L.f(this.displayTitle, guestsDetailedInfo.displayTitle) && L.f(this.placeholder, guestsDetailedInfo.placeholder) && L.f(this.value, guestsDetailedInfo.value) && L.f(this.title, guestsDetailedInfo.title) && L.f(this.maxGuestsCount, guestsDetailedInfo.maxGuestsCount) && L.f(this.minGuestsCount, guestsDetailedInfo.minGuestsCount) && L.f(this.buttonTitle, guestsDetailedInfo.buttonTitle) && L.f(this.ages, guestsDetailedInfo.ages);
    }

    @l
    public final List<GuestsDetailedAge> getAges() {
        return this.ages;
    }

    @l
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    @l
    public final Integer getMaxGuestsCount() {
        return this.maxGuestsCount;
    }

    @l
    public final Integer getMinGuestsCount() {
        return this.minGuestsCount;
    }

    @l
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.displayTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.placeholder;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.maxGuestsCount;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minGuestsCount;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.buttonTitle;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<GuestsDetailedAge> list = this.ages;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GuestsDetailedInfo(displayTitle=");
        sb2.append(this.displayTitle);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", maxGuestsCount=");
        sb2.append(this.maxGuestsCount);
        sb2.append(", minGuestsCount=");
        sb2.append(this.minGuestsCount);
        sb2.append(", buttonTitle=");
        sb2.append(this.buttonTitle);
        sb2.append(", ages=");
        return H.p(sb2, this.ages, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.displayTitle);
        parcel.writeString(this.placeholder);
        parcel.writeString(this.value);
        parcel.writeString(this.title);
        Integer num = this.maxGuestsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.minGuestsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        parcel.writeString(this.buttonTitle);
        List<GuestsDetailedAge> list = this.ages;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((GuestsDetailedAge) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
