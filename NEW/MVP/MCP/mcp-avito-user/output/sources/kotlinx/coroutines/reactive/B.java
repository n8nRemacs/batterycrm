package kotlinx.coroutines.reactive;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ReactiveFlow.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.reactive.ReactiveSubscriber", f = "ReactiveFlow.kt", i = {}, l = {125}, m = "takeNextOrNull", n = {}, s = {})
/* loaded from: classes8.dex */
final class B extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f411963q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C<Object> f411964r;

    /* renamed from: s, reason: collision with root package name */
    public int f411965s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f411964r = c12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411963q = obj;
        this.f411965s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f411964r.a(this);
    }
}
