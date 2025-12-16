package com.avito.android.inline_filters.dialog;

import android.app.Activity;
import com.avito.android.B2;
import javax.inject.Provider;
import lE.C43624b;

/* compiled from: InlineFilterDialogFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.inline_filters.dialog.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31011e implements dagger.internal.h<C31010d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Activity> f171547a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.select.x> f171548b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<s> f171549c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<B2> f171550d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C43624b> f171551e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.inline_filters.dialog.calendar.date_range.b f171552f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f171553g;

    public C31011e(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, com.avito.android.inline_filters.dialog.calendar.date_range.b bVar, Provider provider6) {
        this.f171547a = provider;
        this.f171548b = provider2;
        this.f171549c = provider3;
        this.f171550d = provider4;
        this.f171551e = provider5;
        this.f171552f = bVar;
        this.f171553g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Activity activity = this.f171547a.get();
        com.avito.android.select.x xVar = this.f171548b.get();
        s sVar = this.f171549c.get();
        B2 b22 = this.f171550d.get();
        C43624b c43624b = this.f171551e.get();
        this.f171552f.getClass();
        return new C31010d(activity, xVar, sVar, b22, c43624b, new com.avito.android.inline_filters.dialog.calendar.date_range.a(), this.f171553g.get());
    }
}
