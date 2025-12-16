package com.google.android.gms.internal.measurement;

import AK.c;
import androidx.camera.camera2.internal.G;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzhn;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public abstract class zzhl<MessageType extends zzhl<MessageType, BuilderType>, BuilderType extends zzhn<MessageType, BuilderType>> implements zzkr {
    protected int zza = 0;

    public static <T> void b(Iterable<T> iterable, List<? super T> list) {
        Charset charset = zzjh.f350896a;
        iterable.getClass();
        if (iterable instanceof zzjx) {
            List<?> listZzb = ((zzjx) iterable).zzb();
            zzjx zzjxVar = (zzjx) list;
            int size = list.size();
            for (Object obj : listZzb) {
                if (obj == null) {
                    String strE = G.e(zzjxVar.size() - size, "Element at index ", " is null.");
                    for (int size2 = zzjxVar.size() - 1; size2 >= size; size2--) {
                        zzjxVar.remove(size2);
                    }
                    throw new NullPointerException(strE);
                }
                if (obj instanceof zzhu) {
                    zzjxVar.zza((zzhu) obj);
                } else {
                    zzjxVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzld) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t12 : iterable) {
            if (t12 == null) {
                String strE2 = G.e(list.size() - size3, "Element at index ", " is null.");
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(strE2);
            }
            list.add(t12);
        }
    }

    public int a(zzlj zzljVar) {
        int iC2 = c();
        if (iC2 != -1) {
            return iC2;
        }
        int iZza = zzljVar.zza(this);
        d(iZza);
        return iZza;
    }

    public int c() {
        throw new UnsupportedOperationException();
    }

    public void d(int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final zzhu zzbu() {
        try {
            int iZzbw = zzbw();
            zzhu zzhuVar = zzhu.zza;
            zzid zzidVar = new zzid(iZzbw, null);
            zza(zzidVar.zzb());
            return zzidVar.zza();
        } catch (IOException e12) {
            throw new RuntimeException(c.k("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e12);
        }
    }

    public final byte[] zzbv() {
        try {
            byte[] bArr = new byte[zzbw()];
            zzio zzioVarZzb = zzio.zzb(bArr);
            zza(zzioVarZzb);
            zzioVarZzb.zzb();
            return bArr;
        } catch (IOException e12) {
            throw new RuntimeException(c.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e12);
        }
    }
}
