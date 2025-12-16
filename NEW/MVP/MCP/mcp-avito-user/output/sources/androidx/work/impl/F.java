package androidx.work.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.utils.C23595e;
import com.vk.id.VKID;
import com.vk.id.group.subscription.xml.GroupSubscriptionSheet;
import com.vk.id.internal.di.VKIDDeps;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class F implements Y41.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55524c;

    public /* synthetic */ F(Object obj, int i12) {
        this.f55523b = i12;
        this.f55524c = obj;
    }

    @Override // Y41.a
    public final Object invoke() {
        Object obj = this.f55524c;
        switch (this.f55523b) {
            case 0:
                int i12 = G.f55525j;
                G g12 = (G) obj;
                g12.getClass();
                C23595e.a(g12);
                return G0.f406611a;
            case 1:
                Y y12 = Y.f55554m;
                Y y13 = (Y) obj;
                y13.getClass();
                int i13 = Build.VERSION.SDK_INT;
                int i14 = androidx.work.impl.background.systemjob.f.f55663g;
                Context context = y13.f55557b;
                if (i13 >= 34) {
                    androidx.work.impl.background.systemjob.c.b(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListB = androidx.work.impl.background.systemjob.f.b(context, jobScheduler);
                if (arrayListB != null && !arrayListB.isEmpty()) {
                    Iterator it = arrayListB.iterator();
                    while (it.hasNext()) {
                        androidx.work.impl.background.systemjob.f.a(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                WorkDatabase workDatabase = y13.f55559d;
                workDatabase.A().j();
                C23612w.b(y13.f55558c, workDatabase, y13.f55561f);
                return G0.f406611a;
            case 2:
                return VKID._get_accessToken_$lambda$15((VKID) obj);
            case 3:
                return VKID._init_$lambda$0((VKIDDeps) obj);
            default:
                return GroupSubscriptionSheet.Content$lambda$23$lambda$22((GroupSubscriptionSheet) obj);
        }
    }
}
