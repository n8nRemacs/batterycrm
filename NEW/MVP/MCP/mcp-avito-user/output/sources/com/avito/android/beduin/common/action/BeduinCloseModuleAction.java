package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
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

/* compiled from: BeduinCloseModuleAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B4\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\rR*\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u000f¨\u0006'"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinCloseModuleAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "LUi/e;", "", "parentModuleActions", "", "", "", "LK51/e;", "resultParams", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/util/Map;)Lcom/avito/android/beduin/common/action/BeduinCloseModuleAction;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getParentModuleActions", "Ljava/util/Map;", "getResultParams", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinCloseModuleAction implements BeduinAction, Ui.e {

    @Y61.k
    public static final Parcelable.Creator<BeduinCloseModuleAction> CREATOR = new b();

    @l
    private final List<BeduinAction> parentModuleActions;

    @l
    private final Map<String, Object> resultParams;

    /* compiled from: BeduinCloseModuleAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinCloseModuleAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC15524c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Class<? extends BeduinAction> f99968b = BeduinCloseModuleAction.class;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f99969c = "closeModule";

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return this.f99968b;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType, reason: from getter */
        public final String getF105301c() {
            return this.f99969c;
        }
    }

    /* compiled from: BeduinCloseModuleAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinCloseModuleAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinCloseModuleAction createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinCloseModuleAction.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = org.webrtc.h.c(BeduinCloseModuleAction.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new BeduinCloseModuleAction(arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinCloseModuleAction[] newArray(int i12) {
            return new BeduinCloseModuleAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinCloseModuleAction(@l List<? extends BeduinAction> list, @l Map<String, ? extends Object> map) {
        this.parentModuleActions = list;
        this.resultParams = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinCloseModuleAction copy$default(BeduinCloseModuleAction beduinCloseModuleAction, List list, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = beduinCloseModuleAction.parentModuleActions;
        }
        if ((i12 & 2) != 0) {
            map = beduinCloseModuleAction.resultParams;
        }
        return beduinCloseModuleAction.copy(list, map);
    }

    @l
    public final List<BeduinAction> component1() {
        return this.parentModuleActions;
    }

    @l
    public final Map<String, Object> component2() {
        return this.resultParams;
    }

    @Y61.k
    public final BeduinCloseModuleAction copy(@l List<? extends BeduinAction> parentModuleActions, @l Map<String, ? extends Object> resultParams) {
        return new BeduinCloseModuleAction(parentModuleActions, resultParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinCloseModuleAction)) {
            return false;
        }
        BeduinCloseModuleAction beduinCloseModuleAction = (BeduinCloseModuleAction) other;
        return L.f(this.parentModuleActions, beduinCloseModuleAction.parentModuleActions) && L.f(this.resultParams, beduinCloseModuleAction.resultParams);
    }

    @l
    public final List<BeduinAction> getParentModuleActions() {
        return this.parentModuleActions;
    }

    @l
    public final Map<String, Object> getResultParams() {
        return this.resultParams;
    }

    public int hashCode() {
        List<BeduinAction> list = this.parentModuleActions;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, Object> map = this.resultParams;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinCloseModuleAction(parentModuleActions=");
        sb2.append(this.parentModuleActions);
        sb2.append(", resultParams=");
        return r.w(sb2, this.resultParams, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        List<BeduinAction> list = this.parentModuleActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Map<String, Object> map = this.resultParams;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
        }
    }

    public /* synthetic */ BeduinCloseModuleAction(List list, Map map, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : map);
    }
}
