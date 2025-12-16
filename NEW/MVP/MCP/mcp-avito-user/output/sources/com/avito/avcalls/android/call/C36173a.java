package com.avito.avcalls.android.call;

import com.avito.avcalls.android.call.models.CallMetaInfo;
import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.signaling.proto.IncomingPush;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CallManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.call.CallManager$1", f = "CallManager.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.android.call.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36173a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331473q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C36177e f331474r;

    /* compiled from: CallManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/IncomingPush;", "incomingPush", "Lkotlin/G0;", "emit", "(Lcom/avito/avcalls/android/signaling/proto/IncomingPush;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.avcalls.android.call.a$a, reason: collision with other inner class name */
    public static final class C10305a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C36177e f331475b;

        public C10305a(C36177e c36177e) {
            this.f331475b = c36177e;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            IncomingPush incomingPush = (IncomingPush) obj;
            String str = incomingPush.f332114a;
            C36177e c36177e = this.f331475b;
            g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
            StringBuilder sbA = androidx.appcompat.app.r.A("startIncomingCall(): callId=", str, ", isVideo=");
            boolean z12 = incomingPush.f332116c;
            sbA.append(z12);
            sbA.append(", meta=");
            CallMetaInfo callMetaInfo = incomingPush.f332117d;
            sbA.append(callMetaInfo);
            String string = sbA.toString();
            companion.getClass();
            g.Companion.c("CallManager", string);
            if (c36177e.f331494j.containsKey(str)) {
                g.Companion.a("CallManager", "startIncomingCall(): callId=" + str + " already exists, skip", null);
            } else {
                C36181i c36181i = new C36181i(2, c36177e, C36177e.class, "handleStatsReport", "handleStatsReport(Ljava/lang/String;Lcom/avito/avcalls/android/call/models/CallState;)V", 0);
                v vVar = c36177e.f331486b;
                vVar.getClass();
                T t12 = c36177e.f331485a;
                C43238h c43238hA = v.a(t12, str);
                C43238h c43238hB = v.b(t12, str);
                com.avito.avcalls.android.signaling.p pVar = vVar.f331632b;
                String str2 = incomingPush.f332115b;
                F f12 = new F(str, str2, z12, c43238hA, c43238hB, new x(str, str2, pVar, c43238hA), vVar.f331631a, vVar.f331633c, callMetaInfo, vVar.f331634d.f331673b, new com.avito.avcalls.android.stats.d(), c36181i);
                c36177e.j(f12);
                C43259k.d(c43238hA, null, null, new J(f12, null), 3);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36173a(C36177e c36177e, Continuation<? super C36173a> continuation) {
        super(2, continuation);
        this.f331474r = c36177e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36173a(this.f331474r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C36173a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331473q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C36177e c36177e = this.f331474r;
            InterfaceC43160i<IncomingPush> interfaceC43160iA = c36177e.f331487c.a();
            C10305a c10305a = new C10305a(c36177e);
            this.f331473q = 1;
            if (interfaceC43160iA.collect(c10305a, this) == coroutine_suspended) {
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
