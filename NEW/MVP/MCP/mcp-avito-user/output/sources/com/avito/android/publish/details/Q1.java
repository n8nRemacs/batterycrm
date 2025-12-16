package com.avito.android.publish.details;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PublishDetailsViewModel.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUV0/a;", "Lcom/avito/conveyor_item/a;", "dataSource", "Lkotlin/G0;", "invoke", "(LUV0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class Q1 extends kotlin.jvm.internal.N implements Y41.l<UV0.a<? extends com.avito.conveyor_item.a>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K1 f233156l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1(K1 k12) {
        super(1);
        this.f233156l = k12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(UV0.a<? extends com.avito.conveyor_item.a> aVar) {
        int i12;
        UV0.a<? extends com.avito.conveyor_item.a> aVar2 = aVar;
        UV0.b bVarB = com.avito.konveyor.util.g.b(aVar2);
        Iterator<T> it = bVarB.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            Object next = it.next();
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.conveyor_item.a aVar3 = (com.avito.conveyor_item.a) next;
            if ((aVar3 instanceof ItemWithState) && !(((ItemWithState) aVar3).getF173943c() instanceof ItemWithState.State.Normal)) {
                break;
            }
            i13++;
        }
        K1 k12 = this.f233156l;
        String strC = k12.f232980c0.c();
        if (strC != null) {
            i12 = 0;
            for (Object obj : bVarB) {
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                if (kotlin.jvm.internal.L.f(((com.avito.conveyor_item.a) obj).getF128578h(), strC)) {
                    break;
                }
                i12++;
            }
            i12 = -1;
        } else {
            i12 = -1;
        }
        if (i12 != -1) {
            k12.qe(i12, false);
        } else if (!k12.f232993p0 || i13 == -1) {
            k12.f232992o0 = i13;
        } else {
            k12.qe(i13, aVar2.getItem(i13) instanceof ParameterElement.y);
        }
        return kotlin.G0.f406611a;
    }
}
