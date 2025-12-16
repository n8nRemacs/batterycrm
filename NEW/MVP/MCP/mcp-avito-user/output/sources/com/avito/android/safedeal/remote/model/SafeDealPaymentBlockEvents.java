package com.avito.android.safedeal.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ParametrizedEvent;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SafeDealPaymentBlockResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockEvents;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "onShowEvent", "<init>", "(Lcom/avito/android/remote/model/ParametrizedEvent;)V", "Lcom/avito/android/remote/model/ParametrizedEvent;", "c", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "_avito-discouraged_avito-api_safedeal"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SafeDealPaymentBlockEvents implements Parcelable {

    @k
    public static final Parcelable.Creator<SafeDealPaymentBlockEvents> CREATOR = new a();

    @c("onShowEvent")
    @l
    private final ParametrizedEvent onShowEvent;

    /* compiled from: SafeDealPaymentBlockResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SafeDealPaymentBlockEvents> {
        @Override // android.os.Parcelable.Creator
        public final SafeDealPaymentBlockEvents createFromParcel(Parcel parcel) {
            return new SafeDealPaymentBlockEvents((ParametrizedEvent) parcel.readParcelable(SafeDealPaymentBlockEvents.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SafeDealPaymentBlockEvents[] newArray(int i12) {
            return new SafeDealPaymentBlockEvents[i12];
        }
    }

    public SafeDealPaymentBlockEvents(@l ParametrizedEvent parametrizedEvent) {
        this.onShowEvent = parametrizedEvent;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ParametrizedEvent getOnShowEvent() {
        return this.onShowEvent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SafeDealPaymentBlockEvents) && L.f(this.onShowEvent, ((SafeDealPaymentBlockEvents) obj).onShowEvent);
    }

    public final int hashCode() {
        ParametrizedEvent parametrizedEvent = this.onShowEvent;
        if (parametrizedEvent == null) {
            return 0;
        }
        return parametrizedEvent.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.advert.item.delivery_suggests.l.q(new StringBuilder("SafeDealPaymentBlockEvents(onShowEvent="), this.onShowEvent, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.onShowEvent, i12);
    }
}
