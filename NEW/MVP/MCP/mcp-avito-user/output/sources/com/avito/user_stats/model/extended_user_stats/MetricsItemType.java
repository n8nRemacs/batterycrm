package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.FontStyleKt;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StatsSplitLocal.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/MetricsItemType;", "", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MetricsItemType implements Parcelable {

    @k
    public static final Parcelable.Creator<MetricsItemType> CREATOR;

    /* renamed from: c, reason: collision with root package name */
    public static final MetricsItemType f338650c;

    /* renamed from: d, reason: collision with root package name */
    public static final MetricsItemType f338651d;

    /* renamed from: e, reason: collision with root package name */
    public static final MetricsItemType f338652e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ MetricsItemType[] f338653f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f338654g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f338655b;

    static {
        MetricsItemType metricsItemType = new MetricsItemType("Regular", 0, FontStyleKt.REGULAR);
        f338650c = metricsItemType;
        MetricsItemType metricsItemType2 = new MetricsItemType("Money", 1, "money");
        f338651d = metricsItemType2;
        MetricsItemType metricsItemType3 = new MetricsItemType("Conversion", 2, "conversion");
        f338652e = metricsItemType3;
        MetricsItemType[] metricsItemTypeArr = {metricsItemType, metricsItemType2, metricsItemType3};
        f338653f = metricsItemTypeArr;
        f338654g = c.a(metricsItemTypeArr);
        CREATOR = new Parcelable.Creator<MetricsItemType>() { // from class: com.avito.user_stats.model.extended_user_stats.MetricsItemType.a
            @Override // android.os.Parcelable.Creator
            public final MetricsItemType createFromParcel(Parcel parcel) {
                return MetricsItemType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MetricsItemType[] newArray(int i12) {
                return new MetricsItemType[i12];
            }
        };
    }

    public MetricsItemType(String str, int i12, String str2) {
        this.f338655b = str2;
    }

    public static MetricsItemType valueOf(String str) {
        return (MetricsItemType) Enum.valueOf(MetricsItemType.class, str);
    }

    public static MetricsItemType[] values() {
        return (MetricsItemType[]) f338653f.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
