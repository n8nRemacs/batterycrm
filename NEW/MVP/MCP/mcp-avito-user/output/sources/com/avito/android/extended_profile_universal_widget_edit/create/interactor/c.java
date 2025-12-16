package com.avito.android.extended_profile_universal_widget_edit.create.interactor;

import Za0.InterfaceC19524a;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetCreateArguments;
import com.avito.android.extended_profile_universal_widget_edit.f;
import com.avito.android.extended_profile_universal_widget_edit.k;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalWidgetCreateInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19524a> f153746a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f153747b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f153748c;

    /* renamed from: d, reason: collision with root package name */
    public final l f153749d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<f> f153750e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.extended_profile_universal_widget_edit.l f153751f;

    public c(Provider provider, Provider provider2, Provider provider3, l lVar, Provider provider4, com.avito.android.extended_profile_universal_widget_edit.l lVar2) {
        this.f153746a = provider;
        this.f153747b = provider2;
        this.f153748c = provider3;
        this.f153749d = lVar;
        this.f153750e = provider4;
        this.f153751f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = g.b(this.f153746a);
        R0 r02 = this.f153747b.get();
        InterfaceC35863o4 interfaceC35863o4 = this.f153748c.get();
        UniversalWidgetCreateArguments universalWidgetCreateArguments = (UniversalWidgetCreateArguments) this.f153749d.f393949a;
        f fVar = this.f153750e.get();
        this.f153751f.getClass();
        return new b(eVarB, r02, interfaceC35863o4, universalWidgetCreateArguments, fVar, new k());
    }
}
