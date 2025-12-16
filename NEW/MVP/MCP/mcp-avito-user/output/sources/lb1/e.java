package lb1;

import Y41.p;
import android.graphics.Bitmap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.notification.NotificationController$downloadImage$2", f = "NotificationController.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class e extends SuspendLambda implements p<T, Continuation<? super Bitmap>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f413922q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f413923r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f413924s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, String str, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f413923r = gVar;
        this.f413924s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new e(this.f413923r, this.f413924s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Bitmap> continuation) {
        return new e(this.f413923r, this.f413924s, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f413922q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.vk.push.core.data.imageloader.b bVar = this.f413923r.f413933d;
            this.f413922q = 1;
            obj = bVar.a(this.f413924s, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
