package com.google.android.gms.internal.location;

import AK.c;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.collection.o1;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C36658n;
import com.google.android.gms.common.api.internal.InterfaceC36637f;
import com.google.android.gms.common.api.internal.InterfaceC36664q;
import com.google.android.gms.common.internal.AbstractC36709j;
import com.google.android.gms.common.internal.C36703g;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.K;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.C37028k;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzda extends AbstractC36709j {
    public static final /* synthetic */ int zze = 0;

    /* renamed from: I, reason: collision with root package name */
    public final o1 f350494I;

    /* renamed from: J, reason: collision with root package name */
    public final o1 f350495J;

    /* renamed from: K, reason: collision with root package name */
    public final o1 f350496K;

    public zzda(Context context, Looper looper, C36703g c36703g, InterfaceC36637f interfaceC36637f, InterfaceC36664q interfaceC36664q) {
        super(context, looper, 23, c36703g, interfaceC36637f, interfaceC36664q);
        this.f350494I = new o1();
        this.f350495J = new o1();
        this.f350496K = new o1();
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof zzo ? (zzo) iInterfaceQueryLocalInterface : new zzn(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final Feature[] getApiFeatures() {
        return K.f354209g;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e, com.google.android.gms.common.api.C36616a.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final String h() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final String i() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final boolean m(Feature feature) {
        Feature feature2;
        Feature[] availableFeatures = getAvailableFeatures();
        if (availableFeatures == null) {
            return false;
        }
        int length = availableFeatures.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                feature2 = null;
                break;
            }
            feature2 = availableFeatures[i12];
            if (feature.f348866b.equals(feature2.f348866b)) {
                break;
            }
            i12++;
        }
        return feature2 != null && feature2.h() >= feature.h();
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final void onConnectionSuspended(int i12) {
        super.onConnectionSuspended(i12);
        synchronized (this.f350494I) {
            this.f350494I.clear();
        }
        synchronized (this.f350495J) {
            this.f350495J.clear();
        }
        synchronized (this.f350496K) {
            this.f350496K.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(boolean z12, C37028k c37028k) {
        if (m(K.f354206d)) {
            ((zzo) getService()).zzx(z12, new zzcl(null, c37028k));
        } else {
            ((zzo) getService()).zzw(z12);
            c37028k.b(null);
        }
    }

    public final void zzB(C36658n.a aVar, boolean z12, C37028k c37028k) {
        synchronized (this.f350495J) {
            try {
                zzcw zzcwVar = (zzcw) this.f350495J.remove(aVar);
                if (zzcwVar == null) {
                    c37028k.b(Boolean.FALSE);
                    return;
                }
                zzcwVar.f350483a.zza().a();
                if (!z12) {
                    c37028k.b(Boolean.TRUE);
                } else if (m(K.f354208f)) {
                    ((zzo) getService()).zzy(zzdb.zzb(null, zzcwVar, null, null), new zzcl(Boolean.TRUE, c37028k));
                } else {
                    ((zzo) getService()).zzz(new zzdf(2, null, null, zzcwVar, null, new zzcn(Boolean.TRUE, c37028k), null));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzC(C36658n.a aVar, boolean z12, C37028k c37028k) {
        synchronized (this.f350494I) {
            try {
                zzcz zzczVar = (zzcz) this.f350494I.remove(aVar);
                if (zzczVar == null) {
                    c37028k.b(Boolean.FALSE);
                    return;
                }
                zzczVar.f350485a.zza().a();
                if (!z12) {
                    c37028k.b(Boolean.TRUE);
                } else if (m(K.f354208f)) {
                    ((zzo) getService()).zzy(zzdb.zzc(null, zzczVar, null, null), new zzcl(Boolean.TRUE, c37028k));
                } else {
                    ((zzo) getService()).zzz(new zzdf(2, null, zzczVar, null, null, new zzcn(Boolean.TRUE, c37028k), null));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzD(PendingIntent pendingIntent, C37028k c37028k, Object obj) {
        if (m(K.f354208f)) {
            ((zzo) getService()).zzy(zzdb.zza(pendingIntent, null, null), new zzcl(null, c37028k));
        } else {
            ((zzo) getService()).zzz(new zzdf(2, null, null, null, pendingIntent, new zzcn(null, c37028k), null));
        }
    }

    public final LocationAvailability zzp() {
        return ((zzo) getService()).zzf(getContext().getPackageName());
    }

    public final void zzq(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C37028k c37028k) {
        C36729v.k(geofencingRequest, "geofencingRequest can't be null.");
        C36729v.k(pendingIntent, "PendingIntent must be specified.");
        ((zzo) getService()).zzg(geofencingRequest, pendingIntent, new zzci(c37028k));
    }

    public final void zzr(C37028k c37028k) {
        ((zzo) getService()).zzi(new zzcn(null, c37028k));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzs(com.google.android.gms.location.CurrentLocationRequest r18, com.google.android.gms.tasks.AbstractC37018a r19, final com.google.android.gms.tasks.C37028k r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r17.getContext()
            com.google.android.gms.common.Feature r4 = com.google.android.gms.location.K.f354204b
            boolean r4 = r0.m(r4)
            if (r4 == 0) goto L2d
            android.os.IInterface r4 = r17.getService()
            com.google.android.gms.internal.location.zzo r4 = (com.google.android.gms.internal.location.zzo) r4
            com.google.android.gms.internal.location.zzcm r5 = new com.google.android.gms.internal.location.zzcm
            r5.<init>(r3)
            com.google.android.gms.common.internal.o r1 = r4.zze(r1, r5)
            if (r2 == 0) goto Lca
            com.google.android.gms.internal.location.zzcf r3 = new com.google.android.gms.internal.location.zzcf
            r3.<init>()
            r2.b(r3)
            return
        L2d:
            com.google.android.gms.internal.location.zzcj r4 = new com.google.android.gms.internal.location.zzcj
            r4.<init>(r0, r3)
            java.util.concurrent.Executor r5 = com.google.android.gms.internal.location.zzdx.zza()
            java.lang.String r6 = "GetCurrentLocation"
            com.google.android.gms.common.api.internal.n r4 = com.google.android.gms.common.api.internal.C36660o.b(r4, r6, r5)
            com.google.android.gms.common.api.internal.n$a r5 = r4.f349180c
            r5.getClass()
            com.google.android.gms.internal.location.zzck r6 = new com.google.android.gms.internal.location.zzck
            r6.<init>(r4, r3)
            com.google.android.gms.tasks.k r4 = new com.google.android.gms.tasks.k
            r4.<init>()
            com.google.android.gms.location.LocationRequest$a r7 = new com.google.android.gms.location.LocationRequest$a
            int r8 = r1.f354186d
            r9 = 0
            r7.<init>(r8, r9)
            r7.f354237c = r9
            long r11 = r1.f354187e
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            r13 = 0
            r14 = 1
            if (r8 <= 0) goto L60
            r8 = r14
            goto L61
        L60:
            r8 = r13
        L61:
            java.lang.String r15 = "durationMillis must be greater than 0"
            com.google.android.gms.common.internal.C36729v.a(r15, r8)
            r7.f354239e = r11
            int r8 = r1.f354185c
            if (r8 == 0) goto L76
            if (r8 == r14) goto L76
            r11 = 2
            if (r8 != r11) goto L73
        L71:
            r12 = r14
            goto L78
        L73:
            r11 = r8
            r12 = r13
            goto L78
        L76:
            r11 = r8
            goto L71
        L78:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r15 = "granularity %d must be a Granularity.GRANULARITY_* constant"
            com.google.android.gms.common.internal.C36729v.c(r12, r15, r11)
            r7.f354244j = r8
            long r11 = r1.f354184b
            r15 = -1
            int r8 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r8 == 0) goto L93
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 < 0) goto L94
        L93:
            r13 = r14
        L94:
            java.lang.String r8 = "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE"
            com.google.android.gms.common.internal.C36729v.a(r8, r13)
            r7.f354243i = r11
            boolean r8 = r1.f354188f
            r7.f354247m = r8
            int r8 = r1.f354189g
            r7.c(r8)
            r7.f354242h = r14
            java.lang.String r8 = r1.f354190h
            r7.b(r8)
            android.os.WorkSource r1 = r1.f354191i
            r7.f354248n = r1
            com.google.android.gms.location.LocationRequest r1 = r7.a()
            r0.zzu(r6, r1, r4)
            com.google.android.gms.tasks.P r1 = r4.f355672a
            com.google.android.gms.internal.location.zzcg r4 = new com.google.android.gms.internal.location.zzcg
            r4.<init>()
            r1.c(r4)
            if (r2 == 0) goto Lca
            com.google.android.gms.internal.location.zzch r1 = new com.google.android.gms.internal.location.zzch
            r1.<init>()
            r2.b(r1)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzda.zzs(com.google.android.gms.location.CurrentLocationRequest, com.google.android.gms.tasks.a, com.google.android.gms.tasks.k):void");
    }

    public final void zzt(LastLocationRequest lastLocationRequest, C37028k c37028k) {
        getContext();
        if (m(K.f354205c)) {
            ((zzo) getService()).zzj(lastLocationRequest, new zzcm(c37028k));
        } else {
            c37028k.b(((zzo) getService()).zzd());
        }
    }

    public final void zzu(zzcs zzcsVar, LocationRequest locationRequest, C37028k c37028k) {
        zzcw zzcwVar;
        C36658n c36658nZza = zzcsVar.zza();
        C36658n.a aVar = c36658nZza.f349180c;
        aVar.getClass();
        boolean zM2 = m(K.f354208f);
        synchronized (this.f350495J) {
            try {
                zzcw zzcwVar2 = (zzcw) this.f350495J.get(aVar);
                if (zzcwVar2 == null || zM2) {
                    zzcw zzcwVar3 = new zzcw(zzcsVar);
                    this.f350495J.put(aVar, zzcwVar3);
                    zzcwVar = zzcwVar3;
                } else {
                    zzcwVar2.f350483a.zzc(c36658nZza);
                    zzcwVar = zzcwVar2;
                    zzcwVar2 = null;
                }
                getContext();
                String str = aVar.f349182b + "@" + System.identityHashCode(aVar.f349181a);
                if (zM2) {
                    ((zzo) getService()).zzk(zzdb.zzb(zzcwVar2, zzcwVar, null, str), locationRequest, new zzcl(null, c37028k));
                } else {
                    zzo zzoVar = (zzo) getService();
                    LocationRequest.a aVar2 = new LocationRequest.a(locationRequest);
                    aVar2.b(null);
                    zzoVar.zzz(new zzdf(1, zzdd.zza(null, aVar2.a()), null, zzcwVar, null, new zzcp(c37028k, zzcwVar), str));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzv(zzcs zzcsVar, LocationRequest locationRequest, C37028k c37028k) {
        zzcz zzczVar;
        C36658n c36658nZza = zzcsVar.zza();
        C36658n.a aVar = c36658nZza.f349180c;
        aVar.getClass();
        boolean zM2 = m(K.f354208f);
        synchronized (this.f350494I) {
            try {
                zzcz zzczVar2 = (zzcz) this.f350494I.get(aVar);
                if (zzczVar2 == null || zM2) {
                    zzcz zzczVar3 = new zzcz(zzcsVar);
                    this.f350494I.put(aVar, zzczVar3);
                    zzczVar = zzczVar3;
                } else {
                    zzczVar2.f350485a.zzc(c36658nZza);
                    zzczVar = zzczVar2;
                    zzczVar2 = null;
                }
                getContext();
                String str = aVar.f349182b + "@" + System.identityHashCode(aVar.f349181a);
                if (zM2) {
                    ((zzo) getService()).zzk(zzdb.zzc(zzczVar2, zzczVar, null, str), locationRequest, new zzcl(null, c37028k));
                } else {
                    zzo zzoVar = (zzo) getService();
                    LocationRequest.a aVar2 = new LocationRequest.a(locationRequest);
                    aVar2.b(null);
                    zzoVar.zzz(new zzdf(1, zzdd.zza(null, aVar2.a()), zzczVar, null, null, new zzco(c37028k, zzczVar), str));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzw(PendingIntent pendingIntent, LocationRequest locationRequest, C37028k c37028k) {
        getContext();
        if (m(K.f354208f)) {
            ((zzo) getService()).zzk(zzdb.zza(pendingIntent, null, null), locationRequest, new zzcl(null, c37028k));
            return;
        }
        zzo zzoVar = (zzo) getService();
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        aVar.b(null);
        zzoVar.zzz(new zzdf(1, zzdd.zza(null, aVar.a()), null, null, pendingIntent, new zzcn(null, c37028k), c.g(pendingIntent.hashCode(), "PendingIntent@")));
    }

    public final void zzx(PendingIntent pendingIntent, C37028k c37028k) {
        C36729v.k(pendingIntent, "PendingIntent must be specified.");
        ((zzo) getService()).zzn(pendingIntent, new zzci(c37028k), getContext().getPackageName());
    }

    public final void zzy(List list, C37028k c37028k) {
        C36729v.a("geofenceRequestIds can't be null nor empty.", (list == null || list.isEmpty()) ? false : true);
        ((zzo) getService()).zzo((String[]) list.toArray(new String[0]), new zzci(c37028k), getContext().getPackageName());
    }

    public final void zzz(Location location, C37028k c37028k) {
        if (m(K.f354207e)) {
            ((zzo) getService()).zzv(location, new zzcl(null, c37028k));
        } else {
            ((zzo) getService()).zzu(location);
            c37028k.b(null);
        }
    }
}
