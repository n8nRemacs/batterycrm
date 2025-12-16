package androidx.work.impl;

import android.content.Context;
import android.database.SQLException;
import kotlin.Metadata;

/* compiled from: WorkDatabaseMigrations.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/t;", "Landroidx/room/migration/b;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.impl.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23589t extends androidx.room.migration.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f55933c;

    public C23589t(@Y61.k Context context, int i12, int i13) {
        super(i12, i13);
        this.f55933c = context;
    }

    @Override // androidx.room.migration.b
    public final void a(@Y61.k androidx.sqlite.db.framework.b bVar) throws SQLException {
        if (this.f54385b >= 10) {
            bVar.Z2(new Object[]{"reschedule_needed", 1});
        } else {
            this.f55933c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
