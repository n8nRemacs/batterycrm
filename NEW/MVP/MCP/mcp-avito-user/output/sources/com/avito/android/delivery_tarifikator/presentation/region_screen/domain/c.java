package com.avito.android.delivery_tarifikator.presentation.region_screen.domain;

import Ov.g;
import Sv.h;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.delivery_tarifikator.domain.InterfaceC29815k;
import com.avito.android.delivery_tarifikator.domain.InterfaceC29828y;
import com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TarifikatorRegionScreenInteractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/domain/c;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/domain/a;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.android.delivery_tarifikator.presentation.region_screen.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC29815k f135780a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC29828y f135781b;

    /* compiled from: TarifikatorRegionScreenInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.region_screen.domain.TarifikatorRegionScreenInteractorImpl$saveSettings$1", f = "TarifikatorRegionScreenInteractor.kt", i = {0, 1}, l = {32, 33, 36, 40}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super TarifikatorRegionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f135782q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f135783r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List<g> f135785t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<g> list, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f135785t = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = c.this.new a(this.f135785t, continuation);
            aVar.f135783r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TarifikatorRegionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f135782q
                com.avito.android.delivery_tarifikator.presentation.region_screen.domain.c r2 = com.avito.android.delivery_tarifikator.presentation.region_screen.domain.c.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.C42729a0.b(r8)
                goto L98
            L24:
                java.lang.Object r1 = r7.f135783r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L58
            L2c:
                java.lang.Object r1 = r7.f135783r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L49
            L34:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f135783r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction$TermsSavingStarted r1 = com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction.TermsSavingStarted.f135818b
                r7.f135783r = r8
                r7.f135782q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L48
                return r0
            L48:
                r1 = r8
            L49:
                com.avito.android.delivery_tarifikator.domain.y r8 = r2.f135781b
                r7.f135783r = r1
                r7.f135782q = r5
                java.util.List<Ov.g> r5 = r7.f135785t
                java.lang.Object r8 = r8.a(r5, r7)
                if (r8 != r0) goto L58
                return r0
            L58:
                com.avito.android.delivery_tarifikator.domain.x r8 = (com.avito.android.delivery_tarifikator.domain.InterfaceC29827x) r8
                boolean r5 = r8 instanceof com.avito.android.delivery_tarifikator.domain.InterfaceC29827x.a
                r6 = 0
                if (r5 == 0) goto L79
                com.avito.android.delivery_tarifikator.domain.x$a r8 = (com.avito.android.delivery_tarifikator.domain.InterfaceC29827x.a) r8
                com.avito.android.util.ApiException r2 = r8.f135347a
                com.avito.android.printable_text.PrintableText r2 = Yv.C18330a.a(r2)
                com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction$TermsSavingFailed r3 = new com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction$TermsSavingFailed
                com.avito.android.util.ApiException r8 = r8.f135347a
                r3.<init>(r2, r8)
                r7.f135783r = r6
                r7.f135782q = r4
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto L98
                return r0
            L79:
                boolean r4 = r8 instanceof com.avito.android.delivery_tarifikator.domain.InterfaceC29827x.b
                if (r4 == 0) goto L98
                com.avito.android.delivery_tarifikator.domain.x$b r8 = (com.avito.android.delivery_tarifikator.domain.InterfaceC29827x.b) r8
                java.lang.String r8 = r8.f135348a
                r2.getClass()
                com.avito.android.delivery_tarifikator.presentation.region_screen.domain.b r4 = new com.avito.android.delivery_tarifikator.presentation.region_screen.domain.b
                r4.<init>(r2, r8, r6)
                kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.C43175k.G(r4)
                r7.f135783r = r6
                r7.f135782q = r3
                java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r8, r1)
                if (r8 != r0) goto L98
                return r0
            L98:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.delivery_tarifikator.presentation.region_screen.domain.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@k InterfaceC29815k interfaceC29815k, @k InterfaceC29828y interfaceC29828y) {
        this.f135780a = interfaceC29815k;
        this.f135781b = interfaceC29828y;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.region_screen.domain.a
    @k
    public final InterfaceC43160i<TarifikatorRegionInternalAction> a(@k List<g> list) {
        return C43175k.G(new a(list, null));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f135780a, cVar.f135780a) && L.f(this.f135781b, cVar.f135781b);
    }

    public final int hashCode() {
        return this.f135781b.hashCode() + (this.f135780a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "TarifikatorRegionScreenInteractorImpl(loadTarifikatorUseCase=" + this.f135780a + ", saveSettingsUseCase=" + this.f135781b + ')';
    }
}
