package com.avito.android.advertising.loaders.buzzoola;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BuzzoolaBanner.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaAvlType;", "", "Landroid/os/Parcelable;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BuzzoolaAvlType implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BuzzoolaAvlType> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final BuzzoolaAvlType f88192b;

    /* renamed from: c, reason: collision with root package name */
    public static final BuzzoolaAvlType f88193c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BuzzoolaAvlType[] f88194d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f88195e;

    static {
        BuzzoolaAvlType buzzoolaAvlType = new BuzzoolaAvlType("MEDIA", 0);
        f88192b = buzzoolaAvlType;
        BuzzoolaAvlType buzzoolaAvlType2 = new BuzzoolaAvlType("NATIVE", 1);
        f88193c = buzzoolaAvlType2;
        BuzzoolaAvlType[] buzzoolaAvlTypeArr = {buzzoolaAvlType, buzzoolaAvlType2};
        f88194d = buzzoolaAvlTypeArr;
        f88195e = kotlin.enums.c.a(buzzoolaAvlTypeArr);
        CREATOR = new Parcelable.Creator<BuzzoolaAvlType>() { // from class: com.avito.android.advertising.loaders.buzzoola.BuzzoolaAvlType.a
            @Override // android.os.Parcelable.Creator
            public final BuzzoolaAvlType createFromParcel(Parcel parcel) {
                return BuzzoolaAvlType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BuzzoolaAvlType[] newArray(int i12) {
                return new BuzzoolaAvlType[i12];
            }
        };
    }

    public BuzzoolaAvlType() {
        throw null;
    }

    public static BuzzoolaAvlType valueOf(String str) {
        return (BuzzoolaAvlType) Enum.valueOf(BuzzoolaAvlType.class, str);
    }

    public static BuzzoolaAvlType[] values() {
        return (BuzzoolaAvlType[]) f88194d.clone();
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
