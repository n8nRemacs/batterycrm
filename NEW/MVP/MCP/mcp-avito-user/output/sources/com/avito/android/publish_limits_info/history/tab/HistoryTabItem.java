package com.avito.android.publish_limits_info.history.tab;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem;
import kotlin.Metadata;

/* compiled from: HistoryTabItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish_limits_info/history/tab/HistoryTabItem;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/BaseTabItem;", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class HistoryTabItem extends BaseTabItem {

    @k
    public static final Parcelable.Creator<HistoryTabItem> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f245877d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f245878e;

    /* renamed from: f, reason: collision with root package name */
    public final int f245879f;

    /* compiled from: HistoryTabItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HistoryTabItem> {
        @Override // android.os.Parcelable.Creator
        public final HistoryTabItem createFromParcel(Parcel parcel) {
            return new HistoryTabItem(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final HistoryTabItem[] newArray(int i12) {
            return new HistoryTabItem[i12];
        }
    }

    public HistoryTabItem(@k String str, @k String str2, int i12) {
        super(str, Integer.valueOf(i12));
        this.f245877d = str;
        this.f245878e = str2;
        this.f245879f = i12;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem
    @k
    /* renamed from: c */
    public final Integer getF178141c() {
        return Integer.valueOf(this.f245879f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem, com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF245877d() {
        return this.f245877d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f245877d);
        parcel.writeString(this.f245878e);
        parcel.writeInt(this.f245879f);
    }
}
