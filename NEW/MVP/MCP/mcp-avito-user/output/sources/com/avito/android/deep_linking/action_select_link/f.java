package com.avito.android.deep_linking.action_select_link;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ActionSelectLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f132893a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f132894b;

    public f(dagger.internal.f fVar, dv.b bVar) {
        this.f132893a = bVar;
        this.f132894b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((a.d) this.f132893a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f132894b.get());
    }
}
