package com.avito.android.photo_picker.edit.di;

import android.content.Context;
import com.avito.android.photo_picker.edit.di.a;
import com.avito.android.photo_picker.edit.t;
import com.avito.android.photo_picker.edit.u;
import com.avito.android.photo_storage.i;
import com.avito.android.photo_storage.k;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditPhotoModule_ProvideExifProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final d f219396a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Context> f219397b;

    /* renamed from: c, reason: collision with root package name */
    public final k f219398c;

    /* renamed from: d, reason: collision with root package name */
    public final N70.d f219399d;

    public e(d dVar, Provider provider, k kVar, N70.d dVar2) {
        this.f219396a = dVar;
        this.f219397b = provider;
        this.f219398c = kVar;
        this.f219399d = dVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) ((a.c.C6594a) this.f219397b).get();
        i iVar = (i) this.f219398c.get();
        N70.b bVar = (N70.b) this.f219399d.get();
        this.f219396a.getClass();
        return new u(context, iVar, bVar);
    }
}
