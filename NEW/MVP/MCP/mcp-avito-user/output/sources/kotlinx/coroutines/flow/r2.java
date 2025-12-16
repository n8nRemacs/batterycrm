package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Share.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {415, 419}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class r2 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public s2 f411724q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.flow.internal.A f411725r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f411726s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s2<Object> f411727t;

    /* renamed from: u, reason: collision with root package name */
    public int f411728u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(s2 s2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f411727t = s2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411726s = obj;
        this.f411728u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f411727t.a(this);
    }
}
