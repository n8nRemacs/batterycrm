package com.avito.android.code_check;

import com.avito.android.code_check.q;
import com.avito.android.code_check_public.CodeCheckLink;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: CodeCheckModule_ProvideScenarioFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<com.avito.android.code_check_public.d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f118841a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f118842b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Map<Class<? extends CodeCheckLink.Flow>, Provider<com.avito.android.code_check_public.e>>> f118843c;

    public m(l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f118841a = lVar;
        this.f118842b = lVar2;
        this.f118843c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = this.f118841a;
        CodeCheckLink.Flow flow = (CodeCheckLink.Flow) this.f118842b.f393949a;
        Map map = (Map) ((q.b.a) this.f118843c).get();
        lVar.getClass();
        Object obj = map.get(flow.getClass());
        if (obj != null) {
            com.avito.android.code_check_public.e eVar = (com.avito.android.code_check_public.e) ((Provider) obj).get();
            eVar.f119286a = flow;
            return eVar.a();
        }
        throw new IllegalArgumentException(("Scenario is not binded to flow `" + flow + "`! Use @ContributesMultibinding to bind it.").toString());
    }
}
