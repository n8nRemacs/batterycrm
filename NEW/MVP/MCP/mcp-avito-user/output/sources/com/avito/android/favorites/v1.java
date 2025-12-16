package com.avito.android.favorites;

import com.avito.android.lib.design.chips.Chips;
import kotlin.Metadata;

/* compiled from: FavoritesView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/v1;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class v1 implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x1 f157564a;

    public v1(x1 x1Var) {
        this.f157564a = x1Var;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        this.f157564a.f157617u.accept((CategoryChipable) hVar);
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
    }
}
