package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ParameterTransform.kt */
@d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001#B\u001e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\r\u0010\u0006\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000f\b\u0002\u0010\u0006\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u001e\u0010\u0006\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/ParameterTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "", "name", "", "LK51/e;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/avito/android/beduin/common/form/transforms/ParameterTransform;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Ljava/lang/Object;", "getValue", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ParameterTransform implements BeduinModelTransform {

    @k
    private final String name;

    @l
    private final Object value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<ParameterTransform> CREATOR = new b();

    @k
    private static final Class<? extends BeduinModelTransform> transform = ParameterTransform.class;

    @k
    private static final String TYPE = "parameter";

    @k
    private static final String type = TYPE;

    /* compiled from: ParameterTransform.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/ParameterTransform$a;", "LTi/a;", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.form.transforms.ParameterTransform$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15365a {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<? extends BeduinModelTransform> a() {
            return ParameterTransform.transform;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return ParameterTransform.type;
        }

        public Companion() {
        }
    }

    /* compiled from: ParameterTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ParameterTransform> {
        @Override // android.os.Parcelable.Creator
        public final ParameterTransform createFromParcel(Parcel parcel) {
            return new ParameterTransform(parcel.readString(), parcel.readValue(ParameterTransform.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ParameterTransform[] newArray(int i12) {
            return new ParameterTransform[i12];
        }
    }

    public ParameterTransform(@k String str, @l Object obj) {
        this.name = str;
        this.value = obj;
    }

    public static /* synthetic */ ParameterTransform copy$default(ParameterTransform parameterTransform, String str, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            str = parameterTransform.name;
        }
        if ((i12 & 2) != 0) {
            obj = parameterTransform.value;
        }
        return parameterTransform.copy(str, obj);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @k
    public final ParameterTransform copy(@k String name, @l Object value) {
        return new ParameterTransform(name, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParameterTransform)) {
            return false;
        }
        ParameterTransform parameterTransform = (ParameterTransform) other;
        return L.f(this.name, parameterTransform.name) && L.f(this.value, parameterTransform.value);
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Object obj = this.value;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ParameterTransform(name=");
        sb2.append(this.name);
        sb2.append(", value=");
        return H.n(sb2, this.value, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeValue(this.value);
    }
}
