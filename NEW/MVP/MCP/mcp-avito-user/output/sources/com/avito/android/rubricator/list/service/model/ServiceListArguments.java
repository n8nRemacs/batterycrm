package com.avito.android.rubricator.list.service.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.vertical_main.RubricatorWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceListArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/list/service/model/ServiceListArguments;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ServiceListArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ServiceListArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f256008b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<RubricatorWidget.RubricatorWidgetAction> f256009c;

    /* compiled from: ServiceListArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceListArguments> {
        @Override // android.os.Parcelable.Creator
        public final ServiceListArguments createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ServiceListArguments.class, parcel, arrayList, iL2, 1);
            }
            return new ServiceListArguments(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceListArguments[] newArray(int i12) {
            return new ServiceListArguments[i12];
        }
    }

    public ServiceListArguments(@k String str, @k List<RubricatorWidget.RubricatorWidgetAction> list) {
        this.f256008b = str;
        this.f256009c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceListArguments)) {
            return false;
        }
        ServiceListArguments serviceListArguments = (ServiceListArguments) obj;
        return L.f(this.f256008b, serviceListArguments.f256008b) && L.f(this.f256009c, serviceListArguments.f256009c);
    }

    public final int hashCode() {
        return this.f256009c.hashCode() + (this.f256008b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceListArguments(title=");
        sb2.append(this.f256008b);
        sb2.append(", services=");
        return H.p(sb2, this.f256009c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f256008b);
        Iterator itJ = C0.j(this.f256009c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
