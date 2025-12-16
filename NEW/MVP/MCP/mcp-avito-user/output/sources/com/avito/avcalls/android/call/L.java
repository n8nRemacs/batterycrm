package com.avito.avcalls.android.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.avcalls.android.call.models.CallDirection;
import com.avito.avcalls.android.call.models.CallMetaInfo;
import com.avito.avcalls.android.call.models.CreateCallMetaInfo;
import com.avito.avcalls.android.signaling.proto.VoipMessage;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.C43238h;
import vQ0.AbstractC49254b;
import vQ0.C49253a;

/* compiled from: OutgoingCallSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/call/L;", "Lcom/avito/avcalls/android/call/o;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class L extends AbstractC36187o {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.utils.c f331444n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final CreateCallMetaInfo f331445o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.config.a f331446p;

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
                VoipMessage.MessageType messageType = VoipMessage.MessageType.f332138b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                VoipMessage.MessageType messageType2 = VoipMessage.MessageType.f332138b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                VoipMessage.MessageType messageType3 = VoipMessage.MessageType.f332138b;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: OutgoingCallSession.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.avcalls.android.call.OutgoingCallSession", f = "OutgoingCallSession.kt", i = {0, 0, 1, 1}, l = {199, 220}, m = "handleNewMessage", n = {"this", "message", "this", "message"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public L f331447q;

        /* renamed from: r, reason: collision with root package name */
        public VoipMessage f331448r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f331449s;

        /* renamed from: u, reason: collision with root package name */
        public int f331451u;

        public c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f331449s = obj;
            this.f331451u |= BeduinInputModel.MIN_TEXT_VERSION;
            return L.this.e(null, this);
        }
    }

    public L(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, @Y61.k C43238h c43238h, @Y61.k C43238h c43238h2, @Y61.k x xVar, @Y61.k S s5, @Y61.k com.avito.avcalls.android.utils.c cVar, @Y61.k CreateCallMetaInfo createCallMetaInfo, @Y61.k com.avito.avcalls.android.config.a aVar, @Y61.k com.avito.avcalls.android.stats.d dVar, @Y61.k Y41.p pVar, @Y61.k CallMetaInfo callMetaInfo) {
        super(str, str2, str3, z12, CallDirection.f331535b, c43238h, c43238h2, xVar, s5, aVar, dVar, pVar, callMetaInfo);
        this.f331444n = cVar;
        this.f331445o = createCallMetaInfo;
        this.f331446p = aVar;
        C49253a.Companion companion = C49253a.INSTANCE;
        AbstractC49254b.AbstractC12773b.d dVar2 = new AbstractC49254b.AbstractC12773b.d(str, z12, createCallMetaInfo);
        companion.getClass();
        C49253a.Companion.a(dVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.avito.avcalls.android.call.AbstractC36187o
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@Y61.k com.avito.avcalls.android.signaling.proto.VoipMessage r19, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r20) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.L.e(com.avito.avcalls.android.signaling.proto.VoipMessage, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
