package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NativeVideo.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/NativeVideoStatus;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/StatusIcon;", "icon", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/StatusIcon;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/StatusIcon;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/StatusIcon;)Lcom/avito/android/remote/model/NativeVideoStatus;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/StatusIcon;", "getIcon", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NativeVideoStatus implements Parcelable {

    @k
    public static final Parcelable.Creator<NativeVideoStatus> CREATOR = new Creator();

    @c("icon")
    @l
    private final StatusIcon icon;

    @c("text")
    @k
    private final String text;

    /* compiled from: NativeVideo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NativeVideoStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NativeVideoStatus createFromParcel(@k Parcel parcel) {
            return new NativeVideoStatus(parcel.readString(), parcel.readInt() == 0 ? null : StatusIcon.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NativeVideoStatus[] newArray(int i12) {
            return new NativeVideoStatus[i12];
        }
    }

    public NativeVideoStatus(@k String str, @l StatusIcon statusIcon) {
        this.text = str;
        this.icon = statusIcon;
    }

    public static /* synthetic */ NativeVideoStatus copy$default(NativeVideoStatus nativeVideoStatus, String str, StatusIcon statusIcon, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = nativeVideoStatus.text;
        }
        if ((i12 & 2) != 0) {
            statusIcon = nativeVideoStatus.icon;
        }
        return nativeVideoStatus.copy(str, statusIcon);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final StatusIcon getIcon() {
        return this.icon;
    }

    @k
    public final NativeVideoStatus copy(@k String text, @l StatusIcon icon) {
        return new NativeVideoStatus(text, icon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeVideoStatus)) {
            return false;
        }
        NativeVideoStatus nativeVideoStatus = (NativeVideoStatus) other;
        return L.f(this.text, nativeVideoStatus.text) && L.f(this.icon, nativeVideoStatus.icon);
    }

    @l
    public final StatusIcon getIcon() {
        return this.icon;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        StatusIcon statusIcon = this.icon;
        return iHashCode + (statusIcon == null ? 0 : statusIcon.hashCode());
    }

    @k
    public String toString() {
        return "NativeVideoStatus(text=" + this.text + ", icon=" + this.icon + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        StatusIcon statusIcon = this.icon;
        if (statusIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusIcon.writeToParcel(parcel, flags);
        }
    }
}
