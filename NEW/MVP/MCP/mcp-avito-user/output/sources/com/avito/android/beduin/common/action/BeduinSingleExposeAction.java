package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSingleExposeAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\b¨\u0006 "}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinSingleExposeAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "", "configKeyList", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/beduin/common/action/BeduinSingleExposeAction;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getConfigKeyList", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSingleExposeAction implements BeduinAction {

    @Y61.k
    private final List<String> configKeyList;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinSingleExposeAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinSingleExposeAction.class;

    @Y61.k
    private static final String type = "singleExposeAction";

    /* compiled from: BeduinSingleExposeAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinSingleExposeAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinSingleExposeAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinSingleExposeAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99982c() {
            return BeduinSingleExposeAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinSingleExposeAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinSingleExposeAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSingleExposeAction createFromParcel(Parcel parcel) {
            return new BeduinSingleExposeAction(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSingleExposeAction[] newArray(int i12) {
            return new BeduinSingleExposeAction[i12];
        }
    }

    public BeduinSingleExposeAction(@Y61.k List<String> list) {
        this.configKeyList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinSingleExposeAction copy$default(BeduinSingleExposeAction beduinSingleExposeAction, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = beduinSingleExposeAction.configKeyList;
        }
        return beduinSingleExposeAction.copy(list);
    }

    @Y61.k
    public final List<String> component1() {
        return this.configKeyList;
    }

    @Y61.k
    public final BeduinSingleExposeAction copy(@Y61.k List<String> configKeyList) {
        return new BeduinSingleExposeAction(configKeyList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeduinSingleExposeAction) && L.f(this.configKeyList, ((BeduinSingleExposeAction) other).configKeyList);
    }

    @Y61.k
    public final List<String> getConfigKeyList() {
        return this.configKeyList;
    }

    public int hashCode() {
        return this.configKeyList.hashCode();
    }

    @Y61.k
    public String toString() {
        return H.p(new StringBuilder("BeduinSingleExposeAction(configKeyList="), this.configKeyList, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeStringList(this.configKeyList);
    }
}
