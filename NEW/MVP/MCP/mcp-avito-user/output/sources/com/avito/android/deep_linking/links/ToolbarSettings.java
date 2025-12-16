package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: UniversalMapLink.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006!"}, d2 = {"Lcom/avito/android/deep_linking/links/ToolbarSettings;", "Landroid/os/Parcelable;", "", "title", "", "hideSearchAddress", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/avito/android/deep_linking/links/ToolbarSettings;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Z", "getHideSearchAddress", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ToolbarSettings implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ToolbarSettings> CREATOR = new a();
    private final boolean hideSearchAddress;

    @Y61.l
    private final String title;

    /* compiled from: UniversalMapLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ToolbarSettings> {
        @Override // android.os.Parcelable.Creator
        public final ToolbarSettings createFromParcel(Parcel parcel) {
            return new ToolbarSettings(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ToolbarSettings[] newArray(int i12) {
            return new ToolbarSettings[i12];
        }
    }

    public ToolbarSettings(@Y61.l String str, boolean z12) {
        this.title = str;
        this.hideSearchAddress = z12;
    }

    public static /* synthetic */ ToolbarSettings copy$default(ToolbarSettings toolbarSettings, String str, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = toolbarSettings.title;
        }
        if ((i12 & 2) != 0) {
            z12 = toolbarSettings.hideSearchAddress;
        }
        return toolbarSettings.copy(str, z12);
    }

    @Y61.l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHideSearchAddress() {
        return this.hideSearchAddress;
    }

    @Y61.k
    public final ToolbarSettings copy(@Y61.l String title, boolean hideSearchAddress) {
        return new ToolbarSettings(title, hideSearchAddress);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolbarSettings)) {
            return false;
        }
        ToolbarSettings toolbarSettings = (ToolbarSettings) other;
        return kotlin.jvm.internal.L.f(this.title, toolbarSettings.title) && this.hideSearchAddress == toolbarSettings.hideSearchAddress;
    }

    public final boolean getHideSearchAddress() {
        return this.hideSearchAddress;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return Boolean.hashCode(this.hideSearchAddress) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ToolbarSettings(title=");
        sb2.append(this.title);
        sb2.append(", hideSearchAddress=");
        return androidx.appcompat.app.r.x(sb2, this.hideSearchAddress, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeInt(this.hideSearchAddress ? 1 : 0);
    }
}
