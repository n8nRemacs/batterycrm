package androidx.work;

import android.content.Context;
import androidx.work.C23538b;
import androidx.work.WorkManager;
import b2.InterfaceC25391b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class WorkManagerInitializer implements InterfaceC25391b<WorkManager> {
    static {
        G.b("WrkMgrInitializer");
    }

    @Override // b2.InterfaceC25391b
    @j.N
    public final WorkManager a(@j.N Context context) {
        G.a().getClass();
        C23538b c23538b = new C23538b(new C23538b.a());
        WorkManager.a aVar = WorkManager.f55428a;
        aVar.getClass();
        androidx.work.impl.Y.g(context, c23538b);
        aVar.getClass();
        return androidx.work.impl.Y.f(context);
    }

    @Override // b2.InterfaceC25391b
    @j.N
    public final List<Class<? extends InterfaceC25391b<?>>> b() {
        return Collections.emptyList();
    }
}
