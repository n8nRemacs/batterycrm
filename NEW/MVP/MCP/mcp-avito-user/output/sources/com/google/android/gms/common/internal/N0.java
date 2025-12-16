package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class N0 extends zza implements InterfaceC36717n {
    @Override // com.google.android.gms.common.internal.InterfaceC36717n
    public final Account zzb() {
        Parcel parcelE4 = e4(f4(), 2);
        Account account = (Account) zzc.zza(parcelE4, Account.CREATOR);
        parcelE4.recycle();
        return account;
    }
}
