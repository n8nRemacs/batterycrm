package com.akita.compose.component.gradient.radial;

import Y41.l;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.S;
import androidx.compose.ui.graphics.W0;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.drawscope.g;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.g;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: GradientRadial.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class a extends N implements l<g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f61649l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f61650m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W0 f61651n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W0 f61652o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(float f12, long j12, W0 w02, W0 w03) {
        super(1);
        this.f61649l = f12;
        this.f61650m = j12;
        this.f61651n = w02;
        this.f61652o = w03;
    }

    @Override // Y41.l
    public final G0 invoke(g gVar) throws Throwable {
        long j12;
        a.b bVar;
        long j13;
        a.b bVar2;
        g gVar2 = gVar;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.v1() >> 32));
        float f12 = this.f61649l;
        float f13 = f12 / 2;
        float f14 = fIntBitsToFloat - f13;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gVar2.v1() & 4294967295L)) - f13;
        long j14 = this.f61650m;
        W0 w02 = this.f61651n;
        W0 w03 = this.f61652o;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (gVar2.i() >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (gVar2.i() & 4294967295L));
        S.f39317b.getClass();
        int i12 = S.f39318c;
        a.b f39478c = gVar2.getF39478c();
        long jE2 = f39478c.e();
        f39478c.a().k();
        try {
            f39478c.f39485a.b(0.0f, 0.0f, fIntBitsToFloat3, fIntBitsToFloat4, i12);
            gVar2.getF39478c().f39485a.f(f14, fIntBitsToFloat2);
            try {
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (gVar2.i() >> 32)) / f12;
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (gVar2.i() & 4294967295L)) / f12;
                try {
                    float fIntBitsToFloat7 = Float.intBitsToFloat((int) (gVar2.v1() >> 32)) - f14;
                    float fIntBitsToFloat8 = Float.intBitsToFloat((int) (gVar2.v1() & 4294967295L)) - fIntBitsToFloat2;
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat8) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat7) << 32);
                    g.a aVar = l0.g.f413384b;
                    a.b f39478c2 = gVar2.getF39478c();
                    long jE3 = f39478c2.e();
                    f39478c2.a().k();
                    try {
                        f39478c2.f39485a.e(fIntBitsToFloat5, fIntBitsToFloat6, jFloatToRawIntBits);
                    } catch (Throwable th2) {
                        th = th2;
                        j13 = jE3;
                        bVar2 = f39478c2;
                        bVar = f39478c;
                        j12 = jE2;
                    }
                    try {
                        androidx.compose.ui.graphics.drawscope.g.c0(gVar2, j14, 0L, 0L, 0.0f, null, WebSocketProtocol.PAYLOAD_SHORT);
                        androidx.compose.ui.graphics.drawscope.g.e0(gVar2, w02, 0L, 0L, 0.0f, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                        androidx.compose.ui.graphics.drawscope.g.e0(gVar2, w03, 0L, 0L, 0.0f, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                        try {
                            f39478c2.a().i();
                            f39478c2.j(jE3);
                        } catch (Throwable th3) {
                            th = th3;
                            j12 = jE2;
                            bVar = f39478c;
                            try {
                                gVar2.getF39478c().f39485a.f(-f14, -fIntBitsToFloat2);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                                H.C(bVar, j12);
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        bVar2 = f39478c2;
                        j12 = jE2;
                        j13 = jE3;
                        bVar = f39478c;
                        try {
                            bVar2.a().i();
                            bVar2.j(j13);
                            throw th;
                        } catch (Throwable th6) {
                            th = th6;
                            gVar2.getF39478c().f39485a.f(-f14, -fIntBitsToFloat2);
                            throw th;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    bVar = f39478c;
                    j12 = jE2;
                }
            } catch (Throwable th8) {
                th = th8;
                j12 = jE2;
                bVar = f39478c;
            }
        } catch (Throwable th9) {
            th = th9;
            j12 = jE2;
            bVar = f39478c;
        }
        try {
            gVar2.getF39478c().f39485a.f(-f14, -fIntBitsToFloat2);
            H.C(f39478c, jE2);
            return G0.f406611a;
        } catch (Throwable th10) {
            th = th10;
            j12 = jE2;
            bVar = f39478c;
            H.C(bVar, j12);
            throw th;
        }
    }
}
