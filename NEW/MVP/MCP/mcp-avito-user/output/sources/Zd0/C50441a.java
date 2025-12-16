package zD0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: ConfigureVertical.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LzD0/a;", "", "", "title", "description", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Lcom/avito/android/remote/model/Image;", "c", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zD0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50441a {

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("images")
    @k
    private final Image image;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C50441a(@k String str, @k String str2, @k Image image, @k DeepLink deepLink) {
        this.title = str;
        this.description = str2;
        this.image = image;
        this.deeplink = deepLink;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
