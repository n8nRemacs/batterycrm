package com.avito.android.service_booking;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlock.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u001a\u001b\u001cB=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0007\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/avito/android/service_booking/SbSpecialistsBlock;", "Lcom/avito/android/service_booking/ServiceBookingBlock;", "Lcom/avito/android/service_booking/SerializableServiceBookingBlock;", "", "id", "value", "", "isOptional", "readOnly", "", "Lcom/avito/android/service_booking/SbSpecialistsBlock$SbSpecialist;", "values", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getValue", "setValue", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "SbAnySpecialistBlock", "SbSpecialist", "SbSpecialistBlock", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbSpecialistsBlock implements ServiceBookingBlock, SerializableServiceBookingBlock<String> {

    @k
    public static final Parcelable.Creator<SbSpecialistsBlock> CREATOR = new a();

    @c("id")
    @k
    private final String id;

    @c("optional")
    @l
    private final Boolean isOptional;

    @c("readOnly")
    @l
    private final Boolean readOnly;

    @c("value")
    @l
    private String value;

    @c("values")
    @l
    private final List<SbSpecialist> values;

    /* compiled from: ServiceBookingBlock.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/service_booking/SbSpecialistsBlock$SbAnySpecialistBlock;", "Lcom/avito/android/service_booking/SbSpecialistsBlock$SbSpecialist;", "", "id", "text", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getText", "getValue", "setValue", "(Ljava/lang/String;)V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SbAnySpecialistBlock implements SbSpecialist {

        @k
        public static final Parcelable.Creator<SbAnySpecialistBlock> CREATOR = new a();

        @c("id")
        @k
        private final String id;

        @c("name")
        @k
        private final String text;

        @c("value")
        @l
        private String value;

        /* compiled from: ServiceBookingBlock.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SbAnySpecialistBlock> {
            @Override // android.os.Parcelable.Creator
            public final SbAnySpecialistBlock createFromParcel(Parcel parcel) {
                return new SbAnySpecialistBlock(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SbAnySpecialistBlock[] newArray(int i12) {
                return new SbAnySpecialistBlock[i12];
            }
        }

        public SbAnySpecialistBlock(@k String str, @k String str2, @l String str3) {
            this.id = str;
            this.text = str2;
            this.value = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SbAnySpecialistBlock)) {
                return false;
            }
            SbAnySpecialistBlock sbAnySpecialistBlock = (SbAnySpecialistBlock) obj;
            return L.f(this.id, sbAnySpecialistBlock.id) && L.f(this.text, sbAnySpecialistBlock.text) && L.f(this.value, sbAnySpecialistBlock.value);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @l
        public final String getValue() {
            return this.value;
        }

        public final int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.text);
            String str = this.value;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SbAnySpecialistBlock(id=");
            sb2.append(this.id);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", value=");
            return C22026a.c(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.id);
            parcel.writeString(this.text);
            parcel.writeString(this.value);
        }
    }

    /* compiled from: ServiceBookingBlock.kt */
    @d
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/SbSpecialistsBlock$SbSpecialist;", "Landroid/os/Parcelable;", "Lcom/avito/android/service_booking/SbSpecialistsBlock$SbAnySpecialistBlock;", "Lcom/avito/android/service_booking/SbSpecialistsBlock$SbSpecialistBlock;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SbSpecialist extends Parcelable {
    }

    /* compiled from: ServiceBookingBlock.kt */
    @d
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/service_booking/SbSpecialistsBlock$SbSpecialistBlock;", "Lcom/avito/android/service_booking/SbSpecialistsBlock$SbSpecialist;", "", "id", "name", "Landroid/net/Uri;", "avatar", "speciality", "rating", "", "reviewsCount", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "f", "d", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "getValue", "setValue", "(Ljava/lang/String;)V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SbSpecialistBlock implements SbSpecialist {

        @k
        public static final Parcelable.Creator<SbSpecialistBlock> CREATOR = new a();

        @c("avatar")
        @l
        private final Uri avatar;

        @c("id")
        @k
        private final String id;

        @c("name")
        @k
        private final String name;

        @c("rating")
        @l
        private final String rating;

        @c("reviewsCount")
        @l
        private final Integer reviewsCount;

        @c("specialization")
        @l
        private final String speciality;

        @c("value")
        @l
        private String value;

        /* compiled from: ServiceBookingBlock.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SbSpecialistBlock> {
            @Override // android.os.Parcelable.Creator
            public final SbSpecialistBlock createFromParcel(Parcel parcel) {
                return new SbSpecialistBlock(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(SbSpecialistBlock.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SbSpecialistBlock[] newArray(int i12) {
                return new SbSpecialistBlock[i12];
            }
        }

        public SbSpecialistBlock(@k String str, @k String str2, @l Uri uri, @l String str3, @l String str4, @l Integer num, @l String str5) {
            this.id = str;
            this.name = str2;
            this.avatar = uri;
            this.speciality = str3;
            this.rating = str4;
            this.reviewsCount = num;
            this.value = str5;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Uri getAvatar() {
            return this.avatar;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getRating() {
            return this.rating;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final Integer getReviewsCount() {
            return this.reviewsCount;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SbSpecialistBlock)) {
                return false;
            }
            SbSpecialistBlock sbSpecialistBlock = (SbSpecialistBlock) obj;
            return L.f(this.id, sbSpecialistBlock.id) && L.f(this.name, sbSpecialistBlock.name) && L.f(this.avatar, sbSpecialistBlock.avatar) && L.f(this.speciality, sbSpecialistBlock.speciality) && L.f(this.rating, sbSpecialistBlock.rating) && L.f(this.reviewsCount, sbSpecialistBlock.reviewsCount) && L.f(this.value, sbSpecialistBlock.value);
        }

        @l
        /* renamed from: f, reason: from getter */
        public final String getSpeciality() {
            return this.speciality;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @l
        public final String getValue() {
            return this.value;
        }

        public final int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.name);
            Uri uri = this.avatar;
            int iHashCode = (iD2 + (uri == null ? 0 : uri.hashCode())) * 31;
            String str = this.speciality;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.rating;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.reviewsCount;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.value;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SbSpecialistBlock(id=");
            sb2.append(this.id);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", avatar=");
            sb2.append(this.avatar);
            sb2.append(", speciality=");
            sb2.append(this.speciality);
            sb2.append(", rating=");
            sb2.append(this.rating);
            sb2.append(", reviewsCount=");
            sb2.append(this.reviewsCount);
            sb2.append(", value=");
            return C22026a.c(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.id);
            parcel.writeString(this.name);
            parcel.writeParcelable(this.avatar, i12);
            parcel.writeString(this.speciality);
            parcel.writeString(this.rating);
            Integer num = this.reviewsCount;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.value);
        }
    }

    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SbSpecialistsBlock> {
        @Override // android.os.Parcelable.Creator
        public final SbSpecialistsBlock createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iL2 = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(SbSpecialistsBlock.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new SbSpecialistsBlock(string, string2, boolValueOf, boolValueOf2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SbSpecialistsBlock[] newArray(int i12) {
            return new SbSpecialistsBlock[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SbSpecialistsBlock(@k String str, @l String str2, @l Boolean bool, @l Boolean bool2, @l List<? extends SbSpecialist> list) {
        this.id = str;
        this.value = str2;
        this.isOptional = bool;
        this.readOnly = bool2;
        this.values = list;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getReadOnly() {
        return this.readOnly;
    }

    @l
    public final List<SbSpecialist> d() {
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
        if (!(obj instanceof SbSpecialistsBlock)) {
            return false;
        }
        SbSpecialistsBlock sbSpecialistsBlock = (SbSpecialistsBlock) obj;
        return L.f(this.id, sbSpecialistsBlock.id) && L.f(this.value, sbSpecialistsBlock.value) && L.f(this.isOptional, sbSpecialistsBlock.isOptional) && L.f(this.readOnly, sbSpecialistsBlock.readOnly) && L.f(this.values, sbSpecialistsBlock.values);
    }

    @k
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isOptional;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.readOnly;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<SbSpecialist> list = this.values;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbSpecialistsBlock(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", isOptional=");
        sb2.append(this.isOptional);
        sb2.append(", readOnly=");
        sb2.append(this.readOnly);
        sb2.append(", values=");
        return H.p(sb2, this.values, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.value);
        Boolean bool = this.isOptional;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.readOnly;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        List<SbSpecialist> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }
}
