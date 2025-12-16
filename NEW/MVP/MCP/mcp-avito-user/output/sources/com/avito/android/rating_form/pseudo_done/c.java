package com.avito.android.rating_form.pseudo_done;

import com.avito.android.rating_form.pseudo_done.mvi.i;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: RatingFormPseudoDoneViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final i f248842a;

    public c(i iVar) {
        this.f248842a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.rating_form.pseudo_done.mvi.h hVar = (com.avito.android.rating_form.pseudo_done.mvi.h) this.f248842a.get();
        i2.f411430a.getClass();
        return new b(hVar, i2.a.f411433c);
    }
}
