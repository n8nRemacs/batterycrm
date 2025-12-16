package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;

/* compiled from: WorkDatabaseMigrations.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/d0;", "Landroidx/room/migration/b;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d0 extends androidx.room.migration.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f55733c;

    public d0(@Y61.k Context context) {
        super(9, 10);
        this.f55733c = context;
    }

    @Override // androidx.room.migration.b
    public final void a(@Y61.k androidx.sqlite.db.framework.b bVar) {
        bVar.P4("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.f55733c;
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j12 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j13 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            bVar.q0();
            try {
                bVar.Z2(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j12)});
                bVar.Z2(new Object[]{"reschedule_needed", Long.valueOf(j13)});
                sharedPreferences.edit().clear().apply();
                bVar.b5();
            } finally {
            }
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i12 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i13 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            bVar.q0();
            try {
                bVar.Z2(new Object[]{"next_job_scheduler_id", Integer.valueOf(i12)});
                bVar.Z2(new Object[]{"next_alarm_manager_id", Integer.valueOf(i13)});
                sharedPreferences2.edit().clear().apply();
                bVar.b5();
            } finally {
            }
        }
    }
}
