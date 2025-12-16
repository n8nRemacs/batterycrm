package com.avito.android.messenger.channels.mvi.list_feature;

import HY.m;
import com.avito.android.persistence.messenger.C33126v0;
import com.avito.android.remote.model.messenger.Channel;
import java.util.List;
import java.util.SortedSet;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: Merge.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$subscribeToChannelsUpdatesFromDb$$inlined$flatMapLatest$1", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.t0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31810t0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super kotlin.Q<? extends List<? extends kotlin.Q<? extends Channel, ? extends com.avito.android.persistence.messenger.P0>>, ? extends m.d>>, kotlin.Q<? extends MessengerUserHashInfo, ? extends m.b>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f188210q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f188211r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f188212s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f188213t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31810t0(W w12, Continuation continuation) {
        super(3, continuation);
        this.f188213t = w12;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super kotlin.Q<? extends List<? extends kotlin.Q<? extends Channel, ? extends com.avito.android.persistence.messenger.P0>>, ? extends m.d>> interfaceC43172j, kotlin.Q<? extends MessengerUserHashInfo, ? extends m.b> q12, Continuation<? super kotlin.G0> continuation) {
        C31810t0 c31810t0 = new C31810t0(this.f188213t, continuation);
        c31810t0.f188211r = interfaceC43172j;
        c31810t0.f188212s = q12;
        return c31810t0.invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i interfaceC43160iW;
        io.reactivex.rxjava3.core.z<List<kotlin.Q<Channel, com.avito.android.persistence.messenger.P0>>> zVarD;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f188210q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f188211r;
            kotlin.Q q12 = (kotlin.Q) this.f188212s;
            MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) q12.f406619b;
            m.b bVar = (m.b) q12.f406620c;
            W w12 = this.f188213t;
            if (messengerUserHashInfo == null || C43066x.K(messengerUserHashInfo.f430682d) || bVar == null) {
                interfaceC43160iW = C43175k.w();
            } else {
                C33126v0 c33126v0 = w12.f187873j;
                com.avito.android.messenger.channels.filter.j jVar = w12.f187875l;
                C33126v0 c33126v02 = w12.f187872i;
                if (c33126v0 != null) {
                    SortedSet<String> sortedSet = c33126v02.f215552a;
                    SortedSet<String> sortedSet2 = c33126v02.f215553b;
                    SortedSet<String> sortedSet3 = c33126v0.f215552a;
                    SortedSet<String> sortedSet4 = c33126v0.f215553b;
                    Boolean boolA = jVar.a();
                    zVarD = w12.f187866c.e(messengerUserHashInfo, bVar.f7262a, sortedSet, sortedSet2, sortedSet3, sortedSet4, boolA);
                } else {
                    SortedSet<String> sortedSet5 = c33126v02.f215552a;
                    SortedSet<String> sortedSet6 = c33126v02.f215553b;
                    Boolean boolA2 = jVar.a();
                    zVarD = w12.f187866c.d(messengerUserHashInfo, bVar.f7262a, sortedSet5, sortedSet6, boolA2);
                }
                interfaceC43160iW = new C31816w0(kotlinx.coroutines.rx3.y.a(zVarD), bVar);
            }
            w12.getClass();
            C43152f0 c43152f0D = W.d(interfaceC43160iW, "channels updates from db");
            this.f188210q = 1;
            if (C43175k.u(this, c43152f0D, interfaceC43172j) == coroutine_suspended) {
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
