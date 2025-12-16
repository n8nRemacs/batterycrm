package com.avito.android.profile_settings_extended.adapter.setting;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.entity.SettingsActionButton;
import com.avito.android.remote.model.extended.ExtendedProfileInfo;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SettingItemConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/setting/d;", "Lcom/avito/android/profile_settings_extended/adapter/setting/c;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* compiled from: SettingItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f229850a;

        static {
            int[] iArr = new int[ExtendedProfileInfo.Button.Type.values().length];
            try {
                iArr[ExtendedProfileInfo.Button.Type.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExtendedProfileInfo.Button.Type.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f229850a = iArr;
        }
    }

    @Inject
    public d() {
    }

    @Override // com.avito.android.profile_settings_extended.adapter.setting.c
    @Y61.k
    public final SettingItem a(@Y61.k ExtendedProfileInfo extendedProfileInfo) {
        ExtendedProfileInfo.Button.Type iconType;
        SettingsActionButton.Type type;
        String title = extendedProfileInfo.getTitle();
        String value = extendedProfileInfo.getValue();
        List<ExtendedProfileInfo.Button> buttons = extendedProfileInfo.getButtons();
        if (buttons == null) {
            buttons = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (ExtendedProfileInfo.Button button : buttons) {
            String title2 = button.getTitle();
            SettingsActionButton settingsActionButton = null;
            if (title2 != null && (iconType = button.getIconType()) != null && button.getAction().getType() == ExtendedProfileInfo.DeeplinkAction.Type.LINK) {
                int i12 = a.f229850a[iconType.ordinal()];
                if (i12 == 1) {
                    type = SettingsActionButton.Type.f230300b;
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    type = SettingsActionButton.Type.f230301c;
                }
                settingsActionButton = new SettingsActionButton(title2, type, button.getAction().getDeepLink());
            }
            if (settingsActionButton != null) {
                arrayList.add(settingsActionButton);
            }
        }
        return new SettingItem(null, title, value, arrayList, 1, null);
    }
}
