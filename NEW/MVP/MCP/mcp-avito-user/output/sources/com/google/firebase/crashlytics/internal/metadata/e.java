package com.google.firebase.crashlytics.internal.metadata;

import com.adjust.sdk.Constants;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.firebase.crashlytics.internal.common.C37586h;
import j.P;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mZ0.C44035b;
import org.json.JSONObject;

/* compiled from: MetaDataStore.java */
/* loaded from: classes4.dex */
class e {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f361038b = Charset.forName(Constants.ENCODING);

    /* renamed from: a, reason: collision with root package name */
    public final C44035b f361039a;

    public e(C44035b c44035b) {
        this.f361039a = c44035b;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static void d(File file) {
        if (file.exists() && file.delete()) {
            com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
            file.getAbsolutePath();
            dVar.a(4);
        }
    }

    public final Map<String, String> b(String str, boolean z12) throws Throwable {
        FileInputStream fileInputStream;
        C44035b c44035b = this.f361039a;
        File fileC = z12 ? c44035b.c(str, "internal-keys") : c44035b.c(str, "keys");
        if (!fileC.exists() || fileC.length() == 0) {
            d(fileC);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(fileC);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            HashMap mapA = a(C37586h.k(fileInputStream));
            C37586h.a(fileInputStream);
            return mapA;
        } catch (Exception unused2) {
            fileInputStream2 = fileInputStream;
            com.google.firebase.crashlytics.internal.d.f361031a.a(5);
            d(fileC);
            C37586h.a(fileInputStream2);
            return Collections.emptyMap();
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            C37586h.a(fileInputStream2);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    @P
    public final String c(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileC = this.f361039a.c(str, "user-data");
        boolean zExists = fileC.exists();
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        Closeable closeable = null;
        if (zExists) {
            ?? r02 = (fileC.length() > 0L ? 1 : (fileC.length() == 0L ? 0 : -1));
            try {
                if (r02 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileC);
                        try {
                            JSONObject jSONObject = new JSONObject(C37586h.k(fileInputStream));
                            String strOptString = !jSONObject.isNull(ChannelContext.Item.USER_ID) ? jSONObject.optString(ChannelContext.Item.USER_ID, null) : null;
                            dVar.a(3);
                            C37586h.a(fileInputStream);
                            return strOptString;
                        } catch (Exception unused) {
                            dVar.a(5);
                            d(fileC);
                            C37586h.a(fileInputStream);
                            return null;
                        }
                    } catch (Exception unused2) {
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        C37586h.a(closeable);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = r02;
            }
        }
        dVar.a(3);
        d(fileC);
        return null;
    }
}
