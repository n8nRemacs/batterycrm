package com.avito.android.inline_filters.calendar;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: FlexDatesConfig.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/calendar/FlexDatesConfig;", "Landroid/os/Parcelable;", "Option", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FlexDatesConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<FlexDatesConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f171057b;

    /* renamed from: c, reason: collision with root package name */
    public final int f171058c;

    /* renamed from: d, reason: collision with root package name */
    public final int f171059d;

    /* compiled from: FlexDatesConfig.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/calendar/FlexDatesConfig$Option;", "Landroid/os/Parcelable;", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Option implements Parcelable {

        @k
        public static final Parcelable.Creator<Option> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f171060b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f171061c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f171062d;

        /* compiled from: FlexDatesConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Option> {
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                return new Option(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i12) {
                return new Option[i12];
            }
        }

        public Option(int i12, @k String str, boolean z12) {
            this.f171060b = i12;
            this.f171061c = str;
            this.f171062d = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f171060b);
            parcel.writeString(this.f171061c);
            parcel.writeInt(this.f171062d ? 1 : 0);
        }
    }

    /* compiled from: FlexDatesConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexDatesConfig> {
        @Override // android.os.Parcelable.Creator
        public final FlexDatesConfig createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new FlexDatesConfig(arrayList, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final FlexDatesConfig[] newArray(int i12) {
            return new FlexDatesConfig[i12];
        }
    }

    public FlexDatesConfig(@k ArrayList arrayList, int i12, int i13) {
        this.f171057b = arrayList;
        this.f171058c = i12;
        this.f171059d = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f171057b, parcel);
        while (itZ.hasNext()) {
            ((Option) itZ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f171058c);
        parcel.writeInt(this.f171059d);
    }
}
