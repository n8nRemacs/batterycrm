package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class bwi extends wti {
    public final byte[] e;

    public bwi(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.e = bArr;
    }

    @Override // defpackage.wti
    public final byte[] X() {
        return this.e;
    }
}
