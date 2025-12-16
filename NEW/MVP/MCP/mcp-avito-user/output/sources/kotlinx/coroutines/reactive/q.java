package kotlinx.coroutines.reactive;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ReactiveFlow.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.reactive.FlowSubscription", f = "ReactiveFlow.kt", i = {0}, l = {205}, m = "flowProcessing", n = {"this"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public r f412000q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f412001r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r<Object> f412002s;

    /* renamed from: t, reason: collision with root package name */
    public int f412003t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r<Object> rVar, Continuation<? super q> continuation) {
        super(continuation);
        this.f412002s = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f412001r = obj;
        this.f412003t |= BeduinInputModel.MIN_TEXT_VERSION;
        return r.F0(this.f412002s, this);
    }
}
