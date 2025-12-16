package com.avito.android.beduin.v2.page.impl.compose.screen;

import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.beduin.v2.render.compose.G;
import dU0.InterfaceC39628a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;

/* compiled from: BeduinV2PageScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/N0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/N0;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.beduin.v2.page.impl.compose.screen.BeduinV2PageScreenKt$handleBeduinOneTimeEvents$2", f = "BeduinV2PageScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class o extends SuspendLambda implements Y41.p<T, Continuation<? super N0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f105078q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G f105079r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BeduinOneTimeEvent f105080s;

    /* compiled from: BeduinV2PageScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.beduin.v2.page.impl.compose.screen.BeduinV2PageScreenKt$handleBeduinOneTimeEvents$2$1", f = "BeduinV2PageScreen.kt", i = {}, l = {229}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f105081q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ G f105082r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ BeduinOneTimeEvent f105083s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(G g12, BeduinOneTimeEvent beduinOneTimeEvent, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f105082r = g12;
            this.f105083s = beduinOneTimeEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f105082r, this.f105083s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f105081q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC39628a interfaceC39628a = ((BeduinOneTimeEvent.a) this.f105083s).f176280a;
                this.f105081q = 1;
                Object objEmit = this.f105082r.f338042e.emit(interfaceC39628a, this);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = G0.f406611a;
                }
                if (objEmit == coroutine_suspended) {
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
    public o(G g12, BeduinOneTimeEvent beduinOneTimeEvent, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f105079r = g12;
        this.f105080s = beduinOneTimeEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        o oVar = new o(this.f105079r, this.f105080s, continuation);
        oVar.f105078q = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super N0> continuation) {
        return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return C43259k.d((T) this.f105078q, null, null, new a(this.f105079r, this.f105080s, null), 3);
    }
}
