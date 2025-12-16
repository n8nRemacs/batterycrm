package dM;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import hM.C40851c;
import hM.InterfaceC40849a;

/* compiled from: IacCrashRegisterImpl_Factory.java */
@e
@y
@x
/* renamed from: dM.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C39599b implements h<C39598a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f393831a;

    /* renamed from: b, reason: collision with root package name */
    public final C40851c f393832b;

    public C39599b(f fVar, C40851c c40851c) {
        this.f393831a = fVar;
        this.f393832b = c40851c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C39598a((InterfaceC28373a) this.f393831a.get(), (InterfaceC40849a) this.f393832b.get());
    }
}
