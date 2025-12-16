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

/* compiled from: ComfortableDealPromoBanner.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u001e\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000bR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u000e¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/ComfortableDealAnalyticsEvent;", "Landroid/os/Parcelable;", "", "id", "version", "", "", "params", "<init>", "(IILjava/util/Map;)V", "component1", "()I", "component2", "component3", "()Ljava/util/Map;", "copy", "(IILjava/util/Map;)Lcom/avito/android/remote/model/ComfortableDealAnalyticsEvent;", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "getVersion", "Ljava/util/Map;", "getParams", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ComfortableDealAnalyticsEvent implements Parcelable {

    @k
    public static final Parcelable.Creator<ComfortableDealAnalyticsEvent> CREATOR = new Creator();

    @c("eid")
    private final int id;

    @c("params")
    @l
    private final Map<String, String> params;

    @c("version")
    private final int version;

    /* compiled from: ComfortableDealPromoBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ComfortableDealAnalyticsEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComfortableDealAnalyticsEvent createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ComfortableDealAnalyticsEvent(i12, i13, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComfortableDealAnalyticsEvent[] newArray(int i12) {
            return new ComfortableDealAnalyticsEvent[i12];
        }
    }

    public ComfortableDealAnalyticsEvent(int i12, int i13, @l Map<String, String> map) {
        this.id = i12;
        this.version = i13;
        this.params = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComfortableDealAnalyticsEvent copy$default(ComfortableDealAnalyticsEvent comfortableDealAnalyticsEvent, int i12, int i13, Map map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i12 = comfortableDealAnalyticsEvent.id;
        }
        if ((i14 & 2) != 0) {
            i13 = comfortableDealAnalyticsEvent.version;
        }
        if ((i14 & 4) != 0) {
            map = comfortableDealAnalyticsEvent.params;
        }
        return comfortableDealAnalyticsEvent.copy(i12, i13, map);
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
    public final Map<String, String> component3() {
        return this.params;
    }

    @k
    public final ComfortableDealAnalyticsEvent copy(int id2, int version, @l Map<String, String> params) {
        return new ComfortableDealAnalyticsEvent(id2, version, params);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComfortableDealAnalyticsEvent)) {
            return false;
        }
        ComfortableDealAnalyticsEvent comfortableDealAnalyticsEvent = (ComfortableDealAnalyticsEvent) other;
        return this.id == comfortableDealAnalyticsEvent.id && this.version == comfortableDealAnalyticsEvent.version && L.f(this.params, comfortableDealAnalyticsEvent.params);
    }

    public final int getId() {
        return this.id;
    }

    @l
    public final Map<String, String> getParams() {
        return this.params;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iE2 = r.e(this.version, Integer.hashCode(this.id) * 31, 31);
        Map<String, String> map = this.params;
        return iE2 + (map == null ? 0 : map.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ComfortableDealAnalyticsEvent(id=");
        sb2.append(this.id);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", params=");
        return r.w(sb2, this.params, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.version);
        Map<String, String> map = this.params;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
