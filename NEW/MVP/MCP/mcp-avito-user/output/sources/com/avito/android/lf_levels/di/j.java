package com.avito.android.lf_levels.di;

import com.avito.android.lf_levels.deeplink.LfLevelsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import uR.C48938a;
import uR.C48941d;

/* compiled from: LfLevelsMappingsModule_ProvideLfLevelsDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C48941d f175359a;

    public j(C48941d c48941d) {
        this.f175359a = c48941d;
    }

    public static C43834a a(C48941d c48941d) {
        i.f175358a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(LfLevelsLink.class, new C48938a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(LfLevelsLink.class), c48941d));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f175359a);
    }
}
