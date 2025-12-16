package com.avito.android.beduin.common.component.albums;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.image.OverlayStyle;
import com.avito.android.beduin.common.container.Corners;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeduinAlbumComponentModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/avito/android/beduin/common/component/albums/AlbumElement;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/beduin/common/container/Corners;", "corners", "Lcom/avito/android/beduin/common/component/image/OverlayStyle;", "overlay", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/beduin/common/container/Corners;Lcom/avito/android/beduin/common/component/image/OverlayStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Lcom/avito/android/beduin/common/container/Corners;", "getCorners", "()Lcom/avito/android/beduin/common/container/Corners;", "Lcom/avito/android/beduin/common/component/image/OverlayStyle;", "getOverlay", "()Lcom/avito/android/beduin/common/component/image/OverlayStyle;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AlbumElement implements Parcelable {

    @k
    public static final Parcelable.Creator<AlbumElement> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final Corners corners;

    @k
    private final Image image;

    @l
    private final OverlayStyle overlay;

    @l
    private final AttributedText text;

    /* compiled from: BeduinAlbumComponentModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AlbumElement> {
        @Override // android.os.Parcelable.Creator
        public final AlbumElement createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Image image = (Image) parcel.readParcelable(AlbumElement.class.getClassLoader());
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AlbumElement.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(AlbumElement.class, parcel, arrayList, iL2, 1);
                }
            }
            return new AlbumElement(image, attributedText, arrayList, parcel.readInt() == 0 ? null : Corners.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OverlayStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumElement[] newArray(int i12) {
            return new AlbumElement[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlbumElement(@k Image image, @l AttributedText attributedText, @l List<? extends BeduinAction> list, @l Corners corners, @l OverlayStyle overlayStyle) {
        this.image = image;
        this.text = attributedText;
        this.actions = list;
        this.corners = corners;
        this.overlay = overlayStyle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public final Corners getCorners() {
        return this.corners;
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    @l
    public final OverlayStyle getOverlay() {
        return this.overlay;
    }

    @l
    public final AttributedText getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.text, flags);
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Corners corners = this.corners;
        if (corners == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            corners.writeToParcel(parcel, flags);
        }
        OverlayStyle overlayStyle = this.overlay;
        if (overlayStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            overlayStyle.writeToParcel(parcel, flags);
        }
    }
}
