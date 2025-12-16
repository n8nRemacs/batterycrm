package com.avito.android.remote.model.widget_analytics;

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
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Analytics.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\nR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\f¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/widget_analytics/EventParams;", "Landroid/os/Parcelable;", "", "version", "", "", "params", "<init>", "(ILjava/util/Map;)V", "component1", "()I", "component2", "()Ljava/util/Map;", "copy", "(ILjava/util/Map;)Lcom/avito/android/remote/model/widget_analytics/EventParams;", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getVersion", "Ljava/util/Map;", "getParams", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EventParams implements Parcelable {

    @k
    public static final Parcelable.Creator<EventParams> CREATOR = new Creator();

    @c("params")
    @k
    private final Map<String, String> params;

    @c("version")
    private final int version;

    /* compiled from: Analytics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EventParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EventParams createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
            int iA2 = 0;
            while (iA2 != i13) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new EventParams(i12, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EventParams[] newArray(int i12) {
            return new EventParams[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventParams() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventParams copy$default(EventParams eventParams, int i12, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = eventParams.version;
        }
        if ((i13 & 2) != 0) {
            map = eventParams.params;
        }
        return eventParams.copy(i12, map);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @k
    public final Map<String, String> component2() {
        return this.params;
    }

    @k
    public final EventParams copy(int version, @k Map<String, String> params) {
        return new EventParams(version, params);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventParams)) {
            return false;
        }
        EventParams eventParams = (EventParams) other;
        return this.version == eventParams.version && L.f(this.params, eventParams.params);
    }

    @k
    public final Map<String, String> getParams() {
        return this.params;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.params.hashCode() + (Integer.hashCode(this.version) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventParams(version=");
        sb2.append(this.version);
        sb2.append(", params=");
        return r.w(sb2, this.params, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.version);
        Iterator itI = C0.i(parcel, this.params);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public EventParams(int i12, @k Map<String, String> map) {
        this.version = i12;
        this.params = map;
    }

    public /* synthetic */ EventParams(int i12, Map map, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12, (i13 & 2) != 0 ? P0.c() : map);
    }
}
