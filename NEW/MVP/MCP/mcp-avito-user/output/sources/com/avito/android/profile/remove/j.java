package com.avito.android.profile.remove;

import androidx.view.M0;
import androidx.view.P0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.i2;

/* compiled from: ProfileRemoveViewMviModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/j;", "Landroidx/lifecycle/P0$c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.remove.mvi.f f223937a;

    @Inject
    public j(@Y61.k com.avito.android.profile.remove.mvi.f fVar) {
        this.f223937a = fVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(i.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        i2.f411430a.getClass();
        return new i(this.f223937a, i2.a.f411433c);
    }
}
