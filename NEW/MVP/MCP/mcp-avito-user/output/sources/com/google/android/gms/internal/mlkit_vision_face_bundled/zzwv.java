package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.media3.common.C23088b;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import sun.misc.Unsafe;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzwv<T> implements zzxf<T> {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f354088m = new int[0];

    /* renamed from: n, reason: collision with root package name */
    public static final Unsafe f354089n = zzyg.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f354090a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f354091b;

    /* renamed from: c, reason: collision with root package name */
    public final int f354092c;

    /* renamed from: d, reason: collision with root package name */
    public final int f354093d;

    /* renamed from: e, reason: collision with root package name */
    public final zzws f354094e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f354095f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f354096g;

    /* renamed from: h, reason: collision with root package name */
    public final int f354097h;

    /* renamed from: i, reason: collision with root package name */
    public final int f354098i;

    /* renamed from: j, reason: collision with root package name */
    public final zzwg f354099j;

    /* renamed from: k, reason: collision with root package name */
    public final zzxw f354100k;

    /* renamed from: l, reason: collision with root package name */
    public final zzuz f354101l;

    public zzwv(int[] iArr, Object[] objArr, int i12, int i13, zzws zzwsVar, int[] iArr2, int i14, int i15, zzwg zzwgVar, zzxw zzxwVar, zzuz zzuzVar) {
        this.f354090a = iArr;
        this.f354091b = objArr;
        this.f354092c = i12;
        this.f354093d = i13;
        boolean z12 = false;
        if (zzuzVar != null && zzuzVar.g(zzwsVar)) {
            z12 = true;
        }
        this.f354095f = z12;
        this.f354096g = iArr2;
        this.f354097h = i14;
        this.f354098i = i15;
        this.f354099j = zzwgVar;
        this.f354100k = zzxwVar;
        this.f354101l = zzuzVar;
        this.f354094e = zzwsVar;
    }

    public static boolean i(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzvn) {
            return ((zzvn) obj).g();
        }
        return true;
    }

    public static zzxx l(Object obj) {
        zzvn zzvnVar = (zzvn) obj;
        zzxx zzxxVar = zzvnVar.zzc;
        if (zzxxVar != zzxx.zzc()) {
            return zzxxVar;
        }
        zzxx zzxxVarA = zzxx.a();
        zzvnVar.zzc = zzxxVarA;
        return zzxxVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0396  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.mlkit_vision_face_bundled.zzwv m(com.google.android.gms.internal.mlkit_vision_face_bundled.zzwp r32, com.google.android.gms.internal.mlkit_vision_face_bundled.zzwg r33, com.google.android.gms.internal.mlkit_vision_face_bundled.zzxw r34, com.google.android.gms.internal.mlkit_vision_face_bundled.zzuz r35) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzwv.m(com.google.android.gms.internal.mlkit_vision_face_bundled.zzwp, com.google.android.gms.internal.mlkit_vision_face_bundled.zzwg, com.google.android.gms.internal.mlkit_vision_face_bundled.zzxw, com.google.android.gms.internal.mlkit_vision_face_bundled.zzuz):com.google.android.gms.internal.mlkit_vision_face_bundled.zzwv");
    }

    public static int n(long j12, Object obj) {
        return ((Integer) zzyg.i(j12, obj)).intValue();
    }

    public static int p(int i12) {
        return (i12 >>> 20) & 255;
    }

    public static long r(long j12, Object obj) {
        return ((Long) zzyg.i(j12, obj)).longValue();
    }

    public static Field w(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbB = C23088b.b("Field ", str, " for ", name, " not found. Known fields are ");
            sbB.append(string);
            throw new RuntimeException(sbB.toString());
        }
    }

    public final void a(int i12, Object obj, Object obj2) {
        if (g(i12, obj2)) {
            int iQ2 = q(i12) & 1048575;
            Unsafe unsafe = f354089n;
            long j12 = iQ2;
            Object object = unsafe.getObject(obj2, j12);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f354090a[i12] + " is present but null: " + obj2.toString());
            }
            zzxf zzxfVarT = t(i12);
            if (!g(i12, obj)) {
                if (i(object)) {
                    Object objZze = zzxfVarT.zze();
                    zzxfVarT.zzg(objZze, object);
                    unsafe.putObject(obj, j12, objZze);
                } else {
                    unsafe.putObject(obj, j12, object);
                }
                c(i12, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j12);
            if (!i(object2)) {
                Object objZze2 = zzxfVarT.zze();
                zzxfVarT.zzg(objZze2, object2);
                unsafe.putObject(obj, j12, objZze2);
                object2 = objZze2;
            }
            zzxfVarT.zzg(object2, object);
        }
    }

    public final void b(int i12, Object obj, Object obj2) {
        int[] iArr = this.f354090a;
        int i13 = iArr[i12];
        if (j(i13, i12, obj2)) {
            int iQ2 = q(i12) & 1048575;
            Unsafe unsafe = f354089n;
            long j12 = iQ2;
            Object object = unsafe.getObject(obj2, j12);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i12] + " is present but null: " + obj2.toString());
            }
            zzxf zzxfVarT = t(i12);
            if (!j(i13, i12, obj)) {
                if (i(object)) {
                    Object objZze = zzxfVarT.zze();
                    zzxfVarT.zzg(objZze, object);
                    unsafe.putObject(obj, j12, objZze);
                } else {
                    unsafe.putObject(obj, j12, object);
                }
                zzyg.n(i13, iArr[i12 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j12);
            if (!i(object2)) {
                Object objZze2 = zzxfVarT.zze();
                zzxfVarT.zzg(objZze2, object2);
                unsafe.putObject(obj, j12, objZze2);
                object2 = objZze2;
            }
            zzxfVarT.zzg(object2, object);
        }
    }

    public final void c(int i12, Object obj) {
        int i13 = this.f354090a[i12 + 2];
        long j12 = 1048575 & i13;
        if (j12 == 1048575) {
            return;
        }
        zzyg.n((1 << (i13 >>> 20)) | zzyg.f(j12, obj), j12, obj);
    }

    public final void d(int i12, Object obj, Object obj2) {
        f354089n.putObject(obj, q(i12) & 1048575, obj2);
        c(i12, obj);
    }

    public final void e(int i12, Object obj, Object obj2, int i13) {
        f354089n.putObject(obj, q(i13) & 1048575, obj2);
        zzyg.n(i12, this.f354090a[i13 + 2] & 1048575, obj);
    }

    public final boolean f(int i12, Object obj, Object obj2) {
        return g(i12, obj) == g(i12, obj2);
    }

    public final boolean g(int i12, Object obj) {
        int i13 = this.f354090a[i12 + 2];
        long j12 = i13 & 1048575;
        if (j12 != 1048575) {
            return ((1 << (i13 >>> 20)) & zzyg.f(j12, obj)) != 0;
        }
        int iQ2 = q(i12);
        long j13 = iQ2 & 1048575;
        switch (p(iQ2)) {
            case 0:
                return Double.doubleToRawLongBits(zzyg.f354149c.zza(obj, j13)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzyg.f354149c.zzb(obj, j13)) != 0;
            case 2:
                return zzyg.g(j13, obj) != 0;
            case 3:
                return zzyg.g(j13, obj) != 0;
            case 4:
                return zzyg.f(j13, obj) != 0;
            case 5:
                return zzyg.g(j13, obj) != 0;
            case 6:
                return zzyg.f(j13, obj) != 0;
            case 7:
                return zzyg.f354149c.zzg(obj, j13);
            case 8:
                Object objI = zzyg.i(j13, obj);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof zzul) {
                    return !zzul.zzb.equals(objI);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzyg.i(j13, obj) != null;
            case 10:
                return !zzul.zzb.equals(zzyg.i(j13, obj));
            case 11:
                return zzyg.f(j13, obj) != 0;
            case 12:
                return zzyg.f(j13, obj) != 0;
            case 13:
                return zzyg.f(j13, obj) != 0;
            case 14:
                return zzyg.g(j13, obj) != 0;
            case 15:
                return zzyg.f(j13, obj) != 0;
            case 16:
                return zzyg.g(j13, obj) != 0;
            case 17:
                return zzyg.i(j13, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean h(Object obj, int i12, int i13, int i14, int i15) {
        return i13 == 1048575 ? g(i12, obj) : (i14 & i15) != 0;
    }

    public final boolean j(int i12, int i13, Object obj) {
        return zzyg.f((long) (this.f354090a[i13 + 2] & 1048575), obj) == i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0892, code lost:
    
        r14 = r8;
        r1 = r8;
        r2 = true;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x101d, code lost:
    
        if (r11 == 1048575) goto L606;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x101f, code lost:
    
        r33.putInt(r7, r11, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x1025, code lost:
    
        r1 = r0.f354097h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x1029, code lost:
    
        if (r1 >= r0.f354098i) goto L715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x102b, code lost:
    
        r3 = r0.f354096g[r1];
        r4 = r19[r3];
        r4 = com.google.android.gms.internal.mlkit_vision_face_bundled.zzyg.i(r0.q(r3) & 1048575, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x103e, code lost:
    
        if (r4 != null) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x1046, code lost:
    
        if (r0.s(r3) != null) goto L716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x1049, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x104b, code lost:
    
        r4 = (com.google.android.gms.internal.mlkit_vision_face_bundled.zzwm) r4;
        r3 = r3 / 3;
        r1 = (com.google.android.gms.internal.mlkit_vision_face_bundled.zzwl) r22[r3 + r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x1054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x1055, code lost:
    
        if (r9 != 0) goto L624;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x1059, code lost:
    
        if (r8 != r41) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x1060, code lost:
    
        throw com.google.android.gms.internal.mlkit_vision_face_bundled.zzvv.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x1063, code lost:
    
        if (r8 > r41) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x1065, code lost:
    
        if (r2 != r9) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x1067, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x106c, code lost:
    
        throw com.google.android.gms.internal.mlkit_vision_face_bundled.zzvv.c();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0e7b  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0e89  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0ba1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:704:0x0bb1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.mlkit_vision_face_bundled.zzty r43) throws com.google.android.gms.internal.mlkit_vision_face_bundled.zzvv {
        /*
            Method dump skipped, instructions count: 4406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzwv.k(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_face_bundled.zzty):int");
    }

    public final int o(int i12, int i13) {
        int[] iArr = this.f354090a;
        int length = (iArr.length / 3) - 1;
        while (i13 <= length) {
            int i14 = (length + i13) >>> 1;
            int i15 = i14 * 3;
            int i16 = iArr[i15];
            if (i12 == i16) {
                return i15;
            }
            if (i12 < i16) {
                length = i14 - 1;
            } else {
                i13 = i14 + 1;
            }
        }
        return -1;
    }

    public final int q(int i12) {
        return this.f354090a[i12 + 1];
    }

    public final zzvr s(int i12) {
        int i13 = i12 / 3;
        return (zzvr) this.f354091b[i13 + i13 + 1];
    }

    public final zzxf t(int i12) {
        int i13 = i12 / 3;
        int i14 = i13 + i13;
        Object[] objArr = this.f354091b;
        zzxf zzxfVar = (zzxf) objArr[i14];
        if (zzxfVar != null) {
            return zzxfVar;
        }
        zzxf zzxfVarZzb = zzxb.zza().zzb((Class) objArr[i14 + 1]);
        objArr[i14] = zzxfVarZzb;
        return zzxfVarZzb;
    }

    public final Object u(int i12, Object obj) {
        zzxf zzxfVarT = t(i12);
        int iQ2 = q(i12) & 1048575;
        if (!g(i12, obj)) {
            return zzxfVarT.zze();
        }
        Object object = f354089n.getObject(obj, iQ2);
        if (i(object)) {
            return object;
        }
        Object objZze = zzxfVarT.zze();
        if (object != null) {
            zzxfVarT.zzg(objZze, object);
        }
        return objZze;
    }

    public final Object v(int i12, int i13, Object obj) {
        zzxf zzxfVarT = t(i13);
        if (!j(i12, i13, obj)) {
            return zzxfVarT.zze();
        }
        Object object = f354089n.getObject(obj, q(i13) & 1048575);
        if (i(object)) {
            return object;
        }
        Object objZze = zzxfVarT.zze();
        if (object != null) {
            zzxfVarT.zzg(objZze, object);
        }
        return objZze;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04e3  */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzwv.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    public final int zzb(Object obj) {
        int i12;
        long jDoubleToLongBits;
        int i13;
        int iFloatToIntBits;
        int iF2;
        int i14;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = this.f354090a;
            if (i15 >= iArr.length) {
                int iHashCode = this.f354100k.d(obj).hashCode() + (i16 * 53);
                return this.f354095f ? (iHashCode * 53) + this.f354101l.b(obj).f354050a.hashCode() : iHashCode;
            }
            int iQ2 = q(i15);
            int i17 = 1048575 & iQ2;
            int iP2 = p(iQ2);
            int i18 = iArr[i15];
            long j12 = i17;
            int iHashCode2 = 37;
            switch (iP2) {
                case 0:
                    i12 = i16 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzyg.f354149c.zza(obj, j12));
                    Charset charset = zzvt.f354067a;
                    iF2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i16 = i12 + iF2;
                    break;
                case 1:
                    i13 = i16 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzyg.f354149c.zzb(obj, j12));
                    i16 = iFloatToIntBits + i13;
                    break;
                case 2:
                    i12 = i16 * 53;
                    jDoubleToLongBits = zzyg.g(j12, obj);
                    Charset charset2 = zzvt.f354067a;
                    iF2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i16 = i12 + iF2;
                    break;
                case 3:
                    i12 = i16 * 53;
                    jDoubleToLongBits = zzyg.g(j12, obj);
                    Charset charset3 = zzvt.f354067a;
                    iF2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i16 = i12 + iF2;
                    break;
                case 4:
                    i12 = i16 * 53;
                    iF2 = zzyg.f(j12, obj);
                    i16 = i12 + iF2;
                    break;
                case 5:
                    i12 = i16 * 53;
                    jDoubleToLongBits = zzyg.g(j12, obj);
                    Charset charset4 = zzvt.f354067a;
                    iF2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i16 = i12 + iF2;
                    break;
                case 6:
                    i12 = i16 * 53;
                    iF2 = zzyg.f(j12, obj);
                    i16 = i12 + iF2;
                    break;
                case 7:
                    i13 = i16 * 53;
                    iFloatToIntBits = zzvt.zza(zzyg.f354149c.zzg(obj, j12));
                    i16 = iFloatToIntBits + i13;
                    break;
                case 8:
                    i13 = i16 * 53;
                    iFloatToIntBits = ((String) zzyg.i(j12, obj)).hashCode();
                    i16 = iFloatToIntBits + i13;
                    break;
                case 9:
                    i14 = i16 * 53;
                    Object objI = zzyg.i(j12, obj);
                    if (objI != null) {
                        iHashCode2 = objI.hashCode();
                    }
                    i16 = i14 + iHashCode2;
                    break;
                case 10:
                    i13 = i16 * 53;
                    iFloatToIntBits = zzyg.i(j12, obj).hashCode();
                    i16 = iFloatToIntBits + i13;
                    break;
                case 11:
                    i12 = i16 * 53;
                    iF2 = zzyg.f(j12, obj);
                    i16 = i12 + iF2;
                    break;
                case 12:
                    i12 = i16 * 53;
                    iF2 = zzyg.f(j12, obj);
                    i16 = i12 + iF2;
                    break;
                case 13:
                    i12 = i16 * 53;
                    iF2 = zzyg.f(j12, obj);
                    i16 = i12 + iF2;
                    break;
                case 14:
                    i12 = i16 * 53;
                    jDoubleToLongBits = zzyg.g(j12, obj);
                    Charset charset5 = zzvt.f354067a;
                    iF2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i16 = i12 + iF2;
                    break;
                case 15:
                    i12 = i16 * 53;
                    iF2 = zzyg.f(j12, obj);
                    i16 = i12 + iF2;
                    break;
                case 16:
                    i12 = i16 * 53;
                    jDoubleToLongBits = zzyg.g(j12, obj);
                    Charset charset6 = zzvt.f354067a;
                    iF2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i16 = i12 + iF2;
                    break;
                case 17:
                    i14 = i16 * 53;
                    Object objI2 = zzyg.i(j12, obj);
                    if (objI2 != null) {
                        iHashCode2 = objI2.hashCode();
                    }
                    i16 = i14 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i13 = i16 * 53;
                    iFloatToIntBits = zzyg.i(j12, obj).hashCode();
                    i16 = iFloatToIntBits + i13;
                    break;
                case 50:
                    i13 = i16 * 53;
                    iFloatToIntBits = zzyg.i(j12, obj).hashCode();
                    i16 = iFloatToIntBits + i13;
                    break;
                case 51:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i12 = i16 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) zzyg.i(j12, obj)).doubleValue());
                        Charset charset7 = zzvt.f354067a;
                        iF2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i16 = i12 + iF2;
                        break;
                    }
                case 52:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i13 = i16 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) zzyg.i(j12, obj)).floatValue());
                        i16 = iFloatToIntBits + i13;
                        break;
                    }
                case 53:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i12 = i16 * 53;
                        jDoubleToLongBits = r(j12, obj);
                        Charset charset8 = zzvt.f354067a;
                        iF2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i16 = i12 + iF2;
                        break;
                    }
                case 54:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i12 = i16 * 53;
                        jDoubleToLongBits = r(j12, obj);
                        Charset charset9 = zzvt.f354067a;
                        iF2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i16 = i12 + iF2;
                        break;
                    }
                case 55:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i12 = i16 * 53;
                        iF2 = n(j12, obj);
                        i16 = i12 + iF2;
                        break;
                    }
                case 56:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i12 = i16 * 53;
                        jDoubleToLongBits = r(j12, obj);
                        Charset charset10 = zzvt.f354067a;
                        iF2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i16 = i12 + iF2;
                        break;
                    }
                case 57:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i12 = i16 * 53;
                        iF2 = n(j12, obj);
                        i16 = i12 + iF2;
                        break;
                    }
                case 58:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i13 = i16 * 53;
                        iFloatToIntBits = zzvt.zza(((Boolean) zzyg.i(j12, obj)).booleanValue());
                        i16 = iFloatToIntBits + i13;
                        break;
                    }
                case 59:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i13 = i16 * 53;
                        iFloatToIntBits = ((String) zzyg.i(j12, obj)).hashCode();
                        i16 = iFloatToIntBits + i13;
                        break;
                    }
                case 60:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i13 = i16 * 53;
                        iFloatToIntBits = zzyg.i(j12, obj).hashCode();
                        i16 = iFloatToIntBits + i13;
                        break;
                    }
                case 61:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i13 = i16 * 53;
                        iFloatToIntBits = zzyg.i(j12, obj).hashCode();
                        i16 = iFloatToIntBits + i13;
                        break;
                    }
                case 62:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i12 = i16 * 53;
                        iF2 = n(j12, obj);
                        i16 = i12 + iF2;
                        break;
                    }
                case 63:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i12 = i16 * 53;
                        iF2 = n(j12, obj);
                        i16 = i12 + iF2;
                        break;
                    }
                case 64:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i12 = i16 * 53;
                        iF2 = n(j12, obj);
                        i16 = i12 + iF2;
                        break;
                    }
                case 65:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i12 = i16 * 53;
                        jDoubleToLongBits = r(j12, obj);
                        Charset charset11 = zzvt.f354067a;
                        iF2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i16 = i12 + iF2;
                        break;
                    }
                case 66:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i12 = i16 * 53;
                        iF2 = n(j12, obj);
                        i16 = i12 + iF2;
                        break;
                    }
                case 67:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i12 = i16 * 53;
                        jDoubleToLongBits = r(j12, obj);
                        Charset charset12 = zzvt.f354067a;
                        iF2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i16 = i12 + iF2;
                        break;
                    }
                case 68:
                    if (!j(i18, i15, obj)) {
                        break;
                    } else {
                        i13 = i16 * 53;
                        iFloatToIntBits = zzyg.i(j12, obj).hashCode();
                        i16 = iFloatToIntBits + i13;
                        break;
                    }
            }
            i15 += 3;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    public final Object zze() {
        return (zzvn) ((zzvn) this.f354094e).h(4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = i(r7)
            if (r0 != 0) goto L8
            goto L8c
        L8:
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r7
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn r0 = (com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn) r0
            r0.e()
            r0.zza = r1
            r0.c()
        L18:
            int[] r0 = r6.f354090a
            int r2 = r0.length
            if (r1 >= r2) goto L7e
            int r2 = r6.q(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = p(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L68
            r5 = 60
            if (r2 == r5) goto L52
            r5 = 68
            if (r2 == r5) goto L52
            switch(r2) {
                case 17: goto L68;
                case 18: goto L4c;
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                case 22: goto L4c;
                case 23: goto L4c;
                case 24: goto L4c;
                case 25: goto L4c;
                case 26: goto L4c;
                case 27: goto L4c;
                case 28: goto L4c;
                case 29: goto L4c;
                case 30: goto L4c;
                case 31: goto L4c;
                case 32: goto L4c;
                case 33: goto L4c;
                case 34: goto L4c;
                case 35: goto L4c;
                case 36: goto L4c;
                case 37: goto L4c;
                case 38: goto L4c;
                case 39: goto L4c;
                case 40: goto L4c;
                case 41: goto L4c;
                case 42: goto L4c;
                case 43: goto L4c;
                case 44: goto L4c;
                case 45: goto L4c;
                case 46: goto L4c;
                case 47: goto L4c;
                case 48: goto L4c;
                case 49: goto L4c;
                case 50: goto L3a;
                default: goto L39;
            }
        L39:
            goto L7b
        L3a:
            sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_vision_face_bundled.zzwv.f354089n
            java.lang.Object r2 = r0.getObject(r7, r3)
            if (r2 == 0) goto L7b
            r5 = r2
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzwm r5 = (com.google.android.gms.internal.mlkit_vision_face_bundled.zzwm) r5
            r5.zzc()
            r0.putObject(r7, r3, r2)
            goto L7b
        L4c:
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzwg r0 = r6.f354099j
            r0.a(r3, r7)
            goto L7b
        L52:
            r0 = r0[r1]
            boolean r0 = r6.j(r0, r1, r7)
            if (r0 == 0) goto L7b
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf r0 = r6.t(r1)
            sun.misc.Unsafe r2 = com.google.android.gms.internal.mlkit_vision_face_bundled.zzwv.f354089n
            java.lang.Object r2 = r2.getObject(r7, r3)
            r0.zzf(r2)
            goto L7b
        L68:
            boolean r0 = r6.g(r1, r7)
            if (r0 == 0) goto L7b
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf r0 = r6.t(r1)
            sun.misc.Unsafe r2 = com.google.android.gms.internal.mlkit_vision_face_bundled.zzwv.f354089n
            java.lang.Object r2 = r2.getObject(r7, r3)
            r0.zzf(r2)
        L7b:
            int r1 = r1 + 3
            goto L18
        L7e:
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzxw r0 = r6.f354100k
            r0.g(r7)
            boolean r0 = r6.f354095f
            if (r0 == 0) goto L8c
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzuz r0 = r6.f354101l
            r0.e(r7)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzwv.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    public final void zzg(Object obj, Object obj2) {
        if (!i(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i12 = 0;
        while (true) {
            int[] iArr = this.f354090a;
            if (i12 >= iArr.length) {
                Class cls = zzxh.f354117a;
                zzxw zzxwVar = this.f354100k;
                zzxwVar.h(obj, zzxwVar.e(zzxwVar.d(obj), zzxwVar.d(obj2)));
                if (this.f354095f) {
                    zzuz zzuzVar = this.f354101l;
                    zzvd zzvdVarB = zzuzVar.b(obj2);
                    if (zzvdVarB.f354050a.isEmpty()) {
                        return;
                    }
                    zzuzVar.c(obj).zzi(zzvdVarB);
                    return;
                }
                return;
            }
            int iQ2 = q(i12);
            int i13 = iQ2 & 1048575;
            int iP2 = p(iQ2);
            int i14 = iArr[i12];
            long j12 = i13;
            switch (iP2) {
                case 0:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.l(obj, j12, zzyg.f354149c.zza(obj2, j12));
                        c(i12, obj);
                        break;
                    }
                case 1:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.m(obj, j12, zzyg.f354149c.zzb(obj2, j12));
                        c(i12, obj);
                        break;
                    }
                case 2:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.o(obj, j12, zzyg.g(j12, obj2));
                        c(i12, obj);
                        break;
                    }
                case 3:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.o(obj, j12, zzyg.g(j12, obj2));
                        c(i12, obj);
                        break;
                    }
                case 4:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.n(zzyg.f(j12, obj2), j12, obj);
                        c(i12, obj);
                        break;
                    }
                case 5:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.o(obj, j12, zzyg.g(j12, obj2));
                        c(i12, obj);
                        break;
                    }
                case 6:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.n(zzyg.f(j12, obj2), j12, obj);
                        c(i12, obj);
                        break;
                    }
                case 7:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.k(obj, j12, zzyg.f354149c.zzg(obj2, j12));
                        c(i12, obj);
                        break;
                    }
                case 8:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.p(obj, j12, zzyg.i(j12, obj2));
                        c(i12, obj);
                        break;
                    }
                case 9:
                    a(i12, obj, obj2);
                    break;
                case 10:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.p(obj, j12, zzyg.i(j12, obj2));
                        c(i12, obj);
                        break;
                    }
                case 11:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.n(zzyg.f(j12, obj2), j12, obj);
                        c(i12, obj);
                        break;
                    }
                case 12:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.n(zzyg.f(j12, obj2), j12, obj);
                        c(i12, obj);
                        break;
                    }
                case 13:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.n(zzyg.f(j12, obj2), j12, obj);
                        c(i12, obj);
                        break;
                    }
                case 14:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.o(obj, j12, zzyg.g(j12, obj2));
                        c(i12, obj);
                        break;
                    }
                case 15:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.n(zzyg.f(j12, obj2), j12, obj);
                        c(i12, obj);
                        break;
                    }
                case 16:
                    if (!g(i12, obj2)) {
                        break;
                    } else {
                        zzyg.o(obj, j12, zzyg.g(j12, obj2));
                        c(i12, obj);
                        break;
                    }
                case 17:
                    a(i12, obj, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f354099j.b(obj, j12, obj2);
                    break;
                case 50:
                    Class cls2 = zzxh.f354117a;
                    zzyg.p(obj, j12, zzwn.zza(zzyg.i(j12, obj), zzyg.i(j12, obj2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!j(i14, i12, obj2)) {
                        break;
                    } else {
                        zzyg.p(obj, j12, zzyg.i(j12, obj2));
                        zzyg.n(i14, iArr[i12 + 2] & 1048575, obj);
                        break;
                    }
                case 60:
                    b(i12, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!j(i14, i12, obj2)) {
                        break;
                    } else {
                        zzyg.p(obj, j12, zzyg.i(j12, obj2));
                        zzyg.n(i14, iArr[i12 + 2] & 1048575, obj);
                        break;
                    }
                case 68:
                    b(i12, obj, obj2);
                    break;
            }
            i12 += 3;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    public final void zzh(Object obj, byte[] bArr, int i12, int i13, zzty zztyVar) throws zzvv {
        k(obj, bArr, i12, i13, 0, zztyVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020e  */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r24, com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo r25) {
        /*
            Method dump skipped, instructions count: 1862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzwv.zzi(java.lang.Object, com.google.android.gms.internal.mlkit_vision_face_bundled.zzyo):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    public final boolean zzj(Object obj, Object obj2) {
        boolean zA2;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f354090a;
            if (i12 >= iArr.length) {
                zzxw zzxwVar = this.f354100k;
                if (!zzxwVar.d(obj).equals(zzxwVar.d(obj2))) {
                    return false;
                }
                if (!this.f354095f) {
                    return true;
                }
                zzuz zzuzVar = this.f354101l;
                return zzuzVar.b(obj).equals(zzuzVar.b(obj2));
            }
            int iQ2 = q(i12);
            long j12 = iQ2 & 1048575;
            switch (p(iQ2)) {
                case 0:
                    if (!f(i12, obj, obj2)) {
                        break;
                    } else {
                        zzyf zzyfVar = zzyg.f354149c;
                        if (Double.doubleToLongBits(zzyfVar.zza(obj, j12)) != Double.doubleToLongBits(zzyfVar.zza(obj2, j12))) {
                            break;
                        } else {
                            continue;
                            i12 += 3;
                        }
                    }
                case 1:
                    if (!f(i12, obj, obj2)) {
                        break;
                    } else {
                        zzyf zzyfVar2 = zzyg.f354149c;
                        if (Float.floatToIntBits(zzyfVar2.zzb(obj, j12)) != Float.floatToIntBits(zzyfVar2.zzb(obj2, j12))) {
                            break;
                        } else {
                            continue;
                            i12 += 3;
                        }
                    }
                case 2:
                    if (!f(i12, obj, obj2) || zzyg.g(j12, obj) != zzyg.g(j12, obj2)) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 3:
                    if (!f(i12, obj, obj2) || zzyg.g(j12, obj) != zzyg.g(j12, obj2)) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 4:
                    if (!f(i12, obj, obj2) || zzyg.f(j12, obj) != zzyg.f(j12, obj2)) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 5:
                    if (!f(i12, obj, obj2) || zzyg.g(j12, obj) != zzyg.g(j12, obj2)) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 6:
                    if (!f(i12, obj, obj2) || zzyg.f(j12, obj) != zzyg.f(j12, obj2)) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 7:
                    if (!f(i12, obj, obj2)) {
                        break;
                    } else {
                        zzyf zzyfVar3 = zzyg.f354149c;
                        if (zzyfVar3.zzg(obj, j12) != zzyfVar3.zzg(obj2, j12)) {
                            break;
                        } else {
                            continue;
                            i12 += 3;
                        }
                    }
                case 8:
                    if (!f(i12, obj, obj2) || !zzxh.a(zzyg.i(j12, obj), zzyg.i(j12, obj2))) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 9:
                    if (!f(i12, obj, obj2) || !zzxh.a(zzyg.i(j12, obj), zzyg.i(j12, obj2))) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 10:
                    if (!f(i12, obj, obj2) || !zzxh.a(zzyg.i(j12, obj), zzyg.i(j12, obj2))) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 11:
                    if (!f(i12, obj, obj2) || zzyg.f(j12, obj) != zzyg.f(j12, obj2)) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 12:
                    if (!f(i12, obj, obj2) || zzyg.f(j12, obj) != zzyg.f(j12, obj2)) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 13:
                    if (!f(i12, obj, obj2) || zzyg.f(j12, obj) != zzyg.f(j12, obj2)) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 14:
                    if (!f(i12, obj, obj2) || zzyg.g(j12, obj) != zzyg.g(j12, obj2)) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 15:
                    if (!f(i12, obj, obj2) || zzyg.f(j12, obj) != zzyg.f(j12, obj2)) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 16:
                    if (!f(i12, obj, obj2) || zzyg.g(j12, obj) != zzyg.g(j12, obj2)) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 17:
                    if (!f(i12, obj, obj2) || !zzxh.a(zzyg.i(j12, obj), zzyg.i(j12, obj2))) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zA2 = zzxh.a(zzyg.i(j12, obj), zzyg.i(j12, obj2));
                    break;
                case 50:
                    zA2 = zzxh.a(zzyg.i(j12, obj), zzyg.i(j12, obj2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j13 = iArr[i12 + 2] & 1048575;
                    if (zzyg.f(j13, obj) != zzyg.f(j13, obj2) || !zzxh.a(zzyg.i(j12, obj), zzyg.i(j12, obj2))) {
                        break;
                    } else {
                        continue;
                        i12 += 3;
                    }
                    break;
                default:
                    i12 += 3;
            }
            if (zA2) {
                i12 += 3;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzwv.zzk(java.lang.Object):boolean");
    }
}
