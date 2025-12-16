package Wa1;

import Y41.p;
import android.os.Bundle;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.analytics.utils.ClickNotificationUtils$isClickSDKNotificationEventHappen$2", f = "ClickNotificationUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class b extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Bundle f17960q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Bundle bundle, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f17960q = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new b(this.f17960q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Boolean> continuation) {
        return new b(this.f17960q, continuation).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
        /*
            r1 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.C42729a0.b(r2)
            android.os.Bundle r2 = r1.f17960q
            if (r2 == 0) goto L14
            java.lang.String r0 = "vkpns.click_event_marker"
            boolean r2 = r2.containsKey(r0)
            r0 = 1
            if (r2 != r0) goto L14
            goto L15
        L14:
            r0 = 0
        L15:
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Wa1.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
