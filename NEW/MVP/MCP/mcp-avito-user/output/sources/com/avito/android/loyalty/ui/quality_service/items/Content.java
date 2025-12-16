package com.avito.android.loyalty.ui.quality_service.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Content.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/Content;", "Landroid/os/Parcelable;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Content implements Parcelable {

    @k
    public static final Parcelable.Creator<Content> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f183807b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ArrayList f183808c;

    /* compiled from: Content.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Content> {
        @Override // android.os.Parcelable.Creator
        public final Content createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Content.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new Content(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Content[] newArray(int i12) {
            return new Content[i12];
        }
    }

    public Content(@l String str, @l ArrayList arrayList) {
        this.f183807b = str;
        this.f183808c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        return L.f(this.f183807b, content.f183807b) && L.f(this.f183808c, content.f183808c);
    }

    public final int hashCode() {
        String str = this.f183807b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ArrayList arrayList = this.f183808c;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Content(title=");
        sb2.append(this.f183807b);
        sb2.append(", items=");
        return e.p(sb2, this.f183808c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f183807b);
        ArrayList arrayList = this.f183808c;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
        while (itY.hasNext()) {
            parcel.writeParcelable((Parcelable) itY.next(), i12);
        }
    }
}
