package Lh;

import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConditionalGroupParametersExtractionStrategy_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<C14397a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f10088a;

    /* renamed from: b, reason: collision with root package name */
    public final f f10089b;

    /* renamed from: c, reason: collision with root package name */
    public final u f10090c;

    public b(f fVar, f fVar2, u uVar) {
        this.f10088a = fVar;
        this.f10089b = fVar2;
        this.f10090c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14397a(g.b(this.f10088a), g.b(this.f10089b), g.a(w.a(this.f10090c)));
    }
}
