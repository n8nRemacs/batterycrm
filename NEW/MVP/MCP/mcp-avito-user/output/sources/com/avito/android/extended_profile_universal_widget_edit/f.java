package com.avito.android.extended_profile_universal_widget_edit;

import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.remote.model.extended.UniversalWidget;
import com.avito.android.remote.model.extended.modification.UniversalWidgetSectionModification;
import kotlin.Metadata;

/* compiled from: UniversalWidgetModelConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/f;", "", "_avito_extended-profile-universal-widget-edit_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface f {
    @Y61.k
    String a(@Y61.k UniversalWidgetSectionModel.Section section, @Y61.k UniversalWidget.SectionsConfig sectionsConfig);

    @Y61.k
    UniversalWidgetSectionModel.Section b(@Y61.k UniversalWidgetSectionModification universalWidgetSectionModification, @Y61.k UniversalWidget.Config config);

    @Y61.k
    UniversalWidgetSectionModel.FactoidSection c(@Y61.k UniversalWidget.UniversalWidgetFactoidSection universalWidgetFactoidSection, @Y61.k UniversalWidget.Config config);

    @Y61.k
    UniversalWidgetSectionModel.TextSection d(@Y61.k UniversalWidget.UniversalWidgetTextSection universalWidgetTextSection, @Y61.k UniversalWidget.Config config);

    @Y61.k
    UniversalWidgetSectionModel.ImageWithTextSection e(@Y61.k UniversalWidget.UniversalWidgetImageWithTextSection universalWidgetImageWithTextSection, @Y61.k UniversalWidget.Config config);
}
