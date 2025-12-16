package kotlinx.coroutines.rx3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RxAwait.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.rx3.RxAwaitKt", f = "RxAwait.kt", i = {0}, l = {174}, m = "awaitFirstOrElse", n = {"defaultValue"}, s = {"L$0"})
/* renamed from: kotlinx.coroutines.rx3.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43286i<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f412098q;

    /* renamed from: r, reason: collision with root package name */
    public int f412099r;

    public C43286i() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f412098q = obj;
        this.f412099r = (this.f412099r | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f412099r;
        if (i12 == 0) {
            C42729a0.b(obj);
            EnumC43283f enumC43283f = EnumC43283f.f412091d;
            this.f412099r = 1;
            obj = C43292o.f(null, enumC43283f, null, this);
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
