package com.avito.android.services_portfolio.project.seller.ui;

import android.content.Context;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.bottom_sheet.I;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.avito.android.R;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import com.avito.android.services_portfolio.project.seller.mvi.entity.ActionType;
import com.avito.android.util.C35835l0;
import fv.C40482a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kv.C43501a;
import kv0.InterfaceC43503b;
import kv0.c;
import kv0.d;

/* compiled from: PortfolioProjectSellerScreen.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\r²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006&\u0010\b\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "Lkv0/b;", "Lkotlin/G0;", "onActionState", "Lkotlin/Function2;", "", "Lcom/avito/android/remote/model/Image;", "", "openGalleryState", "", "isRefreshing", "Lkotlin/Function0;", "onRefreshState", "_avito_services-portfolio_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r {

    /* compiled from: PortfolioProjectSellerScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_portfolio.project.seller.ui.PortfolioProjectSellerScreenKt$PortfolioProjectSellerScreen$1", f = "PortfolioProjectSellerScreen.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f280344q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f280345r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f280346s;

        /* compiled from: PortfolioProjectSellerScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "<anonymous parameter 0>", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.services_portfolio.project.seller.ui.r$a$a, reason: collision with other inner class name */
        public static final class C8341a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f280347b;

            public C8341a(InterfaceC22204y1 interfaceC22204y1) {
                this.f280347b = interfaceC22204y1;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                ((Y41.l) this.f280347b.getF42167b()).invoke(InterfaceC43503b.e.f413271a);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.deeplink_handler.handler.composite.a aVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
            super(2, continuation);
            this.f280345r = aVar;
            this.f280346s = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f280345r, this.f280346s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f280344q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i<C43501a> interfaceC43160iA = C40482a.a(this.f280345r);
                C8341a c8341a = new C8341a(this.f280346s);
                this.f280344q = 1;
                if (((AbstractC43168f) interfaceC43160iA).collect(c8341a, this) == coroutine_suspended) {
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

    /* compiled from: PortfolioProjectSellerScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_portfolio.project.seller.ui.PortfolioProjectSellerScreenKt$PortfolioProjectSellerScreen$2", f = "PortfolioProjectSellerScreen.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f280348q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<kv0.c> f280349r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.m f280350s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f280351t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ J f280352u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f280353v;

        /* compiled from: PortfolioProjectSellerScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv0/c;", "event", "Lkotlin/G0;", "emit", "(Lkv0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ androidx.appcompat.app.m f280354b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f280355c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ J f280356d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f280357e;

            public a(androidx.appcompat.app.m mVar, com.akita.compose.component.toast_bar.u uVar, J j12, InterfaceC22204y1 interfaceC22204y1) {
                this.f280354b = mVar;
                this.f280355c = uVar;
                this.f280356d = j12;
                this.f280357e = interfaceC22204y1;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                kv0.c cVar = (kv0.c) obj;
                if (cVar instanceof c.a) {
                    androidx.appcompat.app.m mVar = this.f280354b;
                    if (mVar != null) {
                        mVar.setResult(-1);
                    }
                    if (mVar != null) {
                        mVar.finish();
                    }
                } else {
                    if (cVar instanceof c.C11763c) {
                        Object objA = this.f280355c.a(this.f280356d, ((c.C11763c) cVar).f413275a, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : ToastBarDuration.f63231c, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, continuation);
                        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
                    }
                    if (cVar instanceof c.b) {
                        c.b bVar = (c.b) cVar;
                        ((Y41.p) this.f280357e.getF42167b()).invoke(bVar.f413273a, bVar.f413274b);
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.appcompat.app.m mVar, InterfaceC22204y1 interfaceC22204y1, com.akita.compose.component.toast_bar.u uVar, J j12, Continuation continuation, InterfaceC43160i interfaceC43160i) {
            super(2, continuation);
            this.f280349r = interfaceC43160i;
            this.f280350s = mVar;
            this.f280351t = uVar;
            this.f280352u = j12;
            this.f280353v = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            InterfaceC22204y1 interfaceC22204y1 = this.f280353v;
            return new b(this.f280350s, interfaceC22204y1, this.f280351t, this.f280352u, continuation, this.f280349r);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f280348q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a(this.f280350s, this.f280351t, this.f280352u, this.f280353v);
                this.f280348q = 1;
                if (this.f280349r.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: PortfolioProjectSellerScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f280358l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: PortfolioProjectSellerScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ T f280359l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f280360m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ I f280361n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(T t12, InterfaceC22204y1 interfaceC22204y1, I i12) {
            super(3);
            this.f280359l = t12;
            this.f280360m = interfaceC22204y1;
            this.f280361n = i12;
        }

        @Override // Y41.q
        public final G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.foundation.layout.I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, aVar);
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
                R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                K k12 = K.f28344a;
                J3 j32 = AndroidCompositionLocals_androidKt.f41069b;
                String string = ((Context) a13.o(j32)).getString(R.string.services_portfolio_delete_bottom_sheet_title);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
                com.akita.compose.foundation.r rVar = iVar.f65231b;
                float f12 = 16;
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.p.b(string, rVar, R1.k(f12, 0.0f, 2, R1.m(aVar, 0.0f, 0.0f, 0.0f, f12, 7)), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
                com.akita.compose.foundation.ui.p.b(((Context) a13.o(j32)).getString(R.string.services_portfolio_delete_bottom_sheet_description), iVar.f65240k, R1.k(f12, 0.0f, 2, R1.m(aVar, 0.0f, 0.0f, 0.0f, f12, 7)), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
                String string2 = ((Context) a13.o(j32)).getString(R.string.services_portfolio_delete_bottom_sheet_approve_button);
                float f13 = 10;
                androidx.compose.ui.v vVarK = R1.k(f13, 0.0f, 2, R1.m(C20588k2.d(aVar, 1.0f), 0.0f, 0.0f, 0.0f, 6, 7));
                com.akita.compose.component.button.t tVarF2 = com.akita.compose.theme.re23.b.c(a13).f2();
                InterfaceC22204y1 interfaceC22204y1 = this.f280360m;
                I i12 = this.f280361n;
                T t12 = this.f280359l;
                com.akita.compose.component.button.m.c(string2, new t(t12, interfaceC22204y1, i12), tVarF2, vVarK, null, null, null, false, false, null, a13, 3584, 1008);
                com.akita.compose.component.button.m.c(((Context) a13.o(j32)).getString(R.string.services_portfolio_delete_bottom_sheet_cancel_button), new v(i12, t12), com.akita.compose.theme.re23.b.c(a13).M(), R1.k(f13, 0.0f, 2, C20588k2.d(aVar, 1.0f)), null, null, null, false, false, null, a13, 3584, 1008);
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PortfolioProjectSellerScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f280362l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kv0.d f280363m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ T f280364n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ I f280365o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC22204y1 interfaceC22204y1, kv0.d dVar, T t12, I i12) {
            super(2);
            this.f280362l = interfaceC22204y1;
            this.f280363m = dVar;
            this.f280364n = t12;
            this.f280365o = i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
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
                goto L5e
            L19:
                androidx.compose.ui.v$a r0 = androidx.compose.ui.v.f42878y1
                r9 = 1542708555(0x5bf3dd4b, float:1.3728347E17)
                r5.C(r9)
                androidx.compose.runtime.y1 r9 = r8.f280362l
                boolean r10 = r5.B(r9)
                java.lang.Object r1 = r5.t()
                if (r10 != 0) goto L36
                androidx.compose.runtime.A$a r10 = androidx.compose.runtime.A.f37866a
                r10.getClass()
                androidx.compose.runtime.A$a$a r10 = androidx.compose.runtime.A.a.f37868b
                if (r1 != r10) goto L3e
            L36:
                com.avito.android.services_portfolio.project.seller.ui.w r1 = new com.avito.android.services_portfolio.project.seller.ui.w
                r1.<init>(r9)
                r5.H(r1)
            L3e:
                r3 = r1
                Y41.a r3 = (Y41.a) r3
                r5.h()
                com.avito.android.services_portfolio.project.seller.ui.z r9 = new com.avito.android.services_portfolio.project.seller.ui.z
                com.akita.compose.component.bottom_sheet.I r10 = r8.f280365o
                kv0.d r1 = r8.f280363m
                kotlinx.coroutines.T r2 = r8.f280364n
                r9.<init>(r1, r2, r10)
                r10 = -2124888104(0xffffffff8158c7d8, float:-3.9816315E-38)
                androidx.compose.runtime.internal.n r4 = androidx.compose.runtime.internal.r.c(r10, r9, r5)
                r6 = 24582(0x6006, float:3.4447E-41)
                r7 = 6
                r1 = 0
                r2 = 0
                com.akita.compose.component.navbar.t.b(r0, r1, r2, r3, r4, r5, r6, r7)
            L5e:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.services_portfolio.project.seller.ui.r.e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PortfolioProjectSellerScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kv0.d f280366l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f280367m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f280368n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kv0.d dVar, com.avito.android.deeplink_handler.handler.composite.a aVar, InterfaceC22204y1 interfaceC22204y1) {
            super(2);
            this.f280366l = dVar;
            this.f280367m = aVar;
            this.f280368n = interfaceC22204y1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                kv0.d dVar = this.f280366l;
                if (dVar instanceof d.b) {
                    ArrayList arrayList = ((d.b) dVar).f413278d.f413286f;
                    kv0.f fVar = null;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((kv0.f) next).f413288a == ActionType.f280250b) {
                                fVar = next;
                                break;
                            }
                        }
                        fVar = fVar;
                    }
                    if (fVar != null) {
                        androidx.compose.ui.v vVarA = com.avito.android.services_portfolio.project.components.f.a(androidx.compose.ui.v.f42878y1);
                        com.akita.compose.theme.re23.b.f63983a.getClass();
                        long jC2 = com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13);
                        float f12 = 24;
                        h.a aVar = androidx.compose.ui.unit.h.f42849c;
                        com.akita.compose.foundation.ui.n.a(androidx.compose.foundation.A.b(vVarA, jC2, androidx.compose.foundation.shape.o.c(f12, f12, 0.0f, 0.0f, 12)), null, 0.0f, null, null, androidx.compose.runtime.internal.r.c(229493386, new B(fVar, this.f280367m, this.f280368n), a13), a13, 1572864, 62);
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PortfolioProjectSellerScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kv0.d f280369l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f280370m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ T f280371n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f280372o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC43503b, G0> f280373p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(kv0.d dVar, com.avito.android.deeplink_handler.handler.composite.a aVar, T t12, InterfaceC22204y1 interfaceC22204y1, Y41.l lVar) {
            super(3);
            this.f280369l = dVar;
            this.f280370m = aVar;
            this.f280371n = t12;
            this.f280372o = interfaceC22204y1;
            this.f280373p = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.q
        public final G0 invoke(T1 t12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                kv0.d dVar = this.f280369l;
                boolean z12 = dVar instanceof d.b;
                T t13 = this.f280371n;
                A.a aVar = androidx.compose.runtime.A.f37866a;
                if (z12) {
                    a13.C(581384436);
                    a13.C(1542775513);
                    Object objT = a13.t();
                    aVar.getClass();
                    if (objT == A.a.f37868b) {
                        objT = C22126m3.g(Boolean.FALSE);
                        a13.H(objT);
                    }
                    InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
                    a13.h();
                    com.akita.compose.component.pull_to_refresh.j jVarA = com.akita.compose.component.pull_to_refresh.k.a(a13);
                    InterfaceC22204y1 interfaceC22204y12 = this.f280372o;
                    r.b(jVarA, ((Boolean) interfaceC22204y1.getF42167b()).booleanValue(), new D(t13, interfaceC22204y1, interfaceC22204y12), (d.b) dVar, this.f280370m, (Y41.l) interfaceC22204y12.getF42167b(), a13, 36872);
                    a13.h();
                } else if (dVar instanceof d.C11764d) {
                    a13.C(582257799);
                    v.a aVar2 = androidx.compose.ui.v.f42878y1;
                    FillElement fillElement = C20588k2.f28682c;
                    aVar2.getClass();
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(fillElement, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13), Y0.f39346a);
                    InterfaceC22215f.f39074a.getClass();
                    InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                    int f37888q = a13.getF37888Q();
                    O1 o1Y = a13.y();
                    androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarB);
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
                    Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                    if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                        androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                    }
                    R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                    com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(a13).getF66694c(), C20644z.f28804a.d(aVar2, InterfaceC22215f.a.f39080f), a13, 0, 0);
                    a13.z();
                    a13.h();
                } else if (dVar instanceof d.c) {
                    a13.C(582753861);
                    a13.C(1542819705);
                    Object objT2 = a13.t();
                    aVar.getClass();
                    if (objT2 == A.a.f37868b) {
                        objT2 = C22126m3.g(Boolean.FALSE);
                        a13.H(objT2);
                    }
                    InterfaceC22204y1 interfaceC22204y13 = (InterfaceC22204y1) objT2;
                    a13.h();
                    com.avito.android.services_portfolio.project.components.a.a(com.akita.compose.component.pull_to_refresh.k.a(a13), ((Boolean) interfaceC22204y13.getF42167b()).booleanValue(), new F(t13, interfaceC22204y13, this.f280373p), ((d.c) dVar).f413279d instanceof ApiError.NetworkIOError, a13, 8);
                    a13.h();
                } else {
                    a13.C(583573067);
                    a13.h();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PortfolioProjectSellerScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kv0.d f280374l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC43503b, G0> f280375m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<kv0.c> f280376n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.p<List<Image>, Integer, G0> f280377o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f280378p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(kv0.d dVar, Y41.l<? super InterfaceC43503b, G0> lVar, InterfaceC43160i<? extends kv0.c> interfaceC43160i, Y41.p<? super List<Image>, ? super Integer, G0> pVar, com.avito.android.deeplink_handler.handler.composite.a aVar, int i12) {
            super(2);
            this.f280374l = dVar;
            this.f280375m = lVar;
            this.f280376n = interfaceC43160i;
            this.f280377o = pVar;
            this.f280378p = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(33281);
            Y41.p<List<Image>, Integer, G0> pVar = this.f280377o;
            Y41.l<InterfaceC43503b, G0> lVar = this.f280375m;
            InterfaceC43160i<kv0.c> interfaceC43160i = this.f280376n;
            r.a(this.f280374l, lVar, interfaceC43160i, pVar, this.f280378p, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kv0.d dVar, @Y61.k Y41.l<? super InterfaceC43503b, G0> lVar, @Y61.k InterfaceC43160i<? extends kv0.c> interfaceC43160i, @Y61.k Y41.p<? super List<Image>, ? super Integer, G0> pVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1467982285);
        androidx.appcompat.app.m mVarC = C35835l0.c((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b));
        com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        J f66804a = com.akita.compose.theme.re23.b.u(bE2).getF66804a();
        I iA2 = com.akita.compose.component.bottom_sheet.N.a(true, 0.0f, bE2, 6, 6);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
            bE2.H(objT);
        }
        T t12 = (T) objT;
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        InterfaceC22204y1 interfaceC22204y1M2 = C22126m3.m(pVar, bE2);
        C22187u0.d(new a(aVar, interfaceC22204y1M, null), bE2, G0.f406611a);
        C22187u0.d(new b(mVarC, interfaceC22204y1M2, uVarA, f66804a, null, interfaceC43160i), bE2, interfaceC43160i);
        bE2.C(-83658096);
        if (iA2.b()) {
            com.akita.compose.component.bottom_sheet.H.a(c.f280358l, null, iA2, null, null, null, null, false, false, null, null, null, androidx.compose.runtime.internal.r.c(-2032724370, new d(t12, interfaceC22204y1M, iA2), bE2), bE2, 6, 384, 4090);
        }
        bE2.X(false);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar2.getClass();
        com.akita.compose.component.scaffold.g.a(fillElement, androidx.compose.runtime.internal.r.c(2138073591, new e(interfaceC22204y1M, dVar, t12, iA2), bE2), androidx.compose.runtime.internal.r.c(-1230138952, new f(dVar, aVar, interfaceC22204y1M), bE2), null, null, null, null, androidx.compose.runtime.internal.r.c(-1391778688, new g(dVar, aVar, t12, interfaceC22204y1M, lVar), bE2), bE2, 12583350, 120);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(dVar, lVar, interfaceC43160i, pVar, aVar, i12);
        }
    }

    public static final void b(com.akita.compose.component.pull_to_refresh.j jVar, boolean z12, Y41.a aVar, d.b bVar, com.avito.android.deeplink_handler.handler.composite.a aVar2, Y41.l lVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1388982088);
        com.akita.compose.component.pull_to_refresh.i.b(jVar, z12, (Y41.a) C22126m3.m(aVar, bE2).getF42167b(), androidx.compose.ui.v.f42878y1, null, null, androidx.compose.runtime.internal.r.c(-2003755554, new p(bVar, aVar2, C22126m3.m(lVar, bE2)), bE2), bE2, (i12 & 14) | 1575944 | (i12 & 112), 48);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new q(jVar, z12, aVar, bVar, aVar2, lVar, i12);
        }
    }
}
