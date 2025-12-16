package com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.di;

import com.avito.android.tariff_lf_constructor.configure.category.deeplink.TariffConfigureCategoryLink;
import com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.n;
import com.avito.android.tariff_lf_constructor.configure.locations.deeplink.TariffConfigureLocationsLink;
import com.avito.android.tariff_lf_constructor.configure.size.deeplink.TariffConfigureSizeLink;
import com.avito.android.tariff_lf_constructor.configure.subcategories.deeplink.TariffConfigureSubCategoriesLink;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import eD0.C39991a;
import java.util.Set;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import lv.C43834a;
import nD0.C44238a;

/* compiled from: TariffConstructorBottomSheetMappingModule_ProvideTariffBottomSheetDeeplinkMappingsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<Set<C43834a>> {

    /* renamed from: a, reason: collision with root package name */
    public final n f299571a;

    public e(n nVar) {
        this.f299571a = nVar;
    }

    public static Set a(n nVar) {
        d.f299570a.getClass();
        n0 n0Var = m0.f406844a;
        Set setL0 = C42756l.l0(new C43834a[]{d.a(n0Var.b(TariffConfigureSubCategoriesLink.class), new DD0.a(), nVar), d.a(n0Var.b(TariffConfigureCategoryLink.class), new C39991a(), nVar), d.a(n0Var.b(TariffConfigureSizeLink.class), new CD0.a(), nVar), d.a(n0Var.b(TariffConfigureLocationsLink.class), new C44238a(), nVar)});
        t.d(setL0);
        return setL0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f299571a);
    }
}
