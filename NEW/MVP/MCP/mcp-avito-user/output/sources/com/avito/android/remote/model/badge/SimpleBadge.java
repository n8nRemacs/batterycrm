package com.avito.android.remote.model.badge;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Badge.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ<\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b(\u0010\f¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/badge/SimpleBadge;", "Lcom/avito/android/remote/model/badge/Badge;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/UniversalColor;", "universalTitleColor", "universalBackgroundColor", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;)Lcom/avito/android/remote/model/badge/SimpleBadge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/UniversalColor;", "getUniversalTitleColor", "getUniversalBackgroundColor", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SimpleBadge implements Badge, Parcelable {

    @k
    public static final Parcelable.Creator<SimpleBadge> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @c("title")
    @k
    private final String title;

    @c("backgroundColor")
    @l
    private final UniversalColor universalBackgroundColor;

    @c("titleColor")
    @k
    private final UniversalColor universalTitleColor;

    /* compiled from: Badge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SimpleBadge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SimpleBadge createFromParcel(@k Parcel parcel) {
            return new SimpleBadge(parcel.readString(), (UniversalColor) parcel.readParcelable(SimpleBadge.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SimpleBadge.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SimpleBadge[] newArray(int i12) {
            return new SimpleBadge[i12];
        }
    }

    public SimpleBadge(@k String str, @k UniversalColor universalColor, @l UniversalColor universalColor2, @l String str2) {
        this.title = str;
        this.universalTitleColor = universalColor;
        this.universalBackgroundColor = universalColor2;
        this.style = str2;
    }

    public static /* synthetic */ SimpleBadge copy$default(SimpleBadge simpleBadge, String str, UniversalColor universalColor, UniversalColor universalColor2, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = simpleBadge.title;
        }
        if ((i12 & 2) != 0) {
            universalColor = simpleBadge.universalTitleColor;
        }
        if ((i12 & 4) != 0) {
            universalColor2 = simpleBadge.universalBackgroundColor;
        }
        if ((i12 & 8) != 0) {
            str2 = simpleBadge.style;
        }
        return simpleBadge.copy(str, universalColor, universalColor2, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getUniversalTitleColor() {
        return this.universalTitleColor;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getUniversalBackgroundColor() {
        return this.universalBackgroundColor;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @k
    public final SimpleBadge copy(@k String title, @k UniversalColor universalTitleColor, @l UniversalColor universalBackgroundColor, @l String style) {
        return new SimpleBadge(title, universalTitleColor, universalBackgroundColor, style);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleBadge)) {
            return false;
        }
        SimpleBadge simpleBadge = (SimpleBadge) other;
        return L.f(this.title, simpleBadge.title) && L.f(this.universalTitleColor, simpleBadge.universalTitleColor) && L.f(this.universalBackgroundColor, simpleBadge.universalBackgroundColor) && L.f(this.style, simpleBadge.style);
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @k
    /* renamed from: getTitle */
    public String getF268989b() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @l
    /* renamed from: getUniversalBackgroundColor */
    public UniversalColor getF268991d() {
        return this.universalBackgroundColor;
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @k
    /* renamed from: getUniversalTitleColor */
    public UniversalColor getF268990c() {
        return this.universalTitleColor;
    }

    public int hashCode() {
        int i12 = a.i(this.universalTitleColor, this.title.hashCode() * 31, 31);
        UniversalColor universalColor = this.universalBackgroundColor;
        int iHashCode = (i12 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        String str = this.style;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleBadge(title=");
        sb2.append(this.title);
        sb2.append(", universalTitleColor=");
        sb2.append(this.universalTitleColor);
        sb2.append(", universalBackgroundColor=");
        sb2.append(this.universalBackgroundColor);
        sb2.append(", style=");
        return C22026a.c(sb2, this.style, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.universalTitleColor, flags);
        parcel.writeParcelable(this.universalBackgroundColor, flags);
        parcel.writeString(this.style);
    }
}
