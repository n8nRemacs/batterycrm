package kotlinx.coroutines.rx3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RxScheduler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.rx3.RxSchedulerKt", f = "RxScheduler.kt", i = {0}, l = {122}, m = "scheduleTask$task", n = {"ctx"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class L extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public CoroutineContext f412059q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f412060r;

    /* renamed from: s, reason: collision with root package name */
    public int f412061s;

    public L() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f412060r = obj;
        this.f412061s |= BeduinInputModel.MIN_TEXT_VERSION;
        return O.b(null, null, null, this);
    }
}
