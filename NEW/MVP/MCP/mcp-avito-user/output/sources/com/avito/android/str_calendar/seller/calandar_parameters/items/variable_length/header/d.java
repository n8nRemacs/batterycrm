package com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.header;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VariableParameterHeaderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final g f287301a;

    public d(g gVar) {
        this.f287301a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((f) this.f287301a.get());
    }
}
