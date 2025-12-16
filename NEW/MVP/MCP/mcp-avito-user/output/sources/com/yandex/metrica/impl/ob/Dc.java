package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public abstract class Dc<T> {

    /* renamed from: e, reason: collision with root package name */
    static final long f377962e = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    @j.N
    protected final Context f377963a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    protected final InterfaceC39291zd f377964b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    protected final LocationListener f377965c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    protected final Looper f377966d;

    public Dc(@j.N Context context, @j.N LocationListener locationListener, @j.N InterfaceC39291zd interfaceC39291zd, @j.N Looper looper) {
        this.f377963a = context;
        this.f377965c = locationListener;
        this.f377964b = interfaceC39291zd;
        this.f377966d = looper;
    }

    public abstract void a();

    public abstract boolean a(@j.N T t12);

    public abstract void b();
}
