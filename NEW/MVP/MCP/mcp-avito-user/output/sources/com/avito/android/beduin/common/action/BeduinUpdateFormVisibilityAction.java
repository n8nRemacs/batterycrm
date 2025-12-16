package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinUpdateFormVisibilityAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\r¨\u0006&"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinUpdateFormVisibilityAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "visible", "animated", "", "formId", "<init>", "(ZZLjava/lang/String;)V", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "copy", "(ZZLjava/lang/String;)Lcom/avito/android/beduin/common/action/BeduinUpdateFormVisibilityAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getVisible", "getAnimated", "Ljava/lang/String;", "getFormId", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinUpdateFormVisibilityAction implements BeduinAction {
    private final boolean animated;

    @Y61.k
    private final String formId;
    private final boolean visible;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinUpdateFormVisibilityAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinUpdateFormVisibilityAction.class;

    @Y61.k
    private static final String TYPE = "updateFormVisibility";

    @Y61.k
    private static final String type = TYPE;

    /* compiled from: BeduinUpdateFormVisibilityAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinUpdateFormVisibilityAction$a;", "LUi/c;", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinUpdateFormVisibilityAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinUpdateFormVisibilityAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99995b() {
            return BeduinUpdateFormVisibilityAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinUpdateFormVisibilityAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinUpdateFormVisibilityAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinUpdateFormVisibilityAction createFromParcel(Parcel parcel) {
            return new BeduinUpdateFormVisibilityAction(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinUpdateFormVisibilityAction[] newArray(int i12) {
            return new BeduinUpdateFormVisibilityAction[i12];
        }
    }

    public BeduinUpdateFormVisibilityAction(boolean z12, boolean z13, @Y61.k String str) {
        this.visible = z12;
        this.animated = z13;
        this.formId = str;
    }

    public static /* synthetic */ BeduinUpdateFormVisibilityAction copy$default(BeduinUpdateFormVisibilityAction beduinUpdateFormVisibilityAction, boolean z12, boolean z13, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = beduinUpdateFormVisibilityAction.visible;
        }
        if ((i12 & 2) != 0) {
            z13 = beduinUpdateFormVisibilityAction.animated;
        }
        if ((i12 & 4) != 0) {
            str = beduinUpdateFormVisibilityAction.formId;
        }
        return beduinUpdateFormVisibilityAction.copy(z12, z13, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAnimated() {
        return this.animated;
    }

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final String getFormId() {
        return this.formId;
    }

    @Y61.k
    public final BeduinUpdateFormVisibilityAction copy(boolean visible, boolean animated, @Y61.k String formId) {
        return new BeduinUpdateFormVisibilityAction(visible, animated, formId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinUpdateFormVisibilityAction)) {
            return false;
        }
        BeduinUpdateFormVisibilityAction beduinUpdateFormVisibilityAction = (BeduinUpdateFormVisibilityAction) other;
        return this.visible == beduinUpdateFormVisibilityAction.visible && this.animated == beduinUpdateFormVisibilityAction.animated && L.f(this.formId, beduinUpdateFormVisibilityAction.formId);
    }

    public final boolean getAnimated() {
        return this.animated;
    }

    @Y61.k
    public final String getFormId() {
        return this.formId;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return this.formId.hashCode() + r.i(Boolean.hashCode(this.visible) * 31, 31, this.animated);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinUpdateFormVisibilityAction(visible=");
        sb2.append(this.visible);
        sb2.append(", animated=");
        sb2.append(this.animated);
        sb2.append(", formId=");
        return C22026a.c(sb2, this.formId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeInt(this.animated ? 1 : 0);
        parcel.writeString(this.formId);
    }
}
