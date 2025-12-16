package com.avito.avcalls.android.call;

import com.avito.avcalls.android.signaling.proto.IncomingDataMessage;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CallManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.call.CallManager$2", f = "CallManager.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.android.call.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36174b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331476q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C36177e f331477r;

    /* compiled from: CallManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/IncomingDataMessage;", "incomingMessage", "Lkotlin/G0;", "emit", "(Lcom/avito/avcalls/android/signaling/proto/IncomingDataMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.avcalls.android.call.b$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C36177e f331478b;

        public a(C36177e c36177e) {
            this.f331478b = c36177e;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) throws com.avito.avcalls.android.utils.AvCallsException.CallNotFoundException {
            /*
                r9 = this;
                com.avito.avcalls.android.signaling.proto.IncomingDataMessage r10 = (com.avito.avcalls.android.signaling.proto.IncomingDataMessage) r10
                com.avito.avcalls.android.call.e$b r11 = com.avito.avcalls.android.call.C36177e.INSTANCE
                com.avito.avcalls.android.call.e r11 = r9.f331478b
                com.avito.avcalls.android.logger.g$a r0 = com.avito.avcalls.android.logger.g.INSTANCE
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "processIncomingEvents(): incomingMessage="
                r1.<init>(r2)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                r0.getClass()
                java.lang.String r0 = "CallManager"
                com.avito.avcalls.android.logger.g.Companion.c(r0, r1)
                java.util.HashMap<java.lang.String, com.avito.avcalls.android.call.e$a> r1 = r11.f331494j
                java.lang.String r2 = r10.f332104b
                java.lang.Object r1 = r1.get(r2)
                com.avito.avcalls.android.call.e$a r1 = (com.avito.avcalls.android.call.C36177e.a) r1
                r2 = 0
                if (r1 == 0) goto L2e
                com.avito.avcalls.android.call.o r1 = r1.f331495a
                goto L2f
            L2e:
                r1 = r2
            L2f:
                if (r1 == 0) goto Lc2
                com.avito.avcalls.android.signaling.proto.VoipMessage r0 = r10.f332105c
                com.avito.avcalls.android.signaling.proto.VoipMessage$MessageType r3 = r0.f332129a
                int[] r4 = com.avito.avcalls.android.call.C36177e.c.f331498a
                int r3 = r3.ordinal()
                r3 = r4[r3]
                r4 = 1
                if (r3 != r4) goto Laf
                xQ0.k$c r1 = xQ0.k.INSTANCE
                r1.getClass()
                java.lang.String r0 = r0.f332133e
                int r1 = r0.hashCode()
                switch(r1) {
                    case -1224574323: goto L97;
                    case -934710369: goto L8b;
                    case 3035641: goto L7f;
                    case 495510284: goto L73;
                    case 778975750: goto L67;
                    case 1597281178: goto L5b;
                    case 1646564832: goto L4f;
                    default: goto L4e;
                }
            L4e:
                goto La2
            L4f:
                java.lang.String r1 = "answer_timeout"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L58
                goto La2
            L58:
                xQ0.k$a r0 = xQ0.k.a.f442496b
                goto La8
            L5b:
                java.lang.String r1 = "no_mic_access"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L64
                goto La2
            L64:
                xQ0.k$g r0 = xQ0.k.g.f442501b
                goto La8
            L67:
                java.lang.String r1 = "internal_error"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L70
                goto La2
            L70:
                xQ0.k$i r0 = xQ0.k.i.f442503b
                goto La8
            L73:
                java.lang.String r1 = "connect_timeout"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L7c
                goto La2
            L7c:
                xQ0.k$d r0 = xQ0.k.d.f442498b
                goto La8
            L7f:
                java.lang.String r1 = "busy"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L88
                goto La2
            L88:
                xQ0.k$b r0 = xQ0.k.b.f442497b
                goto La8
            L8b:
                java.lang.String r1 = "reject"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L94
                goto La2
            L94:
                xQ0.k$h r0 = xQ0.k.h.f442502b
                goto La8
            L97:
                java.lang.String r1 = "hangup"
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto La2
                xQ0.k$e r0 = xQ0.k.e.f442499b
                goto La8
            La2:
                xQ0.k$j r1 = new xQ0.k$j
                r1.<init>(r0)
                r0 = r1
            La8:
                r1 = 0
                java.lang.String r10 = r10.f332104b
                r11.n(r10, r0, r1)
                goto Lc7
            Laf:
                com.avito.avcalls.android.call.q r11 = new com.avito.avcalls.android.call.q
                long r5 = r10.f332106d
                com.avito.avcalls.android.signaling.proto.VoipMessage r7 = r10.f332105c
                r8 = 0
                r3 = r11
                r4 = r1
                r3.<init>(r4, r5, r7, r8)
                kotlinx.coroutines.internal.h r10 = r1.f331579b
                r0 = 3
                kotlinx.coroutines.C43259k.d(r10, r2, r2, r11, r0)
                goto Lc7
            Lc2:
                java.lang.String r10 = "call doesn't exists"
                com.avito.avcalls.android.logger.g.Companion.a(r0, r10, r2)
            Lc7:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.C36174b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36174b(C36177e c36177e, Continuation<? super C36174b> continuation) {
        super(2, continuation);
        this.f331477r = c36177e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36174b(this.f331477r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C36174b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331476q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C36177e c36177e = this.f331477r;
            InterfaceC43160i<IncomingDataMessage> interfaceC43160iB = c36177e.f331487c.b();
            a aVar = new a(c36177e);
            this.f331476q = 1;
            if (interfaceC43160iB.collect(aVar, this) == coroutine_suspended) {
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
