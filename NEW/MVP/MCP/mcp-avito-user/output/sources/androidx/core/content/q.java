package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.unusedapprestrictions.b;
import j.P;

/* compiled from: UnusedAppRestrictionsBackportService.java */
/* loaded from: classes.dex */
public abstract class q extends Service {

    /* renamed from: b, reason: collision with root package name */
    public final b.AbstractBinderC1721b f44642b = new a();

    /* compiled from: UnusedAppRestrictionsBackportService.java */
    public class a extends b.AbstractBinderC1721b {
        public a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.b
        public final void w1(@P androidx.core.app.unusedapprestrictions.a aVar) {
            if (aVar == null) {
                return;
            }
            new p().f44631a = aVar;
            q.this.a();
        }
    }

    public abstract void a();

    @Override // android.app.Service
    @P
    public final IBinder onBind(@P Intent intent) {
        return this.f44642b;
    }
}
