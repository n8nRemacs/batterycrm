package Oa1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.text.C43047d;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import ru.rustore.sdk.metrics.MetricsException;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;
import ru.rustore.sdk.reactive.single.AbstractC47905a;

/* loaded from: classes9.dex */
public final class X extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y f12342l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Na1.c f12343m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y12, Na1.c cVar) {
        super(0);
        this.f12342l = y12;
        this.f12343m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() throws MetricsException.SaveMetricsEventError {
        Y y12 = this.f12342l;
        if (!y12.f12348e) {
            AbstractC47905a.C12588a c12588a = AbstractC47905a.f436968a;
            S s5 = new S(y12);
            c12588a.getClass();
            ru.rustore.sdk.reactive.single.u uVar = new ru.rustore.sdk.reactive.single.u(s5);
            ru.rustore.sdk.reactive.core.d.f436864a.getClass();
            ru.rustore.sdk.reactive.single.E.a(ru.rustore.sdk.reactive.single.H.a(uVar, ru.rustore.sdk.reactive.core.d.a()), new U(1), new W(1));
            Context context = y12.f12346c.f12397a;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService(JobScheduler.class);
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            if ((allPendingJobs instanceof Collection) && allPendingJobs.isEmpty()) {
                JobInfo.Builder builder = new JobInfo.Builder(88123556, new ComponentName(context, (Class<?>) SendMetricsEventJobService.class));
                e.a aVar = kotlin.time.e.f410651c;
                jobScheduler.schedule(builder.setPeriodic(kotlin.time.e.e(kotlin.time.g.g(1440, DurationUnit.f410635g))).setPersisted(true).build());
                y12.f12348e = true;
            } else {
                Iterator<T> it = allPendingJobs.iterator();
                while (it.hasNext()) {
                    if (((JobInfo) it.next()).getId() == 88123556) {
                        break;
                    }
                }
                JobInfo.Builder builder2 = new JobInfo.Builder(88123556, new ComponentName(context, (Class<?>) SendMetricsEventJobService.class));
                e.a aVar2 = kotlin.time.e.f410651c;
                jobScheduler.schedule(builder2.setPeriodic(kotlin.time.e.e(kotlin.time.g.g(1440, DurationUnit.f410635g))).setPersisted(true).build());
                y12.f12348e = true;
            }
        }
        C14658q c14658q = y12.f12345b.f12334a;
        Na1.c cVar = this.f12343m;
        new C14657p(cVar);
        String string = UUID.randomUUID().toString();
        byte[] bytes = f0.a(cVar).getBytes(C43047d.f410589b);
        C14654m c14654m = new C14654m(string, bytes);
        InterfaceC42726C interfaceC42726C = c14658q.f12381a.f12377b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("uuid", string);
        contentValues.put("metrics_event", bytes);
        try {
            ((SQLiteDatabase) interfaceC42726C.getValue()).beginTransactionNonExclusive();
            long jInsert = ((SQLiteDatabase) interfaceC42726C.getValue()).insert("metrics_event_table", null, contentValues);
            ((SQLiteDatabase) interfaceC42726C.getValue()).setTransactionSuccessful();
            ((SQLiteDatabase) interfaceC42726C.getValue()).endTransaction();
            if (jInsert != -1) {
                new C14652k(c14654m);
                return G0.f406611a;
            }
            StringBuilder sb2 = new StringBuilder("Saving error ");
            sb2.append((Object) ("MetricsEventUuid(value=" + string + ')'));
            String string2 = sb2.toString();
            new C14651j(string2);
            throw new MetricsException.SaveMetricsEventError(string2, null, 2, null);
        } finally {
        }
    }
}
