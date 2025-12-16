package Fc1;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22204y1;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class J1 {

    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.layout.A, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.unit.u> f5023l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22204y1<androidx.compose.ui.unit.u> interfaceC22204y1) {
            super(1);
            this.f5023l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.layout.A a12) {
            this.f5023l.setValue(androidx.compose.ui.unit.u.a(a12.a()));
            return kotlin.G0.f406611a;
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<String> f5024l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, kotlin.G0> f5025m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13642j0 f5026n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Integer> f5027o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.unit.u> f5028p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC22204y1<String> interfaceC22204y1, Y41.l<? super String, kotlin.G0> lVar, InterfaceC13642j0 interfaceC13642j0, InterfaceC22204y1<Integer> interfaceC22204y12, InterfaceC22204y1<androidx.compose.ui.unit.u> interfaceC22204y13) {
            super(1);
            this.f5024l = interfaceC22204y1;
            this.f5025m = lVar;
            this.f5026n = interfaceC13642j0;
            this.f5027o = interfaceC22204y12;
            this.f5028p = interfaceC22204y13;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(String str) {
            long j12;
            String str2 = str;
            this.f5024l.setValue(str2);
            this.f5025m.invoke(str2);
            InterfaceC22204y1<Integer> interfaceC22204y1 = this.f5027o;
            int iIntValue = interfaceC22204y1.getF42167b().intValue();
            int i12 = kotlin.jvm.internal.J.f406821a;
            InterfaceC22204y1<androidx.compose.ui.unit.u> interfaceC22204y12 = this.f5028p;
            if (iIntValue != 0) {
                if (interfaceC22204y1.getF42167b().intValue() != ((int) (interfaceC22204y12.getF42167b().f42872a & 4294967295L))) {
                    this.f5026n.a(((int) (interfaceC22204y12.getF42167b().f42872a & 4294967295L)) - interfaceC22204y1.getF42167b().intValue());
                    j12 = interfaceC22204y12.getF42167b().f42872a;
                }
                return kotlin.G0.f406611a;
            }
            j12 = interfaceC22204y12.getF42167b().f42872a;
            interfaceC22204y1.setValue(Integer.valueOf((int) (j12 & 4294967295L)));
            return kotlin.G0.f406611a;
        }
    }

    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C13765w7 f5029l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13779y3 f5030m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C13765w7 c13765w7, InterfaceC13779y3 interfaceC13779y3) {
            super(2);
            this.f5029l = c13765w7;
            this.f5030m = interfaceC13779y3;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                String str = this.f5029l.f5878b;
                androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
                InterfaceC13779y3 interfaceC13779y3 = this.f5030m;
                D2 d2J = interfaceC13779y3.j();
                N7 n7B = interfaceC13779y3.B();
                androidx.compose.ui.text.style.i.f42675b.getClass();
                C13698p2.a(str, vVarD, d2J, n7B, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42680g), a13, 48, 0);
            }
            return kotlin.G0.f406611a;
        }
    }

    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, kotlin.G0> f5031l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f5032m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i12, Y41.l lVar) {
            super(2);
            this.f5031l = lVar;
            this.f5032m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f5032m | 1);
            J1.a(this.f5031l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @kotlin.jvm.internal.s0
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l f5033l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.l lVar) {
            super(1);
            this.f5033l = lVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(String str) {
            this.f5033l.invoke(str);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Y41.l<? super java.lang.String, kotlin.G0> r198, @Y61.l androidx.compose.runtime.A r199, int r200) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.J1.a(Y41.l, androidx.compose.runtime.A, int):void");
    }
}
