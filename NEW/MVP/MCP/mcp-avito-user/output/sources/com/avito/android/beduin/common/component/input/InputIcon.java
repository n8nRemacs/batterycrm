package com.avito.android.beduin.common.component.input;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputIcon.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lcom/avito/android/beduin/common/component/input/InputIcon;", "Landroid/os/Parcelable;", "", "iconName", "iconColor", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onClickedActions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/beduin/common/component/input/InputIcon;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIconName", "getIconColor", "Ljava/util/List;", "getOnClickedActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InputIcon implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<InputIcon> CREATOR = new a();

    @l
    private final String iconColor;

    @Y61.k
    private final String iconName;

    @l
    private final List<BeduinAction> onClickedActions;

    /* compiled from: InputIcon.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputIcon> {
        @Override // android.os.Parcelable.Creator
        public final InputIcon createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(InputIcon.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new InputIcon(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final InputIcon[] newArray(int i12) {
            return new InputIcon[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputIcon(@Y61.k String str, @l String str2, @l List<? extends BeduinAction> list) {
        this.iconName = str;
        this.iconColor = str2;
        this.onClickedActions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputIcon copy$default(InputIcon inputIcon, String str, String str2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = inputIcon.iconName;
        }
        if ((i12 & 2) != 0) {
            str2 = inputIcon.iconColor;
        }
        if ((i12 & 4) != 0) {
            list = inputIcon.onClickedActions;
        }
        return inputIcon.copy(str, str2, list);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    @l
    public final List<BeduinAction> component3() {
        return this.onClickedActions;
    }

    @Y61.k
    public final InputIcon copy(@Y61.k String iconName, @l String iconColor, @l List<? extends BeduinAction> onClickedActions) {
        return new InputIcon(iconName, iconColor, onClickedActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputIcon)) {
            return false;
        }
        InputIcon inputIcon = (InputIcon) other;
        return L.f(this.iconName, inputIcon.iconName) && L.f(this.iconColor, inputIcon.iconColor) && L.f(this.onClickedActions, inputIcon.onClickedActions);
    }

    @l
    public final String getIconColor() {
        return this.iconColor;
    }

    @Y61.k
    public final String getIconName() {
        return this.iconName;
    }

    @l
    public final List<BeduinAction> getOnClickedActions() {
        return this.onClickedActions;
    }

    public int hashCode() {
        int iHashCode = this.iconName.hashCode() * 31;
        String str = this.iconColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<BeduinAction> list = this.onClickedActions;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InputIcon(iconName=");
        sb2.append(this.iconName);
        sb2.append(", iconColor=");
        sb2.append(this.iconColor);
        sb2.append(", onClickedActions=");
        return H.p(sb2, this.onClickedActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.iconName);
        parcel.writeString(this.iconColor);
        List<BeduinAction> list = this.onClickedActions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }
}
