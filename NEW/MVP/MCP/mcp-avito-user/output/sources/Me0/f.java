package ME0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: Api1StrSellerGuestProfileGetResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LME0/f;", "", "LME0/e;", "backgroundColor", "backgroundPressedColor", "fontColor", "LME0/g;", "icon", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(LME0/e;LME0/e;LME0/e;LME0/g;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "LME0/e;", "a", "()LME0/e;", "getBackgroundPressedColor", "b", "LME0/g;", "c", "()LME0/g;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    @com.google.gson.annotations.c("backgroundColor")
    @Y61.l
    private final e backgroundColor;

    @com.google.gson.annotations.c("backgroundPressedColor")
    @Y61.l
    private final e backgroundPressedColor;

    @com.google.gson.annotations.c("fontColor")
    @Y61.l
    private final e fontColor;

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final g icon;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.k
    private final DeepLink uri;

    public f(@Y61.l e eVar, @Y61.l e eVar2, @Y61.l e eVar3, @Y61.l g gVar, @Y61.k String str, @Y61.k DeepLink deepLink) {
        this.backgroundColor = eVar;
        this.backgroundPressedColor = eVar2;
        this.fontColor = eVar3;
        this.icon = gVar;
        this.title = str;
        this.uri = deepLink;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final e getBackgroundColor() {
        return this.backgroundColor;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final e getFontColor() {
        return this.fontColor;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final g getIcon() {
        return this.icon;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
