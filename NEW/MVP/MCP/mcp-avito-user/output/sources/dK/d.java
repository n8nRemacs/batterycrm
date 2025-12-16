package Dk;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: BundleBenefit.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LDk/d;", "", "", "text", "LDk/a;", "icon", "LDk/b;", "badge", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;LDk/a;LDk/b;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "LDk/a;", "c", "()LDk/a;", "LDk/b;", "a", "()LDk/b;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {

    @com.google.gson.annotations.c("badge")
    @l
    private final b badge;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deepLink;

    @com.google.gson.annotations.c("icon")
    @l
    private final C13408a icon;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final String text;

    public d(@Y61.k String str, @l C13408a c13408a, @l b bVar, @l DeepLink deepLink) {
        this.text = str;
        this.icon = c13408a;
        this.badge = bVar;
        this.deepLink = deepLink;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final b getBadge() {
        return this.badge;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C13408a getIcon() {
        return this.icon;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
