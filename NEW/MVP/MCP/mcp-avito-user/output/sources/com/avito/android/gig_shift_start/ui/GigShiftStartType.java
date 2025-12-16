package com.avito.android.gig_shift_start.ui;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GigShiftStartOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_shift_start/ui/GigShiftStartType;", "", "Lcom/avito/android/util/OpenParams;", "_avito_gig_start-shift-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftStartType implements OpenParams {

    @k
    public static final Parcelable.Creator<GigShiftStartType> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final GigShiftStartType f160844b;

    /* renamed from: c, reason: collision with root package name */
    public static final GigShiftStartType f160845c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ GigShiftStartType[] f160846d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160847e;

    static {
        GigShiftStartType gigShiftStartType = new GigShiftStartType("CheckIn", 0);
        f160844b = gigShiftStartType;
        GigShiftStartType gigShiftStartType2 = new GigShiftStartType("CheckOut", 1);
        f160845c = gigShiftStartType2;
        GigShiftStartType[] gigShiftStartTypeArr = {gigShiftStartType, gigShiftStartType2};
        f160846d = gigShiftStartTypeArr;
        f160847e = kotlin.enums.c.a(gigShiftStartTypeArr);
        CREATOR = new Parcelable.Creator<GigShiftStartType>() { // from class: com.avito.android.gig_shift_start.ui.GigShiftStartType.a
            @Override // android.os.Parcelable.Creator
            public final GigShiftStartType createFromParcel(Parcel parcel) {
                return GigShiftStartType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GigShiftStartType[] newArray(int i12) {
                return new GigShiftStartType[i12];
            }
        };
    }

    public GigShiftStartType() {
        throw null;
    }

    public static GigShiftStartType valueOf(String str) {
        return (GigShiftStartType) Enum.valueOf(GigShiftStartType.class, str);
    }

    public static GigShiftStartType[] values() {
        return (GigShiftStartType[]) f160846d.clone();
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
