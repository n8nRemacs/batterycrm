package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: EnumResolver.java */
/* loaded from: classes4.dex */
public class j implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Class<Enum<?>> f342612b;

    /* renamed from: c, reason: collision with root package name */
    public final Enum<?>[] f342613c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<String, Enum<?>> f342614d;

    /* renamed from: e, reason: collision with root package name */
    public final Enum<?> f342615e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f342616f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f342617g;

    public j(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> map, Enum<?> r42, boolean z12, boolean z13) {
        this.f342612b = cls;
        this.f342613c = enumArr;
        this.f342614d = map;
        this.f342615e = r42;
        this.f342616f = z12;
        this.f342617g = z13;
    }

    public static Enum<?>[] a(Class<?> cls) {
        Enum<?>[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            return enumArr;
        }
        throw new IllegalArgumentException("No enum constants for class ".concat(cls.getName()));
    }

    public static j c(com.fasterxml.jackson.databind.e eVar, Class<?> cls) {
        AnnotationIntrospector annotationIntrospectorD = eVar.d();
        boolean zK2 = eVar.k(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum<?>[] enumArrA = a(cls);
        HashMap map = new HashMap();
        String[][] strArr = new String[enumArrA.length][];
        if (annotationIntrospectorD != null) {
            annotationIntrospectorD.l(cls, enumArrA, strArr);
        }
        int length = enumArrA.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum<?> r22 = enumArrA[length];
            map.put(r22.toString(), r22);
            String[] strArr2 = strArr[length];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    if (!map.containsKey(str)) {
                        map.put(str, r22);
                    }
                }
            }
        }
        return new j(cls, enumArrA, map, annotationIntrospectorD != null ? annotationIntrospectorD.g(cls) : null, zK2, false);
    }

    public final h b() {
        int i12;
        HashMap<String, Enum<?>> map = this.f342614d;
        if (map.isEmpty()) {
            return h.f342608e;
        }
        int size = map.size();
        if (size <= 5) {
            i12 = 8;
        } else if (size <= 12) {
            i12 = 16;
        } else {
            int i13 = 32;
            while (i13 < size + (size >> 2)) {
                i13 += i13;
            }
            i12 = i13;
        }
        int i14 = i12 - 1;
        int i15 = (i12 >> 1) + i12;
        Object[] objArrCopyOf = new Object[i15 * 2];
        int i16 = 0;
        for (Map.Entry<String, Enum<?>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                int iHashCode = key.hashCode() & i14;
                int i17 = iHashCode + iHashCode;
                if (objArrCopyOf[i17] != null) {
                    i17 = ((iHashCode >> 1) + i12) << 1;
                    if (objArrCopyOf[i17] != null) {
                        i17 = (i15 << 1) + i16;
                        i16 += 2;
                        if (i17 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i17] = key;
                objArrCopyOf[i17 + 1] = entry.getValue();
            }
        }
        return new h(i14, i16, objArrCopyOf);
    }
}
