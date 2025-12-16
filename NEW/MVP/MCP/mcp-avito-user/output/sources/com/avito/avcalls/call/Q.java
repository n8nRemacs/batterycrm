package com.avito.avcalls.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.avcalls.call.models.CallDirection;
import com.avito.avcalls.call.models.CallMetaInfo;
import com.avito.avcalls.call.models.CreateCallMetaInfo;
import com.avito.avcalls.signaling.proto.VoipMessage;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.C43238h;
import uQ0.C48937a;
import uQ0.b;

/* compiled from: OutgoingCallSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/call/Q;", "Lcom/avito/avcalls/call/r;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Q extends r {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final com.avito.avcalls.utils.logs.a f332611r = new com.avito.avcalls.utils.logs.a("CallSession.Outgoing");

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.utils.c f332612o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final CreateCallMetaInfo f332613p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.config.a f332614q;

    /* compiled from: OutgoingCallSession.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[VoipMessage.MessageType.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                VoipMessage.MessageType messageType = VoipMessage.MessageType.f333356b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                VoipMessage.MessageType messageType2 = VoipMessage.MessageType.f333356b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                VoipMessage.MessageType messageType3 = VoipMessage.MessageType.f333356b;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: OutgoingCallSession.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.avcalls.call.OutgoingCallSession", f = "OutgoingCallSession.kt", i = {0, 0, 1, 1}, l = {209, 230}, m = "handleNewMessage", n = {"this", "message", "this", "message"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Q f332615q;

        /* renamed from: r, reason: collision with root package name */
        public VoipMessage f332616r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f332617s;

        /* renamed from: u, reason: collision with root package name */
        public int f332619u;

        public c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f332617s = obj;
            this.f332619u |= BeduinInputModel.MIN_TEXT_VERSION;
            return Q.this.d(null, this);
        }
    }

    public Q(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, @Y61.k C43238h c43238h, @Y61.k C43238h c43238h2, @Y61.k A a12, @Y61.k V v12, @Y61.k com.avito.avcalls.utils.c cVar, @Y61.k CreateCallMetaInfo createCallMetaInfo, @Y61.k com.avito.avcalls.config.a aVar, @Y61.k com.avito.avcalls.stats.d dVar, @Y61.k Y41.p pVar, @Y61.k CallMetaInfo callMetaInfo) {
        super(str, str2, str3, z12, CallDirection.OUTGOING, c43238h, c43238h2, a12, v12, aVar, dVar, pVar, callMetaInfo);
        this.f332612o = cVar;
        this.f332613p = createCallMetaInfo;
        this.f332614q = aVar;
        C48937a.Companion companion = C48937a.INSTANCE;
        b.AbstractC12713b.d dVar2 = new b.AbstractC12713b.d(str, z12, createCallMetaInfo);
        companion.getClass();
        C48937a.Companion.a(dVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.avito.avcalls.call.r
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k com.avito.avcalls.signaling.proto.VoipMessage r17, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r18) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.Q.d(com.avito.avcalls.signaling.proto.VoipMessage, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
