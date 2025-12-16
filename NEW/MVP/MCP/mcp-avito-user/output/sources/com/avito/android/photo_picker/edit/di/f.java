package com.avito.android.photo_picker.edit.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.photo_picker.edit.k;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EditPhotoModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final d f219400a;

    /* renamed from: b, reason: collision with root package name */
    public final l f219401b;

    /* renamed from: c, reason: collision with root package name */
    public final u f219402c;

    public f(d dVar, l lVar, u uVar) {
        this.f219400a = dVar;
        this.f219401b = lVar;
        this.f219402c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f219401b.f393949a;
        P0.c cVar = (P0.c) this.f219402c.get();
        this.f219400a.getClass();
        return (k) new P0(fragment, cVar).a(k.class);
    }
}
