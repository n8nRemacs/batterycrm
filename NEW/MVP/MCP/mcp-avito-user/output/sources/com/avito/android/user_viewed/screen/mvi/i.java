package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.reactive.A;

/* compiled from: UserViewedBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements com.avito.android.arch.mvi.b<UserViewedInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_viewed.domain.business.a f318437a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f318438b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f318439c;

    @Inject
    public i(@Y61.k com.avito.android.user_viewed.domain.business.a aVar, @Y61.k com.avito.android.favorite.h hVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f318437a = aVar;
        this.f318438b = hVar;
        this.f318439c = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<UserViewedInternalAction> a() {
        return C43175k.N(C43175k.L(new h(this, null), this.f318437a.a()), new g(A.a(this.f318438b.c())));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
