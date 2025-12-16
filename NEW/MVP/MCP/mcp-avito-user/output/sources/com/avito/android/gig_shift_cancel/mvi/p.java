package com.avito.android.gig_shift_cancel.mvi;

/* compiled from: GigShiftCancelFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final k f160662a;

    /* renamed from: b, reason: collision with root package name */
    public final u f160663b;

    /* renamed from: c, reason: collision with root package name */
    public final m f160664c;

    /* renamed from: d, reason: collision with root package name */
    public final w f160665d;

    public p(k kVar, u uVar, m mVar, w wVar) {
        this.f160662a = kVar;
        this.f160663b = uVar;
        this.f160664c = mVar;
        this.f160665d = wVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f160662a.get();
        this.f160663b.getClass();
        return new o("GigShiftCancel", new x(false, false, null, false, null, false, null, null, null, null, 1023, null), new n(iVar, new t(), (l) this.f160664c.get(), (v) this.f160665d.get()));
    }
}
