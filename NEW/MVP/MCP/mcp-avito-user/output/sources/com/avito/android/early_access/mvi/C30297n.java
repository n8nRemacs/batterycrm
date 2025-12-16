package com.avito.android.early_access.mvi;

import com.avito.android.early_access.mvi.entity.EarlyAccessInternalAction;
import fv.C40482a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EarlyAccessBootstrap.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access/mvi/n;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.early_access.mvi.n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30297n implements com.avito.android.arch.mvi.b<EarlyAccessInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30301s f145515a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f145516b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.early_access.u f145517c;

    @Inject
    public C30297n(@Y61.k InterfaceC30301s interfaceC30301s, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.early_access.u uVar) {
        this.f145515a = interfaceC30301s;
        this.f145516b = aVar;
        this.f145517c = uVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<EarlyAccessInternalAction> a() {
        return C43175k.N(C43175k.C(new C30295l(this, null), new C30294k(C40482a.b(this.f145516b))), C43175k.C(new C30296m(this, null), this.f145517c.a()));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
