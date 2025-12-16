package androidx.work.impl;

/* compiled from: WorkDatabase_AutoMigration_18_19_Impl.java */
/* loaded from: classes10.dex */
final class Q extends androidx.room.migration.b {
    public Q() {
        super(18, 19);
    }

    @Override // androidx.room.migration.b
    public final void a(@j.N androidx.sqlite.db.framework.b bVar) {
        bVar.P4("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
