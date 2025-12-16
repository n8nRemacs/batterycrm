package ds;

import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: Api3CpaCjmCpxPromoGetDataGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lds/f;", "", "", "buttonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "description", "inputTitle", "maxError", "minError", ChannelContext.Item.PLACEHOLDER, "title", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "c", "d", "e", "f", "g", "h", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ds.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39798f {

    @com.google.gson.annotations.c("buttonTitle")
    @Y61.k
    private final String buttonTitle;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @Y61.k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final String description;

    @com.google.gson.annotations.c("inputTitle")
    @Y61.l
    private final String inputTitle;

    @com.google.gson.annotations.c("maxError")
    @Y61.l
    private final String maxError;

    @com.google.gson.annotations.c("minError")
    @Y61.l
    private final String minError;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @Y61.l
    private final String placeholder;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C39798f(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.k String str7) {
        this.buttonTitle = str;
        this.deeplink = deepLink;
        this.description = str2;
        this.inputTitle = str3;
        this.maxError = str4;
        this.minError = str5;
        this.placeholder = str6;
        this.title = str7;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getInputTitle() {
        return this.inputTitle;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getMaxError() {
        return this.maxError;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getMinError() {
        return this.minError;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
