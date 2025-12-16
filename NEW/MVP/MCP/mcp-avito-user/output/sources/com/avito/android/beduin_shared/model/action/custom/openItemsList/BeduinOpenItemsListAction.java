package com.avito.android.beduin_shared.model.action.custom.openItemsList;

import K51.d;
import Ui.InterfaceC15524c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOpenItemsListAction.kt */
@d
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\\\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0014¨\u00062"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/openItemsList/BeduinOpenItemsListAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "componentId", "", "linkedComponents", "paramName", "title", "", "Lcom/avito/android/beduin_shared/model/action/custom/openItemsList/BeduinOpenItemsListAction$SelectOption;", "items", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/beduin_shared/model/action/custom/openItemsList/BeduinOpenItemsListAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getComponentId", "Ljava/util/Map;", "getLinkedComponents", "getParamName", "getTitle", "Ljava/util/List;", "getItems", "Companion", "a", "SelectOption", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinOpenItemsListAction implements BeduinAction {

    @l
    private final String componentId;

    @k
    private final List<SelectOption> items;

    @l
    private final Map<String, String> linkedComponents;

    @l
    private final String paramName;

    @l
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinOpenItemsListAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinOpenItemsListAction.class;

    @k
    private static final String type = "openItemsList";

    /* compiled from: BeduinOpenItemsListAction.kt */
    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JN\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013¨\u0006."}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/openItemsList/BeduinOpenItemsListAction$SelectOption;", "Landroid/os/Parcelable;", "", "id", "leftText", "rightText", "Lcom/avito/android/beduin_shared/model/action/custom/openItemsList/AdditionalData;", "additionalData", "", "subItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin_shared/model/action/custom/openItemsList/AdditionalData;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/beduin_shared/model/action/custom/openItemsList/AdditionalData;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin_shared/model/action/custom/openItemsList/AdditionalData;Ljava/util/List;)Lcom/avito/android/beduin_shared/model/action/custom/openItemsList/BeduinOpenItemsListAction$SelectOption;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getLeftText", "getRightText", "Lcom/avito/android/beduin_shared/model/action/custom/openItemsList/AdditionalData;", "getAdditionalData", "Ljava/util/List;", "getSubItems", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SelectOption implements Parcelable {

        @k
        public static final Parcelable.Creator<SelectOption> CREATOR = new a();

        @l
        private final AdditionalData additionalData;

        @k
        private final String id;

        @k
        private final String leftText;

        @l
        private final String rightText;

        @l
        private final List<SelectOption> subItems;

        /* compiled from: BeduinOpenItemsListAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelectOption> {
            @Override // android.os.Parcelable.Creator
            public final SelectOption createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                AdditionalData additionalData = (AdditionalData) parcel.readParcelable(SelectOption.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(SelectOption.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                return new SelectOption(string, string2, string3, additionalData, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final SelectOption[] newArray(int i12) {
                return new SelectOption[i12];
            }
        }

        public SelectOption(@k String str, @k String str2, @l String str3, @l AdditionalData additionalData, @l List<SelectOption> list) {
            this.id = str;
            this.leftText = str2;
            this.rightText = str3;
            this.additionalData = additionalData;
            this.subItems = list;
        }

        public static /* synthetic */ SelectOption copy$default(SelectOption selectOption, String str, String str2, String str3, AdditionalData additionalData, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = selectOption.id;
            }
            if ((i12 & 2) != 0) {
                str2 = selectOption.leftText;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                str3 = selectOption.rightText;
            }
            String str5 = str3;
            if ((i12 & 8) != 0) {
                additionalData = selectOption.additionalData;
            }
            AdditionalData additionalData2 = additionalData;
            if ((i12 & 16) != 0) {
                list = selectOption.subItems;
            }
            return selectOption.copy(str, str4, str5, additionalData2, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getLeftText() {
            return this.leftText;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getRightText() {
            return this.rightText;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final AdditionalData getAdditionalData() {
            return this.additionalData;
        }

        @l
        public final List<SelectOption> component5() {
            return this.subItems;
        }

        @k
        public final SelectOption copy(@k String id2, @k String leftText, @l String rightText, @l AdditionalData additionalData, @l List<SelectOption> subItems) {
            return new SelectOption(id2, leftText, rightText, additionalData, subItems);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectOption)) {
                return false;
            }
            SelectOption selectOption = (SelectOption) other;
            return L.f(this.id, selectOption.id) && L.f(this.leftText, selectOption.leftText) && L.f(this.rightText, selectOption.rightText) && L.f(this.additionalData, selectOption.additionalData) && L.f(this.subItems, selectOption.subItems);
        }

        @l
        public final AdditionalData getAdditionalData() {
            return this.additionalData;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getLeftText() {
            return this.leftText;
        }

        @l
        public final String getRightText() {
            return this.rightText;
        }

        @l
        public final List<SelectOption> getSubItems() {
            return this.subItems;
        }

        public int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.leftText);
            String str = this.rightText;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            AdditionalData additionalData = this.additionalData;
            int iHashCode2 = (iHashCode + (additionalData == null ? 0 : additionalData.hashCode())) * 31;
            List<SelectOption> list = this.subItems;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SelectOption(id=");
            sb2.append(this.id);
            sb2.append(", leftText=");
            sb2.append(this.leftText);
            sb2.append(", rightText=");
            sb2.append(this.rightText);
            sb2.append(", additionalData=");
            sb2.append(this.additionalData);
            sb2.append(", subItems=");
            return H.p(sb2, this.subItems, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.leftText);
            parcel.writeString(this.rightText);
            parcel.writeParcelable(this.additionalData, flags);
            List<SelectOption> list = this.subItems;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((SelectOption) itA.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: BeduinOpenItemsListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/openItemsList/BeduinOpenItemsListAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin_shared.model.action.custom.openItemsList.BeduinOpenItemsListAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinOpenItemsListAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinOpenItemsListAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinOpenItemsListAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinOpenItemsListAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinOpenItemsListAction createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = a.c(SelectOption.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new BeduinOpenItemsListAction(string, linkedHashMap, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinOpenItemsListAction[] newArray(int i12) {
            return new BeduinOpenItemsListAction[i12];
        }
    }

    public BeduinOpenItemsListAction(@l String str, @l Map<String, String> map, @l String str2, @l String str3, @k List<SelectOption> list) {
        this.componentId = str;
        this.linkedComponents = map;
        this.paramName = str2;
        this.title = str3;
        this.items = list;
    }

    public static /* synthetic */ BeduinOpenItemsListAction copy$default(BeduinOpenItemsListAction beduinOpenItemsListAction, String str, Map map, String str2, String str3, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinOpenItemsListAction.componentId;
        }
        if ((i12 & 2) != 0) {
            map = beduinOpenItemsListAction.linkedComponents;
        }
        Map map2 = map;
        if ((i12 & 4) != 0) {
            str2 = beduinOpenItemsListAction.paramName;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            str3 = beduinOpenItemsListAction.title;
        }
        String str5 = str3;
        if ((i12 & 16) != 0) {
            list = beduinOpenItemsListAction.items;
        }
        return beduinOpenItemsListAction.copy(str, map2, str4, str5, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getComponentId() {
        return this.componentId;
    }

    @l
    public final Map<String, String> component2() {
        return this.linkedComponents;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getParamName() {
        return this.paramName;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<SelectOption> component5() {
        return this.items;
    }

    @k
    public final BeduinOpenItemsListAction copy(@l String componentId, @l Map<String, String> linkedComponents, @l String paramName, @l String title, @k List<SelectOption> items) {
        return new BeduinOpenItemsListAction(componentId, linkedComponents, paramName, title, items);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinOpenItemsListAction)) {
            return false;
        }
        BeduinOpenItemsListAction beduinOpenItemsListAction = (BeduinOpenItemsListAction) other;
        return L.f(this.componentId, beduinOpenItemsListAction.componentId) && L.f(this.linkedComponents, beduinOpenItemsListAction.linkedComponents) && L.f(this.paramName, beduinOpenItemsListAction.paramName) && L.f(this.title, beduinOpenItemsListAction.title) && L.f(this.items, beduinOpenItemsListAction.items);
    }

    @l
    public final String getComponentId() {
        return this.componentId;
    }

    @k
    public final List<SelectOption> getItems() {
        return this.items;
    }

    @l
    public final Map<String, String> getLinkedComponents() {
        return this.linkedComponents;
    }

    @l
    public final String getParamName() {
        return this.paramName;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.componentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.linkedComponents;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.paramName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        return this.items.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinOpenItemsListAction(componentId=");
        sb2.append(this.componentId);
        sb2.append(", linkedComponents=");
        sb2.append(this.linkedComponents);
        sb2.append(", paramName=");
        sb2.append(this.paramName);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.componentId);
        Map<String, String> map = this.linkedComponents;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.paramName);
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            ((SelectOption) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
