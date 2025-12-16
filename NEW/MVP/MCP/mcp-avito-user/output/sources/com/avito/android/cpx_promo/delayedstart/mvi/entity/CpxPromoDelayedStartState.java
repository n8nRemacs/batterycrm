package com.avito.android.cpx_promo.delayedstart.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromoButton;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpxPromoDelayedStartState.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CpxPromoDelayedStartState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f126866b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f126867c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CpxPromoButton f126868d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f126864e = new a(null);

    @k
    public static final Parcelable.Creator<CpxPromoDelayedStartState> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final CpxPromoDelayedStartState f126865f = new CpxPromoDelayedStartState(null, null, null);

    /* compiled from: CpxPromoDelayedStartState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartState$a;", "", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CpxPromoDelayedStartState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CpxPromoDelayedStartState> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoDelayedStartState createFromParcel(Parcel parcel) {
            return new CpxPromoDelayedStartState((AttributedText) parcel.readParcelable(CpxPromoDelayedStartState.class.getClassLoader()), (AttributedText) parcel.readParcelable(CpxPromoDelayedStartState.class.getClassLoader()), parcel.readInt() == 0 ? null : CpxPromoButton.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoDelayedStartState[] newArray(int i12) {
            return new CpxPromoDelayedStartState[i12];
        }
    }

    public CpxPromoDelayedStartState(@l AttributedText attributedText, @l AttributedText attributedText2, @l CpxPromoButton cpxPromoButton) {
        this.f126866b = attributedText;
        this.f126867c = attributedText2;
        this.f126868d = cpxPromoButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CpxPromoDelayedStartState)) {
            return false;
        }
        CpxPromoDelayedStartState cpxPromoDelayedStartState = (CpxPromoDelayedStartState) obj;
        return L.f(this.f126866b, cpxPromoDelayedStartState.f126866b) && L.f(this.f126867c, cpxPromoDelayedStartState.f126867c) && L.f(this.f126868d, cpxPromoDelayedStartState.f126868d);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f126866b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.f126867c;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        CpxPromoButton cpxPromoButton = this.f126868d;
        return iHashCode2 + (cpxPromoButton != null ? cpxPromoButton.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CpxPromoDelayedStartState(title=" + this.f126866b + ", description=" + this.f126867c + ", button=" + this.f126868d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f126866b, i12);
        parcel.writeParcelable(this.f126867c, i12);
        CpxPromoButton cpxPromoButton = this.f126868d;
        if (cpxPromoButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cpxPromoButton.writeToParcel(parcel, i12);
        }
    }
}
