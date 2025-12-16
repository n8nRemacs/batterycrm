package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class Q3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f354860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354861c;

    public Q3(C36967s3 c36967s3, Bundle bundle) {
        this.f354860b = bundle;
        this.f354861c = c36967s3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36967s3 c36967s3 = this.f354861c;
        c36967s3.e();
        c36967s3.i();
        Bundle bundle = this.f354860b;
        String string = bundle.getString("name");
        C36729v.f(string);
        I2 i22 = c36967s3.f355183a;
        if (!i22.e()) {
            c36967s3.zzj().f354897n.b("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zznb zznbVar = new zznb(0L, null, string, "");
        try {
            N5 n5C = c36967s3.c();
            bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID);
            i22.n().o(new zzae(bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID), "", zznbVar, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), n5C.s(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
