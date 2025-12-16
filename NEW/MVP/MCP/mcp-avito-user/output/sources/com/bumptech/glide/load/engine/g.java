package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.cache.a;
import j.N;
import java.io.File;

/* compiled from: DataCacheWriter.java */
/* loaded from: classes5.dex */
class g<DataType> implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.a<DataType> f339010a;

    /* renamed from: b, reason: collision with root package name */
    public final DataType f339011b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.k f339012c;

    public g(com.bumptech.glide.load.a<DataType> aVar, DataType datatype, com.bumptech.glide.load.k kVar) {
        this.f339010a = aVar;
        this.f339011b = datatype;
        this.f339012c = kVar;
    }

    @Override // com.bumptech.glide.load.engine.cache.a.b
    public final boolean a(@N File file) {
        return this.f339010a.a(this.f339011b, file, this.f339012c);
    }
}
