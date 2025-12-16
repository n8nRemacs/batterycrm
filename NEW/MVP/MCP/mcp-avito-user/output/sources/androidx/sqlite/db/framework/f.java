package androidx.sqlite.db.framework;

import Y61.k;
import Y61.l;
import Z1.i;
import android.database.sqlite.SQLiteStatement;
import kotlin.Metadata;

/* compiled from: FrameworkSQLiteStatement.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/framework/f;", "Landroidx/sqlite/db/framework/e;", "LZ1/i;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends e implements i {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SQLiteStatement f54548c;

    public f(@k SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f54548c = sQLiteStatement;
    }

    @Override // Z1.i
    public final int B3() {
        return this.f54548c.executeUpdateDelete();
    }

    @Override // Z1.i
    public final long E2() {
        return this.f54548c.executeInsert();
    }

    @Override // Z1.i
    @l
    public final String c2() {
        return this.f54548c.simpleQueryForString();
    }

    @Override // Z1.i
    public final void execute() {
        this.f54548c.execute();
    }

    @Override // Z1.i
    public final long g4() {
        return this.f54548c.simpleQueryForLong();
    }
}
