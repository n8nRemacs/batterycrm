package com.avito.android.publish.category_edit.di;

import androidx.fragment.app.DialogFragment;
import androidx.view.P0;
import com.avito.android.publish.category_edit.k;
import com.avito.android.publish.category_edit.n;
import com.avito.android.publish.category_edit.o;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategoryEditModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f232355a;

    /* renamed from: b, reason: collision with root package name */
    public final o f232356b;

    public h(l lVar, o oVar) {
        this.f232355a = lVar;
        this.f232356b = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        DialogFragment dialogFragment = (DialogFragment) this.f232355a.f393949a;
        n nVar = (n) this.f232356b.get();
        c.f232350a.getClass();
        return (k) new P0(dialogFragment, nVar).a(k.class);
    }
}
