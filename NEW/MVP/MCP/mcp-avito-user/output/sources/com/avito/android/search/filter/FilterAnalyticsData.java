package com.avito.android.search.filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FiltersIntentFactory.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/FilterAnalyticsData;", "Landroid/os/Parcelable;", "Source", "_avito_search_filter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FilterAnalyticsData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<FilterAnalyticsData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Source f261806b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f261807c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f261808d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f261809e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FiltersIntentFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/FilterAnalyticsData$Source;", "", "a", "_avito_search_filter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Source {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f261810c;

        /* renamed from: d, reason: collision with root package name */
        public static final Source f261811d;

        /* renamed from: e, reason: collision with root package name */
        public static final Source f261812e;

        /* renamed from: f, reason: collision with root package name */
        public static final Source f261813f;

        /* renamed from: g, reason: collision with root package name */
        public static final Source f261814g;

        /* renamed from: h, reason: collision with root package name */
        public static final Source f261815h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ Source[] f261816i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f261817j;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f261818b;

        /* compiled from: FiltersIntentFactory.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/FilterAnalyticsData$Source$a;", "", "<init>", "()V", "_avito_search_filter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            Source source = new Source("GENERAL", 0, "general");
            f261811d = source;
            Source source2 = new Source("SHOP_LIST", 1, "proprofileList");
            f261812e = source2;
            Source source3 = new Source("SHOP_DETAILED", 2, "proprofile");
            f261813f = source3;
            Source source4 = new Source("EXTENDED_PROFILE", 3, "extended_profile");
            f261814g = source4;
            Source source5 = new Source("BRANDED_PROFILE", 4, "branded_profile");
            f261815h = source5;
            Source[] sourceArr = {source, source2, source3, source4, source5};
            f261816i = sourceArr;
            f261817j = kotlin.enums.c.a(sourceArr);
            f261810c = new a(null);
        }

        public Source(String str, int i12, String str2) {
            this.f261818b = str2;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) f261816i.clone();
        }
    }

    /* compiled from: FiltersIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FilterAnalyticsData> {
        @Override // android.os.Parcelable.Creator
        public final FilterAnalyticsData createFromParcel(Parcel parcel) {
            return new FilterAnalyticsData(Source.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FilterAnalyticsData[] newArray(int i12) {
            return new FilterAnalyticsData[i12];
        }
    }

    public FilterAnalyticsData() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterAnalyticsData)) {
            return false;
        }
        FilterAnalyticsData filterAnalyticsData = (FilterAnalyticsData) obj;
        return this.f261806b == filterAnalyticsData.f261806b && kotlin.jvm.internal.L.f(this.f261807c, filterAnalyticsData.f261807c) && kotlin.jvm.internal.L.f(this.f261808d, filterAnalyticsData.f261808d) && kotlin.jvm.internal.L.f(this.f261809e, filterAnalyticsData.f261809e);
    }

    public final int hashCode() {
        int iHashCode = this.f261806b.hashCode() * 31;
        String str = this.f261807c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f261808d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f261809e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilterAnalyticsData(source=");
        sb2.append(this.f261806b);
        sb2.append(", userKey=");
        sb2.append(this.f261807c);
        sb2.append(", profileType=");
        sb2.append(this.f261808d);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f261809e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f261806b.name());
        parcel.writeString(this.f261807c);
        parcel.writeString(this.f261808d);
        parcel.writeString(this.f261809e);
    }

    public FilterAnalyticsData(@Y61.k Source source, @Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this.f261806b = source;
        this.f261807c = str;
        this.f261808d = str2;
        this.f261809e = str3;
    }

    public /* synthetic */ FilterAnalyticsData(Source source, String str, String str2, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? Source.f261811d : source, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3);
    }
}
