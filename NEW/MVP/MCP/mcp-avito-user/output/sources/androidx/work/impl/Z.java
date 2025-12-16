package androidx.work.impl;

import android.content.Context;
import androidx.work.C23538b;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.C23609t;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: WorkManagerImplExt.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class Z extends kotlin.jvm.internal.H implements Y41.t<Context, C23538b, androidx.work.impl.utils.taskexecutor.b, WorkDatabase, androidx.work.impl.constraints.trackers.n, C23588s, List<? extends InterfaceC23590u>> {

    /* renamed from: b, reason: collision with root package name */
    public static final Z f55568b = new Z();

    public Z() {
        super(6, c0.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // Y41.t
    public final List<? extends InterfaceC23590u> invoke(Context context, C23538b c23538b, androidx.work.impl.utils.taskexecutor.b bVar, WorkDatabase workDatabase, androidx.work.impl.constraints.trackers.n nVar, C23588s c23588s) {
        Context context2 = context;
        C23538b c23538b2 = c23538b;
        androidx.work.impl.utils.taskexecutor.b bVar2 = bVar;
        C23588s c23588s2 = c23588s;
        int i12 = C23612w.f56044a;
        androidx.work.impl.background.systemjob.f fVar = new androidx.work.impl.background.systemjob.f(context2, workDatabase, c23538b2);
        C23609t.a(context2, SystemJobService.class, true);
        androidx.work.G.a().getClass();
        return C42745f0.U(fVar, new androidx.work.impl.background.greedy.c(context2, c23538b2, nVar, c23588s2, new W(c23588s2, bVar2), bVar2));
    }
}
