package com.avito.android.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.avito.android.util.C35851n0;
import com.avito.android.util.X4;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import qu.C47446b;
import ru.C47726a;
import su.C48415a;
import su.C48416b;
import uK0.C48914a;
import uu.C49113a;
import wu.C49683a;

/* compiled from: DbMigrationHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/db/i;", "", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f132683a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SQLiteDatabase f132684b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f132685c = P0.g(new kotlin.Q(1, C29653k.f132716l), new kotlin.Q(2, v.f132727l), new kotlin.Q(3, new G()), new kotlin.Q(4, new O()), new kotlin.Q(5, P.f132701l), new kotlin.Q(6, new Q()), new kotlin.Q(7, R.f132703l), new kotlin.Q(8, new S()), new kotlin.Q(9, new T()), new kotlin.Q(10, new C29644a()), new kotlin.Q(11, new C29645b()), new kotlin.Q(12, new C29646c()), new kotlin.Q(13, new C29647d()), new kotlin.Q(14, C29648e.f132710l), new kotlin.Q(15, C29649f.f132711l), new kotlin.Q(16, C29650g.f132712l), new kotlin.Q(17, C29651h.f132713l), new kotlin.Q(18, new C3973i()), new kotlin.Q(19, C29652j.f132715l), new kotlin.Q(20, new C29654l()), new kotlin.Q(21, new C29655m()), new kotlin.Q(22, new C29656n()), new kotlin.Q(23, C29657o.f132720l), new kotlin.Q(24, C29658p.f132721l), new kotlin.Q(25, new C29659q()), new kotlin.Q(26, C29660r.f132723l), new kotlin.Q(27, C29661s.f132724l), new kotlin.Q(28, C29662t.f132725l), new kotlin.Q(29, u.f132726l), new kotlin.Q(30, w.f132728l), new kotlin.Q(31, x.f132729l), new kotlin.Q(32, new y()), new kotlin.Q(33, z.f132731l), new kotlin.Q(34, A.f132686l), new kotlin.Q(35, new B()), new kotlin.Q(36, C.f132688l), new kotlin.Q(37, D.f132689l), new kotlin.Q(38, new E()), new kotlin.Q(39, new F()), new kotlin.Q(40, H.f132693l), new kotlin.Q(41, new I()), new kotlin.Q(42, new J()), new kotlin.Q(43, new K()), new kotlin.Q(44, new L()), new kotlin.Q(45, new M()), new kotlin.Q(46, new N()));

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final A f132686l = new A();

        public A() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class B extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public B() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            SQLiteDatabase sQLiteDatabase = i.this.f132684b;
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS publish_drafts");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS publish_drafts_values");
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C f132688l = new C();

        public C() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class D extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final D f132689l = new D();

        public D() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class E extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public E() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i.this.f132684b.execSQL("DROP TABLE IF EXISTS recentSearch");
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class F extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public F() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i.this.f132684b.execSQL("DROP TABLE IF EXISTS favorites");
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class G extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public G() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            SQLiteDatabase sQLiteDatabase = i.this.f132684b;
            if (!X4.a(sQLiteDatabase, "saved_searches", "has_unread_changes")) {
                sQLiteDatabase.execSQL("ALTER TABLE saved_searches ADD COLUMN has_unread_changes INTEGER DEFAULT 0");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class H extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final H f132693l = new H();

        public H() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class I extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public I() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i iVar = i.this;
            iVar.getClass();
            String str = tu.b.f439641a;
            String str2 = tu.b.f439649i;
            SQLiteDatabase sQLiteDatabase = iVar.f132684b;
            if (!X4.a(sQLiteDatabase, str, str2)) {
                sQLiteDatabase.execSQL(androidx.camera.core.Q.a("ALTER TABLE ", str, " ADD COLUMN ", str2, " INTEGER NOT NULL DEFAULT 0"));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class J extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public J() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i iVar = i.this;
            iVar.f132684b.execSQL("DROP TABLE IF EXISTS favorite_adverts");
            new C47446b();
            SQLiteDatabase sQLiteDatabase = iVar.f132684b;
            if (X4.a(sQLiteDatabase, "favorites_sync", "sync_status")) {
                ArrayList arrayList = new ArrayList();
                C48914a c48914aA = C35851n0.a(sQLiteDatabase.query("favorites_sync", new String[]{"entity_id", "marked_for_remove"}, "sync_status = ?", new String[]{"0"}, null, null, null, null));
                while (c48914aA.moveToNext()) {
                    try {
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("entity_id", c48914aA.d("entity_id"));
                            contentValues.put("marked_for_remove", Integer.valueOf(c48914aA.b("marked_for_remove")));
                            arrayList.add(contentValues);
                        } catch (Exception e12) {
                            try {
                                c48914aA.close();
                            } catch (Exception unused) {
                            }
                            throw e12;
                        }
                    } catch (Throwable th2) {
                        if (0 == 0) {
                            c48914aA.close();
                        }
                        throw th2;
                    }
                }
                G0 g02 = G0.f406611a;
                c48914aA.close();
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat("favorites_sync"));
                sQLiteDatabase.execSQL("\n                CREATE TABLE IF NOT EXISTS favorites_sync(\n                    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n                    entity_id TEXT NOT NULL UNIQUE ON CONFLICT REPLACE,               \n                    marked_for_remove INTEGER NOT NULL DEFAULT 0,\n                    x_hash TEXT,\n                    analytics_source TEXT\n                );\n               ");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sQLiteDatabase.insert("favorites_sync", null, (ContentValues) it.next());
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class K extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public K() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i iVar = i.this;
            iVar.getClass();
            new C47446b();
            SQLiteDatabase sQLiteDatabase = iVar.f132684b;
            if (!X4.a(sQLiteDatabase, "favorites_sync", "x_hash")) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat("favorites_sync"));
                sQLiteDatabase.execSQL("\n                CREATE TABLE IF NOT EXISTS favorites_sync(\n                    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n                    entity_id TEXT NOT NULL UNIQUE ON CONFLICT REPLACE,               \n                    marked_for_remove INTEGER NOT NULL DEFAULT 0,\n                    x_hash TEXT,\n                    analytics_source TEXT\n                );\n               ");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class L extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public L() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i iVar = i.this;
            iVar.getClass();
            new C47446b();
            SQLiteDatabase sQLiteDatabase = iVar.f132684b;
            if (!X4.a(sQLiteDatabase, "favorites_sync", "analytics_source")) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat("favorites_sync"));
                sQLiteDatabase.execSQL("\n                CREATE TABLE IF NOT EXISTS favorites_sync(\n                    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n                    entity_id TEXT NOT NULL UNIQUE ON CONFLICT REPLACE,               \n                    marked_for_remove INTEGER NOT NULL DEFAULT 0,\n                    x_hash TEXT,\n                    analytics_source TEXT\n                );\n               ");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class M extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public M() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i iVar = i.this;
            iVar.getClass();
            String str = tu.b.f439641a;
            String str2 = tu.b.f439652l;
            SQLiteDatabase sQLiteDatabase = iVar.f132684b;
            if (!X4.a(sQLiteDatabase, str, str2)) {
                sQLiteDatabase.execSQL(androidx.camera.core.Q.a("ALTER TABLE ", str, " ADD COLUMN ", str2, " TEXT"));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class N extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public N() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i iVar = i.this;
            iVar.getClass();
            String str = tu.b.f439641a;
            String str2 = tu.b.f439653m;
            SQLiteDatabase sQLiteDatabase = iVar.f132684b;
            if (!X4.a(sQLiteDatabase, str, str2)) {
                sQLiteDatabase.execSQL(androidx.camera.core.Q.a("ALTER TABLE ", str, " ADD COLUMN ", str2, " TEXT"));
            }
            String str3 = tu.b.f439654n;
            if (!X4.a(sQLiteDatabase, str, str3)) {
                sQLiteDatabase.execSQL(androidx.camera.core.Q.a("ALTER TABLE ", str, " ADD COLUMN ", str3, " INTEGER NOT NULL DEFAULT 0"));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class O extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public O() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i.this.f132684b.execSQL("CREATE TABLE search_subscriptions (_id INTEGER PRIMARY KEY AUTOINCREMENT,subscription_id TEXT,description TEXT,title TEXT,unread_count INTEGER,last_update INTEGER,ssid TEXT)");
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class P extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final P f132701l = new P();

        public P() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Q extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public Q() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i iVar = i.this;
            iVar.getClass();
            new C47446b();
            iVar.f132684b.execSQL("\n                CREATE TABLE IF NOT EXISTS favorites_sync(\n                    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n                    entity_id TEXT NOT NULL UNIQUE ON CONFLICT REPLACE,               \n                    marked_for_remove INTEGER NOT NULL DEFAULT 0,\n                    x_hash TEXT,\n                    analytics_source TEXT\n                );\n               ");
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class R extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final R f132703l = new R();

        public R() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class S extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public S() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i iVar = i.this;
            iVar.getClass();
            new tu.b();
            iVar.f132684b.execSQL(tu.b.a());
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class T extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public T() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i iVar = i.this;
            iVar.getClass();
            new C48416b();
            SQLiteDatabase sQLiteDatabase = iVar.f132684b;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS send_message_requests (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, channel_id TEXT NOT NULL, message_type TEXT NOT NULL, local_id TEXT UNIQUE NOT NULL, remote_id TEXT, created INTEGER NOT NULL, text TEXT, error_code INTEGER NOT NULL DEFAULT 0)");
            sQLiteDatabase.execSQL(new C48415a().a());
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$a, reason: case insensitive filesystem */
    public static final class C29644a extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public C29644a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i iVar = i.this;
            iVar.getClass();
            iVar.f132684b.execSQL(new C49113a().f440317a);
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$b, reason: case insensitive filesystem */
    public static final class C29645b extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public C29645b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i iVar = i.this;
            iVar.getClass();
            new C49683a();
            iVar.f132684b.execSQL("\n            CREATE TABLE IF NOT EXISTS viewed_adverts(\n                _id INTEGER PRIMARY KEY AUTOINCREMENT,\n                advert_id TEXT NOT NULL UNIQUE ON CONFLICT REPLACE,\n                added_time INTEGER NOT NULL\n            );\n        ");
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$c, reason: case insensitive filesystem */
    public static final class C29646c extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public C29646c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            i iVar = i.this;
            iVar.getClass();
            Gson gsonA = new com.google.gson.d().a();
            AK0.j jVar = new AK0.j();
            SQLiteDatabase sQLiteDatabase = iVar.f132684b;
            Context context = iVar.f132683a;
            AK0.c cVar = new AK0.c(context, sQLiteDatabase, gsonA, jVar);
            cVar.a("shared_preferences", jVar.b(context).f316a.getAll());
            cVar.a("geo", jVar.a(context, "geo").f316a.getAll());
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$d, reason: case insensitive filesystem */
    public static final class C29647d extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public C29647d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i.this.f132684b.execSQL("DROP TABLE IF EXISTS photo");
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$e, reason: case insensitive filesystem */
    public static final class C29648e extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C29648e f132710l = new C29648e();

        public C29648e() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$f, reason: case insensitive filesystem */
    public static final class C29649f extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C29649f f132711l = new C29649f();

        public C29649f() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$g, reason: case insensitive filesystem */
    public static final class C29650g extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C29650g f132712l = new C29650g();

        public C29650g() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$h, reason: case insensitive filesystem */
    public static final class C29651h extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C29651h f132713l = new C29651h();

        public C29651h() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$i, reason: collision with other inner class name */
    public static final class C3973i extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public C3973i() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i iVar = i.this;
            iVar.getClass();
            new C47726a();
            iVar.f132684b.execSQL("\n            CREATE TABLE IF NOT EXISTS login_suggests(\n                _id INTEGER PRIMARY KEY AUTOINCREMENT,\n                user_hash_id TEXT NOT NULL UNIQUE ON CONFLICT REPLACE,\n                login TEXT,\n                social TEXT,\n                social_id TEXT\n            );\n        ");
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$j, reason: case insensitive filesystem */
    public static final class C29652j extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C29652j f132715l = new C29652j();

        public C29652j() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$k, reason: case insensitive filesystem */
    public static final class C29653k extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C29653k f132716l = new C29653k();

        public C29653k() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$l, reason: case insensitive filesystem */
    public static final class C29654l extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public C29654l() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            SQLiteDatabase sQLiteDatabase = i.this.f132684b;
            if (!X4.a(sQLiteDatabase, "search_subscriptions", "ssid")) {
                sQLiteDatabase.execSQL("ALTER TABLE search_subscriptions ADD COLUMN ssid TEXT");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$m, reason: case insensitive filesystem */
    public static final class C29655m extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public C29655m() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            i iVar = i.this;
            iVar.getClass();
            Gson gsonA = new com.google.gson.d().a();
            AK0.j jVar = new AK0.j();
            SQLiteDatabase sQLiteDatabase = iVar.f132684b;
            Context context = iVar.f132683a;
            AK0.q qVar = new AK0.q(context, sQLiteDatabase, gsonA, jVar);
            qVar.b(qVar.a(sQLiteDatabase, "shared_preferences"), jVar.b(context));
            qVar.b(qVar.a(sQLiteDatabase, "geo"), jVar.a(context, "geo"));
            qVar.b(qVar.a(sQLiteDatabase, "abtest"), jVar.a(context, "abtest"));
            qVar.b(qVar.a(sQLiteDatabase, "suggests"), jVar.a(context, "suggests"));
            qVar.b(qVar.a(sQLiteDatabase, "debug"), jVar.a(context, "debug"));
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$n, reason: case insensitive filesystem */
    public static final class C29656n extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public C29656n() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            i iVar = i.this;
            iVar.getClass();
            new AK0.j();
            StringBuilder sb2 = new StringBuilder();
            Context context = iVar.f132683a;
            sb2.append(context.getPackageName());
            sb2.append("_suggests");
            context.deleteSharedPreferences(sb2.toString());
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$o, reason: case insensitive filesystem */
    public static final class C29657o extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C29657o f132720l = new C29657o();

        public C29657o() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$p, reason: case insensitive filesystem */
    public static final class C29658p extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C29658p f132721l = new C29658p();

        public C29658p() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$q, reason: case insensitive filesystem */
    public static final class C29659q extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public C29659q() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i iVar = i.this;
            iVar.getClass();
            String str = tu.b.f439641a;
            String str2 = tu.b.f439651k;
            SQLiteDatabase sQLiteDatabase = iVar.f132684b;
            if (!X4.a(sQLiteDatabase, str, str2)) {
                sQLiteDatabase.execSQL(androidx.camera.core.Q.a("ALTER TABLE ", str, " ADD COLUMN ", str2, " TEXT"));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$r, reason: case insensitive filesystem */
    public static final class C29660r extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C29660r f132723l = new C29660r();

        public C29660r() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$s, reason: case insensitive filesystem */
    public static final class C29661s extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C29661s f132724l = new C29661s();

        public C29661s() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.db.i$t, reason: case insensitive filesystem */
    public static final class C29662t extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C29662t f132725l = new C29662t();

        public C29662t() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final u f132726l = new u();

        public u() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final v f132727l = new v();

        public v() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final w f132728l = new w();

        public w() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final x f132729l = new x();

        public x() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public y() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() throws SQLException {
            i iVar = i.this;
            iVar.getClass();
            new C47726a();
            SQLiteDatabase sQLiteDatabase = iVar.f132684b;
            if (!X4.a(sQLiteDatabase, "login_suggests", "social_id")) {
                sQLiteDatabase.execSQL("ALTER TABLE login_suggests ADD COLUMN social_id TEXT");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DbMigrationHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final z f132731l = new z();

        public z() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public i(@Y61.k Context context, @Y61.k SQLiteDatabase sQLiteDatabase) {
        this.f132683a = context;
        this.f132684b = sQLiteDatabase;
    }
}
