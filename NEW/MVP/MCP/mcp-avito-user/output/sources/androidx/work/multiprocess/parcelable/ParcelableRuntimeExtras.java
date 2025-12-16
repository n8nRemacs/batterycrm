package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import j.N;
import j.X;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public class ParcelableRuntimeExtras implements Parcelable {
    public static final Parcelable.Creator<ParcelableRuntimeExtras> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public WorkerParameters.a f56184b;

    public class a implements Parcelable.Creator<ParcelableRuntimeExtras> {
        @Override // android.os.Parcelable.Creator
        @N
        public final ParcelableRuntimeExtras createFromParcel(Parcel parcel) {
            return new ParcelableRuntimeExtras(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableRuntimeExtras[] newArray(int i12) {
            return new ParcelableRuntimeExtras[i12];
        }
    }

    @X
    public static class b {
    }

    public ParcelableRuntimeExtras(@N Parcel parcel) {
        ArrayList arrayList;
        ClassLoader classLoader = getClass().getClassLoader();
        Network network = parcel.readInt() == 1 ? (Network) parcel.readParcelable(classLoader) : null;
        if (parcel.readInt() == 1) {
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((Uri) parcelable);
            }
        } else {
            arrayList = null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.readInt() == 1 ? parcel.createStringArrayList() : null;
        WorkerParameters.a aVar = new WorkerParameters.a();
        this.f56184b = aVar;
        if (Build.VERSION.SDK_INT >= 28) {
            aVar.f55446c = network;
        }
        if (arrayList != null) {
            aVar.f55445b = arrayList;
        }
        if (arrayListCreateStringArrayList != null) {
            aVar.f55444a = arrayListCreateStringArrayList;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    @SuppressLint({"NewApi"})
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        WorkerParameters.a aVar = this.f56184b;
        Network network = i13 >= 28 ? aVar.f55446c : null;
        int i14 = 0;
        int i15 = network != null ? 1 : 0;
        parcel.writeInt(i15);
        if (i15 != 0) {
            parcel.writeParcelable(network, i12);
        }
        List<Uri> list = aVar.f55445b;
        List<String> list2 = aVar.f55444a;
        int i16 = (list == null || list.isEmpty()) ? 0 : 1;
        parcel.writeInt(i16);
        if (i16 != 0) {
            int size = list.size();
            Uri[] uriArr = new Uri[size];
            for (int i17 = 0; i17 < size; i17++) {
                uriArr[i17] = list.get(i17);
            }
            parcel.writeParcelableArray(uriArr, i12);
        }
        if (list2 != null && !list2.isEmpty()) {
            i14 = 1;
        }
        parcel.writeInt(i14);
        if (i14 != 0) {
            parcel.writeStringList(list2);
        }
    }
}
