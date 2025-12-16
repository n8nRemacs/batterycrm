package com.avito.android.recall_me.di;

import com.avito.android.deep_linking.links.RecallMeLink;
import com.avito.android.recall_me.presentation.C34235e;
import com.avito.android.recall_me.presentation.C34239i;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RecallMeDeepLinkHandlerModule_ProvideRecallMeDeepLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C34235e f251816a;

    public d(C34235e c34235e) {
        this.f251816a = c34235e;
    }

    public static C43834a a(C34235e c34235e) {
        c.f251815a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RecallMeLink.class, new C34239i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RecallMeLink.class), c34235e));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f251816a);
    }
}
