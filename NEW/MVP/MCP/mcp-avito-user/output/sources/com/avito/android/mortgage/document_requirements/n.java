package com.avito.android.mortgage.document_requirements;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import b00.C25383b;
import com.avito.android.R;
import com.avito.android.mortgage.document_requirements.model.Document;
import com.avito.android.mortgage.document_requirements.model.RequirementParagraph;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: DocumentRequirementsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n {

    /* compiled from: DocumentRequirementsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<m0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C25383b f198999l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Document, G0> f199000m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C25383b c25383b, Y41.l<? super Document, G0> lVar) {
            super(1);
            this.f198999l = c25383b;
            this.f199000m = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(m0 m0Var) {
            C25383b c25383b = this.f198999l;
            List<Document> list = c25383b.f56811b;
            m0Var.a(list.size(), null, new l(j.f198961l, list), new C22096n(-632812321, new m(list, c25383b, this.f199000m), true));
            return G0.f406611a;
        }
    }

    /* compiled from: DocumentRequirementsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.document_requirements.DocumentRequirementsScreenKt$DocumentRequirementsScreen$1$2$1", f = "DocumentRequirementsScreen.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f199001q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C25383b f199002r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ w0 f199003s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25383b c25383b, w0 w0Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f199002r = c25383b;
            this.f199003s = w0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f199002r, this.f199003s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f199001q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C25383b c25383b = this.f199002r;
                Document document = c25383b.f56812c;
                if (document != null) {
                    Integer numBoxInt = Boxing.boxInt(c25383b.f56811b.indexOf(document));
                    if (numBoxInt.intValue() < 0) {
                        numBoxInt = null;
                    }
                    if (numBoxInt != null) {
                        int iIntValue = numBoxInt.intValue();
                        this.f199001q = 1;
                        w0.c cVar = w0.f29712w;
                        if (this.f199003s.f(iIntValue, 0, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return G0.f406611a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
    }

    /* compiled from: DocumentRequirementsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<m0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Document f199004l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Document document) {
            super(1);
            this.f199004l = document;
        }

        @Override // Y41.l
        public final G0 invoke(m0 m0Var) {
            m0 m0Var2 = m0Var;
            com.avito.android.mortgage.document_requirements.a.f198935a.getClass();
            m0Var2.c(null, null, com.avito.android.mortgage.document_requirements.a.f198936b);
            List<RequirementParagraph> list = this.f199004l.f198971d;
            m0Var2.a(list.size(), null, new q(o.f199009l, list), new C22096n(-632812321, new r(list), true));
            return G0.f406611a;
        }
    }

    /* compiled from: DocumentRequirementsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C25383b f199005l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Document, G0> f199006m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(C25383b c25383b, Y41.l<? super Document, G0> lVar, int i12) {
            super(2);
            this.f199005l = c25383b;
            this.f199006m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            Y41.l<Document, G0> lVar = this.f199006m;
            n.a(this.f199005l, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: ContentDrawTracking.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "com/avito/android/analytics/screens/compose/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.analytics.screens.mvi.r f199007l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.analytics.screens.compose.a f199008m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.avito.android.analytics.screens.mvi.r rVar, com.avito.android.analytics.screens.compose.a aVar) {
            super(1);
            this.f199007l = rVar;
            this.f199008m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
            dVar.y1();
            com.avito.android.analytics.screens.compose.a aVar = this.f199008m;
            com.avito.android.analytics.screens.mvi.r rVar = this.f199007l;
            if (rVar != null) {
                aVar.n(rVar.f90666a, rVar.f90667b, null);
            }
            aVar.f();
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a5  */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [androidx.compose.ui.input.nestedscroll.b, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v24 */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k b00.C25383b r41, @Y61.k Y41.l<? super com.avito.android.mortgage.document_requirements.model.Document, kotlin.G0> r42, @Y61.l androidx.compose.runtime.A r43, int r44) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.document_requirements.n.a(b00.b, Y41.l, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.avito.android.mortgage.document_requirements.model.Document r20, boolean r21, Y41.l r22, androidx.compose.runtime.A r23, int r24) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.document_requirements.n.b(com.avito.android.mortgage.document_requirements.model.Document, boolean, Y41.l, androidx.compose.runtime.A, int):void");
    }

    public static final void c(String str, AttributedText attributedText, androidx.compose.ui.v vVar, A a12, int i12) {
        B b12;
        boolean z12;
        B bE2 = a12.E(-427071930);
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        bE2.C(1280879636);
        if (str == null) {
            z12 = false;
            b12 = bE2;
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65236g, C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), false, 0L, null, 0, 0, false, null, bE2, (i12 & 14) | 384, 1016);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(8, null, b12, 6);
            z12 = false;
        }
        b12.X(z12);
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, null, R.attr.textM20, s.f199013l, null, 0, b12, 3080, 50);
        b12.X(true);
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new t(str, attributedText, vVar, i12);
        }
    }
}
