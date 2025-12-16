package lP;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ApiGetJobCompanyBannerResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, d2 = {"LlP/a;", "", "", "actionTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "actionUrl", "bannerId", "Lcom/avito/android/remote/model/Image;", "image", "imageDark", "subtitle", "title", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "c", "Lcom/avito/android/remote/model/Image;", "d", "()Lcom/avito/android/remote/model/Image;", "e", "f", "g", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lP.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C43667a {

    @c("actionTitle")
    @k
    private final String actionTitle;

    @c("actionUrl")
    @k
    private final DeepLink actionUrl;

    @c("bannerId")
    @k
    private final String bannerId;

    @c("image")
    @k
    private final Image image;

    @c("imageDark")
    @l
    private final Image imageDark;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    public C43667a(@k String str, @k DeepLink deepLink, @k String str2, @k Image image, @l Image image2, @k String str3, @k String str4) {
        this.actionTitle = str;
        this.actionUrl = deepLink;
        this.bannerId = str2;
        this.image = image;
        this.imageDark = image2;
        this.subtitle = str3;
        this.title = str4;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final DeepLink getActionUrl() {
        return this.actionUrl;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getBannerId() {
        return this.bannerId;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Image getImageDark() {
        return this.imageDark;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
