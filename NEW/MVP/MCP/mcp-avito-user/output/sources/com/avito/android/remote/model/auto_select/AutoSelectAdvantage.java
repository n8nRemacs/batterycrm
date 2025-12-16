package com.avito.android.remote.model.auto_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectParametersV2.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/auto_select/AutoSelectAdvantage;", "Landroid/os/Parcelable;", "", "icon", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "componentSlug", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)Lcom/avito/android/remote/model/auto_select/AutoSelectAdvantage;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIcon", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "getComponentSlug", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutoSelectAdvantage implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoSelectAdvantage> CREATOR = new Creator();

    @c("componentSlug")
    @k
    private final String componentSlug;

    @c("description")
    @k
    private final AttributedText description;

    @c("icon")
    @l
    private final String icon;

    @c("title")
    @k
    private final String title;

    /* compiled from: AutoSelectParametersV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoSelectAdvantage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectAdvantage createFromParcel(@k Parcel parcel) {
            return new AutoSelectAdvantage(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(AutoSelectAdvantage.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectAdvantage[] newArray(int i12) {
            return new AutoSelectAdvantage[i12];
        }
    }

    public AutoSelectAdvantage(@l String str, @k String str2, @k AttributedText attributedText, @k String str3) {
        this.icon = str;
        this.title = str2;
        this.description = attributedText;
        this.componentSlug = str3;
    }

    public static /* synthetic */ AutoSelectAdvantage copy$default(AutoSelectAdvantage autoSelectAdvantage, String str, String str2, AttributedText attributedText, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = autoSelectAdvantage.icon;
        }
        if ((i12 & 2) != 0) {
            str2 = autoSelectAdvantage.title;
        }
        if ((i12 & 4) != 0) {
            attributedText = autoSelectAdvantage.description;
        }
        if ((i12 & 8) != 0) {
            str3 = autoSelectAdvantage.componentSlug;
        }
        return autoSelectAdvantage.copy(str, str2, attributedText, str3);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getComponentSlug() {
        return this.componentSlug;
    }

    @k
    public final AutoSelectAdvantage copy(@l String icon, @k String title, @k AttributedText description, @k String componentSlug) {
        return new AutoSelectAdvantage(icon, title, description, componentSlug);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoSelectAdvantage)) {
            return false;
        }
        AutoSelectAdvantage autoSelectAdvantage = (AutoSelectAdvantage) other;
        return L.f(this.icon, autoSelectAdvantage.icon) && L.f(this.title, autoSelectAdvantage.title) && L.f(this.description, autoSelectAdvantage.description) && L.f(this.componentSlug, autoSelectAdvantage.componentSlug);
    }

    @k
    public final String getComponentSlug() {
        return this.componentSlug;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final String getIcon() {
        return this.icon;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.icon;
        return this.componentSlug.hashCode() + a.b(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.description);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectAdvantage(icon=");
        sb2.append(this.icon);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", componentSlug=");
        return C22026a.c(sb2, this.componentSlug, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.icon);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.description, flags);
        parcel.writeString(this.componentSlug);
    }
}
