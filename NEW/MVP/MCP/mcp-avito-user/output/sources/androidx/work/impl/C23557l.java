package androidx.work.impl;

import kotlin.Metadata;

/* compiled from: WorkDatabaseMigrations.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/l;", "Landroidx/room/migration/b;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.impl.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23557l extends androidx.room.migration.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C23557l f55756c = new C23557l();

    public C23557l() {
        super(3, 4);
    }

    @Override // androidx.room.migration.b
    public final void a(@Y61.k androidx.sqlite.db.framework.b bVar) {
        bVar.P4("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
