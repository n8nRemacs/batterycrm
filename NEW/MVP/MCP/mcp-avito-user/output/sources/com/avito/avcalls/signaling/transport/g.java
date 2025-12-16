package com.avito.avcalls.signaling.transport;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.avcalls.config.Config;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SignalingProcessorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/signaling/transport/g;", "Lcom/avito/avcalls/signaling/transport/d;", "Lkotlinx/coroutines/T;", "Companion", "a", "b", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements d, T {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final com.avito.avcalls.utils.logs.a f333410i = new com.avito.avcalls.utils.logs.a("SignalingProcessor");

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.avcalls.signaling.transport.external.h f333411b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Config f333412c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.avcalls.connection_quality.b f333413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.avito.avcalls.utils.coroutines.c f333414e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e2 f333415f = f2.b(0, 128, null, 5);

    /* renamed from: g, reason: collision with root package name */
    public long f333416g = 1;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final e2 f333417h = f2.b(0, 128, null, 5);

    /* compiled from: SignalingProcessorImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/avcalls/signaling/transport/g$a;", "", "<init>", "()V", "", "RECEIVING_QUEUE_BUFFER_SIZE", "I", "SENDING_QUEUE_BUFFER_SIZE", "Lcom/avito/avcalls/utils/logs/a;", "logs", "Lcom/avito/avcalls/utils/logs/a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.signaling.transport.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: SignalingProcessorImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/signaling/transport/g$b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f333418a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f333419b;

        /* renamed from: c, reason: collision with root package name */
        public final long f333420c;

        public b(@k String str, @k String str2, long j12) {
            this.f333418a = str;
            this.f333419b = str2;
            this.f333420c = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f333418a, bVar.f333418a) && L.f(this.f333419b, bVar.f333419b) && this.f333420c == bVar.f333420c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f333420c) + H.d(this.f333418a.hashCode() * 31, 31, this.f333419b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SendRequest(method=");
            sb2.append(this.f333418a);
            sb2.append(", payload=");
            sb2.append(this.f333419b);
            sb2.append(", sequenceId=");
            return r.u(sb2, this.f333420c, ')');
        }
    }

    public g(@k com.avito.avcalls.utils.coroutines.c cVar, @k com.avito.avcalls.signaling.transport.external.a aVar, @k com.avito.avcalls.signaling.transport.external.h hVar, @k Config config, @k com.avito.avcalls.connection_quality.b bVar) {
        this.f333411b = hVar;
        this.f333412c = config;
        this.f333413d = bVar;
        this.f333414e = cVar;
        C43259k.d(this, null, null, new e(this, null), 3);
        C43259k.d(this, null, null, new f(aVar, this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.avito.avcalls.utils.logs.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ca -> B:36:0x011f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00fa -> B:34:0x00fd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.avcalls.signaling.transport.g r17, com.avito.avcalls.signaling.transport.g.b r18, kotlin.coroutines.Continuation r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.signaling.transport.g.b(com.avito.avcalls.signaling.transport.g, com.avito.avcalls.signaling.transport.g$b, kotlin.coroutines.Continuation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k com.avito.avcalls.signaling.transport.d.a r14, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.signaling.transport.g.c(com.avito.avcalls.signaling.transport.d$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.T
    @k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF333661d() {
        return this.f333414e.f333661d;
    }
}
