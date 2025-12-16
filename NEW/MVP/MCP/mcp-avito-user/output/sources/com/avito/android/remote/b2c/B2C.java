package com.avito.android.remote.b2c;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.safedeal.SafeDeal;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2C.kt */
@d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/b2c/B2C;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "bottomComponents", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class B2C implements Parcelable {

    @k
    public static final Parcelable.Creator<B2C> CREATOR = new a();

    @c("bottomComponents")
    @l
    private final List<SafeDeal.Component> bottomComponents;

    /* compiled from: B2C.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<B2C> {
        @Override // android.os.Parcelable.Creator
        public final B2C createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(B2C.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new B2C(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final B2C[] newArray(int i12) {
            return new B2C[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public B2C(@l List<? extends SafeDeal.Component> list) {
        this.bottomComponents = list;
    }

    @l
    public final List<SafeDeal.Component> c() {
        return this.bottomComponents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B2C) && L.f(this.bottomComponents, ((B2C) obj).bottomComponents);
    }

    public final int hashCode() {
        List<SafeDeal.Component> list = this.bottomComponents;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("B2C(bottomComponents="), this.bottomComponents, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<SafeDeal.Component> list = this.bottomComponents;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }
}
