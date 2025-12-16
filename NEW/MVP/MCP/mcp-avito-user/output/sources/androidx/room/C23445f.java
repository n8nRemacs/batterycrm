package androidx.room;

import Z1.c;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/f;", "LZ1/e;", "Landroidx/room/E;", "a", "b", "c", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23445f implements Z1.e, E {

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/f$a;", "LZ1/d;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.f$a */
    public static final class a implements Z1.d {

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LZ1/d;", "obj", "", "Landroid/util/Pair;", "", "invoke", "(LZ1/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$a$a, reason: collision with other inner class name */
        public static final class C1915a extends kotlin.jvm.internal.N implements Y41.l<Z1.d, List<? extends Pair<String, String>>> {
            static {
                new C1915a();
            }

            public C1915a() {
                super(1);
            }

            @Override // Y41.l
            public final List<? extends Pair<String, String>> invoke(Z1.d dVar) {
                return dVar.x3();
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/d;", "db", "", "invoke", "(LZ1/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$a$b */
        public static final class b extends kotlin.jvm.internal.N implements Y41.l<Z1.d, Object> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f54373l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(1);
                this.f54373l = str;
            }

            @Override // Y41.l
            public final Object invoke(Z1.d dVar) {
                dVar.P4(this.f54373l);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.room.f$a$c */
        public /* synthetic */ class c extends kotlin.jvm.internal.H implements Y41.l<Z1.d, Boolean> {
            static {
                new c();
            }

            public c() {
                super(1, Z1.d.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // Y41.l
            public final Boolean invoke(Z1.d dVar) {
                return Boolean.valueOf(dVar.e6());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/d;", "obj", "", "invoke", "(LZ1/d;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$a$d */
        public static final class d extends kotlin.jvm.internal.N implements Y41.l<Z1.d, Boolean> {
            static {
                new d();
            }

            public d() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(Z1.d dVar) {
                return Boolean.valueOf(dVar.O1());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.room.f$a$e */
        public /* synthetic */ class e extends kotlin.jvm.internal.h0 {
            static {
                new e();
            }

            public e() {
                super(Z1.d.class, "isDbLockedByCurrentThread", "isDbLockedByCurrentThread()Z", 0);
            }

            @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj) {
                return Boolean.valueOf(((Z1.d) obj).Q3());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/d;", "obj", "", "invoke", "(LZ1/d;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$a$f, reason: collision with other inner class name */
        public static final class C1916f extends kotlin.jvm.internal.N implements Y41.l<Z1.d, Boolean> {
            static {
                new C1916f();
            }

            public C1916f() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(Z1.d dVar) {
                return Boolean.valueOf(dVar.X2());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/d;", "db", "", "invoke", "(LZ1/d;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$a$g */
        public static final class g extends kotlin.jvm.internal.N implements Y41.l<Z1.d, Boolean> {
            static {
                new g();
            }

            public g() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(Z1.d dVar) {
                return Boolean.valueOf(dVar.g6());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.room.f$a$h */
        public /* synthetic */ class h extends kotlin.jvm.internal.h0 {
            static {
                new h();
            }

            public h() {
                super(Z1.d.class, "maximumSize", "getMaximumSize()J", 0);
            }

            @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj) {
                return Long.valueOf(((Z1.d) obj).h1());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.room.f$a$i */
        public /* synthetic */ class i extends kotlin.jvm.internal.Y {
            static {
                new i();
            }

            public i() {
                super(Z1.d.class, "pageSize", "getPageSize()J", 0);
            }

            @Override // kotlin.jvm.internal.Y, kotlin.reflect.l
            public final void e(@Y61.l Object obj, @Y61.l Object obj2) {
                ((Z1.d) obj).j6(((Number) obj2).longValue());
            }

            @Override // kotlin.jvm.internal.Y, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj) {
                return Long.valueOf(((Z1.d) obj).C());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/d;", "db", "", "invoke", "(LZ1/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$a$j */
        public static final class j extends kotlin.jvm.internal.N implements Y41.l<Z1.d, Object> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f54374l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(long j12) {
                super(1);
                this.f54374l = j12;
            }

            @Override // Y41.l
            public final Object invoke(Z1.d dVar) {
                dVar.j6(this.f54374l);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/d;", "obj", "", "invoke", "(LZ1/d;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$a$k */
        public static final class k extends kotlin.jvm.internal.N implements Y41.l<Z1.d, String> {
            static {
                new k();
            }

            public k() {
                super(1);
            }

            @Override // Y41.l
            public final String invoke(Z1.d dVar) {
                return dVar.getPath();
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.room.f$a$l */
        public /* synthetic */ class l extends kotlin.jvm.internal.Y {
            static {
                new l();
            }

            public l() {
                super(Z1.d.class, "version", "getVersion()I", 0);
            }

            @Override // kotlin.jvm.internal.Y, kotlin.reflect.l
            public final void e(@Y61.l Object obj, @Y61.l Object obj2) {
                ((Z1.d) obj).H2(((Number) obj2).intValue());
            }

            @Override // kotlin.jvm.internal.Y, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj) {
                return Integer.valueOf(((Z1.d) obj).getVersion());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/d;", "db", "", "invoke", "(LZ1/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$a$m */
        public static final class m extends kotlin.jvm.internal.N implements Y41.l<Z1.d, Object> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ int f54375l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(int i12) {
                super(1);
                this.f54375l = i12;
            }

            @Override // Y41.l
            public final Object invoke(Z1.d dVar) {
                dVar.H2(this.f54375l);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.room.f$a$n */
        public /* synthetic */ class n extends kotlin.jvm.internal.H implements Y41.l<Z1.d, Boolean> {
            static {
                new n();
            }

            public n() {
                super(1, Z1.d.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
            }

            @Override // Y41.l
            public final Boolean invoke(Z1.d dVar) {
                return Boolean.valueOf(dVar.Q5());
            }
        }

        @Override // Z1.d
        public final long C() {
            throw null;
        }

        @Override // Z1.d
        public final void H2(int i12) {
            new m(i12);
            throw null;
        }

        @Override // Z1.d
        public final void L3() {
            throw null;
        }

        @Override // Z1.d
        @Y61.k
        public final Z1.i N2(@Y61.k String str) {
            throw null;
        }

        @Override // Z1.d
        public final boolean O1() {
            throw null;
        }

        @Override // Z1.d
        public final void P4(@Y61.k String str) {
            new b(str);
            throw null;
        }

        @Override // Z1.d
        public final boolean Q3() {
            throw null;
        }

        @Override // Z1.d
        public final boolean Q5() {
            throw null;
        }

        @Override // Z1.d
        @Y61.k
        public final Cursor R5(@Y61.k String str) {
            throw null;
        }

        @Override // Z1.d
        public final boolean X2() {
            throw null;
        }

        @Override // Z1.d
        public final void Z2(@Y61.k Object[] objArr) {
            new C23449h(objArr);
            throw null;
        }

        @Override // Z1.d
        public final void b5() {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // Z1.d
        public final boolean e6() {
            throw null;
        }

        @Override // Z1.d
        public final void g5() {
            throw null;
        }

        @Override // Z1.d
        @j.X
        public final boolean g6() {
            throw null;
        }

        @Override // Z1.d
        @Y61.l
        public final String getPath() {
            throw null;
        }

        @Override // Z1.d
        public final int getVersion() {
            throw null;
        }

        @Override // Z1.d
        public final long h1() {
            throw null;
        }

        @Override // Z1.d
        public final boolean isOpen() {
            throw null;
        }

        @Override // Z1.d
        public final void j6(long j12) {
            new j(j12);
            throw null;
        }

        @Override // Z1.d
        public final int o6(@Y61.k ContentValues contentValues, @Y61.l Object[] objArr) {
            new C23465p(contentValues, objArr);
            throw null;
        }

        @Override // Z1.d
        @Y61.k
        public final Cursor p1(@Y61.k Z1.g gVar) {
            throw null;
        }

        @Override // Z1.d
        public final void q0() {
            throw null;
        }

        @Override // Z1.d
        @Y61.l
        public final List<Pair<String, String>> x3() {
            throw null;
        }
    }

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/f$c;", "Landroid/database/Cursor;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.f$c */
    public static final class c implements Cursor {
        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // android.database.Cursor
        public final void copyStringToBuffer(int i12, CharArrayBuffer charArrayBuffer) {
            throw null;
        }

        @Override // android.database.Cursor
        @InterfaceC42830m
        public final void deactivate() {
            throw null;
        }

        @Override // android.database.Cursor
        public final byte[] getBlob(int i12) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getColumnCount() {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getColumnIndex(String str) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getColumnIndexOrThrow(String str) {
            throw null;
        }

        @Override // android.database.Cursor
        public final String getColumnName(int i12) {
            throw null;
        }

        @Override // android.database.Cursor
        public final String[] getColumnNames() {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getCount() {
            throw null;
        }

        @Override // android.database.Cursor
        public final double getDouble(int i12) {
            throw null;
        }

        @Override // android.database.Cursor
        public final Bundle getExtras() {
            throw null;
        }

        @Override // android.database.Cursor
        public final float getFloat(int i12) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getInt(int i12) {
            throw null;
        }

        @Override // android.database.Cursor
        public final long getLong(int i12) {
            throw null;
        }

        @Override // android.database.Cursor
        @Y61.k
        @j.X
        public final Uri getNotificationUri() {
            int i12 = c.b.f19818a;
            throw null;
        }

        @Override // android.database.Cursor
        @Y61.k
        @j.X
        public final List<Uri> getNotificationUris() {
            return c.e.a(null);
        }

        @Override // android.database.Cursor
        public final int getPosition() {
            throw null;
        }

        @Override // android.database.Cursor
        public final short getShort(int i12) {
            throw null;
        }

        @Override // android.database.Cursor
        public final String getString(int i12) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getType(int i12) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean getWantsAllOnMoveCalls() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isAfterLast() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isBeforeFirst() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isClosed() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isFirst() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isLast() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isNull(int i12) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean move(int i12) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToFirst() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToLast() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToNext() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToPosition(int i12) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToPrevious() {
            throw null;
        }

        @Override // android.database.Cursor
        public final void registerContentObserver(ContentObserver contentObserver) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            throw null;
        }

        @Override // android.database.Cursor
        @InterfaceC42830m
        public final boolean requery() {
            throw null;
        }

        @Override // android.database.Cursor
        public final Bundle respond(Bundle bundle) {
            throw null;
        }

        @Override // android.database.Cursor
        @j.X
        public final void setExtras(@Y61.k Bundle bundle) {
            int i12 = c.d.f19820a;
            throw null;
        }

        @Override // android.database.Cursor
        public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            throw null;
        }

        @Override // android.database.Cursor
        @j.X
        public final void setNotificationUris(@Y61.k ContentResolver contentResolver, @Y61.k List<? extends Uri> list) {
            c.e.b(null, contentResolver, list);
            throw null;
        }

        @Override // android.database.Cursor
        public final void unregisterContentObserver(ContentObserver contentObserver) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            throw null;
        }
    }

    @Override // androidx.room.E
    @Y61.k
    public final Z1.e a() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // Z1.e
    @Y61.l
    /* renamed from: getDatabaseName */
    public final String getF54516c() {
        throw null;
    }

    @Override // Z1.e
    @Y61.k
    @j.X
    public final Z1.d getWritableDatabase() {
        throw null;
    }

    @Override // Z1.e
    @j.X
    public final void setWriteAheadLoggingEnabled(boolean z12) {
        throw null;
    }

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/f$b;", "LZ1/i;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.f$b */
    public static final class b implements Z1.i {

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/i;", "statement", "", "invoke", "(LZ1/i;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$b$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<Z1.i, Object> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f54376l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Object invoke(Z1.i iVar) {
                iVar.execute();
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/i;", "obj", "", "invoke", "(LZ1/i;)Ljava/lang/Long;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$b$b, reason: collision with other inner class name */
        public static final class C1917b extends kotlin.jvm.internal.N implements Y41.l<Z1.i, Long> {

            /* renamed from: l, reason: collision with root package name */
            public static final C1917b f54377l = new C1917b();

            public C1917b() {
                super(1);
            }

            @Override // Y41.l
            public final Long invoke(Z1.i iVar) {
                return Long.valueOf(iVar.E2());
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LZ1/d;", "db", "invoke", "(LZ1/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$b$c */
        public static final class c<T> extends kotlin.jvm.internal.N implements Y41.l<Z1.d, T> {
            public c(Y41.l<? super Z1.i, ? extends T> lVar) {
                super(1);
            }

            @Override // Y41.l
            public final Object invoke(Z1.d dVar) {
                b.this.getClass();
                dVar.N2(null);
                throw null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/i;", "obj", "", "invoke", "(LZ1/i;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$b$d */
        public static final class d extends kotlin.jvm.internal.N implements Y41.l<Z1.i, Integer> {

            /* renamed from: l, reason: collision with root package name */
            public static final d f54379l = new d();

            public d() {
                super(1);
            }

            @Override // Y41.l
            public final Integer invoke(Z1.i iVar) {
                return Integer.valueOf(iVar.B3());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/i;", "obj", "", "invoke", "(LZ1/i;)Ljava/lang/Long;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$b$e */
        public static final class e extends kotlin.jvm.internal.N implements Y41.l<Z1.i, Long> {

            /* renamed from: l, reason: collision with root package name */
            public static final e f54380l = new e();

            public e() {
                super(1);
            }

            @Override // Y41.l
            public final Long invoke(Z1.i iVar) {
                return Long.valueOf(iVar.g4());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/i;", "obj", "", "invoke", "(LZ1/i;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.f$b$f, reason: collision with other inner class name */
        public static final class C1918f extends kotlin.jvm.internal.N implements Y41.l<Z1.i, String> {

            /* renamed from: l, reason: collision with root package name */
            public static final C1918f f54381l = new C1918f();

            public C1918f() {
                super(1);
            }

            @Override // Y41.l
            public final String invoke(Z1.i iVar) {
                return iVar.c2();
            }
        }

        @Override // Z1.i
        public final int B3() {
            a(d.f54379l);
            throw null;
        }

        @Override // Z1.f
        public final void B4(int i12) {
            throw null;
        }

        @Override // Z1.i
        public final long E2() {
            a(C1917b.f54377l);
            throw null;
        }

        public final <T> T a(Y41.l<? super Z1.i, ? extends T> lVar) {
            new c(lVar);
            throw null;
        }

        @Override // Z1.i
        @Y61.l
        public final String c2() {
            a(C1918f.f54381l);
            throw null;
        }

        @Override // Z1.i
        public final void execute() {
            a(a.f54376l);
            throw null;
        }

        @Override // Z1.f
        public final void f3(double d12, int i12) {
            throw null;
        }

        @Override // Z1.f
        public final void g1(int i12, long j12) {
            throw null;
        }

        @Override // Z1.i
        public final long g4() {
            a(e.f54380l);
            throw null;
        }

        @Override // Z1.f
        public final void h4(int i12, @Y61.k String str) {
            throw null;
        }

        @Override // Z1.f
        public final void u4(int i12, @Y61.k byte[] bArr) {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
