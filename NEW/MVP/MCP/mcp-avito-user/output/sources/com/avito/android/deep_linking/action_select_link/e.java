package com.avito.android.deep_linking.action_select_link;

import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ActionSelectLinkHandlerModule_ProvideActionSelectLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f132892a;

    public e(f fVar) {
        this.f132892a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = this.f132892a;
        d.f132891a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ActionSelectLink.class, new i(), new C43834a.b.C11809b(fVar));
    }
}
