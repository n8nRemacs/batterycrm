package androidx.work.impl;

import android.content.Context;
import android.content.res.Resources;
import androidx.room.RoomDatabase;
import androidx.room.x0;
import androidx.work.C23538b;
import androidx.work.impl.WorkDatabase;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: WorkManagerImplExt.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002* \u0002\u0010\u0011\"\u008c\u0001\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00002\u008c\u0001\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/Function6;", "Landroid/content/Context;", "Lkotlin/S;", "name", "context", "Landroidx/work/b;", "configuration", "Landroidx/work/impl/utils/taskexecutor/b;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/impl/constraints/trackers/n;", Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, "Landroidx/work/impl/s;", "processor", "", "Landroidx/work/impl/u;", "SchedulersCreator", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c0 {
    @X41.j
    @X41.i
    @Y61.k
    public static final Y a(@Y61.k Context context, @Y61.k C23538b c23538b) throws Resources.NotFoundException {
        RoomDatabase.a aVarA;
        androidx.work.impl.utils.taskexecutor.c cVar = new androidx.work.impl.utils.taskexecutor.c(c23538b.f55449c);
        WorkDatabase.a aVar = WorkDatabase.f55542n;
        Context applicationContext = context.getApplicationContext();
        androidx.work.X x12 = c23538b.f55450d;
        boolean z12 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        aVar.getClass();
        if (z12) {
            int i12 = x0.f54421a;
            aVarA = new RoomDatabase.a(applicationContext, null, WorkDatabase.class);
            aVarA.f54322j = true;
        } else {
            aVarA = x0.a(applicationContext, "androidx.work.workdb", WorkDatabase.class);
            aVarA.f54321i = new Ae0.c(applicationContext, 17);
        }
        aVarA.f54319g = cVar.f56028a;
        aVarA.f54316d.add(new C23549d(x12));
        aVarA.a(C23556k.f55753c);
        aVarA.a(new C23589t(applicationContext, 2, 3));
        aVarA.a(C23557l.f55756c);
        aVarA.a(C23558m.f55782c);
        aVarA.a(new C23589t(applicationContext, 5, 6));
        aVarA.a(C23584n.f55893c);
        aVarA.a(C23585o.f55898c);
        aVarA.a(C23586p.f55903c);
        aVarA.a(new d0(applicationContext));
        aVarA.a(new C23589t(applicationContext, 10, 11));
        aVarA.a(C23552g.f55742c);
        aVarA.a(C23553h.f55746c);
        aVarA.a(C23554i.f55750c);
        aVarA.a(C23555j.f55751c);
        aVarA.a(new C23589t(applicationContext, 21, 22));
        aVarA.c();
        WorkDatabase workDatabase = (WorkDatabase) aVarA.b();
        androidx.work.impl.constraints.trackers.n nVar = new androidx.work.impl.constraints.trackers.n(context.getApplicationContext(), cVar, null, null, null, null, 60, null);
        C23588s c23588s = new C23588s(context.getApplicationContext(), c23538b, cVar, workDatabase);
        return new Y(context.getApplicationContext(), c23538b, cVar, workDatabase, Z.f55568b.invoke(context, c23538b, cVar, workDatabase, nVar, c23588s), c23588s, nVar);
    }
}
