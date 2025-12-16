package com.avito.android.code_check.phone_list;

import com.avito.android.code_check.phone_list.a;
import com.avito.android.code_check_public.screen.PhoneList;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: PhoneListModule_ProvidePhoneRequestScreenFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class p implements dagger.internal.h<PhoneList> {

    /* renamed from: a, reason: collision with root package name */
    public final i f119011a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f119012b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Map<String, com.avito.android.code_check_public.screen.h>> f119013c;

    public p(i iVar, dagger.internal.l lVar, Provider provider) {
        this.f119011a = iVar;
        this.f119012b = lVar;
        this.f119013c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f119012b.f393949a;
        Map map = (Map) ((a.c.d) this.f119013c).get();
        this.f119011a.getClass();
        Object obj = map.get(str);
        if (obj == null) {
            throw new IllegalArgumentException(str.concat(" is not provided – use com.avito.android.code_check_public.screen.ScreenNavigation.navVariants").toString());
        }
        PhoneList phoneList = obj instanceof PhoneList ? (PhoneList) obj : null;
        if (phoneList != null) {
            return phoneList;
        }
        throw new IllegalArgumentException(str.concat(" is not Screen.PhoneList as expected!").toString());
    }
}
