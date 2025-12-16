package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.ExistingWorkPolicy;
import androidx.work.c0;
import androidx.work.impl.G;
import androidx.work.impl.Y;
import androidx.work.impl.e0;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public class ParcelableWorkContinuationImpl implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public b f56188b;

    /* renamed from: c, reason: collision with root package name */
    public static final ExistingWorkPolicy[] f56187c = ExistingWorkPolicy.values();
    public static final Parcelable.Creator<ParcelableWorkContinuationImpl> CREATOR = new a();

    public class a implements Parcelable.Creator<ParcelableWorkContinuationImpl> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableWorkContinuationImpl createFromParcel(@N Parcel parcel) {
            ParcelableWorkContinuationImpl parcelableWorkContinuationImpl = new ParcelableWorkContinuationImpl();
            ArrayList arrayList = null;
            String string = parcel.readInt() == 1 ? parcel.readString() : null;
            ExistingWorkPolicy existingWorkPolicy = ParcelableWorkContinuationImpl.f56187c[parcel.readInt()];
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            ClassLoader classLoader = ParcelableWorkContinuationImpl.class.getClassLoader();
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList2.add((e0) ((ParcelableWorkRequest) parcel.readParcelable(classLoader)).f56197b);
            }
            if (parcel.readInt() == 1) {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                for (int i15 = 0; i15 < i14; i15++) {
                    arrayList.add(((ParcelableWorkContinuationImpl) parcel.readParcelable(classLoader)).f56188b);
                }
            }
            parcelableWorkContinuationImpl.f56188b = new b(string, existingWorkPolicy, arrayList2, arrayList);
            return parcelableWorkContinuationImpl;
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableWorkContinuationImpl[] newArray(int i12) {
            return new ParcelableWorkContinuationImpl[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        b bVar = this.f56188b;
        String str = bVar.f56189a;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        parcel.writeInt(!zIsEmpty ? 1 : 0);
        if (!zIsEmpty) {
            parcel.writeString(str);
        }
        parcel.writeInt(bVar.f56190b.ordinal());
        List<? extends c0> list = bVar.f56191c;
        parcel.writeInt(list.size());
        if (!list.isEmpty()) {
            for (int i13 = 0; i13 < list.size(); i13++) {
                parcel.writeParcelable(new ParcelableWorkRequest(list.get(i13)), i12);
            }
        }
        ArrayList arrayList = bVar.f56192d;
        int i14 = (arrayList == null || arrayList.isEmpty()) ? 0 : 1;
        parcel.writeInt(i14);
        if (i14 != 0) {
            parcel.writeInt(arrayList.size());
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                b bVar2 = (b) arrayList.get(i15);
                ParcelableWorkContinuationImpl parcelableWorkContinuationImpl = new ParcelableWorkContinuationImpl();
                parcelableWorkContinuationImpl.f56188b = bVar2;
                parcel.writeParcelable(parcelableWorkContinuationImpl, i12);
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f56189a;

        /* renamed from: b, reason: collision with root package name */
        public final ExistingWorkPolicy f56190b;

        /* renamed from: c, reason: collision with root package name */
        public final List<? extends c0> f56191c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f56192d;

        public b(@N G g12) {
            this.f56189a = g12.f55527b;
            this.f56190b = g12.f55528c;
            this.f56191c = g12.f55529d;
            this.f56192d = null;
            List<G> list = g12.f55532g;
            if (list != null) {
                this.f56192d = new ArrayList(list.size());
                Iterator<G> it = list.iterator();
                while (it.hasNext()) {
                    this.f56192d.add(new b(it.next()));
                }
            }
        }

        @P
        public static ArrayList a(@N Y y12, @P ArrayList arrayList) {
            if (arrayList == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                arrayList2.add(new G(y12, bVar.f56189a, bVar.f56190b, bVar.f56191c, a(y12, bVar.f56192d)));
            }
            return arrayList2;
        }

        public b(@P String str, @N ExistingWorkPolicy existingWorkPolicy, @N ArrayList arrayList, @P ArrayList arrayList2) {
            this.f56189a = str;
            this.f56190b = existingWorkPolicy;
            this.f56191c = arrayList;
            this.f56192d = arrayList2;
        }
    }
}
