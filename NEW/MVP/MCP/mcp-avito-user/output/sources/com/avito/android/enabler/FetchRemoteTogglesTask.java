package com.avito.android.enabler;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote_toggles_fetcher.fetcher.a;
import com.avito.android.service.short_task.n;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FetchRemoteTogglesTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/enabler/FetchRemoteTogglesTask;", "Lcom/avito/android/service/short_task/n;", "Lcom/avito/android/remote_toggles_fetcher/fetcher/a;", "fetcher", "Lcom/avito/android/util/R0;", "dispatchers", "<init>", "(Lcom/avito/android/remote_toggles_fetcher/fetcher/a;Lcom/avito/android/util/R0;)V", "Landroid/os/Bundle;", "bundle", "Lcom/avito/android/service/short_task/ShortTask$Status;", "suspendedStart", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote_toggles_fetcher/fetcher/a;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FetchRemoteTogglesTask extends n {

    @k
    private final a fetcher;

    /* compiled from: FetchRemoteTogglesTask.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.enabler.FetchRemoteTogglesTask", f = "FetchRemoteTogglesTask.kt", i = {}, l = {16}, m = "suspendedStart", n = {}, s = {})
    /* renamed from: com.avito.android.enabler.FetchRemoteTogglesTask$suspendedStart$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return FetchRemoteTogglesTask.this.suspendedStart(null, this);
        }
    }

    @Inject
    public FetchRemoteTogglesTask(@k a aVar, @k R0 r02) {
        super(r02.a());
        this.fetcher = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.service.short_task.n
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object suspendedStart(@Y61.k android.os.Bundle r4, @Y61.k kotlin.coroutines.Continuation<? super com.avito.android.service.short_task.ShortTask.Status> r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof com.avito.android.enabler.FetchRemoteTogglesTask.AnonymousClass1
            if (r4 == 0) goto L13
            r4 = r5
            com.avito.android.enabler.FetchRemoteTogglesTask$suspendedStart$1 r4 = (com.avito.android.enabler.FetchRemoteTogglesTask.AnonymousClass1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.label = r0
            goto L18
        L13:
            com.avito.android.enabler.FetchRemoteTogglesTask$suspendedStart$1 r4 = new com.avito.android.enabler.FetchRemoteTogglesTask$suspendedStart$1
            r4.<init>(r5)
        L18:
            java.lang.Object r5 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.C42729a0.b(r5)
            goto L40
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.C42729a0.b(r5)
            com.avito.android.remote_toggles_fetcher.fetcher.a r5 = r3.fetcher
            r4.label = r2
            r1 = 0
            java.lang.Object r5 = r5.a(r1, r4)
            if (r5 != r0) goto L40
            return r0
        L40:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L4b
            com.avito.android.service.short_task.ShortTask$Status r4 = com.avito.android.service.short_task.ShortTask.Status.f274030b
            goto L4d
        L4b:
            com.avito.android.service.short_task.ShortTask$Status r4 = com.avito.android.service.short_task.ShortTask.Status.f274031c
        L4d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.enabler.FetchRemoteTogglesTask.suspendedStart(android.os.Bundle, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
