package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinReplaceComponentsAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001&B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\fR)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u000e¨\u0006'"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinReplaceComponentsAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "LUi/e;", "", "targetFormId", "", "", "Lcom/avito/android/beduin_models/BeduinModel;", "replacement", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/avito/android/beduin/common/action/BeduinReplaceComponentsAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTargetFormId", "Ljava/util/Map;", "getReplacement", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinReplaceComponentsAction implements BeduinAction, Ui.e {

    @Y61.k
    private final Map<String, List<BeduinModel>> replacement;

    @Y61.k
    private final String targetFormId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinReplaceComponentsAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinReplaceComponentsAction.class;

    @Y61.k
    private static final String type = "replaceComponents";

    /* compiled from: BeduinReplaceComponentsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinReplaceComponentsAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinReplaceComponentsAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinReplaceComponentsAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinReplaceComponentsAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinReplaceComponentsAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinReplaceComponentsAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinReplaceComponentsAction createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                String string2 = parcel.readString();
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iL2 = 0;
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinReplaceComponentsAction.class, parcel, arrayList, iL2, 1);
                }
                linkedHashMap.put(string2, arrayList);
            }
            return new BeduinReplaceComponentsAction(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinReplaceComponentsAction[] newArray(int i12) {
            return new BeduinReplaceComponentsAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinReplaceComponentsAction(@Y61.k String str, @Y61.k Map<String, ? extends List<? extends BeduinModel>> map) {
        this.targetFormId = str;
        this.replacement = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinReplaceComponentsAction copy$default(BeduinReplaceComponentsAction beduinReplaceComponentsAction, String str, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinReplaceComponentsAction.targetFormId;
        }
        if ((i12 & 2) != 0) {
            map = beduinReplaceComponentsAction.replacement;
        }
        return beduinReplaceComponentsAction.copy(str, map);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    @Y61.k
    public final Map<String, List<BeduinModel>> component2() {
        return this.replacement;
    }

    @Y61.k
    public final BeduinReplaceComponentsAction copy(@Y61.k String targetFormId, @Y61.k Map<String, ? extends List<? extends BeduinModel>> replacement) {
        return new BeduinReplaceComponentsAction(targetFormId, replacement);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinReplaceComponentsAction)) {
            return false;
        }
        BeduinReplaceComponentsAction beduinReplaceComponentsAction = (BeduinReplaceComponentsAction) other;
        return L.f(this.targetFormId, beduinReplaceComponentsAction.targetFormId) && L.f(this.replacement, beduinReplaceComponentsAction.replacement);
    }

    @Y61.k
    public final Map<String, List<BeduinModel>> getReplacement() {
        return this.replacement;
    }

    @Y61.k
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    public int hashCode() {
        return this.replacement.hashCode() + (this.targetFormId.hashCode() * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinReplaceComponentsAction(targetFormId=");
        sb2.append(this.targetFormId);
        sb2.append(", replacement=");
        return r.w(sb2, this.replacement, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.targetFormId);
        Iterator itI = C0.i(parcel, this.replacement);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            Iterator itJ = C0.j((List) entry.getValue(), parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
        }
    }
}
