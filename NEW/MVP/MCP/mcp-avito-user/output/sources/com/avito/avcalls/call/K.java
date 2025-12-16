package com.avito.avcalls.call;

import com.avito.avcalls.call.models.CallDirection;
import com.avito.avcalls.call.models.CallMetaInfo;
import com.avito.avcalls.rtc.connecting.IceCandidate;
import com.avito.avcalls.rtc.connecting.Sdp;
import com.avito.avcalls.signaling.proto.VoipMessage;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: IncomingCallSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/call/K;", "Lcom/avito/avcalls/call/r;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class K extends r {

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public static final com.avito.avcalls.utils.logs.a f332585x = new com.avito.avcalls.utils.logs.a("CallSession.Incoming");

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.utils.c f332586o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.config.a f332587p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public Sdp f332588q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public List<IceCandidate> f332589r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Sdp f332590s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public List<IceCandidate> f332591t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f332592u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final RingingState f332593v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public P f332594w;

    /* compiled from: IncomingCallSession.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[P.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                P p12 = P.f332606b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                P p13 = P.f332606b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VoipMessage.MessageType.values().length];
            try {
                iArr2[3] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                VoipMessage.MessageType messageType = VoipMessage.MessageType.f333356b;
                iArr2[4] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public K(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.k C43238h c43238h, @Y61.k C43238h c43238h2, @Y61.k A a12, @Y61.k V v12, @Y61.k com.avito.avcalls.utils.c cVar, @Y61.k CallMetaInfo callMetaInfo, @Y61.k com.avito.avcalls.config.a aVar, @Y61.k com.avito.avcalls.stats.d dVar, @Y61.k Y41.p pVar) {
        super(str, str2, "", z12, CallDirection.INCOMING, c43238h, c43238h2, a12, v12, aVar, dVar, pVar, callMetaInfo);
        this.f332586o = cVar;
        this.f332587p = aVar;
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f332589r = c42784z0;
        this.f332591t = c42784z0;
        this.f332593v = new RingingState(null, false, 3, null);
        this.f332594w = P.f332606b;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(com.avito.avcalls.call.K r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.K.k(com.avito.avcalls.call.K, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.avcalls.call.r
    @Y61.l
    public final Object d(@Y61.k VoipMessage voipMessage, @Y61.k Continuation<? super G0> continuation) {
        com.avito.avcalls.utils.logs.a aVar = f332585x;
        aVar.b("handleNewMessage", voipMessage);
        int iOrdinal = voipMessage.f333347a.ordinal();
        if (iOrdinal == 3) {
            this.f332798h.Q(voipMessage.f333349c);
        } else if (iOrdinal != 4) {
            aVar.a("handleNewMessage", "unprocessed message with type=" + voipMessage.f333347a, null);
        } else {
            j(voipMessage);
        }
        return G0.f406611a;
    }
}
