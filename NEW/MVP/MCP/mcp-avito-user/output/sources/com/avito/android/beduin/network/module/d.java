package com.avito.android.beduin.network.module;

import com.avito.android.beduin.common.component.attributed_text_pair.BeduinAttributedTextPairModel;
import com.avito.android.beduin.common.component.cart_item.RightIcons;
import com.avito.android.beduin.common.component.checkbox_group_aggregator.CheckboxGroupAggregatorModel;
import com.avito.android.beduin.common.component.file_uploader.ValidationRule;
import com.avito.android.beduin.common.component.file_uploader.data.BeduinFileValidationRulesDeserializer;
import com.avito.android.beduin.common.component.model.BeduinLayoutSize;
import com.avito.android.beduin.common.component.params_source.ParamsSourceExcludeParams;
import com.avito.android.beduin.common.component.params_source.ParamsSourceExcludeParamsJsonAdapter;
import com.avito.android.beduin.common.component.params_source.ParamsSourceFormParamsMap;
import com.avito.android.beduin.common.component.params_source.ParamsSourceFormParamsMapJsonAdapter;
import com.avito.android.beduin.common.component.params_source.ParamsSourceGroupByValues;
import com.avito.android.beduin.common.component.selectStringParameters.BeduinSelectStringParametersModel;
import com.avito.android.beduin.common.component.selection_group.BeduinSelectionGroupModel;
import com.avito.android.beduin.common.container.card_item.BeduinCardItemContainerModel;
import com.avito.android.beduin.common.container.checkbox_group.BeduinCheckboxGroupOption;
import com.avito.android.beduin.network.model.Condition;
import com.avito.android.beduin.network.model.Constraint;
import com.avito.android.beduin.network.model.LabelToken;
import com.avito.android.beduin.network.parse.BeduinAttributedTextPairDeserializer;
import com.avito.android.beduin.network.parse.BeduinCardItemTypeAdapter;
import com.avito.android.beduin.network.parse.BeduinCardRightIconsAdapter;
import com.avito.android.beduin.network.parse.BeduinCheckboxGroupAggregatorDeserializer;
import com.avito.android.beduin.network.parse.BeduinCheckboxGroupOptionDeserializer;
import com.avito.android.beduin.network.parse.BeduinConstraintTypeAdapter;
import com.avito.android.beduin.network.parse.BeduinFormDeserializer;
import com.avito.android.beduin.network.parse.BeduinLayoutSizeTypeAdapter;
import com.avito.android.beduin.network.parse.BeduinLocalTokenTypeAdapter;
import com.avito.android.beduin.network.parse.BeduinSelectStringParametersDeserializer;
import com.avito.android.beduin.network.parse.BeduinSelectionGroupTypeAdapter;
import com.avito.android.beduin.network.parse.BeduinUniversalPageContentDeserializer;
import com.avito.android.beduin.network.parse.ConditionDeserializer;
import com.avito.android.beduin.network.parse.ItemListAdditionalDataTypeAdapter;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.avito.android.beduin_shared.model.action.custom.openItemsList.AdditionalData;
import com.avito.android.remote.model.file_uploader.FileDeleteResult;
import com.avito.android.remote.model.file_uploader.FileUploadResult;
import com.avito.android.remote.parse.adapter.C34381y;
import com.avito.android.util.X5;
import dagger.internal.x;
import dagger.internal.y;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: BeduinJsonModule_ProvideTypeAdapterEntriesFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<Set<X5>> {

    /* compiled from: BeduinJsonModule_ProvideTypeAdapterEntriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f104027a = new d();
    }

    public static d a() {
        return a.f104027a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.beduin.network.module.a.f104024a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(Constraint.class, new BeduinConstraintTypeAdapter()));
        linkedHashSet.add(new X5(BeduinLayoutSize.class, new BeduinLayoutSizeTypeAdapter()));
        linkedHashSet.add(new X5(Condition.class, new ConditionDeserializer()));
        linkedHashSet.add(new X5(AdditionalData.class, new ItemListAdditionalDataTypeAdapter()));
        linkedHashSet.add(new X5(LabelToken.class, new BeduinLocalTokenTypeAdapter()));
        linkedHashSet.add(new X5(BeduinAttributedTextPairModel.class, new BeduinAttributedTextPairDeserializer()));
        linkedHashSet.add(new X5(BeduinCheckboxGroupOption.class, new BeduinCheckboxGroupOptionDeserializer()));
        linkedHashSet.add(new X5(BeduinForm.class, new BeduinFormDeserializer()));
        linkedHashSet.add(new X5(ParamsSourceFormParamsMap.class, new ParamsSourceFormParamsMapJsonAdapter()));
        linkedHashSet.add(new X5(CheckboxGroupAggregatorModel.class, new BeduinCheckboxGroupAggregatorDeserializer()));
        linkedHashSet.add(new X5(BeduinSelectStringParametersModel.class, new BeduinSelectStringParametersDeserializer()));
        linkedHashSet.add(new X5(BeduinSelectionGroupModel.SelectionType.class, new BeduinSelectionGroupTypeAdapter.SelectionType()));
        ParamsSourceGroupByValues.INSTANCE.getClass();
        linkedHashSet.add(new X5(ParamsSourceGroupByValues.class, ParamsSourceGroupByValues.deserializer));
        linkedHashSet.add(new X5(ParamsSourceExcludeParams.class, new ParamsSourceExcludeParamsJsonAdapter()));
        linkedHashSet.add(new X5(BeduinCardItemContainerModel.SelectionDisplayType.class, new BeduinCardItemTypeAdapter.SelectionDisplayTypeAdapter(null, null, 3, null)));
        linkedHashSet.add(new X5(RightIcons.class, new BeduinCardRightIconsAdapter()));
        linkedHashSet.add(new X5(BeduinUniversalPageContent.class, new BeduinUniversalPageContentDeserializer()));
        linkedHashSet.add(new X5(ValidationRule.class, new BeduinFileValidationRulesDeserializer()));
        linkedHashSet.add(new X5(FileUploadResult.class, C34381y.b()));
        linkedHashSet.add(new X5(FileDeleteResult.class, C34381y.a()));
        return linkedHashSet;
    }
}
