package com.avito.android.publish.di;

import androidx.view.R0;
import com.avito.android.publish.C34152x0;
import com.avito.android.publish.InterfaceC34150w0;
import com.avito.android.publish.PublishActivity;

/* compiled from: PublishModule_ProvidePriceAbuseInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.di.w, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33831w implements dagger.internal.h<InterfaceC34150w0> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235292a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f235293b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.publish.N f235294c;

    public C33831w(C33824o c33824o, dagger.internal.l lVar, com.avito.android.publish.N n12) {
        this.f235292a = c33824o;
        this.f235293b = lVar;
        this.f235294c = n12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        PublishActivity publishActivity = (PublishActivity) this.f235293b.f393949a;
        com.avito.android.publish.M m12 = (com.avito.android.publish.M) this.f235294c.get();
        this.f235292a.getClass();
        return (InterfaceC34150w0) R0.b(publishActivity, m12).a(C34152x0.class);
    }
}
