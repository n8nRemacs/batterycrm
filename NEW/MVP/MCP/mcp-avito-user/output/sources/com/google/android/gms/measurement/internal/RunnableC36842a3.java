package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfc;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.a3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36842a3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbe f355019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzo f355020c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M2 f355021d;

    public RunnableC36842a3(M2 m22, zzbe zzbeVar, zzo zzoVar) {
        this.f355019b = zzbeVar;
        this.f355020c = zzoVar;
        this.f355021d = m22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        zzfc.zzd zzdVar;
        boolean zZza;
        zzaz zzazVar;
        M2 m22 = this.f355021d;
        m22.getClass();
        zzbe zzbeVar = this.f355019b;
        boolean zEquals = "_cmp".equals(zzbeVar.f355534b);
        C36997w5 c36997w5 = m22.f354801a;
        if (zEquals && (zzazVar = zzbeVar.f355535c) != null) {
            Bundle bundle = zzazVar.f355533b;
            if (bundle.size() != 0) {
                String string = bundle.getString("_cis");
                if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                    c36997w5.zzj().f354895l.c("Event has been filtered ", zzbeVar.toString());
                    zzbeVar = new zzbe("_cmpx", zzbeVar.f355535c, zzbeVar.f355536d, zzbeVar.f355537e);
                }
            }
        }
        String str = zzbeVar.f355534b;
        C36959r2 c36959r2 = c36997w5.f355438a;
        G5 g52 = c36997w5.f355444g;
        C36997w5.n(c36959r2);
        zzo zzoVar = this.f355020c;
        String str2 = zzoVar.f355567b;
        if (TextUtils.isEmpty(str2) || (zzdVar = (zzfc.zzd) c36959r2.f355344h.get(str2)) == null || zzdVar.zza() == 0) {
            m22.i4(zzbeVar, zzoVar);
            return;
        }
        U1 u12 = c36997w5.zzj().f354897n;
        String str3 = zzoVar.f355567b;
        u12.c("EES config found for", str3);
        C36959r2 c36959r22 = c36997w5.f355438a;
        C36997w5.n(c36959r22);
        zzb zzbVar = TextUtils.isEmpty(str3) ? null : c36959r22.f355346j.get(str3);
        if (zzbVar == null) {
            c36997w5.zzj().f354897n.c("EES not loaded for", str3);
            m22.i4(zzbeVar, zzoVar);
            return;
        }
        try {
            C36997w5.n(g52);
            HashMap mapZ = G5.z(zzbeVar.f355535c.i(), true);
            String strA = C36920l4.a(str, C36912k3.f355242c, C36912k3.f355240a);
            if (strA == null) {
                strA = str;
            }
            zZza = zzbVar.zza(new zzad(strA, zzbeVar.f355537e, mapZ));
        } catch (zzc unused) {
            c36997w5.zzj().f354889f.a(zzoVar.f355568c, "EES error. appId, eventName", str);
            zZza = false;
        }
        if (!zZza) {
            c36997w5.zzj().f354897n.c("EES was not applied to event", str);
            m22.i4(zzbeVar, zzoVar);
            return;
        }
        if (zzbVar.zzd()) {
            c36997w5.zzj().f354897n.c("EES edited event", str);
            C36997w5.n(g52);
            m22.i4(G5.t(zzbVar.zza().zzb()), zzoVar);
        } else {
            m22.i4(zzbeVar, zzoVar);
        }
        if (zzbVar.zzc()) {
            for (zzad zzadVar : zzbVar.zza().zzc()) {
                c36997w5.zzj().f354897n.c("EES logging created event", zzadVar.zzb());
                C36997w5.n(g52);
                m22.i4(G5.t(zzadVar), zzoVar);
            }
        }
    }
}
