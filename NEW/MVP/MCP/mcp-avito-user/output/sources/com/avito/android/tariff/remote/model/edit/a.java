package com.avito.android.tariff.remote.model.edit;

import Y61.k;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.tariff.remote.model.edit.TariffAlertAction;
import kotlin.Metadata;

/* compiled from: TariffAlertAction.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/tariff/remote/model/edit/a;", "Lcom/avito/android/tariff/remote/model/edit/TariffAlertAction;", "", "title", "Lcom/avito/android/tariff/remote/model/edit/TariffAlertAction$ButtonStyle;", "buttonStyle", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/tariff/remote/model/edit/TariffAlertAction$ButtonStyle;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/tariff/remote/model/edit/TariffAlertAction$ButtonStyle;", "a", "()Lcom/avito/android/tariff/remote/model/edit/TariffAlertAction$ButtonStyle;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends TariffAlertAction {

    @com.google.gson.annotations.c("buttonStyle")
    @k
    private final TariffAlertAction.ButtonStyle buttonStyle;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public a(@k String str, @k TariffAlertAction.ButtonStyle buttonStyle, @k DeepLink deepLink) {
        super(null);
        this.title = str;
        this.buttonStyle = buttonStyle;
        this.deeplink = deepLink;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final TariffAlertAction.ButtonStyle getButtonStyle() {
        return this.buttonStyle;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
