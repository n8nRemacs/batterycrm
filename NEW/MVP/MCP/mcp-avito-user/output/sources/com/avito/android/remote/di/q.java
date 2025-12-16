package com.avito.android.remote.di;

import com.avito.android.remote.model.basic.BasicSettingsWidget;
import com.avito.android.remote.model.extended.BasicInfoV2Widget;
import com.avito.android.remote.model.extended.ExtendedProfileSettingsBeduin;
import com.avito.android.remote.model.extended.ExtendedSettingsWidget;
import com.avito.android.remote.model.extended.TextWidget;
import com.avito.android.remote.model.extended.adverts.ExtendedProfileSettingsAdvertsResult;
import com.avito.android.remote.parse.BasicProfileWidgetTypeAdapter;
import com.avito.android.remote.parse.ExtendedProfileAboutWidgetPopupTypeAdapter;
import com.avito.android.remote.parse.ExtendedProfileBasicInfoV2FieldsTypeAdapter;
import com.avito.android.remote.parse.ExtendedProfileSettingsAdvertsTypeAdapter;
import com.avito.android.remote.parse.ExtendedProfileSettingsBeduinDeserializer;
import com.avito.android.remote.parse.ExtendedProfileWidgetTypeAdapter;
import com.avito.android.util.X5;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ProfileManagementJsonModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/di/q;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class q implements dagger.internal.h<Set<X5>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final q f253373a = new q();

    @Override // javax.inject.Provider
    public final Object get() {
        o.f253371a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(BasicInfoV2Widget.Field.class, new ExtendedProfileBasicInfoV2FieldsTypeAdapter()));
        linkedHashSet.add(new X5(ExtendedSettingsWidget.class, new ExtendedProfileWidgetTypeAdapter()));
        linkedHashSet.add(new X5(ExtendedProfileSettingsAdvertsResult.Item.class, new ExtendedProfileSettingsAdvertsTypeAdapter()));
        linkedHashSet.add(new X5(BasicSettingsWidget.class, new BasicProfileWidgetTypeAdapter()));
        linkedHashSet.add(new X5(TextWidget.Config.AboutTabContent.class, new ExtendedProfileAboutWidgetPopupTypeAdapter()));
        linkedHashSet.add(new X5(ExtendedProfileSettingsBeduin.class, new ExtendedProfileSettingsBeduinDeserializer()));
        return linkedHashSet;
    }
}
