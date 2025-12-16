package kotlinx.coroutines.rx3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.NoSuchElementException;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RxAwait.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.rx3.RxAwaitKt", f = "RxAwait.kt", i = {}, l = {59}, m = "awaitSingle", n = {}, s = {})
/* renamed from: kotlinx.coroutines.rx3.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43289l<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f412109q;

    /* renamed from: r, reason: collision with root package name */
    public int f412110r;

    public C43289l() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f412109q = obj;
        this.f412110r = (this.f412110r | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f412110r;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f412110r = 1;
            obj = C43292o.g(null, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
