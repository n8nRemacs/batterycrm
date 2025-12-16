package com.avito.android.code_check.phone_list;

import com.avito.android.code_check_public.screen.PhoneList;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PhoneListModule_ProvideResultFlowFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class r implements dagger.internal.h<InterfaceC43160i<To.d>> {

    /* renamed from: a, reason: collision with root package name */
    public final i f119015a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<PhoneList> f119016b;

    public r(i iVar, Provider<PhoneList> provider) {
        this.f119015a = iVar;
        this.f119016b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        PhoneList phoneList = this.f119016b.get();
        this.f119015a.getClass();
        InterfaceC43160i<To.d> interfaceC43160i = phoneList.f119306f;
        dagger.internal.t.d(interfaceC43160i);
        return interfaceC43160i;
    }
}
