package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.zn;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class yn<D> implements wn<D> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Comparator<D> f382270a;

    /* renamed from: b, reason: collision with root package name */
    private final int f382271b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f382272c;

    /* renamed from: d, reason: collision with root package name */
    @j.k0
    final long f382273d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private D f382274e;

    /* renamed from: f, reason: collision with root package name */
    private int f382275f;

    /* renamed from: g, reason: collision with root package name */
    private long f382276g;

    public yn(@j.N Comparator<D> comparator, @j.N com.yandex.metrica.coreutils.services.f fVar, int i12, long j12) {
        this.f382270a = comparator;
        this.f382271b = i12;
        this.f382272c = fVar;
        this.f382273d = TimeUnit.SECONDS.toMillis(j12);
    }

    private void a() {
        this.f382275f = 0;
        this.f382276g = this.f382272c.a();
    }

    @Override // com.yandex.metrica.impl.ob.wn
    @j.N
    public zn<D> get(@j.P D d12) {
        D d13 = this.f382274e;
        if (d13 != d12) {
            if (this.f382270a.compare(d13, d12) != 0) {
                this.f382274e = d12;
                a();
                return new zn<>(zn.a.NEW, this.f382274e);
            }
            this.f382274e = d12;
        }
        int i12 = this.f382275f + 1;
        this.f382275f = i12;
        this.f382275f = i12 % this.f382271b;
        if (this.f382272c.a() - this.f382276g >= this.f382273d) {
            a();
            return new zn<>(zn.a.REFRESH, this.f382274e);
        }
        if (this.f382275f != 0) {
            return new zn<>(zn.a.NOT_CHANGED, this.f382274e);
        }
        a();
        return new zn<>(zn.a.REFRESH, this.f382274e);
    }
}
