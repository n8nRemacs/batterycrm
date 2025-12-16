package com.avito.android.advert_core.feature_teasers.common.dialog;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsFeatureTeaserDialogTextItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f83637a;

    /* renamed from: b, reason: collision with root package name */
    public final u f83638b;

    public g(u uVar, u uVar2) {
        this.f83637a = uVar;
        this.f83638b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((h) this.f83637a.get(), (com.avito.android.util.text.a) this.f83638b.get());
    }
}
