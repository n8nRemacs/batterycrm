package com.avito.android.tariff_lf_constructor.configure.size.viewmodel;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_lf_constructor.configure.setting.items.model.ConfigureAttributeModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import wD0.C49487a;
import xD0.C49821a;
import xD0.C49822b;
import xD0.C49823c;
import xD0.C49824d;
import yD0.C50102a;

/* compiled from: ConstructorConfigureSizeConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/size/viewmodel/b;", "Lcom/avito/android/tariff_lf_constructor/configure/size/viewmodel/a;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.tariff_lf_constructor.configure.size.viewmodel.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35225b implements InterfaceC35224a {
    @Inject
    public C35225b() {
    }

    public static com.avito.android.tariff_lf_constructor.configure.size.ui.h c(C49824d c49824d) {
        C49487a discount = c49824d.getDiscount();
        ConfigureAttributeModel configureAttributeModel = discount != null ? new ConfigureAttributeModel(discount.getTitle(), discount.getValue(), null, 4, null) : null;
        C49487a price = c49824d.getPrice();
        ConfigureAttributeModel configureAttributeModel2 = new ConfigureAttributeModel(price.getTitle(), price.getValue(), null, 4, null);
        xD0.e pubPrice = c49824d.getPubPrice();
        return new com.avito.android.tariff_lf_constructor.configure.size.ui.h(configureAttributeModel, pubPrice != null ? new ConfigureAttributeModel(pubPrice.getTitle(), pubPrice.getValue(), pubPrice.getOldValue()) : null, configureAttributeModel2, c49824d.getButton());
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.InterfaceC35224a
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.size.ui.g a(@Y61.k C50102a c50102a) {
        return new com.avito.android.tariff_lf_constructor.configure.size.ui.g(c50102a.getInfo(), c(c50102a.getCountPrice()));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.InterfaceC35224a
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.size.ui.a b(@Y61.k C49823c c49823c) {
        boolean z12;
        ArrayList arrayList = new ArrayList();
        List<C49821a> listD = c49823c.d();
        int i12 = 0;
        if ((listD instanceof Collection) && listD.isEmpty()) {
            z12 = false;
        } else {
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                if (((C49821a) it.next()).getCountPrice() == null) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        }
        boolean z13 = !z12;
        List<C49821a> listD2 = c49823c.d();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listD2, 10));
        for (Object obj : listD2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            C49821a c49821a = (C49821a) obj;
            String strG = AK.c.g(i12, "size_item");
            String id2 = c49821a.getId();
            String title = c49821a.getTitle();
            boolean isSelected = c49821a.getIsSelected();
            C49822b info = c49821a.getInfo();
            String title2 = info != null ? info.getTitle() : null;
            C49822b info2 = c49821a.getInfo();
            AttributedText description = info2 != null ? info2.getDescription() : null;
            C49824d countPrice = c49821a.getCountPrice();
            arrayList2.add(new com.avito.android.tariff_lf_constructor.configure.size.items.size.a(strG, id2, title, title2, description, countPrice != null ? c(countPrice) : null, z13, isSelected, false, 256, null));
            i12 = i13;
        }
        C42745f0.h(arrayList2, arrayList);
        return new com.avito.android.tariff_lf_constructor.configure.size.ui.a(new com.avito.android.tariff_lf_constructor.configure.size.ui.b(c49823c.getHeaderTitle(), c49823c.getTitle(), c49823c.getDescription()), arrayList, c49823c.getAlertInfo());
    }
}
