package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.H;
import com.avito.android.service.short_task.n;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: IacLogSendingShortTask.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/short_task/a;", "Lcom/avito/android/service/short_task/n;", "a", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends n {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C4970a f168025e = new C4970a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.k f168026a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final H f168027b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f168028c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a f168029d;

    /* compiled from: IacLogSendingShortTask.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/short_task/a$a;", "", "<init>", "()V", "", "EXTRA_KEY", "Ljava/lang/String;", "TAG", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.a$a, reason: collision with other inner class name */
    public static final class C4970a {
        public /* synthetic */ C4970a(C42822w c42822w) {
            this();
        }

        public C4970a() {
        }
    }

    /* compiled from: IacLogSendingShortTask.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.IacLogSendingShortTask", f = "IacLogSendingShortTask.kt", i = {0, 0}, l = {45, 52}, m = "suspendedStart", n = {"this", "scheduledSessionId"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public a f168030q;

        /* renamed from: r, reason: collision with root package name */
        public Long f168031r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f168032s;

        /* renamed from: u, reason: collision with root package name */
        public int f168034u;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f168032s = obj;
            this.f168034u |= BeduinInputModel.MIN_TEXT_VERSION;
            return a.this.suspendedStart(null, this);
        }
    }

    @Inject
    public a(@k com.avito.android.iac_dialer_watcher.impl_module.logging.k kVar, @k H h12, @k c cVar, @k com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a aVar, @k R0 r02) {
        super(r02.a());
        this.f168026a = kVar;
        this.f168027b = h12;
        this.f168028c = cVar;
        this.f168029d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.avito.android.service.short_task.n
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object suspendedStart(@Y61.k android.os.Bundle r13, @Y61.k kotlin.coroutines.Continuation<? super com.avito.android.service.short_task.ShortTask.Status> r14) {
        /*
            r12 = this;
            com.avito.android.service.short_task.ShortTask$Status r0 = com.avito.android.service.short_task.ShortTask.Status.f274030b
            boolean r1 = r14 instanceof com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.a.b
            if (r1 == 0) goto L15
            r1 = r14
            com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.a$b r1 = (com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.a.b) r1
            int r2 = r1.f168034u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f168034u = r2
            goto L1a
        L15:
            com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.a$b r1 = new com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.a$b
            r1.<init>(r14)
        L1a:
            java.lang.Object r14 = r1.f168032s
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.f168034u
            r4 = 2
            java.lang.String r5 = "IacLogSendingShortTask"
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L45
            if (r3 == r7) goto L3d
            if (r3 != r4) goto L35
            kotlin.C42729a0.b(r14)     // Catch: java.lang.Exception -> L32
            goto Lc0
        L32:
            r13 = move-exception
            goto Lc8
        L35:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3d:
            java.lang.Long r13 = r1.f168031r
            com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.a r3 = r1.f168030q
            kotlin.C42729a0.b(r14)     // Catch: java.lang.Exception -> L32
            goto L91
        L45:
            kotlin.C42729a0.b(r14)
            com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a r14 = r12.f168029d
            r14.getClass()
            kotlin.reflect.n<java.lang.Object>[] r3 = com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a.f168141e
            r3 = r3[r4]
            com.avito.android.A0$a r14 = r14.f168144d
            DE0.a r14 = r14.a()
            java.lang.Object r14 = r14.invoke()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L64
            return r0
        L64:
            com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.a$a r14 = com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.a.f168025e
            r14.getClass()
            if (r13 == 0) goto L7c
            java.lang.String r14 = "IacLogSendingShortTask.scheduledSessionId.key"
            boolean r3 = r13.containsKey(r14)
            if (r3 == 0) goto L7c
            long r13 = r13.getLong(r14)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            goto L7d
        L7c:
            r13 = r6
        L7d:
            com.avito.android.iac_dialer_watcher.impl_module.logging.k r14 = r12.f168026a     // Catch: java.lang.Exception -> L32
            io.reactivex.rxjava3.internal.operators.observable.T r14 = r14.a()     // Catch: java.lang.Exception -> L32
            r1.f168030q = r12     // Catch: java.lang.Exception -> L32
            r1.f168031r = r13     // Catch: java.lang.Exception -> L32
            r1.f168034u = r7     // Catch: java.lang.Exception -> L32
            java.lang.Object r14 = kotlinx.coroutines.rx3.C43292o.b(r14, r1)     // Catch: java.lang.Exception -> L32
            if (r14 != r2) goto L90
            return r2
        L90:
            r3 = r12
        L91:
            com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w r14 = (com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w) r14     // Catch: java.lang.Exception -> L32
            long r8 = r14.f167936a     // Catch: java.lang.Exception -> L32
            if (r13 != 0) goto L98
            goto Lad
        L98:
            long r10 = r13.longValue()     // Catch: java.lang.Exception -> L32
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 != 0) goto Lad
            com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.c r14 = r3.f168028c     // Catch: java.lang.Exception -> L32
            r14.a(r13, r7)     // Catch: java.lang.Exception -> L32
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b r13 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a     // Catch: java.lang.Exception -> L32
            java.lang.String r14 = "This is still the same session. ShortTask was rescheduled."
            r13.a(r5, r14, r6)     // Catch: java.lang.Exception -> L32
            goto Ld1
        Lad:
            com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.H r13 = r3.f168027b     // Catch: java.lang.Exception -> L32
            io.reactivex.rxjava3.internal.operators.single.y r13 = r13.a()     // Catch: java.lang.Exception -> L32
            r1.f168030q = r6     // Catch: java.lang.Exception -> L32
            r1.f168031r = r6     // Catch: java.lang.Exception -> L32
            r1.f168034u = r4     // Catch: java.lang.Exception -> L32
            java.lang.Object r13 = kotlinx.coroutines.rx3.C43292o.b(r13, r1)     // Catch: java.lang.Exception -> L32
            if (r13 != r2) goto Lc0
            return r2
        Lc0:
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b r13 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a     // Catch: java.lang.Exception -> L32
            java.lang.String r14 = "ShortTask is finished with success status"
            r13.a(r5, r14, r6)     // Catch: java.lang.Exception -> L32
            goto Ld1
        Lc8:
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b r14 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a
            java.lang.String r0 = "ShortTask failed"
            r14.b(r5, r0, r13)
            com.avito.android.service.short_task.ShortTask$Status r0 = com.avito.android.service.short_task.ShortTask.Status.f274032d
        Ld1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.short_task.a.suspendedStart(android.os.Bundle, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
