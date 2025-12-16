package com.avito.android.tariff_lf.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffPriceSegment.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/tariff_lf/remote/model/TariffPriceSegment;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/tariff_lf/remote/model/TariffPriceSegment$SegmentParameter;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "SegmentParameter", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TariffPriceSegment implements Parcelable {

    @k
    public static final Parcelable.Creator<TariffPriceSegment> CREATOR = new a();

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final List<SegmentParameter> parameters;

    @c("title")
    @k
    private final String title;

    /* compiled from: TariffPriceSegment.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/tariff_lf/remote/model/TariffPriceSegment$SegmentParameter;", "Landroid/os/Parcelable;", "", "key", "value", "badge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "getValue", "c", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SegmentParameter implements Parcelable {

        @k
        public static final Parcelable.Creator<SegmentParameter> CREATOR = new a();

        @c("badge")
        @l
        private final String badge;

        @c("key")
        @k
        private final String key;

        @c("value")
        @k
        private final String value;

        /* compiled from: TariffPriceSegment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SegmentParameter> {
            @Override // android.os.Parcelable.Creator
            public final SegmentParameter createFromParcel(Parcel parcel) {
                return new SegmentParameter(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SegmentParameter[] newArray(int i12) {
                return new SegmentParameter[i12];
            }
        }

        public SegmentParameter(@k String str, @k String str2, @l String str3) {
            this.key = str;
            this.value = str2;
            this.badge = str3;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getBadge() {
            return this.badge;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SegmentParameter)) {
                return false;
            }
            SegmentParameter segmentParameter = (SegmentParameter) obj;
            return L.f(this.key, segmentParameter.key) && L.f(this.value, segmentParameter.value) && L.f(this.badge, segmentParameter.badge);
        }

        @k
        public final String getValue() {
            return this.value;
        }

        public final int hashCode() {
            int iD2 = H.d(this.key.hashCode() * 31, 31, this.value);
            String str = this.badge;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SegmentParameter(key=");
            sb2.append(this.key);
            sb2.append(", value=");
            sb2.append(this.value);
            sb2.append(", badge=");
            return C22026a.c(sb2, this.badge, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.key);
            parcel.writeString(this.value);
            parcel.writeString(this.badge);
        }
    }

    /* compiled from: TariffPriceSegment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffPriceSegment> {
        @Override // android.os.Parcelable.Creator
        public final TariffPriceSegment createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(SegmentParameter.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new TariffPriceSegment(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final TariffPriceSegment[] newArray(int i12) {
            return new TariffPriceSegment[i12];
        }
    }

    public TariffPriceSegment(@k String str, @l List<SegmentParameter> list) {
        this.title = str;
        this.parameters = list;
    }

    @l
    public final List<SegmentParameter> c() {
        return this.parameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffPriceSegment)) {
            return false;
        }
        TariffPriceSegment tariffPriceSegment = (TariffPriceSegment) obj;
        return L.f(this.title, tariffPriceSegment.title) && L.f(this.parameters, tariffPriceSegment.parameters);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        List<SegmentParameter> list = this.parameters;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffPriceSegment(title=");
        sb2.append(this.title);
        sb2.append(", parameters=");
        return H.p(sb2, this.parameters, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        List<SegmentParameter> list = this.parameters;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((SegmentParameter) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
