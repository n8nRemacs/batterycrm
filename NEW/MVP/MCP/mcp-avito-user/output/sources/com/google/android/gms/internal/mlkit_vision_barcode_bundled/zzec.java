package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.appcompat.app.r;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.photos.vision.barhopper.C37647a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public abstract class zzec<MessageType extends zzec<MessageType, BuilderType>, BuilderType extends zzdw<MessageType, BuilderType>> extends zzck<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected zzgq zzc = zzgq.zzc();
    protected int zzd = -1;

    public static zzec d(Class cls) throws ClassNotFoundException {
        Map map = zza;
        zzec zzecVar = (zzec) map.get(cls);
        if (zzecVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzecVar = (zzec) map.get(cls);
            } catch (ClassNotFoundException e12) {
                throw new IllegalStateException("Class initialization cannot fail.", e12);
            }
        }
        if (zzecVar == null) {
            zzecVar = (zzec) ((zzec) zzgz.h(cls)).m(6, null);
            if (zzecVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzecVar);
        }
        return zzecVar;
    }

    public static zzec e(C37647a c37647a, byte[] bArr, zzdn zzdnVar) throws zzen {
        int length = bArr.length;
        zzec zzecVar = (zzec) c37647a.m(4, null);
        try {
            zzgb zzgbVarZzb = zzfu.zza().zzb(zzecVar.getClass());
            zzgbVarZzb.zzh(zzecVar, bArr, 0, length, new zzco(zzdnVar));
            zzgbVarZzb.zzf(zzecVar);
            if (zzecVar.zzb != 0) {
                throw new RuntimeException();
            }
            if (zzecVar.zzY()) {
                return zzecVar;
            }
            zzen zzenVar = new zzen(new zzgo(zzecVar).getMessage());
            zzenVar.zzf(zzecVar);
            throw zzenVar;
        } catch (zzen e12) {
            e12.zzf(zzecVar);
            throw e12;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzen) {
                throw ((zzen) e13.getCause());
            }
            zzen zzenVar2 = new zzen(e13);
            zzenVar2.zzf(zzecVar);
            throw zzenVar2;
        } catch (IndexOutOfBoundsException unused) {
            zzen zzenVarD = zzen.d();
            zzenVarD.zzf(zzecVar);
            throw zzenVarD;
        }
    }

    public static zzeh f() {
        return zzdu.zze();
    }

    public static zzei g() {
        return zzed.zzf();
    }

    public static zzek h() {
        return zzfv.zze();
    }

    public static Object i(Method method, zzfl zzflVar, Object... objArr) {
        try {
            return method.invoke(zzflVar, objArr);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e12);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object j(zzfl zzflVar, String str, Object[] objArr) {
        return new zzfw(zzflVar, str, objArr);
    }

    public static void k(Class cls, zzec zzecVar) {
        zza.put(cls, zzecVar);
    }

    public static final boolean l(zzec zzecVar, boolean z12) {
        byte bByteValue = ((Byte) zzecVar.m(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzj = zzfu.zza().zzb(zzecVar.getClass()).zzj(zzecVar);
        if (z12) {
            zzecVar.m(2, true == zZzj ? zzecVar : null);
        }
        return zZzj;
    }

    public static zzea zzH(zzfl zzflVar, Object obj, zzfl zzflVar2, zzef zzefVar, int i12, zzhf zzhfVar, Class cls) {
        return new zzea(zzflVar, obj, zzflVar2, new zzdz(i12, zzhfVar));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck
    public final int a() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck
    public final void b(int i12) {
        this.zzd = i12;
    }

    public final zzdw c() {
        return (zzdw) m(5, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzfu.zza().zzb(getClass()).zzi(this, (zzec) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i12 = this.zzb;
        if (i12 != 0) {
            return i12;
        }
        int iZzb = zzfu.zza().zzb(getClass()).zzb(this);
        this.zzb = iZzb;
        return iZzb;
    }

    public abstract Object m(int i12, zzec zzecVar);

    public final String toString() {
        StringBuilder sbZ = r.z("# ", super.toString());
        zzfn.c(this, sbZ, 0);
        return sbZ.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl
    public final int zzE() {
        int i12 = this.zzd;
        if (i12 != -1) {
            return i12;
        }
        int iZza = zzfu.zza().zzb(getClass()).zza(this);
        this.zzd = iZza;
        return iZza;
    }

    public final zzdw zzG() {
        zzdw zzdwVar = (zzdw) m(5, null);
        zzdwVar.zzi(this);
        return zzdwVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl
    public final /* synthetic */ zzfk zzU() {
        return (zzdw) m(5, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl
    public final /* synthetic */ zzfk zzV() {
        zzdw zzdwVar = (zzdw) m(5, null);
        zzdwVar.zzi(this);
        return zzdwVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl
    public final void zzW(zzdi zzdiVar) {
        zzfu.zza().zzb(getClass()).zzm(this, zzdj.zza(zzdiVar));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final /* synthetic */ zzfl zzX() {
        return (zzec) m(6, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final boolean zzY() {
        return l(this, true);
    }
}
