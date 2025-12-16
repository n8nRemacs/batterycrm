package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinModelTransform.kt */
@d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/IsEnabledOptionTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "", "Lcom/avito/android/beduin/common/form/transforms/IsEnabledOptionTransform$Option;", "transformOptions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/beduin/common/form/transforms/IsEnabledOptionTransform;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getTransformOptions", "Companion", "a", "Option", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class IsEnabledOptionTransform implements BeduinModelTransform {

    @k
    private final List<Option> transformOptions;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<IsEnabledOptionTransform> CREATOR = new b();

    @k
    private static final Class<? extends BeduinModelTransform> transform = IsEnabledOptionTransform.class;

    @k
    private static final String TYPE = "isEnabledOption";

    @k
    private static final String type = TYPE;

    /* compiled from: BeduinModelTransform.kt */
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b¨\u0006 "}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/IsEnabledOptionTransform$Option;", "Landroid/os/Parcelable;", "", "isEnabled", "", "optionId", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/avito/android/beduin/common/form/transforms/IsEnabledOptionTransform$Option;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Ljava/lang/String;", "getOptionId", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Option implements Parcelable {

        @k
        public static final Parcelable.Creator<Option> CREATOR = new a();
        private final boolean isEnabled;

        @k
        private final String optionId;

        /* compiled from: BeduinModelTransform.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Option> {
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                return new Option(parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i12) {
                return new Option[i12];
            }
        }

        public Option(boolean z12, @k String str) {
            this.isEnabled = z12;
            this.optionId = str;
        }

        public static /* synthetic */ Option copy$default(Option option, boolean z12, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = option.isEnabled;
            }
            if ((i12 & 2) != 0) {
                str = option.optionId;
            }
            return option.copy(z12, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getOptionId() {
            return this.optionId;
        }

        @k
        public final Option copy(boolean isEnabled, @k String optionId) {
            return new Option(isEnabled, optionId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return this.isEnabled == option.isEnabled && L.f(this.optionId, option.optionId);
        }

        @k
        public final String getOptionId() {
            return this.optionId;
        }

        public int hashCode() {
            return this.optionId.hashCode() + (Boolean.hashCode(this.isEnabled) * 31);
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Option(isEnabled=");
            sb2.append(this.isEnabled);
            sb2.append(", optionId=");
            return C22026a.c(sb2, this.optionId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.isEnabled ? 1 : 0);
            parcel.writeString(this.optionId);
        }
    }

    /* compiled from: BeduinModelTransform.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/IsEnabledOptionTransform$a;", "LTi/a;", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.form.transforms.IsEnabledOptionTransform$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15365a {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<? extends BeduinModelTransform> a() {
            return IsEnabledOptionTransform.transform;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return IsEnabledOptionTransform.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinModelTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<IsEnabledOptionTransform> {
        @Override // android.os.Parcelable.Creator
        public final IsEnabledOptionTransform createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new IsEnabledOptionTransform(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final IsEnabledOptionTransform[] newArray(int i12) {
            return new IsEnabledOptionTransform[i12];
        }
    }

    public IsEnabledOptionTransform(@k List<Option> list) {
        this.transformOptions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IsEnabledOptionTransform copy$default(IsEnabledOptionTransform isEnabledOptionTransform, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = isEnabledOptionTransform.transformOptions;
        }
        return isEnabledOptionTransform.copy(list);
    }

    @k
    public final List<Option> component1() {
        return this.transformOptions;
    }

    @k
    public final IsEnabledOptionTransform copy(@k List<Option> transformOptions) {
        return new IsEnabledOptionTransform(transformOptions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IsEnabledOptionTransform) && L.f(this.transformOptions, ((IsEnabledOptionTransform) other).transformOptions);
    }

    @k
    public final List<Option> getTransformOptions() {
        return this.transformOptions;
    }

    public int hashCode() {
        return this.transformOptions.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("IsEnabledOptionTransform(transformOptions="), this.transformOptions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.transformOptions, parcel);
        while (itJ.hasNext()) {
            ((Option) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
