package com.avito.android.publish.details;

import com.avito.android.publish.details.K1;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.util.P2;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: PublishDetailsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.details.x0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33802x0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PublishDetailsFragment f235084l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K1.AbstractC33668b.i f235085m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33802x0(PublishDetailsFragment publishDetailsFragment, K1.AbstractC33668b.i iVar) {
        super(0);
        this.f235084l = publishDetailsFragment;
        this.f235085m = iVar;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        io.reactivex.rxjava3.core.z<P2<kotlin.G0>> zVarH;
        K1 k12 = this.f235084l.f233086C0;
        Object obj = null;
        if (k12 == null) {
            k12 = null;
        }
        SlotType slotType = this.f235085m.f233034c;
        Iterator<T> it = k12.f232996s0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((com.avito.android.category_parameters.j) next).g().getSlotType() == slotType) {
                obj = next;
                break;
            }
        }
        com.avito.android.category_parameters.j jVar = (com.avito.android.category_parameters.j) obj;
        if (jVar == null || (zVarH = jVar.h()) == null) {
            zVarH = io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
        }
        k12.f232990m0.b(zVarH.j0(k12.f232962K.e()).t0(new U1(k12, slotType)));
        return kotlin.G0.f406611a;
    }
}
