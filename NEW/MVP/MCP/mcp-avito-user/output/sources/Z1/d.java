package Z1;

import Y61.k;
import Y61.l;
import android.content.ContentValues;
import android.database.Cursor;
import android.util.Pair;
import j.X;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SupportSQLiteDatabase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"LZ1/d;", "Ljava/io/Closeable;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface d extends Closeable {
    long C();

    void H2(int i12);

    void L3();

    @k
    i N2(@k String str);

    boolean O1();

    void P4(@k String str);

    boolean Q3();

    boolean Q5();

    @k
    Cursor R5(@k String str);

    boolean X2();

    void Z2(@k Object[] objArr);

    void b5();

    boolean e6();

    void g5();

    @X
    boolean g6();

    @l
    String getPath();

    int getVersion();

    long h1();

    boolean isOpen();

    void j6(long j12);

    int o6(@k ContentValues contentValues, @l Object[] objArr);

    @k
    Cursor p1(@k g gVar);

    void q0();

    @l
    List<Pair<String, String>> x3();
}
