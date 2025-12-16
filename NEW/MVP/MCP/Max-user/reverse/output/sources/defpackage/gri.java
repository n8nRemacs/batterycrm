package defpackage;

import android.util.Base64;
import android.util.Log;
import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class gri {
    public static int a = 3;

    public static void a(String str, String str2) {
        if (d(3, str)) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (d(6, str)) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (d(6, str)) {
            Log.e(str, str2, th);
        }
    }

    public static boolean d(int i, String str) {
        return a <= i || Log.isLoggable(str, i);
    }

    public static ty9 e(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = zxg.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                a8i.l("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(lzb.b(new umb(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    a8i.m("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new hjh(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ty9(arrayList);
    }

    public static znd f(umb umbVar, boolean z, boolean z2) throws ParserException {
        if (z) {
            h(3, umbVar, false);
        }
        umbVar.v((int) umbVar.o(), StandardCharsets.UTF_8);
        long jO = umbVar.o();
        String[] strArr = new String[(int) jO];
        for (int i = 0; i < jO; i++) {
            strArr[i] = umbVar.v((int) umbVar.o(), StandardCharsets.UTF_8);
        }
        if (z2 && (umbVar.x() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new znd(strArr);
    }

    public static final void g(esg esgVar) {
        esgVar.d(439, new y5(6));
        esgVar.d(515, new y5(7));
        esgVar.d(516, new y5(8));
        esgVar.d(517, new y5(9));
        esgVar.d(518, new y5(10));
        esgVar.d(519, new y5(11));
        esgVar.d(520, new em(1));
        esgVar.d(521, new y5(12));
        esgVar.d(522, new y5(13));
        esgVar.d(514, new y5(14));
        esgVar.d(523, new em(2));
        esgVar.d(524, new em(3));
        esgVar.d(525, new em(4));
        esgVar.d(526, new em(5));
        esgVar.b(2, new e(1));
        esgVar.b(2, new e(2));
        esgVar.b(2, new e(3));
        esgVar.d(513, new em(6));
        esgVar.d(527, new em(7));
        esgVar.d(528, new em(8));
        esgVar.d(529, new em(9));
        esgVar.b(2, new e(4));
        esgVar.b(2, new e(5));
        esgVar.b(2, new e(6));
        esgVar.b(2, new e(7));
    }

    public static boolean h(int i, umb umbVar, boolean z) throws ParserException {
        if (umbVar.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "too short header: " + umbVar.a());
        }
        if (umbVar.x() != i) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "expected header type " + Integer.toHexString(i));
        }
        if (umbVar.x() == 118 && umbVar.x() == 111 && umbVar.x() == 114 && umbVar.x() == 98 && umbVar.x() == 105 && umbVar.x() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }

    public static void i(String str, String str2) {
        if (d(5, str)) {
            Log.w(str, str2);
        }
    }

    public static void j(String str, String str2, Throwable th) {
        if (d(5, str)) {
            Log.w(str, str2, th);
        }
    }
}
