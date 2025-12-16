package com.avito.android.user_viewed.domain.business;

import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: UserViewedCommonInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_viewed/domain/business/f;", "Lcom/avito/android/user_viewed/domain/business/a;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f318342a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final k f318343b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f318344c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f318345d = f2.b(0, 0, null, 7);

    @Inject
    public f(@Y61.k h hVar, @Y61.k k kVar, @Y61.k com.avito.android.favorite.h hVar2) {
        this.f318342a = hVar;
        this.f318343b = kVar;
        this.f318344c = hVar2;
    }

    @Override // com.avito.android.user_viewed.domain.business.a
    @Y61.k
    public final kotlinx.coroutines.flow.internal.l a() {
        return C43175k.Y(C43175k.P(this.f318345d, new c(2, null)), new b(this, null));
    }

    @Override // com.avito.android.user_viewed.domain.business.a
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        e2 e2Var = this.f318345d;
        G0 g02 = G0.f406611a;
        Object objEmit = e2Var.emit(g02, continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : g02;
    }
}
