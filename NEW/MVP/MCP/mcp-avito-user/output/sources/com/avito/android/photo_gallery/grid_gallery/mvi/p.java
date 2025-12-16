package com.avito.android.photo_gallery.grid_gallery.mvi;

import com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction;
import com.avito.android.photo_gallery.grid_gallery.mvi.n;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GridGalleryActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/n$a$a;", "Lkotlinx/coroutines/flow/i;", "LT70/c;", "<name for destructuring parameter 0>", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.mvi.GridGalleryActor$process$2", f = "GridGalleryActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class p extends SuspendLambda implements Y41.p<Q<? extends n.a.InterfaceC6522a, ? extends InterfaceC43160i<? extends T70.c>>, Continuation<? super InterfaceC43160i<? extends GridGalleryInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f217369q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f217370r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<T70.e> f217371s;

    /* compiled from: GridGalleryActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LT70/c;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "<anonymous>", "(LT70/c;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.mvi.GridGalleryActor$process$2$1", f = "GridGalleryActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T70.c, Continuation<? super InterfaceC43160i<? extends GridGalleryInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f217372q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ n f217373r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<T70.e> f217374s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, n nVar, Continuation continuation) {
            super(2, continuation);
            this.f217373r = nVar;
            this.f217374s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f217374s, this.f217373r, continuation);
            aVar.f217372q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T70.c cVar, Continuation<? super InterfaceC43160i<? extends GridGalleryInternalAction>> continuation) {
            return ((a) create(cVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f217373r.b((T70.c) this.f217372q, this.f217374s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.mvi.GridGalleryActor$process$2$invokeSuspend$$inlined$flatMapLatest$1", f = "GridGalleryActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super GridGalleryInternalAction>, T70.c, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f217375q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f217376r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f217377s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ n f217378t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f217379u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, n nVar, Continuation continuation) {
            super(3, continuation);
            this.f217378t = nVar;
            this.f217379u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super GridGalleryInternalAction> interfaceC43172j, T70.c cVar, Continuation<? super G0> continuation) {
            b bVar = new b(this.f217379u, this.f217378t, continuation);
            bVar.f217376r = interfaceC43172j;
            bVar.f217377s = cVar;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f217375q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f217376r;
                InterfaceC43160i<GridGalleryInternalAction> interfaceC43160iD = this.f217378t.b((T70.c) this.f217377s, (T70.e) this.f217379u.invoke());
                this.f217375q = 1;
                if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Y41.a aVar, n nVar, Continuation continuation) {
        super(2, continuation);
        this.f217370r = nVar;
        this.f217371s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f217371s, this.f217370r, continuation);
        pVar.f217369q = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends n.a.InterfaceC6522a, ? extends InterfaceC43160i<? extends T70.c>> q12, Continuation<? super InterfaceC43160i<? extends GridGalleryInternalAction>> continuation) {
        return ((p) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f217369q;
        n.a.InterfaceC6522a interfaceC6522a = (n.a.InterfaceC6522a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean z12 = interfaceC6522a instanceof n.a.InterfaceC6522a.C6523a;
        Y41.a<T70.e> aVar = this.f217371s;
        n nVar = this.f217370r;
        if (z12) {
            return C43175k.C(new a(aVar, nVar, null), interfaceC43160i);
        }
        if (interfaceC6522a instanceof n.a.InterfaceC6522a.b) {
            return C43175k.Y(interfaceC43160i, new b(aVar, nVar, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
