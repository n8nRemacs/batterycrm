package com.avito.avcalls.android.signaling.transport;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.avcalls.android.config.Config;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SignalingProcessorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/signaling/transport/g;", "Lcom/avito/avcalls/android/signaling/transport/d;", "Lkotlinx/coroutines/T;", "Companion", "a", "b", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements d, T {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.avcalls.android.signaling.transport.external.h f332188b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Config f332189c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.avcalls.android.connection_quality.b f332190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.avito.avcalls.android.utils.coroutines.c f332191e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e2 f332192f = f2.b(0, 128, null, 5);

    /* renamed from: g, reason: collision with root package name */
    public long f332193g = 1;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final e2 f332194h = f2.b(0, 128, null, 5);

    /* compiled from: SignalingProcessorImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/avcalls/android/signaling/transport/g$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "", "RECEIVING_QUEUE_BUFFER_SIZE", "I", "SENDING_QUEUE_BUFFER_SIZE", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.signaling.transport.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: SignalingProcessorImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/signaling/transport/g$b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f332195a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f332196b;

        /* renamed from: c, reason: collision with root package name */
        public final long f332197c;

        public b(@k String str, @k String str2, long j12) {
            this.f332195a = str;
            this.f332196b = str2;
            this.f332197c = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f332195a, bVar.f332195a) && L.f(this.f332196b, bVar.f332196b) && this.f332197c == bVar.f332197c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f332197c) + H.d(this.f332195a.hashCode() * 31, 31, this.f332196b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SendRequest(method=");
            sb2.append(this.f332195a);
            sb2.append(", payload=");
            sb2.append(this.f332196b);
            sb2.append(", sequenceId=");
            return r.u(sb2, this.f332197c, ')');
        }
    }

    public g(@k com.avito.avcalls.android.utils.coroutines.c cVar, @k com.avito.avcalls.android.signaling.transport.external.a aVar, @k com.avito.avcalls.android.signaling.transport.external.h hVar, @k Config config, @k com.avito.avcalls.android.connection_quality.b bVar) {
        this.f332188b = hVar;
        this.f332189c = config;
        this.f332190d = bVar;
        this.f332191e = cVar;
        C43259k.d(this, null, null, new e(this, null), 3);
        C43259k.d(this, null, null, new f(aVar, this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00d5 -> B:36:0x0150). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0118 -> B:34:0x011c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.avcalls.android.signaling.transport.g r17, com.avito.avcalls.android.signaling.transport.g.b r18, kotlin.coroutines.Continuation r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.signaling.transport.g.b(com.avito.avcalls.android.signaling.transport.g, com.avito.avcalls.android.signaling.transport.g$b, kotlin.coroutines.Continuation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k com.avito.avcalls.android.signaling.transport.d.a r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.signaling.transport.g.c(com.avito.avcalls.android.signaling.transport.d$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.T
    @k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF333661d() {
        return this.f332191e.f332438d;
    }
}
