package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.function.BiFunction;
import tech.kwik.core.impl.InvalidPacketException;

/* loaded from: classes3.dex */
public final class qb3 {
    public final fs3 a;
    public final qje b;
    public final int c;
    public final zsc d;
    public final bh8 e;
    public final long[] f = new long[m5c.values().length];
    public final BiFunction g;
    public volatile byte[] h;

    public qb3(fs3 fs3Var, qje qjeVar, int i, byte[] bArr, zsc zscVar, usc uscVar, bh8 bh8Var) {
        this.a = fs3Var;
        this.b = qjeVar;
        this.c = i;
        this.d = zscVar;
        this.g = uscVar;
        this.e = bh8Var;
        this.h = bArr;
    }

    public final btc a(ByteBuffer byteBuffer) {
        btc i07Var;
        hc hcVarF;
        if (byteBuffer.remaining() < 2) {
            throw new InvalidPacketException("packet too short to be valid QUIC packet");
        }
        byte b = byteBuffer.get();
        if ((b & 64) != 64) {
            throw new InvalidPacketException();
        }
        if ((b & 128) != 128) {
            zzg zzgVar = (zzg) this.b.b;
            btc rweVar = new rwe();
            rweVar.a = zzgVar;
            i07Var = rweVar;
        } else {
            if (byteBuffer.remaining() + 1 < 7) {
                throw new InvalidPacketException("packet too short to be valid QUIC long header packet");
            }
            int i = (b & 48) >> 4;
            int i2 = byteBuffer.getInt();
            zzg zzgVar2 = new zzg(i2);
            zzg zzgVar3 = (zzg) this.b.b;
            if (i2 == 0) {
                b0h b0hVar = new b0h();
                b0hVar.i = new ArrayList();
                b0hVar.a = zzgVar3;
                i07Var = b0hVar;
            } else if (!zzgVar2.b() ? i != 0 : i != 1) {
                ol7 ol7Var = new ol7(zzgVar2);
                ol7Var.h = null;
                i07Var = ol7Var;
            } else if (!zzgVar2.b() ? i != 3 : i != 0) {
                btc updVar = new upd();
                updVar.a = zzgVar3;
                i07Var = updVar;
            } else {
                if (!zzgVar2.b() ? i == 2 : i == 3) {
                    if (!zzgVar2.b() ? i == 1 : i == 2) {
                        throw new RuntimeException();
                    }
                    throw new InvalidPacketException();
                }
                i07Var = new i07(zzgVar3);
            }
        }
        btc btcVar = i07Var;
        if (btcVar.l() != null) {
            if (btcVar.a.equals((zzg) this.b.b)) {
                hcVarF = this.a.f(btcVar.l());
            } else {
                if (btcVar.l() == hf5.d || btcVar.l() == hf5.c) {
                    this.e.warn("Dropping packet not using negotiated version");
                    throw new InvalidPacketException("invalid version");
                }
                if (btcVar.l() != hf5.a) {
                    this.e.warn("Dropping packet not using negotiated version");
                    throw new InvalidPacketException("invalid version");
                }
                this.e.info("Receiving packet with version " + btcVar.a + ", while connection version is " + this.b);
                fs3 fs3Var = new fs3(new qje(btcVar.a), new jbe(25));
                fs3Var.b(this.h);
                hcVarF = fs3Var.f(btcVar.l());
            }
            btcVar.s(byteBuffer, hcVarF, btcVar.n() != null ? this.f[btcVar.n().ordinal()] : 0L, this.e, this.c);
        } else {
            btcVar.s(byteBuffer, null, 0L, this.e, 0);
        }
        if (btcVar.m() != null && btcVar.m().longValue() > this.f[btcVar.n().ordinal()]) {
            this.f[btcVar.n().ordinal()] = btcVar.m().longValue();
        }
        return btcVar;
    }
}
