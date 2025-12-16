package com.avito.android.sx_address.new_address.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DetailItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/new_address/domain/DetailItem;", "Landroid/os/Parcelable;", "Option", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DetailItem implements Parcelable {

    @k
    public static final Parcelable.Creator<DetailItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f293606b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f293607c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f293608d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f293609e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f293610f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f293611g;

    /* compiled from: DetailItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/domain/DetailItem$Option;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Option implements Parcelable {

        @k
        public static final Parcelable.Creator<Option> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f293612b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f293613c;

        /* compiled from: DetailItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Option> {
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                return new Option(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i12) {
                return new Option[i12];
            }
        }

        public Option(@k String str, @k String str2) {
            this.f293612b = str;
            this.f293613c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return L.f(this.f293612b, option.f293612b) && L.f(this.f293613c, option.f293613c);
        }

        public final int hashCode() {
            return this.f293613c.hashCode() + (this.f293612b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Option(id=");
            sb2.append(this.f293612b);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f293613c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f293612b);
            parcel.writeString(this.f293613c);
        }
    }

    /* compiled from: DetailItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DetailItem> {
        @Override // android.os.Parcelable.Creator
        public final DetailItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new DetailItem(string, string2, z12, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DetailItem[] newArray(int i12) {
            return new DetailItem[i12];
        }
    }

    public DetailItem(@k String str, @l String str2, boolean z12, @k ArrayList arrayList, @k String str3, @l String str4) {
        this.f293606b = str;
        this.f293607c = str2;
        this.f293608d = z12;
        this.f293609e = arrayList;
        this.f293610f = str3;
        this.f293611g = str4;
    }

    public static DetailItem a(DetailItem detailItem, String str) {
        return new DetailItem(detailItem.f293606b, detailItem.f293607c, detailItem.f293608d, detailItem.f293609e, detailItem.f293610f, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailItem)) {
            return false;
        }
        DetailItem detailItem = (DetailItem) obj;
        return L.f(this.f293606b, detailItem.f293606b) && L.f(this.f293607c, detailItem.f293607c) && this.f293608d == detailItem.f293608d && this.f293609e.equals(detailItem.f293609e) && L.f(this.f293610f, detailItem.f293610f) && L.f(this.f293611g, detailItem.f293611g);
    }

    public final int hashCode() {
        int iHashCode = this.f293606b.hashCode() * 31;
        String str = this.f293607c;
        int iD2 = H.d(androidx.compose.ui.graphics.colorspace.e.g(this.f293609e, r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f293608d), 31), 31, this.f293610f);
        String str2 = this.f293611g;
        return iD2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DetailItem(id=");
        sb2.append(this.f293606b);
        sb2.append(", error=");
        sb2.append(this.f293607c);
        sb2.append(", isRequired=");
        sb2.append(this.f293608d);
        sb2.append(", options=");
        sb2.append(this.f293609e);
        sb2.append(", title=");
        sb2.append(this.f293610f);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f293611g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f293606b);
        parcel.writeString(this.f293607c);
        parcel.writeInt(this.f293608d ? 1 : 0);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f293609e, parcel);
        while (itZ.hasNext()) {
            ((Option) itZ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f293610f);
        parcel.writeString(this.f293611g);
    }
}
