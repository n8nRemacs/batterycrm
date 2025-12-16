package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.http.HttpStatus;
import tech.kwik.agent15.alert.InternalErrorAlert;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes.dex */
public final class db4 {
    public final qje a;
    public final hf5 b;
    public final int c;
    public volatile ds4 d;
    public volatile rde e;
    public final bh8 f;
    public final acd g;
    public final ArrayList h;
    public final ArrayList i;
    public final w7c j;
    public final ArrayList k;
    public final int l;
    public volatile int m;
    public volatile int n;
    public volatile boolean o = false;
    public volatile int p;
    public volatile byte q;
    public volatile int r;

    public db4(qje qjeVar, hf5 hf5Var, int i, bbg bbgVar, bh8 bh8Var, rde rdeVar) {
        int i2 = 0;
        this.a = qjeVar;
        this.b = hf5Var;
        this.d = bbgVar;
        this.f = bh8Var;
        this.e = rdeVar;
        this.c = hf5Var == hf5.c ? 2 : hf5Var == hf5.d ? 3 : 1;
        this.h = new ArrayList();
        this.i = new ArrayList();
        new ArrayList();
        this.j = new w7c(new i62(26, this));
        this.k = new ArrayList();
        int iOrdinal = hf5Var.ordinal();
        if (iOrdinal == 0) {
            i2 = 3000;
        } else if (iOrdinal == 2) {
            i2 = i == 1 ? 16384 : 100;
        } else if (iOrdinal == 3) {
            i2 = i == 1 ? 65535 : HttpStatus.SC_MULTIPLE_CHOICES;
        }
        this.l = i2;
        this.g = new acd();
    }

    public final void a(ya4 ya4Var) throws Exception {
        try {
            boolean zA = this.g.a(ya4Var);
            acd acdVar = this.g;
            long j = acdVar.c - acdVar.d;
            if (ya4Var.b() - (this.r + j) > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
                throw new TransportError(14);
            }
            if (!zA) {
                this.f.debug("Discarding " + ya4Var + ", because stream already parsed to " + this.g.d);
                return;
            }
            while (true) {
                if ((!this.o || j < this.p) && (this.o || j < 4)) {
                    return;
                }
                if (!this.o && j >= 4) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                    this.r += this.g.d(byteBufferAllocate);
                    this.q = byteBufferAllocate.get(0);
                    byteBufferAllocate.put(0, (byte) 0);
                    this.p = byteBufferAllocate.getInt();
                    if (this.p > this.l) {
                        throw new InternalErrorAlert("TLS message size too large: " + this.p);
                    }
                    this.o = true;
                    j -= 4;
                }
                if (this.o && j >= this.p) {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(this.p + 4);
                    byteBufferAllocate2.putInt(this.p);
                    byteBufferAllocate2.put(0, this.q);
                    int iD = this.g.d(byteBufferAllocate2);
                    this.r += iD;
                    j -= iD;
                    this.o = false;
                    this.h.add(this.j.o(byteBufferAllocate2, this.d, this.c));
                    if (byteBufferAllocate2.hasRemaining()) {
                        throw new RuntimeException();
                    }
                }
            }
        } catch (IOException unused) {
            throw new RuntimeException();
        }
    }

    public final String b(List list) {
        return "CryptoStream[" + this.b.name().charAt(0) + "|" + ((String) list.stream().map(new m0(12)).map(new m0(13)).collect(Collectors.joining(","))) + "]";
    }

    public final void c(h07 h07Var) {
        byte[] bArrA = h07Var.a();
        this.k.add(ByteBuffer.wrap(bArrA));
        this.n += bArrA.length;
        this.e.g(new ni(12, this), 10, this.b, new m4(7, this));
        this.e.k();
        this.i.add(h07Var);
    }

    public final String toString() {
        return b(Collections.EMPTY_LIST);
    }
}
