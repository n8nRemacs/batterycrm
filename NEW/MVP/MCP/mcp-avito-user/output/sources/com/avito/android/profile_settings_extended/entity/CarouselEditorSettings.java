package com.avito.android.profile_settings_extended.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: CarouselEditorSettings.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/CarouselEditorSettings;", "Landroid/os/Parcelable;", "CarouselNameItem", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CarouselEditorSettings implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CarouselEditorSettings> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f230254b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f230255c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f230256d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f230257e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f230258f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f230259g;

    /* renamed from: h, reason: collision with root package name */
    public final int f230260h;

    /* renamed from: i, reason: collision with root package name */
    public final int f230261i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ArrayList f230262j;

    /* compiled from: CarouselEditorSettings.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/CarouselEditorSettings$CarouselNameItem;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class CarouselNameItem implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<CarouselNameItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f230263b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f230264c;

        /* compiled from: CarouselEditorSettings.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CarouselNameItem> {
            @Override // android.os.Parcelable.Creator
            public final CarouselNameItem createFromParcel(Parcel parcel) {
                return new CarouselNameItem(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CarouselNameItem[] newArray(int i12) {
                return new CarouselNameItem[i12];
            }
        }

        public CarouselNameItem(int i12, @Y61.k String str) {
            this.f230263b = i12;
            this.f230264c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f230263b);
            parcel.writeString(this.f230264c);
        }
    }

    /* compiled from: CarouselEditorSettings.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CarouselEditorSettings> {
        @Override // android.os.Parcelable.Creator
        public final CarouselEditorSettings createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iC2 = 0;
            while (iC2 != i14) {
                iC2 = com.avito.android.actions_sheet.a.c(CarouselNameItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CarouselEditorSettings(string, string2, string3, string4, string5, string6, i12, i13, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CarouselEditorSettings[] newArray(int i12) {
            return new CarouselEditorSettings[i12];
        }
    }

    public CarouselEditorSettings(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k String str6, int i12, int i13, @Y61.k ArrayList arrayList) {
        this.f230254b = str;
        this.f230255c = str2;
        this.f230256d = str3;
        this.f230257e = str4;
        this.f230258f = str5;
        this.f230259g = str6;
        this.f230260h = i12;
        this.f230261i = i13;
        this.f230262j = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f230254b);
        parcel.writeString(this.f230255c);
        parcel.writeString(this.f230256d);
        parcel.writeString(this.f230257e);
        parcel.writeString(this.f230258f);
        parcel.writeString(this.f230259g);
        parcel.writeInt(this.f230260h);
        parcel.writeInt(this.f230261i);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f230262j, parcel);
        while (itZ.hasNext()) {
            ((CarouselNameItem) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
