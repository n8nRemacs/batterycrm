package com.avito.android.ai_assistant.screens.chat.mvi;

import Tb.f;
import com.avito.android.ai_assistant.model.MessageActionType;
import com.avito.android.ai_assistant.model.ReactionState;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.I0;

/* compiled from: AiAssistantChatActor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.AiAssistantChatActor$createReactionsActionsJob$1", f = "AiAssistantChatActor.kt", i = {0, 1}, l = {343, 345, 361}, m = "invokeSuspend", n = {"actionType", "actionType"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28364c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public MessageActionType f89223q;

    /* renamed from: r, reason: collision with root package name */
    public int f89224r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f.c f89225s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ReactionState f89226t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ I0<AiAssistantInternalAction> f89227u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f89228v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C28362a f89229w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f89230x;

    /* compiled from: AiAssistantChatActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.c$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ReactionState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ReactionState reactionState = ReactionState.f89129b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ReactionState reactionState2 = ReactionState.f89129b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[MessageActionType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MessageActionType messageActionType = MessageActionType.f89107b;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MessageActionType messageActionType2 = MessageActionType.f89107b;
                iArr2[3] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                MessageActionType messageActionType3 = MessageActionType.f89107b;
                iArr2[1] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28364c(f.c cVar, ReactionState reactionState, I0<? super AiAssistantInternalAction> i02, String str, C28362a c28362a, String str2, Continuation<? super C28364c> continuation) {
        super(2, continuation);
        this.f89225s = cVar;
        this.f89226t = reactionState;
        this.f89227u = i02;
        this.f89228v = str;
        this.f89229w = c28362a;
        this.f89230x = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C28364c(this.f89225s, this.f89226t, this.f89227u, this.f89228v, this.f89229w, this.f89230x, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C28364c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.chat.mvi.C28364c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
