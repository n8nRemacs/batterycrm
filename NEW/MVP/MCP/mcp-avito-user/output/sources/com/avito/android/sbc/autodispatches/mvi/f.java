package com.avito.android.sbc.autodispatches.mvi;

import Po0.InterfaceC14819c;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SbcAutoDispatchesBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sbc/autodispatches/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "LPo0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements com.avito.android.arch.mvi.b<InterfaceC14819c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sbc.autodispatches.m f258935a;

    @Inject
    public f(@Y61.k com.avito.android.sbc.autodispatches.m mVar) {
        this.f258935a = mVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC14819c> a() {
        return this.f258935a.a(false);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        this.f258935a.b();
        return G0.f406611a;
    }
}
