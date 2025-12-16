package com.avito.android.iac_util_deeplinks.impl_module.checkable_test_link;

import com.avito.android.iac_util_deeplinks.public_module.checkable_test_link.IacCheckableTestLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacCheckableTestLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f169138a;

    public e(c cVar) {
        this.f169138a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f169137a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacCheckableTestLink.class, new f(), new C43834a.b.C11809b(this.f169138a));
    }
}
