package com.avito.android.lib.beduin_v2.beduin_item;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.beduin.v2.avito.component.items_controller.i;
import com.avito.beduin.v2.engine.component.I;
import kotlin.AbstractC40048c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;

/* compiled from: BeduinItemsState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/beduin/v2/avito/component/items_controller/i$a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.beduin_item.BeduinItemsStateKt$itemsControllerStates$1$1", f = "BeduinItemsState.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class e extends SuspendLambda implements p<I0<? super i.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f175449q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f175450r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC40048c.a f175451s;

    /* compiled from: BeduinItemsState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/items_controller/i$a;", "itemsController", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/avito/component/items_controller/i$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<i.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0<i.a> f175452l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(I0<? super i.a> i02) {
            super(1);
            this.f175452l = i02;
        }

        @Override // Y41.l
        public final G0 invoke(i.a aVar) {
            this.f175452l.w(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinItemsState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<I> f175453l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.h<I> hVar) {
            super(0);
            this.f175453l = hVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            l0.h<I> hVar = this.f175453l;
            I i12 = hVar.f406842b;
            if (i12 != null) {
                i12.a();
            }
            hVar.f406842b = null;
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AbstractC40048c.a aVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f175451s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        e eVar = new e(this.f175451s, continuation);
        eVar.f175450r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super i.a> i02, Continuation<? super G0> continuation) {
        return ((e) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.avito.beduin.v2.avito.component.items_controller.k] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f175449q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f175450r;
            i iVar = new i(this.f175451s.getF395211c());
            i02.w(iVar.f334561b);
            l0.h hVar = new l0.h();
            hVar.f406842b = iVar.a(new a(i02));
            b bVar = new b(hVar);
            this.f175449q = 1;
            if (F0.a(i02, bVar, this) == coroutine_suspended) {
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
