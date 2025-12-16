package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import j.P;

/* compiled from: DataFetcherGenerator.java */
/* loaded from: classes5.dex */
interface h {

    /* compiled from: DataFetcherGenerator.java */
    public interface a {
        void b(com.bumptech.glide.load.h hVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource);

        void c(com.bumptech.glide.load.h hVar, @P Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, com.bumptech.glide.load.h hVar2);
    }

    boolean a();

    void cancel();
}
