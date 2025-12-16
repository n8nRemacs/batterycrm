package com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.di;

import com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.p;
import com.avito.android.tariff_lf_constructor.configure.level.deeplink.TariffConfigureLevelLink;
import com.avito.android.tariff_lf_constructor.configure.setting.deeplink.TariffConfigureSettingLink;
import com.avito.android.tariff_lf_constructor.configure.vertical.deeplink.TariffConfigureVerticalLink;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import lD0.C43622a;
import lv.C43834a;

/* compiled from: TariffConstructorMappingModule_ProvideTariffConstructorDeeplinkMappingsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<Set<C43834a>> {

    /* renamed from: a, reason: collision with root package name */
    public final p f299573a;

    public g(p pVar) {
        this.f299573a = pVar;
    }

    public static Set a(p pVar) {
        f.f299572a.getClass();
        n0 n0Var = m0.f406844a;
        Set setL0 = C42756l.l0(new C43834a[]{f.a(n0Var.b(TariffConfigureLevelLink.class), new C43622a(), pVar), f.a(n0Var.b(TariffConfigureSettingLink.class), new AD0.a(), pVar), f.a(n0Var.b(TariffConfigureVerticalLink.class), new FD0.a(), pVar)});
        t.d(setL0);
        return setL0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f299573a);
    }
}
