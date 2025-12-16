package com.avito.android.publish.items.alert_banner;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.search.Theme;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;

/* compiled from: InputParameterAlertBannerItemFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/items/alert_banner/m;", "Lcom/avito/android/category_parameters/e;", "Lcom/avito/android/publish/items/alert_banner/n;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m extends com.avito.android.category_parameters.e implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final HashSet f236762a = new HashSet();

    @Override // com.avito.android.publish.items.alert_banner.n
    public final boolean a(@Y61.k String str) {
        return this.f236762a.add(str);
    }

    @Override // com.avito.android.category_parameters.e
    @Y61.l
    public final com.avito.conveyor_item.a d(@Y61.k CategoryParameter categoryParameter, @Y61.l Theme theme) {
        CharParameter charParameter;
        DisplayingOptions displayingOptions;
        String alertBannerText;
        if (!(categoryParameter instanceof CharParameter) || (displayingOptions = (charParameter = (CharParameter) categoryParameter).getDisplayingOptions()) == null || (alertBannerText = displayingOptions.getAlertBannerText()) == null || alertBannerText.length() == 0) {
            return null;
        }
        DisplayingOptions displayingOptions2 = charParameter.getDisplayingOptions();
        if ((displayingOptions2 != null ? L.f(displayingOptions2.getShouldShowAlertBannerOnFocus(), Boolean.TRUE) : false) && !this.f236762a.contains(categoryParameter.getId())) {
            return null;
        }
        return new AlertBannerItem(m0.f406844a.b(AlertBannerItem.class) + '_' + categoryParameter.getId(), null, alertBannerText, R.attr.publish_alertBannerStyle_warning, Theme.INSTANCE.isAvitoRe23(theme) ? null : Integer.valueOf(R.drawable.common_ic_attention_round_24), null);
    }
}
