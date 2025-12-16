package com.google.firebase.installations.local;

import com.adjust.sdk.Constants;
import com.google.firebase.g;
import com.google.firebase.installations.local.a;
import j.N;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.internal.http2.Http2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class PersistedInstallation {

    /* renamed from: a, reason: collision with root package name */
    public File f361656a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final g f361657b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RegistrationStatus {

        /* renamed from: b, reason: collision with root package name */
        public static final RegistrationStatus f361658b;

        /* renamed from: c, reason: collision with root package name */
        public static final RegistrationStatus f361659c;

        /* renamed from: d, reason: collision with root package name */
        public static final RegistrationStatus f361660d;

        /* renamed from: e, reason: collision with root package name */
        public static final RegistrationStatus f361661e;

        /* renamed from: f, reason: collision with root package name */
        public static final RegistrationStatus f361662f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ RegistrationStatus[] f361663g;

        static {
            RegistrationStatus registrationStatus = new RegistrationStatus("ATTEMPT_MIGRATION", 0);
            f361658b = registrationStatus;
            RegistrationStatus registrationStatus2 = new RegistrationStatus("NOT_GENERATED", 1);
            f361659c = registrationStatus2;
            RegistrationStatus registrationStatus3 = new RegistrationStatus("UNREGISTERED", 2);
            f361660d = registrationStatus3;
            RegistrationStatus registrationStatus4 = new RegistrationStatus("REGISTERED", 3);
            f361661e = registrationStatus4;
            RegistrationStatus registrationStatus5 = new RegistrationStatus("REGISTER_ERROR", 4);
            f361662f = registrationStatus5;
            f361663g = new RegistrationStatus[]{registrationStatus, registrationStatus2, registrationStatus3, registrationStatus4, registrationStatus5};
        }

        public RegistrationStatus() {
            throw null;
        }

        public static RegistrationStatus valueOf(String str) {
            return (RegistrationStatus) Enum.valueOf(RegistrationStatus.class, str);
        }

        public static RegistrationStatus[] values() {
            return (RegistrationStatus[]) f361663g.clone();
        }
    }

    public PersistedInstallation(@N g gVar) {
        this.f361657b = gVar;
    }

    public final File a() {
        if (this.f361656a == null) {
            synchronized (this) {
                try {
                    if (this.f361656a == null) {
                        g gVar = this.f361657b;
                        gVar.a();
                        this.f361656a = new File(gVar.f361595a.getFilesDir(), "PersistedInstallation." + this.f361657b.d() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f361656a;
    }

    @N
    public final void b(@N c cVar) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", cVar.c());
            jSONObject.put("Status", cVar.f().ordinal());
            jSONObject.put("AuthToken", cVar.a());
            jSONObject.put("RefreshToken", cVar.e());
            jSONObject.put("TokenCreationEpochInSecs", cVar.g());
            jSONObject.put("ExpiresInSecs", cVar.b());
            jSONObject.put("FisError", cVar.d());
            g gVar = this.f361657b;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f361595a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(Constants.ENCODING));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @N
    public final c c() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i12 = fileInputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                    if (i12 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i12);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i13 = c.f361681a;
        a.b bVar = new a.b();
        bVar.f361676f = 0L;
        bVar.f361672b = RegistrationStatus.f361658b;
        bVar.f361675e = 0L;
        bVar.f361671a = strOptString;
        bVar.f(RegistrationStatus.values()[iOptInt]);
        bVar.f361673c = strOptString2;
        bVar.f361674d = strOptString3;
        bVar.g(jOptLong);
        bVar.c(jOptLong2);
        bVar.f361677g = strOptString4;
        return bVar.a();
    }
}
