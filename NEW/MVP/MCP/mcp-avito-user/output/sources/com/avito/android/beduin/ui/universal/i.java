package com.avito.android.beduin.ui.universal;

import android.app.Application;
import android.content.Intent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.ui.universal.UniversalBeduinFragment;
import com.avito.android.deep_linking.links.BottomSheetContentPaddings;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.deep_linking.links.ThemeMode;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalBeduinIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/universal/i;", "Lcom/avito/android/beduin/ui/universal/h;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f104487a;

    @Inject
    public i(@Y61.k Application application) {
        this.f104487a = application;
    }

    @Override // com.avito.android.beduin.ui.universal.h
    @Y61.k
    public final Intent a(@Y61.l String str, @Y61.l Long l12, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6) {
        ScreenStyle.f133646c.getClass();
        ScreenStyle screenStyleA = ScreenStyle.a.a(str2);
        ThemeMode.f133714c.getClass();
        ThemeMode themeMode = ThemeMode.LIGHT;
        if (!L.f(str4, themeMode.f133717b)) {
            themeMode = ThemeMode.DARK;
            if (!L.f(str4, themeMode.f133717b)) {
                themeMode = null;
            }
        }
        BottomSheetContentPaddings.f133056c.getClass();
        BottomSheetContentPaddings bottomSheetContentPaddings = BottomSheetContentPaddings.TOP;
        if (!L.f(str6, bottomSheetContentPaddings.f133059b)) {
            BottomSheetContentPaddings bottomSheetContentPaddings2 = BottomSheetContentPaddings.NONE;
            if (L.f(str6, bottomSheetContentPaddings2.f133059b)) {
                bottomSheetContentPaddings = bottomSheetContentPaddings2;
            }
        }
        UniversalBeduinFragment.f104416B0.getClass();
        boolean zA2 = UniversalBeduinFragment.a.a(screenStyleA);
        Application application = this.f104487a;
        Intent intentPutExtra = (zA2 ? new Intent(application, (Class<?>) UniversalBeduinBottomSheetActivity.class) : new Intent(application, (Class<?>) UniversalBeduinActivity.class)).putExtra(ContextActionHandler.Link.URL, str).putExtra(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, screenStyleA);
        if (str3 != null) {
            intentPutExtra.putExtra("screenName", str3);
        }
        if (l12 != null) {
            intentPutExtra.putExtra("contentId", l12);
        }
        if (themeMode != null) {
            intentPutExtra.putExtra("themeMode", themeMode);
        }
        if (str5 != null) {
            intentPutExtra.putExtra(BeduinPromoBlockModel.SERIALIZED_NAME_THEME, str5);
        }
        intentPutExtra.putExtra("bottomSheetContentPadding", bottomSheetContentPaddings);
        if (screenStyleA == ScreenStyle.PUSH_BOTTOM_SHEET) {
            intentPutExtra.setFlags(603979776);
        }
        return intentPutExtra;
    }
}
