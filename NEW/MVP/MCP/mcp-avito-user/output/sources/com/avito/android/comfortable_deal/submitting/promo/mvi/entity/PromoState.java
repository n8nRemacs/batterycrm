package com.avito.android.comfortable_deal.submitting.promo.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoState.kt */
@d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PromoState extends q implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f123187b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final HeaderState f123188c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InputState f123189d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ButtonState f123190e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<ParcelableItem> f123191f;

    /* compiled from: PromoState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoState> {
        @Override // android.os.Parcelable.Creator
        public final PromoState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            HeaderState headerStateCreateFromParcel = HeaderState.CREATOR.createFromParcel(parcel);
            InputState inputStateCreateFromParcel = InputState.CREATOR.createFromParcel(parcel);
            ButtonState buttonStateCreateFromParcel = ButtonState.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(PromoState.class, parcel, arrayList, iL2, 1);
            }
            return new PromoState(string, headerStateCreateFromParcel, inputStateCreateFromParcel, buttonStateCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PromoState[] newArray(int i12) {
            return new PromoState[i12];
        }
    }

    public PromoState() {
        this(null, null, null, null, null, 31, null);
    }

    public static PromoState a(PromoState promoState, InputState inputState, ButtonState buttonState, int i12) {
        String str = promoState.f123187b;
        HeaderState headerState = promoState.f123188c;
        if ((i12 & 4) != 0) {
            inputState = promoState.f123189d;
        }
        List<ParcelableItem> list = promoState.f123191f;
        promoState.getClass();
        return new PromoState(str, headerState, inputState, buttonState, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoState)) {
            return false;
        }
        PromoState promoState = (PromoState) obj;
        return L.f(this.f123187b, promoState.f123187b) && L.f(this.f123188c, promoState.f123188c) && L.f(this.f123189d, promoState.f123189d) && L.f(this.f123190e, promoState.f123190e) && L.f(this.f123191f, promoState.f123191f);
    }

    public final int hashCode() {
        return this.f123191f.hashCode() + ((this.f123190e.hashCode() + ((this.f123189d.hashCode() + ((this.f123188c.hashCode() + (this.f123187b.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoState(navBarTitle=");
        sb2.append(this.f123187b);
        sb2.append(", header=");
        sb2.append(this.f123188c);
        sb2.append(", inputState=");
        sb2.append(this.f123189d);
        sb2.append(", buttonState=");
        sb2.append(this.f123190e);
        sb2.append(", items=");
        return H.p(sb2, this.f123191f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f123187b);
        this.f123188c.writeToParcel(parcel, i12);
        this.f123189d.writeToParcel(parcel, i12);
        this.f123190e.writeToParcel(parcel, i12);
        Iterator itJ = C0.j(this.f123191f, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }

    public PromoState(String str, HeaderState headerState, InputState inputState, ButtonState buttonState, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? new HeaderState(null, null, null) : headerState, (i12 & 4) != 0 ? new InputState(null, null, "", null, null, false) : inputState, (i12 & 8) != 0 ? new ButtonState(true, false, null) : buttonState, (i12 & 16) != 0 ? C42784z0.f406748b : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PromoState(@k String str, @k HeaderState headerState, @k InputState inputState, @k ButtonState buttonState, @k List<? extends ParcelableItem> list) {
        this.f123187b = str;
        this.f123188c = headerState;
        this.f123189d = inputState;
        this.f123190e = buttonState;
        this.f123191f = list;
    }
}
