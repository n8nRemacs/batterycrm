package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinApplyWebPaymentMessageAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001.B>\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\nHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\nHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010\u000fR(\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0012R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0014¨\u0006/"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinApplyWebPaymentMessageAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "LUi/e;", "", "targetFormId", "modelId", "", "", "LK51/e;", "postMessageParams", "", "onStartRedirectActions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lcom/avito/android/beduin/common/action/BeduinApplyWebPaymentMessageAction;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTargetFormId", "getModelId", "Ljava/util/Map;", "getPostMessageParams", "Ljava/util/List;", "getOnStartRedirectActions", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinApplyWebPaymentMessageAction implements BeduinAction, Ui.e {

    @Y61.k
    private final String modelId;

    @Y61.k
    private final List<BeduinAction> onStartRedirectActions;

    @Y61.k
    private final Map<String, Object> postMessageParams;

    @Y61.k
    private final String targetFormId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinApplyWebPaymentMessageAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinApplyWebPaymentMessageAction.class;

    @Y61.k
    private static final String type = "applyWebPaymentMessage";

    /* compiled from: BeduinApplyWebPaymentMessageAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinApplyWebPaymentMessageAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinApplyWebPaymentMessageAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinApplyWebPaymentMessageAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinApplyWebPaymentMessageAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinApplyWebPaymentMessageAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinApplyWebPaymentMessageAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinApplyWebPaymentMessageAction createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iL2 = 0;
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = org.webrtc.h.c(BeduinApplyWebPaymentMessageAction.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(BeduinApplyWebPaymentMessageAction.class, parcel, arrayList, iL2, 1);
            }
            return new BeduinApplyWebPaymentMessageAction(string, string2, linkedHashMap, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinApplyWebPaymentMessageAction[] newArray(int i12) {
            return new BeduinApplyWebPaymentMessageAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinApplyWebPaymentMessageAction(@Y61.k String str, @Y61.k String str2, @Y61.k Map<String, ? extends Object> map, @Y61.k List<? extends BeduinAction> list) {
        this.targetFormId = str;
        this.modelId = str2;
        this.postMessageParams = map;
        this.onStartRedirectActions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinApplyWebPaymentMessageAction copy$default(BeduinApplyWebPaymentMessageAction beduinApplyWebPaymentMessageAction, String str, String str2, Map map, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinApplyWebPaymentMessageAction.targetFormId;
        }
        if ((i12 & 2) != 0) {
            str2 = beduinApplyWebPaymentMessageAction.modelId;
        }
        if ((i12 & 4) != 0) {
            map = beduinApplyWebPaymentMessageAction.postMessageParams;
        }
        if ((i12 & 8) != 0) {
            list = beduinApplyWebPaymentMessageAction.onStartRedirectActions;
        }
        return beduinApplyWebPaymentMessageAction.copy(str, str2, map, list);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    @Y61.k
    public final Map<String, Object> component3() {
        return this.postMessageParams;
    }

    @Y61.k
    public final List<BeduinAction> component4() {
        return this.onStartRedirectActions;
    }

    @Y61.k
    public final BeduinApplyWebPaymentMessageAction copy(@Y61.k String targetFormId, @Y61.k String modelId, @Y61.k Map<String, ? extends Object> postMessageParams, @Y61.k List<? extends BeduinAction> onStartRedirectActions) {
        return new BeduinApplyWebPaymentMessageAction(targetFormId, modelId, postMessageParams, onStartRedirectActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinApplyWebPaymentMessageAction)) {
            return false;
        }
        BeduinApplyWebPaymentMessageAction beduinApplyWebPaymentMessageAction = (BeduinApplyWebPaymentMessageAction) other;
        return L.f(this.targetFormId, beduinApplyWebPaymentMessageAction.targetFormId) && L.f(this.modelId, beduinApplyWebPaymentMessageAction.modelId) && L.f(this.postMessageParams, beduinApplyWebPaymentMessageAction.postMessageParams) && L.f(this.onStartRedirectActions, beduinApplyWebPaymentMessageAction.onStartRedirectActions);
    }

    @Y61.k
    public final String getModelId() {
        return this.modelId;
    }

    @Y61.k
    public final List<BeduinAction> getOnStartRedirectActions() {
        return this.onStartRedirectActions;
    }

    @Y61.k
    public final Map<String, Object> getPostMessageParams() {
        return this.postMessageParams;
    }

    @Y61.k
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    public int hashCode() {
        return this.onStartRedirectActions.hashCode() + AK.c.c(H.d(this.targetFormId.hashCode() * 31, 31, this.modelId), 31, this.postMessageParams);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinApplyWebPaymentMessageAction(targetFormId=");
        sb2.append(this.targetFormId);
        sb2.append(", modelId=");
        sb2.append(this.modelId);
        sb2.append(", postMessageParams=");
        sb2.append(this.postMessageParams);
        sb2.append(", onStartRedirectActions=");
        return H.p(sb2, this.onStartRedirectActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.targetFormId);
        parcel.writeString(this.modelId);
        Iterator itI = C0.i(parcel, this.postMessageParams);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
        }
        Iterator itJ = C0.j(this.onStartRedirectActions, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
    }
}
