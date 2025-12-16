package G91;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.mts.biometry.sdk.domain.entity.selector.d;
import ru.mts.biometry.sdk.domain.entity.selector.f;

/* loaded from: classes9.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i12 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i12);
        int iC2 = 0;
        while (iC2 != i12) {
            iC2 = com.avito.android.actions_sheet.a.c(d.CREATOR, parcel, arrayList, iC2, 1);
        }
        int i13 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
        for (int i14 = 0; i14 != i13; i14++) {
            linkedHashMap.put(parcel.readString(), ru.mts.biometry.sdk.domain.entity.selector.b.CREATOR.createFromParcel(parcel));
        }
        int i15 = parcel.readInt();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i15);
        for (int i16 = 0; i16 != i15; i16++) {
            linkedHashMap2.put(parcel.readString(), parcel.createStringArrayList());
        }
        return new f(linkedHashMap, linkedHashMap2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i12) {
        return new f[i12];
    }
}
