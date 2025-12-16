package com.facebook.datasource;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: DataSource.java */
/* loaded from: classes5.dex */
public interface f<T> {
    @I41.h
    T a();

    boolean b();

    float c();

    boolean close();

    void d(k<T> kVar, Executor executor);

    boolean e();

    @I41.h
    Throwable f();

    boolean g();

    @I41.h
    Map<String, Object> getExtras();
}
