package S21;

import Y61.k;
import android.content.Context;
import com.google.android.gms.internal.appset.zzr;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14793a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14794b = new ArrayList();

    public static final class a implements InterfaceC37022e<NX0.b> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ S21.a f14796c;

        public a(S21.a aVar) {
            this.f14796c = aVar;
        }

        @Override // com.google.android.gms.tasks.InterfaceC37022e
        public final void onComplete(@k Task<NX0.b> task) {
            synchronized (b.this.f14793a) {
                b.this.f14794b.remove(this);
            }
            if (!task.r()) {
                this.f14796c.a(task.m());
                return;
            }
            S21.a aVar = this.f14796c;
            String str = task.n().f11537a;
            b bVar = b.this;
            int i12 = task.n().f11538b;
            bVar.getClass();
            aVar.a(str, i12 != 1 ? i12 != 2 ? com.yandex.metrica.appsetid.c.UNKNOWN : com.yandex.metrica.appsetid.c.DEVELOPER : com.yandex.metrica.appsetid.c.APP);
        }
    }

    @Override // S21.c
    public final void a(@k Context context, @k S21.a aVar) {
        Task<NX0.b> appSetIdInfo = new zzr(context).getAppSetIdInfo();
        a aVar2 = new a(aVar);
        synchronized (this.f14793a) {
            this.f14794b.add(aVar2);
        }
        appSetIdInfo.c(aVar2);
    }
}
