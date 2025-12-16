package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.os.SystemClock;
import com.google.android.gms.common.util.InterfaceC36753g;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzce;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.q5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36956q5 extends AbstractC36990v5 {

    /* renamed from: d, reason: collision with root package name */
    public final AlarmManager f355335d;

    /* renamed from: e, reason: collision with root package name */
    public C36976t5 f355336e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f355337f;

    public C36956q5(C36997w5 c36997w5) {
        super(c36997w5);
        this.f355335d = (AlarmManager) this.f355183a.f354709a.getSystemService("alarm");
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ C36876f2 b() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ N5 c() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    public final /* bridge */ /* synthetic */ void e() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36969s5
    public final /* bridge */ /* synthetic */ G5 f() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36969s5
    public final /* bridge */ /* synthetic */ C36908k g() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36990v5
    public final boolean k() {
        I2 i22 = this.f355183a;
        AlarmManager alarmManager = this.f355335d;
        if (alarmManager != null) {
            Context context = i22.f354709a;
            alarmManager.cancel(zzcc.zza(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcc.zza));
        }
        JobScheduler jobScheduler = (JobScheduler) i22.f354709a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(n());
        }
        return false;
    }

    public final void l(long j12) {
        i();
        I2 i22 = this.f355183a;
        Context context = i22.f354709a;
        if (!N5.N(context)) {
            super.zzj().f354896m.b("Receiver not registered/enabled");
        }
        if (!N5.h0(context)) {
            super.zzj().f354896m.b("Service not registered/enabled");
        }
        m();
        S1 s1Zzj = super.zzj();
        s1Zzj.f354897n.c("Scheduling upload, millis", Long.valueOf(j12));
        i22.f354722n.getClass();
        SystemClock.elapsedRealtime();
        if (j12 < Math.max(0L, E.f354655y.a(null).longValue()) && o().f355357c == 0) {
            o().b(j12);
        }
        Context context2 = i22.f354709a;
        ComponentName componentName = new ComponentName(context2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iN2 = n();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        zzce.zza(context2, new JobInfo.Builder(iN2, componentName).setMinimumLatency(j12).setOverrideDeadline(j12 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void m() {
        i();
        super.zzj().f354897n.b("Unscheduling upload");
        I2 i22 = this.f355183a;
        AlarmManager alarmManager = this.f355335d;
        if (alarmManager != null) {
            Context context = i22.f354709a;
            alarmManager.cancel(zzcc.zza(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcc.zza));
        }
        o().a();
        JobScheduler jobScheduler = (JobScheduler) i22.f354709a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(n());
        }
    }

    public final int n() {
        if (this.f355337f == null) {
            this.f355337f = Integer.valueOf(("measurement" + this.f355183a.f354709a.getPackageName()).hashCode());
        }
        return this.f355337f.intValue();
    }

    public final AbstractC36963s o() {
        if (this.f355336e == null) {
            this.f355336e = new C36976t5(this, this.f355380b.f355449l);
        }
        return this.f355336e;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final Context zza() {
        return this.f355183a.f354709a;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final InterfaceC36753g zzb() {
        return this.f355183a.f354722n;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final C36852c zzd() {
        return this.f355183a.f354714f;
    }
}
