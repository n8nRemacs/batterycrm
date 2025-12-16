package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobOnboardingButton.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/JobOnboardingButton;", "", "title", "", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class JobOnboardingButton {

    @c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @c("title")
    @k
    private final String title;

    public JobOnboardingButton(@k String str, @k DeepLink deepLink) {
        this.title = str;
        this.deeplink = deepLink;
    }

    public static /* synthetic */ JobOnboardingButton copy$default(JobOnboardingButton jobOnboardingButton, String str, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = jobOnboardingButton.title;
        }
        if ((i12 & 2) != 0) {
            deepLink = jobOnboardingButton.deeplink;
        }
        return jobOnboardingButton.copy(str, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    public final JobOnboardingButton copy(@k String title, @k DeepLink deeplink) {
        return new JobOnboardingButton(title, deeplink);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JobOnboardingButton)) {
            return false;
        }
        JobOnboardingButton jobOnboardingButton = (JobOnboardingButton) other;
        return L.f(this.title, jobOnboardingButton.title) && L.f(this.deeplink, jobOnboardingButton.deeplink);
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.deeplink.hashCode() + (this.title.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("JobOnboardingButton(title=");
        sb2.append(this.title);
        sb2.append(", deeplink=");
        return a.v(sb2, this.deeplink, ')');
    }
}
