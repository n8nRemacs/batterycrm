package com.avito.android.iac_dialer_ui.pub.util;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.InterfaceC22204y1;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: LiveDataUpdater.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer_ui.pub.util.LiveDataUpdaterKt$LiveDataUpdater$1$1", f = "LiveDataUpdater.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f167769q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f167770r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Object> f167771s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Object> f167772t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j12, Y41.a<Object> aVar, InterfaceC22204y1<Object> interfaceC22204y1, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f167770r = j12;
        this.f167771s = aVar;
        this.f167772t = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new g(this.f167770r, this.f167771s, this.f167772t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:12:0x0025). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f167769q
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.C42729a0.b(r6)
            goto L25
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.C42729a0.b(r6)
        L1a:
            r5.f167769q = r2
            long r3 = r5.f167770r
            java.lang.Object r6 = kotlinx.coroutines.C43131e0.b(r3, r5)
            if (r6 != r0) goto L25
            return r0
        L25:
            Y41.a<java.lang.Object> r6 = r5.f167771s
            java.lang.Object r6 = r6.invoke()
            androidx.compose.runtime.y1<java.lang.Object> r1 = r5.f167772t
            r1.setValue(r6)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.util.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
