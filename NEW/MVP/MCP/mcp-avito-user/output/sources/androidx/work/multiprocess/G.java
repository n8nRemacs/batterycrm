package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.C23538b;
import androidx.work.impl.Y;
import j.N;

/* compiled from: RemoteWorkManagerInfo.java */
@RestrictTo
/* loaded from: classes10.dex */
public final class G {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f56090e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static volatile G f56091f;

    /* renamed from: a, reason: collision with root package name */
    public final C23538b f56092a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.c f56093b;

    /* renamed from: c, reason: collision with root package name */
    public final q f56094c;

    /* renamed from: d, reason: collision with root package name */
    public final p f56095d;

    /* JADX WARN: Multi-variable type inference failed */
    public G(@N H h12) {
        Y y12;
        synchronized (Y.f55556o) {
            try {
                y12 = Y.f55554m;
                if (y12 == null) {
                    y12 = Y.f55555n;
                }
            } finally {
            }
        }
        if (y12 != null) {
            this.f56092a = y12.f55558c;
            this.f56093b = y12.f55560e;
        } else {
            Context applicationContext = h12.getApplicationContext();
            if (applicationContext instanceof C23538b.c) {
                this.f56092a = ((C23538b.c) applicationContext).c();
            } else {
                C23538b.a aVar = new C23538b.a();
                aVar.f55465c = applicationContext.getPackageName();
                this.f56092a = new C23538b(aVar);
            }
            this.f56093b = new androidx.work.impl.utils.taskexecutor.c(this.f56092a.f55449c);
        }
        this.f56094c = new q();
        this.f56095d = new p();
    }
}
