package GQ;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: ShortCvSuccessScreenResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"LGQ/c;", "", "LGQ/a;", "clickEvent", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "title", ContextActionHandler.Link.URL, "<init>", "(LGQ/a;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LGQ/a;", "getClickEvent", "()LGQ/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getStyle", "()Ljava/lang/String;", "b", "getUrl", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    @com.google.gson.annotations.c("clickEvent")
    @l
    private final a clickEvent;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final String style;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @l
    private final String url;

    public c(@l a aVar, @l DeepLink deepLink, @k String str, @k String str2, @l String str3) {
        this.clickEvent = aVar;
        this.deeplink = deepLink;
        this.style = str;
        this.title = str2;
        this.url = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
