package com.avito.android.player.mvi;

import Y41.p;
import Y41.q;
import com.avito.android.player.ExoPlayerController;
import com.avito.android.player.mvi.entity.PlayerInternalAction;
import com.avito.android.player.router.PlayerArguments;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
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
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: PlayerBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/player/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements com.avito.android.arch.mvi.b<PlayerInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PlayerArguments f220144a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExoPlayerController f220145b;

    /* compiled from: PlayerBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.player.mvi.PlayerBootstrap$produce$1", f = "PlayerBootstrap.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 32}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super PlayerInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f220146q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f220147r;

        /* compiled from: PlayerBootstrap.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.player.mvi.PlayerBootstrap$produce$1$2", f = "PlayerBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.player.mvi.e$a$a, reason: collision with other inner class name */
        public static final class C6621a extends SuspendLambda implements q<InterfaceC43172j<? super PlayerInternalAction>, Throwable, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ e f220149q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6621a(e eVar, Continuation<? super C6621a> continuation) {
                super(3, continuation);
                this.f220149q = eVar;
            }

            @Override // Y41.q
            public final Object invoke(InterfaceC43172j<? super PlayerInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
                return new C6621a(this.f220149q, continuation).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                this.f220149q.f220145b.b();
                return G0.f406611a;
            }
        }

        /* compiled from: PlayerBootstrap.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/player/mvi/entity/PlayerInternalAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<PlayerInternalAction> f220150b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(InterfaceC43172j<? super PlayerInternalAction> interfaceC43172j) {
                this.f220150b = interfaceC43172j;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                Object objEmit = this.f220150b.emit((PlayerInternalAction) obj, continuation);
                return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f220147r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PlayerInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f220146q;
            e eVar = e.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f220147r;
                ExoPlayerController exoPlayerController = eVar.f220145b;
                PlayerArguments playerArguments = eVar.f220144a;
                InterfaceC36534o interfaceC36534oA = exoPlayerController.a(playerArguments.f220215b);
                if (interfaceC36534oA != null) {
                    PlayerInternalAction.PlayerCreated playerCreated = new PlayerInternalAction.PlayerCreated(interfaceC36534oA, playerArguments.f220215b);
                    this.f220147r = interfaceC43172j;
                    this.f220146q = 1;
                    if (interfaceC43172j.emit(playerCreated, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f220147r;
                C42729a0.b(obj);
            }
            eVar.getClass();
            Z1 z1A = p2.a(PlayerInternalAction.Init.f220155b);
            eVar.f220145b.c(new d(z1A, eVar));
            X x12 = new X(z1A, new C6621a(eVar, null));
            b bVar = new b(interfaceC43172j);
            this.f220147r = null;
            this.f220146q = 2;
            if (x12.collect(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public e(@Y61.k PlayerArguments playerArguments, @Y61.k ExoPlayerController exoPlayerController) {
        this.f220144a = playerArguments;
        this.f220145b = exoPlayerController;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PlayerInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
