package com.avito.android.remote.model.category_parameters.slot.group_inlined_block_slot;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.base.WithDependency;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GroupInlinedBlockSlotConfig.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/group_inlined_block_slot/GroupInlinedBlockSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/base/WithDependency;", "", "title", "", "params", "tooltipText", "paramsMustBeFilled", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getParams", "()Ljava/util/List;", "getTooltipText", "getParamsMustBeFilled", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GroupInlinedBlockSlotConfig implements SlotConfig, WithDependency {

    @k
    public static final Parcelable.Creator<GroupInlinedBlockSlotConfig> CREATOR = new Creator();

    @c("params")
    @l
    private final List<String> params;

    @c("paramsMustBeFilled")
    @l
    private final List<String> paramsMustBeFilled;

    @c("title")
    @l
    private final String title;

    @c("tooltipText")
    @l
    private final String tooltipText;

    /* compiled from: GroupInlinedBlockSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GroupInlinedBlockSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GroupInlinedBlockSlotConfig createFromParcel(@k Parcel parcel) {
            return new GroupInlinedBlockSlotConfig(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GroupInlinedBlockSlotConfig[] newArray(int i12) {
            return new GroupInlinedBlockSlotConfig[i12];
        }
    }

    public GroupInlinedBlockSlotConfig(@l String str, @l List<String> list, @l String str2, @l List<String> list2) {
        this.title = str;
        this.params = list;
        this.tooltipText = str2;
        this.paramsMustBeFilled = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<String> getParams() {
        return this.params;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.WithDependency
    @l
    public List<String> getParamsMustBeFilled() {
        return this.paramsMustBeFilled;
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
        parcel.writeStringList(this.params);
        parcel.writeString(this.tooltipText);
        parcel.writeStringList(this.paramsMustBeFilled);
    }
}
