package coil.intercept;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RealInterceptorChain.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", i = {0, 0}, l = {32}, m = "proceed", n = {"this", "interceptor"}, s = {"L$0", "L$1"})
/* loaded from: classes10.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public k f58493q;

    /* renamed from: r, reason: collision with root package name */
    public i f58494r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f58495s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f58496t;

    /* renamed from: u, reason: collision with root package name */
    public int f58497u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f58496t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f58495s = obj;
        this.f58497u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f58496t.c(null, this);
    }
}
