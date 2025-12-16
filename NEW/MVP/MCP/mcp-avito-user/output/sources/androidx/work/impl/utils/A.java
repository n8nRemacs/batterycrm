package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Metadata;

/* compiled from: StatusRunnable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/work/WorkInfo;", "db", "Landroidx/work/impl/WorkDatabase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class A extends kotlin.jvm.internal.N implements Y41.l<WorkDatabase, List<? extends WorkInfo>> {
    @Override // Y41.l
    public final List<? extends WorkInfo> invoke(WorkDatabase workDatabase) {
        return (List) androidx.work.impl.model.H.f55794z.apply(workDatabase.A().B());
    }
}
