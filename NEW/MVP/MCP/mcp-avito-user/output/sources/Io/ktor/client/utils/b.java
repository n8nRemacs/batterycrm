package io.ktor.client.utils;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.ktor.utils.io.C41714z1;
import io.ktor.utils.io.W0;
import io.ktor.utils.io.e2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.D0;

/* compiled from: ByteChannelUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {

    /* compiled from: ByteChannelUtils.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/e2;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/e2;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3}, l = {23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_NO_ACTIVITY, 31}, m = "invokeSuspend", n = {"$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "total", "bytesSend", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "total", "bytesSend", "read", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "total", "bytesSend", "$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "I$0", "L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<e2, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ Long f399819A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ W0 f399820B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ Y41.q<Long, Long, Continuation<? super G0>, Object> f399821C;

        /* renamed from: q, reason: collision with root package name */
        public Object f399822q;

        /* renamed from: r, reason: collision with root package name */
        public W0 f399823r;

        /* renamed from: s, reason: collision with root package name */
        public Y41.q f399824s;

        /* renamed from: t, reason: collision with root package name */
        public Object f399825t;

        /* renamed from: u, reason: collision with root package name */
        public byte[] f399826u;

        /* renamed from: v, reason: collision with root package name */
        public long f399827v;

        /* renamed from: w, reason: collision with root package name */
        public long f399828w;

        /* renamed from: x, reason: collision with root package name */
        public int f399829x;

        /* renamed from: y, reason: collision with root package name */
        public int f399830y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f399831z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Long l12, W0 w02, Y41.q<? super Long, ? super Long, ? super Continuation<? super G0>, ? extends Object> qVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f399819A = l12;
            this.f399820B = w02;
            this.f399821C = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f399819A, this.f399820B, this.f399821C, continuation);
            aVar.f399831z = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(e2 e2Var, Continuation<? super G0> continuation) {
            return ((a) create(e2Var, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00db A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:41:0x00d5, B:43:0x00db, B:46:0x00f6, B:58:0x0159, B:62:0x016c, B:32:0x00b4, B:35:0x00bb), top: B:71:0x00b4 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x011b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0148 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0159 A[Catch: all -> 0x00c0, TRY_ENTER, TryCatch #0 {all -> 0x00c0, blocks: (B:41:0x00d5, B:43:0x00db, B:46:0x00f6, B:58:0x0159, B:62:0x016c, B:32:0x00b4, B:35:0x00bb), top: B:71:0x00b4 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0149 -> B:55:0x0151). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 409
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.utils.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Y61.k
    public static final W0 a(@Y61.k W0 w02, @Y61.k CoroutineContext coroutineContext, @Y61.l Long l12, @Y61.k Y41.q<? super Long, ? super Long, ? super Continuation<? super G0>, ? extends Object> qVar) {
        return C41714z1.b(D0.f410691b, coroutineContext, true, new a(l12, w02, qVar, null)).x();
    }
}
