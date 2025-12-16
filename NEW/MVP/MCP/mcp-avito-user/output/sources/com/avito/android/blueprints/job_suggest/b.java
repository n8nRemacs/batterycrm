package com.avito.android.blueprints.job_suggest;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobSuggestInstitutesBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f106040a;

    public b(Provider<c> provider) {
        this.f106040a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f106040a.get());
    }
}
