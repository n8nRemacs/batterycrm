package com.avito.android.remote.model.cv;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: CvDisplayWidget.kt */
@d
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b(\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b5\u00104R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\b9\u00108¨\u0006:"}, d2 = {"Lcom/avito/android/remote/model/cv/CvSnippet;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/cv/CvsItemType;", "", "id", "", "title", "Lcom/avito/android/remote/model/Image;", "image", "salary", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "Lcom/avito/android/remote/model/cv/CvStats;", "stats", "", "updatedTime", "Lcom/avito/android/remote/model/cv/CvStatus;", "status", "subStatus", "Lcom/avito/android/deep_linking/links/DeepLink;", "snippetDeeplink", "editDeeplink", "<init>", "(ILjava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Lcom/avito/android/remote/model/cv/CvStats;Ljava/lang/Long;Lcom/avito/android/remote/model/cv/CvStatus;Lcom/avito/android/remote/model/cv/CvStatus;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "getSalary", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "getBadgeBar", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "Lcom/avito/android/remote/model/cv/CvStats;", "getStats", "()Lcom/avito/android/remote/model/cv/CvStats;", "Ljava/lang/Long;", "getUpdatedTime", "()Ljava/lang/Long;", "Lcom/avito/android/remote/model/cv/CvStatus;", "getStatus", "()Lcom/avito/android/remote/model/cv/CvStatus;", "getSubStatus", "Lcom/avito/android/deep_linking/links/DeepLink;", "getSnippetDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getEditDeeplink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CvSnippet implements Parcelable, CvsItemType {

    @k
    public static final Parcelable.Creator<CvSnippet> CREATOR = new Creator();

    @l
    private final SerpBadgeBar badgeBar;

    @c("editUri")
    @l
    private final DeepLink editDeeplink;
    private final int id;

    @l
    private final Image image;

    @k
    private final String salary;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink snippetDeeplink;

    @l
    private final CvStats stats;

    @l
    private final CvStatus status;

    @l
    private final CvStatus subStatus;

    @k
    private final String title;

    @l
    private final Long updatedTime;

    /* compiled from: CvDisplayWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CvSnippet> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CvSnippet createFromParcel(@k Parcel parcel) {
            return new CvSnippet(parcel.readInt(), parcel.readString(), (Image) parcel.readParcelable(CvSnippet.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : SerpBadgeBar.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CvStats.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : CvStatus.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CvStatus.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(CvSnippet.class.getClassLoader()), (DeepLink) parcel.readParcelable(CvSnippet.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CvSnippet[] newArray(int i12) {
            return new CvSnippet[i12];
        }
    }

    public CvSnippet(int i12, @k String str, @l Image image, @k String str2, @l SerpBadgeBar serpBadgeBar, @l CvStats cvStats, @l Long l12, @l CvStatus cvStatus, @l CvStatus cvStatus2, @k DeepLink deepLink, @l DeepLink deepLink2) {
        this.id = i12;
        this.title = str;
        this.image = image;
        this.salary = str2;
        this.badgeBar = serpBadgeBar;
        this.stats = cvStats;
        this.updatedTime = l12;
        this.status = cvStatus;
        this.subStatus = cvStatus2;
        this.snippetDeeplink = deepLink;
        this.editDeeplink = deepLink2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final SerpBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    public final DeepLink getEditDeeplink() {
        return this.editDeeplink;
    }

    public final int getId() {
        return this.id;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @k
    public final String getSalary() {
        return this.salary;
    }

    @k
    public final DeepLink getSnippetDeeplink() {
        return this.snippetDeeplink;
    }

    @l
    public final CvStats getStats() {
        return this.stats;
    }

    @l
    public final CvStatus getStatus() {
        return this.status;
    }

    @l
    public final CvStatus getSubStatus() {
        return this.subStatus;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Long getUpdatedTime() {
        return this.updatedTime;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.salary);
        SerpBadgeBar serpBadgeBar = this.badgeBar;
        if (serpBadgeBar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serpBadgeBar.writeToParcel(parcel, flags);
        }
        CvStats cvStats = this.stats;
        if (cvStats == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cvStats.writeToParcel(parcel, flags);
        }
        Long l12 = this.updatedTime;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        CvStatus cvStatus = this.status;
        if (cvStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cvStatus.writeToParcel(parcel, flags);
        }
        CvStatus cvStatus2 = this.subStatus;
        if (cvStatus2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cvStatus2.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.snippetDeeplink, flags);
        parcel.writeParcelable(this.editDeeplink, flags);
    }
}
