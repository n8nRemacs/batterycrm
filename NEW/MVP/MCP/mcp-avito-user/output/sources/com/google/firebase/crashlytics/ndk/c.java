package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.firebase.crashlytics.internal.common.C37586h;
import com.google.firebase.crashlytics.internal.model.C;
import j.P;
import j.X;
import j.k0;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Base64;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import mZ0.C44035b;
import org.json.JSONObject;

/* compiled from: CrashpadController.java */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f361493d = Charset.forName(Constants.ENCODING);

    /* renamed from: a, reason: collision with root package name */
    public final Context f361494a;

    /* renamed from: b, reason: collision with root package name */
    public final JniNativeApi f361495b;

    /* renamed from: c, reason: collision with root package name */
    public final C44035b f361496c;

    public c(Context context, JniNativeApi jniNativeApi, C44035b c44035b) {
        this.f361494a = context;
        this.f361495b = jniNativeApi;
        this.f361496c = c44035b;
    }

    @k0
    @X
    public static String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i12 = inputStream.read(bArr);
            if (i12 == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    try {
                        gZIPOutputStream.write(byteArray);
                        gZIPOutputStream.finish();
                        String strEncodeToString = Base64.getEncoder().encodeToString(byteArrayOutputStream2.toByteArray());
                        gZIPOutputStream.close();
                        byteArrayOutputStream2.close();
                        return strEncodeToString;
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            byteArrayOutputStream.write(bArr, 0, i12);
        }
    }

    @P
    public static File c(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    public static void g(C44035b c44035b, String str, String str2, String str3) throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th2;
        File file = new File(c44035b.b(str), str3);
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f361493d));
            try {
                bufferedWriter.write(str2);
                file.toString();
                C37586h.a(bufferedWriter);
            } catch (IOException unused) {
                bufferedWriter2 = bufferedWriter;
                file.toString();
                C37586h.a(bufferedWriter2);
            } catch (Throwable th3) {
                th2 = th3;
                file.toString();
                C37586h.a(bufferedWriter);
                throw th2;
            }
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            bufferedWriter = null;
            th2 = th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.firebase.crashlytics.ndk.i b(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.ndk.c.b(java.lang.String):com.google.firebase.crashlytics.ndk.i");
    }

    public final void d(long j12, String str) throws Throwable {
        HashMap map = new HashMap();
        map.put("session_id", str);
        map.put("generator", "Crashlytics Android SDK/18.3.7");
        map.put("started_at_seconds", Long.valueOf(j12));
        g(this.f361496c, str, new JSONObject(map).toString(), "session.json");
    }

    public final void e(String str, C.a aVar) throws Throwable {
        String strA = aVar.a();
        String strF = aVar.f();
        String strG = aVar.g();
        String strE = aVar.e();
        int iC2 = aVar.c();
        String strA2 = aVar.d().a();
        String strB = aVar.d().b();
        HashMap map = new HashMap();
        map.put("app_identifier", strA);
        map.put("version_code", strF);
        map.put("version_name", strG);
        map.put("install_uuid", strE);
        map.put("delivery_mechanism", Integer.valueOf(iC2));
        if (strA2 == null) {
            strA2 = "";
        }
        map.put("development_platform", strA2);
        if (strB == null) {
            strB = "";
        }
        map.put("development_platform_version", strB);
        g(this.f361496c, str, new JSONObject(map).toString(), "app.json");
    }

    public final void f(String str, C.b bVar) throws Throwable {
        int iA2 = bVar.a();
        String strG = bVar.g();
        int iB2 = bVar.b();
        long j12 = bVar.j();
        long jD2 = bVar.d();
        boolean zE2 = bVar.e();
        int i12 = bVar.i();
        String strF = bVar.f();
        String strH = bVar.h();
        HashMap map = new HashMap();
        map.put("arch", Integer.valueOf(iA2));
        map.put("build_model", strG);
        map.put("available_processors", Integer.valueOf(iB2));
        map.put("total_ram", Long.valueOf(j12));
        map.put("disk_space", Long.valueOf(jD2));
        map.put("is_emulator", Boolean.valueOf(zE2));
        map.put(VoiceInfo.STATE, Integer.valueOf(i12));
        map.put("build_manufacturer", strF);
        map.put("build_product", strH);
        g(this.f361496c, str, new JSONObject(map).toString(), "device.json");
    }

    public final void h(String str, C.c cVar) throws Throwable {
        String strD = cVar.d();
        String strC = cVar.c();
        boolean zB2 = cVar.b();
        HashMap map = new HashMap();
        map.put("version", strD);
        map.put("build_version", strC);
        map.put("is_rooted", Boolean.valueOf(zB2));
        g(this.f361496c, str, new JSONObject(map).toString(), "os.json");
    }
}
