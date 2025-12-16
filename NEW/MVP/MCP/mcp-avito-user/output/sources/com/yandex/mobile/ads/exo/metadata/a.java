package com.yandex.mobile.ads.exo.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yandex.mobile.ads.impl.b41;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.ff;
import com.yandex.mobile.ads.impl.fg0;
import com.yandex.mobile.ads.impl.gg0;
import com.yandex.mobile.ads.impl.hg0;
import com.yandex.mobile.ads.impl.ig0;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.vw;
import com.yandex.mobile.ads.impl.vx0;
import com.yandex.mobile.ads.impl.ww;
import j.P;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class a extends ff implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    private final gg0 f382940n;

    /* renamed from: o, reason: collision with root package name */
    private final ig0 f382941o;

    /* renamed from: p, reason: collision with root package name */
    @P
    private final Handler f382942p;

    /* renamed from: q, reason: collision with root package name */
    private final hg0 f382943q;

    /* renamed from: r, reason: collision with root package name */
    @P
    private fg0 f382944r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f382945s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f382946t;

    /* renamed from: u, reason: collision with root package name */
    private long f382947u;

    /* renamed from: v, reason: collision with root package name */
    private long f382948v;

    /* renamed from: w, reason: collision with root package name */
    @P
    private Metadata f382949w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ig0 ig0Var, @P Looper looper) {
        super(5);
        gg0 gg0Var = gg0.f385743a;
        this.f382941o = (ig0) db.a(ig0Var);
        this.f382942p = looper == null ? null : pc1.a(looper, (Handler.Callback) this);
        this.f382940n = (gg0) db.a(gg0Var);
        this.f382943q = new hg0();
        this.f382948v = -9223372036854775807L;
    }

    private boolean c(long j12) {
        Metadata metadata = this.f382949w;
        boolean z12 = false;
        if (metadata != null && this.f382948v <= j12) {
            Handler handler = this.f382942p;
            if (handler != null) {
                handler.obtainMessage(0, metadata).sendToTarget();
            } else {
                this.f382941o.a(metadata);
            }
            this.f382949w = null;
            this.f382948v = -9223372036854775807L;
            z12 = true;
        }
        if (this.f382945s && this.f382949w == null) {
            this.f382946t = true;
        }
        return z12;
    }

    @Override // com.yandex.mobile.ads.impl.vx0
    public final int a(vw vwVar) {
        if (this.f382940n.a(vwVar)) {
            return vx0.a(vwVar.f391168E == 0 ? 4 : 2);
        }
        return vx0.a(0);
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final boolean d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ux0, com.yandex.mobile.ads.impl.vx0
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f382941o.a((Metadata) message.obj);
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public final void u() {
        this.f382949w = null;
        this.f382948v = -9223372036854775807L;
        this.f382944r = null;
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public final void a(vw[] vwVarArr, long j12, long j13) {
        this.f382944r = this.f382940n.b(vwVarArr[0]);
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public final void a(long j12, boolean z12) {
        this.f382949w = null;
        this.f382948v = -9223372036854775807L;
        this.f382945s = false;
        this.f382946t = false;
    }

    private void a(Metadata metadata, ArrayList arrayList) {
        for (int i12 = 0; i12 < metadata.c(); i12++) {
            vw vwVarA = metadata.a(i12).a();
            if (vwVarA != null && this.f382940n.a(vwVarA)) {
                b41 b41VarB = this.f382940n.b(vwVarA);
                byte[] bArrB = metadata.a(i12).b();
                bArrB.getClass();
                this.f382943q.b();
                this.f382943q.e(bArrB.length);
                ByteBuffer byteBuffer = this.f382943q.f390951c;
                int i13 = pc1.f388768a;
                byteBuffer.put(bArrB);
                this.f382943q.h();
                Metadata metadataA = b41VarB.a(this.f382943q);
                if (metadataA != null) {
                    a(metadataA, arrayList);
                }
            } else {
                arrayList.add(metadata.a(i12));
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final boolean a() {
        return this.f382946t;
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final void a(long j12, long j13) {
        boolean zC2 = true;
        while (zC2) {
            if (!this.f382945s && this.f382949w == null) {
                this.f382943q.b();
                ww wwVarQ = q();
                int iA2 = a(wwVarQ, this.f382943q, 0);
                if (iA2 == -4) {
                    if (this.f382943q.f()) {
                        this.f382945s = true;
                    } else {
                        hg0 hg0Var = this.f382943q;
                        hg0Var.f386131i = this.f382947u;
                        hg0Var.h();
                        fg0 fg0Var = this.f382944r;
                        int i12 = pc1.f388768a;
                        Metadata metadataA = fg0Var.a(this.f382943q);
                        if (metadataA != null) {
                            ArrayList arrayList = new ArrayList(metadataA.c());
                            a(metadataA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f382949w = new Metadata(arrayList);
                                this.f382948v = this.f382943q.f390953e;
                            }
                        }
                    }
                } else if (iA2 == -5) {
                    vw vwVar = wwVarQ.f391506b;
                    vwVar.getClass();
                    this.f382947u = vwVar.f391185p;
                }
            }
            zC2 = c(j12);
        }
    }
}
