package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class f extends zza implements h {
    @Override // com.google.android.gms.auth.account.h
    public final void I1(e eVar, String str) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, eVar);
        parcelE4.writeString(str);
        g4(parcelE4, 2);
    }

    @Override // com.google.android.gms.auth.account.h
    public final void X(boolean z12) {
        Parcel parcelE4 = e4();
        int i12 = zzc.zza;
        parcelE4.writeInt(z12 ? 1 : 0);
        g4(parcelE4, 1);
    }

    @Override // com.google.android.gms.auth.account.h
    public final void a4(e eVar, Account account) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, eVar);
        zzc.zzc(parcelE4, account);
        g4(parcelE4, 3);
    }
}
