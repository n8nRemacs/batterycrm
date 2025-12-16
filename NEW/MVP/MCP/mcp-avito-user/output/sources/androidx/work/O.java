package androidx.work;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Operation.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "androidx.work.OperationKt", f = "Operation.kt", i = {}, l = {36}, m = "await", n = {}, s = {})
/* loaded from: classes10.dex */
final class O extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f55402q;

    /* renamed from: r, reason: collision with root package name */
    public int f55403r;

    public O() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        O o12;
        this.f55402q = obj;
        int i12 = this.f55403r | BeduinInputModel.MIN_TEXT_VERSION;
        this.f55403r = i12;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f55403r = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            o12 = this;
        } else {
            o12 = new O(this);
        }
        Object obj2 = o12.f55402q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = o12.f55403r;
        if (i13 == 0) {
            C42729a0.b(obj2);
            throw null;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj2);
        return obj2;
    }
}
