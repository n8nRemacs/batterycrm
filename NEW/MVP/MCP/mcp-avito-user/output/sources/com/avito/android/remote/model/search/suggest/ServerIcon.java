package com.avito.android.remote.model.search.suggest;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IconSource.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b\f\u0010%¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/search/suggest/ServerIcon;", "Lcom/avito/android/remote/model/search/suggest/IconSource;", "Lcom/avito/android/remote/model/search/suggest/IconSize;", "size", "", "cornerRadius", "Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "darkUri", "Lcom/avito/android/remote/model/search/suggest/IconStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "isMaskImage", "<init>", "(Lcom/avito/android/remote/model/search/suggest/IconSize;Ljava/lang/Integer;Landroid/net/Uri;Landroid/net/Uri;Lcom/avito/android/remote/model/search/suggest/IconStyle;Z)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/search/suggest/IconSize;", "getSize", "()Lcom/avito/android/remote/model/search/suggest/IconSize;", "Ljava/lang/Integer;", "getCornerRadius", "()Ljava/lang/Integer;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "getDarkUri", "Lcom/avito/android/remote/model/search/suggest/IconStyle;", "getStyle", "()Lcom/avito/android/remote/model/search/suggest/IconStyle;", "Z", "()Z", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ServerIcon extends IconSource {

    @k
    public static final Parcelable.Creator<ServerIcon> CREATOR = new Creator();

    @c("cornerRadius")
    @l
    private final Integer cornerRadius;

    @c("darkUri")
    @l
    private final Uri darkUri;

    @c("isMaskImage")
    private final boolean isMaskImage;

    @c("size")
    @l
    private final IconSize size;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final IconStyle style;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final Uri uri;

    /* compiled from: IconSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ServerIcon> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServerIcon createFromParcel(@k Parcel parcel) {
            return new ServerIcon(parcel.readInt() == 0 ? null : IconSize.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Uri) parcel.readParcelable(ServerIcon.class.getClassLoader()), (Uri) parcel.readParcelable(ServerIcon.class.getClassLoader()), parcel.readInt() != 0 ? IconStyle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServerIcon[] newArray(int i12) {
            return new ServerIcon[i12];
        }
    }

    public /* synthetic */ ServerIcon(IconSize iconSize, Integer num, Uri uri, Uri uri2, IconStyle iconStyle, boolean z12, int i12, C42822w c42822w) {
        this(iconSize, num, uri, uri2, (i12 & 16) != 0 ? null : iconStyle, z12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    @l
    public final Uri getDarkUri() {
        return this.darkUri;
    }

    @l
    public final IconSize getSize() {
        return this.size;
    }

    @l
    public final IconStyle getStyle() {
        return this.style;
    }

    @k
    public final Uri getUri() {
        return this.uri;
    }

    /* renamed from: isMaskImage, reason: from getter */
    public final boolean getIsMaskImage() {
        return this.isMaskImage;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        IconSize iconSize = this.size;
        if (iconSize == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconSize.writeToParcel(parcel, flags);
        }
        Integer num = this.cornerRadius;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.uri, flags);
        parcel.writeParcelable(this.darkUri, flags);
        IconStyle iconStyle = this.style;
        if (iconStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconStyle.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isMaskImage ? 1 : 0);
    }

    public ServerIcon(@l IconSize iconSize, @l Integer num, @k Uri uri, @l Uri uri2, @l IconStyle iconStyle, boolean z12) {
        super(null);
        this.size = iconSize;
        this.cornerRadius = num;
        this.uri = uri;
        this.darkUri = uri2;
        this.style = iconStyle;
        this.isMaskImage = z12;
    }
}
