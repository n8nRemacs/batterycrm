package com.avito.android.service_booking;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlock.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011\"\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\t\u0010\u001aR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Lcom/avito/android/service_booking/SbDaysBlock;", "Lcom/avito/android/service_booking/ServiceBookingBlock;", "Lcom/avito/android/service_booking/SerializableServiceBookingBlock;", "", "id", "value", "title", "endDate", "", "isOptional", "", "availableDays", "availableSlots", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getValue", "setValue", "(Ljava/lang/String;)V", "getTitle", "setTitle", "e", "setEndDate", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/util/List;", "c", "()Ljava/util/List;", "setAvailableDays", "(Ljava/util/List;)V", "d", "setAvailableSlots", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbDaysBlock implements ServiceBookingBlock, SerializableServiceBookingBlock<String> {

    @k
    public static final Parcelable.Creator<SbDaysBlock> CREATOR = new a();

    @c("availableDays")
    @l
    private List<String> availableDays;

    @c("firstAvailableDayTimeSlots")
    @l
    private List<String> availableSlots;

    @c("endDate")
    @k
    private String endDate;

    @c("id")
    @k
    private final String id;

    @c("optional")
    @l
    private final Boolean isOptional;

    @c("title")
    @l
    private String title;

    @c("value")
    @l
    private String value;

    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SbDaysBlock> {
        @Override // android.os.Parcelable.Creator
        public final SbDaysBlock createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SbDaysBlock(string, string2, string3, string4, boolValueOf, parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final SbDaysBlock[] newArray(int i12) {
            return new SbDaysBlock[i12];
        }
    }

    public SbDaysBlock(@k String str, @l String str2, @l String str3, @k String str4, @l Boolean bool, @l List<String> list, @l List<String> list2) {
        this.id = str;
        this.value = str2;
        this.title = str3;
        this.endDate = str4;
        this.isOptional = bool;
        this.availableDays = list;
        this.availableSlots = list2;
    }

    @l
    public final List<String> c() {
        return this.availableDays;
    }

    @l
    public final List<String> d() {
        return this.availableSlots;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SbDaysBlock.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        SbDaysBlock sbDaysBlock = (SbDaysBlock) obj;
        return L.f(this.id, sbDaysBlock.id) && L.f(this.value, sbDaysBlock.value) && L.f(this.title, sbDaysBlock.title) && L.f(this.endDate, sbDaysBlock.endDate) && L.f(this.isOptional, sbDaysBlock.isOptional) && L.f(this.availableDays, sbDaysBlock.availableDays) && L.f(this.availableSlots, sbDaysBlock.availableSlots);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        int iHashCode3 = this.endDate.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i12 = iHashCode3 * 31;
        Boolean bool = this.isOptional;
        int iHashCode4 = i12 + (bool != null ? bool.hashCode() : 0) + iHashCode3;
        int i13 = iHashCode4 * 31;
        Object obj = this.availableDays;
        if (obj == null) {
            obj = C42784z0.f406748b;
        }
        int iHashCode5 = obj.hashCode() + i13 + iHashCode4;
        int i14 = iHashCode5 * 31;
        Object obj2 = this.availableSlots;
        if (obj2 == null) {
            obj2 = C42784z0.f406748b;
        }
        return obj2.hashCode() + i14 + iHashCode5;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbDaysBlock(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", endDate=");
        sb2.append(this.endDate);
        sb2.append(", isOptional=");
        sb2.append(this.isOptional);
        sb2.append(", availableDays=");
        sb2.append(this.availableDays);
        sb2.append(", availableSlots=");
        return H.p(sb2, this.availableSlots, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.value);
        parcel.writeString(this.title);
        parcel.writeString(this.endDate);
        Boolean bool = this.isOptional;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeStringList(this.availableDays);
        parcel.writeStringList(this.availableSlots);
    }
}
