package com.avito.android.promo_snippet.models;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: GigPromoSnippetWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/promo_snippet/models/MotivationItemActionButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MotivationItemActionButton implements Parcelable {

    @k
    public static final Parcelable.Creator<MotivationItemActionButton> CREATOR = new a();

    @c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @c("title")
    @k
    private final String title;

    /* compiled from: GigPromoSnippetWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MotivationItemActionButton> {
        @Override // android.os.Parcelable.Creator
        public final MotivationItemActionButton createFromParcel(Parcel parcel) {
            return new MotivationItemActionButton((DeepLink) parcel.readParcelable(MotivationItemActionButton.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MotivationItemActionButton[] newArray(int i12) {
            return new MotivationItemActionButton[i12];
        }
    }

    public MotivationItemActionButton(@k DeepLink deepLink, @k String str) {
        this.deeplink = deepLink;
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.deeplink, i12);
        parcel.writeString(this.title);
    }
}
