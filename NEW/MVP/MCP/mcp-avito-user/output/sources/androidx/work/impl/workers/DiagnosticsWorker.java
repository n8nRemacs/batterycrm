package androidx.work.impl.workers;

import Y61.k;
import android.content.Context;
import androidx.work.F;
import androidx.work.G;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.Y;
import androidx.work.impl.model.I;
import androidx.work.impl.model.InterfaceC23575q;
import androidx.work.impl.model.InterfaceC23582y;
import androidx.work.impl.model.q0;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: DiagnosticsWorker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(@k Context context, @k WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    @k
    public final F.a doWork() {
        Y yF2 = Y.f(getApplicationContext());
        WorkDatabase workDatabase = yF2.f55559d;
        I iA2 = workDatabase.A();
        InterfaceC23582y interfaceC23582yY = workDatabase.y();
        q0 q0VarB = workDatabase.B();
        InterfaceC23575q interfaceC23575qX = workDatabase.x();
        yF2.f55558c.f55450d.getClass();
        ArrayList arrayListY = iA2.y(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        ArrayList arrayListL = iA2.l();
        ArrayList arrayListC = iA2.C();
        if (!arrayListY.isEmpty()) {
            G gA2 = G.a();
            int i12 = i.f56083a;
            gA2.getClass();
            G gA3 = G.a();
            i.a(interfaceC23582yY, q0VarB, interfaceC23575qX, arrayListY);
            gA3.getClass();
        }
        if (!arrayListL.isEmpty()) {
            G gA4 = G.a();
            int i13 = i.f56083a;
            gA4.getClass();
            G gA5 = G.a();
            i.a(interfaceC23582yY, q0VarB, interfaceC23575qX, arrayListL);
            gA5.getClass();
        }
        if (!arrayListC.isEmpty()) {
            G gA6 = G.a();
            int i14 = i.f56083a;
            gA6.getClass();
            G gA7 = G.a();
            i.a(interfaceC23582yY, q0VarB, interfaceC23575qX, arrayListC);
            gA7.getClass();
        }
        return new F.a.c();
    }
}
