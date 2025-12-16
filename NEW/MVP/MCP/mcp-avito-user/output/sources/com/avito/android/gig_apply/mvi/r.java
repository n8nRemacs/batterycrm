package com.avito.android.gig_apply.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.gig_apply.ui.GigSlotOpenParams;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GigSlotBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_apply/mvi/r;", "Lcom/avito/android/arch/mvi/b;", "LpH/k;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class r implements com.avito.android.arch.mvi.b<pH.k> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final GigSlotOpenParams f159777a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_apply.domain.h f159778b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f159779c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SK0.b f159780d;

    @Inject
    public r(@Y61.k GigSlotOpenParams gigSlotOpenParams, @Y61.k com.avito.android.gig_apply.domain.h hVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k SK0.b bVar) {
        this.f159777a = gigSlotOpenParams;
        this.f159778b = hVar;
        this.f159779c = aVar;
        this.f159780d = bVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<pH.k> a() {
        return C43175k.N(this.f159778b.b(this.f159777a.f159882b), C43175k.C(new q(this, null), kotlinx.coroutines.rx3.y.a(this.f159779c.d9())));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
