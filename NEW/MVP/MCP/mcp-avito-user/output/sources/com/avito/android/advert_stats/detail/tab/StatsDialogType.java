package com.avito.android.advert_stats.detail.tab;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StatsDialogType.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/StatsDialogType;", "", "<init>", "()V", "a", "HowUnderstandChartType", "b", "c", "Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$HowUnderstandChartType;", "Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$b;", "Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$c;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class StatsDialogType {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f86193b = new a(null);

    /* compiled from: StatsDialogType.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$HowUnderstandChartType;", "Lcom/avito/android/advert_stats/detail/tab/StatsDialogType;", "Landroid/os/Parcelable;", "()V", "AvgViewsCost", "Impressions", "Views", "Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$HowUnderstandChartType$AvgViewsCost;", "Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$HowUnderstandChartType$Impressions;", "Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$HowUnderstandChartType$Views;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static abstract class HowUnderstandChartType extends StatsDialogType implements Parcelable {

        /* compiled from: StatsDialogType.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$HowUnderstandChartType$AvgViewsCost;", "Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$HowUnderstandChartType;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AvgViewsCost extends HowUnderstandChartType {

            /* renamed from: c, reason: collision with root package name */
            @k
            public static final AvgViewsCost f86194c = new AvgViewsCost();

            @k
            public static final Parcelable.Creator<AvgViewsCost> CREATOR = new a();

            /* compiled from: StatsDialogType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AvgViewsCost> {
                @Override // android.os.Parcelable.Creator
                public final AvgViewsCost createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AvgViewsCost.f86194c;
                }

                @Override // android.os.Parcelable.Creator
                public final AvgViewsCost[] newArray(int i12) {
                    return new AvgViewsCost[i12];
                }
            }

            public AvgViewsCost() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof AvgViewsCost);
            }

            public final int hashCode() {
                return 1729354425;
            }

            @k
            public final String toString() {
                return "AvgViewsCost";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: StatsDialogType.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$HowUnderstandChartType$Impressions;", "Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$HowUnderstandChartType;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Impressions extends HowUnderstandChartType {

            /* renamed from: c, reason: collision with root package name */
            @k
            public static final Impressions f86195c = new Impressions();

            @k
            public static final Parcelable.Creator<Impressions> CREATOR = new a();

            /* compiled from: StatsDialogType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Impressions> {
                @Override // android.os.Parcelable.Creator
                public final Impressions createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Impressions.f86195c;
                }

                @Override // android.os.Parcelable.Creator
                public final Impressions[] newArray(int i12) {
                    return new Impressions[i12];
                }
            }

            public Impressions() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Impressions);
            }

            public final int hashCode() {
                return -214082694;
            }

            @k
            public final String toString() {
                return "Impressions";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: StatsDialogType.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$HowUnderstandChartType$Views;", "Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$HowUnderstandChartType;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Views extends HowUnderstandChartType {

            /* renamed from: c, reason: collision with root package name */
            @k
            public static final Views f86196c = new Views();

            @k
            public static final Parcelable.Creator<Views> CREATOR = new a();

            /* compiled from: StatsDialogType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Views> {
                @Override // android.os.Parcelable.Creator
                public final Views createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Views.f86196c;
                }

                @Override // android.os.Parcelable.Creator
                public final Views[] newArray(int i12) {
                    return new Views[i12];
                }
            }

            public Views() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Views);
            }

            public final int hashCode() {
                return -998802850;
            }

            @k
            public final String toString() {
                return "Views";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ HowUnderstandChartType(C42822w c42822w) {
            this();
        }

        public HowUnderstandChartType() {
            super(null);
        }
    }

    /* compiled from: StatsDialogType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$a;", "", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StatsDialogType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$b;", "Lcom/avito/android/advert_stats/detail/tab/StatsDialogType;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends StatsDialogType {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final b f86197c = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1352170076;
        }

        @k
        public final String toString() {
            return "MoreContacts";
        }
    }

    /* compiled from: StatsDialogType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/StatsDialogType$c;", "Lcom/avito/android/advert_stats/detail/tab/StatsDialogType;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends StatsDialogType {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final c f86198c = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1554390334;
        }

        @k
        public final String toString() {
            return "Responses";
        }
    }

    public /* synthetic */ StatsDialogType(C42822w c42822w) {
        this();
    }

    public StatsDialogType() {
    }
}
