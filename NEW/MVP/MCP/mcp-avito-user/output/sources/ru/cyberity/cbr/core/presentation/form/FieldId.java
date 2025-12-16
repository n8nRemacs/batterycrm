package ru.cyberity.cbr.core.presentation.form;

import K51.d;
import X41.n;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

/* compiled from: FieldId.kt */
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J(\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010%\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0015¨\u0006/"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/FieldId;", "Landroid/os/Parcelable;", "", "sectionId", "itemId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "write$Self", "(Lru/cyberity/cbr/core/presentation/form/FieldId;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lru/cyberity/cbr/core/presentation/form/FieldId;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSectionId", "getSectionId$annotations", "()V", "getItemId", "getItemId$annotations", "Companion", "$serializer", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@d
@w
/* loaded from: classes9.dex */
public final /* data */ class FieldId implements Parcelable {

    @l
    private final String itemId;

    @l
    private final String sectionId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<FieldId> CREATOR = new Creator();

    /* compiled from: FieldId.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/FieldId$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/presentation/form/FieldId;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<FieldId> serializer() {
            return FieldId$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* compiled from: FieldId.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FieldId> {
        @Override // android.os.Parcelable.Creator
        @k
        public final FieldId createFromParcel(@k Parcel parcel) {
            return new FieldId(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @k
        public final FieldId[] newArray(int i12) {
            return new FieldId[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FieldId() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (C42822w) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ FieldId copy$default(FieldId fieldId, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = fieldId.sectionId;
        }
        if ((i12 & 2) != 0) {
            str2 = fieldId.itemId;
        }
        return fieldId.copy(str, str2);
    }

    @n
    public static final void write$Self(@k FieldId self, @k kotlinx.serialization.encoding.d output, @k SerialDescriptor serialDesc) {
        if (output.u() || self.sectionId != null) {
            output.p(serialDesc, 0, V0.f412822a, self.sectionId);
        }
        if (!output.u() && self.itemId == null) {
            return;
        }
        output.p(serialDesc, 1, V0.f412822a, self.itemId);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getSectionId() {
        return this.sectionId;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @k
    public final FieldId copy(@l String sectionId, @l String itemId) {
        return new FieldId(sectionId, itemId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldId)) {
            return false;
        }
        FieldId fieldId = (FieldId) other;
        return L.f(this.sectionId, fieldId.sectionId) && L.f(this.itemId, fieldId.itemId);
    }

    @l
    public final String getItemId() {
        return this.itemId;
    }

    @l
    public final String getSectionId() {
        return this.sectionId;
    }

    public int hashCode() {
        String str = this.sectionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FieldId(sectionId=");
        sb2.append(this.sectionId);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.itemId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.sectionId);
        parcel.writeString(this.itemId);
    }

    @InterfaceC42830m
    public /* synthetic */ FieldId(int i12, @v String str, @v String str2, P0 p02) {
        if ((i12 & 1) == 0) {
            this.sectionId = null;
        } else {
            this.sectionId = str;
        }
        if ((i12 & 2) == 0) {
            this.itemId = null;
        } else {
            this.itemId = str2;
        }
    }

    public FieldId(@l String str, @l String str2) {
        this.sectionId = str;
        this.itemId = str2;
    }

    public /* synthetic */ FieldId(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }

    @v
    public static /* synthetic */ void getItemId$annotations() {
    }

    @v
    public static /* synthetic */ void getSectionId$annotations() {
    }
}
