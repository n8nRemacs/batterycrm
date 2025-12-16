package coil;

import android.graphics.Bitmap;
import coil.view.C27253g;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: RealImageLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcoil/request/q;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcoil/request/q;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class q extends SuspendLambda implements Y41.p<T, Continuation<? super coil.request.q>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f58596q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ coil.request.p f58597r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f58598s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C27253g f58599t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f58600u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bitmap f58601v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(coil.request.p pVar, n nVar, C27253g c27253g, f fVar, Bitmap bitmap, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f58597r = pVar;
        this.f58598s = nVar;
        this.f58599t = c27253g;
        this.f58600u = fVar;
        this.f58601v = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new q(this.f58597r, this.f58598s, this.f58599t, this.f58600u, this.f58601v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super coil.request.q> continuation) {
        return ((q) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f58596q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ArrayList arrayList = this.f58598s.f58551l;
            boolean z12 = this.f58601v != null;
            coil.request.p pVar = this.f58597r;
            coil.intercept.k kVar = new coil.intercept.k(pVar, arrayList, 0, pVar, this.f58599t, this.f58600u, z12);
            this.f58596q = 1;
            obj = kVar.c(pVar, this);
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
