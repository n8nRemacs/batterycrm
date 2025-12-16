package com.avito.android.remote.model.auto_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectParametersV3.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV3Badge;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/Image;", "image", "color", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Lcom/avito/android/remote/model/Image;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;Ljava/lang/String;)Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV3Badge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/remote/model/Image;", "getImage", "getColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutoSelectParametersV3Badge implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoSelectParametersV3Badge> CREATOR = new Creator();

    @c("color")
    @k
    private final String color;

    @c("description")
    @k
    private final AttributedText description;

    @c("image")
    @k
    private final Image image;

    @c("title")
    @k
    private final String title;

    /* compiled from: AutoSelectParametersV3.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoSelectParametersV3Badge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectParametersV3Badge createFromParcel(@k Parcel parcel) {
            return new AutoSelectParametersV3Badge(parcel.readString(), (AttributedText) parcel.readParcelable(AutoSelectParametersV3Badge.class.getClassLoader()), (Image) parcel.readParcelable(AutoSelectParametersV3Badge.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectParametersV3Badge[] newArray(int i12) {
            return new AutoSelectParametersV3Badge[i12];
        }
    }

    public AutoSelectParametersV3Badge(@k String str, @k AttributedText attributedText, @k Image image, @k String str2) {
        this.title = str;
        this.description = attributedText;
        this.image = image;
        this.color = str2;
    }

    public static /* synthetic */ AutoSelectParametersV3Badge copy$default(AutoSelectParametersV3Badge autoSelectParametersV3Badge, String str, AttributedText attributedText, Image image, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = autoSelectParametersV3Badge.title;
        }
        if ((i12 & 2) != 0) {
            attributedText = autoSelectParametersV3Badge.description;
        }
        if ((i12 & 4) != 0) {
            image = autoSelectParametersV3Badge.image;
        }
        if ((i12 & 8) != 0) {
            str2 = autoSelectParametersV3Badge.color;
        }
        return autoSelectParametersV3Badge.copy(str, attributedText, image, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @k
    public final AutoSelectParametersV3Badge copy(@k String title, @k AttributedText description, @k Image image, @k String color) {
        return new AutoSelectParametersV3Badge(title, description, image, color);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoSelectParametersV3Badge)) {
            return false;
        }
        AutoSelectParametersV3Badge autoSelectParametersV3Badge = (AutoSelectParametersV3Badge) other;
        return L.f(this.title, autoSelectParametersV3Badge.title) && L.f(this.description, autoSelectParametersV3Badge.description) && L.f(this.image, autoSelectParametersV3Badge.image) && L.f(this.color, autoSelectParametersV3Badge.color);
    }

    @k
    public final String getColor() {
        return this.color;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.color.hashCode() + a.g(this.image, a.b(this.title.hashCode() * 31, 31, this.description), 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectParametersV3Badge(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", color=");
        return C22026a.c(sb2, this.color, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.description, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.color);
    }
}
