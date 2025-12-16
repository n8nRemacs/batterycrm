package com.avito.android.tariff_lf_constructor.configure.size;

import com.avito.android.lib.design.button.Button;
import com.avito.android.tariff_lf_constructor.configure.common.ui.PriceDotsView;
import com.avito.android.tariff_lf_constructor.configure.setting.items.model.ConfigureAttributeModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;
import qK0.C47313c;

/* compiled from: ConstructorConfigureSizeFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/size/ui/h;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/tariff_lf_constructor/configure/size/ui/h;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements Y41.l<com.avito.android.tariff_lf_constructor.configure.size.ui.h, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConstructorConfigureSizeFragment f300265l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ConstructorConfigureSizeFragment constructorConfigureSizeFragment) {
        super(1);
        this.f300265l = constructorConfigureSizeFragment;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.tariff_lf_constructor.configure.size.ui.h hVar) {
        com.avito.android.tariff_lf_constructor.configure.size.ui.h hVar2 = hVar;
        ConstructorConfigureSizeFragment constructorConfigureSizeFragment = this.f300265l;
        C47313c c47313c = constructorConfigureSizeFragment.f300241A0;
        n<Object>[] nVarArr = ConstructorConfigureSizeFragment.f300240H0;
        n<Object> nVar = nVarArr[7];
        PriceDotsView priceDotsView = (PriceDotsView) c47313c.a();
        ConfigureAttributeModel configureAttributeModel = hVar2.f300339a;
        priceDotsView.setTitle(configureAttributeModel != null ? configureAttributeModel.f300086b : null);
        n<Object> nVar2 = nVarArr[7];
        PriceDotsView priceDotsView2 = (PriceDotsView) c47313c.a();
        ConfigureAttributeModel configureAttributeModel2 = hVar2.f300339a;
        priceDotsView2.setValue(configureAttributeModel2 != null ? configureAttributeModel2.f300087c : null);
        C47313c c47313c2 = constructorConfigureSizeFragment.f300242B0;
        n<Object> nVar3 = nVarArr[8];
        PriceDotsView priceDotsView3 = (PriceDotsView) c47313c2.a();
        ConfigureAttributeModel configureAttributeModel3 = hVar2.f300340b;
        priceDotsView3.setTitle(configureAttributeModel3 != null ? configureAttributeModel3.f300086b : null);
        n<Object> nVar4 = nVarArr[8];
        ((PriceDotsView) c47313c2.a()).setValue(configureAttributeModel3 != null ? configureAttributeModel3.f300087c : null);
        n<Object> nVar5 = nVarArr[8];
        ((PriceDotsView) c47313c2.a()).setOldValue(configureAttributeModel3 != null ? configureAttributeModel3.f300088d : null);
        C47313c c47313c3 = constructorConfigureSizeFragment.f300243C0;
        n<Object> nVar6 = nVarArr[9];
        PriceDotsView priceDotsView4 = (PriceDotsView) c47313c3.a();
        ConfigureAttributeModel configureAttributeModel4 = hVar2.f300341c;
        priceDotsView4.setTitle(configureAttributeModel4.f300086b);
        n<Object> nVar7 = nVarArr[9];
        ((PriceDotsView) c47313c3.a()).setValue(configureAttributeModel4.f300087c);
        C47313c c47313c4 = constructorConfigureSizeFragment.f300244D0;
        n<Object> nVar8 = nVarArr[10];
        ((Button) c47313c4.a()).setText(hVar2.f300342d.getTitle());
        return G0.f406611a;
    }
}
