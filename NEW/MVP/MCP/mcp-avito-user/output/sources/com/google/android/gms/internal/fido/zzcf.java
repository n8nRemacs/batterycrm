package com.google.android.gms.internal.fido;

import AK.c;
import I41.a;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public abstract class zzcf extends zzby implements Set {

    /* renamed from: c, reason: collision with root package name */
    @a
    public transient zzcc f350287c;

    public static zzcf g(int i12, Object... objArr) {
        if (i12 == 0) {
            return zzcu.f350304j;
        }
        if (i12 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzcz(obj);
        }
        int i13 = i(i12);
        Object[] objArr2 = new Object[i13];
        int i14 = i13 - 1;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < i12; i17++) {
            Object obj2 = objArr[i17];
            if (obj2 == null) {
                throw new NullPointerException(c.g(i17, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (Integer.rotateLeft((int) (iHashCode * (-862048943)), 15) * 461845907);
            while (true) {
                int i18 = iRotateLeft & i14;
                Object obj3 = objArr2[i18];
                if (obj3 == null) {
                    objArr[i16] = obj2;
                    objArr2[i18] = obj2;
                    i15 += iHashCode;
                    i16++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iRotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i16, i12, (Object) null);
        if (i16 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzcz(obj4);
        }
        if (i(i16) < i13 / 2) {
            return g(i16, objArr);
        }
        if (i16 <= 0) {
            objArr = Arrays.copyOf(objArr, i16);
        }
        return new zzcu(objArr, i15, objArr2, i14, i16);
    }

    public static int i(int i12) {
        int iMax = Math.max(i12, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzcf zzk() {
        return zzcu.f350304j;
    }

    public static zzcf zzl(Object obj) {
        return new zzcz("FIDO");
    }

    public static zzcf zzm(Object obj, Object obj2) {
        return g(2, obj, obj2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@a Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzcf) && h() && ((zzcf) obj).h() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public boolean h() {
        return this instanceof zzcu;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzcy.a(this);
    }

    public zzcc l() {
        Object[] array = toArray();
        zzdd zzddVar = zzcc.f350284c;
        return zzcc.g(array.length, array);
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzdc iterator();

    public zzcc zzi() {
        zzcc zzccVar = this.f350287c;
        if (zzccVar != null) {
            return zzccVar;
        }
        zzcc zzccVarL = l();
        this.f350287c = zzccVarL;
        return zzccVarL;
    }
}
