package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BrandingAdvantages.kt */
@d
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/BrandingAdvantagesDescription;", "Landroid/os/Parcelable;", "", "text", "", "maxLines", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/avito/android/remote/model/BrandingAdvantagesDescription;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "I", "getMaxLines", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BrandingAdvantagesDescription implements Parcelable {

    @k
    public static final Parcelable.Creator<BrandingAdvantagesDescription> CREATOR = new Creator();
    private final int maxLines;

    @k
    private final String text;

    /* compiled from: BrandingAdvantages.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BrandingAdvantagesDescription> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BrandingAdvantagesDescription createFromParcel(@k Parcel parcel) {
            return new BrandingAdvantagesDescription(parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BrandingAdvantagesDescription[] newArray(int i12) {
            return new BrandingAdvantagesDescription[i12];
        }
    }

    public BrandingAdvantagesDescription(@k String str, int i12) {
        this.text = str;
        this.maxLines = i12;
    }

    public static /* synthetic */ BrandingAdvantagesDescription copy$default(BrandingAdvantagesDescription brandingAdvantagesDescription, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = brandingAdvantagesDescription.text;
        }
        if ((i13 & 2) != 0) {
            i12 = brandingAdvantagesDescription.maxLines;
        }
        return brandingAdvantagesDescription.copy(str, i12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    @k
    public final BrandingAdvantagesDescription copy(@k String text, int maxLines) {
        return new BrandingAdvantagesDescription(text, maxLines);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandingAdvantagesDescription)) {
            return false;
        }
        BrandingAdvantagesDescription brandingAdvantagesDescription = (BrandingAdvantagesDescription) other;
        return L.f(this.text, brandingAdvantagesDescription.text) && this.maxLines == brandingAdvantagesDescription.maxLines;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxLines) + (this.text.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BrandingAdvantagesDescription(text=");
        sb2.append(this.text);
        sb2.append(", maxLines=");
        return r.t(sb2, this.maxLines, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeInt(this.maxLines);
    }
}
