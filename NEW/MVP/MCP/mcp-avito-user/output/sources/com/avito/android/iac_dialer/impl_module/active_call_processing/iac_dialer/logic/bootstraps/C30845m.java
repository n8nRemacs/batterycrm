package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.init.OnCreateAvCallsOutgoingCallErrorAction;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AvCallsBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30845m extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacBootstrap.a f165393l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacEvent.AvCalls f165394m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30845m(IacBootstrap.a aVar, IacEvent.AvCalls avCalls) {
        super(1);
        this.f165393l = aVar;
        this.f165394m = avCalls;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        this.f165393l.a(new OnCreateAvCallsOutgoingCallErrorAction(((IacEvent.AvCalls.CreateOutgoingCall) this.f165394m).getCallId()));
        return G0.f406611a;
    }
}
