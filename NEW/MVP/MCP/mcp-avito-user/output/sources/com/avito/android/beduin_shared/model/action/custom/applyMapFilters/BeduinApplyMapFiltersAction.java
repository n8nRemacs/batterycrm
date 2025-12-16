package com.avito.android.beduin_shared.model.action.custom.applyMapFilters;

import K51.d;
import Ui.InterfaceC15524c;
import Y61.k;
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
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: BeduinApplyMapFiltersAction.kt */
@d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002'(B2\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0019\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\fR3\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u000e¨\u0006)"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/applyMapFilters/BeduinApplyMapFiltersAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "", "parameterIds", "", "", "LK51/e;", "preselectedFilters", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/util/Map;)Lcom/avito/android/beduin_shared/model/action/custom/applyMapFilters/BeduinApplyMapFiltersAction;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getParameterIds", "Ljava/util/Map;", "getPreselectedFilters", "getPreselectedFilters$annotations", "()V", "a", "b", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinApplyMapFiltersAction implements BeduinAction {

    @k
    public static final Parcelable.Creator<BeduinApplyMapFiltersAction> CREATOR = new c();

    @l
    private final List<String> parameterIds;

    @com.google.gson.annotations.c("filters")
    @l
    private final Map<String, Object> preselectedFilters;

    /* compiled from: BeduinApplyMapFiltersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/applyMapFilters/BeduinApplyMapFiltersAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public static final class a implements InterfaceC15524c {
        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinApplyMapFiltersAction.class;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF99987c() {
            return "applyMapFilters";
        }
    }

    /* compiled from: BeduinApplyMapFiltersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/applyMapFilters/BeduinApplyMapFiltersAction$b;", "LUi/c;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC15524c {
        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinApplyMapFiltersAction.class;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF99987c() {
            return "applyMapFiltersByForm";
        }
    }

    /* compiled from: BeduinApplyMapFiltersAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<BeduinApplyMapFiltersAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinApplyMapFiltersAction createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(BeduinApplyMapFiltersAction.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new BeduinApplyMapFiltersAction(arrayListCreateStringArrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinApplyMapFiltersAction[] newArray(int i12) {
            return new BeduinApplyMapFiltersAction[i12];
        }
    }

    public BeduinApplyMapFiltersAction(@l List<String> list, @l Map<String, ? extends Object> map) {
        this.parameterIds = list;
        this.preselectedFilters = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinApplyMapFiltersAction copy$default(BeduinApplyMapFiltersAction beduinApplyMapFiltersAction, List list, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = beduinApplyMapFiltersAction.parameterIds;
        }
        if ((i12 & 2) != 0) {
            map = beduinApplyMapFiltersAction.preselectedFilters;
        }
        return beduinApplyMapFiltersAction.copy(list, map);
    }

    @l
    public final List<String> component1() {
        return this.parameterIds;
    }

    @l
    public final Map<String, Object> component2() {
        return this.preselectedFilters;
    }

    @k
    public final BeduinApplyMapFiltersAction copy(@l List<String> parameterIds, @l Map<String, ? extends Object> preselectedFilters) {
        return new BeduinApplyMapFiltersAction(parameterIds, preselectedFilters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinApplyMapFiltersAction)) {
            return false;
        }
        BeduinApplyMapFiltersAction beduinApplyMapFiltersAction = (BeduinApplyMapFiltersAction) other;
        return L.f(this.parameterIds, beduinApplyMapFiltersAction.parameterIds) && L.f(this.preselectedFilters, beduinApplyMapFiltersAction.preselectedFilters);
    }

    @l
    public final List<String> getParameterIds() {
        return this.parameterIds;
    }

    @l
    public final Map<String, Object> getPreselectedFilters() {
        return this.preselectedFilters;
    }

    public int hashCode() {
        List<String> list = this.parameterIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, Object> map = this.preselectedFilters;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinApplyMapFiltersAction(parameterIds=");
        sb2.append(this.parameterIds);
        sb2.append(", preselectedFilters=");
        return r.w(sb2, this.preselectedFilters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeStringList(this.parameterIds);
        Map<String, Object> map = this.preselectedFilters;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
    }

    @InterfaceC42830m
    public static /* synthetic */ void getPreselectedFilters$annotations() {
    }
}
