package com.avito.android.remote.model.auto_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectControls.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\f¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/auto_select/AutoSelectControls;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/auto_select/SelectLayoutMode;", "layoutMode", "Lcom/avito/android/remote/model/auto_select/SelectControlsButtonParams;", "firstButton", "secondButton", "<init>", "(Lcom/avito/android/remote/model/auto_select/SelectLayoutMode;Lcom/avito/android/remote/model/auto_select/SelectControlsButtonParams;Lcom/avito/android/remote/model/auto_select/SelectControlsButtonParams;)V", "component1", "()Lcom/avito/android/remote/model/auto_select/SelectLayoutMode;", "component2", "()Lcom/avito/android/remote/model/auto_select/SelectControlsButtonParams;", "component3", "copy", "(Lcom/avito/android/remote/model/auto_select/SelectLayoutMode;Lcom/avito/android/remote/model/auto_select/SelectControlsButtonParams;Lcom/avito/android/remote/model/auto_select/SelectControlsButtonParams;)Lcom/avito/android/remote/model/auto_select/AutoSelectControls;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/auto_select/SelectLayoutMode;", "getLayoutMode", "Lcom/avito/android/remote/model/auto_select/SelectControlsButtonParams;", "getFirstButton", "getSecondButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutoSelectControls implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoSelectControls> CREATOR = new Creator();

    @c("firstButton")
    @l
    private final SelectControlsButtonParams firstButton;

    @c("layoutMode")
    @l
    private final SelectLayoutMode layoutMode;

    @c("secondButton")
    @l
    private final SelectControlsButtonParams secondButton;

    /* compiled from: AutoSelectControls.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoSelectControls> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectControls createFromParcel(@k Parcel parcel) {
            return new AutoSelectControls(parcel.readInt() == 0 ? null : SelectLayoutMode.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelectControlsButtonParams.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SelectControlsButtonParams.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectControls[] newArray(int i12) {
            return new AutoSelectControls[i12];
        }
    }

    public AutoSelectControls(@l SelectLayoutMode selectLayoutMode, @l SelectControlsButtonParams selectControlsButtonParams, @l SelectControlsButtonParams selectControlsButtonParams2) {
        this.layoutMode = selectLayoutMode;
        this.firstButton = selectControlsButtonParams;
        this.secondButton = selectControlsButtonParams2;
    }

    public static /* synthetic */ AutoSelectControls copy$default(AutoSelectControls autoSelectControls, SelectLayoutMode selectLayoutMode, SelectControlsButtonParams selectControlsButtonParams, SelectControlsButtonParams selectControlsButtonParams2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            selectLayoutMode = autoSelectControls.layoutMode;
        }
        if ((i12 & 2) != 0) {
            selectControlsButtonParams = autoSelectControls.firstButton;
        }
        if ((i12 & 4) != 0) {
            selectControlsButtonParams2 = autoSelectControls.secondButton;
        }
        return autoSelectControls.copy(selectLayoutMode, selectControlsButtonParams, selectControlsButtonParams2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final SelectLayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final SelectControlsButtonParams getFirstButton() {
        return this.firstButton;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final SelectControlsButtonParams getSecondButton() {
        return this.secondButton;
    }

    @k
    public final AutoSelectControls copy(@l SelectLayoutMode layoutMode, @l SelectControlsButtonParams firstButton, @l SelectControlsButtonParams secondButton) {
        return new AutoSelectControls(layoutMode, firstButton, secondButton);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoSelectControls)) {
            return false;
        }
        AutoSelectControls autoSelectControls = (AutoSelectControls) other;
        return this.layoutMode == autoSelectControls.layoutMode && L.f(this.firstButton, autoSelectControls.firstButton) && L.f(this.secondButton, autoSelectControls.secondButton);
    }

    @l
    public final SelectControlsButtonParams getFirstButton() {
        return this.firstButton;
    }

    @l
    public final SelectLayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @l
    public final SelectControlsButtonParams getSecondButton() {
        return this.secondButton;
    }

    public int hashCode() {
        SelectLayoutMode selectLayoutMode = this.layoutMode;
        int iHashCode = (selectLayoutMode == null ? 0 : selectLayoutMode.hashCode()) * 31;
        SelectControlsButtonParams selectControlsButtonParams = this.firstButton;
        int iHashCode2 = (iHashCode + (selectControlsButtonParams == null ? 0 : selectControlsButtonParams.hashCode())) * 31;
        SelectControlsButtonParams selectControlsButtonParams2 = this.secondButton;
        return iHashCode2 + (selectControlsButtonParams2 != null ? selectControlsButtonParams2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AutoSelectControls(layoutMode=" + this.layoutMode + ", firstButton=" + this.firstButton + ", secondButton=" + this.secondButton + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        SelectLayoutMode selectLayoutMode = this.layoutMode;
        if (selectLayoutMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectLayoutMode.writeToParcel(parcel, flags);
        }
        SelectControlsButtonParams selectControlsButtonParams = this.firstButton;
        if (selectControlsButtonParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectControlsButtonParams.writeToParcel(parcel, flags);
        }
        SelectControlsButtonParams selectControlsButtonParams2 = this.secondButton;
        if (selectControlsButtonParams2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectControlsButtonParams2.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ AutoSelectControls(SelectLayoutMode selectLayoutMode, SelectControlsButtonParams selectControlsButtonParams, SelectControlsButtonParams selectControlsButtonParams2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? SelectLayoutMode.DEFAULT : selectLayoutMode, selectControlsButtonParams, selectControlsButtonParams2);
    }
}
