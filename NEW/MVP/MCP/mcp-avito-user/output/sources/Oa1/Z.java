package Oa1;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.text.C43047d;
import kotlin.text.C43066x;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Z extends SQLiteOpenHelper {

    /* renamed from: b, reason: collision with root package name */
    public final C14644c f12349b;

    public Z(Context context, C14644c c14644c) {
        super(context, "MetricsEvent.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.f12349b = c14644c;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS metrics_event_table (\n    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n    uuid VARCHAR(36),\n    metrics_event BLOB);\n\nCREATE INDEX IF NOT EXISTS uuid_index\n    ON metrics_event_table(uuid)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i12, int i13) throws JSONException, SQLException {
        if (i12 == 1 && i13 == 2 && sQLiteDatabase != null) {
            this.f12349b.getClass();
            ArrayList arrayList = new ArrayList();
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("\n                SELECT * FROM metrics_event_table\n                ", new String[0]);
            try {
                int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow("uuid");
                int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("metrics_event");
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(i0.a(cursorRawQuery.getString(columnIndexOrThrow), C43066x.v(cursorRawQuery.getBlob(columnIndexOrThrow2))));
                }
                G0 g02 = G0.f406611a;
                kotlin.io.c.a(cursorRawQuery, null);
                if (arrayList.isEmpty()) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder("\n                UPDATE metrics_event_table\n                SET metrics_event = CASE\n             ");
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    h0 h0Var = (h0) it.next();
                    k0 k0Var = new k0(System.currentTimeMillis(), h0Var.f12366a, h0Var.f12367b, h0Var.f12368c);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", h0Var.f12367b);
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, String> entry : h0Var.f12368c.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                    jSONObject.put("data", jSONObject2);
                    String strN = C42756l.N(jSONObject.toString(0).getBytes(C43047d.f410589b), F.f12331l);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("name", k0Var.f12373b);
                    JSONObject jSONObject4 = new JSONObject();
                    for (Map.Entry<String, String> entry2 : k0Var.f12374c.entrySet()) {
                        jSONObject4.put(entry2.getKey(), entry2.getValue());
                    }
                    jSONObject3.put("data", jSONObject4);
                    jSONObject3.put(CrashHianalyticsData.TIME, k0Var.f12375d);
                    String strA = androidx.camera.core.Q.a("\n                WHEN metrics_event = x'", strN, "' THEN x'", C42756l.N(jSONObject3.toString(0).getBytes(C43047d.f410589b), F.f12331l), "'\n            ");
                    arrayList2.add(h0Var.f12366a);
                    sb2.append(strA);
                }
                sb2.append("\n                END\n                WHERE uuid IN (" + C42745f0.O(arrayList2, null, null, null, C14643b.f12351l, 31) + ")\n            ");
                sQLiteDatabase.execSQL(C43066x.E0(sb2.toString()));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(cursorRawQuery, th2);
                    throw th3;
                }
            }
        }
    }
}
