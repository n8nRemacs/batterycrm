package Z1;

import X41.n;
import Y61.k;
import Y61.l;
import Z1.c;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import androidx.compose.foundation.H;
import j.X;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SupportSQLiteOpenHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"LZ1/e;", "Ljava/io/Closeable;", "a", "b", "c", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface e extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"LZ1/e$c;", "", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {
        @k
        e c(@k b bVar);
    }

    @l
    String getDatabaseName();

    @k
    d getWritableDatabase();

    @X
    void setWriteAheadLoggingEnabled(boolean z12);

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LZ1/e$b;", "", "a", "b", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        @k
        public static final C1413b f19822f = new C1413b(null);

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @k
        public final Context f19823a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @l
        public final String f19824b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @k
        public final a f19825c;

        /* renamed from: d, reason: collision with root package name */
        @X41.f
        public final boolean f19826d;

        /* renamed from: e, reason: collision with root package name */
        @X41.f
        public final boolean f19827e;

        /* compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ1/e$b$a;", "", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Context f19828a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public String f19829b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public a f19830c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f19831d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f19832e;

            public a(@k Context context) {
                this.f19828a = context;
            }

            @k
            public final b a() {
                String str;
                a aVar = this.f19830c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f19831d && ((str = this.f19829b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f19828a, this.f19829b, aVar, this.f19831d, this.f19832e);
            }
        }

        /* compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZ1/e$b$b;", "", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: Z1.e$b$b, reason: collision with other inner class name */
        public static final class C1413b {
            public /* synthetic */ C1413b(C42822w c42822w) {
                this();
            }

            public C1413b() {
            }
        }

        public b(@k Context context, @l String str, @k a aVar, boolean z12, boolean z13) {
            this.f19823a = context;
            this.f19824b = str;
            this.f19825c = aVar;
            this.f19826d = z12;
            this.f19827e = z13;
        }

        @n
        @k
        public static final a a(@k Context context) {
            f19822f.getClass();
            return new a(context);
        }

        public /* synthetic */ b(Context context, String str, a aVar, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(context, str, aVar, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? false : z13);
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZ1/e$a;", "", "a", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        public final int f19821a;

        /* compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LZ1/e$a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: Z1.e$a$a, reason: collision with other inner class name */
        public static final class C1412a {
            public /* synthetic */ C1412a(C42822w c42822w) {
                this();
            }

            public C1412a() {
            }
        }

        static {
            new C1412a(null);
        }

        public a(int i12) {
            this.f19821a = i12;
        }

        public static void a(String str) {
            if (C43066x.C(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                boolean z13 = L.g(str.charAt(!z12 ? i12 : length), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z13) {
                    i12++;
                } else {
                    z12 = true;
                }
            }
            if (str.subSequence(i12, length + 1).toString().length() == 0) {
                return;
            }
            try {
                File file = new File(str);
                int i13 = c.a.f19817a;
                SQLiteDatabase.deleteDatabase(file);
            } catch (Exception unused) {
            }
        }

        public abstract void b(@k androidx.sqlite.db.framework.b bVar);

        public void c(@k androidx.sqlite.db.framework.b bVar, int i12, int i13) {
            throw new SQLiteException(H.j(i12, i13, "Can't downgrade database from version ", " to "));
        }

        public abstract void e(@k androidx.sqlite.db.framework.b bVar, int i12, int i13);

        public void d(@k androidx.sqlite.db.framework.b bVar) {
        }
    }
}
