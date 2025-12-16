package com.avito.android.code_check.pre_request;

import com.avito.android.code_check.pre_request.a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: PreRequestModule_ProvidePhoneRequestScreenFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<com.avito.android.code_check_public.screen.g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f119185a;

    /* renamed from: b, reason: collision with root package name */
    public final l f119186b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Map<String, com.avito.android.code_check_public.screen.h>> f119187c;

    public h(e eVar, l lVar, Provider provider) {
        this.f119185a = eVar;
        this.f119186b = lVar;
        this.f119187c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f119186b.f393949a;
        Map map = (Map) ((a.c.b) this.f119187c).get();
        this.f119185a.getClass();
        Object obj = map.get(str);
        if (obj == null) {
            throw new IllegalArgumentException(str.concat(" is not provided – use com.avito.android.code_check_public.screen.ScreenNavigation.navVariants").toString());
        }
        com.avito.android.code_check_public.screen.g gVar = obj instanceof com.avito.android.code_check_public.screen.g ? (com.avito.android.code_check_public.screen.g) obj : null;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException(str.concat(" is not Screen.PhoneRequest as expected!").toString());
    }
}
