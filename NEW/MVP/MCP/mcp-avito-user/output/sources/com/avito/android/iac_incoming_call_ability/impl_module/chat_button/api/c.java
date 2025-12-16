package com.avito.android.iac_incoming_call_ability.impl_module.chat_button.api;

import com.avito.android.iac_api_utils.util_module.i;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacChannelButtonsApiImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f168222a;

    /* renamed from: b, reason: collision with root package name */
    public final i f168223b;

    public c(u uVar, i iVar) {
        this.f168222a = uVar;
        this.f168223b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.a(w.a(this.f168222a)), (com.avito.android.iac_api_utils.util_module.a) this.f168223b.get());
    }
}
