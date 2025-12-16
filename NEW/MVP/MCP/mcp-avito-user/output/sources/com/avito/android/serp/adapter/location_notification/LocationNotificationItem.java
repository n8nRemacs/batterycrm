package com.avito.android.serp.adapter.location_notification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.FontStyleKt;
import com.avito.android.serp.adapter.InterfaceC34742k0;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationNotificationItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/location_notification/LocationNotificationItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/serp/adapter/k0;", "TooltipType", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocationNotificationItem implements PersistableSerpItem, InterfaceC34742k0 {

    @Y61.k
    public static final Parcelable.Creator<LocationNotificationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f270234b;

    /* renamed from: c, reason: collision with root package name */
    public final int f270235c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f270236d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f270237e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f270238f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final TooltipType f270239g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f270240h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f270241i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f270242j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LocationNotificationItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/location_notification/LocationNotificationItem$TooltipType;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TooltipType {

        /* renamed from: c, reason: collision with root package name */
        public static final TooltipType f270243c;

        /* renamed from: d, reason: collision with root package name */
        public static final TooltipType f270244d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ TooltipType[] f270245e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f270246f;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f270247b;

        static {
            TooltipType tooltipType = new TooltipType("CHANGE", 0, "change");
            f270243c = tooltipType;
            TooltipType tooltipType2 = new TooltipType("REGULAR", 1, FontStyleKt.REGULAR);
            f270244d = tooltipType2;
            TooltipType[] tooltipTypeArr = {tooltipType, tooltipType2};
            f270245e = tooltipTypeArr;
            f270246f = kotlin.enums.c.a(tooltipTypeArr);
        }

        public TooltipType(String str, int i12, String str2) {
            this.f270247b = str2;
        }

        public static TooltipType valueOf(String str) {
            return (TooltipType) Enum.valueOf(TooltipType.class, str);
        }

        public static TooltipType[] values() {
            return (TooltipType[]) f270245e.clone();
        }
    }

    /* compiled from: LocationNotificationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocationNotificationItem> {
        @Override // android.os.Parcelable.Creator
        public final LocationNotificationItem createFromParcel(Parcel parcel) {
            return new LocationNotificationItem(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TooltipType.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LocationNotificationItem[] newArray(int i12) {
            return new LocationNotificationItem[i12];
        }
    }

    public LocationNotificationItem(@Y61.k String str, int i12, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l TooltipType tooltipType, @Y61.l String str5) {
        this.f270234b = str;
        this.f270235c = i12;
        this.f270236d = str2;
        this.f270237e = str3;
        this.f270238f = str4;
        this.f270239g = tooltipType;
        this.f270240h = str5;
        this.f270241i = SerpViewType.f268585e;
        this.f270242j = true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF272805f() {
        return this.f270242j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF247713b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270628h() {
        return this.f270235c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270622b() {
        return this.f270234b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270627g() {
        return this.f270241i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f270234b);
        parcel.writeInt(this.f270235c);
        parcel.writeString(this.f270236d);
        parcel.writeString(this.f270237e);
        parcel.writeString(this.f270238f);
        TooltipType tooltipType = this.f270239g;
        if (tooltipType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(tooltipType.name());
        }
        parcel.writeString(this.f270240h);
    }

    public /* synthetic */ LocationNotificationItem(String str, int i12, String str2, String str3, String str4, TooltipType tooltipType, String str5, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? UUID.randomUUID().toString() : str, i12, str2, str3, str4, tooltipType, str5);
    }
}
