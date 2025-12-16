package com.avito.android.large_transaction;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcel;
import kotlin.Metadata;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_large-transaction-detector_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f {
    @k
    public static final String a(int i12) {
        if (i12 > 1048576) {
            return (i12 / 1048576) + "mb";
        }
        if (i12 > 1024) {
            return (i12 / 1024) + "kb";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        sb2.append('b');
        return sb2.toString();
    }

    public static final int b(@l Object obj) {
        int iDataSize = 0;
        if (obj == null || obj.equals(Bundle.EMPTY)) {
            return 0;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeValue(obj);
            iDataSize = parcelObtain.dataSize();
        } catch (Throwable unused) {
        }
        parcelObtain.recycle();
        return iDataSize;
    }
}
