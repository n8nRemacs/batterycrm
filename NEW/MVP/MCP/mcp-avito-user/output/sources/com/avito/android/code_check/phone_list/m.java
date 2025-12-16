package com.avito.android.code_check.phone_list;

import com.avito.android.code_check_public.screen.PhoneList;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneListModule_ProvideIsPhonesClickableFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final i f118986a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f118987b;

    public m(i iVar, dagger.internal.u uVar) {
        this.f118986a = iVar;
        this.f118987b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        PhoneList phoneList = (PhoneList) this.f118987b.get();
        this.f118986a.getClass();
        return Boolean.valueOf(!(phoneList.f119305e instanceof com.avito.android.code_check_public.screen.e));
    }
}
