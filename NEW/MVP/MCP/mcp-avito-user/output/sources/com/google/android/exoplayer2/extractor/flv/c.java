package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.i;
import com.google.android.exoplayer2.util.F;
import j.P;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: ScriptTagPayloadReader.java */
/* loaded from: classes6.dex */
final class c extends TagPayloadReader {

    /* renamed from: b, reason: collision with root package name */
    public long f344537b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f344538c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f344539d;

    public c() {
        super(new i());
        this.f344537b = -9223372036854775807L;
        this.f344538c = new long[0];
        this.f344539d = new long[0];
    }

    @P
    public static Serializable a(int i12, F f12) {
        if (i12 == 0) {
            return Double.valueOf(Double.longBitsToDouble(f12.l()));
        }
        if (i12 == 1) {
            return Boolean.valueOf(f12.r() == 1);
        }
        if (i12 == 2) {
            return c(f12);
        }
        if (i12 != 3) {
            if (i12 == 8) {
                return b(f12);
            }
            if (i12 != 10) {
                if (i12 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(f12.l()));
                f12.C(2);
                return date;
            }
            int iU2 = f12.u();
            ArrayList arrayList = new ArrayList(iU2);
            for (int i13 = 0; i13 < iU2; i13++) {
                Serializable serializableA = a(f12.r(), f12);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strC = c(f12);
            int iR2 = f12.r();
            if (iR2 == 9) {
                return map;
            }
            Serializable serializableA2 = a(iR2, f12);
            if (serializableA2 != null) {
                map.put(strC, serializableA2);
            }
        }
    }

    public static HashMap<String, Object> b(F f12) {
        int iU2 = f12.u();
        HashMap<String, Object> map = new HashMap<>(iU2);
        for (int i12 = 0; i12 < iU2; i12++) {
            String strC = c(f12);
            Serializable serializableA = a(f12.r(), f12);
            if (serializableA != null) {
                map.put(strC, serializableA);
            }
        }
        return map;
    }

    public static String c(F f12) {
        int iW2 = f12.w();
        int i12 = f12.f348071b;
        f12.C(iW2);
        return new String(f12.f348070a, i12, iW2);
    }
}
