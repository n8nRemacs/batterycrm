package com.avito.android.paranja;

import Y41.p;
import com.avito.android.paranja.m;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.Z1;

/* compiled from: ParanjaView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.paranja.ParanjaView$subscribeToState$1", f = "ParanjaView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class i extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ h f210903q;

    /* compiled from: ParanjaView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/paranja/m;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/paranja/m;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.paranja.ParanjaView$subscribeToState$1$1", f = "ParanjaView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<m, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f210904q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ h f210905r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f210905r = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f210905r, continuation);
            aVar.f210904q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(m mVar, Continuation<? super G0> continuation) {
            return ((a) create(mVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            m mVar = (m) this.f210904q;
            if (!L.f(mVar, m.a.f210909a)) {
                boolean z12 = mVar instanceof m.b;
                h hVar = this.f210905r;
                if (z12) {
                    m.b bVar = (m.b) mVar;
                    hVar.f210891d.set(bVar.f210910a.left - hVar.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f210871a.f210875a, bVar.f210910a.top - hVar.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f210871a.f210877c, bVar.f210910a.right + hVar.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f210871a.f210876b, bVar.f210910a.bottom + hVar.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f210871a.f210878d);
                    hVar.invalidate();
                } else if (L.f(mVar, m.c.f210911a)) {
                    int i12 = h.f210888o;
                    hVar.a();
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f210903q = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f210903q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        e.f210864a.getClass();
        Z1<m> z12 = e.f210866c;
        h hVar = this.f210903q;
        C43175k.K(new C43197r1(new a(hVar, null), z12), hVar.f210901n);
        return G0.f406611a;
    }
}
