package com.google.android.gms.internal.auth;

import androidx.appcompat.app.r;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public abstract class zzev<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>> extends zzdq<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzha zzc = zzha.zza();

    public static zzev a(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        zzev zzevVar = (zzev) map.get(cls);
        if (zzevVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzevVar = (zzev) map.get(cls);
            } catch (ClassNotFoundException e12) {
                throw new IllegalStateException("Class initialization cannot fail.", e12);
            }
        }
        if (zzevVar == null) {
            zzevVar = (zzev) ((zzev) zzhj.c(cls)).g(6);
            if (zzevVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzevVar);
        }
        return zzevVar;
    }

    public static Object b(Method method, zzfx zzfxVar, Object... objArr) {
        try {
            return method.invoke(zzfxVar, objArr);
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

    public static void d(zzhs zzhsVar) {
        zzhsVar.c();
        zzb.put(zzhs.class, zzhsVar);
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
        return zzgf.zza().zzb(getClass()).zzh(this, (zzev) obj);
    }

    public final boolean f() {
        return (this.zzd & BeduinInputModel.MIN_TEXT_VERSION) != 0;
    }

    public abstract Object g(int i12);

    public final int hashCode() {
        if (f()) {
            return zzgf.zza().zzb(getClass()).zza(this);
        }
        int i12 = this.zza;
        if (i12 != 0) {
            return i12;
        }
        int iZza = zzgf.zza().zzb(getClass()).zza(this);
        this.zza = iZza;
        return iZza;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = zzfz.f350120a;
        StringBuilder sbZ = r.z("# ", string);
        zzfz.c(this, sbZ, 0);
        return sbZ.toString();
    }

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* synthetic */ zzfx zze() {
        return (zzev) g(6);
    }
}
