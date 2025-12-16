package defpackage;

import tech.kwik.core.impl.TransportError;

/* loaded from: classes3.dex */
public final class hk6 extends n2 {
    @Override // defpackage.plb
    public final void h(btc btcVar, bj bjVar) throws TransportError {
        if (!(btcVar instanceof upd) && !(btcVar instanceof b0h) && btcVar.c.isEmpty()) {
            F(btcVar, "packet must contain at least one frame");
            throw new TransportError(11, "packet must contain at least one frame");
        }
        if (btcVar instanceof ol7) {
            ol7 ol7Var = (ol7) btcVar;
            if (!ol7Var.c.stream().allMatch(new gb3(12))) {
                F(ol7Var, "packet contains frame type that is not permitted");
                throw new TransportError(11, "packet contains frame type that is not permitted");
            }
        } else if (btcVar instanceof i07) {
            i07 i07Var = (i07) btcVar;
            if (!i07Var.c.stream().allMatch(new gb3(14))) {
                F(i07Var, "packet contains frame type that is not permitted");
                throw new TransportError(11, "packet contains frame type that is not permitted");
            }
        } else if (btcVar instanceof i7i) {
            i7i i7iVar = (i7i) btcVar;
            if (i7iVar.c.stream().anyMatch(new gb3(13))) {
                F(i7iVar, "packet contains frame type that is not permitted");
                throw new TransportError(11, "packet contains frame type that is not permitted");
            }
        }
        a0(btcVar, bjVar);
    }
}
