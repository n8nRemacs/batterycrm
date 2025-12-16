package com.avito.android.lib.util.groupable_item;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.o1;
import com.avito.android.util.J3;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GroupingOutput.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/util/groupable_item/GroupingOutput;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class GroupingOutput implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public EdgeMode f181355b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public EdgeMode f181356c;

    /* compiled from: GroupingOutput.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/util/groupable_item/GroupingOutput$a;", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/lib/util/groupable_item/GroupingOutput;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.util.groupable_item.GroupingOutput$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<GroupingOutput> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final GroupingOutput createFromParcel(Parcel parcel) {
            GroupingOutput groupingOutput = new GroupingOutput();
            EdgeMode[] edgeModeArrValues = EdgeMode.values();
            o1<ClassLoader, o1<String, Parcelable.Creator<?>>> o1Var = J3.f318636a;
            groupingOutput.f181355b = edgeModeArrValues[parcel.readInt()];
            groupingOutput.f181356c = EdgeMode.values()[parcel.readInt()];
            return groupingOutput;
        }

        @Override // android.os.Parcelable.Creator
        public final GroupingOutput[] newArray(int i12) {
            return new GroupingOutput[i12];
        }

        public Companion() {
        }
    }

    public GroupingOutput() {
        EdgeMode edgeMode = EdgeMode.f181351c;
        this.f181355b = edgeMode;
        this.f181356c = edgeMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        J3.d(parcel, this.f181355b);
        J3.d(parcel, this.f181356c);
    }
}
