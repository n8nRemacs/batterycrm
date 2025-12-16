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
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: BeduinShowSpecificLocationAction.kt */
@d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001*B4\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0019\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000fR*\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinShowSpecificLocationAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "path", "", "requestTimeout", "", "", "LK51/e;", "extraRequestParams", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Float;", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/Float;Ljava/util/Map;)Lcom/avito/android/map_core/beduin/BeduinShowSpecificLocationAction;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPath", "Ljava/lang/Float;", "getRequestTimeout", "Ljava/util/Map;", "getExtraRequestParams", "Companion", "a", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BeduinShowSpecificLocationAction implements BeduinAction {

    @l
    private final Map<String, Object> extraRequestParams;

    @k
    private final String path;

    @l
    private final Float requestTimeout;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinShowSpecificLocationAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinShowSpecificLocationAction.class;

    @k
    private static final String type = "showSpecificLocation";

    /* compiled from: BeduinShowSpecificLocationAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinShowSpecificLocationAction$a;", "LUi/c;", "<init>", "()V", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map_core.beduin.BeduinShowSpecificLocationAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinShowSpecificLocationAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinShowSpecificLocationAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinShowSpecificLocationAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinShowSpecificLocationAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinShowSpecificLocationAction createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(BeduinShowSpecificLocationAction.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new BeduinShowSpecificLocationAction(string, fValueOf, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinShowSpecificLocationAction[] newArray(int i12) {
            return new BeduinShowSpecificLocationAction[i12];
        }
    }

    public BeduinShowSpecificLocationAction(@k String str, @l Float f12, @l Map<String, ? extends Object> map) {
        this.path = str;
        this.requestTimeout = f12;
        this.extraRequestParams = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinShowSpecificLocationAction copy$default(BeduinShowSpecificLocationAction beduinShowSpecificLocationAction, String str, Float f12, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinShowSpecificLocationAction.path;
        }
        if ((i12 & 2) != 0) {
            f12 = beduinShowSpecificLocationAction.requestTimeout;
        }
        if ((i12 & 4) != 0) {
            map = beduinShowSpecificLocationAction.extraRequestParams;
        }
        return beduinShowSpecificLocationAction.copy(str, f12, map);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Float getRequestTimeout() {
        return this.requestTimeout;
    }

    @l
    public final Map<String, Object> component3() {
        return this.extraRequestParams;
    }

    @k
    public final BeduinShowSpecificLocationAction copy(@k String path, @l Float requestTimeout, @l Map<String, ? extends Object> extraRequestParams) {
        return new BeduinShowSpecificLocationAction(path, requestTimeout, extraRequestParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinShowSpecificLocationAction)) {
            return false;
        }
        BeduinShowSpecificLocationAction beduinShowSpecificLocationAction = (BeduinShowSpecificLocationAction) other;
        return L.f(this.path, beduinShowSpecificLocationAction.path) && L.f(this.requestTimeout, beduinShowSpecificLocationAction.requestTimeout) && L.f(this.extraRequestParams, beduinShowSpecificLocationAction.extraRequestParams);
    }

    @l
    public final Map<String, Object> getExtraRequestParams() {
        return this.extraRequestParams;
    }

    @k
    public final String getPath() {
        return this.path;
    }

    @l
    public final Float getRequestTimeout() {
        return this.requestTimeout;
    }

    public int hashCode() {
        int iHashCode = this.path.hashCode() * 31;
        Float f12 = this.requestTimeout;
        int iHashCode2 = (iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31;
        Map<String, Object> map = this.extraRequestParams;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinShowSpecificLocationAction(path=");
        sb2.append(this.path);
        sb2.append(", requestTimeout=");
        sb2.append(this.requestTimeout);
        sb2.append(", extraRequestParams=");
        return r.w(sb2, this.extraRequestParams, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.path);
        Float f12 = this.requestTimeout;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        Map<String, Object> map = this.extraRequestParams;
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
