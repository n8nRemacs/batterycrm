package com.yandex.metrica;

import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import com.yandex.metrica.impl.ob.P;
import j.N;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final IHandlerExecutor f377623a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f377624b;

    public interface a {
        void a();

        void b();
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final IHandlerExecutor f377625a;

        /* renamed from: b, reason: collision with root package name */
        @N
        public final a f377626b;

        /* renamed from: c, reason: collision with root package name */
        public final long f377627c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f377628d = true;

        /* renamed from: e, reason: collision with root package name */
        public final Runnable f377629e = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.f377626b.a();
            }
        }

        public b(@N a aVar, @N IHandlerExecutor iHandlerExecutor, long j12) {
            this.f377626b = aVar;
            this.f377625a = iHandlerExecutor;
            this.f377627c = j12;
        }
    }

    public c() {
        IHandlerExecutor iHandlerExecutorB = P.g().d().b();
        this.f377624b = new HashSet();
        this.f377623a = iHandlerExecutorB;
    }

    public final synchronized void a() {
        Iterator it = this.f377624b.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!bVar.f377628d) {
                bVar.f377628d = true;
                bVar.f377625a.executeDelayed(bVar.f377629e, bVar.f377627c);
            }
        }
    }

    public final synchronized void b(@N a aVar, long j12) {
        synchronized (this) {
            this.f377624b.add(new b(aVar, this.f377623a, j12));
        }
    }

    public final synchronized void c() {
        Iterator it = this.f377624b.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f377628d) {
                bVar.f377628d = false;
                bVar.f377625a.remove(bVar.f377629e);
                bVar.f377626b.b();
            }
        }
    }
}
