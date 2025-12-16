package com.avito.android.service_booking;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlock.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/service_booking/SbPriceListBlock;", "Lcom/avito/android/service_booking/ServiceBookingBlock;", "", "title", "", "Lcom/avito/android/service_booking/SbPriceListBlock$Value;", "values", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "setValues", "(Ljava/util/List;)V", "Value", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbPriceListBlock implements ServiceBookingBlock {

    @k
    public static final Parcelable.Creator<SbPriceListBlock> CREATOR = new a();

    @c("title")
    @l
    private String title;

    @c("values")
    @k
    private List<Value> values;

    /* compiled from: ServiceBookingBlock.kt */
    @d
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/service_booking/SbPriceListBlock$Value;", "Landroid/os/Parcelable;", "", "title", "price", "", "isBold", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getPrice", "setPrice", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "setBold", "(Ljava/lang/Boolean;)V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Value implements Parcelable {

        @k
        public static final Parcelable.Creator<Value> CREATOR = new a();

        @c("isBold")
        @l
        private Boolean isBold;

        @c("price")
        @k
        private String price;

        @c("title")
        @k
        private String title;

        /* compiled from: ServiceBookingBlock.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Value> {
            @Override // android.os.Parcelable.Creator
            public final Value createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Value(string, string2, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        public Value(@k String str, @k String str2, @l Boolean bool) {
            this.title = str;
            this.price = str2;
            this.isBold = bool;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Boolean getIsBold() {
            return this.isBold;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return L.f(this.title, value.title) && L.f(this.price, value.price) && L.f(this.isBold, value.isBold);
        }

        @k
        public final String getPrice() {
            return this.price;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iD2 = H.d(this.title.hashCode() * 31, 31, this.price);
            Boolean bool = this.isBold;
            return iD2 + (bool == null ? 0 : bool.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Value(title=");
            sb2.append(this.title);
            sb2.append(", price=");
            sb2.append(this.price);
            sb2.append(", isBold=");
            return C0.g(sb2, this.isBold, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.price);
            Boolean bool = this.isBold;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SbPriceListBlock> {
        @Override // android.os.Parcelable.Creator
        public final SbPriceListBlock createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Value.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SbPriceListBlock(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SbPriceListBlock[] newArray(int i12) {
            return new SbPriceListBlock[i12];
        }
    }

    public SbPriceListBlock(@l String str, @k List<Value> list) {
        this.title = str;
        this.values = list;
    }

    @k
    public final List<Value> c() {
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
        if (!(obj instanceof SbPriceListBlock)) {
            return false;
        }
        SbPriceListBlock sbPriceListBlock = (SbPriceListBlock) obj;
        return L.f(this.title, sbPriceListBlock.title) && L.f(this.values, sbPriceListBlock.values);
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        return this.values.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbPriceListBlock(title=");
        sb2.append(this.title);
        sb2.append(", values=");
        return H.p(sb2, this.values, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.values, parcel);
        while (itJ.hasNext()) {
            ((Value) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
