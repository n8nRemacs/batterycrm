package com.avito.android.stories.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryBannerItem.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/model/BannerType;", "", "Landroid/os/Parcelable;", "a", "_avito_stories_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BannerType implements Parcelable {

    @k
    public static final Parcelable.Creator<BannerType> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f285148b;

    /* renamed from: c, reason: collision with root package name */
    public static final BannerType f285149c;

    /* renamed from: d, reason: collision with root package name */
    public static final BannerType f285150d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BannerType[] f285151e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f285152f;

    /* compiled from: StoryBannerItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/model/BannerType$a;", "", "<init>", "()V", "_avito_stories_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        BannerType bannerType = new BannerType("TOP", 0);
        f285149c = bannerType;
        BannerType bannerType2 = new BannerType("INLINE", 1);
        f285150d = bannerType2;
        BannerType[] bannerTypeArr = {bannerType, bannerType2};
        f285151e = bannerTypeArr;
        f285152f = c.a(bannerTypeArr);
        f285148b = new a(null);
        CREATOR = new Parcelable.Creator<BannerType>() { // from class: com.avito.android.stories.model.BannerType.b
            @Override // android.os.Parcelable.Creator
            public final BannerType createFromParcel(Parcel parcel) {
                return BannerType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BannerType[] newArray(int i12) {
                return new BannerType[i12];
            }
        };
    }

    public BannerType() {
        throw null;
    }

    public static BannerType valueOf(String str) {
        return (BannerType) Enum.valueOf(BannerType.class, str);
    }

    public static BannerType[] values() {
        return (BannerType[]) f285151e.clone();
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
