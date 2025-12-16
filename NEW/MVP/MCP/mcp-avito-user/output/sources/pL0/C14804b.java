package Pl0;

import Y61.k;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: GetPartCompatibilitiesApiV4Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LPl0/b;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "text", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pl0.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14804b {

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("text")
    @k
    private final String text;

    public C14804b(@k DeepLink deepLink, @k String str) {
        this.deeplink = deepLink;
        this.text = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
