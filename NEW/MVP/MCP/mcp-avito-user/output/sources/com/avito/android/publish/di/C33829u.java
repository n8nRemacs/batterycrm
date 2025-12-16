package com.avito.android.publish.di;

import androidx.view.R0;
import com.avito.android.publish.C33880m;
import com.avito.android.publish.C34149w;
import com.avito.android.publish.C34151x;
import com.avito.android.publish.InterfaceC33878l;
import com.avito.android.publish.PublishActivity;

/* compiled from: PublishModule_ProvideFeesViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.di.u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33829u implements dagger.internal.h<InterfaceC33878l> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235285a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f235286b;

    /* renamed from: c, reason: collision with root package name */
    public final C34151x f235287c;

    public C33829u(C33824o c33824o, dagger.internal.l lVar, C34151x c34151x) {
        this.f235285a = c33824o;
        this.f235286b = lVar;
        this.f235287c = c34151x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        PublishActivity publishActivity = (PublishActivity) this.f235286b.f393949a;
        C34149w c34149w = (C34149w) this.f235287c.get();
        this.f235285a.getClass();
        return (InterfaceC33878l) R0.b(publishActivity, c34149w).a(C33880m.class);
    }
}
