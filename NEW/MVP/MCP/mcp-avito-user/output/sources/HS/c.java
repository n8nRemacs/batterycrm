package hs;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: CpxPromoInputSheetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lhs/c;", "", "", "title", "inputTitle", "description", "Lhs/b;", "primaryButton", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, ChannelContext.Item.PLACEHOLDER, "minError", "maxError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhs/b;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "c", "b", "Lhs/b;", "g", "()Lhs/b;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "f", "e", "d", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("inputTitle")
    @l
    private final String inputTitle;

    @com.google.gson.annotations.c("maxError")
    @l
    private final String maxError;

    @com.google.gson.annotations.c("minError")
    @l
    private final String minError;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @com.google.gson.annotations.c("primaryButton")
    @l
    private final C40976b primaryButton;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public c(@l String str, @l String str2, @l String str3, @l C40976b c40976b, @l DeepLink deepLink, @l String str4, @l String str5, @l String str6) {
        this.title = str;
        this.inputTitle = str2;
        this.description = str3;
        this.primaryButton = c40976b;
        this.deeplink = deepLink;
        this.placeholder = str4;
        this.minError = str5;
        this.maxError = str6;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getInputTitle() {
        return this.inputTitle;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getMaxError() {
        return this.maxError;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getMinError() {
        return this.minError;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final C40976b getPrimaryButton() {
        return this.primaryButton;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
