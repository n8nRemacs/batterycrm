package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsDynamicItems.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/Metro;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/UniversalColor;", "colors", "", "name", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Metro implements Parcelable {

    @k
    public static final Parcelable.Creator<Metro> CREATOR = new a();

    @c("colors")
    @l
    private final List<UniversalColor> colors;

    @c("name")
    @k
    private final String name;

    /* compiled from: StatsDynamicItems.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Metro> {
        @Override // android.os.Parcelable.Creator
        public final Metro createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Metro.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new Metro(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Metro[] newArray(int i12) {
            return new Metro[i12];
        }
    }

    public Metro(@l List<UniversalColor> list, @k String str) {
        this.colors = list;
        this.name = str;
    }

    @l
    public final List<UniversalColor> c() {
        return this.colors;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metro)) {
            return false;
        }
        Metro metro = (Metro) obj;
        return L.f(this.colors, metro.colors) && L.f(this.name, metro.name);
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        List<UniversalColor> list = this.colors;
        return this.name.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metro(colors=");
        sb2.append(this.colors);
        sb2.append(", name=");
        return C22026a.c(sb2, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<UniversalColor> list = this.colors;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.name);
    }
}
