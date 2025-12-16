package com.avito.android.beduin.common.component.photo_picker;

/* compiled from: BeduinPhotoPickerComponentFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final y f101981a;

    /* renamed from: b, reason: collision with root package name */
    public final v f101982b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f101983c;

    public g(y yVar, v vVar, dagger.internal.u uVar) {
        this.f101981a = yVar;
        this.f101982b = vVar;
        this.f101983c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((w) this.f101981a.get(), (s) this.f101982b.get(), (p) this.f101983c.get());
    }
}
