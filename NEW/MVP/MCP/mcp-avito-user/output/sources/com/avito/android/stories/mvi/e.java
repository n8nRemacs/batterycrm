package com.avito.android.stories.mvi;

import Ju.InterfaceC14249c;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.stories.mvi.entity.StoriesInternalAction;
import com.avito.android.stories.mvi.entity.StoriesState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: StoriesActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "event", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor$subscribeToDeeplinkResult$1", f = "StoriesActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class e extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC43160i<? extends StoriesInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f285227q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.stories.mvi.a f285228r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StoriesState f285229s;

    /* compiled from: StoriesActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor$subscribeToDeeplinkResult$1$1", f = "StoriesActor.kt", i = {0}, l = {197, 198}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StoriesInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285230q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f285231r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14249c f285232s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.stories.mvi.a f285233t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ StoriesState f285234u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC14249c interfaceC14249c, com.avito.android.stories.mvi.a aVar, StoriesState storiesState, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f285232s = interfaceC14249c;
            this.f285233t = aVar;
            this.f285234u = storiesState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f285232s, this.f285233t, this.f285234u, continuation);
            aVar.f285231r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StoriesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f285230q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f285231r;
                StoriesInternalAction.SelectedPage selectedPage = new StoriesInternalAction.SelectedPage(((AdvertDetailsLink.b.C3984b) this.f285232s).f132970b);
                this.f285231r = interfaceC43172j;
                this.f285230q = 1;
                if (interfaceC43172j.emit(selectedPage, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f285231r;
                C42729a0.b(obj);
            }
            this.f285231r = null;
            this.f285230q = 2;
            if (com.avito.android.stories.mvi.a.c(this.f285233t, interfaceC43172j, this.f285234u, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StoriesActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor$subscribeToDeeplinkResult$1$2", f = "StoriesActor.kt", i = {0}, l = {202, 203}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StoriesInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285235q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f285236r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.stories.mvi.a f285237s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ StoriesState f285238t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.stories.mvi.a aVar, StoriesState storiesState, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f285237s = aVar;
            this.f285238t = storiesState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f285237s, this.f285238t, continuation);
            bVar.f285236r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StoriesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f285235q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f285236r;
                StoriesInternalAction.SelectedPage selectedPage = new StoriesInternalAction.SelectedPage(null);
                this.f285236r = interfaceC43172j;
                this.f285235q = 1;
                if (interfaceC43172j.emit(selectedPage, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f285236r;
                C42729a0.b(obj);
            }
            this.f285236r = null;
            this.f285235q = 2;
            if (com.avito.android.stories.mvi.a.c(this.f285237s, interfaceC43172j, this.f285238t, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.avito.android.stories.mvi.a aVar, StoriesState storiesState, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f285228r = aVar;
        this.f285229s = storiesState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f285228r, this.f285229s, continuation);
        eVar.f285227q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends StoriesInternalAction>> continuation) {
        return ((e) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f285227q).f413261b;
        boolean z12 = interfaceC14249c instanceof AdvertDetailsLink.b.C3984b;
        StoriesState storiesState = this.f285229s;
        com.avito.android.stories.mvi.a aVar = this.f285228r;
        return z12 ? C43175k.G(new a(interfaceC14249c, aVar, storiesState, null)) : interfaceC14249c instanceof AdvertDetailsLink.b.a ? C43175k.G(new b(aVar, storiesState, null)) : C43175k.w();
    }
}
