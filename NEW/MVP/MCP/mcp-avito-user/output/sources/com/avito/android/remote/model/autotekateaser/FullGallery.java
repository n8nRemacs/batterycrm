package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NewDesignGallery.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/FullGallery;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/autotekateaser/AutotekaImage;", "image", "Lcom/avito/android/remote/model/autotekateaser/AutotekaButton;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/AutotekaImage;Lcom/avito/android/remote/model/autotekateaser/AutotekaButton;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaImage;", "component4", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaButton;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/AutotekaImage;Lcom/avito/android/remote/model/autotekateaser/AutotekaButton;)Lcom/avito/android/remote/model/autotekateaser/FullGallery;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/autotekateaser/AutotekaImage;", "getImage", "Lcom/avito/android/remote/model/autotekateaser/AutotekaButton;", "getButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FullGallery implements Parcelable {

    @k
    public static final Parcelable.Creator<FullGallery> CREATOR = new Creator();

    @c("button")
    @k
    private final AutotekaButton button;

    @c("image")
    @k
    private final AutotekaImage image;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: NewDesignGallery.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FullGallery> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FullGallery createFromParcel(@k Parcel parcel) {
            return new FullGallery(parcel.readString(), parcel.readString(), AutotekaImage.CREATOR.createFromParcel(parcel), AutotekaButton.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FullGallery[] newArray(int i12) {
            return new FullGallery[i12];
        }
    }

    public FullGallery(@k String str, @k String str2, @k AutotekaImage autotekaImage, @k AutotekaButton autotekaButton) {
        this.title = str;
        this.subtitle = str2;
        this.image = autotekaImage;
        this.button = autotekaButton;
    }

    public static /* synthetic */ FullGallery copy$default(FullGallery fullGallery, String str, String str2, AutotekaImage autotekaImage, AutotekaButton autotekaButton, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = fullGallery.title;
        }
        if ((i12 & 2) != 0) {
            str2 = fullGallery.subtitle;
        }
        if ((i12 & 4) != 0) {
            autotekaImage = fullGallery.image;
        }
        if ((i12 & 8) != 0) {
            autotekaButton = fullGallery.button;
        }
        return fullGallery.copy(str, str2, autotekaImage, autotekaButton);
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
    public final AutotekaImage getImage() {
        return this.image;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final AutotekaButton getButton() {
        return this.button;
    }

    @k
    public final FullGallery copy(@k String title, @k String subtitle, @k AutotekaImage image, @k AutotekaButton button) {
        return new FullGallery(title, subtitle, image, button);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullGallery)) {
            return false;
        }
        FullGallery fullGallery = (FullGallery) other;
        return L.f(this.title, fullGallery.title) && L.f(this.subtitle, fullGallery.subtitle) && L.f(this.image, fullGallery.image) && L.f(this.button, fullGallery.button);
    }

    @k
    public final AutotekaButton getButton() {
        return this.button;
    }

    @k
    public final AutotekaImage getImage() {
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
        return this.button.hashCode() + ((this.image.hashCode() + H.d(this.title.hashCode() * 31, 31, this.subtitle)) * 31);
    }

    @k
    public String toString() {
        return "FullGallery(title=" + this.title + ", subtitle=" + this.subtitle + ", image=" + this.image + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        this.image.writeToParcel(parcel, flags);
        this.button.writeToParcel(parcel, flags);
    }
}
