package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import MY.k;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.I0;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V", "com/avito/android/arch/mvi/utils/p"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorDelegateImpl$process$$inlined$channelFlowWithAccessToStateFrom$1", f = "MessageListActorDelegate.kt", i = {1, 1}, l = {341, 348}, m = "invokeSuspend", n = {"contextLoadedState", ChannelContext.UserToUser.TYPE}, s = {"L$0", "L$1"})
/* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31956b extends SuspendLambda implements Y41.p<I0<? super MY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f189919q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f189920r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f189921s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k.a f189922t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k.a f189923u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ J f189924v;

    /* renamed from: w, reason: collision with root package name */
    public User f189925w;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.b$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<MY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(MY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((I0) this.receiver).send(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31956b(com.avito.android.arch.mvi.utils.o oVar, k.a aVar, Continuation continuation, k.a aVar2, J j12) {
        super(2, continuation);
        this.f189921s = oVar;
        this.f189922t = aVar;
        this.f189923u = aVar2;
        this.f189924v = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31956b c31956b = new C31956b(this.f189921s, this.f189922t, continuation, this.f189923u, this.f189924v);
        c31956b.f189920r = obj;
        return c31956b;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super MY.d> i02, Continuation<? super kotlin.G0> continuation) {
        return ((C31956b) create(i02, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.C31956b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
