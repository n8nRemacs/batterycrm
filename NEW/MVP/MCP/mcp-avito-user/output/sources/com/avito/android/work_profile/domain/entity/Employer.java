package com.avito.android.work_profile.domain.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AppliesToVacancy.kt */
@d
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JH\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b.\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0015¨\u00061"}, d2 = {"Lcom/avito/android/work_profile/domain/entity/Employer;", "Landroid/os/Parcelable;", "Lcom/avito/android/work_profile/domain/entity/BadgeBar;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "", "description", "Lcom/avito/android/remote/model/Image;", "logo", "name", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/work_profile/domain/entity/BadgeBar;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/work_profile/domain/entity/BadgeBar;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/Image;", "component4", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/work_profile/domain/entity/BadgeBar;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/work_profile/domain/entity/Employer;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/work_profile/domain/entity/BadgeBar;", "getBadgeBar", "Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/Image;", "getLogo", "getName", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Employer implements Parcelable {

    @k
    public static final Parcelable.Creator<Employer> CREATOR = new a();

    @l
    private final BadgeBar badgeBar;

    @l
    private final String description;

    @l
    private final Image logo;

    @k
    private final String name;

    @k
    private final DeepLink uri;

    /* compiled from: AppliesToVacancy.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Employer> {
        @Override // android.os.Parcelable.Creator
        public final Employer createFromParcel(Parcel parcel) {
            return new Employer(parcel.readInt() == 0 ? null : BadgeBar.CREATOR.createFromParcel(parcel), parcel.readString(), (Image) parcel.readParcelable(Employer.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(Employer.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Employer[] newArray(int i12) {
            return new Employer[i12];
        }
    }

    public Employer(@l BadgeBar badgeBar, @l String str, @l Image image, @k String str2, @k DeepLink deepLink) {
        this.badgeBar = badgeBar;
        this.description = str;
        this.logo = image;
        this.name = str2;
        this.uri = deepLink;
    }

    public static /* synthetic */ Employer copy$default(Employer employer, BadgeBar badgeBar, String str, Image image, String str2, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            badgeBar = employer.badgeBar;
        }
        if ((i12 & 2) != 0) {
            str = employer.description;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            image = employer.logo;
        }
        Image image2 = image;
        if ((i12 & 8) != 0) {
            str2 = employer.name;
        }
        String str4 = str2;
        if ((i12 & 16) != 0) {
            deepLink = employer.uri;
        }
        return employer.copy(badgeBar, str3, image2, str4, deepLink);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final BadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Image getLogo() {
        return this.logo;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @k
    public final Employer copy(@l BadgeBar badgeBar, @l String description, @l Image logo, @k String name, @k DeepLink uri) {
        return new Employer(badgeBar, description, logo, name, uri);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Employer)) {
            return false;
        }
        Employer employer = (Employer) other;
        return L.f(this.badgeBar, employer.badgeBar) && L.f(this.description, employer.description) && L.f(this.logo, employer.logo) && L.f(this.name, employer.name) && L.f(this.uri, employer.uri);
    }

    @l
    public final BadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final Image getLogo() {
        return this.logo;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final DeepLink getUri() {
        return this.uri;
    }

    public int hashCode() {
        BadgeBar badgeBar = this.badgeBar;
        int iHashCode = (badgeBar == null ? 0 : badgeBar.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.logo;
        return this.uri.hashCode() + H.d((iHashCode2 + (image != null ? image.hashCode() : 0)) * 31, 31, this.name);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Employer(badgeBar=");
        sb2.append(this.badgeBar);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", logo=");
        sb2.append(this.logo);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.uri, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        BadgeBar badgeBar = this.badgeBar;
        if (badgeBar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgeBar.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.description);
        parcel.writeParcelable(this.logo, flags);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.uri, flags);
    }
}
