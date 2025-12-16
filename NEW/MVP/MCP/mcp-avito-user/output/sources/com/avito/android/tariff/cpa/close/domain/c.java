package com.avito.android.tariff.cpa.close.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.C43259k;

/* compiled from: PostCpaCloseUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/close/domain/c;", "Lcom/avito/android/tariff/cpa/close/domain/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final WB0.a f294237b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f294238c;

    @Inject
    public c(@k WB0.a aVar, @k R0 r02) {
        this.f294237b = aVar;
        this.f294238c = r02;
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super TypedResult<DeepLinkResponse>> continuation) {
        return C43259k.g(this.f294238c.a(), new b(this, null), continuation);
    }
}
