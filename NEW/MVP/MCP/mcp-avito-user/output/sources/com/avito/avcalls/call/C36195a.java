package com.avito.avcalls.call;

import com.avito.avcalls.call.models.CallMetaInfo;
import com.avito.avcalls.signaling.proto.IncomingPush;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CallManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.call.CallManager$1", f = "CallManager.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.call.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36195a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332640q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C36199e f332641r;

    /* compiled from: CallManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/signaling/proto/IncomingPush;", "incomingPush", "Lkotlin/G0;", "emit", "(Lcom/avito/avcalls/signaling/proto/IncomingPush;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.avcalls.call.a$a, reason: collision with other inner class name */
    public static final class C10329a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C36199e f332642b;

        public C10329a(C36199e c36199e) {
            this.f332642b = c36199e;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            IncomingPush incomingPush = (IncomingPush) obj;
            String str = incomingPush.f333332a;
            C36199e c36199e = this.f332642b;
            String str2 = incomingPush.f333333b;
            String strConcat = "to=".concat(str2);
            StringBuilder sb2 = new StringBuilder("isVideo=");
            boolean z12 = incomingPush.f333334c;
            sb2.append(z12);
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder("metaInfo=");
            CallMetaInfo callMetaInfo = incomingPush.f333335d;
            sb3.append(callMetaInfo);
            Object[] objArr = {str, strConcat, string, sb3.toString()};
            com.avito.avcalls.utils.logs.a aVar = C36199e.f332652k;
            aVar.b("startIncomingCall", objArr);
            if (c36199e.f332662j.containsKey(str)) {
                aVar.c(str, "startIncomingCall", "callId already exists, skip");
            } else {
                C36203i c36203i = new C36203i(2, c36199e, C36199e.class, "handleStatsReport", "handleStatsReport(Ljava/lang/String;Lcom/avito/avcalls/call/models/CallState;)V", 0);
                y yVar = c36199e.f332654b;
                yVar.getClass();
                kotlinx.coroutines.T t12 = c36199e.f332653a;
                C43238h c43238hA = y.a(t12, str);
                K k12 = new K(str, str2, z12, c43238hA, y.b(t12, str), new A(str, str2, yVar.f332847b, c43238hA), yVar.f332846a, yVar.f332848c, callMetaInfo, yVar.f332849d.f332870b, new com.avito.avcalls.stats.d(), c36203i);
                c36199e.j(k12);
                C43259k.d(c43238hA, null, null, new O(k12, null), 3);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36195a(C36199e c36199e, Continuation<? super C36195a> continuation) {
        super(2, continuation);
        this.f332641r = c36199e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36195a(this.f332641r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C36195a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332640q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C36199e c36199e = this.f332641r;
            InterfaceC43160i<IncomingPush> interfaceC43160iA = c36199e.f332655c.a();
            C10329a c10329a = new C10329a(c36199e);
            this.f332640q = 1;
            if (interfaceC43160iA.collect(c10329a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
