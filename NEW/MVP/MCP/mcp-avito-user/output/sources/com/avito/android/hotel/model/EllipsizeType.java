package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HotelBookingTextItem.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/hotel/model/EllipsizeType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "START", "MIDDLE", "END", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EllipsizeType implements Parcelable {

    @k
    public static final Parcelable.Creator<EllipsizeType> CREATOR;

    @c("end")
    public static final EllipsizeType END;

    @c("middle")
    public static final EllipsizeType MIDDLE;

    @c("start")
    public static final EllipsizeType START;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EllipsizeType[] f162608b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f162609c;

    static {
        EllipsizeType ellipsizeType = new EllipsizeType("START", 0);
        START = ellipsizeType;
        EllipsizeType ellipsizeType2 = new EllipsizeType("MIDDLE", 1);
        MIDDLE = ellipsizeType2;
        EllipsizeType ellipsizeType3 = new EllipsizeType("END", 2);
        END = ellipsizeType3;
        EllipsizeType[] ellipsizeTypeArr = {ellipsizeType, ellipsizeType2, ellipsizeType3};
        f162608b = ellipsizeTypeArr;
        f162609c = kotlin.enums.c.a(ellipsizeTypeArr);
        CREATOR = new Parcelable.Creator<EllipsizeType>() { // from class: com.avito.android.hotel.model.EllipsizeType.a
            @Override // android.os.Parcelable.Creator
            public final EllipsizeType createFromParcel(Parcel parcel) {
                return EllipsizeType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EllipsizeType[] newArray(int i12) {
                return new EllipsizeType[i12];
            }
        };
    }

    private EllipsizeType(String str, int i12) {
    }

    public static EllipsizeType valueOf(String str) {
        return (EllipsizeType) Enum.valueOf(EllipsizeType.class, str);
    }

    public static EllipsizeType[] values() {
        return (EllipsizeType[]) f162608b.clone();
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
