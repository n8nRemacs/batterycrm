package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.fk0;
import com.yandex.mobile.ads.impl.fn0;
import com.yandex.mobile.ads.impl.qm0;
import com.yandex.mobile.ads.impl.vm0;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
final class um0 implements qm0.a, fn0.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final vm0.a f390597a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final w20 f390598b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final AtomicInteger f390599c;

    public um0(@Y61.k vm0.a aVar, @Y61.k w20 w20Var, int i12) {
        this.f390597a = aVar;
        this.f390598b = w20Var;
        this.f390599c = new AtomicInteger(i12);
    }

    @Override // com.yandex.mobile.ads.impl.fn0.b
    public final void a() {
        if (this.f390599c.decrementAndGet() == 0) {
            vm0.a aVar = this.f390597a;
            w20 w20Var = this.f390598b;
            fk0.a.C10976a c10976a = (fk0.a.C10976a) aVar;
            Context context = (Context) fk0.a.this.f385398c.get();
            if (context != null) {
                fk0.this.f385395c.a(context, c10976a.f385404a, w20Var, fk0.a.this.f385397b, c10976a.f385405b);
            } else {
                c10976a.f385405b.a(i5.a("Unable to create native ad with nullable context", "Unable to create native ad with nullable context"));
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.qm0.a
    public final void b() {
        if (this.f390599c.decrementAndGet() == 0) {
            vm0.a aVar = this.f390597a;
            w20 w20Var = this.f390598b;
            fk0.a.C10976a c10976a = (fk0.a.C10976a) aVar;
            Context context = (Context) fk0.a.this.f385398c.get();
            if (context != null) {
                fk0.this.f385395c.a(context, c10976a.f385404a, w20Var, fk0.a.this.f385397b, c10976a.f385405b);
            } else {
                c10976a.f385405b.a(i5.a("Unable to create native ad with nullable context", "Unable to create native ad with nullable context"));
            }
        }
    }
}
