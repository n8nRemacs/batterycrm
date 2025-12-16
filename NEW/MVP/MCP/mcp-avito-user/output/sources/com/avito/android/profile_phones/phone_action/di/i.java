package com.avito.android.profile_phones.phone_action.di;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.NoWhenBranchMatchedException;
import tb0.C48641b;
import tb0.C48642c;
import tb0.InterfaceC48640a;

/* compiled from: PhoneActionModule_ProvideRemovingPhoneResourceProvider$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<InterfaceC48640a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f227294a;

    public i(d dVar) {
        this.f227294a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f227294a;
        int iOrdinal = dVar.f227283b.ordinal();
        Resources resources = dVar.f227282a;
        String str = dVar.f227284c;
        int i12 = dVar.f227285d;
        if (iOrdinal == 0) {
            return new C48641b(str, resources, i12);
        }
        if (iOrdinal == 1) {
            return new tb0.e(resources, str);
        }
        if (iOrdinal == 2) {
            return new C48642c(str, resources, i12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
