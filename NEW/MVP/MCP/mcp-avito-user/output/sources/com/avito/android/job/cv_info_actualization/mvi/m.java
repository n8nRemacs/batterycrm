package com.avito.android.job.cv_info_actualization.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvInfoActualizationOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f174189a;

    public m(dagger.internal.l lVar) {
        this.f174189a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((DeepLink) this.f174189a.f393949a);
    }
}
