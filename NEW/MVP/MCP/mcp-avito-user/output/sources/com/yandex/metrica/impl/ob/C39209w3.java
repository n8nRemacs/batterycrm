package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39185v3;

/* renamed from: com.yandex.metrica.impl.ob.w3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39209w3 extends AbstractC39134t0<C39185v3.a> {
    @Override // com.yandex.metrica.impl.ob.AbstractC39134t0
    public boolean a(@Y61.k C39185v3.a aVar, @Y61.k C39185v3.a aVar2) {
        if (!A2.b(aVar2.b())) {
            if (A2.b(aVar.b())) {
                return false;
            }
            if (aVar.a() == EnumC39158u0.APP) {
                if (kotlin.jvm.internal.L.g(a().a(aVar.a()).intValue(), a().a(aVar2.a()).intValue()) < 0) {
                    return false;
                }
            } else if (kotlin.jvm.internal.L.g(a().a(aVar.a()).intValue(), a().a(aVar2.a()).intValue()) <= 0) {
                return false;
            }
        }
        return true;
    }
}
