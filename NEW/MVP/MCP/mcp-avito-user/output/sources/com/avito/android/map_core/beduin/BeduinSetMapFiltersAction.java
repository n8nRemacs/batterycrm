package com.avito.android.map_core.beduin;

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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: BeduinSetMapFiltersAction.kt */
@d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\"\u0012\u0019\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000b\u001a\u00020\u00002\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\n¨\u0006!"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinSetMapFiltersAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "", "", "LK51/e;", "filters", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/avito/android/map_core/beduin/BeduinSetMapFiltersAction;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getFilters", "Companion", "a", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BeduinSetMapFiltersAction implements BeduinAction {

    @l
    private final Map<String, Object> filters;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinSetMapFiltersAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinSetMapFiltersAction.class;

    @k
    private static final String type = "setMapFilters";

    /* compiled from: BeduinSetMapFiltersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinSetMapFiltersAction$a;", "LUi/c;", "<init>", "()V", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map_core.beduin.BeduinSetMapFiltersAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinSetMapFiltersAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF99987c() {
            return BeduinSetMapFiltersAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinSetMapFiltersAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinSetMapFiltersAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSetMapFiltersAction createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(BeduinSetMapFiltersAction.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new BeduinSetMapFiltersAction(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSetMapFiltersAction[] newArray(int i12) {
            return new BeduinSetMapFiltersAction[i12];
        }
    }

    public BeduinSetMapFiltersAction(@l Map<String, ? extends Object> map) {
        this.filters = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinSetMapFiltersAction copy$default(BeduinSetMapFiltersAction beduinSetMapFiltersAction, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            map = beduinSetMapFiltersAction.filters;
        }
        return beduinSetMapFiltersAction.copy(map);
    }

    @l
    public final Map<String, Object> component1() {
        return this.filters;
    }

    @k
    public final BeduinSetMapFiltersAction copy(@l Map<String, ? extends Object> filters) {
        return new BeduinSetMapFiltersAction(filters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeduinSetMapFiltersAction) && L.f(this.filters, ((BeduinSetMapFiltersAction) other).filters);
    }

    @l
    public final Map<String, Object> getFilters() {
        return this.filters;
    }

    public int hashCode() {
        Map<String, Object> map = this.filters;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @k
    public String toString() {
        return r.w(new StringBuilder("BeduinSetMapFiltersAction(filters="), this.filters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Map<String, Object> map = this.filters;
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
}
