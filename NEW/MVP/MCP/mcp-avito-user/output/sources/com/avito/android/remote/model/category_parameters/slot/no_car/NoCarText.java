package com.avito.android.remote.model.category_parameters.slot.no_car;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NoCarText.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarText;", "Landroid/os/Parcelable;", "", "noCarLink", "Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarAttributes;", Navigation.ATTRIBUTES, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarAttributes;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarAttributes;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarAttributes;)Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarText;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getNoCarLink", "Lcom/avito/android/remote/model/category_parameters/slot/no_car/NoCarAttributes;", "getAttributes", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NoCarText implements Parcelable {

    @k
    public static final Parcelable.Creator<NoCarText> CREATOR = new Creator();

    @c(Navigation.ATTRIBUTES)
    @k
    private final NoCarAttributes attributes;

    @c("text")
    @k
    private final String noCarLink;

    /* compiled from: NoCarText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NoCarText> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NoCarText createFromParcel(@k Parcel parcel) {
            return new NoCarText(parcel.readString(), NoCarAttributes.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NoCarText[] newArray(int i12) {
            return new NoCarText[i12];
        }
    }

    public NoCarText(@k String str, @k NoCarAttributes noCarAttributes) {
        this.noCarLink = str;
        this.attributes = noCarAttributes;
    }

    public static /* synthetic */ NoCarText copy$default(NoCarText noCarText, String str, NoCarAttributes noCarAttributes, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = noCarText.noCarLink;
        }
        if ((i12 & 2) != 0) {
            noCarAttributes = noCarText.attributes;
        }
        return noCarText.copy(str, noCarAttributes);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getNoCarLink() {
        return this.noCarLink;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final NoCarAttributes getAttributes() {
        return this.attributes;
    }

    @k
    public final NoCarText copy(@k String noCarLink, @k NoCarAttributes attributes) {
        return new NoCarText(noCarLink, attributes);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoCarText)) {
            return false;
        }
        NoCarText noCarText = (NoCarText) other;
        return L.f(this.noCarLink, noCarText.noCarLink) && L.f(this.attributes, noCarText.attributes);
    }

    @k
    public final NoCarAttributes getAttributes() {
        return this.attributes;
    }

    @k
    public final String getNoCarLink() {
        return this.noCarLink;
    }

    public int hashCode() {
        return this.attributes.hashCode() + (this.noCarLink.hashCode() * 31);
    }

    @k
    public String toString() {
        return "NoCarText(noCarLink=" + this.noCarLink + ", attributes=" + this.attributes + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.noCarLink);
        this.attributes.writeToParcel(parcel, flags);
    }
}
