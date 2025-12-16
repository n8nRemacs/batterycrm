package com.avito.android.publish.di;

import androidx.view.R0;
import com.avito.android.publish.C33880m;
import com.avito.android.publish.C34149w;
import com.avito.android.publish.C34151x;
import com.avito.android.publish.PublishActivity;

/* compiled from: PublishModule_ProvidePricingCheckerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.di.x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33832x implements dagger.internal.h<com.avito.android.publish.O> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235295a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f235296b;

    /* renamed from: c, reason: collision with root package name */
    public final C34151x f235297c;

    public C33832x(C33824o c33824o, dagger.internal.l lVar, C34151x c34151x) {
        this.f235295a = c33824o;
        this.f235296b = lVar;
        this.f235297c = c34151x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        PublishActivity publishActivity = (PublishActivity) this.f235296b.f393949a;
        C34149w c34149w = (C34149w) this.f235297c.get();
        this.f235295a.getClass();
        return (com.avito.android.publish.O) R0.b(publishActivity, c34149w).a(C33880m.class);
    }
}
