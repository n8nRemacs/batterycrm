package com.avito.android.mortgage.sign;

import android.graphics.Canvas;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.snapshots.D;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.graphics.n1;
import androidx.compose.ui.graphics.vector.W;
import com.avito.android.mortgage.sign.draw.c;
import com.avito.android.mortgage.sign.motions.MotionEvent;
import java.util.List;
import java.util.ListIterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SignScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class l extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D<com.avito.android.mortgage.sign.draw.c> f203711l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f203712m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Float, Float, G0> f203713n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<List<? extends com.avito.android.mortgage.sign.draw.c>, G0> f203714o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D<Path> f203715p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<l0.n> f203716q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<MotionEvent> f203717r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<l0.g> f203718s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Path> f203719t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<l0.g> f203720u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<MotionEvent> f203721v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ W f203722w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f203723x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f203724y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f203725z;

    /* compiled from: SignScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[MotionEvent.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MotionEvent motionEvent = MotionEvent.f203736b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MotionEvent motionEvent2 = MotionEvent.f203736b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(D<com.avito.android.mortgage.sign.draw.c> d12, Y41.a<G0> aVar, Y41.p<? super Float, ? super Float, G0> pVar, Y41.l<? super List<? extends com.avito.android.mortgage.sign.draw.c>, G0> lVar, D<Path> d13, InterfaceC22204y1<l0.n> interfaceC22204y1, InterfaceC22204y1<MotionEvent> interfaceC22204y12, InterfaceC22204y1<l0.g> interfaceC22204y13, InterfaceC22204y1<Path> interfaceC22204y14, InterfaceC22204y1<l0.g> interfaceC22204y15, InterfaceC22204y1<MotionEvent> interfaceC22204y16, W w12, long j12, float f12, long j13) {
        super(1);
        this.f203711l = d12;
        this.f203712m = aVar;
        this.f203713n = pVar;
        this.f203714o = lVar;
        this.f203715p = d13;
        this.f203716q = interfaceC22204y1;
        this.f203717r = interfaceC22204y12;
        this.f203718s = interfaceC22204y13;
        this.f203719t = interfaceC22204y14;
        this.f203720u = interfaceC22204y15;
        this.f203721v = interfaceC22204y16;
        this.f203722w = w12;
        this.f203723x = j12;
        this.f203724y = f12;
        this.f203725z = j13;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        float f12;
        long j12;
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        this.f203716q.setValue(l0.n.a(gVar2.i()));
        D<com.avito.android.mortgage.sign.draw.c> d12 = this.f203711l;
        boolean zIsEmpty = d12.isEmpty();
        InterfaceC22204y1<MotionEvent> interfaceC22204y1 = this.f203717r;
        InterfaceC22204y1<Path> interfaceC22204y12 = this.f203719t;
        InterfaceC22204y1<l0.g> interfaceC22204y13 = this.f203720u;
        InterfaceC22204y1<l0.g> interfaceC22204y14 = this.f203718s;
        if (zIsEmpty && interfaceC22204y1.getF42167b() != MotionEvent.f203736b) {
            c.b bVar = new c.b(Float.intBitsToFloat((int) (k.b(interfaceC22204y14) >> 32)), Float.intBitsToFloat((int) (interfaceC22204y14.getF42167b().f413387a & 4294967295L)));
            bVar.b(interfaceC22204y12.getF42167b());
            d12.add(bVar);
            this.f203712m.invoke();
            interfaceC22204y13.setValue(l0.g.a(interfaceC22204y14.getF42167b().f413387a));
        }
        int iOrdinal = interfaceC22204y1.getF42167b().ordinal();
        D<Path> d13 = this.f203715p;
        if (iOrdinal == 1) {
            interfaceC22204y13.setValue(l0.g.a(k.b(interfaceC22204y14)));
        } else if (iOrdinal == 2) {
            c.C6071c c6071c = new c.C6071c(Float.intBitsToFloat((int) (k.b(interfaceC22204y14) >> 32)), Float.intBitsToFloat((int) (interfaceC22204y14.getF42167b().f413387a & 4294967295L)), Float.intBitsToFloat((int) (interfaceC22204y13.getF42167b().f413387a >> 32)), Float.intBitsToFloat((int) (interfaceC22204y13.getF42167b().f413387a & 4294967295L)));
            c6071c.b(interfaceC22204y12.getF42167b());
            d12.add(c6071c);
            interfaceC22204y13.setValue(l0.g.a(interfaceC22204y14.getF42167b().f413387a));
        } else if (iOrdinal == 3) {
            interfaceC22204y12.getF42167b().r(Float.intBitsToFloat((int) (k.b(interfaceC22204y14) >> 32)), Float.intBitsToFloat((int) (interfaceC22204y14.getF42167b().f413387a & 4294967295L)));
            if (l0.g.d(interfaceC22204y13.getF42167b().f413387a, interfaceC22204y14.getF42167b().f413387a) && this.f203721v.getF42167b() == MotionEvent.f203737c) {
                this.f203713n.invoke(Float.valueOf(Float.intBitsToFloat((int) (interfaceC22204y14.getF42167b().f413387a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (interfaceC22204y14.getF42167b().f413387a & 4294967295L))));
            } else {
                d12.add(new c.a(Float.intBitsToFloat((int) (interfaceC22204y14.getF42167b().f413387a >> 32)), Float.intBitsToFloat((int) (interfaceC22204y14.getF42167b().f413387a & 4294967295L))));
                this.f203714o.invoke(d12.e().f38613c);
            }
            d13.add(interfaceC22204y12.getF42167b());
            interfaceC22204y12.setValue(C22315w.a());
            d12.clear();
            l0.g.f413384b.getClass();
            interfaceC22204y14.setValue(l0.g.a(l0.g.f413386d));
            interfaceC22204y13.setValue(l0.g.a(interfaceC22204y14.getF42167b().f413387a));
            interfaceC22204y1.setValue(MotionEvent.f203736b);
        }
        M mA2 = gVar2.getF39478c().a();
        Canvas canvas = C22247d.f39473a;
        Canvas canvas2 = ((C22245c) mA2).f39351a;
        long j13 = this.f203723x;
        int iSaveLayer = canvas2.saveLayer(null, null);
        if (d13.isEmpty() && d12.isEmpty()) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.i() >> 32));
            W w12 = this.f203722w;
            float f13 = 2;
            float fIntBitsToFloat2 = (fIntBitsToFloat - Float.intBitsToFloat((int) (w12.getF39738j() >> 32))) / f13;
            float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (gVar2.i() & 4294967295L)) - Float.intBitsToFloat((int) (w12.getF39738j() & 4294967295L))) / f13;
            gVar2.getF39478c().f39485a.f(fIntBitsToFloat2, fIntBitsToFloat3);
            try {
                w12.g(gVar2, w12.getF39738j(), 1.0f, U.a.a(U.f39332b, j13));
            } finally {
                gVar2.getF39478c().f39485a.f(-fIntBitsToFloat2, -fIntBitsToFloat3);
            }
        }
        ListIterator<Path> listIterator = d13.listIterator();
        while (true) {
            boolean zHasNext = listIterator.hasNext();
            f12 = this.f203724y;
            j12 = this.f203725z;
            if (!zHasNext) {
                break;
            }
            Path next = listIterator.next();
            float fM02 = gVar2.M0(f12);
            m1.f39698b.getClass();
            int i12 = m1.f39699c;
            n1.f39707b.getClass();
            androidx.compose.ui.graphics.drawscope.g.n0(gVar2, next, j12, 0.0f, new androidx.compose.ui.graphics.drawscope.o(fM02, 0.0f, i12, n1.f39708c, null, 18, null), 52);
        }
        if (interfaceC22204y1.getF42167b() != MotionEvent.f203736b) {
            Path f42167b = interfaceC22204y12.getF42167b();
            float fM03 = gVar2.M0(f12);
            m1.f39698b.getClass();
            int i13 = m1.f39699c;
            n1.f39707b.getClass();
            androidx.compose.ui.graphics.drawscope.g.n0(gVar2, f42167b, j12, 0.0f, new androidx.compose.ui.graphics.drawscope.o(fM03, 0.0f, i13, n1.f39708c, null, 18, null), 52);
        }
        canvas2.restoreToCount(iSaveLayer);
        return G0.f406611a;
    }
}
