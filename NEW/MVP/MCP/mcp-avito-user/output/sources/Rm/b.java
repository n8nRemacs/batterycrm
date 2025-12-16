package RM;

import com.avito.android.important_addresses_selection.data.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GetSelectionFormUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f14408a;

    public b(i iVar) {
        this.f14408a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f14408a.get());
    }
}
