package com.avito.android.user_favorites;

import com.avito.android.lib.design.tab_layout.c;
import kotlin.Metadata;

/* compiled from: UserFavoritesView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/K;", "Lcom/avito/android/lib/design/tab_layout/c$f;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class K implements c.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.B<Integer> f316788a;

    public K(io.reactivex.rxjava3.core.B<Integer> b12) {
        this.f316788a = b12;
    }

    @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
    public final void c(@Y61.k c.i iVar) {
        this.f316788a.onNext(Integer.valueOf(iVar.f180895d));
    }

    @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
    public final void b() {
    }

    @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
    public final void a(@Y61.l c.i iVar) {
    }
}
