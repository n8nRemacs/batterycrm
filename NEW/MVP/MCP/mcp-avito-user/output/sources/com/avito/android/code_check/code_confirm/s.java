package com.avito.android.code_check.code_confirm;

import com.avito.android.code_check.code_confirm.E;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: CodeConfirmModule_ProvideCodeConfirmScreenFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class s implements dagger.internal.h<com.avito.android.code_check_public.screen.c> {

    /* renamed from: a, reason: collision with root package name */
    public final r f118779a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f118780b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Map<String, com.avito.android.code_check_public.screen.h>> f118781c;

    public s(r rVar, dagger.internal.l lVar, Provider provider) {
        this.f118779a = rVar;
        this.f118780b = lVar;
        this.f118781c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f118780b.f393949a;
        Map map = (Map) ((E.b.e) this.f118781c).get();
        this.f118779a.getClass();
        Object obj = map.get(str);
        if (obj == null) {
            throw new IllegalArgumentException(str.concat(" is not provided – use com.avito.android.code_check_public.screen.ScreenNavigation.navVariants").toString());
        }
        com.avito.android.code_check_public.screen.c cVar = obj instanceof com.avito.android.code_check_public.screen.c ? (com.avito.android.code_check_public.screen.c) obj : null;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(str.concat(" is not Screen.CodeConfirm as expected!").toString());
    }
}
