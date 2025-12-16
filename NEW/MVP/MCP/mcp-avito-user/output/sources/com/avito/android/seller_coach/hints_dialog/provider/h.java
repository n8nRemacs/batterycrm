package com.avito.android.seller_coach.hints_dialog.provider;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: HintDialogModule_ProvideItemPresentersSet$_avito_seller_coach_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.seller_coach.hints_dialog.item.hint.d> f267543a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.seller_coach.hints_dialog.item.header.d> f267544b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.seller_coach.hints_dialog.item.empty_hints.d> f267545c;

    public h(Provider<com.avito.android.seller_coach.hints_dialog.item.hint.d> provider, Provider<com.avito.android.seller_coach.hints_dialog.item.header.d> provider2, Provider<com.avito.android.seller_coach.hints_dialog.item.empty_hints.d> provider3) {
        this.f267543a = provider;
        this.f267544b = provider2;
        this.f267545c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.seller_coach.hints_dialog.item.hint.d dVar = this.f267543a.get();
        com.avito.android.seller_coach.hints_dialog.item.header.d dVar2 = this.f267544b.get();
        com.avito.android.seller_coach.hints_dialog.item.empty_hints.d dVar3 = this.f267545c.get();
        c.f267533a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{dVar, dVar2, dVar3});
        t.d(setL0);
        return setL0;
    }
}
