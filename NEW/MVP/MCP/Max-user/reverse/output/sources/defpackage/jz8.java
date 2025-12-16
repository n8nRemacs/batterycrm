package defpackage;

import one.me.sdk.media.transformer.impl.MediaInfoRetriever$InvalidMediaTrackException;

/* loaded from: classes2.dex */
public final class jz8 implements sfg {
    public hf6 a;
    public final bwf b = new bwf(new c38(19));

    @Override // defpackage.sfg
    public final void a(long j, int i, int i2, int i3, qfg qfgVar) {
    }

    @Override // defpackage.sfg
    public final void b(umb umbVar, int i, int i2) {
        while (i > 0) {
            bwf bwfVar = this.b;
            int iMin = Math.min(i, ((byte[]) bwfVar.getValue()).length);
            umbVar.h(0, (byte[]) bwfVar.getValue(), iMin);
            i -= iMin;
        }
    }

    @Override // defpackage.sfg
    public final int c(ke4 ke4Var, int i, boolean z) {
        int i2 = i;
        while (i2 > 0) {
            bwf bwfVar = this.b;
            int i3 = ke4Var.read((byte[]) bwfVar.getValue(), 0, Math.min(i2, ((byte[]) bwfVar.getValue()).length));
            if (i3 == -1) {
                throw new MediaInfoRetriever$InvalidMediaTrackException("Unexpected end of track");
            }
            i2 -= i3;
        }
        return i;
    }

    @Override // defpackage.sfg
    public final void d(hf6 hf6Var) {
        this.a = hf6Var;
    }
}
