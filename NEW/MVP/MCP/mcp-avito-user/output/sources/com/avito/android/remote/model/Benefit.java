package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealExpertBlock.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/Benefit;", "Landroid/os/Parcelable;", "", "text", "iconName", "", "needRightIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/avito/android/remote/model/Benefit;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getIconName", "Z", "getNeedRightIcon", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Benefit implements Parcelable {

    @k
    public static final Parcelable.Creator<Benefit> CREATOR = new Creator();

    @c("icon")
    @k
    private final String iconName;

    @c("needRightIcon")
    private final boolean needRightIcon;

    @c("text")
    @k
    private final String text;

    /* compiled from: ComfortableDealExpertBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Benefit> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Benefit createFromParcel(@k Parcel parcel) {
            return new Benefit(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Benefit[] newArray(int i12) {
            return new Benefit[i12];
        }
    }

    public Benefit(@k String str, @k String str2, boolean z12) {
        this.text = str;
        this.iconName = str2;
        this.needRightIcon = z12;
    }

    public static /* synthetic */ Benefit copy$default(Benefit benefit, String str, String str2, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = benefit.text;
        }
        if ((i12 & 2) != 0) {
            str2 = benefit.iconName;
        }
        if ((i12 & 4) != 0) {
            z12 = benefit.needRightIcon;
        }
        return benefit.copy(str, str2, z12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNeedRightIcon() {
        return this.needRightIcon;
    }

    @k
    public final Benefit copy(@k String text, @k String iconName, boolean needRightIcon) {
        return new Benefit(text, iconName, needRightIcon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Benefit)) {
            return false;
        }
        Benefit benefit = (Benefit) other;
        return L.f(this.text, benefit.text) && L.f(this.iconName, benefit.iconName) && this.needRightIcon == benefit.needRightIcon;
    }

    @k
    public final String getIconName() {
        return this.iconName;
    }

    public final boolean getNeedRightIcon() {
        return this.needRightIcon;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Boolean.hashCode(this.needRightIcon) + H.d(this.text.hashCode() * 31, 31, this.iconName);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Benefit(text=");
        sb2.append(this.text);
        sb2.append(", iconName=");
        sb2.append(this.iconName);
        sb2.append(", needRightIcon=");
        return r.x(sb2, this.needRightIcon, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeString(this.iconName);
        parcel.writeInt(this.needRightIcon ? 1 : 0);
    }
}
