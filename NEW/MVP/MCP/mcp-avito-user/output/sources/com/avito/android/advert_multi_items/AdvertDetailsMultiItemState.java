package com.avito.android.advert_multi_items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import j.U;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsMultiItemState.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_multi_items/AdvertDetailsMultiItemState;", "Landroid/os/Parcelable;", "ParamState", "ParamsItemState", "ParamsState", "_avito_advert-multi-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsMultiItemState implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDetailsMultiItemState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f85868b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ParamsState f85869c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f85870d;

    /* compiled from: AdvertDetailsMultiItemState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_multi_items/AdvertDetailsMultiItemState$ParamState;", "Landroid/os/Parcelable;", "_avito_advert-multi-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ParamState implements Parcelable {

        @k
        public static final Parcelable.Creator<ParamState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f85871b;

        /* renamed from: c, reason: collision with root package name */
        public final int f85872c;

        /* compiled from: AdvertDetailsMultiItemState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ParamState> {
            @Override // android.os.Parcelable.Creator
            public final ParamState createFromParcel(Parcel parcel) {
                return new ParamState(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final ParamState[] newArray(int i12) {
                return new ParamState[i12];
            }
        }

        public ParamState(int i12, @U int i13) {
            this.f85871b = i12;
            this.f85872c = i13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParamState)) {
                return false;
            }
            ParamState paramState = (ParamState) obj;
            return this.f85871b == paramState.f85871b && this.f85872c == paramState.f85872c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f85872c) + (Integer.hashCode(this.f85871b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ParamState(firstCompletelyVisiblePosition=");
            sb2.append(this.f85871b);
            sb2.append(", scrollOffset=");
            return r.t(sb2, this.f85872c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f85871b);
            parcel.writeInt(this.f85872c);
        }
    }

    /* compiled from: AdvertDetailsMultiItemState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_multi_items/AdvertDetailsMultiItemState$ParamsItemState;", "Landroid/os/Parcelable;", "_avito_advert-multi-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ParamsItemState implements Parcelable {

        @k
        public static final Parcelable.Creator<ParamsItemState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f85873b;

        /* compiled from: AdvertDetailsMultiItemState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ParamsItemState> {
            @Override // android.os.Parcelable.Creator
            public final ParamsItemState createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readInt() == 0 ? null : ParamState.CREATOR.createFromParcel(parcel));
                }
                return new ParamsItemState(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ParamsItemState[] newArray(int i12) {
                return new ParamsItemState[i12];
            }
        }

        public ParamsItemState(@k ArrayList arrayList) {
            this.f85873b = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ParamsItemState) && this.f85873b.equals(((ParamsItemState) obj).f85873b);
        }

        public final int hashCode() {
            return this.f85873b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ParamsItemState(paramsState="), this.f85873b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f85873b, parcel);
            while (itZ.hasNext()) {
                ParamState paramState = (ParamState) itZ.next();
                if (paramState == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    paramState.writeToParcel(parcel, i12);
                }
            }
        }
    }

    /* compiled from: AdvertDetailsMultiItemState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_multi_items/AdvertDetailsMultiItemState$ParamsState;", "Landroid/os/Parcelable;", "_avito_advert-multi-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ParamsState implements Parcelable {

        @k
        public static final Parcelable.Creator<ParamsState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f85874b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ParamsItemState f85875c;

        /* compiled from: AdvertDetailsMultiItemState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ParamsState> {
            @Override // android.os.Parcelable.Creator
            public final ParamsState createFromParcel(Parcel parcel) {
                return new ParamsState(parcel.readInt(), ParamsItemState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ParamsState[] newArray(int i12) {
                return new ParamsState[i12];
            }
        }

        public ParamsState(@U int i12, @k ParamsItemState paramsItemState) {
            this.f85874b = i12;
            this.f85875c = paramsItemState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParamsState)) {
                return false;
            }
            ParamsState paramsState = (ParamsState) obj;
            return this.f85874b == paramsState.f85874b && L.f(this.f85875c, paramsState.f85875c);
        }

        public final int hashCode() {
            return this.f85875c.f85873b.hashCode() + (Integer.hashCode(this.f85874b) * 31);
        }

        @k
        public final String toString() {
            return "ParamsState(paramsItemScrollOffset=" + this.f85874b + ", paramsItemState=" + this.f85875c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f85874b);
            this.f85875c.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: AdvertDetailsMultiItemState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsMultiItemState> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsMultiItemState createFromParcel(Parcel parcel) {
            return new AdvertDetailsMultiItemState(parcel.readString(), parcel.readInt() == 0 ? null : ParamsState.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsMultiItemState[] newArray(int i12) {
            return new AdvertDetailsMultiItemState[i12];
        }
    }

    public AdvertDetailsMultiItemState(@k String str, @l ParamsState paramsState, @l String str2) {
        this.f85868b = str;
        this.f85869c = paramsState;
        this.f85870d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsMultiItemState)) {
            return false;
        }
        AdvertDetailsMultiItemState advertDetailsMultiItemState = (AdvertDetailsMultiItemState) obj;
        return L.f(this.f85868b, advertDetailsMultiItemState.f85868b) && L.f(this.f85869c, advertDetailsMultiItemState.f85869c) && L.f(this.f85870d, advertDetailsMultiItemState.f85870d);
    }

    public final int hashCode() {
        int iHashCode = this.f85868b.hashCode() * 31;
        ParamsState paramsState = this.f85869c;
        int iHashCode2 = (iHashCode + (paramsState == null ? 0 : paramsState.hashCode())) * 31;
        String str = this.f85870d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsMultiItemState(sourceItemId=");
        sb2.append(this.f85868b);
        sb2.append(", paramsState=");
        sb2.append(this.f85869c);
        sb2.append(", lastSelectedTitle=");
        return C22026a.c(sb2, this.f85870d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f85868b);
        ParamsState paramsState = this.f85869c;
        if (paramsState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paramsState.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f85870d);
    }
}
