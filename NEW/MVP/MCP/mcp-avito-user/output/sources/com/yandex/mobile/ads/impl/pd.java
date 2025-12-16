package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public interface pd {
    @j.P
    ko a();

    void a(Handler handler, j9 j9Var);

    void a(j9 j9Var);

    public interface a {
        void b(int i12, long j12, long j13);

        /* renamed from: com.yandex.mobile.ads.impl.pd$a$a, reason: collision with other inner class name */
        public static final class C10980a {

            /* renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C10981a> f388781a = new CopyOnWriteArrayList<>();

            /* renamed from: com.yandex.mobile.ads.impl.pd$a$a$a, reason: collision with other inner class name */
            public static final class C10981a {

                /* renamed from: a, reason: collision with root package name */
                private final Handler f388782a;

                /* renamed from: b, reason: collision with root package name */
                private final a f388783b;

                /* renamed from: c, reason: collision with root package name */
                private boolean f388784c;

                public C10981a(Handler handler, j9 j9Var) {
                    this.f388782a = handler;
                    this.f388783b = j9Var;
                }

                public final void a() {
                    this.f388784c = true;
                }
            }

            public final void a(j9 j9Var) {
                Iterator<C10981a> it = this.f388781a.iterator();
                while (it.hasNext()) {
                    C10981a next = it.next();
                    if (next.f388783b == j9Var) {
                        next.a();
                        this.f388781a.remove(next);
                    }
                }
            }

            public final void a(int i12, long j12, long j13) {
                Iterator<C10981a> it = this.f388781a.iterator();
                while (it.hasNext()) {
                    C10981a next = it.next();
                    if (!next.f388784c) {
                        next.f388782a.post(new J1(next, i12, j12, j13, 0));
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void a(C10981a c10981a, int i12, long j12, long j13) {
                c10981a.f388783b.b(i12, j12, j13);
            }

            public final void a(Handler handler, j9 j9Var) {
                j9Var.getClass();
                a(j9Var);
                this.f388781a.add(new C10981a(handler, j9Var));
            }
        }
    }
}
