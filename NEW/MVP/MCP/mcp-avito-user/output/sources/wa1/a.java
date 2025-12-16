package Wa1;

import Y41.p;
import android.os.Bundle;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.analytics.utils.ClickNotificationUtils$getClickEventRequestCode$2", f = "ClickNotificationUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class a extends SuspendLambda implements p<T, Continuation<? super Integer>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Bundle f17959q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Bundle bundle, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f17959q = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new a(this.f17959q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Integer> continuation) {
        return new a(this.f17959q, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Bundle bundle = this.f17959q;
        if (bundle != null) {
            return Boxing.boxInt(bundle.getInt("vkpns.click_event_marker.request_code"));
        }
        return null;
    }
}
