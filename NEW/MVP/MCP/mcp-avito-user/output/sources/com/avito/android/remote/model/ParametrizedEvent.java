package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: ParametrizedEvent.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0019\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JA\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\rR-\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0010¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/ParametrizedEvent;", "Landroid/os/Parcelable;", "", "id", "version", "", "", "", "LK51/e;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(IILjava/util/Map;)V", "component1", "()I", "component2", "component3", "()Ljava/util/Map;", "copy", "(IILjava/util/Map;)Lcom/avito/android/remote/model/ParametrizedEvent;", "toString", "()Ljava/lang/String;", "hashCode", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "getVersion", "Ljava/util/Map;", "getParameters", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ParametrizedEvent implements Parcelable {

    @k
    public static final Parcelable.Creator<ParametrizedEvent> CREATOR = new Creator();

    @c("id")
    private final int id;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final Map<String, Object> parameters;

    @c("version")
    private final int version;

    /* compiled from: ParametrizedEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ParametrizedEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ParametrizedEvent createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                int iC2 = 0;
                while (iC2 != i14) {
                    iC2 = h.c(ParametrizedEvent.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ParametrizedEvent(i12, i13, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ParametrizedEvent[] newArray(int i12) {
            return new ParametrizedEvent[i12];
        }
    }

    public ParametrizedEvent(int i12, int i13, @l Map<String, ? extends Object> map) {
        this.id = i12;
        this.version = i13;
        this.parameters = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParametrizedEvent copy$default(ParametrizedEvent parametrizedEvent, int i12, int i13, Map map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i12 = parametrizedEvent.id;
        }
        if ((i14 & 2) != 0) {
            i13 = parametrizedEvent.version;
        }
        if ((i14 & 4) != 0) {
            map = parametrizedEvent.parameters;
        }
        return parametrizedEvent.copy(i12, i13, map);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @l
    public final Map<String, Object> component3() {
        return this.parameters;
    }

    @k
    public final ParametrizedEvent copy(int id2, int version, @l Map<String, ? extends Object> parameters) {
        return new ParametrizedEvent(id2, version, parameters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParametrizedEvent)) {
            return false;
        }
        ParametrizedEvent parametrizedEvent = (ParametrizedEvent) other;
        return this.id == parametrizedEvent.id && this.version == parametrizedEvent.version && L.f(this.parameters, parametrizedEvent.parameters);
    }

    public final int getId() {
        return this.id;
    }

    @l
    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iE2 = r.e(this.version, Integer.hashCode(this.id) * 31, 31);
        Map<String, Object> map = this.parameters;
        return iE2 + (map == null ? 0 : map.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ParametrizedEvent(id=");
        sb2.append(this.id);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", parameters=");
        return r.w(sb2, this.parameters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.version);
        Map<String, Object> map = this.parameters;
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
