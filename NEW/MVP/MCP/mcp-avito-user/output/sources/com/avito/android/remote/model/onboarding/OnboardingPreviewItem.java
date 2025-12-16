package com.avito.android.remote.model.onboarding;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: OnboardingPreview.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/onboarding/OnboardingPreviewItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/text/AttributedText;Landroid/net/Uri;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OnboardingPreviewItem implements Parcelable {

    @k
    public static final Parcelable.Creator<OnboardingPreviewItem> CREATOR = new Creator();

    @c("image")
    @l
    private final UniversalImage image;

    @c("title")
    @l
    private final AttributedText title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final Uri uri;

    /* compiled from: OnboardingPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnboardingPreviewItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OnboardingPreviewItem createFromParcel(@k Parcel parcel) {
            return new OnboardingPreviewItem((UniversalImage) parcel.readParcelable(OnboardingPreviewItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(OnboardingPreviewItem.class.getClassLoader()), (Uri) parcel.readParcelable(OnboardingPreviewItem.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OnboardingPreviewItem[] newArray(int i12) {
            return new OnboardingPreviewItem[i12];
        }
    }

    public OnboardingPreviewItem(@l UniversalImage universalImage, @l AttributedText attributedText, @l Uri uri) {
        this.image = universalImage;
        this.title = attributedText;
        this.uri = uri;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    public final Uri getUri() {
        return this.uri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.uri, flags);
    }
}
