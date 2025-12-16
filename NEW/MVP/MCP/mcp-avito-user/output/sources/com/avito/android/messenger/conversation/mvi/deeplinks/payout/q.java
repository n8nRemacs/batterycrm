package com.avito.android.messenger.conversation.mvi.deeplinks.payout;

import Hl0.InterfaceC14002a;
import Jl0.C14211a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.avito.android.util.P2;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.core.z;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.rx3.K;

/* compiled from: PayoutInteractor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/payout/q;", "Lcom/avito/android/messenger/conversation/mvi/deeplinks/payout/k;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14002a f190639a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f190640b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f190641c;

    /* compiled from: PayoutInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/payout/q$a;", "", "<init>", "()V", "", "COULDNT_PARSE_ERROR", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PayoutInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/util/P2;", "Landroid/net/Uri;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.deeplinks.payout.StrPayoutInteractor$getPayoutUrl$1", f = "PayoutInteractor.kt", i = {0}, l = {33, 45}, m = "invokeSuspend", n = {"$this$rxObservable"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<I0<? super P2<? super Uri>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f190642q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f190643r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f190644s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ q f190645t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, q qVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f190644s = str;
            this.f190645t = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f190644s, this.f190645t, continuation);
            bVar.f190643r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super P2<? super Uri>> i02, Continuation<? super G0> continuation) {
            return ((b) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws NumberFormatException {
            I0 i02;
            P2 aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f190642q;
            q qVar = this.f190645t;
            if (i12 == 0) {
                C42729a0.b(obj);
                i02 = (I0) this.f190643r;
                long j12 = Long.parseLong(this.f190644s);
                InterfaceC14002a interfaceC14002a = qVar.f190639a;
                this.f190643r = i02;
                this.f190642q = 1;
                obj = interfaceC14002a.b(j12, this);
                if (obj == coroutine_suspended) {
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
                i02 = (I0) this.f190643r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                String payoutUrl = ((C14211a) ((TypedResult.Success) typedResult).getResult()).getResult().getPayoutUrl();
                Uri uri = payoutUrl != null ? Uri.parse(payoutUrl) : null;
                if (uri == null) {
                    throw new IllegalArgumentException("Coudn't parse payoutUrl");
                }
                aVar = new P2.b(uri);
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                aVar = new P2.a(qVar.f190641c.a(C35936s.a(error.getError(), error.getCause())));
            }
            this.f190643r = null;
            this.f190642q = 2;
            if (i02.send(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public q(@Y61.k InterfaceC14002a interfaceC14002a, @Y61.k R0 r02, @Y61.k com.avito.android.remote.error.f fVar) {
        this.f190639a = interfaceC14002a;
        this.f190640b = r02;
        this.f190641c = fVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.k
    @Y61.k
    public final z<P2<Uri>> a(@Y61.k String str, @Y61.l String str2) {
        return K.a(this.f190640b.a(), new b(str, this, null));
    }
}
