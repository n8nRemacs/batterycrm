package com.google.crypto.tink.prf;

import aZ0.j;
import java.util.Map;

@j
/* loaded from: classes6.dex */
public abstract class PrfSet {
    public byte[] computePrimary(byte[] bArr, int i12) {
        return getPrfs().get(Integer.valueOf(getPrimaryId())).compute(bArr, i12);
    }

    public abstract Map<Integer, Prf> getPrfs();

    public abstract int getPrimaryId();
}
