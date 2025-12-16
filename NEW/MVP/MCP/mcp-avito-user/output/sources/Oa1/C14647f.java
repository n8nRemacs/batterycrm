package Oa1;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: Oa1.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14647f extends kotlin.jvm.internal.N implements Y41.a<SQLiteDatabase> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C14653l f12362l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14647f(C14653l c14653l) {
        super(0);
        this.f12362l = c14653l;
    }

    @Override // Y41.a
    public final SQLiteDatabase invoke() {
        SQLiteDatabase writableDatabase = this.f12362l.f12376a.getWritableDatabase();
        writableDatabase.enableWriteAheadLogging();
        return writableDatabase;
    }
}
