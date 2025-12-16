package com.avito.android.remote.model.category_parameters.slot.auto_group_block;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.base.WithDependency;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: GroupBlockSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Bg\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b \u0010\u001cR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/GroupBlockSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/auto_group_block/InlineFillParametersStepConfig;", "Lcom/avito/android/remote/model/category_parameters/base/WithDependency;", "", "title", "buttonTitle", "filledParametersButtonTitle", "description", "tooltipText", "", "plurals", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params;", "fillParametersStepConfig", "", "paramsMustBeFilled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getButtonTitle", "getFilledParametersButtonTitle", "getDescription", "getTooltipText", "Ljava/util/Map;", "getPlurals", "()Ljava/util/Map;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params;", "getFillParametersStepConfig", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params;", "Ljava/util/List;", "getParamsMustBeFilled", "()Ljava/util/List;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GroupBlockSlotConfig implements InlineFillParametersStepConfig, WithDependency {

    @k
    public static final Parcelable.Creator<GroupBlockSlotConfig> CREATOR = new Creator();

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c("description")
    @l
    private final String description;

    @c("publishStepConfig")
    @k
    private final CategoryPublishStep.Params fillParametersStepConfig;

    @c("filledParametersButtonTitle")
    @l
    private final String filledParametersButtonTitle;

    @c("paramsMustBeFilled")
    @l
    private final List<String> paramsMustBeFilled;

    @c("descriptionPlurals")
    @l
    private final Map<String, String> plurals;

    @c("title")
    @l
    private final String title;

    @c("tooltipText")
    @l
    private final String tooltipText;

    /* compiled from: GroupBlockSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GroupBlockSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GroupBlockSlotConfig createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
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
            return new GroupBlockSlotConfig(string, string2, string3, string4, string5, linkedHashMap, (CategoryPublishStep.Params) parcel.readParcelable(GroupBlockSlotConfig.class.getClassLoader()), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GroupBlockSlotConfig[] newArray(int i12) {
            return new GroupBlockSlotConfig[i12];
        }
    }

    public GroupBlockSlotConfig(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l Map<String, String> map, @k CategoryPublishStep.Params params, @l List<String> list) {
        this.title = str;
        this.buttonTitle = str2;
        this.filledParametersButtonTitle = str3;
        this.description = str4;
        this.tooltipText = str5;
        this.plurals = map;
        this.fillParametersStepConfig = params;
        this.paramsMustBeFilled = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.auto_group_block.InlineFillParametersStepConfig
    @k
    public CategoryPublishStep.Params getFillParametersStepConfig() {
        return this.fillParametersStepConfig;
    }

    @l
    public final String getFilledParametersButtonTitle() {
        return this.filledParametersButtonTitle;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.WithDependency
    @l
    public List<String> getParamsMustBeFilled() {
        return this.paramsMustBeFilled;
    }

    @l
    public final Map<String, String> getPlurals() {
        return this.plurals;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getTooltipText() {
        return this.tooltipText;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.buttonTitle);
        parcel.writeString(this.filledParametersButtonTitle);
        parcel.writeString(this.description);
        parcel.writeString(this.tooltipText);
        Map<String, String> map = this.plurals;
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
        parcel.writeParcelable(this.fillParametersStepConfig, flags);
        parcel.writeStringList(this.paramsMustBeFilled);
    }
}
