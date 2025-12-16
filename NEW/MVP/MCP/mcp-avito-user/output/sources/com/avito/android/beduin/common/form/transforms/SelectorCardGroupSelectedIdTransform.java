package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinModelTransform.kt */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/SelectorCardGroupSelectedIdTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "", "newSelectedId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/beduin/common/form/transforms/SelectorCardGroupSelectedIdTransform;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getNewSelectedId", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
@d
/* loaded from: classes11.dex */
public final /* data */ class SelectorCardGroupSelectedIdTransform implements BeduinModelTransform {

    @k
    private final String newSelectedId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<SelectorCardGroupSelectedIdTransform> CREATOR = new b();

    @k
    private static final Class<SelectorCardGroupSelectedIdTransform> transform = SelectorCardGroupSelectedIdTransform.class;

    @k
    private static final String type = "selectorCardGroup";

    /* compiled from: BeduinModelTransform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/SelectorCardGroupSelectedIdTransform$a;", "LTi/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.form.transforms.SelectorCardGroupSelectedIdTransform$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15365a {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<SelectorCardGroupSelectedIdTransform> a() {
            return SelectorCardGroupSelectedIdTransform.transform;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return SelectorCardGroupSelectedIdTransform.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinModelTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SelectorCardGroupSelectedIdTransform> {
        @Override // android.os.Parcelable.Creator
        public final SelectorCardGroupSelectedIdTransform createFromParcel(Parcel parcel) {
            return new SelectorCardGroupSelectedIdTransform(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectorCardGroupSelectedIdTransform[] newArray(int i12) {
            return new SelectorCardGroupSelectedIdTransform[i12];
        }
    }

    public SelectorCardGroupSelectedIdTransform(@k String str) {
        this.newSelectedId = str;
    }

    public static /* synthetic */ SelectorCardGroupSelectedIdTransform copy$default(SelectorCardGroupSelectedIdTransform selectorCardGroupSelectedIdTransform, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = selectorCardGroupSelectedIdTransform.newSelectedId;
        }
        return selectorCardGroupSelectedIdTransform.copy(str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getNewSelectedId() {
        return this.newSelectedId;
    }

    @k
    public final SelectorCardGroupSelectedIdTransform copy(@k String newSelectedId) {
        return new SelectorCardGroupSelectedIdTransform(newSelectedId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SelectorCardGroupSelectedIdTransform) && L.f(this.newSelectedId, ((SelectorCardGroupSelectedIdTransform) other).newSelectedId);
    }

    @k
    public final String getNewSelectedId() {
        return this.newSelectedId;
    }

    public int hashCode() {
        return this.newSelectedId.hashCode();
    }

    @k
    public String toString() {
        return C22026a.c(new StringBuilder("SelectorCardGroupSelectedIdTransform(newSelectedId="), this.newSelectedId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.newSelectedId);
    }
}
