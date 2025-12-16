package com.avito.android.beduin_shared.common.action;

import K51.d;
import Ui.InterfaceC15524c;
import Ui.e;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinApplyTransformAction.kt */
@d
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001(B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b$\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u000f¨\u0006)"}, d2 = {"Lcom/avito/android/beduin_shared/common/action/BeduinApplyTransformAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "LUi/e;", "", "modelId", "targetFormId", "", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transforms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/beduin_shared/common/action/BeduinApplyTransformAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getModelId", "getTargetFormId", "Ljava/util/List;", "getTransforms", "Companion", "a", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinApplyTransformAction implements BeduinAction, e {

    @k
    private final String modelId;

    @k
    private final String targetFormId;

    @k
    private final List<BeduinModelTransform> transforms;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinApplyTransformAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinApplyTransformAction.class;

    @k
    private static final String TYPE = "applyTransform";

    @k
    private static final String type = TYPE;

    /* compiled from: BeduinApplyTransformAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin_shared/common/action/BeduinApplyTransformAction$a;", "LUi/c;", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin_shared.common.action.BeduinApplyTransformAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinApplyTransformAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinApplyTransformAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinApplyTransformAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinApplyTransformAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinApplyTransformAction createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(BeduinApplyTransformAction.class, parcel, arrayList, iL2, 1);
            }
            return new BeduinApplyTransformAction(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinApplyTransformAction[] newArray(int i12) {
            return new BeduinApplyTransformAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinApplyTransformAction(@k String str, @k String str2, @k List<? extends BeduinModelTransform> list) {
        this.modelId = str;
        this.targetFormId = str2;
        this.transforms = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinApplyTransformAction copy$default(BeduinApplyTransformAction beduinApplyTransformAction, String str, String str2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinApplyTransformAction.modelId;
        }
        if ((i12 & 2) != 0) {
            str2 = beduinApplyTransformAction.targetFormId;
        }
        if ((i12 & 4) != 0) {
            list = beduinApplyTransformAction.transforms;
        }
        return beduinApplyTransformAction.copy(str, str2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    @k
    public final List<BeduinModelTransform> component3() {
        return this.transforms;
    }

    @k
    public final BeduinApplyTransformAction copy(@k String modelId, @k String targetFormId, @k List<? extends BeduinModelTransform> transforms) {
        return new BeduinApplyTransformAction(modelId, targetFormId, transforms);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinApplyTransformAction)) {
            return false;
        }
        BeduinApplyTransformAction beduinApplyTransformAction = (BeduinApplyTransformAction) other;
        return L.f(this.modelId, beduinApplyTransformAction.modelId) && L.f(this.targetFormId, beduinApplyTransformAction.targetFormId) && L.f(this.transforms, beduinApplyTransformAction.transforms);
    }

    @k
    public final String getModelId() {
        return this.modelId;
    }

    @k
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    @k
    public final List<BeduinModelTransform> getTransforms() {
        return this.transforms;
    }

    public int hashCode() {
        return this.transforms.hashCode() + H.d(this.modelId.hashCode() * 31, 31, this.targetFormId);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinApplyTransformAction(modelId=");
        sb2.append(this.modelId);
        sb2.append(", targetFormId=");
        sb2.append(this.targetFormId);
        sb2.append(", transforms=");
        return H.p(sb2, this.transforms, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.modelId);
        parcel.writeString(this.targetFormId);
        Iterator itJ = C0.j(this.transforms, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
    }
}
