package com.avito.android.ratings;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* compiled from: SummaryScoreData.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ratings/SummaryScoreData;", "Landroid/os/Parcelable;", "SummaryScoreDetailsData", "SummaryScoreStateData", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SummaryScoreData implements Parcelable {

    @k
    public static final Parcelable.Creator<SummaryScoreData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250524b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SummaryScoreStateData f250525c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SummaryScoreDetailsData f250526d;

    /* compiled from: SummaryScoreData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ratings/SummaryScoreData$SummaryScoreDetailsData;", "Landroid/os/Parcelable;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SummaryScoreDetailsData implements Parcelable {

        @k
        public static final Parcelable.Creator<SummaryScoreDetailsData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f250527b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f250528c;

        /* compiled from: SummaryScoreData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SummaryScoreDetailsData> {
            @Override // android.os.Parcelable.Creator
            public final SummaryScoreDetailsData createFromParcel(Parcel parcel) {
                return new SummaryScoreDetailsData(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SummaryScoreDetailsData[] newArray(int i12) {
                return new SummaryScoreDetailsData[i12];
            }
        }

        public SummaryScoreDetailsData(@k String str, @k String str2) {
            this.f250527b = str;
            this.f250528c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f250527b);
            parcel.writeString(this.f250528c);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SummaryScoreData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ratings/SummaryScoreData$SummaryScoreStateData;", "", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SummaryScoreStateData {

        /* renamed from: b, reason: collision with root package name */
        public static final SummaryScoreStateData f250529b;

        /* renamed from: c, reason: collision with root package name */
        public static final SummaryScoreStateData f250530c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ SummaryScoreStateData[] f250531d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f250532e;

        static {
            SummaryScoreStateData summaryScoreStateData = new SummaryScoreStateData("POSITIVE", 0);
            f250529b = summaryScoreStateData;
            SummaryScoreStateData summaryScoreStateData2 = new SummaryScoreStateData("NEGATIVE", 1);
            f250530c = summaryScoreStateData2;
            SummaryScoreStateData[] summaryScoreStateDataArr = {summaryScoreStateData, summaryScoreStateData2};
            f250531d = summaryScoreStateDataArr;
            f250532e = c.a(summaryScoreStateDataArr);
        }

        public SummaryScoreStateData() {
            throw null;
        }

        public static SummaryScoreStateData valueOf(String str) {
            return (SummaryScoreStateData) Enum.valueOf(SummaryScoreStateData.class, str);
        }

        public static SummaryScoreStateData[] values() {
            return (SummaryScoreStateData[]) f250531d.clone();
        }
    }

    /* compiled from: SummaryScoreData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SummaryScoreData> {
        @Override // android.os.Parcelable.Creator
        public final SummaryScoreData createFromParcel(Parcel parcel) {
            return new SummaryScoreData(parcel.readString(), SummaryScoreStateData.valueOf(parcel.readString()), SummaryScoreDetailsData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SummaryScoreData[] newArray(int i12) {
            return new SummaryScoreData[i12];
        }
    }

    public SummaryScoreData(@k String str, @k SummaryScoreStateData summaryScoreStateData, @k SummaryScoreDetailsData summaryScoreDetailsData) {
        this.f250524b = str;
        this.f250525c = summaryScoreStateData;
        this.f250526d = summaryScoreDetailsData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f250524b);
        parcel.writeString(this.f250525c.name());
        this.f250526d.writeToParcel(parcel, i12);
    }
}
