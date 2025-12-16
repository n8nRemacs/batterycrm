package Fc1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import kotlin.text.C43047d;

/* renamed from: Fc1.o1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13688o1 {
    @Y61.k
    @SuppressLint({"HardwareIds"})
    public static final String a(@Y61.k Context context) throws NoSuchAlgorithmException {
        String str = Build.BOARD + Build.BRAND + Build.DEVICE + Build.DISPLAY + Build.HOST + Build.ID + Build.MANUFACTURER + Build.MODEL + Build.PRODUCT + Build.TAGS + Build.TYPE + Build.USER;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string == null) {
            string = "23oiugsdfnmb23";
        }
        String strQ = androidx.appcompat.app.r.q(str, string);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(strQ.getBytes(C43047d.f410589b));
        return UUID.nameUUIDFromBytes(messageDigest.digest()).toString();
    }
}
