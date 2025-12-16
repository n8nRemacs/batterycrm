package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.internal.InterfaceC36652k;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzp extends zza implements IInterface {
    public final void zzd(InterfaceC36652k interfaceC36652k, zzbw zzbwVar) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, interfaceC36652k);
        zzc.zzc(parcelE4, zzbwVar);
        g4(parcelE4, 2);
    }

    public final void zze(zzm zzmVar, AccountChangeEventsRequest accountChangeEventsRequest) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, zzmVar);
        zzc.zzc(parcelE4, accountChangeEventsRequest);
        g4(parcelE4, 4);
    }

    public final void zzf(zzo zzoVar, Account account, String str, Bundle bundle) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, zzoVar);
        zzc.zzc(parcelE4, account);
        parcelE4.writeString(str);
        zzc.zzc(parcelE4, bundle);
        g4(parcelE4, 1);
    }

    public final void zzg(zzk zzkVar, Account account) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, zzkVar);
        zzc.zzc(parcelE4, account);
        g4(parcelE4, 6);
    }

    public final void zzh(zzk zzkVar, String str) {
        Parcel parcelE4 = e4();
        zzc.zzd(parcelE4, zzkVar);
        parcelE4.writeString(str);
        g4(parcelE4, 3);
    }
}
