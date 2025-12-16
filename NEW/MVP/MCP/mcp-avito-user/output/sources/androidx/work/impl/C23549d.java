package androidx.work.impl;

import androidx.room.RoomDatabase;
import kotlin.Metadata;

/* compiled from: WorkDatabase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/d;", "Landroidx/room/RoomDatabase$b;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.impl.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23549d extends RoomDatabase.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.work.X f55732a;

    public C23549d(@Y61.k androidx.work.X x12) {
        this.f55732a = x12;
    }

    @Override // androidx.room.RoomDatabase.b
    public final void b(@Y61.k androidx.sqlite.db.framework.b bVar) {
        bVar.q0();
        try {
            StringBuilder sb2 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            this.f55732a.getClass();
            sb2.append(System.currentTimeMillis() - H.f55535a);
            sb2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            bVar.P4(sb2.toString());
            bVar.b5();
        } finally {
            bVar.g5();
        }
    }
}
