package com.avito.android.str_seller_orders.strsellerordersdialog.shared;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.StrSellerOrder;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersDialogData.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/shared/StrSellerOrdersDialogData;", "Landroid/os/Parcelable;", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrSellerOrdersDialogData implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f290168b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f290169c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<StrSellerOrder> f290170d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f290171e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f290166f = new a(null);

    @k
    public static final Parcelable.Creator<StrSellerOrdersDialogData> CREATOR = new b();

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final StrSellerOrdersDialogData f290167g = new StrSellerOrdersDialogData(null, null, C42784z0.f406748b, false);

    /* compiled from: StrSellerOrdersDialogData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/shared/StrSellerOrdersDialogData$a;", "", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrSellerOrdersDialogData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<StrSellerOrdersDialogData> {
        @Override // android.os.Parcelable.Creator
        public final StrSellerOrdersDialogData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(StrSellerOrdersDialogData.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(StrSellerOrdersDialogData.class, parcel, arrayList, iL2, 1);
            }
            return new StrSellerOrdersDialogData(attributedText, string, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StrSellerOrdersDialogData[] newArray(int i12) {
            return new StrSellerOrdersDialogData[i12];
        }
    }

    public StrSellerOrdersDialogData(@l AttributedText attributedText, @l String str, @k List list, boolean z12) {
        this.f290168b = str;
        this.f290169c = attributedText;
        this.f290170d = list;
        this.f290171e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrSellerOrdersDialogData)) {
            return false;
        }
        StrSellerOrdersDialogData strSellerOrdersDialogData = (StrSellerOrdersDialogData) obj;
        return L.f(this.f290168b, strSellerOrdersDialogData.f290168b) && L.f(this.f290169c, strSellerOrdersDialogData.f290169c) && L.f(this.f290170d, strSellerOrdersDialogData.f290170d) && this.f290171e == strSellerOrdersDialogData.f290171e;
    }

    public final int hashCode() {
        String str = this.f290168b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f290169c;
        return Boolean.hashCode(this.f290171e) + H.e((iHashCode + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31, this.f290170d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerOrdersDialogData(sectionId=");
        sb2.append(this.f290168b);
        sb2.append(", title=");
        sb2.append(this.f290169c);
        sb2.append(", orders=");
        sb2.append(this.f290170d);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f290171e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f290168b);
        parcel.writeParcelable(this.f290169c, i12);
        Iterator itJ = C0.j(this.f290170d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f290171e ? 1 : 0);
    }
}
