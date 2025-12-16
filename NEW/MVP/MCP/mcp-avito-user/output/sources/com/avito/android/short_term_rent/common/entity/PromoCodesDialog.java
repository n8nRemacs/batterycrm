package com.avito.android.short_term_rent.common.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: PromoCodesDialog.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/common/entity/PromoCodesDialog;", "Landroid/os/Parcelable;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PromoCodesDialog implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoCodesDialog> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f282223b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f282224c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f282225d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ArrayList f282226e;

    /* compiled from: PromoCodesDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoCodesDialog> {
        @Override // android.os.Parcelable.Creator
        public final PromoCodesDialog createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(PromoCode.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new PromoCodesDialog(string, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PromoCodesDialog[] newArray(int i12) {
            return new PromoCodesDialog[i12];
        }
    }

    public PromoCodesDialog(@l String str, @l String str2, @l String str3, @l ArrayList arrayList) {
        this.f282223b = str;
        this.f282224c = str2;
        this.f282225d = str3;
        this.f282226e = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f282223b);
        parcel.writeString(this.f282224c);
        parcel.writeString(this.f282225d);
        ArrayList arrayList = this.f282226e;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
        while (itY.hasNext()) {
            ((PromoCode) itY.next()).writeToParcel(parcel, i12);
        }
    }
}
