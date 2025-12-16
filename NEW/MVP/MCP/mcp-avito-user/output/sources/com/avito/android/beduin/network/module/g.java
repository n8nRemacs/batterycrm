package com.avito.android.beduin.network.module;

import Ti.InterfaceC15365a;
import Ui.InterfaceC15524c;
import ai.InterfaceC19892b;
import com.avito.android.beduin.common.component.conditional_group.component.Condition;
import com.avito.android.beduin.common.component.conditional_group.component.FalseCondition;
import com.avito.android.beduin.common.component.file_uploader.ValidationRule;
import com.avito.android.beduin.common.component.model.BeduinLayoutSize;
import com.avito.android.beduin.common.component.selection_group.BeduinSelectionGroupModel;
import com.avito.android.beduin.common.container.card_item.BeduinCardItemContainerModel;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.beduin.network.model.Constraint;
import com.avito.android.beduin.network.model.LabelToken;
import com.avito.android.beduin.network.parse.BeduinAttributedTextPairAdapterFactory;
import com.avito.android.beduin.network.parse.BeduinCheckboxGroupAggregatorAdapterFactory;
import com.avito.android.beduin.network.parse.BeduinCheckboxGroupOptionAdapterFactory;
import com.avito.android.beduin.network.parse.BeduinFormAdapterFactory;
import com.avito.android.beduin.network.parse.BeduinSelectStringParametersAdapterFactory;
import com.avito.android.beduin.network.parse.BeduinUniversalPageContentAdapterFactory;
import com.avito.android.beduin.network.parse.ParamsSourceFormParamsMapAdapterFactory;
import com.avito.android.beduin.network.parse.ParamsSourceGroupByValuesAdapterFactory;
import com.avito.android.beduin.network.parse.SkipToFieldTypeAdapter;
import com.avito.android.beduin.network.parse.SkipToFieldTypeAndGenModelIdAdapter;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.model.action.custom.openItemsList.AdditionalData;
import com.avito.android.beduin_shared.model.form.ParamsSource;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import gi.C40685a;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Provider;
import kotlin.G0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.InterfaceC42819t;
import vi.InterfaceC49334c;
import wi.InterfaceC49629e;

/* compiled from: BeduinOptimalJsonModule_ProvideBeduinTypeAdapterFactoriesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C40685a> f104030a;

    public g(Provider<C40685a> provider) {
        this.f104030a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Iterator it;
        SkipToFieldTypeAdapter skipToFieldTypeAdapter;
        Iterator it2;
        SkipToFieldTypeAdapter skipToFieldTypeAdapter2;
        C40685a c40685a = this.f104030a.get();
        e.f104028a.getClass();
        SkipToFieldTypeAndGenModelIdAdapter skipToFieldTypeAndGenModelIdAdapter = new SkipToFieldTypeAndGenModelIdAdapter();
        SkipToFieldTypeAdapter skipToFieldTypeAdapter3 = new SkipToFieldTypeAdapter(BeduinAction.class, "params");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter4 = new SkipToFieldTypeAdapter(DisplayingPredicate.class, "value");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter5 = new SkipToFieldTypeAdapter(Condition.class, "value");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter6 = new SkipToFieldTypeAdapter(ParamsSource.class, "value");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter7 = new SkipToFieldTypeAdapter(BeduinModelTransform.class, "params");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter8 = skipToFieldTypeAdapter6;
        SkipToFieldTypeAdapter skipToFieldTypeAdapter9 = new SkipToFieldTypeAdapter(NavigationBarItem.class, "content");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter10 = new SkipToFieldTypeAdapter(TabsScreenModel.d.class, "params");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter11 = new SkipToFieldTypeAdapter(TabsScreenModel.c.class, "params");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter12 = new SkipToFieldTypeAdapter(Constraint.class, "value");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter13 = new SkipToFieldTypeAdapter(AdditionalData.class, "value");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter14 = skipToFieldTypeAdapter5;
        SkipToFieldTypeAdapter skipToFieldTypeAdapter15 = new SkipToFieldTypeAdapter(BeduinCardItemContainerModel.SelectionDisplayType.class, "params");
        BeduinAttributedTextPairAdapterFactory beduinAttributedTextPairAdapterFactory = new BeduinAttributedTextPairAdapterFactory();
        BeduinSelectStringParametersAdapterFactory beduinSelectStringParametersAdapterFactory = new BeduinSelectStringParametersAdapterFactory();
        BeduinCheckboxGroupAggregatorAdapterFactory beduinCheckboxGroupAggregatorAdapterFactory = new BeduinCheckboxGroupAggregatorAdapterFactory();
        ParamsSourceFormParamsMapAdapterFactory paramsSourceFormParamsMapAdapterFactory = new ParamsSourceFormParamsMapAdapterFactory();
        ParamsSourceGroupByValuesAdapterFactory paramsSourceGroupByValuesAdapterFactory = new ParamsSourceGroupByValuesAdapterFactory();
        BeduinCheckboxGroupOptionAdapterFactory beduinCheckboxGroupOptionAdapterFactory = new BeduinCheckboxGroupOptionAdapterFactory();
        BeduinUniversalPageContentAdapterFactory beduinUniversalPageContentAdapterFactory = new BeduinUniversalPageContentAdapterFactory();
        BeduinFormAdapterFactory beduinFormAdapterFactory = new BeduinFormAdapterFactory();
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(BeduinLayoutSize.class);
        runtimeTypeAdapterFactory.b(BeduinLayoutSize.WrapContent.class, "wrapContent", null);
        runtimeTypeAdapterFactory.b(BeduinLayoutSize.MatchParent.class, "matchParent", null);
        runtimeTypeAdapterFactory.b(BeduinLayoutSize.Fixed.class, "fixed", null);
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory2 = new RuntimeTypeAdapterFactory(Constraint.class);
        runtimeTypeAdapterFactory2.b(Constraint.Length.class, "length", skipToFieldTypeAdapter12);
        runtimeTypeAdapterFactory2.b(Constraint.NotEmpty.class, "notEmpty", skipToFieldTypeAdapter12);
        runtimeTypeAdapterFactory2.b(Constraint.Regexp.class, "regularExpression", skipToFieldTypeAdapter12);
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory3 = new RuntimeTypeAdapterFactory(AdditionalData.class);
        runtimeTypeAdapterFactory3.b(AdditionalData.PriceDescription.class, "priceDescription", skipToFieldTypeAdapter13);
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory4 = new RuntimeTypeAdapterFactory(BeduinCardItemContainerModel.SelectionDisplayType.class);
        runtimeTypeAdapterFactory4.b(BeduinCardItemContainerModel.SelectionDisplayType.Border.class, "border", skipToFieldTypeAdapter15);
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory5 = new RuntimeTypeAdapterFactory(LabelToken.class);
        runtimeTypeAdapterFactory5.b(LabelToken.TextToken.class, "text", null);
        runtimeTypeAdapterFactory5.b(LabelToken.StorageTextToken.class, "storageText", null);
        runtimeTypeAdapterFactory5.b(LabelToken.LinkToken.class, "link", null);
        runtimeTypeAdapterFactory5.b(LabelToken.DateTimeToken.class, "datetime", null);
        runtimeTypeAdapterFactory5.b(LabelToken.IconToken.class, "icon", null);
        runtimeTypeAdapterFactory5.b(LabelToken.TextIconToken.class, "textIcon", null);
        runtimeTypeAdapterFactory5.b(LabelToken.SpacingToken.class, "spacing", null);
        runtimeTypeAdapterFactory5.b(LabelToken.SalesStrikeThroughToken.class, "salesStrikethrough", null);
        runtimeTypeAdapterFactory5.b(LabelToken.DockingBadgeToken.class, "dockingBadge", null);
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory6 = new RuntimeTypeAdapterFactory(ValidationRule.class);
        runtimeTypeAdapterFactory6.b(ValidationRule.MaxFilesCountRule.class, ValidationRule.MAX_FILES_COUNT_RULE, null);
        runtimeTypeAdapterFactory6.b(ValidationRule.MinFilesCountRule.class, ValidationRule.MIN_FILES_COUNT_RULE, null);
        runtimeTypeAdapterFactory6.b(ValidationRule.FileTypesRule.class, "fileTypes", null);
        runtimeTypeAdapterFactory6.b(ValidationRule.MaxFileSizeRule.class, ValidationRule.MAX_FILE_SIZE_RULE, null);
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory7 = new RuntimeTypeAdapterFactory(BeduinSelectionGroupModel.SelectionType.class);
        runtimeTypeAdapterFactory7.b(BeduinSelectionGroupModel.SelectionType.Single.class, "single", null);
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory8 = new RuntimeTypeAdapterFactory(BeduinModel.class);
        Iterator it3 = c40685a.f396727a.iterator();
        while (it3.hasNext()) {
            com.avito.android.beduin.common.component.b bVar = (com.avito.android.beduin.common.component.b) it3.next();
            for (String str : bVar.a()) {
                Iterator it4 = it3;
                RuntimeTypeAdapterFactory runtimeTypeAdapterFactory9 = runtimeTypeAdapterFactory7;
                if (com.avito.android.beduin.network.parse.a.class.isAssignableFrom(bVar.S())) {
                    runtimeTypeAdapterFactory8.b(bVar.S(), str, null);
                } else {
                    runtimeTypeAdapterFactory8.b(bVar.S(), str, skipToFieldTypeAndGenModelIdAdapter);
                }
                it3 = it4;
                runtimeTypeAdapterFactory7 = runtimeTypeAdapterFactory9;
            }
        }
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory10 = runtimeTypeAdapterFactory7;
        G0 g02 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, BeduinAction.class);
        Iterator it5 = c40685a.f396728b.iterator();
        while (it5.hasNext()) {
            InterfaceC15524c interfaceC15524c = (InterfaceC15524c) it5.next();
            runtimeTypeAdapterFactoryD.b(interfaceC15524c.getAction(), interfaceC15524c.getF99982c(), skipToFieldTypeAdapter3);
        }
        G0 g03 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD2 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, DisplayingPredicate.class);
        Iterator it6 = c40685a.f396729c.iterator();
        while (it6.hasNext()) {
            InterfaceC19892b interfaceC19892b = (InterfaceC19892b) it6.next();
            Class<? extends DisplayingPredicate> clsA = interfaceC19892b.a();
            if (com.avito.android.beduin.network.parse.b.class.isAssignableFrom(clsA)) {
                runtimeTypeAdapterFactoryD2.b(clsA, interfaceC19892b.getF103304b(), null);
            } else {
                runtimeTypeAdapterFactoryD2.b(clsA, interfaceC19892b.getF103304b(), skipToFieldTypeAdapter4);
            }
        }
        G0 g04 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD3 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, BeduinModelTransform.class);
        Iterator it7 = c40685a.f396730d.iterator();
        while (it7.hasNext()) {
            InterfaceC15365a interfaceC15365a = (InterfaceC15365a) it7.next();
            runtimeTypeAdapterFactoryD3.b(interfaceC15365a.a(), interfaceC15365a.getType(), skipToFieldTypeAdapter7);
        }
        G0 g05 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD4 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, Condition.class);
        runtimeTypeAdapterFactoryD4.f254223f = FalseCondition.class;
        Iterator it8 = c40685a.f396731e.iterator();
        while (it8.hasNext()) {
            com.avito.android.beduin.common.component.conditional_group.component.b bVar2 = (com.avito.android.beduin.common.component.conditional_group.component.b) it8.next();
            Class<? extends Condition> value = bVar2.getValue();
            if (com.avito.android.beduin.network.parse.b.class.isAssignableFrom(value)) {
                it2 = it8;
                runtimeTypeAdapterFactoryD4.b(value, bVar2.getF101055b(), null);
                skipToFieldTypeAdapter2 = skipToFieldTypeAdapter14;
            } else {
                it2 = it8;
                String f101055b = bVar2.getF101055b();
                skipToFieldTypeAdapter2 = skipToFieldTypeAdapter14;
                runtimeTypeAdapterFactoryD4.b(value, f101055b, skipToFieldTypeAdapter2);
            }
            skipToFieldTypeAdapter14 = skipToFieldTypeAdapter2;
            it8 = it2;
        }
        G0 g06 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD5 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, ParamsSource.class);
        Iterator it9 = c40685a.f396732f.iterator();
        while (it9.hasNext()) {
            com.avito.android.beduin.common.component.params_source.a aVar = (com.avito.android.beduin.common.component.params_source.a) it9.next();
            Class<? extends ParamsSource> value2 = aVar.getValue();
            if (aVar.a() != null) {
                it = it9;
                runtimeTypeAdapterFactoryD5.b(value2, aVar.getType(), null);
                skipToFieldTypeAdapter = skipToFieldTypeAdapter8;
            } else {
                it = it9;
                skipToFieldTypeAdapter = skipToFieldTypeAdapter8;
                runtimeTypeAdapterFactoryD5.b(value2, aVar.getType(), skipToFieldTypeAdapter);
            }
            skipToFieldTypeAdapter8 = skipToFieldTypeAdapter;
            it9 = it;
        }
        G0 g07 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD6 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, NavigationBarItem.class);
        Iterator it10 = c40685a.f396733g.iterator();
        while (it10.hasNext()) {
            com.avito.android.beduin.common.navigation_bar.d dVar = (com.avito.android.beduin.common.navigation_bar.d) it10.next();
            runtimeTypeAdapterFactoryD6.b(dVar.getValue(), dVar.getType(), skipToFieldTypeAdapter9);
            it10 = it10;
            runtimeTypeAdapterFactoryD5 = runtimeTypeAdapterFactoryD5;
        }
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory11 = runtimeTypeAdapterFactoryD5;
        G0 g08 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD7 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, TabsScreenModel.d.class);
        for (Iterator it11 = c40685a.f396734h.iterator(); it11.hasNext(); it11 = it11) {
            InterfaceC49629e interfaceC49629e = (InterfaceC49629e) it11.next();
            runtimeTypeAdapterFactoryD7.b(((InterfaceC42819t) interfaceC49629e.getValue()).f(), interfaceC49629e.getType(), skipToFieldTypeAdapter10);
            runtimeTypeAdapterFactoryD6 = runtimeTypeAdapterFactoryD6;
        }
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory12 = runtimeTypeAdapterFactoryD6;
        G0 g09 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD8 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, TabsScreenModel.c.class);
        for (Iterator it12 = c40685a.f396735i.iterator(); it12.hasNext(); it12 = it12) {
            InterfaceC49334c interfaceC49334c = (InterfaceC49334c) it12.next();
            runtimeTypeAdapterFactoryD8.b(((InterfaceC42819t) interfaceC49334c.getValue()).f(), interfaceC49334c.getType(), skipToFieldTypeAdapter11);
        }
        G0 g010 = G0.f406611a;
        Set setL0 = C42756l.l0(new r[]{beduinAttributedTextPairAdapterFactory, beduinSelectStringParametersAdapterFactory, beduinCheckboxGroupAggregatorAdapterFactory, paramsSourceFormParamsMapAdapterFactory, paramsSourceGroupByValuesAdapterFactory, beduinCheckboxGroupOptionAdapterFactory, beduinUniversalPageContentAdapterFactory, beduinFormAdapterFactory, runtimeTypeAdapterFactory, runtimeTypeAdapterFactory2, runtimeTypeAdapterFactory3, runtimeTypeAdapterFactory4, runtimeTypeAdapterFactory5, runtimeTypeAdapterFactory6, runtimeTypeAdapterFactory10, runtimeTypeAdapterFactory8, runtimeTypeAdapterFactoryD, runtimeTypeAdapterFactoryD2, runtimeTypeAdapterFactoryD3, runtimeTypeAdapterFactoryD4, runtimeTypeAdapterFactory11, runtimeTypeAdapterFactory12, runtimeTypeAdapterFactoryD7, runtimeTypeAdapterFactoryD8});
        t.d(setL0);
        return setL0;
    }
}
