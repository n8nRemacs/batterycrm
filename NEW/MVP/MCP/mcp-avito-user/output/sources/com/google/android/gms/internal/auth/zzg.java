package com.google.android.gms.internal.auth;

import RX0.a;
import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.internal.C36628c;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.Task;
import j.N;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public interface zzg extends j {
    @N
    @a
    /* synthetic */ C36628c getApiKey();

    Task zza(zzbw zzbwVar);

    Task zzb(@N AccountChangeEventsRequest accountChangeEventsRequest);

    Task zzc(@N Account account, @N String str, Bundle bundle);

    Task zzd(@N Account account);

    Task zze(@N String str);
}
