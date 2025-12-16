package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzd extends zza implements zzf {
    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzd(String str, Bundle bundle) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        zzc.zzc(parcelE4, bundle);
        Parcel parcelF4 = f4(parcelE4, 2);
        Bundle bundle2 = (Bundle) zzc.zza(parcelF4, Bundle.CREATOR);
        parcelF4.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zze(Account account, String str, Bundle bundle) {
        Parcel parcelE4 = e4();
        zzc.zzc(parcelE4, account);
        parcelE4.writeString(str);
        zzc.zzc(parcelE4, bundle);
        Parcel parcelF4 = f4(parcelE4, 5);
        Bundle bundle2 = (Bundle) zzc.zza(parcelF4, Bundle.CREATOR);
        parcelF4.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzf(Account account) {
        Parcel parcelE4 = e4();
        zzc.zzc(parcelE4, account);
        Parcel parcelF4 = f4(parcelE4, 7);
        Bundle bundle = (Bundle) zzc.zza(parcelF4, Bundle.CREATOR);
        parcelF4.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzg(String str) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        Parcel parcelF4 = f4(parcelE4, 8);
        Bundle bundle = (Bundle) zzc.zza(parcelF4, Bundle.CREATOR);
        parcelF4.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final AccountChangeEventsResponse zzh(AccountChangeEventsRequest accountChangeEventsRequest) {
        Parcel parcelE4 = e4();
        zzc.zzc(parcelE4, accountChangeEventsRequest);
        Parcel parcelF4 = f4(parcelE4, 3);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) zzc.zza(parcelF4, AccountChangeEventsResponse.CREATOR);
        parcelF4.recycle();
        return accountChangeEventsResponse;
    }
}
