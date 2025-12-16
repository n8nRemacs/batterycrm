package com.avito.android.mortgage_invite.participant.domain.validation;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ParticipantFieldsValidator_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final j f206129a;

    /* renamed from: b, reason: collision with root package name */
    public final l f206130b;

    /* renamed from: c, reason: collision with root package name */
    public final b f206131c;

    /* renamed from: d, reason: collision with root package name */
    public final f f206132d;

    /* renamed from: e, reason: collision with root package name */
    public final h f206133e;

    /* renamed from: f, reason: collision with root package name */
    public final d f206134f;

    public o(j jVar, l lVar, b bVar, f fVar, h hVar, d dVar) {
        this.f206129a = jVar;
        this.f206130b = lVar;
        this.f206131c = bVar;
        this.f206132d = fVar;
        this.f206133e = hVar;
        this.f206134f = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((m) this.f206129a.get(), (m) this.f206130b.get(), (m) this.f206131c.get(), (m) this.f206132d.get(), (m) this.f206133e.get(), (m) this.f206134f.get());
    }
}
