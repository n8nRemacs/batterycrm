package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertEquipments.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u00013BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J`\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0014R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b0\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u0017¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/AdvertEquipments;", "Landroid/os/Parcelable;", "", "title", "subTitle", "buttonTitle", "", "Lcom/avito/android/remote/model/OptionsTile;", "optionsTile", "Lcom/avito/android/remote/model/AdvertEquipments$EquipmentOption;", "options", "Lcom/avito/android/remote/model/AllComplectationsButton;", "allComplectationsButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/AllComplectationsButton;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/avito/android/remote/model/AllComplectationsButton;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/AllComplectationsButton;)Lcom/avito/android/remote/model/AdvertEquipments;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubTitle", "getButtonTitle", "Ljava/util/List;", "getOptionsTile", "getOptions", "Lcom/avito/android/remote/model/AllComplectationsButton;", "getAllComplectationsButton", "EquipmentOption", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertEquipments implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertEquipments> CREATOR = new Creator();

    @c("allComplectationsButton")
    @l
    private final AllComplectationsButton allComplectationsButton;

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c("options")
    @k
    private final List<EquipmentOption> options;

    @c("optionsTile")
    @l
    private final List<OptionsTile> optionsTile;

    @c("subTitle")
    @l
    private final String subTitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: AdvertEquipments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertEquipments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertEquipments createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(OptionsTile.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = a.c(EquipmentOption.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new AdvertEquipments(string, string2, string3, arrayList, arrayList2, parcel.readInt() != 0 ? AllComplectationsButton.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertEquipments[] newArray(int i12) {
            return new AdvertEquipments[i12];
        }
    }

    /* compiled from: AdvertEquipments.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/AdvertEquipments$EquipmentOption;", "Landroid/os/Parcelable;", "", "title", "", "values", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/AdvertEquipments$EquipmentOption;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getValues", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EquipmentOption implements Parcelable {

        @k
        public static final Parcelable.Creator<EquipmentOption> CREATOR = new Creator();

        @c("title")
        @k
        private final String title;

        @c("values")
        @k
        private final List<String> values;

        /* compiled from: AdvertEquipments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EquipmentOption> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EquipmentOption createFromParcel(@k Parcel parcel) {
                return new EquipmentOption(parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EquipmentOption[] newArray(int i12) {
                return new EquipmentOption[i12];
            }
        }

        public EquipmentOption(@k String str, @k List<String> list) {
            this.title = str;
            this.values = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EquipmentOption copy$default(EquipmentOption equipmentOption, String str, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = equipmentOption.title;
            }
            if ((i12 & 2) != 0) {
                list = equipmentOption.values;
            }
            return equipmentOption.copy(str, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final List<String> component2() {
            return this.values;
        }

        @k
        public final EquipmentOption copy(@k String title, @k List<String> values) {
            return new EquipmentOption(title, values);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EquipmentOption)) {
                return false;
            }
            EquipmentOption equipmentOption = (EquipmentOption) other;
            return L.f(this.title, equipmentOption.title) && L.f(this.values, equipmentOption.values);
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final List<String> getValues() {
            return this.values;
        }

        public int hashCode() {
            return this.values.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("EquipmentOption(title=");
            sb2.append(this.title);
            sb2.append(", values=");
            return H.p(sb2, this.values, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeStringList(this.values);
        }
    }

    public AdvertEquipments(@k String str, @l String str2, @l String str3, @l List<OptionsTile> list, @k List<EquipmentOption> list2, @l AllComplectationsButton allComplectationsButton) {
        this.title = str;
        this.subTitle = str2;
        this.buttonTitle = str3;
        this.optionsTile = list;
        this.options = list2;
        this.allComplectationsButton = allComplectationsButton;
    }

    public static /* synthetic */ AdvertEquipments copy$default(AdvertEquipments advertEquipments, String str, String str2, String str3, List list, List list2, AllComplectationsButton allComplectationsButton, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = advertEquipments.title;
        }
        if ((i12 & 2) != 0) {
            str2 = advertEquipments.subTitle;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = advertEquipments.buttonTitle;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            list = advertEquipments.optionsTile;
        }
        List list3 = list;
        if ((i12 & 16) != 0) {
            list2 = advertEquipments.options;
        }
        List list4 = list2;
        if ((i12 & 32) != 0) {
            allComplectationsButton = advertEquipments.allComplectationsButton;
        }
        return advertEquipments.copy(str, str4, str5, list3, list4, allComplectationsButton);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final List<OptionsTile> component4() {
        return this.optionsTile;
    }

    @k
    public final List<EquipmentOption> component5() {
        return this.options;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AllComplectationsButton getAllComplectationsButton() {
        return this.allComplectationsButton;
    }

    @k
    public final AdvertEquipments copy(@k String title, @l String subTitle, @l String buttonTitle, @l List<OptionsTile> optionsTile, @k List<EquipmentOption> options, @l AllComplectationsButton allComplectationsButton) {
        return new AdvertEquipments(title, subTitle, buttonTitle, optionsTile, options, allComplectationsButton);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertEquipments)) {
            return false;
        }
        AdvertEquipments advertEquipments = (AdvertEquipments) other;
        return L.f(this.title, advertEquipments.title) && L.f(this.subTitle, advertEquipments.subTitle) && L.f(this.buttonTitle, advertEquipments.buttonTitle) && L.f(this.optionsTile, advertEquipments.optionsTile) && L.f(this.options, advertEquipments.options) && L.f(this.allComplectationsButton, advertEquipments.allComplectationsButton);
    }

    @l
    public final AllComplectationsButton getAllComplectationsButton() {
        return this.allComplectationsButton;
    }

    @l
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    public final List<EquipmentOption> getOptions() {
        return this.options;
    }

    @l
    public final List<OptionsTile> getOptionsTile() {
        return this.optionsTile;
    }

    @l
    public final String getSubTitle() {
        return this.subTitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<OptionsTile> list = this.optionsTile;
        int iE2 = H.e((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.options);
        AllComplectationsButton allComplectationsButton = this.allComplectationsButton;
        return iE2 + (allComplectationsButton != null ? allComplectationsButton.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdvertEquipments(title=" + this.title + ", subTitle=" + this.subTitle + ", buttonTitle=" + this.buttonTitle + ", optionsTile=" + this.optionsTile + ", options=" + this.options + ", allComplectationsButton=" + this.allComplectationsButton + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.buttonTitle);
        List<OptionsTile> list = this.optionsTile;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((OptionsTile) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((EquipmentOption) itJ.next()).writeToParcel(parcel, flags);
        }
        AllComplectationsButton allComplectationsButton = this.allComplectationsButton;
        if (allComplectationsButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allComplectationsButton.writeToParcel(parcel, flags);
        }
    }
}
