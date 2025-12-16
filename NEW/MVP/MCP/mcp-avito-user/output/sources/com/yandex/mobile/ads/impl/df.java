package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kz0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public abstract class df<T> extends qy0<T> {

    /* renamed from: q, reason: collision with root package name */
    private static final int f384591q = (int) TimeUnit.SECONDS.toMillis(10);

    /* renamed from: p, reason: collision with root package name */
    private final a<T> f384592p;

    public interface a<T> extends kz0.b<T>, kz0.a {
    }

    public df(int i12, String str, a<T> aVar) {
        super(i12, str, aVar);
        r();
        a(new hp(1.0f, f384591q, 0));
        this.f384592p = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final void a(T t12) {
        a<T> aVar = this.f384592p;
        if (aVar != null) {
            aVar.a((a<T>) t12);
        }
    }
}
