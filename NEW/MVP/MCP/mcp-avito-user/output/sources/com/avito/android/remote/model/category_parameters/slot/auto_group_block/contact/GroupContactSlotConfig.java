package com.avito.android.remote.model.category_parameters.slot.auto_group_block.contact;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.InlineFillParametersStepConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GroupContactSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB7\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/contact/GroupContactSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/InlineFillParametersStepConfig;", "", "", "params", "buttonTitle", "Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/contact/GroupContactSlotConfig$DisplayingParam;", "displayingParams", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params;", "fillParametersStepConfig", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getParams", "()Ljava/util/List;", "Ljava/lang/String;", "getButtonTitle", "()Ljava/lang/String;", "getDisplayingParams", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params;", "getFillParametersStepConfig", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params;", "DisplayingParam", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GroupContactSlotConfig implements InlineFillParametersStepConfig {

    @k
    public static final Parcelable.Creator<GroupContactSlotConfig> CREATOR = new Creator();

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c("displayingParams")
    @k
    private final List<DisplayingParam> displayingParams;

    @c("publishStepConfig")
    @k
    private final CategoryPublishStep.Params fillParametersStepConfig;

    @c("params")
    @l
    private final List<String> params;

    /* compiled from: GroupContactSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GroupContactSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GroupContactSlotConfig createFromParcel(@k Parcel parcel) {
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(DisplayingParam.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new GroupContactSlotConfig(arrayListCreateStringArrayList, string, arrayList, (CategoryPublishStep.Params) parcel.readParcelable(GroupContactSlotConfig.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GroupContactSlotConfig[] newArray(int i12) {
            return new GroupContactSlotConfig[i12];
        }
    }

    /* compiled from: GroupContactSlotConfig.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/contact/GroupContactSlotConfig$DisplayingParam;", "Landroid/os/Parcelable;", "", "id", "label", "displayParameter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/contact/GroupContactSlotConfig$DisplayingParam;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getLabel", "getDisplayParameter", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DisplayingParam implements Parcelable {

        @k
        public static final Parcelable.Creator<DisplayingParam> CREATOR = new Creator();

        @c("displayParameter")
        @l
        private final String displayParameter;

        @c("id")
        @k
        private final String id;

        @c("label")
        @k
        private final String label;

        /* compiled from: GroupContactSlotConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DisplayingParam> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DisplayingParam createFromParcel(@k Parcel parcel) {
                return new DisplayingParam(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DisplayingParam[] newArray(int i12) {
                return new DisplayingParam[i12];
            }
        }

        public DisplayingParam(@k String str, @k String str2, @l String str3) {
            this.id = str;
            this.label = str2;
            this.displayParameter = str3;
        }

        public static /* synthetic */ DisplayingParam copy$default(DisplayingParam displayingParam, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = displayingParam.id;
            }
            if ((i12 & 2) != 0) {
                str2 = displayingParam.label;
            }
            if ((i12 & 4) != 0) {
                str3 = displayingParam.displayParameter;
            }
            return displayingParam.copy(str, str2, str3);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getDisplayParameter() {
            return this.displayParameter;
        }

        @k
        public final DisplayingParam copy(@k String id2, @k String label, @l String displayParameter) {
            return new DisplayingParam(id2, label, displayParameter);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisplayingParam)) {
                return false;
            }
            DisplayingParam displayingParam = (DisplayingParam) other;
            return L.f(this.id, displayingParam.id) && L.f(this.label, displayingParam.label) && L.f(this.displayParameter, displayingParam.displayParameter);
        }

        @l
        public final String getDisplayParameter() {
            return this.displayParameter;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.label);
            String str = this.displayParameter;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DisplayingParam(id=");
            sb2.append(this.id);
            sb2.append(", label=");
            sb2.append(this.label);
            sb2.append(", displayParameter=");
            return C22026a.c(sb2, this.displayParameter, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.label);
            parcel.writeString(this.displayParameter);
        }
    }

    public GroupContactSlotConfig(@l List<String> list, @l String str, @k List<DisplayingParam> list2, @k CategoryPublishStep.Params params) {
        this.params = list;
        this.buttonTitle = str;
        this.displayingParams = list2;
        this.fillParametersStepConfig = params;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    public final List<DisplayingParam> getDisplayingParams() {
        return this.displayingParams;
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.auto_group_block.InlineFillParametersStepConfig
    @k
    public CategoryPublishStep.Params getFillParametersStepConfig() {
        return this.fillParametersStepConfig;
    }

    @l
    public final List<String> getParams() {
        return this.params;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeStringList(this.params);
        parcel.writeString(this.buttonTitle);
        Iterator itJ = C0.j(this.displayingParams, parcel);
        while (itJ.hasNext()) {
            ((DisplayingParam) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.fillParametersStepConfig, flags);
    }
}
