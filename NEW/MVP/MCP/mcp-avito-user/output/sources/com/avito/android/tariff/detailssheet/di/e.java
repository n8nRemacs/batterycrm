package com.avito.android.tariff.detailssheet.di;

import com.avito.android.tariff.deeplink.CpaConfigureServicesLink;
import com.avito.android.tariff.detailssheet.k;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.m0;
import lv.C43834a;

/* compiled from: TariffDetailsSheetMappingModule_ProvideTariffDetailsSheetDeeplinkMappingsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<Set<C43834a>> {

    /* renamed from: a, reason: collision with root package name */
    public final k f297419a;

    public e(k kVar) {
        this.f297419a = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set a(k kVar) {
        d.f297418a.getClass();
        kotlin.reflect.d dVarB = m0.f406844a.b(CpaConfigureServicesLink.class);
        InterfaceC42819t interfaceC42819t = (InterfaceC42819t) dVarB;
        return Collections.singleton(new C43834a(interfaceC42819t.f(), new PB0.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(interfaceC42819t.f()), kVar)));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f297419a);
    }
}
