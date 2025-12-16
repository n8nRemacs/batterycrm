package com.avito.android.serp.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertItemRedesignGroup.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/AdvertItemRedesignGroup;", "", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdvertItemRedesignGroup implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AdvertItemRedesignGroup> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final AdvertItemRedesignGroup f268480b;

    /* renamed from: c, reason: collision with root package name */
    public static final AdvertItemRedesignGroup f268481c;

    /* renamed from: d, reason: collision with root package name */
    public static final AdvertItemRedesignGroup f268482d;

    /* renamed from: e, reason: collision with root package name */
    public static final AdvertItemRedesignGroup f268483e;

    /* renamed from: f, reason: collision with root package name */
    public static final AdvertItemRedesignGroup f268484f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AdvertItemRedesignGroup[] f268485g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f268486h;

    static {
        AdvertItemRedesignGroup advertItemRedesignGroup = new AdvertItemRedesignGroup("NO_CARD", 0);
        f268480b = advertItemRedesignGroup;
        AdvertItemRedesignGroup advertItemRedesignGroup2 = new AdvertItemRedesignGroup("GREY_GEO", 1);
        f268481c = advertItemRedesignGroup2;
        AdvertItemRedesignGroup advertItemRedesignGroup3 = new AdvertItemRedesignGroup("ROUNDED_IMAGE", 2);
        f268482d = advertItemRedesignGroup3;
        AdvertItemRedesignGroup advertItemRedesignGroup4 = new AdvertItemRedesignGroup("BADGES_REDESIGN", 3);
        f268483e = advertItemRedesignGroup4;
        AdvertItemRedesignGroup advertItemRedesignGroup5 = new AdvertItemRedesignGroup("WITH_DELIVERY", 4);
        f268484f = advertItemRedesignGroup5;
        AdvertItemRedesignGroup[] advertItemRedesignGroupArr = {advertItemRedesignGroup, advertItemRedesignGroup2, advertItemRedesignGroup3, advertItemRedesignGroup4, advertItemRedesignGroup5};
        f268485g = advertItemRedesignGroupArr;
        f268486h = kotlin.enums.c.a(advertItemRedesignGroupArr);
        CREATOR = new Parcelable.Creator<AdvertItemRedesignGroup>() { // from class: com.avito.android.serp.adapter.AdvertItemRedesignGroup.a
            @Override // android.os.Parcelable.Creator
            public final AdvertItemRedesignGroup createFromParcel(Parcel parcel) {
                return AdvertItemRedesignGroup.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AdvertItemRedesignGroup[] newArray(int i12) {
                return new AdvertItemRedesignGroup[i12];
            }
        };
    }

    public AdvertItemRedesignGroup() {
        throw null;
    }

    public static AdvertItemRedesignGroup valueOf(String str) {
        return (AdvertItemRedesignGroup) Enum.valueOf(AdvertItemRedesignGroup.class, str);
    }

    public static AdvertItemRedesignGroup[] values() {
        return (AdvertItemRedesignGroup[]) f268485g.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
