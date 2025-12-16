package com.avito.android.trx_promo_public.data;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrxPromoStatus.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_public/data/TrxPromoStatus;", "", "Landroid/os/Parcelable;", "_avito_trx-promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrxPromoStatus implements Parcelable {

    @k
    public static final Parcelable.Creator<TrxPromoStatus> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final TrxPromoStatus f304485b;

    /* renamed from: c, reason: collision with root package name */
    public static final TrxPromoStatus f304486c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TrxPromoStatus[] f304487d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f304488e;

    static {
        TrxPromoStatus trxPromoStatus = new TrxPromoStatus("SUCCESS", 0);
        f304485b = trxPromoStatus;
        TrxPromoStatus trxPromoStatus2 = new TrxPromoStatus("FORBIDDEN", 1);
        f304486c = trxPromoStatus2;
        TrxPromoStatus[] trxPromoStatusArr = {trxPromoStatus, trxPromoStatus2};
        f304487d = trxPromoStatusArr;
        f304488e = c.a(trxPromoStatusArr);
        CREATOR = new Parcelable.Creator<TrxPromoStatus>() { // from class: com.avito.android.trx_promo_public.data.TrxPromoStatus.a
            @Override // android.os.Parcelable.Creator
            public final TrxPromoStatus createFromParcel(Parcel parcel) {
                return TrxPromoStatus.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TrxPromoStatus[] newArray(int i12) {
                return new TrxPromoStatus[i12];
            }
        };
    }

    public TrxPromoStatus() {
        throw null;
    }

    public static TrxPromoStatus valueOf(String str) {
        return (TrxPromoStatus) Enum.valueOf(TrxPromoStatus.class, str);
    }

    public static TrxPromoStatus[] values() {
        return (TrxPromoStatus[]) f304487d.clone();
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
