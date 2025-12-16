package com.avito.android.extended_profile_map;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.i2;

/* compiled from: ExtendedProfileMapViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_map/y;", "Lcom/avito/android/arch/mvi/android/j;", "LAA/a;", "LAA/d;", "LAA/c;", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class y extends com.avito.android.arch.mvi.android.j<AA.a, AA.d, AA.c> {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ux_feedback.b f151339N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public y(@Y61.k com.avito.android.extended_profile_map.mvi.j jVar, @Y61.k com.avito.android.extended_profile_ux_feedback.b bVar) {
        super(jVar, i2.a.f411433c);
        i2.f411430a.getClass();
        this.f151339N = bVar;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f151339N.clear();
    }
}
