package com.avito.android.remote.cv_phone_actualization_banner;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvPhoneActualizationBanner.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/cv_phone_actualization_banner/CvPhoneActualizationBanner;", "Landroid/os/Parcelable;", "", "title", "subtitle", "", "cvId", "", "Lcom/avito/android/remote/cv_phone_actualization_banner/CvPhoneActualizationBanner$CvPhoneActualizationAction;", "actions", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "J", "c", "()J", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "CvPhoneActualizationAction", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CvPhoneActualizationBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<CvPhoneActualizationBanner> CREATOR = new a();

    @c("actions")
    @k
    private final List<CvPhoneActualizationAction> actions;

    @c("cvId")
    private final long cvId;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: CvPhoneActualizationBanner.kt */
    @d
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/cv_phone_actualization_banner/CvPhoneActualizationBanner$CvPhoneActualizationAction;", "Landroid/os/Parcelable;", "", "title", "type", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getType", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CvPhoneActualizationAction implements Parcelable {

        @k
        public static final Parcelable.Creator<CvPhoneActualizationAction> CREATOR = new a();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final String type;

        /* compiled from: CvPhoneActualizationBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CvPhoneActualizationAction> {
            @Override // android.os.Parcelable.Creator
            public final CvPhoneActualizationAction createFromParcel(Parcel parcel) {
                return new CvPhoneActualizationAction(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(CvPhoneActualizationAction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final CvPhoneActualizationAction[] newArray(int i12) {
                return new CvPhoneActualizationAction[i12];
            }
        }

        public CvPhoneActualizationAction(@k String str, @k String str2, @l DeepLink deepLink) {
            this.title = str;
            this.type = str2;
            this.deepLink = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CvPhoneActualizationAction)) {
                return false;
            }
            CvPhoneActualizationAction cvPhoneActualizationAction = (CvPhoneActualizationAction) obj;
            return L.f(this.title, cvPhoneActualizationAction.title) && L.f(this.type, cvPhoneActualizationAction.type) && L.f(this.deepLink, cvPhoneActualizationAction.deepLink);
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            int iD2 = H.d(this.title.hashCode() * 31, 31, this.type);
            DeepLink deepLink = this.deepLink;
            return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CvPhoneActualizationAction(title=");
            sb2.append(this.title);
            sb2.append(", type=");
            sb2.append(this.type);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.deepLink, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.type);
            parcel.writeParcelable(this.deepLink, i12);
        }
    }

    /* compiled from: CvPhoneActualizationBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvPhoneActualizationBanner> {
        @Override // android.os.Parcelable.Creator
        public final CvPhoneActualizationBanner createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j12 = parcel.readLong();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(CvPhoneActualizationAction.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CvPhoneActualizationBanner(string, string2, j12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CvPhoneActualizationBanner[] newArray(int i12) {
            return new CvPhoneActualizationBanner[i12];
        }
    }

    public CvPhoneActualizationBanner(@k String str, @k String str2, long j12, @k List<CvPhoneActualizationAction> list) {
        this.title = str;
        this.subtitle = str2;
        this.cvId = j12;
        this.actions = list;
    }

    /* renamed from: c, reason: from getter */
    public final long getCvId() {
        return this.cvId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CvPhoneActualizationBanner)) {
            return false;
        }
        CvPhoneActualizationBanner cvPhoneActualizationBanner = (CvPhoneActualizationBanner) obj;
        return L.f(this.title, cvPhoneActualizationBanner.title) && L.f(this.subtitle, cvPhoneActualizationBanner.subtitle) && this.cvId == cvPhoneActualizationBanner.cvId && L.f(this.actions, cvPhoneActualizationBanner.actions);
    }

    @k
    public final List<CvPhoneActualizationAction> getActions() {
        return this.actions;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.actions.hashCode() + r.g(H.d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.cvId);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvPhoneActualizationBanner(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", cvId=");
        sb2.append(this.cvId);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeLong(this.cvId);
        Iterator itJ = C0.j(this.actions, parcel);
        while (itJ.hasNext()) {
            ((CvPhoneActualizationAction) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
