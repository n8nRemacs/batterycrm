package Fc1;

import androidx.compose.material3.Wf;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.unit.h;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.d5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13593d5 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f5453a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5454b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5455c;

    /* renamed from: Fc1.d5$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<androidx.compose.runtime.snapshots.D<P7>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.snapshots.D<P7> f5456l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.runtime.snapshots.D<P7> d12) {
            super(0);
            this.f5456l = d12;
        }

        @Override // Y41.a
        public final androidx.compose.runtime.snapshots.D<P7> invoke() {
            return this.f5456l;
        }
    }

    /* renamed from: Fc1.d5$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<P7, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f5457l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ I6 f5458m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Float, kotlin.G0> f5459n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Float> f5460o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC22204y1<Boolean> interfaceC22204y1, I6 i62, Y41.l<? super Float, kotlin.G0> lVar, InterfaceC22204y1<Float> interfaceC22204y12) {
            super(1);
            this.f5457l = interfaceC22204y1;
            this.f5458m = i62;
            this.f5459n = lVar;
            this.f5460o = interfaceC22204y12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(P7 p72) {
            float f12;
            this.f5457l.setValue(Boolean.TRUE);
            int iOrdinal = this.f5458m.d().ordinal();
            InterfaceC22204y1<Float> interfaceC22204y1 = this.f5460o;
            String str = p72.f5151d;
            if (iOrdinal != 8) {
                if (iOrdinal == 10) {
                    f12 = Integer.parseInt(str) - 0.5f;
                }
                this.f5459n.invoke(Float.valueOf(interfaceC22204y1.getF42167b().floatValue()));
                return kotlin.G0.f406611a;
            }
            f12 = Integer.parseInt(str) + 0.5f;
            interfaceC22204y1.setValue(Float.valueOf(f12));
            this.f5459n.invoke(Float.valueOf(interfaceC22204y1.getF42167b().floatValue()));
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.d5$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Float, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f5461l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Float> f5462m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC22204y1<Boolean> interfaceC22204y1, InterfaceC22204y1<Float> interfaceC22204y12) {
            super(1);
            this.f5461l = interfaceC22204y1;
            this.f5462m = interfaceC22204y12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Float f12) {
            float fFloatValue = f12.floatValue();
            this.f5461l.setValue(Boolean.TRUE);
            this.f5462m.setValue(Float.valueOf(fFloatValue));
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.d5$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Float, kotlin.G0> f5463l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Float> f5464m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar, InterfaceC22204y1 interfaceC22204y1) {
            super(0);
            this.f5463l = lVar;
            this.f5464m = interfaceC22204y1;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            InterfaceC22204y1<Float> interfaceC22204y1 = this.f5464m;
            interfaceC22204y1.setValue(Float.valueOf(((int) interfaceC22204y1.getF42167b().floatValue()) + 0.5f));
            this.f5463l.invoke(Float.valueOf(interfaceC22204y1.getF42167b().floatValue()));
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.d5$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.q<Wf, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f5465l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(3);
            this.f5465l = interfaceC22204y1;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(Wf wf2, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                C13603e6.a(this.f5465l.getF42167b().booleanValue(), a13, 0);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.d5$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.q<Wf, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f5466l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(3);
            this.f5466l = interfaceC22204y1;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(Wf wf2, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                C13737t6.a(this.f5466l.getF42167b().booleanValue(), a13, 0);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.d5$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, kotlin.G0> f5467l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f5468m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i12, Y41.l lVar) {
            super(2);
            this.f5467l = lVar;
            this.f5468m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f5468m | 1);
            C13593d5.a(this.f5467l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @kotlin.jvm.internal.s0
    /* renamed from: Fc1.d5$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<Float, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I6 f5469l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f5470m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(I6 i62, Y41.l lVar) {
            super(1);
            this.f5469l = i62;
            this.f5470m = lVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Float f12) {
            float f13;
            float fFloatValue = f12.floatValue();
            int iOrdinal = this.f5469l.d().ordinal();
            Y41.l lVar = this.f5470m;
            if (iOrdinal != 8) {
                if (iOrdinal == 10) {
                    f13 = fFloatValue + 0.5f;
                }
                return kotlin.G0.f406611a;
            }
            f13 = fFloatValue - 0.5f;
            lVar.invoke(Integer.valueOf((int) f13));
            return kotlin.G0.f406611a;
        }
    }

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f5453a = 4;
        f5454b = 2;
        f5455c = 48;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Y41.l<? super java.lang.Integer, kotlin.G0> r24, @Y61.l androidx.compose.runtime.A r25, int r26) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.C13593d5.a(Y41.l, androidx.compose.runtime.A, int):void");
    }
}
