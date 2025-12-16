package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzpt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.o5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36942o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C36879f5 f355298a;

    public C36942o5(C36879f5 c36879f5) {
        this.f355298a = c36879f5;
    }

    @j.l0
    public final void a() {
        C36879f5 c36879f5 = this.f355298a;
        c36879f5.e();
        C36876f2 c36876f2B = c36879f5.b();
        I2 i22 = c36879f5.f355183a;
        i22.f354722n.getClass();
        if (c36876f2B.j(System.currentTimeMillis())) {
            c36879f5.b().f355135m.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                c36879f5.zzj().f354897n.b("Detected application was in foreground");
                i22.f354722n.getClass();
                c(System.currentTimeMillis());
            }
        }
    }

    @j.l0
    public final void b(long j12) {
        C36879f5 c36879f5 = this.f355298a;
        c36879f5.e();
        c36879f5.o();
        if (c36879f5.b().j(j12)) {
            c36879f5.b().f355135m.a(true);
            if (zzpt.zza()) {
                I2 i22 = c36879f5.f355183a;
                if (i22.f354715g.o(null, E.f354640q0)) {
                    i22.k().o();
                }
            }
        }
        c36879f5.b().f355139q.b(j12);
        if (c36879f5.b().f355135m.b()) {
            c(j12);
        }
    }

    @j.k0
    @j.l0
    public final void c(long j12) {
        C36879f5 c36879f5 = this.f355298a;
        c36879f5.e();
        I2 i22 = c36879f5.f355183a;
        if (i22.e()) {
            c36879f5.b().f355139q.b(j12);
            i22.f354722n.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            S1 s1Zzj = c36879f5.zzj();
            s1Zzj.f354897n.c("Session started, time", Long.valueOf(jElapsedRealtime));
            long j13 = j12 / 1000;
            c36879f5.f().o(j12, Long.valueOf(j13), "auto", "_sid");
            c36879f5.b().f355140r.b(j13);
            c36879f5.b().f355135m.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j13);
            c36879f5.f().E("auto", "_s", bundle, j12);
            String strA = c36879f5.b().f355145w.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            c36879f5.f().E("auto", "_ssr", com.avito.android.actions_sheet.a.m("_ffr", strA), j12);
        }
    }
}
