package com.avito.android.publish.details;

import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.util.InterfaceC35745a5;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PublishDetailsSlotValidator.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class G1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Set<com.avito.android.category_parameters.j<? extends Slot<?>>> f232935l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C33806y1 f232936m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f232937n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G1(Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set, C33806y1 c33806y1, Y41.a<kotlin.G0> aVar) {
        super(0);
        this.f232935l = set;
        this.f232936m = c33806y1;
        this.f232937n = aVar;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        Set<com.avito.android.category_parameters.j<? extends Slot<?>>> set = this.f232935l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof com.avito.android.publish.slots.iac_devices.b) {
                arrayList.add(obj);
            }
        }
        if (((com.avito.android.publish.slots.iac_devices.b) C42745f0.G(arrayList)) != null) {
            C33806y1 c33806y1 = this.f232936m;
            c33806y1.f235096f.get().B9(new PublishDetailsFlowTracker.FlowContext[0]);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC35745a5 interfaceC35745a5 = c33806y1.f235092b;
            io.reactivex.rxjava3.internal.operators.single.S s5 = io.reactivex.rxjava3.core.I.C(250L, timeUnit, interfaceC35745a5.c()).s(interfaceC35745a5.e());
            Y41.a<kotlin.G0> aVar = this.f232937n;
            c33806y1.f235097g.b(io.reactivex.rxjava3.kotlin.A1.e(s5, new E1(aVar), new F1(aVar)));
        }
        return kotlin.G0.f406611a;
    }
}
