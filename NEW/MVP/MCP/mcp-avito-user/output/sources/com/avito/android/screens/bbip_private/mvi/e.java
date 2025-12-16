package com.avito.android.screens.bbip_private.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction;
import hh.InterfaceC40933a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BbipPrivateBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements com.avito.android.arch.mvi.b<BbipPrivateInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f260584a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.screens.bbip_private.domain.a f260585b;

    @Inject
    public e(@InterfaceC40933a @Y61.k String str, @Y61.k com.avito.android.screens.bbip_private.domain.a aVar) {
        this.f260584a = str;
        this.f260585b = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<BbipPrivateInternalAction> a() {
        return this.f260585b.a(this.f260584a);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
