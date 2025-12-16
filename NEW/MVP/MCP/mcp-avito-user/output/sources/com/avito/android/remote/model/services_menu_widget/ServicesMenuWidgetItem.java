package com.avito.android.remote.model.services_menu_widget;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;

/* compiled from: ServicesMenuWidget.kt */
@d
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/services_menu_widget/ServicesMenuWidgetItem;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/services_menu_widget/ServicesMenuWidgetItemAction;", "action", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/services_menu_widget/ServicesMenuWidgetItemAction;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/services_menu_widget/ServicesMenuWidgetItemAction;", "getAction", "()Lcom/avito/android/remote/model/services_menu_widget/ServicesMenuWidgetItemAction;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ServicesMenuWidgetItem implements Parcelable {

    @k
    public static final Parcelable.Creator<ServicesMenuWidgetItem> CREATOR = new Creator();

    @k
    private final ServicesMenuWidgetItemAction action;

    @k
    private final UniversalImage image;

    @k
    private final String title;

    /* compiled from: ServicesMenuWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ServicesMenuWidgetItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServicesMenuWidgetItem createFromParcel(@k Parcel parcel) {
            return new ServicesMenuWidgetItem(parcel.readString(), (UniversalImage) parcel.readParcelable(ServicesMenuWidgetItem.class.getClassLoader()), ServicesMenuWidgetItemAction.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServicesMenuWidgetItem[] newArray(int i12) {
            return new ServicesMenuWidgetItem[i12];
        }
    }

    public ServicesMenuWidgetItem(@k String str, @k UniversalImage universalImage, @k ServicesMenuWidgetItemAction servicesMenuWidgetItemAction) {
        this.title = str;
        this.image = universalImage;
        this.action = servicesMenuWidgetItemAction;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final ServicesMenuWidgetItemAction getAction() {
        return this.action;
    }

    @k
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.image, flags);
        this.action.writeToParcel(parcel, flags);
    }
}
