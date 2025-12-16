package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class e2h {
    public static final HashMap a;
    public static final f9g b;

    static {
        HashMap map = new HashMap();
        a = map;
        b = f9g.a;
        HashMap map2 = new HashMap();
        cc0 cc0Var = cc0.d;
        map2.put(1, cc0Var);
        cc0 cc0Var2 = cc0.f;
        map2.put(2, cc0Var2);
        cc0 cc0Var3 = cc0.g;
        map2.put(4096, cc0Var3);
        map2.put(8192, cc0Var3);
        HashMap map3 = new HashMap();
        map3.put(1, cc0Var);
        map3.put(2, cc0Var2);
        map3.put(4096, cc0Var3);
        map3.put(8192, cc0Var3);
        HashMap map4 = new HashMap();
        map4.put(1, cc0Var);
        map4.put(4, cc0Var2);
        map4.put(4096, cc0Var3);
        map4.put(16384, cc0Var3);
        map4.put(2, cc0Var);
        map4.put(8, cc0Var2);
        map4.put(8192, cc0Var3);
        map4.put(32768, cc0Var3);
        HashMap map5 = new HashMap();
        map5.put(256, cc0Var2);
        map5.put(512, cc0.e);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    public static cc0 a(int i, String str) {
        cc0 cc0Var;
        Map map = (Map) a.get(str);
        if (map != null && (cc0Var = (cc0) map.get(Integer.valueOf(i))) != null) {
            return cc0Var;
        }
        gri.i("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i)));
        return cc0.d;
    }

    public static dc0 b(sa0 sa0Var, u75 u75Var, gc0 gc0Var) {
        boolean zB = u75Var.b();
        int i = u75Var.a;
        z5j.f("Dynamic range must be a fully specified dynamic range [provided dynamic range: " + u75Var + "]", zB);
        int i2 = sa0Var.c;
        String str = "video/avc";
        String str2 = i2 != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        if (gc0Var == null) {
            z90Var = null;
        } else {
            Set set = (Set) x75.b.get(Integer.valueOf(i));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) x75.a.get(Integer.valueOf(u75Var.b));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            for (z90 z90Var : gc0Var.d) {
                if (set.contains(Integer.valueOf(z90Var.j)) && set2.contains(Integer.valueOf(z90Var.h))) {
                    String str3 = z90Var.b;
                    if (str2.equals(str3)) {
                        gri.a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + str2 + "]");
                    } else if (i2 == -1) {
                        gri.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + str2 + ", dynamic range: " + u75Var + "]");
                    }
                    str2 = str3;
                    break;
                }
            }
            z90Var = null;
        }
        if (z90Var == null) {
            if (i2 == -1) {
                if (i != 1) {
                    if (i == 3 || i == 4 || i == 5) {
                        str = "video/hevc";
                    } else {
                        if (i != 6) {
                            throw new UnsupportedOperationException("Unsupported dynamic range: " + u75Var + "\nNo supported default mime type available.");
                        }
                        str = "video/dolby-vision";
                    }
                }
                str2 = str;
            }
            if (gc0Var == null) {
                gri.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + u75Var + "]");
            } else {
                gri.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + u75Var + "]");
            }
        }
        if (str2 != null) {
            return new dc0(str2, -1, z90Var != null ? z90Var : null);
        }
        throw new NullPointerException("Null mimeType");
    }

    public static int c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Range range) {
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        int iDoubleValue = (int) (new Rational(i8, i9).doubleValue() * new Rational(i6, i7).doubleValue() * rational2.doubleValue() * rational.doubleValue() * i);
        String strConcat = gri.d(3, "VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(iDoubleValue)) : "";
        if (!fc0.f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            int iIntValue = num.intValue();
            if (gri.d(3, "VideoConfigUtil")) {
                strConcat = strConcat.concat(String.format("\nClamped to range %s -> %dbps", range, num));
            }
            iDoubleValue = iIntValue;
        }
        gri.a("VideoConfigUtil", strConcat);
        return iDoubleValue;
    }

    public static bc0 d(z90 z90Var) {
        j35 j35VarD = bc0.d();
        String str = z90Var.b;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        j35VarD.b = str;
        j35VarD.c = Integer.valueOf(z90Var.g);
        j35VarD.o = new Size(z90Var.e, z90Var.f);
        j35VarD.Z = Integer.valueOf(z90Var.d);
        j35VarD.t0 = Integer.valueOf(z90Var.c);
        f9g f9gVar = b;
        if (f9gVar == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        j35VarD.d = f9gVar;
        return j35VarD.g();
    }
}
