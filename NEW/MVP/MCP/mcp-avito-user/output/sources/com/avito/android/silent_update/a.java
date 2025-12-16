package com.avito.android.silent_update;

import AK0.l;
import Y61.k;
import android.os.Bundle;
import androidx.appcompat.app.r;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.silent_update.DownloadUpdateConfig;
import com.avito.android.silent_update.download.DownloadWorkerMode;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SilentUpdateConfigStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update/a;", "", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f283622a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Gson f283623b;

    /* compiled from: SilentUpdateConfigStorage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.silent_update.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C8455a {
        static {
            int[] iArr = new int[DownloadWorkerMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DownloadWorkerMode[] downloadWorkerModeArr = DownloadWorkerMode.f283627b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public a(@k l lVar, @k Gson gson) {
        this.f283622a = lVar;
        this.f283623b = gson;
    }

    public final void a(@k String str) {
        String strConcat = "config_".concat(str);
        String strQ = r.q(strConcat, "mode");
        l lVar = this.f283622a;
        lVar.remove(strQ);
        lVar.remove(strConcat + "network_st");
        lVar.remove(strConcat + "storage_req");
        lVar.remove(strConcat + "battery_req");
        lVar.remove(strConcat + "charge_req");
        lVar.remove(strConcat + "idle_req");
        lVar.remove(strConcat + "init_del");
        lVar.remove(strConcat + "update_cur");
        lVar.remove(strConcat + "extras");
        lVar.remove(strConcat + "backoff_pol");
        lVar.remove(strConcat + "backoff_del");
        lVar.remove(strConcat + "repeat_int");
        lVar.remove(strConcat + "flex_int");
    }

    @Y61.l
    public final DownloadUpdateConfig b(@k String str) {
        Bundle bundle;
        Bundle bundle2;
        ShortTask.BackoffPolicy backoffPolicyValueOf;
        Bundle bundle3;
        ShortTask.BackoffPolicy backoffPolicyValueOf2;
        String string;
        l lVar = this.f283622a;
        try {
            string = lVar.getString("config_".concat(str) + "mode");
        } catch (Exception unused) {
        }
        DownloadWorkerMode downloadWorkerModeValueOf = string == null ? null : DownloadWorkerMode.valueOf(string);
        if (downloadWorkerModeValueOf == null) {
            return null;
        }
        int iOrdinal = downloadWorkerModeValueOf.ordinal();
        Gson gson = this.f283623b;
        if (iOrdinal == 0) {
            String strConcat = "config_".concat(str);
            try {
                String string2 = lVar.getString(strConcat + "network_st");
                if (string2 != null) {
                    ShortTask.NetworkState networkStateValueOf = ShortTask.NetworkState.valueOf(string2);
                    boolean z12 = lVar.getBoolean(strConcat + "storage_req", false);
                    boolean z13 = lVar.getBoolean(strConcat + "battery_req", false);
                    boolean z14 = lVar.getBoolean(strConcat + "charge_req", false);
                    boolean z15 = lVar.getBoolean(strConcat + "idle_req", false);
                    long j12 = lVar.getLong(strConcat + "init_del", 1000L);
                    boolean z16 = lVar.getBoolean(strConcat + "update_cur", false);
                    try {
                        bundle = null;
                        try {
                            bundle2 = (Bundle) gson.d(Bundle.class, lVar.getString(strConcat + "extras", null));
                        } catch (Exception unused2) {
                            bundle2 = bundle;
                            backoffPolicyValueOf = ShortTask.BackoffPolicy.valueOf(lVar.getString(strConcat + "backoff_pol"));
                            return new DownloadUpdateConfig.OneTimeDownloadRequest(networkStateValueOf, z12, z13, z14, z15, j12, z16, bundle2, backoffPolicyValueOf, lVar.getLong(strConcat + "backoff_del", 30000L));
                        }
                    } catch (Exception unused3) {
                        bundle = null;
                    }
                    try {
                        backoffPolicyValueOf = ShortTask.BackoffPolicy.valueOf(lVar.getString(strConcat + "backoff_pol"));
                    } catch (Exception unused4) {
                        backoffPolicyValueOf = ShortTask.BackoffPolicy.f274020c;
                    }
                    return new DownloadUpdateConfig.OneTimeDownloadRequest(networkStateValueOf, z12, z13, z14, z15, j12, z16, bundle2, backoffPolicyValueOf, lVar.getLong(strConcat + "backoff_del", 30000L));
                }
            } catch (Exception unused5) {
                return null;
            }
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            String strConcat2 = "config_".concat(str);
            long j13 = lVar.getLong(strConcat2 + "repeat_int", -1L);
            if (j13 != -1) {
                try {
                    String string3 = lVar.getString(strConcat2 + "network_st");
                    if (string3 != null) {
                        ShortTask.NetworkState networkStateValueOf2 = ShortTask.NetworkState.valueOf(string3);
                        boolean z17 = lVar.getBoolean(strConcat2 + "storage_req", false);
                        boolean z18 = lVar.getBoolean(strConcat2 + "battery_req", false);
                        boolean z19 = lVar.getBoolean(strConcat2 + "charge_req", false);
                        boolean z22 = lVar.getBoolean(strConcat2 + "idle_req", false);
                        long j14 = lVar.getLong(strConcat2 + "init_del", 1000L);
                        long j15 = lVar.getLong(strConcat2 + "flex_int", j13);
                        boolean z23 = lVar.getBoolean(strConcat2 + "update_cur", false);
                        try {
                            bundle3 = (Bundle) gson.d(Bundle.class, lVar.getString(strConcat2 + "extras", null));
                        } catch (Exception unused6) {
                            bundle3 = null;
                        }
                        try {
                            backoffPolicyValueOf2 = ShortTask.BackoffPolicy.valueOf(lVar.getString(strConcat2 + "backoff_pol"));
                        } catch (Exception unused7) {
                            backoffPolicyValueOf2 = ShortTask.BackoffPolicy.f274020c;
                        }
                        return new DownloadUpdateConfig.PeriodicDownloadRequest(networkStateValueOf2, z17, z18, z19, z22, j13, j15, j14, z23, bundle3, backoffPolicyValueOf2, lVar.getLong(strConcat2 + "backoff_del", 30000L));
                    }
                } catch (Exception unused8) {
                }
            }
        }
        return null;
    }
}
