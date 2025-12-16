package com.avito.android.favorites.compose.search;

import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.K;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: FavoritesSearch.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class s implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f156909b;

    /* compiled from: FavoritesSearch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorites.compose.search.FavoritesSearchKt$SearchBar$2$1$1", f = "FavoritesSearch.kt", i = {0}, l = {108, 109}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    public static final class a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f156910q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f156911r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f156912s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f156912s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f156912s, continuation);
            aVar.f156911r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC22325c, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f156910q
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L22
                if (r1 == r2) goto L1a
                if (r1 != r3) goto L12
                kotlin.C42729a0.b(r5)
                goto L45
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f156911r
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                kotlin.C42729a0.b(r5)
                goto L37
            L22:
                kotlin.C42729a0.b(r5)
                java.lang.Object r5 = r4.f156911r
                r1 = r5
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.f40173b
                r4.f156911r = r1
                r4.f156910q = r2
                java.lang.Object r5 = androidx.compose.foundation.gestures.C20445d2.c(r1, r4, r2)
                if (r5 != r0) goto L37
                return r0
            L37:
                androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.f40173b
                r2 = 0
                r4.f156911r = r2
                r4.f156910q = r3
                java.lang.Object r5 = androidx.compose.foundation.gestures.C20445d2.l(r1, r5, r4)
                if (r5 != r0) goto L45
                return r0
            L45:
                androidx.compose.ui.input.pointer.C r5 = (androidx.compose.ui.input.pointer.C) r5
                if (r5 == 0) goto L4e
                Y41.a<kotlin.G0> r5 = r4.f156912s
                r5.invoke()
            L4e:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.compose.search.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public s(Y41.a<G0> aVar) {
        this.f156909b = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    @Y61.l
    public final Object invoke(@Y61.k K k12, @Y61.k Continuation<? super G0> continuation) {
        Object objC = C20444d1.c(k12, new a(this.f156909b, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }
}
