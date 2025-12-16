package Ih;

import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AccordionGroupParametersExtractionStrategy_Factory.java */
@e
@y
@x
/* renamed from: Ih.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14109b implements h<C14108a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f8480a;

    public C14109b(f fVar) {
        this.f8480a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14108a(g.a(w.a(this.f8480a)));
    }
}
