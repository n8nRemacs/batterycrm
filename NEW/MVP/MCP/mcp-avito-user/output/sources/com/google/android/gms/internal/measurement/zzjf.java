package com.google.android.gms.internal.measurement;

import AK.c;
import androidx.appcompat.app.r;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzjf.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public abstract class zzjf<MessageType extends zzjf<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhl<MessageType, BuilderType> {
    private static Map<Object, zzjf<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzmh zzb = zzmh.zzc();

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static class zza<T extends zzjf<T, ?>> extends zzhp<T> {
        public zza(T t12) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static abstract class zzb<MessageType extends zzjf<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhn<MessageType, BuilderType> {

        /* renamed from: b, reason: collision with root package name */
        public final MessageType f350892b;

        /* renamed from: c, reason: collision with root package name */
        public MessageType f350893c;

        public zzb(MessageType messagetype) {
            this.f350892b = messagetype;
            if (messagetype.m()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f350893c = (MessageType) messagetype.g(zze.zzd);
        }

        @Override // com.google.android.gms.internal.measurement.zzhn
        public /* synthetic */ Object clone() {
            zzb zzbVar = (zzb) this.f350892b.g(zze.zze);
            zzbVar.f350893c = (MessageType) zzai();
            return zzbVar;
        }

        public final void e() {
            if (this.f350893c.m()) {
                return;
            }
            i();
        }

        public final void i() {
            MessageType messagetype = (MessageType) this.f350892b.g(zze.zzd);
            zzlf.zza().zza((zzlf) messagetype).zza(messagetype, this.f350893c);
            this.f350893c = messagetype;
        }

        public final void j(byte[] bArr, int i12, zzis zzisVar) throws zzjq {
            if (!this.f350893c.m()) {
                i();
            }
            try {
                zzlf.zza().zza((zzlf) this.f350893c).zza(this.f350893c, bArr, 0, i12, new zzht(zzisVar));
            } catch (zzjq e12) {
                throw e12;
            } catch (IOException e13) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e13);
            } catch (IndexOutOfBoundsException unused) {
                throw zzjq.e();
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhn
        /* renamed from: zza */
        public final /* synthetic */ zzhn zzb(zzij zzijVar, zzis zzisVar) {
            return (zzb) zzb(zzijVar, zzisVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzhn
        /* renamed from: zzae */
        public final /* synthetic */ zzhn clone() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.measurement.zzku
        /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public final MessageType zzah() {
            MessageType messagetype = (MessageType) zzai();
            if (messagetype.zzci()) {
                return messagetype;
            }
            throw new zzmf(messagetype);
        }

        @Override // com.google.android.gms.internal.measurement.zzku
        /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
        public MessageType zzai() {
            if (!this.f350893c.m()) {
                return this.f350893c;
            }
            MessageType messagetype = this.f350893c;
            messagetype.getClass();
            zzlf.zza().zza((zzlf) messagetype).zzc(messagetype);
            messagetype.l();
            return this.f350893c;
        }

        @Override // com.google.android.gms.internal.measurement.zzhn
        public final zzku zzb(zzij zzijVar, zzis zzisVar) throws IOException {
            if (!this.f350893c.m()) {
                i();
            }
            try {
                zzlf.zza().zza((zzlf) this.f350893c).zza(this.f350893c, zzin.zza(zzijVar), zzisVar);
                return this;
            } catch (RuntimeException e12) {
                if (e12.getCause() instanceof IOException) {
                    throw ((IOException) e12.getCause());
                }
                throw e12;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzkt
        public final /* synthetic */ zzkr zzcf() {
            return this.f350892b;
        }

        @Override // com.google.android.gms.internal.measurement.zzkt
        public final boolean zzci() {
            return zzjf.j(this.f350893c, false);
        }

        @Override // com.google.android.gms.internal.measurement.zzhn
        public final /* synthetic */ zzhn zza(byte[] bArr, int i12, int i13) throws zzjq {
            j(bArr, i13, zzis.f350872c);
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.zzhn
        public final /* synthetic */ zzhn zza(byte[] bArr, int i12, int i13, zzis zzisVar) throws zzjq {
            j(bArr, i13, zzisVar);
            return this;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.f350892b.equals(messagetype)) {
                return this;
            }
            if (!this.f350893c.m()) {
                i();
            }
            MessageType messagetype2 = this.f350893c;
            zzlf.zza().zza((zzlf) messagetype2).zza(messagetype2, messagetype);
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static final class zzc implements zzja<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final zzmv zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final zznf zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final zzku zza(zzku zzkuVar, zzkr zzkrVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final zzla zza(zzla zzlaVar, zzla zzlaVar2) {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzjf<MessageType, BuilderType> implements zzkt {
        protected zziy<zzc> zzc = zziy.zzb();

        public final zziy<zzc> n() {
            if (this.zzc.zzf()) {
                this.zzc = (zziy) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public enum zze {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f350894a = {1, 2, 3, 4, 5, 6, 7};
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;

        public static int[] zza() {
            return (int[]) f350894a.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static class zzf<ContainingType extends zzkr, Type> extends zzit<ContainingType, Type> {
    }

    public static <T extends zzjf<?, ?>> T e(Class<T> cls) throws ClassNotFoundException {
        zzjf<?, ?> zzjfVar = zzc.get(cls);
        if (zzjfVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzjfVar = zzc.get(cls);
            } catch (ClassNotFoundException e12) {
                throw new IllegalStateException("Class initialization cannot fail.", e12);
            }
        }
        if (zzjfVar == null) {
            zzjfVar = (T) ((zzjf) zzmo.b(cls)).g(zze.zzf);
            if (zzjfVar == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzjfVar);
        }
        return (T) zzjfVar;
    }

    public static <E> zzjn<E> f(zzjn<E> zzjnVar) {
        int size = zzjnVar.size();
        return zzjnVar.zza(size == 0 ? 10 : size << 1);
    }

    public static Object h(Method method, zzkr zzkrVar, Object... objArr) {
        try {
            return method.invoke(zzkrVar, objArr);
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

    public static <T extends zzjf<?, ?>> void i(Class<T> cls, T t12) {
        t12.l();
        zzc.put(cls, t12);
    }

    public static final <T extends zzjf<T, ?>> boolean j(T t12, boolean z12) {
        byte bByteValue = ((Byte) t12.g(zze.zza)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzd = zzlf.zza().zza((zzlf) t12).zzd(t12);
        if (z12) {
            t12.g(zze.zzb);
        }
        return zZzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzhl
    public final int a(zzlj zzljVar) {
        if (m()) {
            int iZza = zzljVar == null ? zzlf.zza().zza((zzlf) this).zza(this) : zzljVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(c.g(iZza, "serialized size must be non-negative, was "));
        }
        if (c() != Integer.MAX_VALUE) {
            return c();
        }
        int iZza2 = zzljVar == null ? zzlf.zza().zza((zzlf) this).zza(this) : zzljVar.zza(this);
        d(iZza2);
        return iZza2;
    }

    @Override // com.google.android.gms.internal.measurement.zzhl
    public final int c() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzhl
    public final void d(int i12) {
        if (i12 < 0) {
            throw new IllegalStateException(c.g(i12, "serialized size must be non-negative, was "));
        }
        this.zzd = (i12 & Integer.MAX_VALUE) | (this.zzd & BeduinInputModel.MIN_TEXT_VERSION);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzlf.zza().zza((zzlf) this).zzb(this, (zzjf) obj);
        }
        return false;
    }

    public abstract Object g(int i12);

    public int hashCode() {
        if (m()) {
            return zzlf.zza().zza((zzlf) this).zzb(this);
        }
        if (this.zza == 0) {
            this.zza = zzlf.zza().zza((zzlf) this).zzb(this);
        }
        return this.zza;
    }

    public final <MessageType extends zzjf<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType k() {
        return (BuilderType) g(zze.zze);
    }

    public final void l() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean m() {
        return (this.zzd & BeduinInputModel.MIN_TEXT_VERSION) != 0;
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = zzkw.f350940a;
        StringBuilder sbZ = r.z("# ", string);
        zzkw.b(this, sbZ, 0);
        return sbZ.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final void zza(zzio zzioVar) {
        zzlf.zza().zza((zzlf) this).zza((zzlj) this, (zzne) zzir.zza(zzioVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final int zzbw() {
        return a(null);
    }

    public final BuilderType zzby() {
        return (BuilderType) ((zzb) g(zze.zze)).zza((zzb) this);
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final /* synthetic */ zzku zzcd() {
        return (zzb) g(zze.zze);
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final /* synthetic */ zzku zzce() {
        return ((zzb) g(zze.zze)).zza((zzb) this);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final /* synthetic */ zzkr zzcf() {
        return (zzjf) g(zze.zzf);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final boolean zzci() {
        return j(this, true);
    }
}
