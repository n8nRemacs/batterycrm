package com.avito.avcalls.android.call;

import com.avito.avcalls.android.call.models.CallDirection;
import com.avito.avcalls.android.call.models.CallMetaInfo;
import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.rtc.IceCandidate;
import com.avito.avcalls.android.rtc.Sdp;
import com.avito.avcalls.android.signaling.proto.VoipMessage;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: IncomingCallSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/call/F;", "Lcom/avito/avcalls/android/call/o;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class F extends AbstractC36187o {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.utils.c f331419n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.config.a f331420o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public Sdp f331421p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public List<IceCandidate> f331422q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public Sdp f331423r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public List<IceCandidate> f331424s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f331425t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final RingingState f331426u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public K f331427v;

    /* compiled from: IncomingCallSession.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[K.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                K k12 = K.f331439b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                K k13 = K.f331439b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VoipMessage.MessageType.values().length];
            try {
                iArr2[3] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                VoipMessage.MessageType messageType = VoipMessage.MessageType.f332138b;
                iArr2[4] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public F(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.k C43238h c43238h, @Y61.k C43238h c43238h2, @Y61.k x xVar, @Y61.k S s5, @Y61.k com.avito.avcalls.android.utils.c cVar, @Y61.k CallMetaInfo callMetaInfo, @Y61.k com.avito.avcalls.android.config.a aVar, @Y61.k com.avito.avcalls.android.stats.d dVar, @Y61.k Y41.p pVar) {
        super(str, str2, "", z12, CallDirection.f331536c, c43238h, c43238h2, xVar, s5, aVar, dVar, pVar, callMetaInfo);
        this.f331419n = cVar;
        this.f331420o = aVar;
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f331422q = c42784z0;
        this.f331424s = c42784z0;
        this.f331426u = new RingingState(null, false, 3, null);
        this.f331427v = K.f331439b;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(com.avito.avcalls.android.call.F r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.F.j(com.avito.avcalls.android.call.F, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.avcalls.android.call.AbstractC36187o
    @Y61.l
    public final Object e(@Y61.k VoipMessage voipMessage, @Y61.k Continuation<? super G0> continuation) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("IncomingCallSession", "handleNewMessage(): " + voipMessage);
        int iOrdinal = voipMessage.f332129a.ordinal();
        if (iOrdinal == 3) {
            this.f331585h.h(voipMessage.f332131c);
        } else if (iOrdinal != 4) {
            g.Companion.a("IncomingCallSession", "handleNewMessage(): unprocessed message with type=[" + voipMessage.f332129a + ']', null);
        } else {
            i(voipMessage);
        }
        return G0.f406611a;
    }
}
