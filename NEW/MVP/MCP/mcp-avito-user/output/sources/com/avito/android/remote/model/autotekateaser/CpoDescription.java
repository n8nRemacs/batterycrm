package com.avito.android.remote.model.autotekateaser;

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

/* compiled from: AutotekaCpoTeaser.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b*\u0010\u0010¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/CpoDescription;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/autotekateaser/CpoLogo;", "logo", "Lcom/avito/android/remote/model/autotekateaser/CpoIcon;", "icon", "", "title", "content", "<init>", "(Lcom/avito/android/remote/model/autotekateaser/CpoLogo;Lcom/avito/android/remote/model/autotekateaser/CpoIcon;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/autotekateaser/CpoLogo;", "component2", "()Lcom/avito/android/remote/model/autotekateaser/CpoIcon;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/avito/android/remote/model/autotekateaser/CpoLogo;Lcom/avito/android/remote/model/autotekateaser/CpoIcon;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/autotekateaser/CpoDescription;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/autotekateaser/CpoLogo;", "getLogo", "Lcom/avito/android/remote/model/autotekateaser/CpoIcon;", "getIcon", "Ljava/lang/String;", "getTitle", "getContent", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CpoDescription implements Parcelable {

    @k
    public static final Parcelable.Creator<CpoDescription> CREATOR = new Creator();

    @c("content")
    @k
    private final String content;

    @c("icon")
    @l
    private final CpoIcon icon;

    @c("logo")
    @k
    private final CpoLogo logo;

    @c("title")
    @k
    private final String title;

    /* compiled from: AutotekaCpoTeaser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CpoDescription> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CpoDescription createFromParcel(@k Parcel parcel) {
            return new CpoDescription(CpoLogo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CpoIcon.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CpoDescription[] newArray(int i12) {
            return new CpoDescription[i12];
        }
    }

    public CpoDescription(@k CpoLogo cpoLogo, @l CpoIcon cpoIcon, @k String str, @k String str2) {
        this.logo = cpoLogo;
        this.icon = cpoIcon;
        this.title = str;
        this.content = str2;
    }

    public static /* synthetic */ CpoDescription copy$default(CpoDescription cpoDescription, CpoLogo cpoLogo, CpoIcon cpoIcon, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            cpoLogo = cpoDescription.logo;
        }
        if ((i12 & 2) != 0) {
            cpoIcon = cpoDescription.icon;
        }
        if ((i12 & 4) != 0) {
            str = cpoDescription.title;
        }
        if ((i12 & 8) != 0) {
            str2 = cpoDescription.content;
        }
        return cpoDescription.copy(cpoLogo, cpoIcon, str, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final CpoLogo getLogo() {
        return this.logo;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final CpoIcon getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @k
    public final CpoDescription copy(@k CpoLogo logo, @l CpoIcon icon, @k String title, @k String content) {
        return new CpoDescription(logo, icon, title, content);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CpoDescription)) {
            return false;
        }
        CpoDescription cpoDescription = (CpoDescription) other;
        return L.f(this.logo, cpoDescription.logo) && L.f(this.icon, cpoDescription.icon) && L.f(this.title, cpoDescription.title) && L.f(this.content, cpoDescription.content);
    }

    @k
    public final String getContent() {
        return this.content;
    }

    @l
    public final CpoIcon getIcon() {
        return this.icon;
    }

    @k
    public final CpoLogo getLogo() {
        return this.logo;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.logo.hashCode() * 31;
        CpoIcon cpoIcon = this.icon;
        return this.content.hashCode() + H.d((iHashCode + (cpoIcon == null ? 0 : cpoIcon.hashCode())) * 31, 31, this.title);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CpoDescription(logo=");
        sb2.append(this.logo);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", content=");
        return C22026a.c(sb2, this.content, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.logo.writeToParcel(parcel, flags);
        CpoIcon cpoIcon = this.icon;
        if (cpoIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cpoIcon.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.content);
    }
}
