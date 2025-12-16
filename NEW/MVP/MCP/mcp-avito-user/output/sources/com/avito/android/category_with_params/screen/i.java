package com.avito.android.category_with_params.screen;

import Y41.p;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.C20646z1;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.accordion.s;
import com.akita.compose.component.list_item.m;
import com.avito.android.category_with_params.entity.ListItem;
import com.avito.android.remote.model.UniversalImage;
import fo.InterfaceC40453a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: OptionItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_category-with-params_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i {

    /* compiled from: OptionItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC40453a, G0> f117736l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ListItem.Option f117737m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super InterfaceC40453a, G0> lVar, ListItem.Option option) {
            super(0);
            this.f117736l = lVar;
            this.f117737m = option;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f117736l.invoke(new InterfaceC40453a.b(this.f117737m.f117676b));
            return G0.f406611a;
        }
    }

    /* compiled from: OptionItem.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22096n f117738l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C22096n c22096n) {
            super(2);
            this.f117738l = c22096n;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = v.f42878y1;
                FillElement fillElement = C20588k2.f28681b;
                aVar.d0(fillElement);
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.ui.i iVar = InterfaceC22215f.a.f39080f;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                v vVarA = androidx.compose.ui.draw.k.a(C20588k2.o(C20588k2.x(fillElement, iVar, 2), 48), o.a(16));
                com.akita.compose.theme.re23.b.f63983a.getClass();
                v vVarB = androidx.compose.foundation.A.b(vVarA, com.akita.compose.theme.re23.b.f63984b.f63879R.c(a13), Y0.f39346a);
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = n.c(a13, vVarB);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                a13.C(1427948651);
                C22096n c22096n = this.f117738l;
                if (c22096n != null) {
                    c22096n.invoke(a13, 0);
                }
                a13.h();
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OptionItem.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22096n f117739l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C22096n c22096n) {
            super(2);
            this.f117739l = c22096n;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = v.f42878y1;
                FillElement fillElement = C20588k2.f28681b;
                aVar.d0(fillElement);
                InterfaceC22215f.f39074a.getClass();
                v vVarW = C20588k2.w(fillElement, InterfaceC22215f.a.f39086l, 2);
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = n.c(a13, vVarW);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                a13.C(1427969803);
                C22096n c22096n = this.f117739l;
                if (c22096n != null) {
                    c22096n.invoke(a13, 0);
                }
                a13.h();
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OptionItem.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ListItem.Option f117740l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ListItem.Option option) {
            super(2);
            this.f117740l = option;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = v.f42878y1;
                FillElement fillElement = C20588k2.f28681b;
                aVar.d0(fillElement);
                InterfaceC22215f.f39074a.getClass();
                v vVarW = C20588k2.w(fillElement, InterfaceC22215f.a.f39086l, 2);
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = n.c(a13, vVarW);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                String str = this.f117740l.f117677c;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65241l, null, false, 0L, null, 1, 0, false, null, a13, 1572864, 956);
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OptionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ListItem.Option f117741l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ float f117742m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f117743n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC40453a, G0> f117744o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(ListItem.Option option, float f12, boolean z12, Y41.l<? super InterfaceC40453a, G0> lVar, int i12) {
            super(2);
            this.f117741l = option;
            this.f117742m = f12;
            this.f117743n = z12;
            this.f117744o = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(57);
            i.a(this.f117741l, this.f117742m, this.f117743n, this.f117744o, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: OptionItem.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f117745l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Uri f117746m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC22204y1<Boolean> interfaceC22204y1, Uri uri) {
            super(2);
            this.f117745l = interfaceC22204y1;
            this.f117746m = uri;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                v vVarO = C20588k2.o(v.f42878y1, 48);
                androidx.compose.foundation.shape.n nVarA = o.a(16);
                InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f117745l;
                v vVarC = com.akita.compose.component.skeleton.b.c(vVarO, nVarA, null, interfaceC22204y1.getF42167b().booleanValue(), a13, 6, 2);
                InterfaceC22374n.f40491a.getClass();
                InterfaceC22374n.a.C1667a c1667a = InterfaceC22374n.a.f40493b;
                a13.C(1427905600);
                Object objT = a13.t();
                A.f37866a.getClass();
                A.a.C1651a c1651a = A.a.f37868b;
                if (objT == c1651a) {
                    objT = new j(interfaceC22204y1);
                    a13.H(objT);
                }
                Y41.l lVar = (Y41.l) objT;
                a13.h();
                a13.C(1427907489);
                Object objT2 = a13.t();
                if (objT2 == c1651a) {
                    objT2 = new k(interfaceC22204y1);
                    a13.H(objT2);
                }
                Y41.l lVar2 = (Y41.l) objT2;
                a13.h();
                a13.C(1427909344);
                Object objT3 = a13.t();
                if (objT3 == c1651a) {
                    objT3 = new l(interfaceC22204y1);
                    a13.H(objT3);
                }
                a13.h();
                coil.compose.v.a(this.f117746m, null, vVarC, null, null, null, lVar, lVar2, (Y41.l) objT3, null, c1667a, null, a13, 114819128, 6, 64056);
            }
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k ListItem.Option option, float f12, boolean z12, @Y61.k Y41.l<? super InterfaceC40453a, G0> lVar, @Y61.l A a12, int i12) {
        Uri uriA;
        C22096n c22096n;
        B bE2 = a12.E(711831481);
        bE2.C(525923689);
        UniversalImage universalImage = option.f117679e;
        if (universalImage == null) {
            uriA = null;
        } else {
            float f13 = 48;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            uriA = com.avito.android.category_with_params.util.b.a(universalImage, f13, f13, bE2);
        }
        Object objI = s.i(525925607, bE2, false);
        A.f37866a.getClass();
        if (objI == A.a.f37868b) {
            objI = C22126m3.g(Boolean.FALSE);
            bE2.H(objI);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objI;
        bE2.X(false);
        bE2.C(525929152);
        C22096n c22096nC = uriA == null ? null : androidx.compose.runtime.internal.r.c(-963034615, new f(interfaceC22204y1, uriA), bE2);
        bE2.X(false);
        if (option.f117678d) {
            h.f117733a.getClass();
            c22096n = h.f117734b;
        } else {
            c22096n = null;
        }
        v vVarA = C20646z1.a(R1.k(f12, 0.0f, 2, C21086w0.c(v.f42878y1, z12, null, null, new a(lVar, option), 6)), IntrinsicSize.f28333b);
        com.akita.compose.component.list_item.s sVarG = com.avito.android.bxcontent.mvi.entity.f.g(com.akita.compose.theme.re23.b.f63983a, bE2);
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        m.c(com.akita.compose.component.list_item.s.a(sVarG, R1.c(0.0f, 7, 1), null, null, 510), vVarA, null, androidx.compose.runtime.internal.r.c(607915832, new b(c22096nC), bE2), androidx.compose.runtime.internal.r.c(752325527, new c(c22096n), bE2), androidx.compose.runtime.internal.r.c(896735222, new d(option), bE2), bE2, 224640, 0);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(option, f12, z12, lVar, i12);
        }
    }
}
