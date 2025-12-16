package com.avito.android.early_access_advert.di;

import com.avito.android.remote.model.early_access_advert.EarlyAccessAdvertResult;
import com.avito.android.remote.parse.adapter.SealedClassDeserializer;
import com.avito.android.util.X5;
import dagger.internal.x;
import dagger.internal.y;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;

/* compiled from: EarlyAccessAdvertModule_ProvideEarlyAccessAdvertTypeAdapterEntriesFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<Set<X5>> {

    /* compiled from: EarlyAccessAdvertModule_ProvideEarlyAccessAdvertTypeAdapterEntriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f145619a = new i();
    }

    public static i a() {
        return a.f145619a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.avito.android.remote.model.early_access_advert.EarlyAccessAdvertResult$Error] */
    @Override // javax.inject.Provider
    public final Object get() {
        h.f145618a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        SealedClassDeserializer.f254229d.getClass();
        SealedClassDeserializer.a aVar = new SealedClassDeserializer.a();
        ?? error = new EarlyAccessAdvertResult.Error(null, 1, null);
        if (aVar.f254235c != 0) {
            throw new IllegalStateException("Fallback is registered already!");
        }
        aVar.f254235c = error;
        aVar.a("internal-error");
        LinkedHashMap linkedHashMap = aVar.f254234b;
        n0 n0Var = m0.f406844a;
        linkedHashMap.put("internal-error", n0Var.b(EarlyAccessAdvertResult.Error.class));
        aVar.a("bad-request");
        linkedHashMap.put("bad-request", n0Var.b(EarlyAccessAdvertResult.Error.class));
        aVar.a("unauthorized");
        linkedHashMap.put("unauthorized", n0Var.b(EarlyAccessAdvertResult.Error.class));
        aVar.a("forbidden");
        linkedHashMap.put("forbidden", n0Var.b(EarlyAccessAdvertResult.Error.class));
        aVar.a("not-found");
        linkedHashMap.put("not-found", n0Var.b(EarlyAccessAdvertResult.Error.class));
        aVar.a("error");
        linkedHashMap.put("error", n0Var.b(EarlyAccessAdvertResult.Error.class));
        aVar.a("success");
        linkedHashMap.put("success", n0Var.b(EarlyAccessAdvertResult.Success.class));
        linkedHashSet.add(new X5(EarlyAccessAdvertResult.class, aVar.b()));
        return linkedHashSet;
    }
}
