package com.avito.android.tariff_lf_constructor.configure.setting.items.total_info;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_lf_constructor.configure.setting.items.model.ConfigureAttributeModel;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConstructorSettingTotalInfotemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/setting/items/total_info/i;", "Lcom/avito/android/tariff_lf_constructor/configure/setting/items/total_info/f;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Boolean> f300161b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f300162c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f300163d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f300164e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f300165f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f300166g;

    @Inject
    public i() {
        com.jakewharton.rxrelay3.c<Boolean> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f300161b = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f300162c = cVar2;
        this.f300163d = cVar;
        this.f300164e = cVar2;
        com.jakewharton.rxrelay3.c<DeepLink> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f300165f = cVar3;
        this.f300166g = cVar3;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.f
    @Y61.k
    /* renamed from: G4, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF300164e() {
        return this.f300164e;
    }

    public final void O(@Y61.k k kVar, @Y61.k c cVar) {
        kVar.setTitle(cVar.f300143b);
        kVar.c1(cVar.f300149h.getTitle());
        kVar.F6(cVar.f300144c);
        kVar.Mu(cVar.f300147f);
        kVar.C40(cVar.f300146e);
        kVar.Fx(cVar.f300145d);
        kVar.Hv(cVar.f300148g);
        kVar.S40(cVar.f300150i);
        kVar.l70(new g(cVar, this));
        kVar.W50(new h(this));
        AttributedText attributedText = cVar.f300151j;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.tariff.cpa.configure_info.items.feature.e(this, 4));
        }
        kVar.OK(attributedText);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        O((k) eVar, (c) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        k kVar = (k) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null) {
            O(kVar, cVar);
            return;
        }
        int i13 = Build.VERSION.SDK_INT;
        ConfigureAttributeModel configureAttributeModel = (ConfigureAttributeModel) (i13 >= 33 ? (Parcelable) bundle.getParcelable("discount", ConfigureAttributeModel.class) : bundle.getParcelable("discount"));
        ConfigureAttributeModel configureAttributeModel2 = (ConfigureAttributeModel) (i13 >= 33 ? (Parcelable) bundle.getParcelable("totalPrice", ConfigureAttributeModel.class) : bundle.getParcelable("totalPrice"));
        ConfigureAttributeModel configureAttributeModel3 = (ConfigureAttributeModel) (i13 >= 33 ? (Parcelable) bundle.getParcelable("levelPrice", ConfigureAttributeModel.class) : bundle.getParcelable("levelPrice"));
        ConfigureAttributeModel configureAttributeModel4 = (ConfigureAttributeModel) (i13 >= 33 ? (Parcelable) bundle.getParcelable("packagesPrice", ConfigureAttributeModel.class) : bundle.getParcelable("packagesPrice"));
        Parcelable parcelable = i13 >= 33 ? (Parcelable) bundle.getParcelable("bonus", AttributedText.class) : bundle.getParcelable("bonus");
        kVar.F6(configureAttributeModel);
        kVar.Mu(configureAttributeModel2);
        kVar.C40(configureAttributeModel3);
        kVar.Fx(configureAttributeModel4);
        kVar.Hv((AttributedText) parcelable);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.f
    @Y61.k
    /* renamed from: h5, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF300163d() {
        return this.f300163d;
    }

    @Override // com.avito.android.deep_linking.K
    @Y61.k
    public final z<DeepLink> k() {
        return this.f300166g;
    }
}
