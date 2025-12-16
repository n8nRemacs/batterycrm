package Oa1;

import Oa1.AbstractC14665y;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.text.C43047d;
import kotlin.text.C43066x;
import org.json.JSONException;
import org.json.JSONObject;
import ru.rustore.sdk.metrics.MetricsException;

/* renamed from: Oa1.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14662v {

    /* renamed from: a, reason: collision with root package name */
    public final C14658q f12392a;

    /* renamed from: b, reason: collision with root package name */
    public final C14661u f12393b;

    public C14662v(C14658q c14658q, C14661u c14661u) {
        this.f12392a = c14658q;
        this.f12393b = c14661u;
    }

    public final AbstractC14665y a() throws JSONException {
        String str;
        HttpsURLConnection httpsURLConnectionB;
        String strA;
        String string;
        C14653l c14653l = this.f12392a.f12381a;
        String strE0 = C43066x.E0("\n            SELECT * FROM metrics_event_table\n            LIMIT 10\n        ");
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = ((SQLiteDatabase) c14653l.f12377b.getValue()).rawQuery(strE0, new String[0]);
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow("uuid");
            int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("metrics_event");
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(new C14654m(cursorRawQuery.getString(columnIndexOrThrow), cursorRawQuery.getBlob(columnIndexOrThrow2)));
            }
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(cursorRawQuery, null);
            List<C14654m> listM0 = C42745f0.M0(arrayList);
            new C14650i(listM0);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listM0, 10));
            for (C14654m c14654m : listM0) {
                String str2 = c14654m.f12378a;
                JSONObject jSONObject = new JSONObject(C43066x.v(c14654m.f12379b));
                String string2 = jSONObject.getString("name");
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                ArrayList arrayList3 = new ArrayList();
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList3.add(new kotlin.Q(next, jSONObject2.get(next).toString()));
                }
                arrayList2.add(new C14646e(str2, new Na1.c(string2, P0.p(arrayList3), jSONObject.getLong(CrashHianalyticsData.TIME))));
            }
            if (arrayList2.isEmpty()) {
                return AbstractC14665y.a.f12398a;
            }
            C14661u c14661u = this.f12393b;
            String packageName = c14661u.f12389b.f12356a.getPackageName();
            G g12 = c14661u.f12388a;
            String string3 = g12.f12333a.f12327a.getString("USER_ID_KEY", null);
            if (string3 == null) {
                string3 = null;
            }
            if (string3 == null) {
                synchronized (G.f12332b) {
                    string = g12.f12333a.f12327a.getString("USER_ID_KEY", null);
                    if (string == null) {
                        string = null;
                    }
                    if (string == null) {
                        string = UUID.randomUUID().toString();
                        SharedPreferences.Editor editorEdit = g12.f12333a.f12327a.edit();
                        editorEdit.putString("USER_ID_KEY", string);
                        editorEdit.apply();
                    }
                }
                str = string;
            } else {
                str = string3;
            }
            K k12 = (K) c14661u.f12391d.f12337b.getValue();
            String str3 = k12 != null ? k12.f12335a : null;
            ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C14646e c14646e = (C14646e) it.next();
                arrayList4.add(new C14659s(packageName, c14646e.f12358a, str, str3, c14646e.f12359b));
            }
            e0 e0Var = c14661u.f12390c.f12382a;
            try {
                strA = e0Var.a(arrayList4);
                try {
                    httpsURLConnectionB = e0Var.b();
                    OutputStream outputStream = httpsURLConnectionB.getOutputStream();
                    try {
                        outputStream.write(strA.getBytes(C43047d.f410589b));
                        outputStream.flush();
                        G0 g03 = G0.f406611a;
                        kotlin.io.c.a(outputStream, null);
                    } finally {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpsURLConnectionB = null;
                    try {
                        new c0(th);
                        throw new MetricsException.NetworkError("Http request was failed", th, null);
                    } catch (Throwable th3) {
                        if (httpsURLConnectionB != null) {
                            httpsURLConnectionB.disconnect();
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                new b0(httpsURLConnectionB.getURL(), httpsURLConnectionB.getResponseCode(), strA);
                httpsURLConnectionB.disconnect();
                return new AbstractC14665y.b(arrayList2);
            } catch (Throwable th5) {
                th = th5;
                new c0(th);
                throw new MetricsException.NetworkError("Http request was failed", th, null);
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                kotlin.io.c.a(cursorRawQuery, th6);
                throw th7;
            }
        }
    }
}
