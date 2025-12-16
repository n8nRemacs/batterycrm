package com.avito.android.tariff_lf_constructor.configure.size.items.size;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConfigureSizeItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/size/items/size/f;", "Lcom/avito/android/tariff_lf_constructor/configure/size/items/size/d;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f300320b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f300321c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f300320b = cVar;
        this.f300321c = cVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (a) aVar);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.items.size.d
    @k
    /* renamed from: P2, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF300321c() {
        return this.f300321c;
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
        if (!(obj instanceof Bundle)) {
            obj = null;
        }
        Bundle bundle = (Bundle) obj;
        if (bundle == null) {
            k(hVar, aVar2);
            return;
        }
        if (bundle.containsKey("selected")) {
            boolean z12 = bundle.getBoolean("selected");
            hVar.setSelected(z12);
            if (z12) {
                hVar.n0(aVar2.f300307e);
                hVar.g(aVar2.f300308f);
            } else {
                if (!aVar2.f300310h) {
                    hVar.n0(null);
                }
                hVar.g(null);
            }
        }
        if (bundle.containsKey("loading")) {
            hVar.K4(bundle.getBoolean("loading"));
        }
    }

    public final void k(@k h hVar, @k a aVar) {
        hVar.setTitle(aVar.f300306d);
        boolean z12 = aVar.f300311i;
        String str = aVar.f300307e;
        if (z12) {
            hVar.n0(str);
            hVar.g(aVar.f300308f);
        } else {
            if (aVar.f300310h) {
                hVar.n0(str);
            } else {
                hVar.n0(null);
            }
            hVar.g(null);
        }
        hVar.K4(aVar.f300312j);
        hVar.setSelected(z12);
        hVar.p3(new e(this, aVar));
    }
}
