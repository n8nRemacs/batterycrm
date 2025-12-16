package com.avito.android.remote.model.category_parameters;

import P41.c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.gson.d;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.util.J3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import zK0.C50480a;

/* compiled from: Constraint.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fJ\b\u0010\u0016\u001a\u00020\u0003H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u0012\u0010\u000f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007\u0082\u0001\b !\"#$%&'¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Constraint;", "Landroid/os/Parcelable;", "conditionFlow", "", "getConditionFlow$annotations", "()V", "getConditionFlow", "()Ljava/lang/String;", "conditions", "", "Lcom/avito/android/remote/model/category_parameters/Condition;", "getConditions", "()Ljava/util/List;", "message", "getMessage", "rule", "getRule", "severity", "getSeverity$annotations", "getSeverity", "tag", "getTag", "toAnalyticsValue", "ConditionFlow", "DistinctFrom", "EqualTo", "Length", "Limit", "Range", "Regex", "Required", "Severity", "Lcom/avito/android/remote/model/category_parameters/Constraint$DistinctFrom;", "Lcom/avito/android/remote/model/category_parameters/Constraint$EqualTo;", "Lcom/avito/android/remote/model/category_parameters/Constraint$Length;", "Lcom/avito/android/remote/model/category_parameters/Constraint$Limit;", "Lcom/avito/android/remote/model/category_parameters/Constraint$Range;", "Lcom/avito/android/remote/model/category_parameters/Constraint$Regex;", "Lcom/avito/android/remote/model/category_parameters/Constraint$Required;", "Lcom/avito/android/remote/model/category_parameters/InvalidAddress;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Constraint extends Parcelable {

    /* compiled from: Constraint.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Constraint$ConditionFlow;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @c
    public @interface ConditionFlow {
    }

    /* compiled from: Constraint.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Constraint$Severity;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @c
    public @interface Severity {
    }

    @l
    String getConditionFlow();

    @l
    List<Condition> getConditions();

    @l
    String getMessage();

    @k
    String getRule();

    @l
    String getSeverity();

    @l
    String getTag();

    @k
    String toAnalyticsValue();

    /* compiled from: Constraint.kt */
    @K51.d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJR\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\rR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b,\u0010\rR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\r¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Constraint$Required;", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "", "message", "severity", "tag", "", "Lcom/avito/android/remote/model/category_parameters/Condition;", "conditions", "conditionFlow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toAnalyticsValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/Constraint$Required;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessage", "getSeverity", "getTag", "Ljava/util/List;", "getConditions", "getConditionFlow", "getRule", "rule", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Required implements Constraint {

        @k
        public static final Parcelable.Creator<Required> CREATOR = new Creator();

        @l
        private final String conditionFlow;

        @l
        private final List<Condition> conditions;

        @com.google.gson.annotations.c("message")
        @l
        private final String message;

        @com.google.gson.annotations.c("severity")
        @l
        private final String severity;

        @com.google.gson.annotations.c("tag")
        @l
        private final String tag;

        /* compiled from: Constraint.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Required> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Required createFromParcel(@k Parcel parcel) {
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
                        iL2 = a.l(Required.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new Required(string, string2, string3, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Required[] newArray(int i12) {
                return new Required[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Required(@l String str, @l String str2, @l String str3, @l List<? extends Condition> list, @l String str4) {
            this.message = str;
            this.severity = str2;
            this.tag = str3;
            this.conditions = list;
            this.conditionFlow = str4;
        }

        public static /* synthetic */ Required copy$default(Required required, String str, String str2, String str3, List list, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = required.message;
            }
            if ((i12 & 2) != 0) {
                str2 = required.severity;
            }
            String str5 = str2;
            if ((i12 & 4) != 0) {
                str3 = required.tag;
            }
            String str6 = str3;
            if ((i12 & 8) != 0) {
                list = required.conditions;
            }
            List list2 = list;
            if ((i12 & 16) != 0) {
                str4 = required.conditionFlow;
            }
            return required.copy(str, str5, str6, list2, str4);
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
        public final Required copy(@l String message, @l String severity, @l String tag, @l List<? extends Condition> conditions, @l String conditionFlow) {
            return new Required(message, severity, tag, conditions, conditionFlow);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Required)) {
                return false;
            }
            Required required = (Required) other;
            return L.f(this.message, required.message) && L.f(this.severity, required.severity) && L.f(this.tag, required.tag) && L.f(this.conditions, required.conditions) && L.f(this.conditionFlow, required.conditionFlow);
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
            return "required";
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
            return "required";
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Required(message=");
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

        public /* synthetic */ Required(String str, String str2, String str3, List list, String str4, int i12, C42822w c42822w) {
            this(str, str2, str3, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : str4);
        }
    }

    /* compiled from: Constraint.kt */
    @K51.d
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\\\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b-\u0010\u000fR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b0\u0010\u000fR\u0014\u00102\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u000f¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Constraint$DistinctFrom;", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "Lcom/avito/android/remote/model/category_parameters/DependentConstraint;", "", "dependentId", "message", "severity", "tag", "", "Lcom/avito/android/remote/model/category_parameters/Condition;", "conditions", "conditionFlow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toAnalyticsValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/Constraint$DistinctFrom;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDependentId", "getMessage", "getSeverity", "getTag", "Ljava/util/List;", "getConditions", "getConditionFlow", "getRule", "rule", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DistinctFrom implements Constraint, DependentConstraint {

        @k
        public static final Parcelable.Creator<DistinctFrom> CREATOR = new Creator();

        @l
        private final String conditionFlow;

        @l
        private final List<Condition> conditions;

        @com.google.gson.annotations.c("id")
        @k
        private final String dependentId;

        @com.google.gson.annotations.c("message")
        @l
        private final String message;

        @com.google.gson.annotations.c("severity")
        @l
        private final String severity;

        @com.google.gson.annotations.c("tag")
        @l
        private final String tag;

        /* compiled from: Constraint.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DistinctFrom> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DistinctFrom createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = a.l(DistinctFrom.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new DistinctFrom(string, string2, string3, string4, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DistinctFrom[] newArray(int i12) {
                return new DistinctFrom[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DistinctFrom(@k String str, @l String str2, @l String str3, @l String str4, @l List<? extends Condition> list, @l String str5) {
            this.dependentId = str;
            this.message = str2;
            this.severity = str3;
            this.tag = str4;
            this.conditions = list;
            this.conditionFlow = str5;
        }

        public static /* synthetic */ DistinctFrom copy$default(DistinctFrom distinctFrom, String str, String str2, String str3, String str4, List list, String str5, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = distinctFrom.dependentId;
            }
            if ((i12 & 2) != 0) {
                str2 = distinctFrom.message;
            }
            String str6 = str2;
            if ((i12 & 4) != 0) {
                str3 = distinctFrom.severity;
            }
            String str7 = str3;
            if ((i12 & 8) != 0) {
                str4 = distinctFrom.tag;
            }
            String str8 = str4;
            if ((i12 & 16) != 0) {
                list = distinctFrom.conditions;
            }
            List list2 = list;
            if ((i12 & 32) != 0) {
                str5 = distinctFrom.conditionFlow;
            }
            return distinctFrom.copy(str, str6, str7, str8, list2, str5);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getDependentId() {
            return this.dependentId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getSeverity() {
            return this.severity;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @l
        public final List<Condition> component5() {
            return this.conditions;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getConditionFlow() {
            return this.conditionFlow;
        }

        @k
        public final DistinctFrom copy(@k String dependentId, @l String message, @l String severity, @l String tag, @l List<? extends Condition> conditions, @l String conditionFlow) {
            return new DistinctFrom(dependentId, message, severity, tag, conditions, conditionFlow);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DistinctFrom)) {
                return false;
            }
            DistinctFrom distinctFrom = (DistinctFrom) other;
            return L.f(this.dependentId, distinctFrom.dependentId) && L.f(this.message, distinctFrom.message) && L.f(this.severity, distinctFrom.severity) && L.f(this.tag, distinctFrom.tag) && L.f(this.conditions, distinctFrom.conditions) && L.f(this.conditionFlow, distinctFrom.conditionFlow);
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

        @Override // com.avito.android.remote.model.category_parameters.DependentConstraint
        @k
        public String getDependentId() {
            return this.dependentId;
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @l
        public String getMessage() {
            return this.message;
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @k
        public String getRule() {
            return "distinctFrom";
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
            int iHashCode = this.dependentId.hashCode() * 31;
            String str = this.message;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.severity;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tag;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<Condition> list = this.conditions;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.conditionFlow;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @k
        public String toAnalyticsValue() {
            return "distinct - " + getDependentId();
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DistinctFrom(dependentId=");
            sb2.append(this.dependentId);
            sb2.append(", message=");
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
            parcel.writeString(this.dependentId);
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

        public /* synthetic */ DistinctFrom(String str, String str2, String str3, String str4, List list, String str5, int i12, C42822w c42822w) {
            this(str, str2, str3, str4, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? null : str5);
        }
    }

    /* compiled from: Constraint.kt */
    @K51.d
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\\\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b-\u0010\u000fR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b0\u0010\u000fR\u0014\u00102\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u000f¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Constraint$EqualTo;", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "Lcom/avito/android/remote/model/category_parameters/DependentConstraint;", "", "dependentId", "message", "severity", "tag", "", "Lcom/avito/android/remote/model/category_parameters/Condition;", "conditions", "conditionFlow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toAnalyticsValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/Constraint$EqualTo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDependentId", "getMessage", "getSeverity", "getTag", "Ljava/util/List;", "getConditions", "getConditionFlow", "getRule", "rule", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EqualTo implements Constraint, DependentConstraint {

        @k
        public static final Parcelable.Creator<EqualTo> CREATOR = new Creator();

        @l
        private final String conditionFlow;

        @l
        private final List<Condition> conditions;

        @com.google.gson.annotations.c("id")
        @k
        private final String dependentId;

        @com.google.gson.annotations.c("message")
        @l
        private final String message;

        @com.google.gson.annotations.c("severity")
        @l
        private final String severity;

        @com.google.gson.annotations.c("tag")
        @l
        private final String tag;

        /* compiled from: Constraint.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EqualTo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EqualTo createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = a.l(EqualTo.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new EqualTo(string, string2, string3, string4, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EqualTo[] newArray(int i12) {
                return new EqualTo[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EqualTo(@k String str, @l String str2, @l String str3, @l String str4, @l List<? extends Condition> list, @l String str5) {
            this.dependentId = str;
            this.message = str2;
            this.severity = str3;
            this.tag = str4;
            this.conditions = list;
            this.conditionFlow = str5;
        }

        public static /* synthetic */ EqualTo copy$default(EqualTo equalTo, String str, String str2, String str3, String str4, List list, String str5, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = equalTo.dependentId;
            }
            if ((i12 & 2) != 0) {
                str2 = equalTo.message;
            }
            String str6 = str2;
            if ((i12 & 4) != 0) {
                str3 = equalTo.severity;
            }
            String str7 = str3;
            if ((i12 & 8) != 0) {
                str4 = equalTo.tag;
            }
            String str8 = str4;
            if ((i12 & 16) != 0) {
                list = equalTo.conditions;
            }
            List list2 = list;
            if ((i12 & 32) != 0) {
                str5 = equalTo.conditionFlow;
            }
            return equalTo.copy(str, str6, str7, str8, list2, str5);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getDependentId() {
            return this.dependentId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getSeverity() {
            return this.severity;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @l
        public final List<Condition> component5() {
            return this.conditions;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getConditionFlow() {
            return this.conditionFlow;
        }

        @k
        public final EqualTo copy(@k String dependentId, @l String message, @l String severity, @l String tag, @l List<? extends Condition> conditions, @l String conditionFlow) {
            return new EqualTo(dependentId, message, severity, tag, conditions, conditionFlow);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EqualTo)) {
                return false;
            }
            EqualTo equalTo = (EqualTo) other;
            return L.f(this.dependentId, equalTo.dependentId) && L.f(this.message, equalTo.message) && L.f(this.severity, equalTo.severity) && L.f(this.tag, equalTo.tag) && L.f(this.conditions, equalTo.conditions) && L.f(this.conditionFlow, equalTo.conditionFlow);
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

        @Override // com.avito.android.remote.model.category_parameters.DependentConstraint
        @k
        public String getDependentId() {
            return this.dependentId;
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @l
        public String getMessage() {
            return this.message;
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @k
        public String getRule() {
            return "equalTo";
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
            int iHashCode = this.dependentId.hashCode() * 31;
            String str = this.message;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.severity;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tag;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<Condition> list = this.conditions;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.conditionFlow;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @k
        public String toAnalyticsValue() {
            return "equal - " + getDependentId();
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("EqualTo(dependentId=");
            sb2.append(this.dependentId);
            sb2.append(", message=");
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
            parcel.writeString(this.dependentId);
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

        public /* synthetic */ EqualTo(String str, String str2, String str3, String str4, List list, String str5, int i12, C42822w c42822w) {
            this(str, str2, str3, str4, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? null : str5);
        }
    }

    /* compiled from: Constraint.kt */
    @K51.d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ\\\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b\u0003\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u000fR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b0\u0010\u000fR\u0014\u00102\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u000f¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Constraint$Range;", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "", "isAscending", "", "severity", "message", "tag", "", "Lcom/avito/android/remote/model/category_parameters/Condition;", "conditions", "conditionFlow", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toAnalyticsValue", "()Ljava/lang/String;", "component1", "()Z", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/Constraint$Range;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Ljava/lang/String;", "getSeverity", "getMessage", "getTag", "Ljava/util/List;", "getConditions", "getConditionFlow", "getRule", "rule", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Range implements Constraint {

        @k
        public static final Parcelable.Creator<Range> CREATOR = new Creator();

        @l
        private final String conditionFlow;

        @l
        private final List<Condition> conditions;

        @com.google.gson.annotations.c("isAscending")
        private final boolean isAscending;

        @com.google.gson.annotations.c("message")
        @l
        private final String message;

        @com.google.gson.annotations.c("severity")
        @l
        private final String severity;

        @com.google.gson.annotations.c("tag")
        @l
        private final String tag;

        /* compiled from: Constraint.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Range> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Range[] newArray(int i12) {
                return new Range[i12];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Range createFromParcel(@k Parcel parcel) {
                boolean z12 = parcel.readInt() != 0;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                C50480a.f444023a.getClass();
                List listA = J3.a(parcel, C50480a.class.getClassLoader());
                if (listA == null) {
                    listA = C42784z0.f406748b;
                }
                return new Range(z12, string, string2, string3, listA, parcel.readString());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Range(boolean z12, @l String str, @l String str2, @l String str3, @l List<? extends Condition> list, @l String str4) {
            this.isAscending = z12;
            this.severity = str;
            this.message = str2;
            this.tag = str3;
            this.conditions = list;
            this.conditionFlow = str4;
        }

        public static /* synthetic */ Range copy$default(Range range, boolean z12, String str, String str2, String str3, List list, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = range.isAscending;
            }
            if ((i12 & 2) != 0) {
                str = range.severity;
            }
            String str5 = str;
            if ((i12 & 4) != 0) {
                str2 = range.message;
            }
            String str6 = str2;
            if ((i12 & 8) != 0) {
                str3 = range.tag;
            }
            String str7 = str3;
            if ((i12 & 16) != 0) {
                list = range.conditions;
            }
            List list2 = list;
            if ((i12 & 32) != 0) {
                str4 = range.conditionFlow;
            }
            return range.copy(z12, str5, str6, str7, list2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsAscending() {
            return this.isAscending;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getSeverity() {
            return this.severity;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @l
        public final List<Condition> component5() {
            return this.conditions;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getConditionFlow() {
            return this.conditionFlow;
        }

        @k
        public final Range copy(boolean isAscending, @l String severity, @l String message, @l String tag, @l List<? extends Condition> conditions, @l String conditionFlow) {
            return new Range(isAscending, severity, message, tag, conditions, conditionFlow);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return this.isAscending == range.isAscending && L.f(this.severity, range.severity) && L.f(this.message, range.message) && L.f(this.tag, range.tag) && L.f(this.conditions, range.conditions) && L.f(this.conditionFlow, range.conditionFlow);
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
            return "range";
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
            int iHashCode = Boolean.hashCode(this.isAscending) * 31;
            String str = this.severity;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.message;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tag;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<Condition> list = this.conditions;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.conditionFlow;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        public final boolean isAscending() {
            return this.isAscending;
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @k
        public String toAnalyticsValue() {
            return "range";
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Range(isAscending=");
            sb2.append(this.isAscending);
            sb2.append(", severity=");
            sb2.append(this.severity);
            sb2.append(", message=");
            sb2.append(this.message);
            sb2.append(", tag=");
            sb2.append(this.tag);
            sb2.append(", conditions=");
            sb2.append(this.conditions);
            sb2.append(", conditionFlow=");
            return C22026a.c(sb2, this.conditionFlow, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.isAscending ? 1 : 0);
            parcel.writeString(this.severity);
            parcel.writeString(this.message);
            parcel.writeString(this.tag);
            C50480a c50480a = C50480a.f444023a;
            List<Condition> list = this.conditions;
            c50480a.getClass();
            J3.e(list, parcel, flags);
            parcel.writeString(this.conditionFlow);
        }

        public /* synthetic */ Range(boolean z12, String str, String str2, String str3, List list, String str4, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? true : z12, str, str2, str3, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? null : str4);
        }
    }

    /* compiled from: Constraint.kt */
    @K51.d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jj\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b2\u0010\u0010R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b5\u0010\u0010R\u0014\u00107\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0010¨\u00068"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Constraint$Length;", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "", "min", "max", "", "message", "severity", "tag", "", "Lcom/avito/android/remote/model/category_parameters/Condition;", "conditions", "conditionFlow", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toAnalyticsValue", "()Ljava/lang/String;", "component1", "()Ljava/lang/Long;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/Constraint$Length;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getMin", "getMax", "Ljava/lang/String;", "getMessage", "getSeverity", "getTag", "Ljava/util/List;", "getConditions", "getConditionFlow", "getRule", "rule", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Length implements Constraint {

        @k
        public static final Parcelable.Creator<Length> CREATOR = new Creator();

        @l
        private final String conditionFlow;

        @l
        private final List<Condition> conditions;

        @com.google.gson.annotations.c("max")
        @l
        private final Long max;

        @com.google.gson.annotations.c("message")
        @l
        private final String message;

        @com.google.gson.annotations.c("min")
        @l
        private final Long min;

        @com.google.gson.annotations.c("severity")
        @l
        private final String severity;

        @com.google.gson.annotations.c("tag")
        @l
        private final String tag;

        /* compiled from: Constraint.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Length> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Length createFromParcel(@k Parcel parcel) {
                ArrayList arrayList = null;
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = a.l(Length.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new Length(lValueOf, lValueOf2, string, string2, string3, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Length[] newArray(int i12) {
                return new Length[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Length(@l Long l12, @l Long l13, @l String str, @l String str2, @l String str3, @l List<? extends Condition> list, @l String str4) {
            this.min = l12;
            this.max = l13;
            this.message = str;
            this.severity = str2;
            this.tag = str3;
            this.conditions = list;
            this.conditionFlow = str4;
        }

        public static /* synthetic */ Length copy$default(Length length, Long l12, Long l13, String str, String str2, String str3, List list, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                l12 = length.min;
            }
            if ((i12 & 2) != 0) {
                l13 = length.max;
            }
            Long l14 = l13;
            if ((i12 & 4) != 0) {
                str = length.message;
            }
            String str5 = str;
            if ((i12 & 8) != 0) {
                str2 = length.severity;
            }
            String str6 = str2;
            if ((i12 & 16) != 0) {
                str3 = length.tag;
            }
            String str7 = str3;
            if ((i12 & 32) != 0) {
                list = length.conditions;
            }
            List list2 = list;
            if ((i12 & 64) != 0) {
                str4 = length.conditionFlow;
            }
            return length.copy(l12, l14, str5, str6, str7, list2, str4);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Long getMin() {
            return this.min;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Long getMax() {
            return this.max;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getSeverity() {
            return this.severity;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @l
        public final List<Condition> component6() {
            return this.conditions;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getConditionFlow() {
            return this.conditionFlow;
        }

        @k
        public final Length copy(@l Long min, @l Long max, @l String message, @l String severity, @l String tag, @l List<? extends Condition> conditions, @l String conditionFlow) {
            return new Length(min, max, message, severity, tag, conditions, conditionFlow);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Length)) {
                return false;
            }
            Length length = (Length) other;
            return L.f(this.min, length.min) && L.f(this.max, length.max) && L.f(this.message, length.message) && L.f(this.severity, length.severity) && L.f(this.tag, length.tag) && L.f(this.conditions, length.conditions) && L.f(this.conditionFlow, length.conditionFlow);
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

        @l
        public final Long getMax() {
            return this.max;
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @l
        public String getMessage() {
            return this.message;
        }

        @l
        public final Long getMin() {
            return this.min;
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @k
        public String getRule() {
            return "length";
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
            Long l12 = this.min;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            Long l13 = this.max;
            int iHashCode2 = (iHashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
            String str = this.message;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.severity;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tag;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<Condition> list = this.conditions;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.conditionFlow;
            return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @k
        public String toAnalyticsValue() {
            return "length - " + this.min + " - " + this.max;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Length(min=");
            sb2.append(this.min);
            sb2.append(", max=");
            sb2.append(this.max);
            sb2.append(", message=");
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
            Long l12 = this.min;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            Long l13 = this.max;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l13);
            }
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

        public /* synthetic */ Length(Long l12, Long l13, String str, String str2, String str3, List list, String str4, int i12, C42822w c42822w) {
            this(l12, l13, str, str2, str3, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? null : str4);
        }
    }

    /* compiled from: Constraint.kt */
    @K51.d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jj\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b2\u0010\u0010R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b5\u0010\u0010R\u0014\u00107\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0010¨\u00068"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Constraint$Limit;", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "", "min", "max", "", "severity", "message", "tag", "", "Lcom/avito/android/remote/model/category_parameters/Condition;", "conditions", "conditionFlow", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toAnalyticsValue", "()Ljava/lang/String;", "component1", "()Ljava/lang/Float;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/Constraint$Limit;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Float;", "getMin", "getMax", "Ljava/lang/String;", "getSeverity", "getMessage", "getTag", "Ljava/util/List;", "getConditions", "getConditionFlow", "getRule", "rule", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Limit implements Constraint {

        @k
        public static final Parcelable.Creator<Limit> CREATOR = new Creator();

        @l
        private final String conditionFlow;

        @l
        private final List<Condition> conditions;

        @com.google.gson.annotations.c("maxV2")
        @l
        private final Float max;

        @com.google.gson.annotations.c("message")
        @l
        private final String message;

        @com.google.gson.annotations.c("minV2")
        @l
        private final Float min;

        @com.google.gson.annotations.c("severity")
        @l
        private final String severity;

        @com.google.gson.annotations.c("tag")
        @l
        private final String tag;

        /* compiled from: Constraint.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Limit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Limit[] newArray(int i12) {
                return new Limit[i12];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Limit createFromParcel(@k Parcel parcel) {
                Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                C50480a.f444023a.getClass();
                List listA = J3.a(parcel, C50480a.class.getClassLoader());
                if (listA == null) {
                    listA = C42784z0.f406748b;
                }
                return new Limit(fValueOf, fValueOf2, string, string2, string3, listA, parcel.readString());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Limit(@l Float f12, @l Float f13, @l String str, @l String str2, @l String str3, @l List<? extends Condition> list, @l String str4) {
            this.min = f12;
            this.max = f13;
            this.severity = str;
            this.message = str2;
            this.tag = str3;
            this.conditions = list;
            this.conditionFlow = str4;
        }

        public static /* synthetic */ Limit copy$default(Limit limit, Float f12, Float f13, String str, String str2, String str3, List list, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                f12 = limit.min;
            }
            if ((i12 & 2) != 0) {
                f13 = limit.max;
            }
            Float f14 = f13;
            if ((i12 & 4) != 0) {
                str = limit.severity;
            }
            String str5 = str;
            if ((i12 & 8) != 0) {
                str2 = limit.message;
            }
            String str6 = str2;
            if ((i12 & 16) != 0) {
                str3 = limit.tag;
            }
            String str7 = str3;
            if ((i12 & 32) != 0) {
                list = limit.conditions;
            }
            List list2 = list;
            if ((i12 & 64) != 0) {
                str4 = limit.conditionFlow;
            }
            return limit.copy(f12, f14, str5, str6, str7, list2, str4);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Float getMin() {
            return this.min;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Float getMax() {
            return this.max;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getSeverity() {
            return this.severity;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @l
        public final List<Condition> component6() {
            return this.conditions;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getConditionFlow() {
            return this.conditionFlow;
        }

        @k
        public final Limit copy(@l Float min, @l Float max, @l String severity, @l String message, @l String tag, @l List<? extends Condition> conditions, @l String conditionFlow) {
            return new Limit(min, max, severity, message, tag, conditions, conditionFlow);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Limit)) {
                return false;
            }
            Limit limit = (Limit) other;
            return L.f(this.min, limit.min) && L.f(this.max, limit.max) && L.f(this.severity, limit.severity) && L.f(this.message, limit.message) && L.f(this.tag, limit.tag) && L.f(this.conditions, limit.conditions) && L.f(this.conditionFlow, limit.conditionFlow);
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

        @l
        public final Float getMax() {
            return this.max;
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @l
        public String getMessage() {
            return this.message;
        }

        @l
        public final Float getMin() {
            return this.min;
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @k
        public String getRule() {
            return "limit";
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
            Float f12 = this.min;
            int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
            Float f13 = this.max;
            int iHashCode2 = (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31;
            String str = this.severity;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.message;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tag;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<Condition> list = this.conditions;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.conditionFlow;
            return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @k
        public String toAnalyticsValue() {
            return "limit - " + this.min + " - " + this.max;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Limit(min=");
            sb2.append(this.min);
            sb2.append(", max=");
            sb2.append(this.max);
            sb2.append(", severity=");
            sb2.append(this.severity);
            sb2.append(", message=");
            sb2.append(this.message);
            sb2.append(", tag=");
            sb2.append(this.tag);
            sb2.append(", conditions=");
            sb2.append(this.conditions);
            sb2.append(", conditionFlow=");
            return C22026a.c(sb2, this.conditionFlow, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Float f12 = this.min;
            if (f12 == null) {
                parcel.writeInt(0);
            } else {
                a.B(parcel, 1, f12);
            }
            Float f13 = this.max;
            if (f13 == null) {
                parcel.writeInt(0);
            } else {
                a.B(parcel, 1, f13);
            }
            parcel.writeString(this.severity);
            parcel.writeString(this.message);
            parcel.writeString(this.tag);
            C50480a c50480a = C50480a.f444023a;
            List<Condition> list = this.conditions;
            c50480a.getClass();
            J3.e(list, parcel, flags);
            parcel.writeString(this.conditionFlow);
        }

        public /* synthetic */ Limit(Float f12, Float f13, String str, String str2, String str3, List list, String str4, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : f12, (i12 & 2) != 0 ? null : f13, str, str2, str3, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? null : str4);
        }
    }

    /* compiled from: Constraint.kt */
    @K51.d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jh\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u0010R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b4\u0010\u0010R\u0014\u00106\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0010¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Constraint$Regex;", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "", "regex", "", "passOnMatch", "message", "severity", "tag", "", "Lcom/avito/android/remote/model/category_parameters/Condition;", "conditions", "conditionFlow", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toAnalyticsValue", "()Ljava/lang/String;", "component1", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/Constraint$Regex;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getRegex", "Ljava/lang/Boolean;", "getPassOnMatch", "getMessage", "getSeverity", "getTag", "Ljava/util/List;", "getConditions", "getConditionFlow", "getRule", "rule", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Regex implements Constraint {

        @k
        public static final Parcelable.Creator<Regex> CREATOR = new Creator();

        @l
        private final String conditionFlow;

        @l
        private final List<Condition> conditions;

        @com.google.gson.annotations.c("message")
        @l
        private final String message;

        @com.google.gson.annotations.c("passOnMatch")
        @l
        private final Boolean passOnMatch;

        @com.google.gson.annotations.c("regexp")
        @k
        private final String regex;

        @com.google.gson.annotations.c("severity")
        @l
        private final String severity;

        @com.google.gson.annotations.c("tag")
        @l
        private final String tag;

        /* compiled from: Constraint.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Regex> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Regex createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                int iL2 = 0;
                ArrayList arrayList = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    while (iL2 != i12) {
                        iL2 = a.l(Regex.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new Regex(string, boolValueOf, string2, string3, string4, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Regex[] newArray(int i12) {
                return new Regex[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Regex(@k String str, @l Boolean bool, @l String str2, @l String str3, @l String str4, @l List<? extends Condition> list, @l String str5) {
            this.regex = str;
            this.passOnMatch = bool;
            this.message = str2;
            this.severity = str3;
            this.tag = str4;
            this.conditions = list;
            this.conditionFlow = str5;
        }

        public static /* synthetic */ Regex copy$default(Regex regex, String str, Boolean bool, String str2, String str3, String str4, List list, String str5, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = regex.regex;
            }
            if ((i12 & 2) != 0) {
                bool = regex.passOnMatch;
            }
            Boolean bool2 = bool;
            if ((i12 & 4) != 0) {
                str2 = regex.message;
            }
            String str6 = str2;
            if ((i12 & 8) != 0) {
                str3 = regex.severity;
            }
            String str7 = str3;
            if ((i12 & 16) != 0) {
                str4 = regex.tag;
            }
            String str8 = str4;
            if ((i12 & 32) != 0) {
                list = regex.conditions;
            }
            List list2 = list;
            if ((i12 & 64) != 0) {
                str5 = regex.conditionFlow;
            }
            return regex.copy(str, bool2, str6, str7, str8, list2, str5);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Boolean getPassOnMatch() {
            return this.passOnMatch;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getSeverity() {
            return this.severity;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @l
        public final List<Condition> component6() {
            return this.conditions;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getConditionFlow() {
            return this.conditionFlow;
        }

        @k
        public final Regex copy(@k String regex, @l Boolean passOnMatch, @l String message, @l String severity, @l String tag, @l List<? extends Condition> conditions, @l String conditionFlow) {
            return new Regex(regex, passOnMatch, message, severity, tag, conditions, conditionFlow);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Regex)) {
                return false;
            }
            Regex regex = (Regex) other;
            return L.f(this.regex, regex.regex) && L.f(this.passOnMatch, regex.passOnMatch) && L.f(this.message, regex.message) && L.f(this.severity, regex.severity) && L.f(this.tag, regex.tag) && L.f(this.conditions, regex.conditions) && L.f(this.conditionFlow, regex.conditionFlow);
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

        @l
        public final Boolean getPassOnMatch() {
            return this.passOnMatch;
        }

        @k
        public final String getRegex() {
            return this.regex;
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @k
        public String getRule() {
            return "regexp";
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
            int iHashCode = this.regex.hashCode() * 31;
            Boolean bool = this.passOnMatch;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.message;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.severity;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tag;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<Condition> list = this.conditions;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.conditionFlow;
            return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.category_parameters.Constraint
        @k
        public String toAnalyticsValue() {
            return "regex - " + this.regex;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Regex(regex=");
            sb2.append(this.regex);
            sb2.append(", passOnMatch=");
            sb2.append(this.passOnMatch);
            sb2.append(", message=");
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
            parcel.writeString(this.regex);
            Boolean bool = this.passOnMatch;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
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

        public /* synthetic */ Regex(String str, Boolean bool, String str2, String str3, String str4, List list, String str5, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : bool, str2, str3, str4, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? null : str5);
        }
    }

    /* compiled from: Constraint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getConditionFlow$annotations() {
        }

        public static /* synthetic */ void getSeverity$annotations() {
        }
    }
}
