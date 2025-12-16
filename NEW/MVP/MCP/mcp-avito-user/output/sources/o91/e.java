package O91;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;

/* loaded from: classes9.dex */
public final class e extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f12039q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f12040r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.chooseDocument.ui.j f12041s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ru.mts.biometry.sdk.feature.document.chooseDocument.ui.j jVar, Continuation continuation) {
        super(2, continuation);
        this.f12041s = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f12041s, continuation);
        eVar.f12040r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f12039q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f12040r;
            ru.mts.biometry.sdk.feature.document.chooseDocument.ui.j jVar = this.f12041s;
            C43259k.d(t12, null, null, new c(jVar, null), 3);
            n2 n2Var = ((o) jVar.f436437i0.getValue()).f12063L;
            d dVar = new d(jVar);
            this.f12039q = 1;
            if (n2Var.collect(dVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
