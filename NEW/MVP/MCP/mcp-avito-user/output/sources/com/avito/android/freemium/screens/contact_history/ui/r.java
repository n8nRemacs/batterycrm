package com.avito.android.freemium.screens.contact_history.ui;

import android.content.Context;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.U2;
import androidx.compose.ui.layout.C22392w0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mnz_common.compose.C32578a;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.C35835l0;
import dF.InterfaceC39572a;
import dF.InterfaceC39573b;
import dF.c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FreemiumContactHistoryScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\b²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function1;", "LdF/a;", "Lkotlin/G0;", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "footerHeight", "_avito_freemium_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class r {

    /* compiled from: FreemiumContactHistoryScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.freemium.screens.contact_history.ui.FreemiumContactHistoryScreenKt$FreemiumContactHistoryScreen$1", f = "FreemiumContactHistoryScreen.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159024q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC39573b> f159025r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.m f159026s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f159027t;

        /* compiled from: FreemiumContactHistoryScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LdF/b;", "event", "Lkotlin/G0;", "emit", "(LdF/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.freemium.screens.contact_history.ui.r$a$a, reason: collision with other inner class name */
        public static final class C4646a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ androidx.appcompat.app.m f159028b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f159029c;

            public C4646a(androidx.appcompat.app.m mVar, InterfaceC22204y1 interfaceC22204y1) {
                this.f159028b = mVar;
                this.f159029c = interfaceC22204y1;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC39573b interfaceC39573b = (InterfaceC39573b) obj;
                if (interfaceC39573b instanceof InterfaceC39573b.a) {
                    androidx.appcompat.app.m mVar = this.f159028b;
                    if (mVar != null) {
                        mVar.onBackPressed();
                    }
                } else if (interfaceC39573b instanceof InterfaceC39573b.C11019b) {
                    ((Y41.l) this.f159029c.getF42167b()).invoke(((InterfaceC39573b.C11019b) interfaceC39573b).f393757a);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43160i interfaceC43160i, androidx.appcompat.app.m mVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
            super(2, continuation);
            this.f159025r = interfaceC43160i;
            this.f159026s = mVar;
            this.f159027t = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f159025r, this.f159026s, this.f159027t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159024q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C4646a c4646a = new C4646a(this.f159026s, this.f159027t);
                this.f159024q = 1;
                if (this.f159025r.collect(c4646a, this) == coroutine_suspended) {
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

    /* compiled from: FreemiumContactHistoryScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f159030l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC22204y1 interfaceC22204y1) {
            super(2);
            this.f159030l = interfaceC22204y1;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r9, java.lang.Integer r10) {
            /*
                r8 = this;
                r5 = r9
                androidx.compose.runtime.A r5 = (androidx.compose.runtime.A) r5
                java.lang.Number r10 = (java.lang.Number) r10
                int r9 = r10.intValue()
                r9 = r9 & 11
                r10 = 2
                if (r9 != r10) goto L19
                boolean r9 = r5.c()
                if (r9 != 0) goto L15
                goto L19
            L15:
                r5.f()
                goto L4c
            L19:
                r9 = -1853859432(0xffffffff91805998, float:-2.0250056E-28)
                r5.C(r9)
                androidx.compose.runtime.y1 r9 = r8.f159030l
                boolean r10 = r5.B(r9)
                java.lang.Object r0 = r5.t()
                if (r10 != 0) goto L34
                androidx.compose.runtime.A$a r10 = androidx.compose.runtime.A.f37866a
                r10.getClass()
                androidx.compose.runtime.A$a$a r10 = androidx.compose.runtime.A.a.f37868b
                if (r0 != r10) goto L3c
            L34:
                com.avito.android.freemium.screens.contact_history.ui.s r0 = new com.avito.android.freemium.screens.contact_history.ui.s
                r0.<init>(r9)
                r5.H(r0)
            L3c:
                r3 = r0
                Y41.a r3 = (Y41.a) r3
                r5.h()
                r6 = 0
                r7 = 23
                r0 = 0
                r1 = 0
                r2 = 0
                r4 = 0
                com.akita.compose.component.navbar.t.b(r0, r1, r2, r3, r4, r5, r6, r7)
            L4c:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.freemium.screens.contact_history.ui.r.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FreemiumContactHistoryScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ dF.c f159031l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f159032m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f159033n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC22196w1 interfaceC22196w1, InterfaceC22204y1 interfaceC22204y1, dF.c cVar) {
            super(2);
            this.f159031l = cVar;
            this.f159032m = interfaceC22196w1;
            this.f159033n = interfaceC22204y1;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            c.a aVar;
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                dF.c cVar = this.f159031l;
                if (!cVar.f393760b && cVar.f393761c == null && (aVar = cVar.f393763e) != null) {
                    v.a aVar2 = androidx.compose.ui.v.f42878y1;
                    a13.C(-1853843333);
                    Object objT = a13.t();
                    A.f37866a.getClass();
                    if (objT == A.a.f37868b) {
                        objT = new t(this.f159032m);
                        a13.H(objT);
                    }
                    a13.h();
                    C32578a.a(C22392w0.a(aVar2, (Y41.l) objT), aVar.f393765a, null, new u(cVar, this.f159033n), null, false, false, a13, 6, 116);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FreemiumContactHistoryScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.q<T1, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ dF.c f159034l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f159035m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f159036n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC22196w1 interfaceC22196w1, InterfaceC22204y1 interfaceC22204y1, dF.c cVar) {
            super(3);
            this.f159034l = cVar;
            this.f159035m = interfaceC22204y1;
            this.f159036n = interfaceC22196w1;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.T1 r9, androidx.compose.runtime.A r10, java.lang.Integer r11) {
            /*
                Method dump skipped, instructions count: 324
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.freemium.screens.contact_history.ui.r.d.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FreemiumContactHistoryScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ dF.c f159037l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC39572a, G0> f159038m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC39573b> f159039n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f159040o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f159041p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(dF.c cVar, Y41.l<? super InterfaceC39572a, G0> lVar, InterfaceC43160i<? extends InterfaceC39573b> interfaceC43160i, Y41.l<? super DeepLink, G0> lVar2, int i12) {
            super(2);
            this.f159037l = cVar;
            this.f159038m = lVar;
            this.f159039n = interfaceC43160i;
            this.f159040o = lVar2;
            this.f159041p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            r.a(this.f159037l, this.f159038m, this.f159039n, this.f159040o, a12, C22066f2.a(this.f159041p | 1));
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k dF.c cVar, @Y61.k Y41.l<? super InterfaceC39572a, G0> lVar, @Y61.k InterfaceC43160i<? extends InterfaceC39573b> interfaceC43160i, @Y61.k Y41.l<? super DeepLink, G0> lVar2, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-587756584);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        InterfaceC22204y1 interfaceC22204y1M2 = C22126m3.m(lVar2, bE2);
        bE2.C(-938828840);
        Object objT = bE2.t();
        A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = U2.a(0);
            bE2.H(objT);
        }
        InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
        bE2.X(false);
        C22187u0.d(new a(interfaceC43160i, C35835l0.c((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)), interfaceC22204y1M2, null), bE2, interfaceC43160i);
        com.akita.compose.component.scaffold.g.a(null, androidx.compose.runtime.internal.r.c(-1368603492, new b(interfaceC22204y1M), bE2), androidx.compose.runtime.internal.r.c(-205022307, new c(interfaceC22196w1, interfaceC22204y1M, cVar), bE2), null, null, null, null, androidx.compose.runtime.internal.r.c(779294821, new d(interfaceC22196w1, interfaceC22204y1M, cVar), bE2), bE2, 12583344, 121);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(cVar, lVar, interfaceC43160i, lVar2, i12);
        }
    }
}
