package com.avito.android.sx_address.entry;

import DA0.c;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxAddressEntryScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_sx-address_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class s {

    /* compiled from: SxAddressEntryScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.entry.SxAddressEntryScreenKt$SxAddressEntryScreen$1", f = "SxAddressEntryScreen.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f292988q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<DA0.c> f292989r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f292990s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f292991t;

        /* compiled from: SxAddressEntryScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDA0/c;", "event", "Lkotlin/G0;", "emit", "(LDA0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.sx_address.entry.s$a$a, reason: collision with other inner class name */
        public static final class C8899a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y41.a<G0> f292992b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Y41.l<DeepLink, G0> f292993c;

            /* JADX WARN: Multi-variable type inference failed */
            public C8899a(Y41.a<G0> aVar, Y41.l<? super DeepLink, G0> lVar) {
                this.f292992b = aVar;
                this.f292993c = lVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                DA0.c cVar = (DA0.c) obj;
                if (L.f(cVar, c.a.f3085a)) {
                    this.f292992b.invoke();
                } else if (cVar instanceof c.b) {
                    this.f292993c.invoke(((c.b) cVar).f3086a);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, Y41.l lVar, Continuation continuation, InterfaceC43160i interfaceC43160i) {
            super(2, continuation);
            this.f292989r = interfaceC43160i;
            this.f292990s = aVar;
            this.f292991t = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f292990s, this.f292991t, continuation, this.f292989r);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f292988q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C8899a c8899a = new C8899a(this.f292990s, this.f292991t);
                this.f292988q = 1;
                if (this.f292989r.collect(c8899a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SxAddressEntryScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DA0.b, G0> f292994l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DA0.d f292995m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DA0.d dVar, Y41.l lVar) {
            super(2);
            this.f292994l = lVar;
            this.f292995m = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r17, java.lang.Integer r18) {
            /*
                Method dump skipped, instructions count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.entry.s.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SxAddressEntryScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.q<T1, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ DA0.d f292996l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DA0.b, G0> f292997m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(DA0.d dVar, Y41.l<? super DA0.b, G0> lVar) {
            super(3);
            this.f292996l = dVar;
            this.f292997m = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01bd  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.T1 r18, androidx.compose.runtime.A r19, java.lang.Integer r20) {
            /*
                Method dump skipped, instructions count: 507
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.entry.s.c.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SxAddressEntryScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ DA0.d f292998l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DA0.b, G0> f292999m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f293000n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f293001o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<DA0.c> f293002p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(DA0.d dVar, Y41.l<? super DA0.b, G0> lVar, Y41.a<G0> aVar, Y41.l<? super DeepLink, G0> lVar2, InterfaceC43160i<? extends DA0.c> interfaceC43160i, int i12) {
            super(2);
            this.f292998l = dVar;
            this.f292999m = lVar;
            this.f293000n = aVar;
            this.f293001o = lVar2;
            this.f293002p = interfaceC43160i;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(32769);
            Y41.l<DA0.b, G0> lVar = this.f292999m;
            Y41.a<G0> aVar = this.f293000n;
            s.a(this.f292998l, lVar, aVar, this.f293001o, this.f293002p, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k DA0.d dVar, @Y61.k Y41.l<? super DA0.b, G0> lVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.l<? super DeepLink, G0> lVar2, @Y61.k InterfaceC43160i<? extends DA0.c> interfaceC43160i, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-915700215);
        C22187u0.f(interfaceC43160i, aVar, lVar2, new a(aVar, lVar2, null, interfaceC43160i), bE2);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar2.getClass();
        com.akita.compose.component.scaffold.g.a(fillElement, androidx.compose.runtime.internal.r.c(-820767547, new b(dVar, lVar), bE2), null, null, null, null, null, androidx.compose.runtime.internal.r.c(-1484144676, new c(dVar, lVar), bE2), bE2, 12582966, 124);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(dVar, lVar, aVar, lVar2, interfaceC43160i, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.avito.android.sx_address.entry.domain.a r42, Y41.a r43, androidx.compose.ui.v r44, androidx.compose.runtime.A r45, int r46) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.entry.s.b(com.avito.android.sx_address.entry.domain.a, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(DA0.a.C0157a r19, Y41.l r20, androidx.compose.ui.v.a r21, androidx.compose.runtime.A r22, int r23) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.entry.s.c(DA0.a$a, Y41.l, androidx.compose.ui.v$a, androidx.compose.runtime.A, int):void");
    }

    public static final void d(int i12, Y41.a aVar, A a12, androidx.compose.ui.v vVar) {
        int i13;
        androidx.compose.ui.v vVar2;
        B bE2 = a12.E(935271425);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | 48;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
        } else {
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            com.avito.android.sx_address.entry.a.f292912a.getClass();
            C22096n c22096n = com.avito.android.sx_address.entry.a.f292913b;
            String strC = u0.i.c(bE2, R.string.sx_address_unknown_error);
            String strC2 = u0.i.c(bE2, R.string.sx_address_unknown_error_description);
            String strC3 = u0.i.c(bE2, R.string.sx_address_update);
            FillElement fillElement = C20588k2.f28682c;
            aVar2.getClass();
            com.akita.compose.component.content_placeholder.b.a(c22096n, strC, strC2, strC3, aVar, fillElement, null, null, false, false, bE2, ((i14 << 12) & 57344) | 6, 960);
            vVar2 = aVar2;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new q(i12, aVar, vVar2);
        }
    }

    public static final void e(androidx.compose.ui.v vVar, A a12, int i12) {
        B bE2 = a12.E(-1818220119);
        if (((i12 | 6) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            vVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            vVar.getClass();
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, fillElement);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(bE2).getF66694c(), null, bE2, 0, 2);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new r(vVar, i12);
        }
    }
}
