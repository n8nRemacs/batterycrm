package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.camera.camera2.internal.G;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck;
import java.io.IOException;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public abstract class zzck<MessageType extends zzck<MessageType, BuilderType>, BuilderType extends zzcj<MessageType, BuilderType>> implements zzfl {
    protected int zzb = 0;

    public int a() {
        throw null;
    }

    public void b(int i12) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl
    public final zzdb zzC() {
        try {
            int iZzE = zzE();
            zzdb zzdbVar = zzdb.zzb;
            byte[] bArr = new byte[iZzE];
            zzdi zzdiVarZzF = zzdi.zzF(bArr);
            zzW(zzdiVarZzF);
            zzdiVarZzF.zzG();
            return new zzcz(bArr);
        } catch (IOException e12) {
            String name = getClass().getName();
            throw new RuntimeException(G.g(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e12);
        }
    }
}
