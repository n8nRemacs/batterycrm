package com.avito.android.category.element;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CategoryWidgetElement.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/category/element/ImageAction;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_bx-content_widget_category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageAction implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ImageAction> CREATOR = new a();

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.l
    private final DeepLink deepLink;

    /* compiled from: CategoryWidgetElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImageAction> {
        @Override // android.os.Parcelable.Creator
        public final ImageAction createFromParcel(Parcel parcel) {
            return new ImageAction((DeepLink) parcel.readParcelable(ImageAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImageAction[] newArray(int i12) {
            return new ImageAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageAction() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.deepLink, i12);
    }

    public ImageAction(@Y61.l DeepLink deepLink) {
        this.deepLink = deepLink;
    }

    public /* synthetic */ ImageAction(DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : deepLink);
    }
}
