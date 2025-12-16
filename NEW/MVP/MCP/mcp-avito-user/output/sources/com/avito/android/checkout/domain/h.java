package com.avito.android.checkout.domain;

import Y61.l;
import Zx.C19616a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import so.InterfaceC48388a;

/* compiled from: FetchCheckoutUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/domain/h;", "", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48388a f118311a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f118312b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C19616a f118313c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.checkout.data.a f118314d;

    @Inject
    public h(@Y61.k InterfaceC48388a interfaceC48388a, @Y61.k R0 r02, @Y61.k C19616a c19616a, @Y61.k com.avito.android.checkout.data.a aVar) {
        this.f118311a = interfaceC48388a;
        this.f118312b = r02;
        this.f118313c = c19616a;
        this.f118314d = aVar;
    }

    @l
    public final Object a(@Y61.k String str, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f118312b.a(), new g(this, str, null), suspendLambda);
    }
}
