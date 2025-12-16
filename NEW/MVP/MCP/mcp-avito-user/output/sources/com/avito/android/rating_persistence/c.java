package com.avito.android.rating_persistence;

import Y61.k;
import kotlin.Metadata;

/* compiled from: Migrations.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_persistence/c;", "Landroidx/room/migration/b;", "<init>", "()V", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends androidx.room.migration.b {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final c f249799c = new c();

    public c() {
        super(3, 4);
    }

    @Override // androidx.room.migration.b
    public final void a(@k androidx.sqlite.db.framework.b bVar) {
        bVar.P4("DROP TABLE IF EXISTS `rating_aspects`");
        bVar.P4("CREATE TABLE IF NOT EXISTS `rating_aspects` (\n    `aspect_key` TEXT NOT NULL,\n    PRIMARY KEY(`aspect_key`)\n)");
    }
}
