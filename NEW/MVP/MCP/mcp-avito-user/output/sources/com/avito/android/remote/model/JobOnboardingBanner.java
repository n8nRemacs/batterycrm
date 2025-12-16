package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobOnboardingBanner.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/JobOnboardingBanner;", "", "title", "", "description", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "images", "Lcom/avito/android/remote/model/Image;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Image;)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getDescription", "()Ljava/lang/String;", "getImages", "()Lcom/avito/android/remote/model/Image;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class JobOnboardingBanner {

    @c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @c("description")
    @k
    private final String description;

    @c("images")
    @k
    private final Image images;

    @c("title")
    @k
    private final String title;

    public JobOnboardingBanner(@k String str, @k String str2, @k DeepLink deepLink, @k Image image) {
        this.title = str;
        this.description = str2;
        this.deeplink = deepLink;
        this.images = image;
    }

    public static /* synthetic */ JobOnboardingBanner copy$default(JobOnboardingBanner jobOnboardingBanner, String str, String str2, DeepLink deepLink, Image image, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = jobOnboardingBanner.title;
        }
        if ((i12 & 2) != 0) {
            str2 = jobOnboardingBanner.description;
        }
        if ((i12 & 4) != 0) {
            deepLink = jobOnboardingBanner.deeplink;
        }
        if ((i12 & 8) != 0) {
            image = jobOnboardingBanner.images;
        }
        return jobOnboardingBanner.copy(str, str2, deepLink, image);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final Image getImages() {
        return this.images;
    }

    @k
    public final JobOnboardingBanner copy(@k String title, @k String description, @k DeepLink deeplink, @k Image images) {
        return new JobOnboardingBanner(title, description, deeplink, images);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JobOnboardingBanner)) {
            return false;
        }
        JobOnboardingBanner jobOnboardingBanner = (JobOnboardingBanner) other;
        return L.f(this.title, jobOnboardingBanner.title) && L.f(this.description, jobOnboardingBanner.description) && L.f(this.deeplink, jobOnboardingBanner.deeplink) && L.f(this.images, jobOnboardingBanner.images);
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final Image getImages() {
        return this.images;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.images.hashCode() + a.e(this.deeplink, H.d(this.title.hashCode() * 31, 31, this.description), 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("JobOnboardingBanner(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", images=");
        return AK.c.o(sb2, this.images, ')');
    }
}
