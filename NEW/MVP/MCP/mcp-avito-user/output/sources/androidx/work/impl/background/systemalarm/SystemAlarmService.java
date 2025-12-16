package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.view.ServiceC22988V;
import androidx.work.G;
import androidx.work.impl.background.systemalarm.f;

@RestrictTo
/* loaded from: classes10.dex */
public class SystemAlarmService extends ServiceC22988V implements f.c {

    /* renamed from: b, reason: collision with root package name */
    public f f55603b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f55604c;

    static {
        G.b("SystemAlarmService");
    }

    @Override // androidx.view.ServiceC22988V, android.app.Service
    public final void onCreate() {
        super.onCreate();
        f fVar = new f(this);
        this.f55603b = fVar;
        if (fVar.f55642j != null) {
            G.a().getClass();
        } else {
            fVar.f55642j = this;
        }
        this.f55604c = false;
    }

    @Override // androidx.view.ServiceC22988V, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f55604c = true;
        f fVar = this.f55603b;
        fVar.getClass();
        G.a().getClass();
        fVar.f55637e.f(fVar);
        fVar.f55642j = null;
    }

    @Override // androidx.view.ServiceC22988V, android.app.Service
    public final int onStartCommand(Intent intent, int i12, int i13) {
        super.onStartCommand(intent, i12, i13);
        if (this.f55604c) {
            G.a().getClass();
            f fVar = this.f55603b;
            fVar.getClass();
            G.a().getClass();
            fVar.f55637e.f(fVar);
            fVar.f55642j = null;
            f fVar2 = new f(this);
            this.f55603b = fVar2;
            if (fVar2.f55642j != null) {
                G.a().getClass();
            } else {
                fVar2.f55642j = this;
            }
            this.f55604c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f55603b.a(i13, intent);
        return 3;
    }
}
