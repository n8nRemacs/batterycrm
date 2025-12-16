package com.avito.android.remote.model.cv;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: CvCreationWidget.kt */
@d
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/cv/CvCreationAction;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/cv/CvCreationIcon;", "icon", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/cv/CvCreationIcon;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/cv/CvCreationIcon;", "getIcon", "()Lcom/avito/android/remote/model/cv/CvCreationIcon;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CvCreationAction implements Parcelable {

    @k
    public static final Parcelable.Creator<CvCreationAction> CREATOR = new Creator();

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deeplink;

    @l
    private final CvCreationIcon icon;

    @k
    private final String title;

    /* compiled from: CvCreationWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CvCreationAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CvCreationAction createFromParcel(@k Parcel parcel) {
            return new CvCreationAction(parcel.readString(), (DeepLink) parcel.readParcelable(CvCreationAction.class.getClassLoader()), parcel.readInt() == 0 ? null : CvCreationIcon.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CvCreationAction[] newArray(int i12) {
            return new CvCreationAction[i12];
        }
    }

    public CvCreationAction(@k String str, @k DeepLink deepLink, @l CvCreationIcon cvCreationIcon) {
        this.title = str;
        this.deeplink = deepLink;
        this.icon = cvCreationIcon;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final CvCreationIcon getIcon() {
        return this.icon;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.deeplink, flags);
        CvCreationIcon cvCreationIcon = this.icon;
        if (cvCreationIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cvCreationIcon.name());
        }
    }
}
