package com.avito.android.social;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SocialType.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/social/SocialType;", "", "Landroid/os/Parcelable;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SocialType implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SocialType> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final SocialType f284279b;

    /* renamed from: c, reason: collision with root package name */
    public static final SocialType f284280c;

    /* renamed from: d, reason: collision with root package name */
    public static final SocialType f284281d;

    /* renamed from: e, reason: collision with root package name */
    public static final SocialType f284282e;

    /* renamed from: f, reason: collision with root package name */
    public static final SocialType f284283f;

    /* renamed from: g, reason: collision with root package name */
    public static final SocialType f284284g;

    /* renamed from: h, reason: collision with root package name */
    public static final SocialType f284285h;

    /* renamed from: i, reason: collision with root package name */
    public static final SocialType f284286i;

    /* renamed from: j, reason: collision with root package name */
    public static final SocialType f284287j;

    /* renamed from: k, reason: collision with root package name */
    public static final SocialType f284288k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ SocialType[] f284289l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f284290m;

    static {
        SocialType socialType = new SocialType("GOOGLE", 0);
        f284279b = socialType;
        SocialType socialType2 = new SocialType("LIVE_JOURNAL", 1);
        f284280c = socialType2;
        SocialType socialType3 = new SocialType("MAIL", 2);
        f284281d = socialType3;
        SocialType socialType4 = new SocialType("ODNOKLASSNIKI", 3);
        f284282e = socialType4;
        SocialType socialType5 = new SocialType("TWITTER", 4);
        f284283f = socialType5;
        SocialType socialType6 = new SocialType("VKONTAKTE", 5);
        f284284g = socialType6;
        SocialType socialType7 = new SocialType("VK_ID", 6);
        f284285h = socialType7;
        SocialType socialType8 = new SocialType("ESIA", 7);
        f284286i = socialType8;
        SocialType socialType9 = new SocialType("APPLE", 8);
        f284287j = socialType9;
        SocialType socialType10 = new SocialType("AVITO_FAKE", 9);
        f284288k = socialType10;
        SocialType[] socialTypeArr = {socialType, socialType2, socialType3, socialType4, socialType5, socialType6, socialType7, socialType8, socialType9, socialType10};
        f284289l = socialTypeArr;
        f284290m = kotlin.enums.c.a(socialTypeArr);
        CREATOR = new Parcelable.Creator<SocialType>() { // from class: com.avito.android.social.SocialType.a
            @Override // android.os.Parcelable.Creator
            public final SocialType createFromParcel(Parcel parcel) {
                return SocialType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SocialType[] newArray(int i12) {
                return new SocialType[i12];
            }
        };
    }

    public SocialType() {
        throw null;
    }

    public static SocialType valueOf(String str) {
        return (SocialType) Enum.valueOf(SocialType.class, str);
    }

    public static SocialType[] values() {
        return (SocialType[]) f284289l.clone();
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
