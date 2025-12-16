package com.avito.android.edit_address.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AddressDaysArray.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/entity/AddressDaysArray;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes13.dex */
public final class AddressDaysArray implements Parcelable {

    @k
    public static final Parcelable.Creator<AddressDaysArray> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final boolean[] f145893b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final boolean[] f145894c;

    /* compiled from: AddressDaysArray.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressDaysArray> {
        @Override // android.os.Parcelable.Creator
        public final AddressDaysArray createFromParcel(Parcel parcel) {
            return new AddressDaysArray(parcel.createBooleanArray());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressDaysArray[] newArray(int i12) {
            return new AddressDaysArray[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressDaysArray() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @k
    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        boolean[] zArr = this.f145893b;
        int length = zArr.length - 1;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                if (zArr[i12]) {
                    arrayList.add(Integer.valueOf(i12));
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }

    public final void d(@k List<Integer> list) {
        boolean[] zArr = this.f145893b;
        int length = zArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            zArr[i12] = false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue > zArr.length - 1) {
                throw new IllegalStateException("Days indexes must be less than 6");
            }
            zArr[iIntValue] = true;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressDaysArray)) {
            return false;
        }
        return Arrays.equals(this.f145893b, ((AddressDaysArray) obj).f145893b);
    }

    public final int hashCode() {
        boolean[] zArr = this.f145893b;
        int length = zArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < length) {
            int i15 = i14 + 1;
            if (zArr[i12]) {
                i13 = (i14 * 10) + i13;
            }
            i12++;
            i14 = i15;
        }
        return i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeBooleanArray(this.f145893b);
    }

    public AddressDaysArray(@k boolean[] zArr) {
        this.f145893b = zArr;
        this.f145894c = zArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AddressDaysArray(boolean[] zArr, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            boolean[] zArr2 = new boolean[7];
            for (int i13 = 0; i13 < 7; i13++) {
                zArr2[i13] = false;
            }
            zArr = zArr2;
        }
        this(zArr);
    }
}
