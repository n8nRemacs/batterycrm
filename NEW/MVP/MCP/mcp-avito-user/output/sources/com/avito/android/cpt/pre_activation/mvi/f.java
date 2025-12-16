package com.avito.android.cpt.pre_activation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.cpt.pre_activation.data.PreActivationData;
import com.avito.android.cpt.pre_activation.mvi.entity.PreActivationInternalAction;
import fv.C40482a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PreActivationBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/pre_activation/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements com.avito.android.arch.mvi.b<PreActivationInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PreActivationData f126737a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f126738b;

    @Inject
    public f(@Y61.k PreActivationData preActivationData, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f126737a = preActivationData;
        this.f126738b = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PreActivationInternalAction> a() {
        return C43175k.N(new C43210w(new PreActivationInternalAction.Content(this.f126737a)), C43175k.D(new e(new d(C40482a.b(this.f126738b)))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
