package Zt0;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: Api2ProfileTransactionsResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LZt0/b;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/remote/model/text/AttributedText;", "value", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zt0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19607b {

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    @com.google.gson.annotations.c("value")
    @l
    private final AttributedText value;

    public C19607b(@l DeepLink deepLink, @l AttributedText attributedText) {
        this.uri = deepLink;
        this.value = attributedText;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getValue() {
        return this.value;
    }
}
