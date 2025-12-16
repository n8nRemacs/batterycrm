package com.bumptech.glide.load.data;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import j.N;
import j.P;

/* compiled from: DataFetcher.java */
/* loaded from: classes5.dex */
public interface d<T> {

    /* compiled from: DataFetcher.java */
    public interface a<T> {
        void c(@P T t12);

        void f(@N Exception exc);
    }

    @N
    Class<T> a();

    void b();

    void cancel();

    @N
    DataSource d();

    void e(@N Priority priority, @N a<? super T> aVar);
}
