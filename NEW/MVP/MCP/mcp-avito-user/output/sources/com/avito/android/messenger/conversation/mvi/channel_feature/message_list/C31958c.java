package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import MY.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.I0;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V", "com/avito/android/arch/mvi/utils/p"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorDelegateImpl$process$$inlined$channelFlowWithAccessToStateFrom$2", f = "MessageListActorDelegate.kt", i = {}, l = {341, 344, 348, 359, 369, 372, 397, 407, 420, 441, 450, 454, 479, 516}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31958c extends SuspendLambda implements Y41.p<I0<? super MY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f189930q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f189931r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f189932s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k.a.g f189933t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J f189934u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k.a.g f189935v;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.c$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<MY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(MY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((I0) this.receiver).send(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31958c(com.avito.android.arch.mvi.utils.o oVar, k.a.g gVar, Continuation continuation, J j12, k.a.g gVar2) {
        super(2, continuation);
        this.f189932s = oVar;
        this.f189933t = gVar;
        this.f189934u = j12;
        this.f189935v = gVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31958c c31958c = new C31958c(this.f189932s, this.f189933t, continuation, this.f189934u, this.f189935v);
        c31958c.f189931r = obj;
        return c31958c;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super MY.d> i02, Continuation<? super kotlin.G0> continuation) {
        return ((C31958c) create(i02, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0200  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.C31958c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
