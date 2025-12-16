package com.avito.android.code_check.deep_linking;

import com.avito.android.code_check_public.CodeCheckLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CodeCheckLinkHandlerModule_ProvideCodeCheckLinkMappingFactory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f118818a;

    public c(d dVar) {
        this.f118818a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b.f118817a.getClass();
        return new C43834a(CodeCheckLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CodeCheckLink.class), this.f118818a));
    }
}
