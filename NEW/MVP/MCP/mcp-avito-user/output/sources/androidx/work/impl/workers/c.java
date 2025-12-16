package androidx.work.impl.workers;

import Y61.k;
import Y61.l;
import androidx.work.F;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConstraintTrackingWorker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", i = {0, 0}, l = {97}, m = "setupAndRunConstraintTrackingWork", n = {"this", "delegate"}, s = {"L$0", "L$1"})
/* loaded from: classes10.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public ConstraintTrackingWorker f56064q;

    /* renamed from: r, reason: collision with root package name */
    public F f56065r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f56066s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f56067t;

    /* renamed from: u, reason: collision with root package name */
    public int f56068u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ConstraintTrackingWorker constraintTrackingWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f56067t = constraintTrackingWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f56066s = obj;
        this.f56068u |= BeduinInputModel.MIN_TEXT_VERSION;
        return ConstraintTrackingWorker.d(this.f56067t, this);
    }
}
