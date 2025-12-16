package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddressParameter.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJR\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\rR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b,\u0010\rR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\r¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/InvalidAddress;", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "", "message", "severity", "tag", "", "Lcom/avito/android/remote/model/category_parameters/Condition;", "conditions", "conditionFlow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toAnalyticsValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/InvalidAddress;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessage", "getSeverity", "getTag", "Ljava/util/List;", "getConditions", "getConditionFlow", "getRule", "rule", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InvalidAddress implements Constraint {

    @k
    public static final Parcelable.Creator<InvalidAddress> CREATOR = new Creator();

    @l
    private final String conditionFlow;

    @l
    private final List<Condition> conditions;

    @c("message")
    @l
    private final String message;

    @c("severity")
    @l
    private final String severity;

    @c("tag")
    @l
    private final String tag;

    /* compiled from: AddressParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InvalidAddress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InvalidAddress createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(InvalidAddress.class, parcel, arrayList, iL2, 1);
                }
            }
            return new InvalidAddress(string, string2, string3, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InvalidAddress[] newArray(int i12) {
            return new InvalidAddress[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvalidAddress(@l String str, @l String str2, @l String str3, @l List<? extends Condition> list, @l String str4) {
        this.message = str;
        this.severity = str2;
        this.tag = str3;
        this.conditions = list;
        this.conditionFlow = str4;
    }

    public static /* synthetic */ InvalidAddress copy$default(InvalidAddress invalidAddress, String str, String str2, String str3, List list, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = invalidAddress.message;
        }
        if ((i12 & 2) != 0) {
            str2 = invalidAddress.severity;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = invalidAddress.tag;
        }
        String str6 = str3;
        if ((i12 & 8) != 0) {
            list = invalidAddress.conditions;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            str4 = invalidAddress.conditionFlow;
        }
        return invalidAddress.copy(str, str5, str6, list2, str4);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSeverity() {
        return this.severity;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @l
    public final List<Condition> component4() {
        return this.conditions;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getConditionFlow() {
        return this.conditionFlow;
    }

    @k
    public final InvalidAddress copy(@l String message, @l String severity, @l String tag, @l List<? extends Condition> conditions, @l String conditionFlow) {
        return new InvalidAddress(message, severity, tag, conditions, conditionFlow);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvalidAddress)) {
            return false;
        }
        InvalidAddress invalidAddress = (InvalidAddress) other;
        return L.f(this.message, invalidAddress.message) && L.f(this.severity, invalidAddress.severity) && L.f(this.tag, invalidAddress.tag) && L.f(this.conditions, invalidAddress.conditions) && L.f(this.conditionFlow, invalidAddress.conditionFlow);
    }

    @Override // com.avito.android.remote.model.category_parameters.Constraint
    @l
    public String getConditionFlow() {
        return this.conditionFlow;
    }

    @Override // com.avito.android.remote.model.category_parameters.Constraint
    @l
    public List<Condition> getConditions() {
        return this.conditions;
    }

    @Override // com.avito.android.remote.model.category_parameters.Constraint
    @l
    public String getMessage() {
        return this.message;
    }

    @Override // com.avito.android.remote.model.category_parameters.Constraint
    @k
    public String getRule() {
        return "invalidAddress";
    }

    @Override // com.avito.android.remote.model.category_parameters.Constraint
    @l
    public String getSeverity() {
        return this.severity;
    }

    @Override // com.avito.android.remote.model.category_parameters.Constraint
    @l
    public String getTag() {
        return this.tag;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.severity;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Condition> list = this.conditions;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.conditionFlow;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.avito.android.remote.model.category_parameters.Constraint
    @k
    public String toAnalyticsValue() {
        return "invalidAddress";
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InvalidAddress(message=");
        sb2.append(this.message);
        sb2.append(", severity=");
        sb2.append(this.severity);
        sb2.append(", tag=");
        sb2.append(this.tag);
        sb2.append(", conditions=");
        sb2.append(this.conditions);
        sb2.append(", conditionFlow=");
        return C22026a.c(sb2, this.conditionFlow, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.message);
        parcel.writeString(this.severity);
        parcel.writeString(this.tag);
        List<Condition> list = this.conditions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.conditionFlow);
    }

    public /* synthetic */ InvalidAddress(String str, String str2, String str3, List list, String str4, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : str4);
    }
}
