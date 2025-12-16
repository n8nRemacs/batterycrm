package com.avito.android.remote.model.fmp.util;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: Background.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/fmp/util/Background;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "solid", "", "gradient", "", "cornerRadius", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalImage;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getSolid", "()Lcom/avito/android/remote/model/UniversalColor;", "Ljava/lang/String;", "getGradient", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getCornerRadius", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Background implements Parcelable {

    @k
    public static final Parcelable.Creator<Background> CREATOR = new Creator();

    @c("cornerRadius")
    @l
    private final Integer cornerRadius;

    @c("gradient")
    @l
    private final String gradient;

    @c("image")
    @l
    private final UniversalImage image;

    @c("solid")
    @l
    private final UniversalColor solid;

    /* compiled from: Background.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Background> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Background createFromParcel(@k Parcel parcel) {
            return new Background((UniversalColor) parcel.readParcelable(Background.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalImage) parcel.readParcelable(Background.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Background[] newArray(int i12) {
            return new Background[i12];
        }
    }

    public Background(@l UniversalColor universalColor, @l String str, @l Integer num, @l UniversalImage universalImage) {
        this.solid = universalColor;
        this.gradient = str;
        this.cornerRadius = num;
        this.image = universalImage;
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
    public final String getGradient() {
        return this.gradient;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final UniversalColor getSolid() {
        return this.solid;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.solid, flags);
        parcel.writeString(this.gradient);
        Integer num = this.cornerRadius;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.image, flags);
    }
}
