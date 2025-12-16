package androidx.sqlite.db.framework;

import Y61.k;
import android.database.sqlite.SQLiteProgram;
import kotlin.Metadata;

/* compiled from: FrameworkSQLiteProgram.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/e;", "LZ1/f;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public class e implements Z1.f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SQLiteProgram f54547b;

    public e(@k SQLiteProgram sQLiteProgram) {
        this.f54547b = sQLiteProgram;
    }

    @Override // Z1.f
    public final void B4(int i12) {
        this.f54547b.bindNull(i12);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f54547b.close();
    }

    @Override // Z1.f
    public final void f3(double d12, int i12) {
        this.f54547b.bindDouble(i12, d12);
    }

    @Override // Z1.f
    public final void g1(int i12, long j12) {
        this.f54547b.bindLong(i12, j12);
    }

    @Override // Z1.f
    public final void h4(int i12, @k String str) {
        this.f54547b.bindString(i12, str);
    }

    @Override // Z1.f
    public final void u4(int i12, @k byte[] bArr) {
        this.f54547b.bindBlob(i12, bArr);
    }
}
