package com.avito.android.screens.bbip_v2.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction;
import hh.InterfaceC40933a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BbipV2Bootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements com.avito.android.arch.mvi.b<BbipV2InternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f261528a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.screens.bbip_v2.domain.a f261529b;

    @Inject
    public e(@InterfaceC40933a @Y61.k String str, @Y61.k com.avito.android.screens.bbip_v2.domain.a aVar) {
        this.f261528a = str;
        this.f261529b = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<BbipV2InternalAction> a() {
        return this.f261529b.a(this.f261528a);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
