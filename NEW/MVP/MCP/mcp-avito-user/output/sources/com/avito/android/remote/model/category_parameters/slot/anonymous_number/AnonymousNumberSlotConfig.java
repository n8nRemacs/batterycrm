package com.avito.android.remote.model.category_parameters.slot.anonymous_number;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AnonymousNumberSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/anonymous_number/AnonymousNumberSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "required", "", "", "relatedFields", "<init>", "(Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "component2", "()Ljava/util/List;", "copy", "(Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/slot/anonymous_number/AnonymousNumberSlotConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "getRequired", "Ljava/util/List;", "getRelatedFields", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AnonymousNumberSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<AnonymousNumberSlotConfig> CREATOR = new Creator();

    @c("relatedFields")
    @l
    private final List<String> relatedFields;

    @c("field")
    @k
    private final BooleanParameter required;

    /* compiled from: AnonymousNumberSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnonymousNumberSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AnonymousNumberSlotConfig createFromParcel(@k Parcel parcel) {
            return new AnonymousNumberSlotConfig((BooleanParameter) parcel.readParcelable(AnonymousNumberSlotConfig.class.getClassLoader()), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AnonymousNumberSlotConfig[] newArray(int i12) {
            return new AnonymousNumberSlotConfig[i12];
        }
    }

    public AnonymousNumberSlotConfig(@k BooleanParameter booleanParameter, @l List<String> list) {
        this.required = booleanParameter;
        this.relatedFields = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnonymousNumberSlotConfig copy$default(AnonymousNumberSlotConfig anonymousNumberSlotConfig, BooleanParameter booleanParameter, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            booleanParameter = anonymousNumberSlotConfig.required;
        }
        if ((i12 & 2) != 0) {
            list = anonymousNumberSlotConfig.relatedFields;
        }
        return anonymousNumberSlotConfig.copy(booleanParameter, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final BooleanParameter getRequired() {
        return this.required;
    }

    @l
    public final List<String> component2() {
        return this.relatedFields;
    }

    @k
    public final AnonymousNumberSlotConfig copy(@k BooleanParameter required, @l List<String> relatedFields) {
        return new AnonymousNumberSlotConfig(required, relatedFields);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnonymousNumberSlotConfig)) {
            return false;
        }
        AnonymousNumberSlotConfig anonymousNumberSlotConfig = (AnonymousNumberSlotConfig) other;
        return L.f(this.required, anonymousNumberSlotConfig.required) && L.f(this.relatedFields, anonymousNumberSlotConfig.relatedFields);
    }

    @l
    public final List<String> getRelatedFields() {
        return this.relatedFields;
    }

    @k
    public final BooleanParameter getRequired() {
        return this.required;
    }

    public int hashCode() {
        int iHashCode = this.required.hashCode() * 31;
        List<String> list = this.relatedFields;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AnonymousNumberSlotConfig(required=");
        sb2.append(this.required);
        sb2.append(", relatedFields=");
        return H.p(sb2, this.relatedFields, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.required, flags);
        parcel.writeStringList(this.relatedFields);
    }
}
