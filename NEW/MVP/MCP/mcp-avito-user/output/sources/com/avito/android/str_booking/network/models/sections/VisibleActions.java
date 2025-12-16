package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: PromoBannerSection.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/VisibleActions;", "Landroid/os/Parcelable;", "Lcom/avito/android/str_booking/network/models/sections/ClickstreamAnalyticsEventModel;", "clickstreamEvent", "<init>", "(Lcom/avito/android/str_booking/network/models/sections/ClickstreamAnalyticsEventModel;)V", "Lcom/avito/android/str_booking/network/models/sections/ClickstreamAnalyticsEventModel;", "c", "()Lcom/avito/android/str_booking/network/models/sections/ClickstreamAnalyticsEventModel;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VisibleActions implements Parcelable {

    @k
    public static final Parcelable.Creator<VisibleActions> CREATOR = new a();

    @c("clickstream")
    @k
    private final ClickstreamAnalyticsEventModel clickstreamEvent;

    /* compiled from: PromoBannerSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VisibleActions> {
        @Override // android.os.Parcelable.Creator
        public final VisibleActions createFromParcel(Parcel parcel) {
            return new VisibleActions(ClickstreamAnalyticsEventModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VisibleActions[] newArray(int i12) {
            return new VisibleActions[i12];
        }
    }

    public VisibleActions(@k ClickstreamAnalyticsEventModel clickstreamAnalyticsEventModel) {
        this.clickstreamEvent = clickstreamAnalyticsEventModel;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final ClickstreamAnalyticsEventModel getClickstreamEvent() {
        return this.clickstreamEvent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.clickstreamEvent.writeToParcel(parcel, i12);
    }
}
