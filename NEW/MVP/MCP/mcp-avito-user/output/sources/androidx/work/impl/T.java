package androidx.work.impl;

/* compiled from: WorkDatabase_AutoMigration_20_21_Impl.java */
/* loaded from: classes10.dex */
final class T extends androidx.room.migration.b {
    public T() {
        super(20, 21);
    }

    @Override // androidx.room.migration.b
    public final void a(@j.N androidx.sqlite.db.framework.b bVar) {
        bVar.P4("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
