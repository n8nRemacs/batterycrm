package com.avito.android.bbl.screens.configure.v4.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.bbl.screens.configure.v4.mvi.entity.BblConfigureV4InternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BblConfigureV4Bootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v4/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements com.avito.android.arch.mvi.b<BblConfigureV4InternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bbl.screens.configure.v4.mvi.domain.a f99491a;

    @Inject
    public e(@Y61.k com.avito.android.bbl.screens.configure.v4.mvi.domain.a aVar) {
        this.f99491a = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<BblConfigureV4InternalAction> a() {
        return this.f99491a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
