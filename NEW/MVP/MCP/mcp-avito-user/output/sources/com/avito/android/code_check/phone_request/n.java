package com.avito.android.code_check.phone_request;

import com.avito.android.code_check.phone_request.a;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: PhoneRequestModule_ProvidePhoneRequestScreenFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<com.avito.android.code_check_public.screen.d> {

    /* renamed from: a, reason: collision with root package name */
    public final k f119138a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f119139b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Map<String, com.avito.android.code_check_public.screen.h>> f119140c;

    public n(k kVar, dagger.internal.l lVar, Provider provider) {
        this.f119138a = kVar;
        this.f119139b = lVar;
        this.f119140c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f119139b.f393949a;
        Map map = (Map) ((a.c.b) this.f119140c).get();
        this.f119138a.getClass();
        Object obj = map.get(str);
        if (obj == null) {
            throw new IllegalArgumentException(str.concat(" is not provided  – use com.avito.android.code_check_public.screen.ScreenNavigation.navVariants").toString());
        }
        com.avito.android.code_check_public.screen.d dVar = obj instanceof com.avito.android.code_check_public.screen.d ? (com.avito.android.code_check_public.screen.d) obj : null;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(str.concat(" is not Screen.PhoneRequest as expected!").toString());
    }
}
