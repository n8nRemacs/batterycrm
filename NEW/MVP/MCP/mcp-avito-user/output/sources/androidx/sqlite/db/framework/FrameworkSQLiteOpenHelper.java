package androidx.sqlite.db.framework;

import X41.j;
import Y61.k;
import Y61.l;
import Z1.c;
import Z1.e;
import a2.C19668a;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import j.X;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FrameworkSQLiteOpenHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;", "LZ1/e;", "a", "b", "OpenHelper", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FrameworkSQLiteOpenHelper implements Z1.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f54515b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f54516c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e.a f54517d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f54518e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f54519f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42726C<OpenHelper> f54520g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f54521h;

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "a", "CallbackName", "b", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OpenHelper extends SQLiteOpenHelper {

        /* renamed from: i, reason: collision with root package name */
        @k
        public static final b f54522i = new b(null);

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Context f54523b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final b f54524c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final e.a f54525d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f54526e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f54527f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final C19668a f54528g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f54529h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CallbackName {

            /* renamed from: b, reason: collision with root package name */
            public static final CallbackName f54530b;

            /* renamed from: c, reason: collision with root package name */
            public static final CallbackName f54531c;

            /* renamed from: d, reason: collision with root package name */
            public static final CallbackName f54532d;

            /* renamed from: e, reason: collision with root package name */
            public static final CallbackName f54533e;

            /* renamed from: f, reason: collision with root package name */
            public static final CallbackName f54534f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ CallbackName[] f54535g;

            static {
                CallbackName callbackName = new CallbackName("ON_CONFIGURE", 0);
                f54530b = callbackName;
                CallbackName callbackName2 = new CallbackName("ON_CREATE", 1);
                f54531c = callbackName2;
                CallbackName callbackName3 = new CallbackName("ON_UPGRADE", 2);
                f54532d = callbackName3;
                CallbackName callbackName4 = new CallbackName("ON_DOWNGRADE", 3);
                f54533e = callbackName4;
                CallbackName callbackName5 = new CallbackName("ON_OPEN", 4);
                f54534f = callbackName5;
                f54535g = new CallbackName[]{callbackName, callbackName2, callbackName3, callbackName4, callbackName5};
            }

            public CallbackName() {
                throw null;
            }

            public static CallbackName valueOf(String str) {
                return (CallbackName) Enum.valueOf(CallbackName.class, str);
            }

            public static CallbackName[] values() {
                return (CallbackName[]) f54535g.clone();
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$a;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends RuntimeException {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final CallbackName f54536b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Throwable f54537c;

            public a(@k CallbackName callbackName, @k Throwable th2) {
                super(th2);
                this.f54536b = callbackName;
                this.f54537c = th2;
            }

            @Override // java.lang.Throwable
            @k
            public final Throwable getCause() {
                return this.f54537c;
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$b;", "", "<init>", "()V", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class c {
            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            }
        }

        public OpenHelper(@k Context context, @l String str, @k final b bVar, @k final e.a aVar, boolean z12) {
            super(context, str, null, aVar.f19821a, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.c
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    FrameworkSQLiteOpenHelper.OpenHelper.b bVar2 = FrameworkSQLiteOpenHelper.OpenHelper.f54522i;
                    FrameworkSQLiteOpenHelper.b bVar3 = bVar;
                    bVar2.getClass();
                    b bVar4 = bVar3.f54538a;
                    if (bVar4 == null || !L.f(bVar4.f54543b, sQLiteDatabase)) {
                        bVar4 = new b(sQLiteDatabase);
                        bVar3.f54538a = bVar4;
                    }
                    SQLiteDatabase sQLiteDatabase2 = bVar4.f54543b;
                    boolean zIsOpen = sQLiteDatabase2.isOpen();
                    e.a aVar2 = aVar;
                    if (!zIsOpen) {
                        String path = sQLiteDatabase2.getPath();
                        if (path != null) {
                            aVar2.getClass();
                            e.a.a(path);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> attachedDbs = null;
                    try {
                        try {
                            attachedDbs = sQLiteDatabase2.getAttachedDbs();
                        } catch (SQLiteException unused) {
                        }
                        try {
                            bVar4.close();
                        } catch (IOException unused2) {
                        }
                        if (attachedDbs != null) {
                            return;
                        }
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                String str2 = (String) ((Pair) it.next()).second;
                                aVar2.getClass();
                                e.a.a(str2);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                aVar2.getClass();
                                e.a.a(path2);
                            }
                        }
                    }
                }
            });
            this.f54523b = context;
            this.f54524c = bVar;
            this.f54525d = aVar;
            this.f54526e = z12;
            this.f54528g = new C19668a(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
        }

        @k
        public final Z1.d a(boolean z12) throws IOException {
            C19668a c19668a = this.f54528g;
            try {
                c19668a.a((this.f54529h || getDatabaseName() == null) ? false : true);
                this.f54527f = false;
                SQLiteDatabase sQLiteDatabaseC = c(z12);
                if (!this.f54527f) {
                    androidx.sqlite.db.framework.b bVarB = b(sQLiteDatabaseC);
                    c19668a.b();
                    return bVarB;
                }
                close();
                Z1.d dVarA = a(z12);
                c19668a.b();
                return dVarA;
            } catch (Throwable th2) {
                c19668a.b();
                throw th2;
            }
        }

        @k
        public final androidx.sqlite.db.framework.b b(@k SQLiteDatabase sQLiteDatabase) {
            f54522i.getClass();
            b bVar = this.f54524c;
            androidx.sqlite.db.framework.b bVar2 = bVar.f54538a;
            if (bVar2 != null && L.f(bVar2.f54543b, sQLiteDatabase)) {
                return bVar2;
            }
            androidx.sqlite.db.framework.b bVar3 = new androidx.sqlite.db.framework.b(sQLiteDatabase);
            bVar.f54538a = bVar3;
            return bVar3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v12, types: [android.database.sqlite.SQLiteDatabase] */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v9, types: [android.database.sqlite.SQLiteDatabase] */
        public final SQLiteDatabase c(boolean z12) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z13 = this.f54529h;
            Context context = this.f54523b;
            if (databaseName != null && !z13 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    parentFile.toString();
                }
            }
            try {
                z12 = z12 != 0 ? getWritableDatabase() : getReadableDatabase();
                return z12;
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    z12 = z12 != 0 ? getWritableDatabase() : getReadableDatabase();
                    return z12;
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof a) {
                        a aVar = th2;
                        int iOrdinal = aVar.f54536b.ordinal();
                        Throwable th3 = aVar.f54537c;
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || !(th3 instanceof SQLiteException)) {
                            throw th3;
                        }
                    } else if (!(th2 instanceof SQLiteException) || databaseName == null || !this.f54526e) {
                        throw th2;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        return z12 != 0 ? getWritableDatabase() : getReadableDatabase();
                    } catch (a e12) {
                        throw e12.f54537c;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() throws IOException {
            C19668a c19668a = this.f54528g;
            try {
                c19668a.a(c19668a.f20705a);
                super.close();
                this.f54524c.f54538a = null;
                this.f54529h = false;
            } finally {
                c19668a.b();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(@k SQLiteDatabase sQLiteDatabase) {
            boolean z12 = this.f54527f;
            e.a aVar = this.f54525d;
            if (!z12 && aVar.f19821a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                b(sQLiteDatabase);
                aVar.getClass();
            } catch (Throwable th2) {
                throw new a(CallbackName.f54530b, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(@k SQLiteDatabase sQLiteDatabase) {
            try {
                this.f54525d.b(b(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new a(CallbackName.f54531c, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(@k SQLiteDatabase sQLiteDatabase, int i12, int i13) {
            this.f54527f = true;
            try {
                this.f54525d.c(b(sQLiteDatabase), i12, i13);
            } catch (Throwable th2) {
                throw new a(CallbackName.f54533e, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(@k SQLiteDatabase sQLiteDatabase) {
            if (!this.f54527f) {
                try {
                    this.f54525d.d(b(sQLiteDatabase));
                } catch (Throwable th2) {
                    throw new a(CallbackName.f54534f, th2);
                }
            }
            this.f54529h = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(@k SQLiteDatabase sQLiteDatabase, int i12, int i13) {
            this.f54527f = true;
            try {
                this.f54525d.e(b(sQLiteDatabase), i12, i13);
            } catch (Throwable th2) {
                throw new a(CallbackName.f54532d, th2);
            }
        }
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$b;", "", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public androidx.sqlite.db.framework.b f54538a = null;
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends N implements Y41.a<OpenHelper> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final OpenHelper invoke() {
            OpenHelper openHelper;
            FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = FrameworkSQLiteOpenHelper.this;
            if (frameworkSQLiteOpenHelper.f54516c == null || !frameworkSQLiteOpenHelper.f54518e) {
                openHelper = new OpenHelper(frameworkSQLiteOpenHelper.f54515b, frameworkSQLiteOpenHelper.f54516c, new b(), frameworkSQLiteOpenHelper.f54517d, frameworkSQLiteOpenHelper.f54519f);
            } else {
                int i12 = c.C1411c.f19819a;
                openHelper = new OpenHelper(frameworkSQLiteOpenHelper.f54515b, new File(frameworkSQLiteOpenHelper.f54515b.getNoBackupFilesDir(), frameworkSQLiteOpenHelper.f54516c).getAbsolutePath(), new b(), frameworkSQLiteOpenHelper.f54517d, frameworkSQLiteOpenHelper.f54519f);
            }
            boolean z12 = frameworkSQLiteOpenHelper.f54521h;
            int i13 = c.a.f19817a;
            openHelper.setWriteAheadLoggingEnabled(z12);
            return openHelper;
        }
    }

    static {
        new a(null);
    }

    @j
    public FrameworkSQLiteOpenHelper(@k Context context, @l String str, @k e.a aVar, boolean z12, boolean z13) {
        this.f54515b = context;
        this.f54516c = str;
        this.f54517d = aVar;
        this.f54518e = z12;
        this.f54519f = z13;
        this.f54520g = C42727D.c(new c());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InterfaceC42726C<OpenHelper> interfaceC42726C = this.f54520g;
        if (interfaceC42726C.isInitialized()) {
            interfaceC42726C.getValue().close();
        }
    }

    @Override // Z1.e
    @l
    /* renamed from: getDatabaseName, reason: from getter */
    public final String getF54516c() {
        return this.f54516c;
    }

    @Override // Z1.e
    @k
    public final Z1.d getWritableDatabase() {
        return this.f54520g.getValue().a(true);
    }

    @Override // Z1.e
    @X
    public final void setWriteAheadLoggingEnabled(boolean z12) {
        InterfaceC42726C<OpenHelper> interfaceC42726C = this.f54520g;
        if (interfaceC42726C.isInitialized()) {
            OpenHelper value = interfaceC42726C.getValue();
            int i12 = c.a.f19817a;
            value.setWriteAheadLoggingEnabled(z12);
        }
        this.f54521h = z12;
    }

    public /* synthetic */ FrameworkSQLiteOpenHelper(Context context, String str, e.a aVar, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(context, str, aVar, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? false : z13);
    }
}
