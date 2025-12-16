package com.avito.android.preloading.coroutines.mvi;

import Y61.k;
import Y61.l;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.preloading.coroutines.s;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BootstrapPreloadable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/preloading/coroutines/mvi/d;", "", "InternalAction", "Lcom/avito/android/arch/mvi/b;", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class d<InternalAction> implements com.avito.android.arch.mvi.b<InternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AbstractC33302a<G0, InternalAction> f221834a;

    public d(@k AbstractC33302a<G0, InternalAction> abstractC33302a) {
        this.f221834a = abstractC33302a;
    }

    @Override // com.avito.android.arch.mvi.b
    @k
    public final InterfaceC43160i<InternalAction> a() {
        return s.a(this.f221834a, G0.f406611a);
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
