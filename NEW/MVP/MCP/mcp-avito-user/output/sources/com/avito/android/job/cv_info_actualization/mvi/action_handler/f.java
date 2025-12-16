package com.avito.android.job.cv_info_actualization.mvi.action_handler;

import com.avito.android.job.cv_info_actualization.mvi.domain.i;
import com.avito.android.job.cv_info_actualization.mvi.domain.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvInfoActualizationOnActionButtonActionHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final j f174104a;

    public f(j jVar) {
        this.f174104a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((i) this.f174104a.get());
    }
}
