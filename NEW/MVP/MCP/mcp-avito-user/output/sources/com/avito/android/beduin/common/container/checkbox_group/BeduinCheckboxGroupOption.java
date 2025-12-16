package com.avito.android.beduin.common.container.checkbox_group;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinCheckboxGroupModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/beduin/common/container/checkbox_group/BeduinCheckboxGroupOption;", "Landroid/os/Parcelable;", "", "id", "", "Lcom/avito/android/beduin_models/BeduinModel;", "contents", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/beduin/common/container/checkbox_group/BeduinCheckboxGroupOption;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getContents", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinCheckboxGroupOption implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BeduinCheckboxGroupOption> CREATOR = new a();

    @Y61.k
    private final List<BeduinModel> contents;

    @Y61.k
    private final String id;

    /* compiled from: BeduinCheckboxGroupModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinCheckboxGroupOption> {
        @Override // android.os.Parcelable.Creator
        public final BeduinCheckboxGroupOption createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BeduinCheckboxGroupOption.class, parcel, arrayList, iL2, 1);
            }
            return new BeduinCheckboxGroupOption(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinCheckboxGroupOption[] newArray(int i12) {
            return new BeduinCheckboxGroupOption[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinCheckboxGroupOption(@Y61.k String str, @Y61.k List<? extends BeduinModel> list) {
        this.id = str;
        this.contents = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinCheckboxGroupOption copy$default(BeduinCheckboxGroupOption beduinCheckboxGroupOption, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinCheckboxGroupOption.id;
        }
        if ((i12 & 2) != 0) {
            list = beduinCheckboxGroupOption.contents;
        }
        return beduinCheckboxGroupOption.copy(str, list);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    public final List<BeduinModel> component2() {
        return this.contents;
    }

    @Y61.k
    public final BeduinCheckboxGroupOption copy(@Y61.k String id2, @Y61.k List<? extends BeduinModel> contents) {
        return new BeduinCheckboxGroupOption(id2, contents);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinCheckboxGroupOption)) {
            return false;
        }
        BeduinCheckboxGroupOption beduinCheckboxGroupOption = (BeduinCheckboxGroupOption) other;
        return L.f(this.id, beduinCheckboxGroupOption.id) && L.f(this.contents, beduinCheckboxGroupOption.contents);
    }

    @Y61.k
    public final List<BeduinModel> getContents() {
        return this.contents;
    }

    @Y61.k
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.contents.hashCode() + (this.id.hashCode() * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinCheckboxGroupOption(id=");
        sb2.append(this.id);
        sb2.append(", contents=");
        return H.p(sb2, this.contents, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Iterator itJ = C0.j(this.contents, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
    }
}
