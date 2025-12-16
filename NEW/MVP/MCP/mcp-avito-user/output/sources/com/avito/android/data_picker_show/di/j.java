package com.avito.android.data_picker_show.di;

import com.avito.beduin.v2.engine.core.z;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import iu.C42111a;

/* compiled from: DataPickerShowModule_ProvideMapConverter$_avito_data_picker_show_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<C42111a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f132551a;

    /* renamed from: b, reason: collision with root package name */
    public final u f132552b;

    public j(i iVar, u uVar) {
        this.f132551a = iVar;
        this.f132552b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        z zVar = (z) this.f132552b.get();
        this.f132551a.getClass();
        return new C42111a(zVar);
    }
}
