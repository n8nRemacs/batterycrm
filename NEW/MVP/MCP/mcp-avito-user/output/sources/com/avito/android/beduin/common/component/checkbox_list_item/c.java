package com.avito.android.beduin.common.component.checkbox_list_item;

import Y41.p;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCheckboxListItemComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "index", "Lcom/avito/android/beduin/common/container/componentsPool/k;", "recycledComponent", "Lkotlin/G0;", "invoke", "(ILcom/avito/android/beduin/common/container/componentsPool/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements p<Integer, com.avito.android.beduin.common.container.componentsPool.k, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f100982l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar) {
        super(2);
        this.f100982l = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, com.avito.android.beduin.common.container.componentsPool.k kVar) {
        int iIntValue = num.intValue();
        com.avito.android.beduin.common.container.componentsPool.k kVar2 = kVar;
        Integer interItemSpacing = this.f100982l.f100975e.getContent().getInterItemSpacing();
        Integer num2 = null;
        if (interItemSpacing != null) {
            Integer numValueOf = Integer.valueOf(y6.d(interItemSpacing.intValue()));
            if (iIntValue != 0) {
                num2 = numValueOf;
            }
        }
        D6.c(kVar2.f103016b.getF103243b(), null, Integer.valueOf(num2 != null ? num2.intValue() : 0), null, null, 13);
        return G0.f406611a;
    }
}
