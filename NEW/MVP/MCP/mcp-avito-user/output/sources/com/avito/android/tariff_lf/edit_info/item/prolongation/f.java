package com.avito.android.tariff_lf.edit_info.item.prolongation;

import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffProlongationItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/prolongation/f;", "Lcom/avito/android/tariff_lf/edit_info/item/prolongation/d;", "<init>", "()V", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<a> f299051b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public AttributedText f299052c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public AttributedText f299053d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f299054e;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f299051b = cVar;
        this.f299054e = cVar;
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.prolongation.d
    @Y61.k
    /* renamed from: G2, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF299054e() {
        return this.f299054e;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (a) aVar);
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
        if (bundle.containsKey("payload")) {
            TariffProlongationPayload tariffProlongationPayload = (TariffProlongationPayload) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("payload", TariffProlongationPayload.class) : bundle.getParcelable("payload"));
            if ((tariffProlongationPayload != null ? tariffProlongationPayload.f299034c : null) != null) {
                boolean zBooleanValue = tariffProlongationPayload.f299034c.booleanValue();
                aVar2.f299039f = zBooleanValue;
                hVar.xt(zBooleanValue ? this.f299052c : this.f299053d);
                hVar.pM(zBooleanValue);
            }
            if ((tariffProlongationPayload != null ? tariffProlongationPayload.f299033b : null) != null) {
                hVar.TB(tariffProlongationPayload.f299033b.booleanValue());
                hVar.xt(aVar2.f299039f ? this.f299052c : this.f299053d);
            }
        }
    }

    public final void k(@Y61.k h hVar, @Y61.k a aVar) {
        this.f299052c = aVar.f299038e;
        this.f299053d = aVar.f299041h;
        hVar.setTitle(aVar.f299036c);
        hVar.TB(aVar.f299040g);
        boolean z12 = aVar.f299039f;
        aVar.f299039f = z12;
        hVar.xt(z12 ? this.f299052c : this.f299053d);
        hVar.pM(z12);
        hVar.a(new e(this, aVar, hVar));
    }
}
