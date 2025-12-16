package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.iac_avcalls.public_module.models.AvCallsCallState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.init.OnCreateAvCallsOutgoingCallSuccessAction;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AvCallsBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30846n extends kotlin.jvm.internal.N implements Y41.l<AvCallsCallState, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacBootstrap.a f165395l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AvCallsBootstrap f165396m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30846n(IacBootstrap.a aVar, AvCallsBootstrap avCallsBootstrap) {
        super(1);
        this.f165395l = aVar;
        this.f165396m = avCallsBootstrap;
    }

    @Override // Y41.l
    public final G0 invoke(AvCallsCallState avCallsCallState) {
        this.f165395l.a(new OnCreateAvCallsOutgoingCallSuccessAction(C30853v.a(avCallsCallState, this.f165396m.deepLinkFactory)));
        return G0.f406611a;
    }
}
