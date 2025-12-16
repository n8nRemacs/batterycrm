package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.b0;
import androidx.work.impl.model.u0;
import j.N;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.C42745f0;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public class ParcelableWorkQuery implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkQuery> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final b0 f56196b;

    public class a implements Parcelable.Creator<ParcelableWorkQuery> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableWorkQuery createFromParcel(Parcel parcel) {
            return new ParcelableWorkQuery(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableWorkQuery[] newArray(int i12) {
            return new ParcelableWorkQuery[i12];
        }
    }

    public ParcelableWorkQuery() {
        this.f56196b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        b0 b0Var = this.f56196b;
        List<UUID> list = b0Var.f55466a;
        parcel.writeInt(list.size());
        if (!list.isEmpty()) {
            Iterator<UUID> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().toString());
            }
        }
        parcel.writeStringList(b0Var.f55467b);
        parcel.writeStringList(b0Var.f55468c);
        List<WorkInfo.State> list2 = b0Var.f55469d;
        parcel.writeInt(list2.size());
        if (list2.isEmpty()) {
            return;
        }
        Iterator<WorkInfo.State> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(u0.k(it2.next()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public ParcelableWorkQuery(@N Parcel parcel) {
        ?? EmptyList = Collections.emptyList();
        int i12 = parcel.readInt();
        if (i12 > 0) {
            EmptyList = new ArrayList(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                EmptyList.add(UUID.fromString(parcel.readString()));
            }
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
        ?? EmptyList2 = Collections.emptyList();
        int i14 = parcel.readInt();
        if (i14 > 0) {
            EmptyList2 = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                EmptyList2.add(u0.g(parcel.readInt()));
            }
        }
        b0.a.f55470e.getClass();
        b0.a aVar = new b0.a(null);
        ArrayList arrayList = aVar.f55471a;
        C42745f0.h((Iterable) EmptyList, arrayList);
        ArrayList arrayList2 = aVar.f55472b;
        C42745f0.h(arrayListCreateStringArrayList, arrayList2);
        ArrayList arrayList3 = aVar.f55473c;
        C42745f0.h(arrayListCreateStringArrayList2, arrayList3);
        ArrayList arrayList4 = aVar.f55474d;
        C42745f0.h((Iterable) EmptyList2, arrayList4);
        if (arrayList.isEmpty() && arrayList2.isEmpty() && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
        }
        this.f56196b = new b0(arrayList, arrayList2, arrayList3, arrayList4);
    }
}
