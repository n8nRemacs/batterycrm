package com.avito.android.comfortable_deal.submitting.ordercall.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: OrderCallState.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrderCallState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f123073b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f123074c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f123075d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f123076e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f123077f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f123078g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f123079h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f123080i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f123081j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f123082k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f123072l = new a(null);

    @k
    public static final Parcelable.Creator<OrderCallState> CREATOR = new b();

    /* compiled from: OrderCallState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallState$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OrderCallState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<OrderCallState> {
        @Override // android.os.Parcelable.Creator
        public final OrderCallState createFromParcel(Parcel parcel) {
            return new OrderCallState(parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(OrderCallState.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final OrderCallState[] newArray(int i12) {
            return new OrderCallState[i12];
        }
    }

    public OrderCallState(@l String str, @l String str2, @k String str3, @l AttributedText attributedText, @l String str4, @k String str5, boolean z12, boolean z13, @l String str6, boolean z14) {
        this.f123073b = str;
        this.f123074c = str2;
        this.f123075d = str3;
        this.f123076e = attributedText;
        this.f123077f = str4;
        this.f123078g = str5;
        this.f123079h = z12;
        this.f123080i = z13;
        this.f123081j = str6;
        this.f123082k = z14;
    }

    public static OrderCallState a(OrderCallState orderCallState, String str, boolean z12, boolean z13, boolean z14, int i12) {
        String str2 = orderCallState.f123073b;
        String str3 = orderCallState.f123074c;
        String str4 = (i12 & 4) != 0 ? orderCallState.f123075d : str;
        AttributedText attributedText = orderCallState.f123076e;
        String str5 = orderCallState.f123077f;
        String str6 = orderCallState.f123078g;
        boolean z15 = (i12 & 64) != 0 ? orderCallState.f123079h : z12;
        boolean z16 = (i12 & 128) != 0 ? orderCallState.f123080i : z13;
        String str7 = orderCallState.f123081j;
        boolean z17 = (i12 & 512) != 0 ? orderCallState.f123082k : z14;
        orderCallState.getClass();
        return new OrderCallState(str2, str3, str4, attributedText, str5, str6, z15, z16, str7, z17);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCallState)) {
            return false;
        }
        OrderCallState orderCallState = (OrderCallState) obj;
        return L.f(this.f123073b, orderCallState.f123073b) && L.f(this.f123074c, orderCallState.f123074c) && L.f(this.f123075d, orderCallState.f123075d) && L.f(this.f123076e, orderCallState.f123076e) && L.f(this.f123077f, orderCallState.f123077f) && L.f(this.f123078g, orderCallState.f123078g) && this.f123079h == orderCallState.f123079h && this.f123080i == orderCallState.f123080i && L.f(this.f123081j, orderCallState.f123081j) && this.f123082k == orderCallState.f123082k;
    }

    public final int hashCode() {
        String str = this.f123073b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f123074c;
        int iD2 = H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f123075d);
        AttributedText attributedText = this.f123076e;
        int iHashCode2 = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str3 = this.f123077f;
        int i12 = r.i(r.i(H.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f123078g), 31, this.f123079h), 31, this.f123080i);
        String str4 = this.f123081j;
        return Boolean.hashCode(this.f123082k) + ((i12 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrderCallState(title=");
        sb2.append(this.f123073b);
        sb2.append(", subtitle=");
        sb2.append(this.f123074c);
        sb2.append(", phoneValue=");
        sb2.append(this.f123075d);
        sb2.append(", hintText=");
        sb2.append(this.f123076e);
        sb2.append(", placeholderText=");
        sb2.append(this.f123077f);
        sb2.append(", proceedButtonText=");
        sb2.append(this.f123078g);
        sb2.append(", isButtonEnabled=");
        sb2.append(this.f123079h);
        sb2.append(", showInputError=");
        sb2.append(this.f123080i);
        sb2.append(", inputErrorText=");
        sb2.append(this.f123081j);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f123082k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f123073b);
        parcel.writeString(this.f123074c);
        parcel.writeString(this.f123075d);
        parcel.writeParcelable(this.f123076e, i12);
        parcel.writeString(this.f123077f);
        parcel.writeString(this.f123078g);
        parcel.writeInt(this.f123079h ? 1 : 0);
        parcel.writeInt(this.f123080i ? 1 : 0);
        parcel.writeString(this.f123081j);
        parcel.writeInt(this.f123082k ? 1 : 0);
    }
}
