package com.avito.android.suggest_institutes_bottom_sheet.domain;

import com.avito.android.suggest_institutes_bottom_sheet.SelectedSuggestInstitute;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestInstitutesInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f292026a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<JQ.a> f292027b;

    /* renamed from: c, reason: collision with root package name */
    public final l f292028c;

    public b(l lVar, l lVar2, Provider provider) {
        this.f292026a = lVar;
        this.f292027b = provider;
        this.f292028c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(((Long) this.f292026a.f393949a).longValue(), this.f292027b.get(), (SelectedSuggestInstitute) this.f292028c.f393949a);
    }
}
