package androidx.work.impl;

import kotlin.Metadata;

/* compiled from: WorkDatabaseMigrations.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/h;", "Landroidx/room/migration/b;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.impl.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23553h extends androidx.room.migration.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C23553h f55746c = new C23553h();

    public C23553h() {
        super(12, 13);
    }

    @Override // androidx.room.migration.b
    public final void a(@Y61.k androidx.sqlite.db.framework.b bVar) {
        bVar.P4("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        bVar.P4("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
