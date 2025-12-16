package com.avito.android.profile_settings_basic;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.basic.BasicInfoWidget;
import com.avito.android.remote.model.basic.BasicInfoWidgetAvatarAction;
import com.avito.android.remote.model.extended.FieldModerationStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BasicInfoWidgetConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/m;", "Lcom/avito/android/profile_settings_basic/l;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33456a f228859a;

    @Inject
    public m(@Y61.k InterfaceC33456a interfaceC33456a) {
        this.f228859a = interfaceC33456a;
    }

    public static BasicInfoItem.TextField b(BasicInfoWidget.RecordText recordText) {
        BasicInfoWidget.RecordTextValue recordTextValue;
        String value;
        List<BasicInfoWidget.RecordTextValue> values = recordText.getValues();
        if (values == null || (recordTextValue = (BasicInfoWidget.RecordTextValue) C42745f0.G(values)) == null || (value = recordTextValue.getValue()) == null) {
            return null;
        }
        String name = recordText.getName();
        String description = recordText.getDescription();
        Boolean boolIsEditable = recordText.isEditable();
        BasicInfoWidget.RecordIcon icon = recordText.getIcon();
        String name2 = icon != null ? icon.getName() : null;
        BasicInfoWidget.RecordIcon icon2 = recordText.getIcon();
        BasicInfoItem.Icon icon3 = new BasicInfoItem.Icon(name2, icon2 != null ? icon2.getColor() : null);
        BasicInfoWidget.RecordInfo info = recordText.getInfo();
        BasicInfoItem.Info info2 = info != null ? new BasicInfoItem.Info(info.getTitle(), info.getSubtitle(), info.getButtonTitle()) : null;
        BasicInfoWidget.RecordTooltip onboarding = recordText.getOnboarding();
        return new BasicInfoItem.TextField(name, value, description, boolIsEditable, icon3, info2, onboarding != null ? new BasicInfoItem.Tooltip(onboarding.getTitle(), onboarding.getSubtitle(), onboarding.getButtonTitle(), onboarding.getOnceShowId()) : null, recordText.getDeepLink());
    }

    @Override // com.avito.android.profile_settings_basic.l
    @Y61.k
    public final BasicInfoItem a(@Y61.k BasicInfoWidget basicInfoWidget) {
        BasicInfoWidget.RecordText recordText;
        AvatarShape logoShape;
        BasicInfoWidget.UserNamePopup userNamePopup;
        BasicInfoWidget.UserNamePopup userNamePopup2;
        FieldModerationStatus status;
        FieldModerationStatus status2;
        BasicInfoWidget.RecordAvatarImageValue value;
        List<BasicInfoWidget.RecordTextValue> values;
        List<BasicInfoWidget.RecordText> text;
        Object next;
        List<BasicInfoWidget.RecordAvatar> avatar;
        BasicInfoWidget.RecordAvatar recordAvatar;
        List<BasicInfoWidget.RecordAvatarValue> values2;
        BasicInfoWidget.Records newFields = basicInfoWidget.getNewFields();
        String placeholder = null;
        BasicInfoWidget.RecordAvatarValue recordAvatarValue = (newFields == null || (avatar = newFields.getAvatar()) == null || (recordAvatar = (BasicInfoWidget.RecordAvatar) C42745f0.G(avatar)) == null || (values2 = recordAvatar.getValues()) == null) ? null : (BasicInfoWidget.RecordAvatarValue) C42745f0.G(values2);
        BasicInfoWidget.Records newFields2 = basicInfoWidget.getNewFields();
        if (newFields2 == null || (text = newFields2.getText()) == null) {
            recordText = null;
        } else {
            Iterator<T> it = text.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((BasicInfoWidget.RecordText) next).getName(), "user_name")) {
                    break;
                }
            }
            recordText = (BasicInfoWidget.RecordText) next;
        }
        BasicInfoWidget.RecordTextValue recordTextValue = (recordText == null || (values = recordText.getValues()) == null) ? null : (BasicInfoWidget.RecordTextValue) C42745f0.G(values);
        BasicInfoWidget.Records newFields3 = basicInfoWidget.getNewFields();
        List<BasicInfoWidget.RecordText> text2 = newFields3 != null ? newFields3.getText() : null;
        if (text2 == null) {
            text2 = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : text2) {
            if (!L.f(((BasicInfoWidget.RecordText) obj).getName(), "user_name")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            BasicInfoItem.TextField textFieldB = b((BasicInfoWidget.RecordText) it2.next());
            if (textFieldB != null) {
                arrayList2.add(textFieldB);
            }
        }
        BasicInfoWidget.Config config = basicInfoWidget.getConfig();
        if (config == null || (logoShape = config.getLogoShape()) == null) {
            logoShape = AvatarShape.CIRCLE;
        }
        AvatarShape avatarShape = logoShape;
        BasicInfoWidget.Config config2 = basicInfoWidget.getConfig();
        List<BasicInfoWidgetAvatarAction> basicInfoWidgetAvatarActions = config2 != null ? config2.getBasicInfoWidgetAvatarActions() : null;
        if (basicInfoWidgetAvatarActions == null) {
            basicInfoWidgetAvatarActions = C42784z0.f406748b;
        }
        ArrayList arrayListA = this.f228859a.a(basicInfoWidgetAvatarActions);
        Image image = (recordAvatarValue == null || (value = recordAvatarValue.getValue()) == null) ? null : value.getImage();
        ModerationStatus moderationStatusA = (recordAvatarValue == null || (status2 = recordAvatarValue.getStatus()) == null) ? null : com.avito.android.profile_management_core.moderation.a.a(status2);
        BasicInfoItem.TextField textFieldB2 = recordText != null ? b(recordText) : null;
        ModerationStatus moderationStatusA2 = (recordTextValue == null || (status = recordTextValue.getStatus()) == null) ? null : com.avito.android.profile_management_core.moderation.a.a(status);
        BasicInfoWidget.Config config3 = basicInfoWidget.getConfig();
        String title = (config3 == null || (userNamePopup2 = config3.getUserNamePopup()) == null) ? null : userNamePopup2.getTitle();
        BasicInfoWidget.Config config4 = basicInfoWidget.getConfig();
        if (config4 != null && (userNamePopup = config4.getUserNamePopup()) != null) {
            placeholder = userNamePopup.getPlaceholder();
        }
        return new BasicInfoItem(null, moderationStatusA, image, null, avatarShape, "name", textFieldB2, moderationStatusA2, title, placeholder, arrayList2, arrayListA, 1, null);
    }
}
