package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.common.util.k;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes6.dex */
final class zzj implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzl f349952b;

    @Override // java.lang.Runnable
    public final void run() {
        zzl zzlVar = this.f349952b;
        long j12 = zzl.a(zzlVar.f349954a).getLong("app_set_id_last_used_time", -1L);
        long j13 = j12 != -1 ? j12 + 33696000000L : -1L;
        if (j13 != -1) {
            k.f349611a.getClass();
            if (System.currentTimeMillis() > j13) {
                Context context = zzlVar.f349954a;
                if (!zzl.a(context).edit().remove("app_set_id").commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    if (strValueOf.length() != 0) {
                        "Failed to clear app set ID generated for App ".concat(strValueOf);
                    }
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context.getPackageName());
                if (strValueOf2.length() != 0) {
                    "Failed to clear app set ID last used time for App ".concat(strValueOf2);
                }
            }
        }
    }
}
