package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import androidx.work.WorkInfo;
import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import java.util.Map;
import java.util.UUID;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: Merge.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToFileDownloadFails$$inlined$flatMapLatest$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
public final class Y extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Map<UUID, ? extends WorkInfo>>, Y0<? extends MessengerUserHashInfo>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f189905q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f189906r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f189907s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G0 f189908t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(G0 g02, Continuation continuation) {
        super(3, continuation);
        this.f189908t = g02;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super Map<UUID, ? extends WorkInfo>> interfaceC43172j, Y0<? extends MessengerUserHashInfo> y02, Continuation<? super kotlin.G0> continuation) {
        Y y12 = new Y(this.f189908t, continuation);
        y12.f189906r = interfaceC43172j;
        y12.f189907s = y02;
        return y12.invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i interfaceC43160iA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f189905q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f189906r;
            Y0 y02 = (Y0) this.f189907s;
            if (y02 instanceof X0) {
                interfaceC43160iA = C43175k.w();
            } else {
                if (!(y02 instanceof C23703n1)) {
                    throw new NoWhenBranchMatchedException();
                }
                MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) ((C23703n1) y02).f56288b;
                G0 g02 = this.f189908t;
                interfaceC43160iA = kotlinx.coroutines.rx3.y.a(g02.f189789o.b(g02.f189785k.now(), g02.f189775a, messengerUserHashInfo));
            }
            this.f189905q = 1;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
