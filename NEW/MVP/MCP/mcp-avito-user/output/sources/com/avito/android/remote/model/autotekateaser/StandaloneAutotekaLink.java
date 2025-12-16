package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaTeaserItemResponse.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/StandaloneAutotekaLink;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/autotekateaser/StandaloneAutotekaLink$AgreementLink;", "link", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/StandaloneAutotekaLink$AgreementLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/autotekateaser/StandaloneAutotekaLink$AgreementLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/StandaloneAutotekaLink$AgreementLink;)Lcom/avito/android/remote/model/autotekateaser/StandaloneAutotekaLink;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/autotekateaser/StandaloneAutotekaLink$AgreementLink;", "getLink", "AgreementLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StandaloneAutotekaLink implements Parcelable {

    @k
    public static final Parcelable.Creator<StandaloneAutotekaLink> CREATOR = new Creator();

    @c("link")
    @k
    private final AgreementLink link;

    @c("text")
    @k
    private final String text;

    /* compiled from: AutotekaTeaserItemResponse.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/StandaloneAutotekaLink$AgreementLink;", "Landroid/os/Parcelable;", "", "text", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/autotekateaser/StandaloneAutotekaLink$AgreementLink;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getUrl", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AgreementLink implements Parcelable {

        @k
        public static final Parcelable.Creator<AgreementLink> CREATOR = new Creator();

        @c("text")
        @k
        private final String text;

        @c(ContextActionHandler.Link.URL)
        @k
        private final String url;

        /* compiled from: AutotekaTeaserItemResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AgreementLink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AgreementLink createFromParcel(@k Parcel parcel) {
                return new AgreementLink(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AgreementLink[] newArray(int i12) {
                return new AgreementLink[i12];
            }
        }

        public AgreementLink(@k String str, @k String str2) {
            this.text = str;
            this.url = str2;
        }

        public static /* synthetic */ AgreementLink copy$default(AgreementLink agreementLink, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = agreementLink.text;
            }
            if ((i12 & 2) != 0) {
                str2 = agreementLink.url;
            }
            return agreementLink.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @k
        public final AgreementLink copy(@k String text, @k String url) {
            return new AgreementLink(text, url);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AgreementLink)) {
                return false;
            }
            AgreementLink agreementLink = (AgreementLink) other;
            return L.f(this.text, agreementLink.text) && L.f(this.url, agreementLink.url);
        }

        @k
        public final String getText() {
            return this.text;
        }

        @k
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode() + (this.text.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AgreementLink(text=");
            sb2.append(this.text);
            sb2.append(", url=");
            return C22026a.c(sb2, this.url, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: AutotekaTeaserItemResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StandaloneAutotekaLink> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StandaloneAutotekaLink createFromParcel(@k Parcel parcel) {
            return new StandaloneAutotekaLink(parcel.readString(), AgreementLink.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StandaloneAutotekaLink[] newArray(int i12) {
            return new StandaloneAutotekaLink[i12];
        }
    }

    public StandaloneAutotekaLink(@k String str, @k AgreementLink agreementLink) {
        this.text = str;
        this.link = agreementLink;
    }

    public static /* synthetic */ StandaloneAutotekaLink copy$default(StandaloneAutotekaLink standaloneAutotekaLink, String str, AgreementLink agreementLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = standaloneAutotekaLink.text;
        }
        if ((i12 & 2) != 0) {
            agreementLink = standaloneAutotekaLink.link;
        }
        return standaloneAutotekaLink.copy(str, agreementLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AgreementLink getLink() {
        return this.link;
    }

    @k
    public final StandaloneAutotekaLink copy(@k String text, @k AgreementLink link) {
        return new StandaloneAutotekaLink(text, link);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StandaloneAutotekaLink)) {
            return false;
        }
        StandaloneAutotekaLink standaloneAutotekaLink = (StandaloneAutotekaLink) other;
        return L.f(this.text, standaloneAutotekaLink.text) && L.f(this.link, standaloneAutotekaLink.link);
    }

    @k
    public final AgreementLink getLink() {
        return this.link;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.link.hashCode() + (this.text.hashCode() * 31);
    }

    @k
    public String toString() {
        return "StandaloneAutotekaLink(text=" + this.text + ", link=" + this.link + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        this.link.writeToParcel(parcel, flags);
    }
}
