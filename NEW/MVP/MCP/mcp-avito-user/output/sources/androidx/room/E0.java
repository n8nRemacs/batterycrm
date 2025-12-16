package androidx.room;

import Z1.e;
import android.database.Cursor;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RoomOpenHelper.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/E0;", "LZ1/e$a;", "a", "b", "c", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public class E0 extends e.a {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f54247f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public C f54248b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final b f54249c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f54250d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f54251e;

    /* compiled from: RoomOpenHelper.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/E0$a;", "", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/E0$c;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        public final boolean f54253a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final String f54254b;

        public c(boolean z12, @Y61.l String str) {
            this.f54253a = z12;
            this.f54254b = str;
        }
    }

    public E0(@Y61.k C c12, @Y61.k b bVar, @Y61.k String str, @Y61.k String str2) {
        super(bVar.f54252a);
        this.f54248b = c12;
        this.f54249c = bVar;
        this.f54250d = str;
        this.f54251e = str2;
    }

    @Override // Z1.e.a
    public final void b(@Y61.k androidx.sqlite.db.framework.b bVar) {
        f54247f.getClass();
        Cursor cursorR5 = bVar.R5("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            Cursor cursor = cursorR5;
            boolean z12 = false;
            if (cursor.moveToFirst()) {
                if (cursor.getInt(0) == 0) {
                    z12 = true;
                }
            }
            kotlin.io.c.a(cursorR5, null);
            b bVar2 = this.f54249c;
            bVar2.a(bVar);
            if (!z12) {
                c cVarF = bVar2.f(bVar);
                if (!cVarF.f54253a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarF.f54254b);
                }
            }
            f(bVar);
            bVar2.c();
        } finally {
        }
    }

    @Override // Z1.e.a
    public final void c(@Y61.k androidx.sqlite.db.framework.b bVar, int i12, int i13) {
        e(bVar, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    @Override // Z1.e.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(@Y61.k androidx.sqlite.db.framework.b r7) {
        /*
            r6 = this;
            androidx.room.E0$a r0 = androidx.room.E0.f54247f
            r0.getClass()
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r7.R5(r0)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            if (r2 == 0) goto L22
            int r1 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L22
            r1 = 1
            goto L23
        L1f:
            r7 = move-exception
            goto L98
        L22:
            r1 = r3
        L23:
            r2 = 0
            kotlin.io.c.a(r0, r2)
            androidx.room.E0$b r0 = r6.f54249c
            if (r1 == 0) goto L71
            Z1.b r1 = new Z1.b
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4, r2)
            android.database.Cursor r1 = r7.p1(r1)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r4 = r1
            android.database.Cursor r4 = (android.database.Cursor) r4     // Catch: java.lang.Throwable -> L46
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L48
            java.lang.String r3 = r4.getString(r3)     // Catch: java.lang.Throwable -> L46
            goto L49
        L46:
            r7 = move-exception
            goto L6b
        L48:
            r3 = r2
        L49:
            kotlin.io.c.a(r1, r2)
            java.lang.String r1 = r6.f54250d
            boolean r4 = r1.equals(r3)
            if (r4 != 0) goto L7c
            java.lang.String r4 = r6.f54251e
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L5d
            goto L7c
        L5d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r2 = ", found: "
            java.lang.String r0 = androidx.compose.ui.graphics.colorspace.e.n(r0, r1, r2, r3)
            r7.<init>(r0)
            throw r7
        L6b:
            throw r7     // Catch: java.lang.Throwable -> L6c
        L6c:
            r0 = move-exception
            kotlin.io.c.a(r1, r7)
            throw r0
        L71:
            androidx.room.E0$c r1 = r0.f(r7)
            boolean r3 = r1.f54253a
            if (r3 == 0) goto L82
            r6.f(r7)
        L7c:
            r0.d(r7)
            r6.f54248b = r2
            return
        L82:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.f54254b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L98:
            throw r7     // Catch: java.lang.Throwable -> L99
        L99:
            r1 = move-exception
            kotlin.io.c.a(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.E0.d(androidx.sqlite.db.framework.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x003b A[EDGE_INSN: B:72:0x003b->B:18:0x003b BREAK  A[LOOP:1: B:12:0x0025->B:75:?], SYNTHETIC] */
    @Override // Z1.e.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(@Y61.k androidx.sqlite.db.framework.b r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.E0.e(androidx.sqlite.db.framework.b, int, int):void");
    }

    public final void f(androidx.sqlite.db.framework.b bVar) {
        bVar.P4("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        int i12 = D0.f54246a;
        bVar.P4("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.f54250d + "')");
    }

    /* compiled from: RoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/E0$b;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        public final int f54252a;

        public b(int i12) {
            this.f54252a = i12;
        }

        public abstract void a(@Y61.k androidx.sqlite.db.framework.b bVar);

        public abstract void b(@Y61.k androidx.sqlite.db.framework.b bVar);

        public abstract void c();

        public abstract void d(@Y61.k androidx.sqlite.db.framework.b bVar);

        @Y61.k
        public c f(@Y61.k androidx.sqlite.db.framework.b bVar) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }

        public void e(@Y61.k androidx.sqlite.db.framework.b bVar) {
        }
    }
}
