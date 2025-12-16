package com.avito.android.profile_phones.phone_action;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneActionCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhoneActionArguments.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/PhoneActionArguments;", "Landroid/os/Parcelable;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneActionArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<PhoneActionArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f227246b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PhoneActionCode f227247c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f227248d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<PhoneParcelableEntity> f227249e;

    /* compiled from: PhoneActionArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneActionArguments> {
        @Override // android.os.Parcelable.Creator
        public final PhoneActionArguments createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            PhoneActionCode phoneActionCodeCreateFromParcel = PhoneActionCode.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(PhoneParcelableEntity.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new PhoneActionArguments(phoneActionCodeCreateFromParcel, numValueOf, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneActionArguments[] newArray(int i12) {
            return new PhoneActionArguments[i12];
        }
    }

    public PhoneActionArguments(@k PhoneActionCode phoneActionCode, @l Integer num, @k String str, @k List list) {
        this.f227246b = str;
        this.f227247c = phoneActionCode;
        this.f227248d = num;
        this.f227249e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f227246b);
        this.f227247c.writeToParcel(parcel, i12);
        Integer num = this.f227248d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Iterator itJ = C0.j(this.f227249e, parcel);
        while (itJ.hasNext()) {
            ((PhoneParcelableEntity) itJ.next()).writeToParcel(parcel, i12);
        }
    }

    public PhoneActionArguments(String str, PhoneActionCode phoneActionCode, Integer num, List list, int i12, C42822w c42822w) {
        this(phoneActionCode, (i12 & 4) != 0 ? null : num, str, (i12 & 8) != 0 ? C42784z0.f406748b : list);
    }
}
