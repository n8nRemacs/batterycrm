package com.avito.android.beduin_shared.model.action.custom.selectTab;

import K51.d;
import Ui.InterfaceC15524c;
import Ui.e;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSelectTabAction.kt */
@d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/selectTab/BeduinSelectTabAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "LUi/e;", "", "tabId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/beduin_shared/model/action/custom/selectTab/BeduinSelectTabAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTabId", "Companion", "a", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSelectTabAction implements BeduinAction, e {

    @k
    private final String tabId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinSelectTabAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinSelectTabAction.class;

    @k
    private static final String type = "selectTab";

    /* compiled from: BeduinSelectTabAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/selectTab/BeduinSelectTabAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin_shared.model.action.custom.selectTab.BeduinSelectTabAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinSelectTabAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF99995b() {
            return BeduinSelectTabAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinSelectTabAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinSelectTabAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSelectTabAction createFromParcel(Parcel parcel) {
            return new BeduinSelectTabAction(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSelectTabAction[] newArray(int i12) {
            return new BeduinSelectTabAction[i12];
        }
    }

    public BeduinSelectTabAction(@k String str) {
        this.tabId = str;
    }

    public static /* synthetic */ BeduinSelectTabAction copy$default(BeduinSelectTabAction beduinSelectTabAction, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinSelectTabAction.tabId;
        }
        return beduinSelectTabAction.copy(str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTabId() {
        return this.tabId;
    }

    @k
    public final BeduinSelectTabAction copy(@k String tabId) {
        return new BeduinSelectTabAction(tabId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeduinSelectTabAction) && L.f(this.tabId, ((BeduinSelectTabAction) other).tabId);
    }

    @k
    public final String getTabId() {
        return this.tabId;
    }

    public int hashCode() {
        return this.tabId.hashCode();
    }

    @k
    public String toString() {
        return C22026a.c(new StringBuilder("BeduinSelectTabAction(tabId="), this.tabId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.tabId);
    }
}
