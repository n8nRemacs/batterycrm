package com.avito.android.messenger.channels.mvi.header_feature;

import FY.b;
import com.avito.android.remote.model.messenger.get_settings.GetSettingsRequest;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.header_feature.ChannelsHeaderBootstrap$subscribeToAutoRepliesUrlChanges$$inlined$flatMapLatest$1", f = "ChannelsHeaderBootstrap.kt", i = {}, l = {JfifUtil.MARKER_RST7, 189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
public final class r extends SuspendLambda implements Y41.q<InterfaceC43172j<? super b.c>, G0, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f187588q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f187589r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f187590s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C f187591t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Continuation continuation, C c12) {
        super(3, continuation);
        this.f187591t = c12;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super b.c> interfaceC43172j, G0 g02, Continuation<? super G0> continuation) {
        r rVar = new r(continuation, this.f187591t);
        rVar.f187589r = interfaceC43172j;
        rVar.f187590s = g02;
        return rVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f187588q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = this.f187589r;
            C c12 = this.f187591t;
            io.reactivex.rxjava3.core.I iN2 = c12.f187461b.n(GetSettingsRequest.ForAutoReplies.INSTANCE);
            this.f187589r = interfaceC43172j;
            this.f187588q = 1;
            obj = C43292o.b(iN2, this);
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
            interfaceC43172j = this.f187589r;
            C42729a0.b(obj);
        }
        C43152f0 c43152f0 = new C43152f0(new w(new C43210w(obj)), new u(3, null));
        this.f187589r = null;
        this.f187588q = 2;
        if (C43175k.u(this, c43152f0, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
