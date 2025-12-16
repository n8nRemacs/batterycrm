package androidx.work.impl;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WorkerWrapper.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", i = {0, 0}, l = {299}, m = "runWorker", n = {"this", "params"}, s = {"L$0", "L$1"})
/* loaded from: classes10.dex */
final class o0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0 f55899q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55900r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0 f55901s;

    /* renamed from: t, reason: collision with root package name */
    public int f55902t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(l0 l0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f55901s = l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f55900r = obj;
        this.f55902t |= BeduinInputModel.MIN_TEXT_VERSION;
        return l0.a(this.f55901s, this);
    }
}
