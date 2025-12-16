package com.avito.android.body_condition_sheet;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BodyConditionSheetDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f106884a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f106885b;

    public l(C30102l3 c30102l3, dv.b bVar) {
        this.f106884a = c30102l3;
        this.f106885b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((Context) this.f106884a.get(), (a.InterfaceC4053a) this.f106885b.get());
    }
}
