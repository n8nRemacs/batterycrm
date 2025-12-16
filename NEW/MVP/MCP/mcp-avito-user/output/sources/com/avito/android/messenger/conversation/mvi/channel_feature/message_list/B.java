package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import MY.k;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MessageListActorDelegate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LMY/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorDelegateImpl$process$12", f = "MessageListActorDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class B extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ k.a f189739q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J f189740r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(k.a aVar, J j12, Continuation<? super B> continuation) {
        super(2, continuation);
        this.f189739q = aVar;
        this.f189740r = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new B(this.f189739q, this.f189740r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((B) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<MessageBody.SystemMessageBody.Platform.Bubble> chunks;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        k.a.c cVar = (k.a.c) this.f189739q;
        MessageBody.SystemMessageBody.Platform.Bubble f189195a = cVar.f10768a.f189168c.getF189195a();
        Integer numValueOf = null;
        MessageBody.SystemMessageBody.Platform.Bubble.File file = f189195a instanceof MessageBody.SystemMessageBody.Platform.Bubble.File ? (MessageBody.SystemMessageBody.Platform.Bubble.File) f189195a : null;
        J j12 = this.f189740r;
        if (file != null) {
            LocalMessage localMessage = cVar.f10768a.f189180o;
            j12.getClass();
            MessageBody body = localMessage.getBody();
            MessageBody.SystemMessageBody.Platform platform = body instanceof MessageBody.SystemMessageBody.Platform ? (MessageBody.SystemMessageBody.Platform) body : null;
            if (platform != null && (chunks = platform.getChunks()) != null) {
                numValueOf = Integer.valueOf(chunks.indexOf(file));
            }
        }
        com.avito.android.messenger.conversation.mvi.file_download.N n12 = j12.f189829l;
        T1.d dVar = cVar.f10768a;
        n12.B7(dVar.f189180o, dVar.f189181p, numValueOf);
        return kotlin.G0.f406611a;
    }
}
