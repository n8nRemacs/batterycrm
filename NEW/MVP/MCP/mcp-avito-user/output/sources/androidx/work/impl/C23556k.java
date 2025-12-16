package androidx.work.impl;

import kotlin.Metadata;

/* compiled from: WorkDatabaseMigrations.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/k;", "Landroidx/room/migration/b;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.impl.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23556k extends androidx.room.migration.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C23556k f55753c = new C23556k();

    public C23556k() {
        super(1, 2);
    }

    @Override // androidx.room.migration.b
    public final void a(@Y61.k androidx.sqlite.db.framework.b bVar) {
        androidx.media3.exoplayer.analytics.m.o(bVar, "\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ", "\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ", "DROP TABLE IF EXISTS alarmInfo", "\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
