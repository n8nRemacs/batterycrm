package com.avito.android.profile_settings_basic;

import androidx.compose.runtime.internal.P;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_management_core.moderation.a;
import com.avito.android.profile_settings_basic.adapter.BasicSettingsListItem;
import com.avito.android.profile_settings_basic.adapter.badge_bar.BadgeBarItem;
import com.avito.android.profile_settings_basic.adapter.section_header.SectionHeaderItem;
import com.avito.android.profile_settings_basic.adapter.setting_item.SettingItem;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadge;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadgeStyle;
import com.avito.android.remote.model.basic.AboutWidget;
import com.avito.android.remote.model.basic.BadgeBarWidget;
import com.avito.android.remote.model.basic.BasicInfoWidget;
import com.avito.android.remote.model.basic.BasicSettingsWidget;
import com.avito.android.remote.model.basic.Field;
import com.avito.android.remote.model.basic.Header;
import com.avito.android.remote.model.basic.VerificationWidget;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BasicSettingsWidgetsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/I;", "Lcom/avito/android/profile_settings_basic/H;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class I implements H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f228568a;

    @Inject
    public I(@Y61.k l lVar) {
        this.f228568a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    @Override // com.avito.android.profile_settings_basic.H
    @Y61.k
    public final List<BasicSettingsListItem> a(@Y61.k BasicSettingsWidget basicSettingsWidget) {
        List<BasicSettingsListItem> listSingletonList;
        ModerationStatus moderationPassed;
        if (basicSettingsWidget instanceof AboutWidget) {
            List<Field> fields = ((AboutWidget) basicSettingsWidget).getFields();
            listSingletonList = new ArrayList(C42745f0.q(fields, 10));
            for (Field field : fields) {
                String title = field.getTitle();
                Field.FieldStatus status = field.getStatus();
                String value = status != null ? status.getValue() : null;
                Field.FieldStatus status2 = field.getStatus();
                String placeholder = status2 != null ? status2.getPlaceholder() : null;
                Field.FieldStatus status3 = field.getStatus();
                if (status3 != null) {
                    Field.StatusType type = status3.getType();
                    int i12 = type == null ? -1 : a.C6884a.f226782b[type.ordinal()];
                    moderationPassed = i12 != 1 ? i12 != 2 ? new ModerationStatus.ModerationPassed(status3.getValue(), status3.getSubtitle(), null) : new ModerationStatus.ModerationFailed(status3.getValue(), status3.getSubtitle(), null) : new ModerationStatus.ModerationPending(status3.getValue(), status3.getSubtitle(), null);
                } else {
                    moderationPassed = null;
                }
                Field.EditableInfo editableInfo = field.getEditableInfo();
                listSingletonList.add(new SettingItem(null, title, value, placeholder, moderationPassed, editableInfo != null ? editableInfo.getFieldName() : null, 1, null));
            }
        } else if (basicSettingsWidget instanceof BadgeBarWidget) {
            BadgeBarWidget badgeBarWidget = (BadgeBarWidget) basicSettingsWidget;
            listSingletonList = new ArrayList();
            Header config = badgeBarWidget.getConfig();
            listSingletonList.add(new SectionHeaderItem(null, config.getTitle(), config.getDescription(), null, 9, null));
            if (O2.a(badgeBarWidget.getBadges())) {
                List<AdvertBadge> badges = badgeBarWidget.getBadges();
                ArrayList arrayList = new ArrayList(C42745f0.q(badges, 10));
                for (AdvertBadge advertBadge : badges) {
                    String strValueOf = String.valueOf(advertBadge.getId());
                    int id2 = advertBadge.getId();
                    String title2 = advertBadge.getTitle();
                    String description = advertBadge.getDescription();
                    if (description == null) {
                        description = "";
                    }
                    String str = description;
                    AdvertBadgeStyle style = advertBadge.getStyle();
                    UniversalColor backgroundColor = style != null ? style.getBackgroundColor() : null;
                    AdvertBadgeStyle style2 = advertBadge.getStyle();
                    UniversalColor backgroundPressedColor = style2 != null ? style2.getBackgroundPressedColor() : null;
                    AdvertBadgeStyle style3 = advertBadge.getStyle();
                    UniversalColor fontColor = style3 != null ? style3.getFontColor() : null;
                    AdvertBadgeStyle style4 = advertBadge.getStyle();
                    arrayList.add(new BadgeItem(strValueOf, id2, title2, str, backgroundColor, backgroundPressedColor, fontColor, 1, 1, style4 != null ? style4.getIcon() : null, advertBadge.getUri(), false, false, null, 14336, null));
                }
                listSingletonList.add(new BadgeBarItem(null, arrayList, 1, null));
            }
        } else {
            if (!(basicSettingsWidget instanceof VerificationWidget)) {
                if (basicSettingsWidget instanceof BasicInfoWidget) {
                    return Collections.singletonList(this.f228568a.a((BasicInfoWidget) basicSettingsWidget));
                }
                throw new NoWhenBranchMatchedException();
            }
            VerificationWidget verificationWidget = (VerificationWidget) basicSettingsWidget;
            listSingletonList = Collections.singletonList(new SectionHeaderItem(null, verificationWidget.getConfig().getTitle(), verificationWidget.getConfig().getDescription(), SectionHeaderItem.Type.f228676c, 1, null));
        }
        return listSingletonList;
    }
}
