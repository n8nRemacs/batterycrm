package com.google.android.gms.internal.mlkit_vision_face_bundled;

import AK.c;
import androidx.appcompat.app.r;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzvh;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public abstract class zzvn<MessageType extends zzvn<MessageType, BuilderType>, BuilderType extends zzvh<MessageType, BuilderType>> extends zztu<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzxx zzc = zzxx.zzc();

    public static Object b(Method method, zzws zzwsVar, Object... objArr) {
        try {
            return method.invoke(zzwsVar, objArr);
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

    public static void d(Class cls, zzvn zzvnVar) {
        zzvnVar.c();
        zzb.put(cls, zzvnVar);
    }

    public static final boolean f(zzvn zzvnVar, boolean z12) {
        byte bByteValue = ((Byte) zzvnVar.h(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzxb.zza().zzb(zzvnVar.getClass()).zzk(zzvnVar);
        if (z12) {
            zzvnVar.h(2, true == zZzk ? zzvnVar : null);
        }
        return zZzk;
    }

    public static zzvn j(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        zzvn zzvnVar = (zzvn) map.get(cls);
        if (zzvnVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzvnVar = (zzvn) map.get(cls);
            } catch (ClassNotFoundException e12) {
                throw new IllegalStateException("Class initialization cannot fail.", e12);
            }
        }
        if (zzvnVar == null) {
            zzvnVar = (zzvn) ((zzvn) zzyg.h(cls)).h(6, null);
            if (zzvnVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzvnVar);
        }
        return zzvnVar;
    }

    public static zzvl zzw(zzws zzwsVar, zzws zzwsVar2, zzvq zzvqVar, int i12, zzym zzymVar, boolean z12, Class cls) {
        return new zzvl(zzwsVar, Collections.emptyList(), zzwsVar2, new zzvk(zzymVar));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztu
    public final int a(zzxf zzxfVar) {
        if (g()) {
            int iZza = zzxfVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(c.g(iZza, "serialized size must be non-negative, was "));
        }
        int i12 = this.zzd & Integer.MAX_VALUE;
        if (i12 != Integer.MAX_VALUE) {
            return i12;
        }
        int iZza2 = zzxfVar.zza(this);
        if (iZza2 < 0) {
            throw new IllegalStateException(c.g(iZza2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & BeduinInputModel.MIN_TEXT_VERSION) | iZza2;
        return iZza2;
    }

    public final void c() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void e() {
        this.zzd = (this.zzd & BeduinInputModel.MIN_TEXT_VERSION) | Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzxb.zza().zzb(getClass()).zzj(this, (zzvn) obj);
    }

    public final boolean g() {
        return (this.zzd & BeduinInputModel.MIN_TEXT_VERSION) != 0;
    }

    public abstract Object h(int i12, zzvn zzvnVar);

    public final int hashCode() {
        if (g()) {
            return zzxb.zza().zzb(getClass()).zzb(this);
        }
        int i12 = this.zza;
        if (i12 != 0) {
            return i12;
        }
        int iZzb = zzxb.zza().zzb(getClass()).zzb(this);
        this.zza = iZzb;
        return iZzb;
    }

    public final zzvh i() {
        return (zzvh) h(5, null);
    }

    public final String toString() throws SecurityException {
        String string = super.toString();
        char[] cArr = zzwu.f354087a;
        StringBuilder sbZ = r.z("# ", string);
        zzwu.c(this, sbZ, 0);
        return sbZ.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzws
    public final /* synthetic */ zzwr zzK() {
        return (zzvh) h(5, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzws
    public final void zzL(zzut zzutVar) {
        zzxb.zza().zzb(getClass()).zzi(this, zzuu.zza(zzutVar));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwt
    public final /* synthetic */ zzws zzq() {
        return (zzvn) h(6, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwt
    public final boolean zzt() {
        return f(this, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzws
    public final int zzu() {
        int iZza;
        if (g()) {
            iZza = zzxb.zza().zzb(getClass()).zza(this);
            if (iZza < 0) {
                throw new IllegalStateException(c.g(iZza, "serialized size must be non-negative, was "));
            }
        } else {
            iZza = this.zzd & Integer.MAX_VALUE;
            if (iZza == Integer.MAX_VALUE) {
                iZza = zzxb.zza().zzb(getClass()).zza(this);
                if (iZza < 0) {
                    throw new IllegalStateException(c.g(iZza, "serialized size must be non-negative, was "));
                }
                this.zzd = (this.zzd & BeduinInputModel.MIN_TEXT_VERSION) | iZza;
            }
        }
        return iZza;
    }
}
