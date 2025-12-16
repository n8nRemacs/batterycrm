package B31;

import android.content.Context;
import android.provider.Settings;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.G0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f860a;

    /* renamed from: b, reason: collision with root package name */
    public String f861b;

    public f(Context context, d dVar) {
        this.f860a = context;
        String string = context.getSharedPreferences("clickstream_lite_prefs_device_id", 0).getString("deviceId", "");
        this.f861b = string != null ? string : "";
    }

    public final String a() throws NoSuchAlgorithmException {
        String string = Settings.System.getString(this.f860a.getContentResolver(), "android_id");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(string.getBytes(StandardCharsets.UTF_8));
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        for (byte b12 : bArrDigest) {
            sb2.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b12)}, 1)));
        }
        return C43066x.A0(new C43059p("[\\r\\n\\t]").f(sb2.toString(), "")).toString();
    }

    public final String b() {
        if (this.f861b.length() == 0) {
            synchronized (this) {
                try {
                    if (this.f861b.length() == 0) {
                        String strA = a();
                        this.f861b = strA;
                        this.f860a.getSharedPreferences("clickstream_lite_prefs_device_id", 0).edit().putString("deviceId", strA).apply();
                    }
                    G0 g02 = G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f861b;
    }
}
