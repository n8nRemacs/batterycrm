package com.avito.android.work_profile.domain.entity;

import Y61.k;
import Y61.l;
import aQ0.AbstractC19808b;
import aQ0.C19807a;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AppliesToVacancy.kt */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011¨\u0006$"}, d2 = {"Lcom/avito/android/work_profile/domain/entity/AppliesBanner;", "LaQ0/b;", "", "title", "subtitle", "Lcom/avito/android/remote/model/UniversalImage;", "image", "LaQ0/a;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;LaQ0/a;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/UniversalImage;", "component4", "()LaQ0/a;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;LaQ0/a;)Lcom/avito/android/work_profile/domain/entity/AppliesBanner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "LaQ0/a;", "getButton", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AppliesBanner extends AbstractC19808b {

    @k
    private final C19807a button;

    @k
    private final UniversalImage image;

    @k
    private final String subtitle;

    @k
    private final String title;

    public AppliesBanner(@k String str, @k String str2, @k UniversalImage universalImage, @k C19807a c19807a) {
        super(null);
        this.title = str;
        this.subtitle = str2;
        this.image = universalImage;
        this.button = c19807a;
    }

    public static /* synthetic */ AppliesBanner copy$default(AppliesBanner appliesBanner, String str, String str2, UniversalImage universalImage, C19807a c19807a, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = appliesBanner.title;
        }
        if ((i12 & 2) != 0) {
            str2 = appliesBanner.subtitle;
        }
        if ((i12 & 4) != 0) {
            universalImage = appliesBanner.image;
        }
        if ((i12 & 8) != 0) {
            c19807a = appliesBanner.button;
        }
        return appliesBanner.copy(str, str2, universalImage, c19807a);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final C19807a getButton() {
        return this.button;
    }

    @k
    public final AppliesBanner copy(@k String title, @k String subtitle, @k UniversalImage image, @k C19807a button) {
        return new AppliesBanner(title, subtitle, image, button);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppliesBanner)) {
            return false;
        }
        AppliesBanner appliesBanner = (AppliesBanner) other;
        return L.f(this.title, appliesBanner.title) && L.f(this.subtitle, appliesBanner.subtitle) && L.f(this.image, appliesBanner.image) && L.f(this.button, appliesBanner.button);
    }

    @k
    public final C19807a getButton() {
        return this.button;
    }

    @k
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.button.hashCode() + a.a(H.d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.image);
    }

    @k
    public String toString() {
        return "AppliesBanner(title=" + this.title + ", subtitle=" + this.subtitle + ", image=" + this.image + ", button=" + this.button + ')';
    }
}
