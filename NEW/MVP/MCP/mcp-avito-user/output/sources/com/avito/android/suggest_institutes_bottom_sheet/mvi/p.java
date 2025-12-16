package com.avito.android.suggest_institutes_bottom_sheet.mvi;

import com.avito.android.suggest_institutes_bottom_sheet.SelectedSuggestInstitute;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestInstitutesOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f292075a;

    public p(dagger.internal.l lVar) {
        this.f292075a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((SelectedSuggestInstitute) this.f292075a.f393949a);
    }
}
