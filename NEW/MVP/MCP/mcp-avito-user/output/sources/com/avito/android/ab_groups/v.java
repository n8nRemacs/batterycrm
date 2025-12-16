package com.avito.android.ab_groups;

import androidx.view.M0;
import androidx.view.P0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AbExperimentsViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_groups/v;", "Landroidx/lifecycle/P0$c;", "_avito_ab-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class v implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q3.e f67695a;

    @Inject
    public v(@Y61.k q3.e eVar) {
        this.f67695a = eVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (cls.isAssignableFrom(q.class)) {
            return new q(this.f67695a);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
