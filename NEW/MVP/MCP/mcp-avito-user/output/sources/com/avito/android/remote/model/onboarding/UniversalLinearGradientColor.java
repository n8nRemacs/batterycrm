package com.avito.android.remote.model.onboarding;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OnboradingCarousel.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/onboarding/UniversalLinearGradientColor;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "", "position", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;F)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "()Lcom/avito/android/remote/model/UniversalColor;", "F", "getPosition", "()F", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UniversalLinearGradientColor implements Parcelable {

    @k
    public static final Parcelable.Creator<UniversalLinearGradientColor> CREATOR = new Creator();

    @l
    private final UniversalColor color;
    private final float position;

    /* compiled from: OnboradingCarousel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalLinearGradientColor> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalLinearGradientColor createFromParcel(@k Parcel parcel) {
            return new UniversalLinearGradientColor((UniversalColor) parcel.readParcelable(UniversalLinearGradientColor.class.getClassLoader()), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalLinearGradientColor[] newArray(int i12) {
            return new UniversalLinearGradientColor[i12];
        }
    }

    public UniversalLinearGradientColor(@l UniversalColor universalColor, float f12) {
        this.color = universalColor;
        this.position = f12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final UniversalColor getColor() {
        return this.color;
    }

    public final float getPosition() {
        return this.position;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.color, flags);
        parcel.writeFloat(this.position);
    }

    public /* synthetic */ UniversalLinearGradientColor(UniversalColor universalColor, float f12, int i12, C42822w c42822w) {
        this(universalColor, (i12 & 2) != 0 ? 0.0f : f12);
    }
}
