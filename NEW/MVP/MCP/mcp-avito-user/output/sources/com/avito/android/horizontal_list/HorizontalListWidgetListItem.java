package com.avito.android.horizontal_list;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HorizontalListWidgetListItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/horizontal_list/HorizontalListWidgetListItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Default", "RecentSearch", "Lcom/avito/android/horizontal_list/HorizontalListWidgetListItem$Default;", "Lcom/avito/android/horizontal_list/HorizontalListWidgetListItem$RecentSearch;", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface HorizontalListWidgetListItem extends ParcelableItem {

    /* compiled from: HorizontalListWidgetListItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/horizontal_list/HorizontalListWidgetListItem$Default;", "Lcom/avito/android/horizontal_list/HorizontalListWidgetListItem;", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Default implements HorizontalListWidgetListItem {

        @k
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f162548b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f162549c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f162550d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final DeepLink f162551e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f162552f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Analytics f162553g;

        /* compiled from: HorizontalListWidgetListItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                return new Default(parcel.readInt(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Default.class.getClassLoader()), null, (Analytics) parcel.readParcelable(Default.class.getClassLoader()), 16, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i12) {
                return new Default[i12];
            }
        }

        public Default(int i12, String str, String str2, DeepLink deepLink, String str3, Analytics analytics, int i13, C42822w c42822w) {
            str3 = (i13 & 16) != 0 ? UUID.randomUUID().toString() : str3;
            this.f162548b = i12;
            this.f162549c = str;
            this.f162550d = str2;
            this.f162551e = deepLink;
            this.f162552f = str3;
            this.f162553g = analytics;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF270912b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF270913c() {
            return this.f162552f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f162548b);
            parcel.writeString(this.f162549c);
            parcel.writeString(this.f162550d);
            parcel.writeParcelable(this.f162551e, i12);
            parcel.writeParcelable(this.f162553g, i12);
        }
    }

    /* compiled from: HorizontalListWidgetListItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/horizontal_list/HorizontalListWidgetListItem$RecentSearch;", "Lcom/avito/android/horizontal_list/HorizontalListWidgetListItem;", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RecentSearch implements HorizontalListWidgetListItem {

        @k
        public static final Parcelable.Creator<RecentSearch> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f162554b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f162555c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f162556d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final DeepLink f162557e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f162558f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f162559g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final Analytics f162560h;

        /* compiled from: HorizontalListWidgetListItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RecentSearch> {
            @Override // android.os.Parcelable.Creator
            public final RecentSearch createFromParcel(Parcel parcel) {
                return new RecentSearch(parcel.readInt(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(RecentSearch.class.getClassLoader()), parcel.readString(), null, (Analytics) parcel.readParcelable(RecentSearch.class.getClassLoader()), 32, null);
            }

            @Override // android.os.Parcelable.Creator
            public final RecentSearch[] newArray(int i12) {
                return new RecentSearch[i12];
            }
        }

        public RecentSearch(int i12, String str, String str2, DeepLink deepLink, String str3, String str4, Analytics analytics, int i13, C42822w c42822w) {
            str4 = (i13 & 32) != 0 ? UUID.randomUUID().toString() : str4;
            this.f162554b = i12;
            this.f162555c = str;
            this.f162556d = str2;
            this.f162557e = deepLink;
            this.f162558f = str3;
            this.f162559g = str4;
            this.f162560h = analytics;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF270912b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF270913c() {
            return this.f162559g;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f162554b);
            parcel.writeString(this.f162555c);
            parcel.writeString(this.f162556d);
            parcel.writeParcelable(this.f162557e, i12);
            parcel.writeString(this.f162558f);
            parcel.writeParcelable(this.f162560h, i12);
        }
    }

    /* compiled from: HorizontalListWidgetListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }
}
