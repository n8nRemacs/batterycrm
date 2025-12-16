package com.avito.android.seller_coach.hints_dialog.item.hint;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HintItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f267496a;

    public c(u uVar) {
        this.f267496a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f267496a.get());
    }
}
