package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSocketEventAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinSocketEventAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "Subscribe", "Unsubscribe", "Lcom/avito/android/beduin/common/action/BeduinSocketEventAction$Subscribe;", "Lcom/avito/android/beduin/common/action/BeduinSocketEventAction$Unsubscribe;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BeduinSocketEventAction extends BeduinAction {

    /* compiled from: BeduinSocketEventAction.kt */
    @Keep
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001.BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011JV\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\rR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b,\u0010\u0011¨\u0006/"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinSocketEventAction$Subscribe;", "Lcom/avito/android/beduin/common/action/BeduinSocketEventAction;", "", "type", "subType", "formId", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onEventActions", "onDisconnectActions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/beduin/common/action/BeduinSocketEventAction$Subscribe;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "type$1", "Ljava/lang/String;", "getType", "getSubType", "getFormId", "Ljava/util/List;", "getOnEventActions", "getOnDisconnectActions", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Subscribe implements BeduinSocketEventAction {

        @com.google.gson.annotations.c("formId")
        @l
        private final String formId;

        @com.google.gson.annotations.c("onDisconnectActions")
        @l
        private final List<BeduinAction> onDisconnectActions;

        @com.google.gson.annotations.c("onEventActions")
        @l
        private final List<BeduinAction> onEventActions;

        @com.google.gson.annotations.c("subType")
        @l
        private final String subType;

        /* renamed from: type$1, reason: from kotlin metadata */
        @com.google.gson.annotations.c("type")
        @Y61.k
        private final String type;

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        @Y61.k
        public static final Parcelable.Creator<Subscribe> CREATOR = new b();

        @Y61.k
        private static final Class<? extends BeduinAction> action = Subscribe.class;

        @Y61.k
        private static final String type = "subscribeSocketEvent";

        /* compiled from: BeduinSocketEventAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinSocketEventAction$Subscribe$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.common.action.BeduinSocketEventAction$Subscribe$a, reason: from kotlin metadata */
        public static final class Companion implements InterfaceC15524c {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Override // Ui.InterfaceC15524c
            @Y61.k
            public final Class<? extends BeduinAction> getAction() {
                return Subscribe.action;
            }

            @Override // Ui.InterfaceC15524c
            @Y61.k
            /* renamed from: getType */
            public final String getF105301c() {
                return Subscribe.type;
            }

            public Companion() {
            }
        }

        /* compiled from: BeduinSocketEventAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Subscribe> {
            @Override // android.os.Parcelable.Creator
            public final Subscribe createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int iL2 = 0;
                ArrayList arrayList2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL3 = 0;
                    while (iL3 != i12) {
                        iL3 = com.avito.android.actions_sheet.a.l(Subscribe.class, parcel, arrayList, iL3, 1);
                    }
                }
                if (parcel.readInt() != 0) {
                    int i13 = parcel.readInt();
                    arrayList2 = new ArrayList(i13);
                    while (iL2 != i13) {
                        iL2 = com.avito.android.actions_sheet.a.l(Subscribe.class, parcel, arrayList2, iL2, 1);
                    }
                }
                return new Subscribe(string, string2, string3, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Subscribe[] newArray(int i12) {
                return new Subscribe[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Subscribe(@Y61.k String str, @l String str2, @l String str3, @l List<? extends BeduinAction> list, @l List<? extends BeduinAction> list2) {
            this.type = str;
            this.subType = str2;
            this.formId = str3;
            this.onEventActions = list;
            this.onDisconnectActions = list2;
        }

        public static /* synthetic */ Subscribe copy$default(Subscribe subscribe, String str, String str2, String str3, List list, List list2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = subscribe.type;
            }
            if ((i12 & 2) != 0) {
                str2 = subscribe.subType;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                str3 = subscribe.formId;
            }
            String str5 = str3;
            if ((i12 & 8) != 0) {
                list = subscribe.onEventActions;
            }
            List list3 = list;
            if ((i12 & 16) != 0) {
                list2 = subscribe.onDisconnectActions;
            }
            return subscribe.copy(str, str4, str5, list3, list2);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getSubType() {
            return this.subType;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getFormId() {
            return this.formId;
        }

        @l
        public final List<BeduinAction> component4() {
            return this.onEventActions;
        }

        @l
        public final List<BeduinAction> component5() {
            return this.onDisconnectActions;
        }

        @Y61.k
        public final Subscribe copy(@Y61.k String type2, @l String subType, @l String formId, @l List<? extends BeduinAction> onEventActions, @l List<? extends BeduinAction> onDisconnectActions) {
            return new Subscribe(type2, subType, formId, onEventActions, onDisconnectActions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subscribe)) {
                return false;
            }
            Subscribe subscribe = (Subscribe) other;
            return L.f(this.type, subscribe.type) && L.f(this.subType, subscribe.subType) && L.f(this.formId, subscribe.formId) && L.f(this.onEventActions, subscribe.onEventActions) && L.f(this.onDisconnectActions, subscribe.onDisconnectActions);
        }

        @l
        public final String getFormId() {
            return this.formId;
        }

        @l
        public final List<BeduinAction> getOnDisconnectActions() {
            return this.onDisconnectActions;
        }

        @l
        public final List<BeduinAction> getOnEventActions() {
            return this.onEventActions;
        }

        @Override // com.avito.android.beduin.common.action.BeduinSocketEventAction
        @l
        public String getSubType() {
            return this.subType;
        }

        @Override // com.avito.android.beduin.common.action.BeduinSocketEventAction
        @Y61.k
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.subType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.formId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<BeduinAction> list = this.onEventActions;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            List<BeduinAction> list2 = this.onDisconnectActions;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Subscribe(type=");
            sb2.append(this.type);
            sb2.append(", subType=");
            sb2.append(this.subType);
            sb2.append(", formId=");
            sb2.append(this.formId);
            sb2.append(", onEventActions=");
            sb2.append(this.onEventActions);
            sb2.append(", onDisconnectActions=");
            return H.p(sb2, this.onDisconnectActions, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeString(this.type);
            parcel.writeString(this.subType);
            parcel.writeString(this.formId);
            List<BeduinAction> list = this.onEventActions;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), flags);
                }
            }
            List<BeduinAction> list2 = this.onDisconnectActions;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
    }

    /* compiled from: BeduinSocketEventAction.kt */
    @Keep
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001\"B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\t¨\u0006#"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinSocketEventAction$Unsubscribe;", "Lcom/avito/android/beduin/common/action/BeduinSocketEventAction;", "LUi/e;", "", "type", "subType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/beduin/common/action/BeduinSocketEventAction$Unsubscribe;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "type$1", "Ljava/lang/String;", "getType", "getSubType", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Unsubscribe implements BeduinSocketEventAction, Ui.e {

        @com.google.gson.annotations.c("subType")
        @l
        private final String subType;

        /* renamed from: type$1, reason: from kotlin metadata */
        @com.google.gson.annotations.c("type")
        @Y61.k
        private final String type;

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        @Y61.k
        public static final Parcelable.Creator<Unsubscribe> CREATOR = new b();

        @Y61.k
        private static final Class<? extends BeduinAction> action = Unsubscribe.class;

        @Y61.k
        private static final String type = "unsubscribeSocketEvent";

        /* compiled from: BeduinSocketEventAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinSocketEventAction$Unsubscribe$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.common.action.BeduinSocketEventAction$Unsubscribe$a, reason: from kotlin metadata */
        public static final class Companion implements InterfaceC15524c {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Override // Ui.InterfaceC15524c
            @Y61.k
            public final Class<? extends BeduinAction> getAction() {
                return Unsubscribe.action;
            }

            @Override // Ui.InterfaceC15524c
            @Y61.k
            /* renamed from: getType */
            public final String getF105301c() {
                return Unsubscribe.type;
            }

            public Companion() {
            }
        }

        /* compiled from: BeduinSocketEventAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Unsubscribe> {
            @Override // android.os.Parcelable.Creator
            public final Unsubscribe createFromParcel(Parcel parcel) {
                return new Unsubscribe(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Unsubscribe[] newArray(int i12) {
                return new Unsubscribe[i12];
            }
        }

        public Unsubscribe(@Y61.k String str, @l String str2) {
            this.type = str;
            this.subType = str2;
        }

        public static /* synthetic */ Unsubscribe copy$default(Unsubscribe unsubscribe, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = unsubscribe.type;
            }
            if ((i12 & 2) != 0) {
                str2 = unsubscribe.subType;
            }
            return unsubscribe.copy(str, str2);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getSubType() {
            return this.subType;
        }

        @Y61.k
        public final Unsubscribe copy(@Y61.k String type2, @l String subType) {
            return new Unsubscribe(type2, subType);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unsubscribe)) {
                return false;
            }
            Unsubscribe unsubscribe = (Unsubscribe) other;
            return L.f(this.type, unsubscribe.type) && L.f(this.subType, unsubscribe.subType);
        }

        @Override // com.avito.android.beduin.common.action.BeduinSocketEventAction
        @l
        public String getSubType() {
            return this.subType;
        }

        @Override // com.avito.android.beduin.common.action.BeduinSocketEventAction
        @Y61.k
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.subType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Unsubscribe(type=");
            sb2.append(this.type);
            sb2.append(", subType=");
            return C22026a.c(sb2, this.subType, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeString(this.type);
            parcel.writeString(this.subType);
        }
    }

    @l
    String getSubType();

    @Y61.k
    String getType();
}
