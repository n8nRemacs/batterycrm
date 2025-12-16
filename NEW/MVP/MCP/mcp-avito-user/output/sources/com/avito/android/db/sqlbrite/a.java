package com.avito.android.db.sqlbrite;

import Y61.k;
import android.database.sqlite.SQLiteDatabase;
import com.avito.android.db.f;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Database.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/db/sqlbrite/a;", "", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f132733a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f132734b = C42727D.c(new C3974a());

    /* compiled from: Database.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/database/sqlite/SQLiteDatabase;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.db.sqlbrite.a$a, reason: collision with other inner class name */
    public static final class C3974a extends N implements Y41.a<SQLiteDatabase> {
        public C3974a() {
            super(0);
        }

        @Override // Y41.a
        public final SQLiteDatabase invoke() {
            return a.this.f132733a.getWritableDatabase();
        }
    }

    public a(@k f fVar) {
        this.f132733a = fVar;
    }

    public final SQLiteDatabase a() {
        return (SQLiteDatabase) this.f132734b.getValue();
    }
}
