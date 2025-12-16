package com.google.android.gms.internal.auth;

import UX0.a;
import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;
import j.N;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzab extends h implements zzg {

    /* renamed from: k, reason: collision with root package name */
    public static final C36616a f349994k = new C36616a("GoogleAuthService.API", new zzv(), new C36616a.g());

    /* renamed from: l, reason: collision with root package name */
    public static final a f349995l = new a("Auth", "GoogleAuthServiceClient");

    public static void d(Status status, Parcelable parcelable, C37028k c37028k) {
        if (B.b(status, parcelable, c37028k)) {
            return;
        }
        f349995l.b("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{com.google.android.gms.auth.h.f348798c};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzp) ((zzi) obj).getService()).zzd(new zzx((C37028k) obj2), zzbwVar);
            }
        };
        aVarA.f348955d = 1513;
        return doWrite(aVarA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(@N final AccountChangeEventsRequest accountChangeEventsRequest) {
        C36729v.k(accountChangeEventsRequest, "request cannot be null.");
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{com.google.android.gms.auth.h.f348797b};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth.zzu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                AccountChangeEventsRequest accountChangeEventsRequest2 = accountChangeEventsRequest;
                ((zzp) ((zzi) obj).getService()).zze(new zzz((C37028k) obj2), accountChangeEventsRequest2);
            }
        };
        aVarA.f348955d = 1515;
        return doWrite(aVarA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(@N final Account account, @N final String str, final Bundle bundle) {
        C36729v.k(account, "Account name cannot be null!");
        C36729v.g(str, "Scope cannot be null!");
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{com.google.android.gms.auth.h.f348798c};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzp) ((zzi) obj).getService()).zzf(new zzw((C37028k) obj2), account, str, bundle);
            }
        };
        aVarA.f348955d = 1512;
        return doWrite(aVarA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(@N final Account account) {
        C36729v.k(account, "account cannot be null.");
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{com.google.android.gms.auth.h.f348797b};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa((C37028k) obj2), account);
            }
        };
        aVarA.f348955d = 1517;
        return doWrite(aVarA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(@N final String str) {
        C36729v.k(str, "Client package name cannot be null!");
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{com.google.android.gms.auth.h.f348797b};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzp) ((zzi) obj).getService()).zzh(new zzy((C37028k) obj2), str);
            }
        };
        aVarA.f348955d = 1514;
        return doWrite(aVarA.a());
    }
}
