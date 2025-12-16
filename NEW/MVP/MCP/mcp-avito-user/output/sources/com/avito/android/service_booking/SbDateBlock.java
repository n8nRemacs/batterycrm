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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\t\u0010\u0019R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/service_booking/SbDateBlock;", "Lcom/avito/android/service_booking/ServiceBookingBlock;", "Lcom/avito/android/service_booking/SerializableServiceBookingBlock;", "", "id", "value", "title", "endDate", "", "isOptional", "", "values", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getValue", "setValue", "(Ljava/lang/String;)V", "getTitle", "setTitle", "c", "setEndDate", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/util/List;", "d", "()Ljava/util/List;", "setValues", "(Ljava/util/List;)V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbDateBlock implements ServiceBookingBlock, SerializableServiceBookingBlock<String> {

    @k
    public static final Parcelable.Creator<SbDateBlock> CREATOR = new a();

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

    @c("values")
    @l
    private List<String> values;

    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SbDateBlock> {
        @Override // android.os.Parcelable.Creator
        public final SbDateBlock createFromParcel(Parcel parcel) {
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
            return new SbDateBlock(string, string2, string3, string4, boolValueOf, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final SbDateBlock[] newArray(int i12) {
            return new SbDateBlock[i12];
        }
    }

    public SbDateBlock(@k String str, @l String str2, @l String str3, @k String str4, @l Boolean bool, @l List<String> list) {
        this.id = str;
        this.value = str2;
        this.title = str3;
        this.endDate = str4;
        this.isOptional = bool;
        this.values = list;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    @l
    public final List<String> d() {
        return this.values;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SbDateBlock.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        SbDateBlock sbDateBlock = (SbDateBlock) obj;
        return L.f(this.id, sbDateBlock.id) && L.f(this.value, sbDateBlock.value) && L.f(this.title, sbDateBlock.title) && L.f(this.endDate, sbDateBlock.endDate) && L.f(this.isOptional, sbDateBlock.isOptional) && L.f(this.values, sbDateBlock.values);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getValue() {
        return this.value;
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
        Object obj = this.values;
        if (obj == null) {
            obj = C42784z0.f406748b;
        }
        return obj.hashCode() + i13 + iHashCode4;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbDateBlock(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", endDate=");
        sb2.append(this.endDate);
        sb2.append(", isOptional=");
        sb2.append(this.isOptional);
        sb2.append(", values=");
        return H.p(sb2, this.values, ')');
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
        parcel.writeStringList(this.values);
    }
}
