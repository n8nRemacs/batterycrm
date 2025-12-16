package androidx.work.impl;

/* compiled from: WorkDatabase_AutoMigration_17_18_Impl.java */
/* loaded from: classes10.dex */
final class P extends androidx.room.migration.b {
    public P() {
        super(17, 18);
    }

    @Override // androidx.room.migration.b
    public final void a(@j.N androidx.sqlite.db.framework.b bVar) {
        bVar.P4("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        bVar.P4("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
