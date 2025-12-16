package com.avito.android.short_term_rent.view.components.retro_badges.entity;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RetroBadgeItemSize.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/view/components/retro_badges/entity/RetroBadgeItemSize;", "", "Landroid/os/Parcelable;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RetroBadgeItemSize implements Parcelable {

    @k
    public static final Parcelable.Creator<RetroBadgeItemSize> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final RetroBadgeItemSize f283053b;

    /* renamed from: c, reason: collision with root package name */
    public static final RetroBadgeItemSize f283054c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ RetroBadgeItemSize[] f283055d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f283056e;

    static {
        RetroBadgeItemSize retroBadgeItemSize = new RetroBadgeItemSize("SMALL", 0);
        f283053b = retroBadgeItemSize;
        RetroBadgeItemSize retroBadgeItemSize2 = new RetroBadgeItemSize("LARGE", 1);
        f283054c = retroBadgeItemSize2;
        RetroBadgeItemSize[] retroBadgeItemSizeArr = {retroBadgeItemSize, retroBadgeItemSize2};
        f283055d = retroBadgeItemSizeArr;
        f283056e = c.a(retroBadgeItemSizeArr);
        CREATOR = new Parcelable.Creator<RetroBadgeItemSize>() { // from class: com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemSize.a
            @Override // android.os.Parcelable.Creator
            public final RetroBadgeItemSize createFromParcel(Parcel parcel) {
                return RetroBadgeItemSize.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RetroBadgeItemSize[] newArray(int i12) {
                return new RetroBadgeItemSize[i12];
            }
        };
    }

    public RetroBadgeItemSize() {
        throw null;
    }

    public static RetroBadgeItemSize valueOf(String str) {
        return (RetroBadgeItemSize) Enum.valueOf(RetroBadgeItemSize.class, str);
    }

    public static RetroBadgeItemSize[] values() {
        return (RetroBadgeItemSize[]) f283055d.clone();
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
