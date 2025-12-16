package com.avito.android.beduin.ui.universal.beduin;

import Ui.InterfaceC15524c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinExpandPageAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin/ui/universal/beduin/BeduinExpandPageAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", SearchParamsConverterKt.EXPANDED, "<init>", "(Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/avito/android/beduin/ui/universal/beduin/BeduinExpandPageAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getExpanded", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinExpandPageAction implements BeduinAction {

    @l
    private final Boolean expanded;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinExpandPageAction> CREATOR = new b();

    @k
    private static final String type = "expandPage";

    @k
    private static final Class<BeduinExpandPageAction> action = BeduinExpandPageAction.class;

    /* compiled from: BeduinExpandPageAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/universal/beduin/BeduinExpandPageAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.ui.universal.beduin.BeduinExpandPageAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<BeduinExpandPageAction> getAction() {
            return BeduinExpandPageAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF100007c() {
            return BeduinExpandPageAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinExpandPageAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinExpandPageAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinExpandPageAction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinExpandPageAction(boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinExpandPageAction[] newArray(int i12) {
            return new BeduinExpandPageAction[i12];
        }
    }

    public BeduinExpandPageAction(@l Boolean bool) {
        this.expanded = bool;
    }

    public static /* synthetic */ BeduinExpandPageAction copy$default(BeduinExpandPageAction beduinExpandPageAction, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = beduinExpandPageAction.expanded;
        }
        return beduinExpandPageAction.copy(bool);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Boolean getExpanded() {
        return this.expanded;
    }

    @k
    public final BeduinExpandPageAction copy(@l Boolean expanded) {
        return new BeduinExpandPageAction(expanded);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeduinExpandPageAction) && L.f(this.expanded, ((BeduinExpandPageAction) other).expanded);
    }

    @l
    public final Boolean getExpanded() {
        return this.expanded;
    }

    public int hashCode() {
        Boolean bool = this.expanded;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @k
    public String toString() {
        return C0.g(new StringBuilder("BeduinExpandPageAction(expanded="), this.expanded, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.expanded;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
