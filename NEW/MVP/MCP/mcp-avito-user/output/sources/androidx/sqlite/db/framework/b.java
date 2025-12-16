package androidx.sqlite.db.framework;

import Y41.r;
import Y61.k;
import Y61.l;
import Z1.b;
import Z1.c;
import Z1.i;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.text.TextUtils;
import android.util.Pair;
import j.InterfaceC42164u;
import j.X;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FrameworkSQLiteDatabase.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/db/framework/b;", "LZ1/d;", "a", "b", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements Z1.d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String[] f54541c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String[] f54542d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SQLiteDatabase f54543b;

    /* compiled from: FrameworkSQLiteDatabase.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/sqlite/db/framework/b$a;", "", "<init>", "()V", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", "sql", "", "bindArgs", "Lkotlin/G0;", "a", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class a {
        static {
            new a();
        }

        @InterfaceC42164u
        public final void a(@k SQLiteDatabase sQLiteDatabase, @k String sql, @l Object[] bindArgs) throws SQLException {
            sQLiteDatabase.execPerConnectionSQL(sql, bindArgs);
        }
    }

    /* compiled from: FrameworkSQLiteDatabase.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/sqlite/db/framework/b$b;", "", "<init>", "()V", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.sqlite.db.framework.b$b, reason: collision with other inner class name */
    public static final class C1927b {
        public /* synthetic */ C1927b(C42822w c42822w) {
            this();
        }

        public C1927b() {
        }
    }

    /* compiled from: FrameworkSQLiteDatabase.kt */
    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Landroid/database/sqlite/SQLiteCursor;", "<anonymous parameter 0>", "Landroid/database/sqlite/SQLiteDatabase;", "masterQuery", "Landroid/database/sqlite/SQLiteCursorDriver;", "editTable", "", "sqLiteQuery", "Landroid/database/sqlite/SQLiteQuery;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends N implements r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Z1.g f54544l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Z1.g gVar) {
            super(4);
            this.f54544l = gVar;
        }

        @Override // Y41.r
        public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            SQLiteQuery sQLiteQuery2 = sQLiteQuery;
            this.f54544l.b(new e(sQLiteQuery2));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery2);
        }
    }

    static {
        new C1927b(null);
        f54541c = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
        f54542d = new String[0];
    }

    public b(@k SQLiteDatabase sQLiteDatabase) {
        this.f54543b = sQLiteDatabase;
    }

    @Override // Z1.d
    public final long C() {
        return this.f54543b.getPageSize();
    }

    @Override // Z1.d
    public final void H2(int i12) {
        this.f54543b.setVersion(i12);
    }

    @Override // Z1.d
    public final void L3() {
        this.f54543b.beginTransactionNonExclusive();
    }

    @Override // Z1.d
    @k
    public final i N2(@k String str) {
        return new f(this.f54543b.compileStatement(str));
    }

    @Override // Z1.d
    public final boolean O1() {
        return this.f54543b.isDatabaseIntegrityOk();
    }

    @Override // Z1.d
    public final void P4(@k String str) {
        this.f54543b.execSQL(str);
    }

    @Override // Z1.d
    public final boolean Q3() {
        return this.f54543b.isDbLockedByCurrentThread();
    }

    @Override // Z1.d
    public final boolean Q5() {
        return this.f54543b.yieldIfContendedSafely();
    }

    @Override // Z1.d
    @k
    public final Cursor R5(@k String str) {
        return p1(new Z1.b(str, null));
    }

    @Override // Z1.d
    public final boolean X2() {
        return this.f54543b.isReadOnly();
    }

    @Override // Z1.d
    public final void Z2(@k Object[] objArr) throws SQLException {
        this.f54543b.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // Z1.d
    public final void b5() {
        this.f54543b.setTransactionSuccessful();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f54543b.close();
    }

    @Override // Z1.d
    public final boolean e6() {
        return this.f54543b.inTransaction();
    }

    @Override // Z1.d
    public final void g5() {
        this.f54543b.endTransaction();
    }

    @Override // Z1.d
    @X
    public final boolean g6() {
        int i12 = c.a.f19817a;
        return this.f54543b.isWriteAheadLoggingEnabled();
    }

    @Override // Z1.d
    @l
    public final String getPath() {
        return this.f54543b.getPath();
    }

    @Override // Z1.d
    public final int getVersion() {
        return this.f54543b.getVersion();
    }

    @Override // Z1.d
    public final long h1() {
        return this.f54543b.getMaximumSize();
    }

    @Override // Z1.d
    public final boolean isOpen() {
        return this.f54543b.isOpen();
    }

    @Override // Z1.d
    public final void j6(long j12) {
        this.f54543b.setPageSize(j12);
    }

    @Override // Z1.d
    public final int o6(@k ContentValues contentValues, @l Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(f54541c[3]);
        sb2.append("WorkSpec SET ");
        int i12 = 0;
        for (String str : contentValues.keySet()) {
            sb2.append(i12 > 0 ? "," : "");
            sb2.append(str);
            objArr2[i12] = contentValues.get(str);
            sb2.append("=?");
            i12++;
        }
        for (int i13 = size; i13 < length; i13++) {
            objArr2[i13] = objArr[i13 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        i iVarN2 = N2(sb2.toString());
        Z1.b.f19814d.getClass();
        b.a.a(iVarN2, objArr2);
        return ((f) iVarN2).f54548c.executeUpdateDelete();
    }

    @Override // Z1.d
    @k
    public final Cursor p1(@k Z1.g gVar) {
        final c cVar = new c(gVar);
        return this.f54543b.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                String[] strArr = b.f54541c;
                return (Cursor) cVar.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, gVar.getF19815b(), f54542d, null);
    }

    @Override // Z1.d
    public final void q0() {
        this.f54543b.beginTransaction();
    }

    @Override // Z1.d
    @l
    public final List<Pair<String, String>> x3() {
        return this.f54543b.getAttachedDbs();
    }
}
