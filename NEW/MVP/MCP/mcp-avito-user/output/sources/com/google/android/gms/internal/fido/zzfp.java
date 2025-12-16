package com.google.android.gms.internal.fido;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
abstract class zzfp extends zzfr {
    public zzfp() {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
    }

    public void a(int i12, byte[] bArr) {
        throw null;
    }

    @Override // com.google.android.gms.internal.fido.zzfr, com.google.android.gms.internal.fido.zzfv
    public final zzfv zza(byte[] bArr) {
        bArr.getClass();
        a(bArr.length, bArr);
        return this;
    }
}
