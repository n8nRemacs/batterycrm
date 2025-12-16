package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaTeaserItemResponse.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\t¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/BannerGradient;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "startColor", "centerColor", "endColor", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "component3", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/autotekateaser/BannerGradient;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getStartColor", "getCenterColor", "getEndColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BannerGradient implements Parcelable {

    @k
    public static final Parcelable.Creator<BannerGradient> CREATOR = new Creator();

    @c("centerColor")
    @l
    private final UniversalColor centerColor;

    @c("endColor")
    @k
    private final UniversalColor endColor;

    @c("startColor")
    @k
    private final UniversalColor startColor;

    /* compiled from: AutotekaTeaserItemResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BannerGradient> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BannerGradient createFromParcel(@k Parcel parcel) {
            return new BannerGradient((UniversalColor) parcel.readParcelable(BannerGradient.class.getClassLoader()), (UniversalColor) parcel.readParcelable(BannerGradient.class.getClassLoader()), (UniversalColor) parcel.readParcelable(BannerGradient.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BannerGradient[] newArray(int i12) {
            return new BannerGradient[i12];
        }
    }

    public BannerGradient(@k UniversalColor universalColor, @l UniversalColor universalColor2, @k UniversalColor universalColor3) {
        this.startColor = universalColor;
        this.centerColor = universalColor2;
        this.endColor = universalColor3;
    }

    public static /* synthetic */ BannerGradient copy$default(BannerGradient bannerGradient, UniversalColor universalColor, UniversalColor universalColor2, UniversalColor universalColor3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalColor = bannerGradient.startColor;
        }
        if ((i12 & 2) != 0) {
            universalColor2 = bannerGradient.centerColor;
        }
        if ((i12 & 4) != 0) {
            universalColor3 = bannerGradient.endColor;
        }
        return bannerGradient.copy(universalColor, universalColor2, universalColor3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final UniversalColor getStartColor() {
        return this.startColor;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getCenterColor() {
        return this.centerColor;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getEndColor() {
        return this.endColor;
    }

    @k
    public final BannerGradient copy(@k UniversalColor startColor, @l UniversalColor centerColor, @k UniversalColor endColor) {
        return new BannerGradient(startColor, centerColor, endColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerGradient)) {
            return false;
        }
        BannerGradient bannerGradient = (BannerGradient) other;
        return L.f(this.startColor, bannerGradient.startColor) && L.f(this.centerColor, bannerGradient.centerColor) && L.f(this.endColor, bannerGradient.endColor);
    }

    @l
    public final UniversalColor getCenterColor() {
        return this.centerColor;
    }

    @k
    public final UniversalColor getEndColor() {
        return this.endColor;
    }

    @k
    public final UniversalColor getStartColor() {
        return this.startColor;
    }

    public int hashCode() {
        int iHashCode = this.startColor.hashCode() * 31;
        UniversalColor universalColor = this.centerColor;
        return this.endColor.hashCode() + ((iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BannerGradient(startColor=");
        sb2.append(this.startColor);
        sb2.append(", centerColor=");
        sb2.append(this.centerColor);
        sb2.append(", endColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.endColor, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.startColor, flags);
        parcel.writeParcelable(this.centerColor, flags);
        parcel.writeParcelable(this.endColor, flags);
    }
}
