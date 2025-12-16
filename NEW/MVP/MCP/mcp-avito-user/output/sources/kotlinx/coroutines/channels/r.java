package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BufferedChannel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3087}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes8.dex */
final class r extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f410980q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C43108m<Object> f410981r;

    /* renamed from: s, reason: collision with root package name */
    public int f410982s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C43108m c43108m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f410981r = c43108m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f410980q = obj;
        this.f410982s |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C43108m.f410934e;
        Object objR = this.f410981r.R(null, 0, 0L, this);
        return objR == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objR : B.a(objR);
    }
}
