package com.avito.android.remote.model.user_adverts;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FashionAuthentication.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/user_adverts/FashionAuthBadge;", "Landroid/os/Parcelable;", "", "text", "textColor", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/user_adverts/FashionAuthBadge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getTextColor", "getBackgroundColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FashionAuthBadge implements Parcelable {

    @k
    public static final Parcelable.Creator<FashionAuthBadge> CREATOR = new Creator();

    @c("backgroundColor")
    @k
    private final String backgroundColor;

    @c("text")
    @k
    private final String text;

    @c("textColor")
    @k
    private final String textColor;

    /* compiled from: FashionAuthentication.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FashionAuthBadge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FashionAuthBadge createFromParcel(@k Parcel parcel) {
            return new FashionAuthBadge(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FashionAuthBadge[] newArray(int i12) {
            return new FashionAuthBadge[i12];
        }
    }

    public FashionAuthBadge(@k String str, @k String str2, @k String str3) {
        this.text = str;
        this.textColor = str2;
        this.backgroundColor = str3;
    }

    public static /* synthetic */ FashionAuthBadge copy$default(FashionAuthBadge fashionAuthBadge, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = fashionAuthBadge.text;
        }
        if ((i12 & 2) != 0) {
            str2 = fashionAuthBadge.textColor;
        }
        if ((i12 & 4) != 0) {
            str3 = fashionAuthBadge.backgroundColor;
        }
        return fashionAuthBadge.copy(str, str2, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @k
    public final FashionAuthBadge copy(@k String text, @k String textColor, @k String backgroundColor) {
        return new FashionAuthBadge(text, textColor, backgroundColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FashionAuthBadge)) {
            return false;
        }
        FashionAuthBadge fashionAuthBadge = (FashionAuthBadge) other;
        return L.f(this.text, fashionAuthBadge.text) && L.f(this.textColor, fashionAuthBadge.textColor) && L.f(this.backgroundColor, fashionAuthBadge.backgroundColor);
    }

    @k
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @k
    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return this.backgroundColor.hashCode() + H.d(this.text.hashCode() * 31, 31, this.textColor);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FashionAuthBadge(text=");
        sb2.append(this.text);
        sb2.append(", textColor=");
        sb2.append(this.textColor);
        sb2.append(", backgroundColor=");
        return C22026a.c(sb2, this.backgroundColor, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeString(this.textColor);
        parcel.writeString(this.backgroundColor);
    }
}
