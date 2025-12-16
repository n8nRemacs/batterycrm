package org.koin.core.definition;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import w71.InterfaceC49462a;

/* compiled from: BeanDefinition.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*>\u0010\u0005\u001a\u0004\b\u0000\u0010\u0000\"\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u00042\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0004*\n\u0010\u0007\"\u00020\u00062\u00020\u0006¨\u0006\b"}, d2 = {"T", "Lkotlin/Function2;", "Lorg/koin/core/scope/a;", "Lv71/a;", "Lkotlin/w;", "Definition", "", "IndexKey", "koin-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    @k
    public static final String a(@k kotlin.reflect.d<?> dVar, @l InterfaceC49462a interfaceC49462a, @k InterfaceC49462a interfaceC49462a2) {
        String value;
        if (interfaceC49462a == null || (value = interfaceC49462a.getValue()) == null) {
            value = "";
        }
        return A71.b.a(dVar) + ':' + value + ':' + interfaceC49462a2;
    }
}
