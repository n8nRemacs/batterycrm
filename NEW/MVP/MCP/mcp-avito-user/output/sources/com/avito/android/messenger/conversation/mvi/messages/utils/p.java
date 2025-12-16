package com.avito.android.messenger.conversation.mvi.messages.utils;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m;
import com.avito.android.messenger.conversation.mvi.voice.M;
import com.avito.android.messenger.conversation.mvi.voice.r0;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: VoiceMessageStateUpdatesProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/utils/p;", "Lcom/avito/android/messenger/conversation/mvi/messages/utils/o;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p extends o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f193614a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.builders.q f193615b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z1<r0> f193616c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Z1<com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m> f193617d;

    /* compiled from: VoiceMessageStateUpdatesProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.utils.VoiceMessageStateUpdatesProviderImpl$1", f = "VoiceMessageStateUpdatesProvider.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f193618q;

        /* compiled from: VoiceMessageStateUpdatesProvider.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/r0;", "voicePlayerState", "Lkotlin/G0;", "emit", "(Lcom/avito/android/messenger/conversation/mvi/voice/r0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.utils.p$a$a, reason: collision with other inner class name */
        public static final class C5723a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f193620b;

            public C5723a(p pVar) {
                this.f193620b = pVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVar;
                r0 r0Var = (r0) obj;
                p pVar = this.f193620b;
                Z1<com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m> z12 = pVar.f193617d;
                pVar.f193615b.getClass();
                String strC = "-:--";
                if (r0Var instanceof r0.b) {
                    r0.b bVar = (r0.b) r0Var;
                    String str = bVar.f195197a;
                    m.a.C5691a c5691a = m.a.C5691a.f192699a;
                    M m12 = bVar.f195198b;
                    if (m12 != null) {
                        LY.a.f9975a.getClass();
                        strC = LY.a.c(m12.f195079a);
                    }
                    mVar = new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m(str, c5691a, strC, m12 != null, m12 != null, m12 != null ? m12.f195080b : 0);
                } else if (r0Var instanceof r0.a) {
                    r0.a aVar = (r0.a) r0Var;
                    String str2 = aVar.f195195a;
                    m.a.b bVar2 = m.a.b.f192700a;
                    M m13 = aVar.f195196b;
                    if (m13 != null) {
                        LY.a.f9975a.getClass();
                        strC = LY.a.c(m13.f195079a);
                    }
                    mVar = new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m(str2, bVar2, strC, m13 != null, m13 != null, m13 != null ? m13.f195080b : 0);
                } else {
                    if (!L.f(r0Var, r0.c.f195202a) && r0Var != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar = null;
                }
                z12.setValue(mVar);
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return p.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f193618q;
            if (i12 == 0) {
                C42729a0.b(obj);
                p pVar = p.this;
                Z1<r0> z12 = pVar.f193616c;
                C5723a c5723a = new C5723a(pVar);
                this.f193618q = 1;
                if (z12.collect(c5723a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public p(@Y61.k R0 r02, @Y61.k com.avito.android.messenger.conversation.mvi.messages.builders.q qVar) {
        this.f193614a = r02;
        this.f193615b = qVar;
        C43238h c43238hA = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.c()));
        this.f193616c = p2.a(null);
        this.f193617d = p2.a(null);
        C43259k.d(c43238hA, null, null, new a(null), 3);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.utils.o
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 a(@Y61.k com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVar, @Y61.l A a12) {
        a12.C(10979019);
        InterfaceC22204y1 interfaceC22204y1A = C22126m3.a(new q(this.f193617d, mVar), mVar.f192695c, this.f193614a.c(), a12, 520, 0);
        a12.h();
        return interfaceC22204y1A;
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.utils.o
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 b(@Y61.k com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVar, @Y61.l A a12) {
        a12.C(1940017776);
        InterfaceC22204y1 interfaceC22204y1A = C22126m3.a(new r(this.f193617d, mVar), mVar.f192694b, this.f193614a.c(), a12, 520, 0);
        a12.h();
        return interfaceC22204y1A;
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.utils.o
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 c(@Y61.k com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVar, @Y61.l A a12, int i12) {
        a12.C(-1414146903);
        InterfaceC22204y1 interfaceC22204y1A = C22126m3.a(new s(this.f193617d, mVar), mVar, this.f193614a.c(), a12, ((i12 << 3) & 112) | 520, 0);
        a12.h();
        return interfaceC22204y1A;
    }
}
