package kotlinx.coroutines.reactive;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Await.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.reactive.AwaitKt", f = "Await.kt", i = {0}, l = {166}, m = "awaitSingleOrElse", n = {"defaultValue"}, s = {"L$0"})
/* renamed from: kotlinx.coroutines.reactive.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43277d<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f411988q;

    /* renamed from: r, reason: collision with root package name */
    public int f411989r;

    public C43277d() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411988q = obj;
        this.f411989r = (this.f411989r | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411989r;
        if (i12 == 0) {
            C42729a0.b(obj);
            s sVar = s.f412011g;
            this.f411989r = 1;
            obj = e.b(null, sVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        obj.getClass();
        return obj;
    }
}
