package com.avito.android.profile_settings_extended.converter;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetCreateArguments;
import com.avito.android.profile_settings_extended.adapter.universal.create.UniversalWidgetCreateItem;
import com.avito.android.profile_settings_extended.adapter.universal.header.UniversalWidgetHeaderItem;
import com.avito.android.profile_settings_extended.adapter.universal.section.UniversalWidgetSectionItem;
import com.avito.android.profile_settings_extended.entity.x;
import com.avito.android.remote.model.extended.FieldModerationStatus;
import com.avito.android.remote.model.extended.UniversalWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlin.text.C43066x;

/* compiled from: ExtendedProfileUniversalWidgetConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/converter/e;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.extended_profile_universal_widget_edit.f f230036a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final gD.f f230037b;

    @Inject
    public e(@k com.avito.android.extended_profile_universal_widget_edit.f fVar, @k gD.f fVar2) {
        this.f230036a = fVar;
        this.f230037b = fVar2;
    }

    @k
    public final x a(@k UniversalWidget universalWidget) throws Exception {
        UniversalWidgetCreateItem universalWidgetCreateItem;
        UniversalWidget.UniversalWidgetImageWithTextSection imageWithText;
        UniversalWidget.UniversalWidgetTextSection text;
        UniversalWidget.UniversalWidgetFactoidSection factoid;
        List<UniversalWidget.Field> fields = universalWidget.getFields();
        if (fields == null) {
            fields = C42784z0.f406748b;
        }
        UniversalWidget.Field field = (UniversalWidget.Field) C42745f0.E(fields);
        String name = field.getName();
        List<UniversalWidget.UniversalWidgetFieldValue> values = field.getValues();
        if (values == null) {
            values = C42784z0.f406748b;
        }
        boolean z12 = values.size() < universalWidget.getConfig().getSectionsLimit();
        UniversalWidgetHeaderItem universalWidgetHeaderItem = new UniversalWidgetHeaderItem(null, universalWidget.getConfig().getWidgetTitle(), !z12 ? universalWidget.getConfig().getSectionsLimitDescription() : null, 1, null);
        if (z12) {
            String createSectionTitle = universalWidget.getConfig().getCreateSectionTitle();
            String createSectionTitle2 = universalWidget.getConfig().getCreateSectionTitle();
            UniversalWidget.Config config = universalWidget.getConfig();
            List<UniversalWidget.OrderedSectionType> addSectionOrder = universalWidget.getConfig().getAddSectionOrder();
            List<UniversalWidget.UniversalWidgetFieldValue> values2 = field.getValues();
            if (values2 == null) {
                values2 = C42784z0.f406748b;
            }
            List<UniversalWidget.UniversalWidgetFieldValue> list = values2;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((UniversalWidget.UniversalWidgetFieldValue) it.next()).getValueId());
            }
            universalWidgetCreateItem = new UniversalWidgetCreateItem(null, createSectionTitle, new UniversalWidgetCreateArguments(createSectionTitle2, config, addSectionOrder, name, arrayList), 1, null);
        } else {
            universalWidgetCreateItem = null;
        }
        ArrayList arrayList2 = new ArrayList();
        List<UniversalWidget.UniversalWidgetFieldValue> values3 = field.getValues();
        if (values3 == null) {
            values3 = C42784z0.f406748b;
        }
        for (UniversalWidget.UniversalWidgetFieldValue universalWidgetFieldValue : values3) {
            try {
                UniversalWidget.UniversalWidgetValue value = universalWidgetFieldValue.getValue();
                if (value != null && (factoid = value.getFactoid()) != null) {
                    arrayList2.add(b(factoid, universalWidget.getConfig(), universalWidgetFieldValue, name));
                }
                UniversalWidget.UniversalWidgetValue value2 = universalWidgetFieldValue.getValue();
                if (value2 != null && (text = value2.getText()) != null) {
                    arrayList2.add(d(text, universalWidget.getConfig(), universalWidgetFieldValue, name));
                }
                UniversalWidget.UniversalWidgetValue value3 = universalWidgetFieldValue.getValue();
                if (value3 != null && (imageWithText = value3.getImageWithText()) != null) {
                    arrayList2.add(c(imageWithText, universalWidget.getConfig(), universalWidgetFieldValue, name));
                }
            } catch (Exception e12) {
                gD.f fVar = this.f230037b;
                fVar.getClass();
                n<Object> nVar = gD.f.f396389r[8];
                if (!((Boolean) fVar.f396397i.a().invoke()).booleanValue()) {
                    throw e12;
                }
                e12.printStackTrace();
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList3.add(UniversalWidgetSectionItem.a((UniversalWidgetSectionItem) next, i12 != 0, i12 < arrayList2.size() - 1));
            i12 = i13;
        }
        String widgetName = universalWidget.getWidgetName();
        if (widgetName == null) {
            widgetName = "";
        }
        return new x(widgetName, universalWidgetHeaderItem, universalWidgetCreateItem, arrayList3, name);
    }

    public final UniversalWidgetSectionItem b(UniversalWidget.UniversalWidgetFactoidSection universalWidgetFactoidSection, UniversalWidget.Config config, UniversalWidget.UniversalWidgetFieldValue universalWidgetFieldValue, String str) {
        com.avito.android.extended_profile_universal_widget_edit.f fVar = this.f230036a;
        UniversalWidgetSectionModel.FactoidSection factoidSectionC = fVar.c(universalWidgetFactoidSection, config);
        String str2 = factoidSectionC.f153558d;
        if (str2 == null || C43066x.K(str2)) {
            str2 = null;
        }
        String strA = str2 == null ? fVar.a(factoidSectionC, config.getSectionsConfig()) : str2;
        String str3 = "factoid_section_" + universalWidgetFieldValue.getValueId();
        String valueId = universalWidgetFieldValue.getValueId();
        String editBlockTitle = config.getEditBlockTitle();
        FieldModerationStatus status = universalWidgetFieldValue.getStatus();
        return new UniversalWidgetSectionItem(str3, str, valueId, strA, editBlockTitle, factoidSectionC, status != null ? com.avito.android.profile_management_core.moderation.a.a(status) : null, universalWidgetFieldValue.getValue().getVisibilityStatus(), universalWidgetFactoidSection.getContent().isVisibleByUser(), config, false, false, 3072, null);
    }

    public final UniversalWidgetSectionItem c(UniversalWidget.UniversalWidgetImageWithTextSection universalWidgetImageWithTextSection, UniversalWidget.Config config, UniversalWidget.UniversalWidgetFieldValue universalWidgetFieldValue, String str) {
        com.avito.android.extended_profile_universal_widget_edit.f fVar = this.f230036a;
        UniversalWidgetSectionModel.ImageWithTextSection imageWithTextSectionE = fVar.e(universalWidgetImageWithTextSection, config);
        String sectionTitle = universalWidgetImageWithTextSection.getContent().getSectionTitle();
        if (sectionTitle == null || C43066x.K(sectionTitle)) {
            sectionTitle = null;
        }
        String strA = sectionTitle == null ? fVar.a(imageWithTextSectionE, config.getSectionsConfig()) : sectionTitle;
        String str2 = "imgWithText_section_" + universalWidgetFieldValue.getValueId();
        String valueId = universalWidgetFieldValue.getValueId();
        String editBlockTitle = config.getEditBlockTitle();
        FieldModerationStatus status = universalWidgetFieldValue.getStatus();
        return new UniversalWidgetSectionItem(str2, str, valueId, strA, editBlockTitle, imageWithTextSectionE, status != null ? com.avito.android.profile_management_core.moderation.a.a(status) : null, universalWidgetFieldValue.getValue().getVisibilityStatus(), universalWidgetImageWithTextSection.getContent().isVisibleByUser(), config, false, false, 3072, null);
    }

    public final UniversalWidgetSectionItem d(UniversalWidget.UniversalWidgetTextSection universalWidgetTextSection, UniversalWidget.Config config, UniversalWidget.UniversalWidgetFieldValue universalWidgetFieldValue, String str) {
        UniversalWidgetSectionModel.TextSection textSectionD = this.f230036a.d(universalWidgetTextSection, config);
        String str2 = "text_section_" + universalWidgetFieldValue.getValueId();
        String valueId = universalWidgetFieldValue.getValueId();
        String name = config.getSectionsConfig().getText().getFullWidth().getName();
        String editBlockTitle = config.getEditBlockTitle();
        FieldModerationStatus status = universalWidgetFieldValue.getStatus();
        return new UniversalWidgetSectionItem(str2, str, valueId, name, editBlockTitle, textSectionD, status != null ? com.avito.android.profile_management_core.moderation.a.a(status) : null, universalWidgetFieldValue.getValue().getVisibilityStatus(), universalWidgetTextSection.getContent().isVisibleByUser(), config, false, false, 3072, null);
    }
}
