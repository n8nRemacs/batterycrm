package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin.common.component.conditional_group.component.Condition;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConditionTransform.kt */
@d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0014\u0012\u000b\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00070\u0002¢\u0006\u0002\b\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00002\r\b\u0002\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/ConditionTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "LK51/e;", ConditionTransform.TYPE, "<init>", "(Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;)V", "component1", "()Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "copy", "(Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;)Lcom/avito/android/beduin/common/form/transforms/ConditionTransform;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "getCondition", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ConditionTransform implements BeduinModelTransform {

    @k
    private final Condition condition;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<ConditionTransform> CREATOR = new b();

    @k
    private static final Class<? extends BeduinModelTransform> transform = ConditionTransform.class;

    @k
    private static final String TYPE = "condition";

    @k
    private static final String type = TYPE;

    /* compiled from: ConditionTransform.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/ConditionTransform$a;", "LTi/a;", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.form.transforms.ConditionTransform$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15365a {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<? extends BeduinModelTransform> a() {
            return ConditionTransform.transform;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return ConditionTransform.type;
        }

        public Companion() {
        }
    }

    /* compiled from: ConditionTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ConditionTransform> {
        @Override // android.os.Parcelable.Creator
        public final ConditionTransform createFromParcel(Parcel parcel) {
            return new ConditionTransform((Condition) parcel.readParcelable(ConditionTransform.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ConditionTransform[] newArray(int i12) {
            return new ConditionTransform[i12];
        }
    }

    public ConditionTransform(@k Condition condition) {
        this.condition = condition;
    }

    public static /* synthetic */ ConditionTransform copy$default(ConditionTransform conditionTransform, Condition condition, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            condition = conditionTransform.condition;
        }
        return conditionTransform.copy(condition);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Condition getCondition() {
        return this.condition;
    }

    @k
    public final ConditionTransform copy(@k Condition condition) {
        return new ConditionTransform(condition);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConditionTransform) && L.f(this.condition, ((ConditionTransform) other).condition);
    }

    @k
    public final Condition getCondition() {
        return this.condition;
    }

    public int hashCode() {
        return this.condition.hashCode();
    }

    @k
    public String toString() {
        return "ConditionTransform(condition=" + this.condition + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.condition, flags);
    }
}
