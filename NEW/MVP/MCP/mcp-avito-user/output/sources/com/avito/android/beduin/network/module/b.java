package com.avito.android.beduin.network.module;

import com.avito.android.beduin.network.parse.SkipToFieldTypeAdapter;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import kotlin.collections.C42745f0;
import qi.InterfaceC47401b;
import ri.C47658a;
import ri.C47659b;

/* compiled from: BeduinJsonModule_ProvideBeduinScreenTypeAdapterFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final u f104025a;

    public b(u uVar) {
        this.f104025a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C47658a c47658a = (C47658a) this.f104025a.get();
        a.f104024a.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, InterfaceC47401b.class);
        SkipToFieldTypeAdapter skipToFieldTypeAdapter = new SkipToFieldTypeAdapter(InterfaceC47401b.class, "content");
        for (C47659b c47659b : C42745f0.P0(c47658a.f430146b)) {
            Iterator<T> it = c47659b.f430147a.iterator();
            while (it.hasNext()) {
                runtimeTypeAdapterFactoryD.b(c47659b.f430148b, (String) it.next(), skipToFieldTypeAdapter);
            }
        }
        c47658a.f430145a = true;
        return runtimeTypeAdapterFactoryD;
    }
}
