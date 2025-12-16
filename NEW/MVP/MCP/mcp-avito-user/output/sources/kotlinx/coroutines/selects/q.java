package kotlinx.coroutines.selects;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Select.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {712}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
/* loaded from: classes8.dex */
final class q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f412233q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o<Object> f412234r;

    /* renamed from: s, reason: collision with root package name */
    public int f412235s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o<Object> oVar, Continuation<? super q> continuation) {
        super(continuation);
        this.f412234r = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        q qVar;
        this.f412233q = obj;
        this.f412235s |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o.f412214g;
        o<Object> oVar = this.f412234r;
        oVar.getClass();
        int i12 = this.f412235s;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f412235s = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            qVar = this;
        } else {
            qVar = new q(oVar, this);
        }
        Object obj2 = qVar.f412233q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = qVar.f412235s;
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
