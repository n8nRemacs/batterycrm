package androidx.work.impl;

/* compiled from: WorkDatabase_AutoMigration_22_23_Impl.java */
/* loaded from: classes10.dex */
final class U extends androidx.room.migration.b {
    public U() {
        super(22, 23);
    }

    @Override // androidx.room.migration.b
    public final void a(@j.N androidx.sqlite.db.framework.b bVar) {
        bVar.P4("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
