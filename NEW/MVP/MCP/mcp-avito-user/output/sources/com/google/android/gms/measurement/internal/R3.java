package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class R3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f354875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354876c;

    public R3(C36967s3 c36967s3, Bundle bundle) {
        this.f354875b = bundle;
        this.f354876c = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36967s3 c36967s3 = this.f354876c;
        c36967s3.e();
        c36967s3.i();
        Bundle bundle = this.f354875b;
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C36729v.f(string);
        C36729v.f(string2);
        C36729v.j(bundle.get("value"));
        I2 i22 = c36967s3.f355183a;
        if (!i22.e()) {
            c36967s3.zzj().f354897n.b("Conditional property not set since app measurement is disabled");
            return;
        }
        zznb zznbVar = new zznb(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
        try {
            N5 n5C = c36967s3.c();
            bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID);
            zzbe zzbeVarS = n5C.s(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true);
            N5 n5C2 = c36967s3.c();
            bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID);
            zzbe zzbeVarS2 = n5C2.s(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true);
            N5 n5C3 = c36967s3.c();
            bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID);
            i22.n().o(new zzae(bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID), string2, zznbVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), zzbeVarS2, bundle.getLong("trigger_timeout"), zzbeVarS, bundle.getLong("time_to_live"), n5C3.s(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
