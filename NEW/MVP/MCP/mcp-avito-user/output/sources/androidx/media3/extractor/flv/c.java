package androidx.media3.extractor.flv;

import androidx.media3.common.util.z;
import androidx.media3.extractor.C23196o;
import j.P;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: ScriptTagPayloadReader.java */
/* loaded from: classes.dex */
final class c extends TagPayloadReader {

    /* renamed from: b, reason: collision with root package name */
    public long f50558b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f50559c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f50560d;

    public c() {
        super(new C23196o());
        this.f50558b = -9223372036854775807L;
        this.f50559c = new long[0];
        this.f50560d = new long[0];
    }

    @P
    public static Serializable a(int i12, z zVar) {
        if (i12 == 0) {
            return Double.valueOf(Double.longBitsToDouble(zVar.o()));
        }
        if (i12 == 1) {
            return Boolean.valueOf(zVar.u() == 1);
        }
        if (i12 == 2) {
            return c(zVar);
        }
        if (i12 != 3) {
            if (i12 == 8) {
                return b(zVar);
            }
            if (i12 != 10) {
                if (i12 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(zVar.o()));
                zVar.G(2);
                return date;
            }
            int iX2 = zVar.x();
            ArrayList arrayList = new ArrayList(iX2);
            for (int i13 = 0; i13 < iX2; i13++) {
                Serializable serializableA = a(zVar.u(), zVar);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strC = c(zVar);
            int iU2 = zVar.u();
            if (iU2 == 9) {
                return map;
            }
            Serializable serializableA2 = a(iU2, zVar);
            if (serializableA2 != null) {
                map.put(strC, serializableA2);
            }
        }
    }

    public static HashMap<String, Object> b(z zVar) {
        int iX2 = zVar.x();
        HashMap<String, Object> map = new HashMap<>(iX2);
        for (int i12 = 0; i12 < iX2; i12++) {
            String strC = c(zVar);
            Serializable serializableA = a(zVar.u(), zVar);
            if (serializableA != null) {
                map.put(strC, serializableA);
            }
        }
        return map;
    }

    public static String c(z zVar) {
        int iZ2 = zVar.z();
        int i12 = zVar.f47963b;
        zVar.G(iZ2);
        return new String(zVar.f47962a, i12, iZ2);
    }
}
