package com.google.android.gms.internal.measurement;

import AK.c;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzhn;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public abstract class zzhn<MessageType extends zzhl<MessageType, BuilderType>, BuilderType extends zzhn<MessageType, BuilderType>> implements zzku {
    public final String a() {
        return c.k("Reading ", getClass().getName(), " from a byte array threw an IOException (should never happen).");
    }

    @Override // 
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzb(zzij zzijVar, zzis zzisVar);

    public BuilderType zza(byte[] bArr, int i12, int i13) throws zzjq {
        try {
            zzij zzijVarA = zzij.a(i13, bArr);
            zzb(zzijVarA, zzis.f350872c);
            zzijVarA.zzb(0);
            return this;
        } catch (zzjq e12) {
            throw e12;
        } catch (IOException e13) {
            throw new RuntimeException(a(), e13);
        }
    }

    @Override // 
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i12, int i13, zzis zzisVar) throws zzjq {
        try {
            zzij zzijVarA = zzij.a(i13, bArr);
            zzb(zzijVarA, zzisVar);
            zzijVarA.zzb(0);
            return this;
        } catch (zzjq e12) {
            throw e12;
        } catch (IOException e13) {
            throw new RuntimeException(a(), e13);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzku
    public final /* synthetic */ zzku zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzku
    public final /* synthetic */ zzku zza(byte[] bArr, zzis zzisVar) {
        return zza(bArr, 0, bArr.length, zzisVar);
    }
}
