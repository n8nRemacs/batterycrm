package com.avito.android.bbl.screens.configure.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.bbl.screens.configure.mvi.entity.BblConfigureInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;
import nh.InterfaceC44422a;

/* compiled from: BblConfigureBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements com.avito.android.arch.mvi.b<BblConfigureInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bbl.screens.configure.mvi.domain.a f99212a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f99213b;

    @Inject
    public e(@Y61.k com.avito.android.bbl.screens.configure.mvi.domain.a aVar, @InterfaceC44422a @Y61.k String str) {
        this.f99212a = aVar;
        this.f99213b = str;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<BblConfigureInternalAction> a() {
        return this.f99212a.a(this.f99213b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
