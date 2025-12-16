package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: PromoBannerSection.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/ClickstreamAnalyticsEventModel;", "Landroid/os/Parcelable;", "", "id", "version", "", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(IILjava/util/Map;)V", "I", "c", "()I", "e", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClickstreamAnalyticsEventModel implements Parcelable {

    @k
    public static final Parcelable.Creator<ClickstreamAnalyticsEventModel> CREATOR = new a();

    @c("id")
    private final int id;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @k
    private final Map<String, String> parameters;

    @c("version")
    private final int version;

    /* compiled from: PromoBannerSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClickstreamAnalyticsEventModel> {
        @Override // android.os.Parcelable.Creator
        public final ClickstreamAnalyticsEventModel createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            int iA2 = 0;
            while (iA2 != i14) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new ClickstreamAnalyticsEventModel(i12, i13, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ClickstreamAnalyticsEventModel[] newArray(int i12) {
            return new ClickstreamAnalyticsEventModel[i12];
        }
    }

    public ClickstreamAnalyticsEventModel(int i12, int i13, @k Map<String, String> map) {
        this.id = i12;
        this.version = i13;
        this.parameters = map;
    }

    /* renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @k
    public final Map<String, String> d() {
        return this.parameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.version);
        Iterator itI = C0.i(parcel, this.parameters);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
