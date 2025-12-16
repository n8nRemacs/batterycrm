package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PromoWidget.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/PromoWidgetConfig;", "Landroid/os/Parcelable;", "", "shouldCropImage", "", "width", "height", "containerWidth", "Lcom/avito/android/remote/model/vertical_main/Placement;", "placement", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/vertical_main/Placement;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getShouldCropImage", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getWidth", "()Ljava/lang/Integer;", "getHeight", "getContainerWidth", "Lcom/avito/android/remote/model/vertical_main/Placement;", "getPlacement", "()Lcom/avito/android/remote/model/vertical_main/Placement;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PromoWidgetConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoWidgetConfig> CREATOR = new Creator();

    @c("containerWidth")
    @l
    private final Integer containerWidth;

    @c("height")
    @l
    private final Integer height;

    @c("placement")
    @l
    private final Placement placement;

    @c("shouldCropImage")
    @l
    private final Boolean shouldCropImage;

    @c("width")
    @l
    private final Integer width;

    /* compiled from: PromoWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromoWidgetConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoWidgetConfig createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PromoWidgetConfig(boolValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Placement.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoWidgetConfig[] newArray(int i12) {
            return new PromoWidgetConfig[i12];
        }
    }

    public PromoWidgetConfig() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Integer getContainerWidth() {
        return this.containerWidth;
    }

    @l
    public final Integer getHeight() {
        return this.height;
    }

    @l
    public final Placement getPlacement() {
        return this.placement;
    }

    @l
    public final Boolean getShouldCropImage() {
        return this.shouldCropImage;
    }

    @l
    public final Integer getWidth() {
        return this.width;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.shouldCropImage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        Integer num3 = this.containerWidth;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
        Placement placement = this.placement;
        if (placement == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            placement.writeToParcel(parcel, flags);
        }
    }

    public PromoWidgetConfig(@l Boolean bool, @l Integer num, @l Integer num2, @l Integer num3, @l Placement placement) {
        this.shouldCropImage = bool;
        this.width = num;
        this.height = num2;
        this.containerWidth = num3;
        this.placement = placement;
    }

    public /* synthetic */ PromoWidgetConfig(Boolean bool, Integer num, Integer num2, Integer num3, Placement placement, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : bool, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : num2, (i12 & 8) != 0 ? null : num3, (i12 & 16) != 0 ? null : placement);
    }
}
