package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.time.Clock;
import java.time.Instant;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import tech.kwik.qpack.impl.HttpQPackDecompressionFailedException;

/* loaded from: classes3.dex */
public final /* synthetic */ class oe5 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oe5(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                af5 af5Var = (af5) this.b;
                ByteBuffer byteBuffer = (ByteBuffer) this.c;
                Map.Entry entry = (Map.Entry) obj;
                Charset charset = af5.b;
                aqc aqcVar = af5Var.a;
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                aqcVar.getClass();
                Objects.requireNonNull(str);
                Objects.requireNonNull(str2);
                int i = -1;
                int i2 = 0;
                while (true) {
                    String[] strArr = (String[]) aqcVar.b;
                    if (i2 < strArr.length) {
                        if (str.equals(strArr[i2])) {
                            if (i < 0) {
                                i = i2;
                            }
                            if (str2.equals(((String[]) aqcVar.c)[i2])) {
                                i = i2;
                            }
                        }
                        i2++;
                    }
                }
                if (i < 0) {
                    byte[] bytes = ((String) entry.getKey()).getBytes(charset);
                    af5.a(3, (byte) 32, bytes.length, byteBuffer);
                    byteBuffer.put(bytes);
                    byte[] bytes2 = ((String) entry.getValue()).getBytes(charset);
                    af5.a(7, (byte) 0, bytes2.length, byteBuffer);
                    byteBuffer.put(bytes2);
                    return;
                }
                String[] strArr2 = (String[]) aqcVar.b;
                if (strArr2[i] == null) {
                    throw new HttpQPackDecompressionFailedException();
                }
                if (((String) new AbstractMap.SimpleImmutableEntry(strArr2[i], ((String[]) aqcVar.c)[i]).getValue()).equals(entry.getValue())) {
                    af5.a(6, (byte) -64, i, byteBuffer);
                    return;
                }
                String str3 = (String) entry.getValue();
                af5.a(4, (byte) 80, i, byteBuffer);
                byte[] bytes3 = str3.getBytes(charset);
                af5.a(7, (byte) 0, bytes3.length, byteBuffer);
                byteBuffer.put(bytes3);
                return;
            case 1:
                m5c m5cVar = (m5c) obj;
                ((b6[]) ((t9f) this.b).b)[m5cVar.ordinal()] = new b6(m5cVar, (rde) this.c);
                return;
            case 2:
                ((olb[]) ((pa5) this.b).b)[((m5c) this.c).a().ordinal()] = null;
                return;
            case 3:
                rde rdeVar = (rde) this.b;
                Instant instant = (Instant) this.c;
                dde ddeVar = (dde) obj;
                lhd lhdVar = rdeVar.m;
                btc btcVar = ddeVar.a;
                Consumer consumer = ddeVar.b;
                if (!lhdVar.p && btcVar.r()) {
                    lk8 lk8Var = lhdVar.e[btcVar.n().ordinal()];
                    synchronized (lk8Var) {
                        try {
                            if (!lk8Var.l) {
                                if (btcVar.r()) {
                                    yga ygaVar = lk8Var.d;
                                    synchronized (ygaVar) {
                                        ygaVar.d(btcVar);
                                    }
                                }
                                if (btcVar.p()) {
                                    lk8Var.h.getAndAdd(1);
                                    lk8Var.k = instant;
                                }
                                lk8Var.g.put(btcVar.m(), new tlb(instant, btcVar, consumer));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    lhdVar.h(false);
                    lhdVar.k();
                }
                vc7 vc7Var = rdeVar.n;
                btc btcVar2 = ddeVar.a;
                if (vc7Var.h && btcVar2.p() && vc7Var.i == 1) {
                    vc7Var.g = instant;
                    vc7Var.i = 2;
                    return;
                }
                return;
            default:
                hf5 hf5Var = (hf5) obj;
                ((rde) this.b).j[hf5Var.ordinal()] = new mde((Clock) this.c, hf5Var);
                return;
        }
    }
}
