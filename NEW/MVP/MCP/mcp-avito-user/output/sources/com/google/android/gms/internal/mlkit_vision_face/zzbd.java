package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzbd extends AbstractMap implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f352979k = new Object();

    /* renamed from: b, reason: collision with root package name */
    @a
    public transient Object f352980b;

    /* renamed from: c, reason: collision with root package name */
    @a
    public transient int[] f352981c;

    /* renamed from: d, reason: collision with root package name */
    @a
    public transient Object[] f352982d;

    /* renamed from: e, reason: collision with root package name */
    @a
    public transient Object[] f352983e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f352984f = zzcn.zza(12, 1, 1073741823);

    /* renamed from: g, reason: collision with root package name */
    public transient int f352985g;

    /* renamed from: h, reason: collision with root package name */
    @a
    public transient Set f352986h;

    /* renamed from: i, reason: collision with root package name */
    @a
    public transient Set f352987i;

    /* renamed from: j, reason: collision with root package name */
    @a
    public transient Collection f352988j;

    public zzbd() {
    }

    @a
    public final Map a() {
        Object obj = this.f352980b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i12, int i13) {
        Object obj = this.f352980b;
        obj.getClass();
        int[] iArr = this.f352981c;
        iArr.getClass();
        Object[] objArr = this.f352982d;
        objArr.getClass();
        Object[] objArr2 = this.f352983e;
        objArr2.getClass();
        int size = size();
        int i14 = size - 1;
        if (i12 >= i14) {
            objArr[i12] = null;
            objArr2[i12] = null;
            iArr[i12] = 0;
            return;
        }
        Object obj2 = objArr[i14];
        objArr[i12] = obj2;
        objArr2[i12] = objArr2[i14];
        objArr[i14] = null;
        objArr2[i14] = null;
        iArr[i12] = iArr[i14];
        iArr[i14] = 0;
        int iA2 = zzbf.a(obj2) & i13;
        int iB2 = zzbe.b(iA2, obj);
        if (iB2 == size) {
            zzbe.d(iA2, i12 + 1, obj);
            return;
        }
        while (true) {
            int i15 = iB2 - 1;
            int i16 = iArr[i15];
            int i17 = i16 & i13;
            if (i17 == size) {
                iArr[i15] = ((i12 + 1) & i13) | (i16 & (~i13));
                return;
            }
            iB2 = i17;
        }
    }

    public final boolean c() {
        return this.f352980b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.f352984f += 32;
        Map mapA = a();
        if (mapA != null) {
            this.f352984f = zzcn.zza(size(), 3, 1073741823);
            mapA.clear();
            this.f352980b = null;
            this.f352985g = 0;
            return;
        }
        Object[] objArr = this.f352982d;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f352985g, (Object) null);
        Object[] objArr2 = this.f352983e;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f352985g, (Object) null);
        Object obj = this.f352980b;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f352981c;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f352985g, 0);
        this.f352985g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@a Object obj) {
        Map mapA = a();
        return mapA != null ? mapA.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@a Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.containsValue(obj);
        }
        for (int i12 = 0; i12 < this.f352985g; i12++) {
            Object[] objArr = this.f352983e;
            objArr.getClass();
            if (zzx.zza(obj, objArr[i12])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f352984f & 31)) - 1;
    }

    public final int e(@a Object obj) {
        if (c()) {
            return -1;
        }
        int iA2 = zzbf.a(obj);
        int iD2 = d();
        Object obj2 = this.f352980b;
        obj2.getClass();
        int iB2 = zzbe.b(iA2 & iD2, obj2);
        if (iB2 != 0) {
            int i12 = ~iD2;
            int i13 = iA2 & i12;
            do {
                int i14 = iB2 - 1;
                int[] iArr = this.f352981c;
                iArr.getClass();
                int i15 = iArr[i14];
                if ((i15 & i12) == i13) {
                    Object[] objArr = this.f352982d;
                    objArr.getClass();
                    if (zzx.zza(obj, objArr[i14])) {
                        return i14;
                    }
                }
                iB2 = i15 & iD2;
            } while (iB2 != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f352987i;
        if (set != null) {
            return set;
        }
        zzay zzayVar = new zzay(this);
        this.f352987i = zzayVar;
        return zzayVar;
    }

    public final int f(int i12, int i13, int i14, int i15) {
        Object objC = zzbe.c(i13);
        int i16 = i13 - 1;
        if (i15 != 0) {
            zzbe.d(i14 & i16, i15 + 1, objC);
        }
        Object obj = this.f352980b;
        obj.getClass();
        int[] iArr = this.f352981c;
        iArr.getClass();
        for (int i17 = 0; i17 <= i12; i17++) {
            int iB2 = zzbe.b(i17, obj);
            while (iB2 != 0) {
                int i18 = iB2 - 1;
                int i19 = iArr[i18];
                int i22 = ((~i12) & i19) | i17;
                int i23 = i22 & i16;
                int iB3 = zzbe.b(i23, objC);
                zzbe.d(i23, iB2, objC);
                iArr[i18] = ((~i16) & i22) | (iB3 & i16);
                iB2 = i19 & i12;
            }
        }
        this.f352980b = objC;
        this.f352984f = ((32 - Integer.numberOfLeadingZeros(i16)) & 31) | (this.f352984f & (-32));
        return i16;
    }

    public final Object g(@a Object obj) {
        boolean zC2 = c();
        Object obj2 = f352979k;
        if (zC2) {
            return obj2;
        }
        int iD2 = d();
        Object obj3 = this.f352980b;
        obj3.getClass();
        int[] iArr = this.f352981c;
        iArr.getClass();
        Object[] objArr = this.f352982d;
        objArr.getClass();
        int iA2 = zzbe.a(obj, null, iD2, obj3, iArr, objArr, null);
        if (iA2 == -1) {
            return obj2;
        }
        Object[] objArr2 = this.f352983e;
        objArr2.getClass();
        Object obj4 = objArr2[iA2];
        b(iA2, iD2);
        this.f352985g--;
        this.f352984f += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @a
    public final Object get(@a Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.get(obj);
        }
        int iE2 = e(obj);
        if (iE2 == -1) {
            return null;
        }
        Object[] objArr = this.f352983e;
        objArr.getClass();
        return objArr[iE2];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f352986h;
        if (set != null) {
            return set;
        }
        zzba zzbaVar = new zzba(this);
        this.f352986h = zzbaVar;
        return zzbaVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @a
    public final Object put(Object obj, Object obj2) {
        int iMin;
        int i12 = -1;
        if (c()) {
            zzab.zzd(c(), "Arrays already allocated");
            int i13 = this.f352984f;
            int iMax = Math.max(i13 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f352980b = zzbe.c(iMax2);
            this.f352984f = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f352984f & (-32));
            this.f352981c = new int[i13];
            this.f352982d = new Object[i13];
            this.f352983e = new Object[i13];
        }
        Map mapA = a();
        if (mapA != null) {
            return mapA.put(obj, obj2);
        }
        int[] iArr = this.f352981c;
        iArr.getClass();
        Object[] objArr = this.f352982d;
        objArr.getClass();
        Object[] objArr2 = this.f352983e;
        objArr2.getClass();
        int i14 = this.f352985g;
        int i15 = i14 + 1;
        int iA2 = zzbf.a(obj);
        int iD2 = d();
        int i16 = iA2 & iD2;
        Object obj3 = this.f352980b;
        obj3.getClass();
        int iB2 = zzbe.b(i16, obj3);
        if (iB2 != 0) {
            int i17 = ~iD2;
            int i18 = iA2 & i17;
            int i19 = 0;
            while (true) {
                int i22 = iB2 + i12;
                int i23 = iArr[i22];
                int i24 = i23 & i17;
                if (i24 == i18 && zzx.zza(obj, objArr[i22])) {
                    Object obj4 = objArr2[i22];
                    objArr2[i22] = obj2;
                    return obj4;
                }
                int i25 = i23 & iD2;
                int i26 = i18;
                int i27 = i19 + 1;
                if (i25 != 0) {
                    iB2 = i25;
                    i19 = i27;
                    i18 = i26;
                    i12 = -1;
                } else {
                    if (i27 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                        int i28 = isEmpty() ? -1 : 0;
                        while (i28 >= 0) {
                            Object[] objArr3 = this.f352982d;
                            objArr3.getClass();
                            Object obj5 = objArr3[i28];
                            Object[] objArr4 = this.f352983e;
                            objArr4.getClass();
                            linkedHashMap.put(obj5, objArr4[i28]);
                            int i29 = i28 + 1;
                            i28 = i29 < this.f352985g ? i29 : -1;
                        }
                        this.f352980b = linkedHashMap;
                        this.f352981c = null;
                        this.f352982d = null;
                        this.f352983e = null;
                        this.f352984f += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i15 > iD2) {
                        iD2 = f(iD2, (iD2 + 1) * (iD2 < 32 ? 4 : 2), iA2, i14);
                    } else {
                        iArr[i22] = (i15 & iD2) | i24;
                    }
                }
            }
        } else if (i15 > iD2) {
            iD2 = f(iD2, (iD2 + 1) * (iD2 < 32 ? 4 : 2), iA2, i14);
        } else {
            Object obj6 = this.f352980b;
            obj6.getClass();
            zzbe.d(i16, i15, obj6);
        }
        int[] iArr2 = this.f352981c;
        iArr2.getClass();
        int length = iArr2.length;
        if (i15 > length && (iMin = Math.min(1073741823, 1 | (Math.max(1, length >>> 1) + length))) != length) {
            int[] iArr3 = this.f352981c;
            iArr3.getClass();
            this.f352981c = Arrays.copyOf(iArr3, iMin);
            Object[] objArr5 = this.f352982d;
            objArr5.getClass();
            this.f352982d = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.f352983e;
            objArr6.getClass();
            this.f352983e = Arrays.copyOf(objArr6, iMin);
        }
        int[] iArr4 = this.f352981c;
        iArr4.getClass();
        iArr4[i14] = (~iD2) & iA2;
        Object[] objArr7 = this.f352982d;
        objArr7.getClass();
        objArr7[i14] = obj;
        Object[] objArr8 = this.f352983e;
        objArr8.getClass();
        objArr8[i14] = obj2;
        this.f352985g = i15;
        this.f352984f += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @a
    public final Object remove(@a Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.remove(obj);
        }
        Object objG = g(obj);
        if (objG == f352979k) {
            return null;
        }
        return objG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapA = a();
        return mapA != null ? mapA.size() : this.f352985g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f352988j;
        if (collection != null) {
            return collection;
        }
        zzbc zzbcVar = new zzbc(this);
        this.f352988j = zzbcVar;
        return zzbcVar;
    }

    public zzbd(int i12) {
    }
}
