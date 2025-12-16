package com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConstructorSettingPackageItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/setting/items/tariff_package/f;", "Lcom/avito/android/tariff_lf_constructor/configure/setting/items/tariff_package/d;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f300116b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f300117c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f300116b = cVar;
        this.f300117c = cVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (a) aVar);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.d
    @k
    /* renamed from: c5, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF300117c() {
        return this.f300117c;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null) {
            k(hVar, aVar2);
        } else {
            hVar.setLoading(bundle.getBoolean("loading"));
        }
    }

    public final void k(@k h hVar, @k a aVar) {
        hVar.JR(aVar.f300103d);
        hVar.GD(aVar.f300104e);
        hVar.SR(aVar.f300105f);
        hVar.v6(aVar.f300106g);
        hVar.F6(aVar.f300107h);
        hVar.Rz(aVar.f300108i);
        hVar.kx(new e(this, aVar));
        hVar.setLoading(aVar.f300109j);
    }
}
