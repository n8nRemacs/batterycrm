package com.avito.android.profile_phones.phones_list.phone_item;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhoneActionCode.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/phone_item/PhoneActionCode;", "", "Landroid/os/Parcelable;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneActionCode implements Parcelable {

    @k
    public static final Parcelable.Creator<PhoneActionCode> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final PhoneActionCode f228121b;

    /* renamed from: c, reason: collision with root package name */
    public static final PhoneActionCode f228122c;

    /* renamed from: d, reason: collision with root package name */
    public static final PhoneActionCode f228123d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PhoneActionCode[] f228124e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f228125f;

    static {
        PhoneActionCode phoneActionCode = new PhoneActionCode("REMOVE", 0);
        f228121b = phoneActionCode;
        PhoneActionCode phoneActionCode2 = new PhoneActionCode("SET_FOR_ALL", 1);
        f228122c = phoneActionCode2;
        PhoneActionCode phoneActionCode3 = new PhoneActionCode("REPLACE_FOR_ADS", 2);
        f228123d = phoneActionCode3;
        PhoneActionCode[] phoneActionCodeArr = {phoneActionCode, phoneActionCode2, phoneActionCode3};
        f228124e = phoneActionCodeArr;
        f228125f = kotlin.enums.c.a(phoneActionCodeArr);
        CREATOR = new Parcelable.Creator<PhoneActionCode>() { // from class: com.avito.android.profile_phones.phones_list.phone_item.PhoneActionCode.a
            @Override // android.os.Parcelable.Creator
            public final PhoneActionCode createFromParcel(Parcel parcel) {
                return PhoneActionCode.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PhoneActionCode[] newArray(int i12) {
                return new PhoneActionCode[i12];
            }
        };
    }

    public PhoneActionCode() {
        throw null;
    }

    public static PhoneActionCode valueOf(String str) {
        return (PhoneActionCode) Enum.valueOf(PhoneActionCode.class, str);
    }

    public static PhoneActionCode[] values() {
        return (PhoneActionCode[]) f228124e.clone();
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
