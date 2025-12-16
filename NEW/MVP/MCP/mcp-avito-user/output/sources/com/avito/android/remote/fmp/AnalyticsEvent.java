package com.avito.android.remote.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.h;

/* compiled from: AnalyticsEvent.kt */
@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B<\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R-\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/fmp/AnalyticsEvent;", "Landroid/os/Parcelable;", "", "id", "", "", "", "LK51/e;", "params", "version", "", "hasSensitiveData", "<init>", "(JLjava/util/Map;JLjava/lang/Boolean;)V", "J", "getId", "()J", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "d", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AnalyticsEvent implements Parcelable {

    @k
    public static final Parcelable.Creator<AnalyticsEvent> CREATOR = new a();

    @c("hasSensitiveData")
    @l
    private final Boolean hasSensitiveData;

    @c("id")
    private final long id;

    @c("params")
    @l
    private final Map<String, Object> params;

    @c("version")
    private final long version;

    /* compiled from: AnalyticsEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AnalyticsEvent> {
        @Override // android.os.Parcelable.Creator
        public final AnalyticsEvent createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Boolean boolValueOf;
            long j12 = parcel.readLong();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(AnalyticsEvent.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                }
            }
            long j13 = parcel.readLong();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AnalyticsEvent(j12, linkedHashMap, j13, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AnalyticsEvent[] newArray(int i12) {
            return new AnalyticsEvent[i12];
        }
    }

    public AnalyticsEvent(long j12, @l Map<String, ? extends Object> map, long j13, @l Boolean bool) {
        this.id = j12;
        this.params = map;
        this.version = j13;
        this.hasSensitiveData = bool;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getHasSensitiveData() {
        return this.hasSensitiveData;
    }

    /* renamed from: d, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long getId() {
        return this.id;
    }

    @l
    public final Map<String, Object> getParams() {
        return this.params;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.id);
        Map<String, Object> map = this.params;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        parcel.writeLong(this.version);
        Boolean bool = this.hasSensitiveData;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
