package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Map;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class kp7 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Object b;

    static {
        Charset.forName("ISO-8859-1");
        b = new Object();
    }

    public static int a(Map map, int i, int i2, int i3) {
        int iM = hd3.m(i);
        int iJ = 0;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int iD = hd3.d(2, i3, value) + hd3.d(1, i2, key);
            iJ += hd3.j(iD) + iM + iD;
        }
        return iJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [fl9] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Serializable] */
    public static final Map b(gd3 gd3Var, Map map, tn8 tn8Var, int i, int i2, fl9 fl9Var, int i3, int i4) throws InvalidProtocolBufferNanoException {
        Map mapD = tn8Var.d(map);
        int iE = gd3Var.e(gd3Var.p());
        Serializable serializableC = null;
        while (true) {
            int iS = gd3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == i3) {
                serializableC = gd3Var.k(i);
            } else if (iS == i4) {
                if (i2 == 11) {
                    gd3Var.j(fl9Var);
                } else {
                    fl9Var = gd3Var.k(i2);
                }
            } else if (!gd3Var.u(iS)) {
                break;
            }
        }
        gd3Var.a(0);
        gd3Var.d(iE);
        if (serializableC == null) {
            serializableC = c(i);
        }
        if (fl9Var == 0) {
            fl9Var = c(i2);
        }
        mapD.put(serializableC, fl9Var);
        return mapD;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [byte[], java.io.Serializable] */
    public static Serializable c(int i) {
        switch (i) {
            case 1:
                return Double.valueOf(0.0d);
            case 2:
                return Float.valueOf(0.0f);
            case 3:
            case 4:
            case 6:
            case 16:
            case 18:
                return 0L;
            case 5:
            case 7:
            case 13:
            case Protos.Attaches.Attach.LOCATION /* 14 */:
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
            case LangUtils.HASH_SEED /* 17 */:
                return 0;
            case 8:
                return Boolean.FALSE;
            case 9:
                return "";
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException(wy1.e(i, "Type: ", " is not a primitive type."));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return coi.e;
        }
    }

    public static void d(hd3 hd3Var, Map map, int i, int i2, int i3) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int iD = hd3.d(2, i3, value) + hd3.d(1, i2, key);
            hd3Var.F(i, 2);
            hd3Var.C(iD);
            hd3Var.u(1, i2, key);
            hd3Var.u(2, i3, value);
        }
    }
}
