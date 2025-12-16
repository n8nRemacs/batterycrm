package com.avito.beduin.v2.component.common.utils;

import Y41.p;
import com.avito.beduin.v2.engine.component.InterfaceC36241a;
import fU0.AbstractC40338a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CommonBaseStateReader.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/engine/component/a;", "", "it", "LfU0/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/a;I)LfU0/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements p<InterfaceC36241a, Integer, AbstractC40338a> {

    /* renamed from: l, reason: collision with root package name */
    public static final g f335713l = new g();

    public g() {
        super(2);
    }

    @Override // Y41.p
    public final AbstractC40338a invoke(InterfaceC36241a interfaceC36241a, Integer num) {
        int iIntValue = num.intValue();
        return (AbstractC40338a) interfaceC36241a.m(iIntValue, f.f335712l, String.valueOf(iIntValue));
    }
}
