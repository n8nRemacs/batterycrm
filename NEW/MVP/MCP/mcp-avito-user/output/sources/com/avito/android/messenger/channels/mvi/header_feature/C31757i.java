package com.avito.android.messenger.channels.mvi.header_feature;

import com.avito.android.remote.model.TypedResult;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pP.C46987a;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.header_feature.ChannelsHeaderBootstrap$subscribeCrmEntryPointStatus$$inlined$flatMapLatest$1", f = "ChannelsHeaderBootstrap.kt", i = {}, l = {JfifUtil.MARKER_RST7, 189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.header_feature.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31757i extends SuspendLambda implements Y41.q<InterfaceC43172j<? super TypedResult<C46987a>>, MessengerUserHashInfo, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f187552q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f187553r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f187554s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C f187555t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31757i(Continuation continuation, C c12) {
        super(3, continuation);
        this.f187555t = c12;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super TypedResult<C46987a>> interfaceC43172j, MessengerUserHashInfo messengerUserHashInfo, Continuation<? super G0> continuation) {
        C31757i c31757i = new C31757i(continuation, this.f187555t);
        c31757i.f187553r = interfaceC43172j;
        c31757i.f187554s = messengerUserHashInfo;
        return c31757i.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f187552q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = this.f187553r;
            C c12 = this.f187555t;
            this.f187553r = interfaceC43172j;
            this.f187552q = 1;
            obj = c12.f187464e.a(this);
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
            interfaceC43172j = this.f187553r;
            C42729a0.b(obj);
        }
        C43210w c43210w = new C43210w(obj);
        this.f187553r = null;
        this.f187552q = 2;
        if (C43175k.u(this, c43210w, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
