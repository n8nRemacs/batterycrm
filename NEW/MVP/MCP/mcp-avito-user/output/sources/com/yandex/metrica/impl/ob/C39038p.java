package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C39062q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39038p implements C39062q.b {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Set<b> f381270a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f381271b;

    /* renamed from: com.yandex.metrica.impl.ob.p$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f381272a;

        public a(Activity activity) {
            this.f381272a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            C39038p.this.a(this.f381272a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.p$b */
    public interface b {
        @j.l0
        void a(@j.N Activity activity);
    }

    public C39038p(@j.N C39062q c39062q, @j.N ICommonExecutor iCommonExecutor) {
        this.f381271b = iCommonExecutor;
        c39062q.a(this, new C39062q.a[0]);
    }

    public synchronized void a(@j.N b bVar) {
        this.f381270a.add(bVar);
    }

    public void a(@j.N Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f381270a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(activity);
        }
    }

    @Override // com.yandex.metrica.impl.ob.C39062q.b
    @j.K
    public void a(@j.N Activity activity, @j.N C39062q.a aVar) {
        this.f381271b.execute(new a(activity));
    }
}
