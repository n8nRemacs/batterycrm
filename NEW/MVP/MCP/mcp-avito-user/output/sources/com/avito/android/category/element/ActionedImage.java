package com.avito.android.category.element;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CategoryWidgetElement.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/category/element/ActionedImage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/category/element/ImageAction;", "action", "Lcom/avito/android/remote/model/UniversalImage;", "universalImage", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/category/element/ImageAction;Lcom/avito/android/remote/model/UniversalImage;)V", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/category/element/ImageAction;", "c", "()Lcom/avito/android/category/element/ImageAction;", "Lcom/avito/android/remote/model/UniversalImage;", "d", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito_bx-content_widget_category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionedImage implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ActionedImage> CREATOR = new a();

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final ImageAction action;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final Image image;

    @com.google.gson.annotations.c("multiThemeImage")
    @Y61.l
    private final UniversalImage universalImage;

    /* compiled from: CategoryWidgetElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionedImage> {
        @Override // android.os.Parcelable.Creator
        public final ActionedImage createFromParcel(Parcel parcel) {
            return new ActionedImage((Image) parcel.readParcelable(ActionedImage.class.getClassLoader()), parcel.readInt() == 0 ? null : ImageAction.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(ActionedImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ActionedImage[] newArray(int i12) {
            return new ActionedImage[i12];
        }
    }

    public ActionedImage() {
        this(null, null, null, 7, null);
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final ImageAction getAction() {
        return this.action;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    public final Image getImage() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.image, i12);
        ImageAction imageAction = this.action;
        if (imageAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageAction.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.universalImage, i12);
    }

    public ActionedImage(@Y61.l Image image, @Y61.l ImageAction imageAction, @Y61.l UniversalImage universalImage) {
        this.image = image;
        this.action = imageAction;
        this.universalImage = universalImage;
    }

    public /* synthetic */ ActionedImage(Image image, ImageAction imageAction, UniversalImage universalImage, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : image, (i12 & 2) != 0 ? null : imageAction, (i12 & 4) != 0 ? null : universalImage);
    }
}
