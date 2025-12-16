package com.avito.android.silent_update;

import Bw0.AbstractC13196a;
import Bw0.i;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import com.avito.android.service.short_task.j;
import com.avito.android.silent_update.DownloadUpdateConfig;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.random.f;

/* compiled from: SilentUpdateSchedulerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update/b;", "LBw0/i;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f283624a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f283625b;

    public b(@k j jVar, @k a aVar) {
        this.f283624a = jVar;
        this.f283625b = aVar;
    }

    @Override // Bw0.i
    public final void a(@k DownloadUpdateConfig downloadUpdateConfig, @l String str, @l String str2) {
        String strValueOf;
        String str3;
        boolean z12;
        if (str2 == null) {
            f.f406882b.getClass();
            strValueOf = String.valueOf(f.f406883c.i());
        } else {
            strValueOf = str2;
        }
        a aVar = this.f283625b;
        boolean z13 = downloadUpdateConfig instanceof DownloadUpdateConfig.OneTimeDownloadRequest;
        Gson gson = aVar.f283623b;
        AK0.l lVar = aVar.f283622a;
        if (z13) {
            z12 = z13;
            DownloadUpdateConfig.OneTimeDownloadRequest oneTimeDownloadRequest = (DownloadUpdateConfig.OneTimeDownloadRequest) downloadUpdateConfig;
            String strConcat = "config_".concat(strValueOf);
            str3 = strValueOf;
            lVar.putString(strConcat + "mode", "ONE_TIME");
            lVar.putString(strConcat + "network_st", oneTimeDownloadRequest.f283600b.name());
            lVar.putBoolean(strConcat + "storage_req", oneTimeDownloadRequest.f283601c);
            lVar.putBoolean(strConcat + "battery_req", oneTimeDownloadRequest.f283602d);
            lVar.putBoolean(strConcat + "charge_req", oneTimeDownloadRequest.f283603e);
            lVar.putBoolean(strConcat + "idle_req", oneTimeDownloadRequest.f283604f);
            lVar.putLong(strConcat + "init_del", oneTimeDownloadRequest.f283605g);
            lVar.putBoolean(strConcat + "update_cur", oneTimeDownloadRequest.f283606h);
            Bundle bundle = oneTimeDownloadRequest.f283607i;
            if (bundle != null) {
                lVar.putString(strConcat + "extras", gson.l(bundle));
            } else {
                lVar.remove(strConcat + "extras");
            }
            lVar.putString(r.q(strConcat, "backoff_pol"), oneTimeDownloadRequest.f283608j.name());
            lVar.putLong(strConcat + "backoff_del", oneTimeDownloadRequest.f283609k);
        } else {
            str3 = strValueOf;
            z12 = z13;
            if (downloadUpdateConfig instanceof DownloadUpdateConfig.PeriodicDownloadRequest) {
                DownloadUpdateConfig.PeriodicDownloadRequest periodicDownloadRequest = (DownloadUpdateConfig.PeriodicDownloadRequest) downloadUpdateConfig;
                String strConcat2 = "config_".concat(str3);
                str3 = str3;
                lVar.putString(strConcat2 + "mode", "PERIODIC");
                lVar.putString(strConcat2 + "network_st", periodicDownloadRequest.f283610b.name());
                lVar.putBoolean(strConcat2 + "storage_req", periodicDownloadRequest.f283611c);
                lVar.putBoolean(strConcat2 + "battery_req", periodicDownloadRequest.f283612d);
                lVar.putBoolean(strConcat2 + "charge_req", periodicDownloadRequest.f283613e);
                lVar.putBoolean(strConcat2 + "idle_req", periodicDownloadRequest.f283614f);
                lVar.putLong(strConcat2 + "init_del", periodicDownloadRequest.f283617i);
                lVar.putLong(strConcat2 + "repeat_int", periodicDownloadRequest.f283615g);
                lVar.putLong(strConcat2 + "flex_int", periodicDownloadRequest.f283616h);
                lVar.putBoolean(strConcat2 + "update_cur", periodicDownloadRequest.f283618j);
                Bundle bundle2 = periodicDownloadRequest.f283619k;
                if (bundle2 != null) {
                    lVar.putString(strConcat2 + "extras", gson.l(bundle2));
                } else {
                    lVar.remove(strConcat2 + "extras");
                }
                lVar.putString(r.q(strConcat2, "backoff_pol"), periodicDownloadRequest.f283620l.name());
                lVar.putLong(strConcat2 + "backoff_del", periodicDownloadRequest.f283621m);
            }
        }
        if (z12) {
            String str4 = str3;
            DownloadUpdateConfig.OneTimeDownloadRequest oneTimeDownloadRequest2 = (DownloadUpdateConfig.OneTimeDownloadRequest) downloadUpdateConfig;
            Bundle bundle3 = oneTimeDownloadRequest2.f283607i;
            if (bundle3 == null) {
                bundle3 = new Bundle();
            }
            Bundle bundle4 = bundle3;
            if (str != null) {
                bundle4.putString("ARG_SOURCE_SCREEN", str);
            }
            bundle4.putString("ARG_CONFIG_ID", str4);
            this.f283624a.c(AbstractC13196a.class, oneTimeDownloadRequest2.f283600b, oneTimeDownloadRequest2.f283601c, oneTimeDownloadRequest2.f283602d, oneTimeDownloadRequest2.f283603e, oneTimeDownloadRequest2.f283604f, oneTimeDownloadRequest2.f283605g, oneTimeDownloadRequest2.f283606h, bundle4, oneTimeDownloadRequest2.f283608j, oneTimeDownloadRequest2.f283609k);
            return;
        }
        String str5 = str3;
        if (downloadUpdateConfig instanceof DownloadUpdateConfig.PeriodicDownloadRequest) {
            DownloadUpdateConfig.PeriodicDownloadRequest periodicDownloadRequest2 = (DownloadUpdateConfig.PeriodicDownloadRequest) downloadUpdateConfig;
            Bundle bundle5 = periodicDownloadRequest2.f283619k;
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            if (str != null) {
                bundle5.putString("ARG_SOURCE_SCREEN", str);
            }
            bundle5.putString("ARG_CONFIG_ID", str5);
            this.f283624a.a(AbstractC13196a.class, periodicDownloadRequest2.f283610b, periodicDownloadRequest2.f283611c, periodicDownloadRequest2.f283612d, periodicDownloadRequest2.f283613e, periodicDownloadRequest2.f283614f, periodicDownloadRequest2.f283615g, periodicDownloadRequest2.f283616h, periodicDownloadRequest2.f283617i, periodicDownloadRequest2.f283618j, bundle5, periodicDownloadRequest2.f283620l, periodicDownloadRequest2.f283621m);
        }
    }

    @Override // Bw0.i
    public final void b() {
        this.f283624a.b(AbstractC13196a.class);
    }
}
