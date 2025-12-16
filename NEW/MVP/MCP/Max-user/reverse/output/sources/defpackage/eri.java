package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class eri {
    public static Drawable a(Context context, int i) {
        return eod.b().d(context, i);
    }

    public static final String b(List list, final boolean z, final boolean z2) {
        return !z ? String.valueOf(list.size()) : ue3.N(list, ",", "[", "]", new em6() { // from class: ug8
            @Override // defpackage.em6
            public final Object invoke(Object obj) {
                return eri.f(obj, z, z2);
            }
        }, 24);
    }

    public static final String c(Map map, boolean z, boolean z2) {
        if (!z) {
            return String.valueOf(map.size());
        }
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            sb.append(String.valueOf(key));
            sb.append('=');
            sb.append(f(value, z, z2));
            sb.append(',');
        }
        sb.append('}');
        return sb.toString();
    }

    public static sy9 d(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = xxg.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                Log.w("VorbisUtil", str.length() != 0 ? "Failed to parse Vorbis comment: ".concat(str) : new String("Failed to parse Vorbis comment: "));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(kzb.a(new qyg(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    pai.e("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new gjh(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new sy9(arrayList);
    }

    public static kme e(qyg qygVar, boolean z, boolean z2) throws ParserException {
        if (z) {
            g(3, qygVar, false);
        }
        qygVar.q((int) qygVar.j(), mb2.c);
        long j = qygVar.j();
        String[] strArr = new String[(int) j];
        for (int i = 0; i < j; i++) {
            strArr[i] = qygVar.q((int) qygVar.j(), mb2.c);
        }
        if (z2 && (qygVar.s() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new kme(8, strArr);
    }

    public static final String f(Object obj, boolean z, boolean z2) {
        return obj == null ? "null" : obj instanceof wg8 ? ((wg8) obj).getClass().getName().concat(".NULL") : obj instanceof xg8 ? ((xg8) obj).a(z, z2) : obj.toString();
    }

    public static boolean g(int i, qyg qygVar, boolean z) throws ParserException {
        if (qygVar.c() < 7) {
            if (z) {
                return false;
            }
            int iC = qygVar.c();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(iC);
            throw ParserException.a(null, sb.toString());
        }
        if (qygVar.s() != i) {
            if (z) {
                return false;
            }
            String strValueOf = String.valueOf(Integer.toHexString(i));
            throw ParserException.a(null, strValueOf.length() != 0 ? "expected header type ".concat(strValueOf) : new String("expected header type "));
        }
        if (qygVar.s() == 118 && qygVar.s() == 111 && qygVar.s() == 114 && qygVar.s() == 98 && qygVar.s() == 105 && qygVar.s() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }
}
