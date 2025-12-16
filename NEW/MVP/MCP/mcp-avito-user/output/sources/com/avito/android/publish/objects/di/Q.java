package com.avito.android.publish.objects.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.publish.objects.C33975x;
import com.avito.android.publish.objects.M0;

/* compiled from: ObjectFillFormModule_ProvideObjectFillFormViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class Q implements dagger.internal.h<C33975x> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f237665a;

    /* renamed from: b, reason: collision with root package name */
    public final M0 f237666b;

    public Q(dagger.internal.l lVar, M0 m02) {
        this.f237665a = lVar;
        this.f237666b = m02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f237665a.f393949a;
        C33975x.a aVar = (C33975x.a) this.f237666b.get();
        C33939w.f238031a.getClass();
        return (C33975x) new P0(fragment, aVar).a(C33975x.class);
    }
}
