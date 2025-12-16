package com.avito.android.brandspace.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Brandspace.kt */
@d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/brandspace/remote/model/BrandspaceFormFailedAction;", "Landroid/os/Parcelable;", "", "errorParamName", "Lcom/avito/android/beduin_models/BeduinAction;", "action", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/BeduinAction;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/BeduinAction;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/BeduinAction;)Lcom/avito/android/brandspace/remote/model/BrandspaceFormFailedAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getErrorParamName", "Lcom/avito/android/beduin_models/BeduinAction;", "getAction", "_avito-discouraged_avito-api_brandspace"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BrandspaceFormFailedAction implements Parcelable {

    @k
    public static final Parcelable.Creator<BrandspaceFormFailedAction> CREATOR = new a();

    @k
    private final BeduinAction action;

    @l
    private final String errorParamName;

    /* compiled from: Brandspace.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BrandspaceFormFailedAction> {
        @Override // android.os.Parcelable.Creator
        public final BrandspaceFormFailedAction createFromParcel(Parcel parcel) {
            return new BrandspaceFormFailedAction(parcel.readString(), (BeduinAction) parcel.readParcelable(BrandspaceFormFailedAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BrandspaceFormFailedAction[] newArray(int i12) {
            return new BrandspaceFormFailedAction[i12];
        }
    }

    public BrandspaceFormFailedAction(@l String str, @k BeduinAction beduinAction) {
        this.errorParamName = str;
        this.action = beduinAction;
    }

    public static /* synthetic */ BrandspaceFormFailedAction copy$default(BrandspaceFormFailedAction brandspaceFormFailedAction, String str, BeduinAction beduinAction, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = brandspaceFormFailedAction.errorParamName;
        }
        if ((i12 & 2) != 0) {
            beduinAction = brandspaceFormFailedAction.action;
        }
        return brandspaceFormFailedAction.copy(str, beduinAction);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getErrorParamName() {
        return this.errorParamName;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final BeduinAction getAction() {
        return this.action;
    }

    @k
    public final BrandspaceFormFailedAction copy(@l String errorParamName, @k BeduinAction action) {
        return new BrandspaceFormFailedAction(errorParamName, action);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandspaceFormFailedAction)) {
            return false;
        }
        BrandspaceFormFailedAction brandspaceFormFailedAction = (BrandspaceFormFailedAction) other;
        return L.f(this.errorParamName, brandspaceFormFailedAction.errorParamName) && L.f(this.action, brandspaceFormFailedAction.action);
    }

    @k
    public final BeduinAction getAction() {
        return this.action;
    }

    @l
    public final String getErrorParamName() {
        return this.errorParamName;
    }

    public int hashCode() {
        String str = this.errorParamName;
        return this.action.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public String toString() {
        return "BrandspaceFormFailedAction(errorParamName=" + this.errorParamName + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.errorParamName);
        parcel.writeParcelable(this.action, flags);
    }
}
