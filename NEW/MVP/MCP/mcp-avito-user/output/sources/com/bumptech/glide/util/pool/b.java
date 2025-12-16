package com.bumptech.glide.util.pool;

import com.bumptech.glide.util.pool.a;
import j.N;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FactoryPools.java */
/* loaded from: classes5.dex */
class b implements a.b<List<Object>> {
    @Override // com.bumptech.glide.util.pool.a.b
    @N
    public final List<Object> create() {
        return new ArrayList();
    }
}
