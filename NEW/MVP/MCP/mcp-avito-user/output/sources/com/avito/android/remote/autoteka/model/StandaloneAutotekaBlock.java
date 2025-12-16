package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPurchaseResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/autoteka/model/StandaloneAutotekaBlock;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/autoteka/model/StandaloneAutotekaBlock$StandaloneAutotekaLink;", "standaloneLink", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/autoteka/model/StandaloneAutotekaBlock$StandaloneAutotekaLink;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/autoteka/model/StandaloneAutotekaBlock$StandaloneAutotekaLink;", "c", "()Lcom/avito/android/remote/autoteka/model/StandaloneAutotekaBlock$StandaloneAutotekaLink;", "StandaloneAutotekaLink", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StandaloneAutotekaBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<StandaloneAutotekaBlock> CREATOR = new a();

    @c("description")
    @l
    private final AttributedText description;

    @c("standaloneLink")
    @k
    private final StandaloneAutotekaLink standaloneLink;

    /* compiled from: AutotekaPurchaseResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/autoteka/model/StandaloneAutotekaBlock$StandaloneAutotekaLink;", "Landroid/os/Parcelable;", "", "title", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StandaloneAutotekaLink implements Parcelable {

        @k
        public static final Parcelable.Creator<StandaloneAutotekaLink> CREATOR = new a();

        @c("title")
        @k
        private final String title;

        @c(ContextActionHandler.Link.URL)
        @k
        private final String url;

        /* compiled from: AutotekaPurchaseResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StandaloneAutotekaLink> {
            @Override // android.os.Parcelable.Creator
            public final StandaloneAutotekaLink createFromParcel(Parcel parcel) {
                return new StandaloneAutotekaLink(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StandaloneAutotekaLink[] newArray(int i12) {
                return new StandaloneAutotekaLink[i12];
            }
        }

        public StandaloneAutotekaLink(@k String str, @k String str2) {
            this.title = str;
            this.url = str2;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StandaloneAutotekaLink)) {
                return false;
            }
            StandaloneAutotekaLink standaloneAutotekaLink = (StandaloneAutotekaLink) obj;
            return L.f(this.title, standaloneAutotekaLink.title) && L.f(this.url, standaloneAutotekaLink.url);
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.url.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StandaloneAutotekaLink(title=");
            sb2.append(this.title);
            sb2.append(", url=");
            return C22026a.c(sb2, this.url, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.url);
        }
    }

    /* compiled from: AutotekaPurchaseResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StandaloneAutotekaBlock> {
        @Override // android.os.Parcelable.Creator
        public final StandaloneAutotekaBlock createFromParcel(Parcel parcel) {
            return new StandaloneAutotekaBlock((AttributedText) parcel.readParcelable(StandaloneAutotekaBlock.class.getClassLoader()), StandaloneAutotekaLink.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StandaloneAutotekaBlock[] newArray(int i12) {
            return new StandaloneAutotekaBlock[i12];
        }
    }

    public StandaloneAutotekaBlock(@l AttributedText attributedText, @k StandaloneAutotekaLink standaloneAutotekaLink) {
        this.description = attributedText;
        this.standaloneLink = standaloneAutotekaLink;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final StandaloneAutotekaLink getStandaloneLink() {
        return this.standaloneLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandaloneAutotekaBlock)) {
            return false;
        }
        StandaloneAutotekaBlock standaloneAutotekaBlock = (StandaloneAutotekaBlock) obj;
        return L.f(this.description, standaloneAutotekaBlock.description) && L.f(this.standaloneLink, standaloneAutotekaBlock.standaloneLink);
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    public final int hashCode() {
        AttributedText attributedText = this.description;
        return this.standaloneLink.hashCode() + ((attributedText == null ? 0 : attributedText.hashCode()) * 31);
    }

    @k
    public final String toString() {
        return "StandaloneAutotekaBlock(description=" + this.description + ", standaloneLink=" + this.standaloneLink + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.description, i12);
        this.standaloneLink.writeToParcel(parcel, i12);
    }
}
