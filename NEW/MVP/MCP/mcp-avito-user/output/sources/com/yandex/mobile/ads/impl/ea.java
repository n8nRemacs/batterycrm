package com.yandex.mobile.ads.impl;

import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class ea {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Executor f384820a;

    public interface a {
        void a(@Y61.l String str);

        void b(@Y61.l String str);
    }

    public ea(@Y61.k Executor executor) {
        this.f384820a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar) {
        try {
            com.yandex.metrica.p.guc(new xc(aVar), true);
        } catch (Throwable th2) {
            aVar.b(th2.getMessage());
        }
    }

    public final void a(@Y61.k a aVar) {
        this.f384820a.execute(new J(aVar, 4));
    }

    public /* synthetic */ ea() {
        this(v90.a().b());
    }
}
