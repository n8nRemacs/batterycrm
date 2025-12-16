package androidx.work.impl.workers;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConstraintTrackingWorker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", i = {}, l = {125}, m = "runWorker", n = {}, s = {})
/* loaded from: classes10.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f56049q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f56050r;

    /* renamed from: s, reason: collision with root package name */
    public int f56051s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ConstraintTrackingWorker constraintTrackingWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f56050r = constraintTrackingWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f56049q = obj;
        this.f56051s |= BeduinInputModel.MIN_TEXT_VERSION;
        return ConstraintTrackingWorker.c(this.f56050r, null, null, null, this);
    }
}
