package androidx.work.impl;

import kotlin.Metadata;

/* compiled from: WorkDatabaseMigrations.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/p;", "Landroidx/room/migration/b;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.impl.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23586p extends androidx.room.migration.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C23586p f55903c = new C23586p();

    public C23586p() {
        super(8, 9);
    }

    @Override // androidx.room.migration.b
    public final void a(@Y61.k androidx.sqlite.db.framework.b bVar) {
        bVar.P4("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
