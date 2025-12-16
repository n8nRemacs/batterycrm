package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: AvitoBlogWidget.kt */
@d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/AvitoBlogArticle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/vertical_main/ArticleType;", "type", "", ContextActionHandler.Link.URL, "Lcom/avito/android/remote/model/Image;", "previewImageUrls", "title", MessageBody.Video.VIDEO_ID, "tag", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/remote/model/vertical_main/ArticleType;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/vertical_main/ArticleType;", "getType", "()Lcom/avito/android/remote/model/vertical_main/ArticleType;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "getPreviewImageUrls", "()Lcom/avito/android/remote/model/Image;", "getTitle", "getVideoId", "getTag", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AvitoBlogArticle implements Parcelable {

    @k
    public static final Parcelable.Creator<AvitoBlogArticle> CREATOR = new Creator();

    @k
    private final Image previewImageUrls;

    @l
    private final String tag;

    @k
    private final String title;

    @l
    private final ArticleType type;

    @l
    private final DeepLink uri;

    @k
    private final String url;

    @l
    private final String videoId;

    /* compiled from: AvitoBlogWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvitoBlogArticle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoBlogArticle createFromParcel(@k Parcel parcel) {
            return new AvitoBlogArticle(parcel.readInt() == 0 ? null : ArticleType.CREATOR.createFromParcel(parcel), parcel.readString(), (Image) parcel.readParcelable(AvitoBlogArticle.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AvitoBlogArticle.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoBlogArticle[] newArray(int i12) {
            return new AvitoBlogArticle[i12];
        }
    }

    public AvitoBlogArticle(@l ArticleType articleType, @k String str, @k Image image, @k String str2, @l String str3, @l String str4, @l DeepLink deepLink) {
        this.type = articleType;
        this.url = str;
        this.previewImageUrls = image;
        this.title = str2;
        this.videoId = str3;
        this.tag = str4;
        this.uri = deepLink;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final Image getPreviewImageUrls() {
        return this.previewImageUrls;
    }

    @l
    public final String getTag() {
        return this.tag;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final ArticleType getType() {
        return this.type;
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }

    @k
    public final String getUrl() {
        return this.url;
    }

    @l
    public final String getVideoId() {
        return this.videoId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        ArticleType articleType = this.type;
        if (articleType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            articleType.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.url);
        parcel.writeParcelable(this.previewImageUrls, flags);
        parcel.writeString(this.title);
        parcel.writeString(this.videoId);
        parcel.writeString(this.tag);
        parcel.writeParcelable(this.uri, flags);
    }
}
