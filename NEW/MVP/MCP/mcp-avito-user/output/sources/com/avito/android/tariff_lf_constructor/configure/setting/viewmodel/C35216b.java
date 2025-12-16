package com.avito.android.tariff_lf_constructor.configure.setting.viewmodel;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_lf_constructor.configure.setting.items.model.ConfigureAttributeModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import wD0.C49487a;
import wD0.C49489c;

/* compiled from: ConstructorSettingConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/setting/viewmodel/b;", "Lcom/avito/android/tariff_lf_constructor/configure/setting/viewmodel/a;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35216b implements InterfaceC35215a {
    @Inject
    public C35216b() {
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.InterfaceC35215a
    @Y61.k
    public final BD0.d a(@Y61.k wD0.e eVar) {
        int i12 = 0;
        ArrayList arrayListE0 = C42745f0.e0(new com.avito.android.tariff_lf_constructor.configure.header_item.a("header_item", eVar.getTitle(), eVar.getDescription()));
        List<C49489c> listE = eVar.e();
        if (listE != null) {
            List<C49489c> list = listE;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                C49489c c49489c = (C49489c) obj;
                String strG = AK.c.g(i12, "package_item");
                String id2 = c49489c.getId();
                String category = c49489c.getCategory();
                String subcategories = c49489c.getSubcategories();
                String locations = c49489c.getLocations();
                String size = c49489c.getSize();
                C49487a discount = c49489c.getDiscount();
                ConfigureAttributeModel configureAttributeModel = discount != null ? new ConfigureAttributeModel(discount.getTitle(), discount.getValue(), null, 4, null) : null;
                C49487a price = c49489c.getPrice();
                arrayList.add(new com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a(strG, id2, category, subcategories, locations, size, configureAttributeModel, price != null ? new ConfigureAttributeModel(price.getTitle(), price.getValue(), null, 4, null) : null, false, 256, null));
                i12 = i13;
            }
            arrayListE0.addAll(arrayList);
        }
        ButtonAction button = eVar.getButton();
        if (button != null) {
            arrayListE0.add(new com.avito.android.tariff_lf_constructor.configure.setting.items.placing.a(button));
        }
        wD0.d totalInfo = eVar.getTotalInfo();
        if (totalInfo != null) {
            String title = totalInfo.getTitle();
            ButtonAction button2 = totalInfo.getButton();
            AttributedText bonus = totalInfo.getBonus();
            C49487a discount2 = totalInfo.getDiscount();
            ConfigureAttributeModel configureAttributeModel2 = discount2 != null ? new ConfigureAttributeModel(discount2.getTitle(), discount2.getValue(), null, 4, null) : null;
            C49487a packagesPrice = totalInfo.getPackagesPrice();
            ConfigureAttributeModel configureAttributeModel3 = packagesPrice != null ? new ConfigureAttributeModel(packagesPrice.getTitle(), packagesPrice.getValue(), null, 4, null) : null;
            C49487a levelPrice = totalInfo.getLevelPrice();
            ConfigureAttributeModel configureAttributeModel4 = levelPrice != null ? new ConfigureAttributeModel(levelPrice.getTitle(), levelPrice.getValue(), null, 4, null) : null;
            C49487a totalPrice = totalInfo.getTotalPrice();
            arrayListE0.add(new com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c(title, configureAttributeModel2, configureAttributeModel3, configureAttributeModel4, totalPrice != null ? new ConfigureAttributeModel(totalPrice.getTitle(), totalPrice.getValue(), null, 4, null) : null, bonus, button2, totalInfo.getAutoProlong(), totalInfo.getOffer()));
        }
        return new BD0.d(eVar.getHeaderTitle(), eVar.getConfigureContext(), arrayListE0);
    }
}
