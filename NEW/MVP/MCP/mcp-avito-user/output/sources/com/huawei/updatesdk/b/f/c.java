package com.huawei.updatesdk.b.f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f363849a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static com.huawei.updatesdk.b.f.a f363850b = new a();

    public static class a implements com.huawei.updatesdk.b.f.a {

        /* renamed from: a, reason: collision with root package name */
        private final List<b> f363851a = new ArrayList();

        @Override // com.huawei.updatesdk.b.f.a
        public void a(int i12, com.huawei.updatesdk.a.b.b.b bVar) {
            synchronized (this.f363851a) {
                try {
                    Iterator<b> it = this.f363851a.iterator();
                    while (it.hasNext()) {
                        it.next().a(i12, bVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.huawei.updatesdk.b.f.a
        public void b(b bVar) {
            synchronized (this.f363851a) {
                try {
                    this.f363851a.remove(bVar);
                } catch (UnsupportedOperationException unused) {
                    com.huawei.updatesdk.a.a.c.a.a.a.b("InstallObserverManager", "unRegisterObserver UnsupportedOperationException");
                }
            }
        }

        @Override // com.huawei.updatesdk.b.f.a
        public void a(b bVar) {
            String str;
            String str2;
            synchronized (this.f363851a) {
                try {
                    if (bVar == null) {
                        return;
                    }
                    if (!this.f363851a.contains(bVar)) {
                        try {
                            this.f363851a.add(bVar);
                        } catch (ClassCastException unused) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver ClassCastException";
                            com.huawei.updatesdk.a.a.c.a.a.a.b(str, str2);
                        } catch (IllegalArgumentException unused2) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver IllegalArgumentException";
                            com.huawei.updatesdk.a.a.c.a.a.a.b(str, str2);
                        } catch (UnsupportedOperationException unused3) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver UnsupportedOperationException";
                            com.huawei.updatesdk.a.a.c.a.a.a.b(str, str2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private c() {
    }

    public static com.huawei.updatesdk.b.f.a a() {
        return f363850b;
    }

    public static c b() {
        return f363849a;
    }

    public void c(com.huawei.updatesdk.a.b.b.b bVar) {
        f363850b.a(2, bVar);
    }

    public void a(com.huawei.updatesdk.a.b.b.b bVar) {
        f363850b.a(1, bVar);
    }

    public void b(com.huawei.updatesdk.a.b.b.b bVar) {
        f363850b.a(0, bVar);
    }
}
