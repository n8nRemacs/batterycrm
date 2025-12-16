package com.avito.android.beduin.v2.page.impl.compose.screen;

import Hi.e;
import androidx.appcompat.app.r;
import androidx.compose.foundation.O0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import bU.C25564h;
import com.akita.compose.component.button.t;
import com.akita.compose.component.modal.C;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.interaction.detached.flow.modal.ModalButtonsOrientation;
import com.avito.beduin.v2.interaction.detached.flow.modal.a;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinModal.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_beduin-v2-page_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: BeduinModal.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e.b f105015l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C f105016m;

        /* compiled from: BeduinModal.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.v2.page.impl.compose.screen.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3135a {
            static {
                int[] iArr = new int[ModalButtonsOrientation.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ModalButtonsOrientation.a aVar = ModalButtonsOrientation.f337340b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e.b bVar, C c12) {
            super(2);
            this.f105015l = bVar;
            this.f105016m = c12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                e.b bVar = this.f105015l;
                ModalButtonsOrientation modalButtonsOrientation = bVar.f7627d;
                if (modalButtonsOrientation == null) {
                    modalButtonsOrientation = ModalButtonsOrientation.f337342d;
                }
                int iOrdinal = modalButtonsOrientation.ordinal();
                List<C36216a> list = bVar.f7626c;
                C c12 = this.f105016m;
                if (iOrdinal == 0) {
                    a13.C(-793647112);
                    C20585k c20585k = C20585k.f28659a;
                    float f12 = c12.f61995m;
                    c20585k.getClass();
                    C20585k.j jVarG = C20585k.g(f12);
                    v.a aVar = v.f42878y1;
                    InterfaceC22215f.f39074a.getClass();
                    C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39085k, a13, 0);
                    int f37888q = a13.getF37888Q();
                    O1 o1Y = a13.y();
                    v vVarC = androidx.compose.ui.n.c(a13, aVar);
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
                    R3.b(InterfaceC22413h.a.f40796g, a13, c20568f2A);
                    R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                    Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                    if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                        r.B(f37888q, a13, f37888q, pVar);
                    }
                    R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                    C20576h2 c20576h2 = C20576h2.f28641a;
                    a13.C(573197899);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        b.b((C36216a) it.next(), c20576h2.a(v.f42878y1, 1.0f, true), a13, 8);
                    }
                    a13.h();
                    a13.z();
                    a13.h();
                } else if (iOrdinal != 1) {
                    a13.C(-792680098);
                    a13.h();
                } else {
                    a13.C(-793139053);
                    C20585k c20585k2 = C20585k.f28659a;
                    float f13 = c12.f61995m;
                    c20585k2.getClass();
                    C20585k.j jVarG2 = C20585k.g(f13);
                    v.a aVar3 = v.f42878y1;
                    InterfaceC22215f.f39074a.getClass();
                    I iA2 = H.a(jVarG2, InterfaceC22215f.a.f39088n, a13, 0);
                    int f37888q2 = a13.getF37888Q();
                    O1 o1Y2 = a13.y();
                    v vVarC2 = androidx.compose.ui.n.c(a13, aVar3);
                    InterfaceC22413h.f40789C1.getClass();
                    Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
                    if (a13.F() == null) {
                        C22190v.b();
                        throw null;
                    }
                    a13.A();
                    if (a13.getF37887P()) {
                        a13.b(aVar4);
                    } else {
                        a13.d();
                    }
                    R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
                    R3.b(InterfaceC22413h.a.f40795f, a13, o1Y2);
                    Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
                    if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                        r.B(f37888q2, a13, f37888q2, pVar2);
                    }
                    R3.b(InterfaceC22413h.a.f40793d, a13, vVarC2);
                    K k12 = K.f28344a;
                    a13.C(573214319);
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        b.b((C36216a) it2.next(), C20588k2.d(v.f42878y1, 1.0f), a13, 56);
                    }
                    a13.h();
                    a13.z();
                    a13.h();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinModal.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin.v2.page.impl.compose.screen.b$b, reason: collision with other inner class name */
    public static final class C3136b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f105017l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e.b f105018m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3136b(e.b bVar, Y41.a aVar) {
            super(0);
            this.f105017l = aVar;
            this.f105018m = bVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f105017l.invoke();
            e.b bVar = this.f105018m;
            bVar.f7632i.invoke();
            Y41.a<G0> aVar = bVar.f7629f;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinModal.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e.b f105019l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e.b bVar) {
            super(2);
            this.f105019l = bVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.avito.beduin.v2.interaction.detached.flow.modal.a aVar = this.f105019l.f7630g;
                if (aVar instanceof a.C10453a) {
                    v.a aVar2 = v.f42878y1;
                    a.C10453a c10453a = (a.C10453a) aVar;
                    float f12 = c10453a.f337347c;
                    h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                    coil.compose.v.b(O0.a(a13) ? c10453a.f337346b : c10453a.f337345a, null, C20588k2.q(aVar2, f12, c10453a.f337348d), null, null, null, a13, 48, 4088);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinModal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e.b f105020l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f105021m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e.b bVar, Y41.a<G0> aVar, int i12) {
            super(2);
            this.f105020l = bVar;
            this.f105021m = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            b.a(this.f105020l, this.f105021m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinModal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105022a;

        static {
            int[] iArr = new int[ModalButtonsOrientation.values().length];
            try {
                ModalButtonsOrientation.a aVar = ModalButtonsOrientation.f337340b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ModalButtonsOrientation.a aVar2 = ModalButtonsOrientation.f337340b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f105022a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Hi.e.b r23, @Y61.k Y41.a<kotlin.G0> r24, @Y61.l androidx.compose.runtime.A r25, int r26) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.v2.page.impl.compose.screen.b.a(Hi.e$b, Y41.a, androidx.compose.runtime.A, int):void");
    }

    public static final void b(C36216a c36216a, v vVar, A a12, int i12) {
        B bE2 = a12.E(-980193053);
        com.avito.android.lib.beduin_v2.component.button.compose.d.a(c36216a, (t) C25564h.a(c36216a.f333940f, null, bE2, 1), vVar, bE2, ((i12 << 3) & 896) | 72);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.avito.android.beduin.v2.page.impl.compose.screen.c(c36216a, vVar, i12);
        }
    }
}
