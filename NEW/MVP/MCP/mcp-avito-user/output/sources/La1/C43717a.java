package la1;

import Y41.p;
import android.graphics.Bitmap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* renamed from: la1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C43717a extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Bitmap f413906q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43717a(Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f413906q = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C43717a(this.f413906q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C43717a) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C91.a aVar = C91.a.f2014a;
        return G0.f406611a;
    }
}
