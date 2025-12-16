package com.avito.android.remote.model.resizable_service_widget;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;

/* compiled from: ResizableServiceWidget.kt */
@d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/resizable_service_widget/ResizableServiceWidgetItem;", "Landroid/os/Parcelable;", "", "title", "subTitle1", "subTitle2", "Lcom/avito/android/remote/model/UniversalImage;", "iconUrls", "", "sizeWeight", "Lcom/avito/android/remote/model/resizable_service_widget/ResizableServiceWidgetItemBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/remote/model/resizable_service_widget/ResizableServiceWidgetItemAction;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;ILcom/avito/android/remote/model/resizable_service_widget/ResizableServiceWidgetItemBackground;Lcom/avito/android/remote/model/resizable_service_widget/ResizableServiceWidgetItemAction;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubTitle1", "getSubTitle2", "Lcom/avito/android/remote/model/UniversalImage;", "getIconUrls", "()Lcom/avito/android/remote/model/UniversalImage;", "I", "getSizeWeight", "Lcom/avito/android/remote/model/resizable_service_widget/ResizableServiceWidgetItemBackground;", "getBackground", "()Lcom/avito/android/remote/model/resizable_service_widget/ResizableServiceWidgetItemBackground;", "Lcom/avito/android/remote/model/resizable_service_widget/ResizableServiceWidgetItemAction;", "getAction", "()Lcom/avito/android/remote/model/resizable_service_widget/ResizableServiceWidgetItemAction;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ResizableServiceWidgetItem implements Parcelable {

    @k
    public static final Parcelable.Creator<ResizableServiceWidgetItem> CREATOR = new Creator();

    @k
    private final ResizableServiceWidgetItemAction action;

    @l
    private final ResizableServiceWidgetItemBackground background;

    @l
    private final UniversalImage iconUrls;
    private final int sizeWeight;

    @l
    private final String subTitle1;

    @l
    private final String subTitle2;

    @k
    private final String title;

    /* compiled from: ResizableServiceWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ResizableServiceWidgetItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ResizableServiceWidgetItem createFromParcel(@k Parcel parcel) {
            return new ResizableServiceWidgetItem(parcel.readString(), parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(ResizableServiceWidgetItem.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : ResizableServiceWidgetItemBackground.CREATOR.createFromParcel(parcel), ResizableServiceWidgetItemAction.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ResizableServiceWidgetItem[] newArray(int i12) {
            return new ResizableServiceWidgetItem[i12];
        }
    }

    public ResizableServiceWidgetItem(@k String str, @l String str2, @l String str3, @l UniversalImage universalImage, int i12, @l ResizableServiceWidgetItemBackground resizableServiceWidgetItemBackground, @k ResizableServiceWidgetItemAction resizableServiceWidgetItemAction) {
        this.title = str;
        this.subTitle1 = str2;
        this.subTitle2 = str3;
        this.iconUrls = universalImage;
        this.sizeWeight = i12;
        this.background = resizableServiceWidgetItemBackground;
        this.action = resizableServiceWidgetItemAction;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final ResizableServiceWidgetItemAction getAction() {
        return this.action;
    }

    @l
    public final ResizableServiceWidgetItemBackground getBackground() {
        return this.background;
    }

    @l
    public final UniversalImage getIconUrls() {
        return this.iconUrls;
    }

    public final int getSizeWeight() {
        return this.sizeWeight;
    }

    @l
    public final String getSubTitle1() {
        return this.subTitle1;
    }

    @l
    public final String getSubTitle2() {
        return this.subTitle2;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle1);
        parcel.writeString(this.subTitle2);
        parcel.writeParcelable(this.iconUrls, flags);
        parcel.writeInt(this.sizeWeight);
        ResizableServiceWidgetItemBackground resizableServiceWidgetItemBackground = this.background;
        if (resizableServiceWidgetItemBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            resizableServiceWidgetItemBackground.writeToParcel(parcel, flags);
        }
        this.action.writeToParcel(parcel, flags);
    }
}
