package la1;

import Y41.p;
import android.graphics.Bitmap;
import java.io.File;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.mts.biometry.api.dataSource.j;

/* loaded from: classes9.dex */
public final class b extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f413907q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f413908r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ File f413909s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bitmap f413910t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, File file, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f413908r = cVar;
        this.f413909s = file;
        this.f413910t = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f413908r, this.f413909s, this.f413910t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f413907q;
        if (i12 == 0) {
            C42729a0.b(obj);
            j jVar = this.f413908r.f413911a;
            this.f413907q = 1;
            if (jVar.i(this.f413909s, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        C91.a aVar = C91.a.f2014a;
        return G0.f406611a;
    }
}
