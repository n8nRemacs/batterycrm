package x01;

import android.util.Pair;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;

/* renamed from: x01.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49728m {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f442047a = Charset.forName(Constants.ENCODING);

    public static String a(String str, String str2) {
        Pair pair;
        if (str == null || str.length() < 32) {
            pair = new Pair(new byte[0], str);
        } else {
            String strSubstring = str.substring(0, 32);
            pair = new Pair(S01.c.b(strSubstring), str.substring(32));
        }
        return new String(N01.a.b(S01.c.b((String) pair.second), S01.c.b(str2), (byte[]) pair.first), f442047a);
    }
}
