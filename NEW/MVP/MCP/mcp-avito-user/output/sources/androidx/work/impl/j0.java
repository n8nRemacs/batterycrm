package androidx.work.impl;

import kotlin.Metadata;

/* compiled from: WorkerUpdater.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/work/impl/model/H;", "spec", "", "invoke", "(Landroidx/work/impl/model/H;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes10.dex */
final class j0 extends kotlin.jvm.internal.N implements Y41.l<androidx.work.impl.model.H, String> {

    /* renamed from: l, reason: collision with root package name */
    public static final j0 f55752l = new j0();

    public j0() {
        super(1);
    }

    @Override // Y41.l
    public final String invoke(androidx.work.impl.model.H h12) {
        return h12.d() ? "Periodic" : "OneTime";
    }
}
