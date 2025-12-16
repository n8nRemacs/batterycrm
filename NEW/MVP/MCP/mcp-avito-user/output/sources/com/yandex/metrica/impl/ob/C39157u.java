package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C39062q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39157u implements C39062q.b {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<E1<C38889j0>> f381907a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private volatile C38889j0 f381908b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39062q f381909c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f381910d;

    /* renamed from: com.yandex.metrica.impl.ob.u$a */
    public class a implements E1<C38889j0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f381911a;

        public a(C39157u c39157u, String str) {
            this.f381911a = str;
        }

        @Override // com.yandex.metrica.impl.ob.E1
        public void b(@j.N C38889j0 c38889j0) {
            c38889j0.b(this.f381911a);
        }
    }

    public C39157u(@j.N ICommonExecutor iCommonExecutor) {
        this(iCommonExecutor, P.g().b());
    }

    public void a() {
        this.f381909c.a(this, C39062q.a.CREATED);
    }

    @j.k0
    public C39157u(@j.N ICommonExecutor iCommonExecutor, @j.N C39062q c39062q) {
        this.f381907a = new ArrayList();
        this.f381908b = null;
        this.f381910d = iCommonExecutor;
        this.f381909c = c39062q;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[LOOP:0: B:9:0x0016->B:11:0x001c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(@j.N com.yandex.metrica.impl.ob.C38889j0 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.f381908b = r3     // Catch: java.lang.Throwable -> L27
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L27
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29
            java.util.List<com.yandex.metrica.impl.ob.E1<com.yandex.metrica.impl.ob.j0>> r1 = r2.f381907a     // Catch: java.lang.Throwable -> L29
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L29
            java.util.List<com.yandex.metrica.impl.ob.E1<com.yandex.metrica.impl.ob.j0>> r1 = r2.f381907a     // Catch: java.lang.Throwable -> L29
            r1.clear()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            com.yandex.metrica.impl.ob.E1 r1 = (com.yandex.metrica.impl.ob.E1) r1
            r1.b(r3)
            goto L16
        L26:
            return
        L27:
            r3 = move-exception
            goto L2c
        L29:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r3     // Catch: java.lang.Throwable -> L27
        L2c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C39157u.a(com.yandex.metrica.impl.ob.j0):void");
    }

    @Override // com.yandex.metrica.impl.ob.C39062q.b
    @j.K
    public void a(@j.N Activity activity, @j.N C39062q.a aVar) {
        Intent intent;
        if (activity != null) {
            try {
                intent = activity.getIntent();
            } catch (Throwable unused) {
            }
        } else {
            intent = null;
        }
        String dataString = intent != null ? intent.getDataString() : null;
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        a aVar2 = new a(this, dataString);
        synchronized (this) {
            try {
                C38889j0 c38889j0 = this.f381908b;
                if (c38889j0 == null) {
                    this.f381907a.add(aVar2);
                } else {
                    this.f381910d.execute(new RunnableC39133t(this, aVar2, c38889j0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
