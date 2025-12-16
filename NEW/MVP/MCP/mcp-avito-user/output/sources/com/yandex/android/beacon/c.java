package com.yandex.android.beacon;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;

/* compiled from: SendBeaconDb.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/android/beacon/c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "b", "c", "beacon_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class c extends SQLiteOpenHelper {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String[] f367217b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final InterfaceC10852c f367218c;

    /* compiled from: SendBeaconDb.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a implements InterfaceC10852c, D {

        /* renamed from: b, reason: collision with root package name */
        public static final a f367219b = new a();

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC10852c) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(2, c.class, "<init>", "<init>(Landroid/content/Context;Ljava/lang/String;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: SendBeaconDb.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/yandex/android/beacon/c$b;", "", "<init>", "()V", "", "ADD_PAYLOAD_COLUMN_TO_ITEM", "Ljava/lang/String;", "COLUMN_ADD_TIMESTAMP", "COLUMN_HEADERS", "COLUMN_ID", "COLUMN_PAYLOAD", "COLUMN_URL", "DATABASE_CREATE", "", "DATABASE_INIT_VERSION", "I", "DATABASE_VERSION", "", "QUERY_COLUMNS", "[Ljava/lang/String;", "REMOVE_CLAUSE", "TABLE_ITEMS", "beacon_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: SendBeaconDb.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/yandex/android/beacon/c$c;", "", "beacon_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.android.beacon.c$c, reason: collision with other inner class name */
    public interface InterfaceC10852c {
    }

    static {
        new b(null);
        f367217b = new String[]{"_id", ContextActionHandler.Link.URL, "headers", "add_timestamp", "payload"};
        f367218c = a.f367219b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.android.beacon.a.b a(android.database.Cursor r11) {
        /*
            r0 = 0
            com.yandex.android.beacon.a$b r9 = new com.yandex.android.beacon.a$b
            r1 = 1
            java.lang.String r2 = r11.getString(r1)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r3 = 2
            java.lang.String r3 = r11.getString(r3)
            if (r3 != 0) goto L19
            java.util.Map r1 = kotlin.collections.P0.c()
        L17:
            r3 = r1
            goto L6c
        L19:
            char[] r4 = new char[r1]
            r4[r0] = r0
            java.util.List r3 = kotlin.text.C43066x.e0(r3, r4)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L2c
            java.util.Map r1 = kotlin.collections.P0.c()
            goto L17
        L2c:
            androidx.collection.a r4 = new androidx.collection.a
            int r5 = r3.size()
            r4.<init>(r5)
            int r5 = r3.size()
            r6 = r0
        L3a:
            if (r6 >= r5) goto L6b
            int r7 = r6 + 1
            java.lang.Object r6 = r3.get(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            char[] r8 = new char[r1]
            r10 = 9
            r8[r0] = r10
            java.util.List r6 = kotlin.text.C43066x.e0(r6, r8)
            int r8 = r6.size()
            if (r8 != r1) goto L5e
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r8 = ""
            r4.put(r6, r8)
            goto L69
        L5e:
            java.lang.Object r8 = r6.get(r0)
            java.lang.Object r6 = r6.get(r1)
            r4.put(r8, r6)
        L69:
            r6 = r7
            goto L3a
        L6b:
            r3 = r4
        L6c:
            r1 = 4
            boolean r4 = r11.isNull(r1)
            r5 = 0
            if (r4 == 0) goto L76
            r1 = r5
            goto L7a
        L76:
            java.lang.String r1 = r11.getString(r1)
        L7a:
            if (r1 != 0) goto L7e
        L7c:
            r4 = r5
            goto L92
        L7e:
            int r4 = r1.length()
            if (r4 <= 0) goto L7c
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8b
            r4.<init>(r1)     // Catch: org.json.JSONException -> L8b
            r5 = r4
            goto L7c
        L8b:
            r1 = move-exception
            java.lang.String r4 = "Payload parsing exception: "
            kotlin.jvm.internal.L.j(r1, r4)
            goto L7c
        L92:
            r1 = 3
            long r5 = r11.getLong(r1)
            long r7 = r11.getLong(r0)
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.android.beacon.c.a(android.database.Cursor):com.yandex.android.beacon.a$b");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(@Y61.k SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("\n            CREATE TABLE items(\n            _id INTEGER PRIMARY KEY AUTOINCREMENT,\n            url TEXT NOT NULL,\n            headers TEXT,\n            add_timestamp INTEGER, \n            payload TEXT)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(@Y61.k SQLiteDatabase sQLiteDatabase, int i12, int i13) throws SQLException {
        if (i12 == 1) {
            sQLiteDatabase.execSQL("\n            ALTER TABLE items ADD COLUMN payload TEXT;\n        ");
        }
    }
}
